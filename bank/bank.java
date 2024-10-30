import java.util.ArrayList;
public class bank {
    private ArrayList<account> acc;

    public bank(){
        acc = new ArrayList<account>();
    }

    public void addAccount(account tmp){
        acc.add(tmp);
    }

    public void removeAccount(account tmp){
        acc.remove(tmp);
    }

    public ArrayList<account> getAccount(){
        return acc;
    }
}
