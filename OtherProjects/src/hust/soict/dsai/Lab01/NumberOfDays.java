import javax.swing.JOptionPane;
public class NumberOfDays {
    public static void main(String[] args){
        String year,month1;
        year = JOptionPane.showInputDialog(null,"Please input the year: ","YEAR INPUT",
        JOptionPane.INFORMATION_MESSAGE);
        month1 = JOptionPane.showInputDialog(null,"Please input the month","MONTH INPUT",
        JOptionPane.INFORMATION_MESSAGE);
        int year1 = Integer.parseInt(year);
        int month = Integer.parseInt(month1);
        if((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)){
            JOptionPane.showMessageDialog(null,"The number of days is 31","Number of days",
            JOptionPane.INFORMATION_MESSAGE);
        }
        else if ((month==4) || (month==6) || (month==9) || (month==11)){
            JOptionPane.showMessageDialog(null,"The number of days is 30","Number of days",
            JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if ((year1%4==0)&&(year1%100!=0)||(year1%400==0)){
                JOptionPane.showMessageDialog(null,"The number of days is 29","Number of days",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"The number of days is 28","Number of days",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}
