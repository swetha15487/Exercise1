package Exercise0;

import java.util.Scanner;

public class Book {
	String[] favoriteBooks = new String[10];
	int flag = 0;
	int count = 0;

	public int addFavoriteBook(String bookName) {
		String word = "Great";

		boolean test = bookName.contains(word);
		if (test == true) {
			System.out.println("The Book Name contain Great");
			flag = 1;

		} else {
			for (int i = 0; i < favoriteBooks.length; i++) {
				
				favoriteBooks[i] = bookName;
				count++;
				break;
			}

		}

		return 0;
	}

	public void printFavoriteBooks() {
		System.out.println("Favorite Books:..." + count);
		for (int i = 0; i < favoriteBooks.length; i++) {
			System.out.println(favoriteBooks[i]);
			break;
		}
	}

	public static void main(String[] args) {
		Book book = new Book();
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Book Name");
		name = s.next();
		book.addFavoriteBook(name);
		book.printFavoriteBooks();
	}
}
