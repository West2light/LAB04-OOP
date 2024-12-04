
package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc() {
        super();
    }
    
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost, "", 0);
        this.artist = artist;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void addTrack(Track track) {
        if (track == null) {
            System.out.println("Track không thể là null!");
            return;
        }
        
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" đã tồn tại trong CD!");
        } else {
            tracks.add(track);
            System.out.println("Đã thêm track \"" + track.getTitle() + "\" vào CD.");
        }
    }
    
    public void removeTrack(Track track) {
        if (track == null) {
            System.out.println("Track không thể là null!");
            return;
        }
        
        if (tracks.remove(track)) {
            System.out.println("Đã xóa track \"" + track.getTitle() + "\" khỏi CD.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" không tồn tại trong CD!");
        }
    }
    
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo.replace(")", 
            String.format(", Artist: %s, Length: %d)", 
                artist != null ? artist : "N/A",
                getLength()));
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        System.out.println("Artist: " + this.getArtist());
        
        if (tracks.isEmpty()) {
            System.out.println("No tracks in this CD!");
            return;
        }
        
        System.out.println("Playing tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
} 