public class saving extends account{
    public saving(){}
    public static final double annual_interest_rate = 0.05;
    double monthly_interest_rate = annual_interest_rate/12;
    private int balance1;
    // private String id1;
    // private String name1;
    public double mInterest(){
        return balance1 *= monthly_interest_rate;
    }

    public int getBalance1() {
        return balance1;
    }

    public saving(int balance1) {
        this.balance1 = balance1;
    }

    public double aInterest(){
        return balance1 *= annual_interest_rate;
    }
    public void withdraw(int amount){
        System.err.println("Can not withdraw from this account!");
    }

    public void deposit(int amount){
        balance1 += amount;
    }
}


