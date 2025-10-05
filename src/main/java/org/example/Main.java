package org.example;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        //You'll need an array of 20 books, put it here
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



        //You'll need a scanner to take in user input. Make one.
        Scanner scanner = new Scanner(System.in);

        //You'll need a menu. A while(true) loop will be helpful
        while(true)
        {
            System.out.println("Pleaser Enter you Choice");
            System.out.println("1.) Show Available Books");
            System.out.println("2.) Show Checked Out Books");
            System.out.println("3.) Exit");
            String userInput = scanner.nextLine();

            //Based on what they type, make a switch case to handle it
            //Be sure they can exit the program!
            switch(userInput)
            {
                case "1":
                    //Print array
                    for(Book catelog : books)
                    {
                        if(catelog.isCheckedOut() == false)
                        {
                            System.out.println("ID: " + catelog.getId() + " \t " +
                                    "ISBN: " + catelog.getIsbn() + " \t " +
                                    "Tite: " + catelog.getTitle() + " \t ");
                        }
                    }

                    System.out.println("1.) Check Out Book\n" +
                            "2.) Back");
                    String options = scanner.nextLine();

                    switch(options)
                    {
                        case "1":
                            System.out.println("What is the ID of the book you would like to check out?");
                            int idNumber = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("What is your name?");
                            String checkedOutTo = scanner.nextLine();

                            if (books[idNumber -1 ].isCheckedOut() == false)
                            {
                                books[idNumber -1 ].checkOut(checkedOutTo);
                            }
                            break;

                        case "2":
                            break;

                        default:
                            System.out.println("Please type 1 or 2");
                            break;

                    }
                    break;
                case "2":
                    //Show Checked out BooK
                    for(Book catelog : books)
                    {
                        if(catelog.isCheckedOut() == true)
                        {
                            System.out.println("ID: " + catelog.getId() + " \t " +
                                    "ISBN: " + catelog.getIsbn() + " \t " +
                                    "Tite: " + catelog.getTitle() + " \t " +
                                    "Checked Out To: " + catelog.getCheckedOutTo());
                        }
                    }
                    break;

                case "3":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please type 1, 2 or 3");
                    break;

            }

        }



        //Use a for loop and sout to print all the book titles
        //remember to use your Book class getters
        //Use if statements to filter out books that are checkedin/out
        //as need be

        //You will call the checkIn() and checkOut() methods
        //If the user wants to check in or out
        //Remember if they check out you must ask for their name!
        //example: book.checkOut(name) or book.checkIn() use the method
    }


}