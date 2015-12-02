package ro.pub.cs.aipi.lab07.main;

import javax.xml.ws.Endpoint;

import ro.pub.cs.aipi.lab07.businesslogic.BookManager;

public class BookStore {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/bookstore/BookManager", new BookManager());
		System.out.println("[BookManager] successfully registered!");
		
		// TODO: exercise 5c
		
		// TODO: exercise 7c
	}

}