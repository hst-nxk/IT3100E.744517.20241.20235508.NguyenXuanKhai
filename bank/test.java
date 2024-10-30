import java.util.ArrayList;
public class test {

    public static void main(String[] args){
        
        
        account user1 = new account("Skibdi Toilet","1020393920102",32000000);
        account user2 = new account("Zhong Xina","1010101010101",50000000);
        account user3 = new account("Camavinga","202021010302",100000000);
        
        
        bank test1 = new bank();
        test1.addAccount(user1);
        test1.addAccount(user2);
        test1.addAccount(user3);

        ArrayList<account> accounts = test1.getAccount();
        System.out.println("INNFORMATION OF USERS: " + "\n");
        for (account acc : accounts){
            System.out.println(acc.getAccountInfo());
            System.out.println();
        }
        System.out.println();
        user1.deposit(2500000);
        System.out.println("user1: "+ user1.getName() + " has " + user1.getBalance() + " VND" + "\n");
        user2.withdraw(500000);
        System.out.println("user2: " + user2.getName() + " has " + user2.getBalance() + " VND" + "\n");
        System.out.println("user3: " + user3.getName() + " has " + user3.getBalance() + " VND" + "\n");
        // System.out.println(user1.getAccountInfo());
        
        

        saving user01 = new saving(5000000);
        System.out.println("user1: " + user1.getName() + " has " + user01.getBalance1() + " of saving account" + "\n");
    }
}
