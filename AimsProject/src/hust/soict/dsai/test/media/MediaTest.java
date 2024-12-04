package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.*;
public class MediaTest {
        
        public static void main(String[] args) {
            List<Media> media = new ArrayList<Media>();
    
            DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            Book book = new Book("The Valley of Fear", "Detective", 20.00f);
    
    
            CompactDisc cd = new CompactDisc("Adele - 30", "Music","Adele", 1500.98f);
            Track track1 = new Track("LINGANGGULIGULI", 161);
            Track track2 = new Track("Xue Hua Piao Piao", 66);
            Track track3 = new Track("WOTHAOCHAONIMASHABI", 665);
    
            cd.addTrack(track1);
            cd.addTrack(track2);
            cd.addTrack(track3);
    
            media.add(cd);
            media.add(book);
            media.add(dvd);    
    
            for (Media media1 : media) {
                System.out.println(media1.toString());
            }
        }
        
    }
