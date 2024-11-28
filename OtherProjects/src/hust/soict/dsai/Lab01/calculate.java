import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args){
        String strNum1,strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Input the first number: ","Input the 1st num",
        JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Input the second number: ","Input the 2nd num",
        JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1-num2;
        double product = num1*num2;
        double quotient = num1/num2;
        // System.out.println("The sum is: " + sum);
        // System.out.println("The difference is: " + difference);
        // System.out.println("The product is: " + product);
        // System.out.println("The quotient is: " + quotient);

        JOptionPane.showMessageDialog(null,sum,"THE SUM IS: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,difference,"THE DIFFERENCE IS: ",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,product ,"THE PRODUCT IS: ", JOptionPane.INFORMATION_MESSAGE);
        if(num2==0){
            JOptionPane.showMessageDialog(null,"error","QUOTIENT IS NOT EXIST",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,quotient,"THE QUOTIENT IS: ",JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
