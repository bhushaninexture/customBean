package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get a Book bean
        Book book = context.getBean(Book.class);

        // Use the Book
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());

        // Close the context, triggering destruction of beans
        context.close();
      }
    }
