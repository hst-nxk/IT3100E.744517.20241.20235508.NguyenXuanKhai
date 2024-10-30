public class account {
    private String name;
    private int balance;
    private String id;
    public static final int fee = 5000;
    
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    // public void setBalance(int balance) {
    //     this.balance = balance;
    // }

    public account(String name) {
        this.name = name;
    }

    public account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public account(String name, String id, int balance) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }
    
    public account(){
        name = "No name";
        id = "No id";
        balance = 0;
    }
    
    public void withdraw(int temp){
        if (balance < temp){
            System.err.println("Error!");
        }
        if (balance < 55000){
            System.err.println("Not enough money, can not withdraw");
        }
        else{
            balance -= ( temp + 5000 );
            
            if (balance < 50000){
                System.err.println("Error transaction! Please charge more!");
                balance += temp + 5000;
            }
            else{
                System.out.println("Withdraw successfully!");
            }
        }
    }

    public void deposit(int temp){
        balance += temp;
        System.out.println("Deposit successfully!");
    }
}
