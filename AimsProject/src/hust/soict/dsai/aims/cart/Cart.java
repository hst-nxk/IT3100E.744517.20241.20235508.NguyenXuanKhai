package hust.soict.dsai.aims.cart;
import java.util.*;
import hust.soict.dsai.aims.media.Media;
import javax.naming.LimitExceededException;
// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
public class Cart {
    public static final int MAX_NUM_ORDER = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    // private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUM_ORDER];
    public int qtyOrder = 0;
    // public void addDigitalVideoDisc(DigitalVideoDisc disc){
    //     if (qtyOrder == 20){
    //         System.out.println("The cart is full");
    //     }
    //     else{
    //         itemOrdered[qtyOrder] = disc;
    //         qtyOrder += 1;
    //         System.out.println(disc.getTitle() + " has been added");
    //     }
    //     return;
    // }
    
    // public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
    //     int addCount = 0;
    //     for (DigitalVideoDisc disc : dvdList){
    //         if (qtyOrder == MAX_NUM_ORDER){
    //             System.out.println("The cart is almost full!");
    //             break;
    //         }
    //         else{
    //             itemOrdered[qtyOrder] = disc;
    //             qtyOrder++;
    //             // addDigitalVideoDisc(disc);
    //             System.out.println("The DVD " + disc.getTitle() + " has been added!");
    //             addCount++;
    //         }
    //     }
    //     return addCount;
    // }
    
    // public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
    //     if (qtyOrder + 1 == MAX_NUM_ORDER){
    //         System.out.println("The cart is almost full!");
    //     }
    //     else{
    //         itemOrdered[qtyOrder] = dvd1;
    //         qtyOrder++;
    //         System.out.println("The DVD " + dvd1.getTitle() + " has been added!");

    //         itemOrdered[qtyOrder] = dvd2;
    //         qtyOrder++;
    //         System.out.println("The DVD " + dvd2.getTitle() + " has been added!");
    //     }
    // }
    // public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    //     if (itemOrdered[0] == null){
    //         System.out.println("Your cart is empty!");
    //     }
    //     else{
    //         for (int i = 0; i<qtyOrder;i++){
    //             if (itemOrdered[i].equals(disc)){
    //                 for (int j = i; i < qtyOrder-1; i++){
    //                     itemOrdered[j] = itemOrdered[j+1];

    //                 }
    //                 itemOrdered[qtyOrder-1] = null;
    //                 qtyOrder -= 1;
    //                 System.out.println("Remove DVD " + disc.getTitle() + " successfully!");
    //                 break;
    //             }
    //             else{
    //                 if (i == qtyOrder-1){
    //                 System.out.println("No DVD match!");
    //                 }
    //             }
    //         }
    //     }
    // }


    public void searchbyId(int i){
        for(Media media : itemsOrdered){
            if(media.getId() == i){
                System.out.println("Founded: " + media);
            }
            else{
                if(qtyOrder == itemsOrdered.size() - 1){
                System.out.println("No ID match!");
            }
            qtyOrder += 1;
        }
        qtyOrder = 0;
        }
    }
    public void searchbyTitle(String title){
        for (Media media : itemsOrdered){
            if(media.equals(title)){
                System.out.println("Founded: " + media);
            }
            
            else{
                if (qtyOrder == itemsOrdered.size() - 1)
                    System.out.println("No match found the title: " + title);
                }
            qtyOrder += 1;
            }
        qtyOrder = 0;
        
    }

    public void Print(){
        StringBuilder output = new StringBuilder("**********CART********** \n ORDER ITEM: \n");
        System.out.println();
        System.out.println(output);
        for (Media media : itemsOrdered) {
            System.out.println(media);
        }
        System.out.println("");
        System.out.println("=> Total: " + totalCost() + "$" + "\n");
    }
    

    public float totalCost(){
        float sum = 0;
        for (Media skibidi : itemsOrdered){
            sum += skibidi.getCost();
        }
        return sum;
    }
    public void addMedia(Media media){
        if(itemsOrdered.size() >= MAX_NUM_ORDER){
            System.out.println("The number has reach limitation!");
        }
        else if(itemsOrdered.contains(media)){
            System.out.println("The media has already exist!");
        }
        else{
            itemsOrdered.add(media);
            qtyOrder += 1;
            System.out.println(media.getTitle() + "has been added!");
        }
    }

    public void removeMedia(Media media){
        if(itemsOrdered.size() == 0){
            System.out.println("Nothing to remove!");
        }
        else{
            if(itemsOrdered.remove(media)){
                System.out.println(media.getTitle() + "has been removed!");
                qtyOrder -= 1;
            }
            else{
                System.out.println("Not found media in the list!");
            }
        }
    }
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    public void searchbyCategory(String category) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no media matching the \"" + category + "\" category were found!");
        }
    }

    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() <= maxCost) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no media were found that match the maximum cost provided!");
        }
    }

    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            qtyOrder = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }
    
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }

    public String placeOrder() {
        if (itemsOrdered.size() == 0) {
            return "Your cart is empty!";
        } else {
            qtyOrder = 0;
            itemsOrdered.clear();
            return "Order created!\n" + "Now your cart will be empty!";
        }
    }

}
