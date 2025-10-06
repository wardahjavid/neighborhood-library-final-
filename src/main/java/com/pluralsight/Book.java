package com.pluralsight;

import java.util.Scanner;

    public class Book {
        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        public Book(int id, String isbn, String title) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = "";

        }

        public String getIsbn() {
            return isbn;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public boolean isCheckedOut() {
            return isCheckedOut;
        }

        public String getCheckedOutTo() {
            return checkedOutTo;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCheckedOut(boolean checkedOut) {
            isCheckedOut = checkedOut;
        }

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;
        }

        public boolean checkedOut(String name) {
            if (isCheckedOut) {
                return false;
            } else {
                isCheckedOut = true;
                checkedOutTo = name;
                return true;
            }
        }

        public boolean checkedIn() {
            if (!isCheckedOut) {
                return false;
            } else {
                isCheckedOut = false;
                checkedOutTo = "";
                return true;
            }
        }

        public String availableBookInformation() {
            return id + ", " + isbn + ", " + title;
        }

        public String checkedOutBookInformation() {
            return id + ", " + isbn + ", " + title + ", Checked out to " + checkedOutTo;
        }

        static class NeighorhoodLibrary {
            public static void main(String[] args) {
                Scanner potatoscanner = new Scanner(System.in);

                com.pluralsight.Book[] book = new com.pluralsight.Book[24];
                book[0] = new com.pluralsight.Book(1, "9876543211234", "Endgame: The Betrayal and Fall of Srebrenica, Europe's Worst Massacre Since World War II");
                book[1] = new com.pluralsight.Book(2, "9876543215678", "Mornings in Jenin");
                book[2] = new com.pluralsight.Book(3, "9876543219123", "Return to Haifa");
                book[3] = new com.pluralsight.Book(4, "9876543218123", "Against the Loveless World");
                book[4] = new com.pluralsight.Book(5, "9876543217123", "Minor Detail");
                book[5] = new com.pluralsight.Book(6, "9876543216123", "Wild Thorns");
                book[6] = new com.pluralsight.Book(7, "9876543215123", "Salt Houses");
                book[7] = new com.pluralsight.Book(8, "9876543214123", "I Saw Ramallah");
                book[8] = new com.pluralsight.Book(9, "9876543213123", "The Parisian");
                book[9] = new com.pluralsight.Book(10, "9876543212123", "The Beauty of Your Face");
                book[10] = new com.pluralsight.Book(11, "987654321987", "The Blue Between Sky and Water");
                book[11] = new com.pluralsight.Book(12, "987654321887", "In My Mother's Footsteps");
                book[12] = new com.pluralsight.Book(13, "987654321787", "They Called Me A Lioness: A Palestinian Girl's Fight For Freedom");
                book[13] = new com.pluralsight.Book(14, "987654321687", "Perfect Victims and the Politics of Appeals");
                book[14] = new com.pluralsight.Book(15, "987654321587", "The Reluctant Hunter");
                book[15] = new com.pluralsight.Book(16, "987654321487", "The Unquiet Dead");
                book[16] = new com.pluralsight.Book(17, "987654321387", "Speak, Silence");
                book[17] = new com.pluralsight.Book(18, "987654321287", "A Novel about the Balkans");
                book[18] = new com.pluralsight.Book(19, "987654321187", "The War Reporter");
                book[19] = new com.pluralsight.Book(20, "987654321876", "The Wolf of Sarajevo");
                book[20] = new com.pluralsight.Book(21, "987654321776", "A Love For A Country: A Story About Revenge");
                book[21] = new com.pluralsight.Book(22, "987654321676", "They Are Trying To Break Your Heart");
                book[22] = new com.pluralsight.Book(23, "987654321576", "The Kite Runner");
                book[23] = new com.pluralsight.Book(24, "987654321476", "The Other Side of My Pillow");

                boolean bookInformationRunning = true;
                Scanner potatorscanner = new Scanner(System.in);

                System.out.println("Welcome to the Neighborhood Library!");

                label:
                while(true) {
                    System.out.println("Home Screen");
                    System.out.println("1 - Please show all available books.");
                    System.out.println("2 - Please show all checked out books.");
                    System.out.println("3 - You may exit.");
                    System.out.println("4 - Please enter a choice from 1 through 3. ");
                    Scanner input;

                    String selectOption = potatorscanner.nextLine();

                    switch (selectOption) {
                        case "1":
                            showAvailableBooks(potatorscanner, book);
                            break;
                        case "2":
                            showAvailableBooks(potatorscanner, book);
                            break;
                        case "3":
                            System.out.println("Exit. Goodbye!");
                            break label;
                        default:
                            System.out.println("This is an invalid choice. Please try again!");

                            break;
                    }

                }
                potatoscanner.close();

            }


            private static void showAvailableBooks(Scanner potatorscanner, Book[] book) {
                System.out.println("Please see available books. ");
                boolean bookFound = false;

                for (Book book1 : book) {
                    if (!book.isCheckedout()) {
                        System.out.println(book1.showAvailableBooks());
                        checkedOutBooks = true;
                    }
                }

                if (!checkedOutBooks) {
                    System.out.println("No books are currently checked out!");
                    return;
                }
                System.out.println("Please enter book ID to check in or enter 0 to cancel. ");
                int id = Integer.parseInt(potatorscanner.nextLine());
                if(id == 0) return;

            }





        }

        private boolean showAvailableBooks() {
        }
    }
}


}
