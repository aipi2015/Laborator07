package ro.pub.cs.aipi.lab07.main;

import javax.xml.ws.Endpoint;

import ro.pub.cs.aipi.lab07.businesslogic.BookManager;
import ro.pub.cs.aipi.lab07.businesslogic.BookPresentationManager;
import ro.pub.cs.aipi.lab07.businesslogic.WriterManager;

public class BookStore {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/bookstore/BookManager", new BookManager());
		System.out.println("[BookManager] successfully registered!");
		
		Endpoint.publish("http://localhost:8081/bookstore/BookPresentationManager", new BookPresentationManager());
		System.out.println("[BookPresentationManager] successfully registered!");
		
		Endpoint.publish("http://localhost:8082/bookstore/WriterManager", new WriterManager());
		System.out.println("[WriterManager] successfully registered!");
	}

}