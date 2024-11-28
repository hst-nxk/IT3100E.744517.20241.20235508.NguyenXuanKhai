public class Cart {
    public static final int MAX_NUM_ORDER = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUM_ORDER];
    private int qtyOrder;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrder == 20){
            System.out.println("The cart is full");
        }
        else{
            itemOrdered[qtyOrder] = disc;
            qtyOrder += 1;
            System.out.println(disc.getTitle() + " has been added");
        }
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (itemOrdered[0] == null){
            System.out.println("Your cart is empty!");
        }
        else{
            for (int i = 0; i<qtyOrder;i++){
                if (itemOrdered[i].equals(disc)){
                    for (int j = i; i < qtyOrder-1; i++){
                        itemOrdered[j] = itemOrdered[j+1];

                    }
                    itemOrdered[qtyOrder-1] = null;
                    qtyOrder -= 1;
                    System.out.println("Remove DVD " + disc.getTitle() + " successfully!");
                }
                else{
                    if (i == qtyOrder-1){
                    System.out.println("No DVD match!");
                    }
                }
            }
        }
    }

    public float totalCost(){
        float sum = 0;
        for (int i = 0; i < qtyOrder; i++){
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
    // private int qtyOrder;
    // public void addDigitalVideoDisc(DigitalVideoDisc disc){
    //     qtyOrder += 1;
    //     int i;
    //     int newarr[] = new int[MAX_NUM_ORDER+1];
    //     for (i = 0; i<MAX_NUM_ORDER; i++){
    //         newarr[i] = itemOrdered[i];
    //     }
    // }
}
