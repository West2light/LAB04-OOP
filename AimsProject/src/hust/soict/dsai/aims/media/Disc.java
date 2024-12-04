
package hust.soict.dsai.aims.media;

// Disc class represents a generic disc and extends the Media class.
public class Disc extends Media {
    // Attributes
    private String directory;  // Director of the disc (applicable for DVDs and some CDs)
    private int length;        // Length of the disc content in seconds (applicable for DVDs and some CDs)
    
    // Constructors
    
    // Constructor mặc định
    public Disc() {
        this(null, 0);
    }
    
    // Constructor for a disc with ID and title.
    public Disc(int id, String title) {
        super(id, title);
    }
    
    // Constructor for a disc with ID, title, category, cost, director, and length.
    public Disc(int id, String title, String category, float cost, String directory, int length) {
        super(id, title, category, cost);
        this.directory = directory;
        this.length = length;
    }
    
    // Constructor cho length và director
    public Disc(String directory, int length) {
        super();
        this.directory = directory;
        this.length = length;
    }
    
    // Getters and Setters
    // Getter for the director of the disc.
    public String getDirectory() {
        return directory;
    }
    
    // Getter for the length of the disc content.
    public int getLength() {
        return length;
    }
} 