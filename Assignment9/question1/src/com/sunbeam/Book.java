package com.sunbeam;
import com.sunbeam.Enum.*;

public class Book{
		private String isbn;
		private Category category;
		private double price;
		private String authorName;
		private int quantity;
		
		
		public Book(String isbn, Category category, double price, String authorName, int quantity) {
			this.isbn = isbn;
			this.category = category;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}


		public String getIsbn() {
			return isbn;
		}


		public Category getCategory() {
			return category;
		}


		public double getPrice() {
			return price;
		}


		public String getAuthorName() {
			return authorName;
		}


		public int getQuantity() {
			return quantity;
		}


		@Override
		public String toString() {
			return "Book "
					+ "isbn=" + isbn +
					", category=" + category +
					", price=" + price + 
					", authorName=" + authorName
					+ ", quantity=" + quantity ;
		}

}