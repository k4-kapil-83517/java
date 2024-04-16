package com.sunbeam;

import java.util.*;

import com.sunbeam.Enum.Category;

public class Library {
	
	 Set<Book> books = new HashSet<>();
	
	

	 
	 public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added successfully.");
	    }
	 
	   public void displayAllBooks() {
	        System.out.println("All Books:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	

	   public void displayBooksByCategory() {
	        System.out.println("Books sorted by Category:");
	        TreeSet<Book> sortedBooks = new TreeSet<>(Comparator.comparing(Book::getCategory));
	        sortedBooks.addAll(books);
	        for (Book book : sortedBooks) {
	            System.out.println(book);
	        }
	    }
	   
	   public void displayBooksByAuthorName() {
		   System.out.println("Books sorted by Category: ");
		   TreeSet<Book> sortedBooks = new TreeSet<>(Comparator.comparing(Book::getCategory));
				   sortedBooks.addAll(books);
				   for (Book book : sortedBooks) {
					   System.out.println(book);
				   }
	   }
	
	   public void findBookById(String isbn) {
	        for (Book book : books) {
	            if (book.getIsbn().equals(isbn)) {
	                System.out.println("Book found:");
	                System.out.println(book);
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + isbn + " not found.");
	    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		Library library = new Library();	
		
		
		do {
			System.out.println("WELCOME IN WORLDS BIGGEST LIBRARY SUNBEAM-KARAD");
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it.");
			System.out.println("4. Sort the book details as per author and display it.");
			System.out.println("5. Find book by id.");
			System.out.println("0. Exit");
			choice =sc.nextInt();
			
			
			switch (choice) {
			case 0:
				System.out.println("visit Again......");
				break;
			
			case 1:
				System.out.println("Enter Book details:");
				System.out.println("ISBN : ");
				String isbn =sc.next();
				sc.nextLine();
				
				System.out.println("Category (FICTIONAL, NONFICTIONAL, MYSTERY, THRILLER, ROMANCE, SCIENCE_FICTION): ");
				Category category = Category.valueOf(sc.nextLine().toUpperCase());
				
				System.out.println("Price");
				double price = sc.nextDouble();
				
				System.out.println("Author Name : ");
				sc.next();
				String authorName = sc.next();
				
				System.out.println("Quantity");
				int quantity = sc.nextInt();
				sc.nextLine();
				
				
				Book newBook = new Book(isbn, category, price, authorName, quantity);
				library.addBook(newBook);
				
				break;
				
			case 2:
				library.displayAllBooks();
				break;
			
			case 3:
				library.displayBooksByCategory();
				break;
				
			case 4:
				library.displayBooksByAuthorName();
				break;
				
			case 5:

				 System.out.print("Enter ISBN to find book: ");
                 String searchIsbn = sc.next();
                 library.findBookById(searchIsbn);
				break;
				
				
			default:
				System.out.println("enter a valid choice..........");
				break;
			}
			
			
		}while(choice !=0);
		
		
		
		
		
		
		
	}



}

