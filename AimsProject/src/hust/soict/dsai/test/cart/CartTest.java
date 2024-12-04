package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        //dmsadkmadasdasdads

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Science Fiction","George Lucas",87,24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        cart.addMedia(dvd3);

        // DigitalVideoDisc[] dvdList1 = {dvd2,dvd1,dvd3};
        // cart.addDigitalVideoDisc(dvdList1);

        // anOrder.removeDigitalVideoDisc(dvd2);
        
        // System.out.println("Total cost is: ");
        // System.out.println(cart.totalCost());
        
        cart.searchbyId(3);
        cart.searchbyTitle("skibidi toilet");
        cart.Print();
    }
}
