package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorhism {
    public static void main(String[] args) {
        // Create an ArrayList of Media
        List<Media> mediaList = new ArrayList<>();

        // Create some media (CD, DVD, Book)
        Media dvd = new Disc(1, "The Matrix", "Sci-Fi", 19.99f, "Wachowski", 136);
        Media book1 = new Book(101, "1984", "Dystopian", 9.99f);
        Media cd1 = new CompactDisc(201, "Thriller", "Pop", 15.99f, "Michael Jackson");
 

        // Add media to the list
        mediaList.add(cd1);
        mediaList.add(dvd);
        mediaList.add(book1);

        // Iterate through the list and call toString()
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
