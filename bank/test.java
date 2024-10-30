// import java.util.Scanner;
public class test {
    // private account storeArr[] = new account[];
    public static void main(String[] args){
        account user1 = new account("skibidi","1020393920102",10000000);
        account user2 = new account("bimbimbombom","2010202011002",540000);
        user1.deposit(2500000);
        System.out.println("user1: "+ user1.getBalance() + " VND");
        user2.withdraw(500000);
        System.out.println("user2: " + user2.getBalance() + " VND");

    }
}
