package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //20 Book Array
        Book[] books = new Book[20];

        books[0] = new Book(1, "9780545582889", "Harry Potter and the Sorcerer's Stone", false, "");
        books[1] = new Book(2, "9780545582926", "Harry Potter and the Chamber of Secrets", false, "");
        books[2] = new Book(3, "9780439136365", "Harry Potter and the Prisoner of Azkaban", false, "");
        books[3] = new Book(4, "9780439139601", "Harry Potter and the Goblet of Fire", false, "");
        books[4] = new Book(5, "9780439358071", "Harry Potter and the Order of the Phoenix", false, "");
        books[5] = new Book(6, "9780439785969", "Harry Potter and the Half-Blood Prince", false, "");
        books[6] = new Book(7, "9780545139700", "Harry Potter and the Deathly Hallows", false, "");
        books[7] = new Book(8, "9780064400558", "Bridge to Terabithia", false, "");
        books[8] = new Book(9, "9780064471046", "The Giver", false, "");
        books[9] = new Book(10, "9780062024039", "Divergent", false, "");
        books[10] = new Book(11, "9780439023528", "The Hunger Games", false, "");
        books[11] = new Book(12, "9780439023498", "Catching Fire", false, "");
        books[12] = new Book(13, "9780439023511", "Mockingjay", false, "");
        books[13] = new Book(14, "9780066238500", "Artemis Fowl", false, "");
        books[14] = new Book(15, "9780142414934", "Percy Jackson: The Lightning Thief", false, "");
        books[15] = new Book(16, "9780141346137", "Percy Jackson: Sea of Monsters", false, "");
        books[16] = new Book(17, "9780141321271", "Percy Jackson: Titan's Curse", false, "");
        books[17] = new Book(18, "9780141321288", "Percy Jackson: Battle of the Labyrinth", false, "");
        books[18] = new Book(19, "9780141321295", "Percy Jackson: The Last Olympian", false, "");
        books[19] = new Book(20, "9780064408677", "Holes", false, "");


        //Scanner to ask for user input
        Scanner scanner = new Scanner(System.in);

        //Menu to show the user options
        while (true) {
            System.out.println("Pleaser Enter you Choice");
            System.out.println("1.) Show Available Books");
            System.out.println("2.) Show Checked Out Books");
            System.out.println("3.) Exit");
            String userInput = scanner.nextLine();

            //Take in user input to show the menu options selected
            switch (userInput) {
                case "1":
                    //Print array of the books available
                    for (Book catelog : books) {
                        if (catelog.isCheckedOut() == false) {
                            System.out.println("ID: " + catelog.getId() + " \t " +
                                    "ISBN: " + catelog.getIsbn() + " \t " +
                                    "Tite: " + catelog.getTitle() + " \t ");
                        }
                    }
                    //Ask user what they want to do next
                    System.out.println("1.) Check Out Book\n" +
                            "2.) Back");
                    String options1 = scanner.nextLine();

                    switch (options1) {
                        //Ask user for details to check out
                        case "1":
                            System.out.println("What is the ID of the book you would like to check out?");
                            int idNumber = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("What is your name?");
                            String checkedOutTo = scanner.nextLine();

                            if (books[idNumber - 1].isCheckedOut() == false)
                            {
                                books[idNumber - 1].checkOut(checkedOutTo);
                            }
                            break;
                            //Take user back to main menu
                        case "2":
                            break;
                            //Tell user to re-input value if incorrect value input
                        default:
                            System.out.println("Please type 1 or 2");
                            break;

                    }
                    break;
                case "2":
                    //Show checked out books
                    for (Book catelog : books) {
                        if (catelog.isCheckedOut() == true) {
                            System.out.println("ID: " + catelog.getId() + " \t " +
                                    "ISBN: " + catelog.getIsbn() + " \t " +
                                    "Title: " + catelog.getTitle() + " \t " +
                                    "Checked Out To: " + catelog.getCheckedOutTo());
                        }
                    }
                    //Ask user what they want to do next
                    System.out.println("1.) Check In Book\n" +
                            "2.) Back");
                    String options2 = scanner.nextLine();
                    //Ask user for into to check book in
                    switch (options2) {
                        case "1":
                            System.out.println("What is the ID of the book you would like to check in?");
                            int idNumber = scanner.nextInt();
                            scanner.nextLine();

                            books[idNumber -1].checkIn();

                            break;

                        case "2":
                            break;


                            //Exit program based of user input
                        case "3":
                            System.exit(0);
                            break;
                            //Tell user to re-input value if incorrect value input
                        default:
                            System.out.println("Please type 1, 2 or 3");
                            break;

                    }

            }

        }


    }
}