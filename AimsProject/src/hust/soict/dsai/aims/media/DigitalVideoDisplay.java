
package hust.soict.dsai.aims.media;

public class DigitalVideoDisplay extends Disc implements Playable {
    private String addDate;
    private static int nbDigitalVideoDiscs = 0;

    // Constructor với title
    public DigitalVideoDisplay(String title) {
        super(++nbDigitalVideoDiscs, title);
        setAddDate();
    }

    // Constructor với title, category, cost
    public DigitalVideoDisplay(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, null, 0);
        setAddDate();
    }

    // Constructor với director, category, title, cost
    public DigitalVideoDisplay(String director, String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, 0);
        setAddDate();
    }

    // Constructor đầy đủ thông tin
    public DigitalVideoDisplay(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, length);
        setAddDate();
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo.replace(")", 
            String.format(", Director: %s, Length: %d, Added: %s)", 
                getDirectory() != null ? getDirectory() : "N/A",
                getLength(),
                addDate));
    }

    public boolean isMatch_quangvn(String title) {
        if (title == null) return false;
        return getTitle().toLowerCase().contains(title.toLowerCase());
    }

    private void setAddDate() {
        this.addDate = new java.util.Date().toString();
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Media other) {
        if (!(other instanceof DigitalVideoDisplay)) {
            // Nếu không phải DVD, dùng cách so sánh mặc định
            return super.compareTo(other);
        }
        
        DigitalVideoDisplay otherDVD = (DigitalVideoDisplay) other;
        
        // So sánh chính theo title
        if (this.getTitle() != null && otherDVD.getTitle() != null) {
            int titleCompare = this.getTitle().compareToIgnoreCase(otherDVD.getTitle());
            if (titleCompare != 0) {
                return titleCompare;
            }
            
            // Nếu title giống nhau, so sánh theo length giảm dần
            if (this.getLength() > otherDVD.getLength()) return -1;
            if (this.getLength() < otherDVD.getLength()) return 1;
            
            // Nếu length giống nhau, so sánh theo cost giảm dần
            if (this.getCost() > otherDVD.getCost()) return -1;
            if (this.getCost() < otherDVD.getCost()) return 1;
            return 0;
        }
        
        // Xử lý các trường hợp title null
        if (this.getTitle() == null && otherDVD.getTitle() != null) return 1;
        if (this.getTitle() != null && otherDVD.getTitle() == null) return -1;
        
        // Nếu cả hai title đều null, so sánh theo length giảm dần
        if (this.getLength() > otherDVD.getLength()) return -1;
        if (this.getLength() < otherDVD.getLength()) return 1;
        
        // Nếu length giống nhau, so sánh theo cost giảm dần
        if (this.getCost() > otherDVD.getCost()) return -1;
        if (this.getCost() < otherDVD.getCost()) return 1;
        return 0;
    }
} 