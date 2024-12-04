package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    // private String title;
    // private String category;
    // private float cost;
    // private int id;
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } 
        else {
            System.out.println("This author has already been in the list!");
        }
    }

    public String toString() {
        return this.getId() + " - Book: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Cost: " + this.getCost() + "$";
    }


    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } 
        else {
            System.out.println("No author has been found to remove!");
        }
    }

    public List<String> getAuthors() {
        return authors;
    }
}
