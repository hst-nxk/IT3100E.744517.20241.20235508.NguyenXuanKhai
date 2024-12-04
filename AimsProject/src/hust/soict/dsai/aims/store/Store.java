package hust.soict.dsai.aims.store;
import java.util.ArrayList;
// import java.util.LinkedList;

// import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class Store{
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();


    private boolean checkDVD(Media disc) {
        for (Media media : itemsInStore) {
            if (media.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeMedia(Media disc) {
        if(checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " have been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public void addMedia(Media disc) {
        if(!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " have been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }

    }

    @Override //redefine the method inside object of javalang
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (Media dvd : itemsInStore) {
                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }

    public void print() {
        if (itemsInStore.size() == 0) {
            System.out.println("The store is empty!");
        } else {
            System.out.println("********************STORE INVENTORY********************");
            for (Media media : itemsInStore) {
                System.out.println(media);
            }
            System.out.println("********************************************************");
        }
    }
    public Media search(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}

}
