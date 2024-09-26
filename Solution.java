import javax.swing.JOptionPane;
import java.lang.Math;
public class Solution {
    public static void main (String[] args){
        String temp;
        temp = JOptionPane.showInputDialog(null,"Input the degree of the equation: ","Input the degree",
        JOptionPane.INFORMATION_MESSAGE);
        double n = Double.parseDouble(temp); 
        if(n==1){
            String temp2;
            temp2 = JOptionPane.showInputDialog(null,"Enter the number of variable: ");
            double num1 = Double.parseDouble(temp2);
            if(num1==1){
                String x1,x2;
                x1 = JOptionPane.showInputDialog(null,"Input the first coefficient: ","Input the 1st coefficient",
                JOptionPane.INFORMATION_MESSAGE);
                x2 = JOptionPane.showInputDialog(null,"The second coefficient is: ","Input the second coefficient",
                JOptionPane.INFORMATION_MESSAGE);
                double sol1 = Double.parseDouble(x1);
                double sol2 = Double.parseDouble(x2);
                if(sol1==0){
                    if (sol2==0){
                        JOptionPane.showMessageDialog(null,"THE EQUATION HAS MANY SOLUTION","CASE 2",
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"NO SOLUTION","CASE 1", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,-(sol2/sol1),"THE SOLUTION OF THE EQUATION IS: ",
                    JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                String x1,x2,x3,y1,y2,y3;
                x1 = JOptionPane.showInputDialog(null,"Input the first coefficient of 1st equation : ","Input the 1st num",
                JOptionPane.INFORMATION_MESSAGE);
                x2 = JOptionPane.showInputDialog(null,"Input the second coefficient of 1st equation : ","Input the 2nd num",
                JOptionPane.INFORMATION_MESSAGE);
                x3 = JOptionPane.showInputDialog(null,"Input the third coefficient of 1st equation : ","Input the 3rd num",
                JOptionPane.INFORMATION_MESSAGE);
                y1 = JOptionPane.showInputDialog(null,"Input the first coefficient of second equation : ","Input the 1st num",
                JOptionPane.INFORMATION_MESSAGE);
                y2 = JOptionPane.showInputDialog(null,"Input the first coefficient of second equation: ","Input the 2nd num",
                JOptionPane.INFORMATION_MESSAGE);
                y3 = JOptionPane.showInputDialog(null,"Input the third coefficient of the second equation: ","Input the 3rd num",
                JOptionPane.INFORMATION_MESSAGE);
                double a1 = Double.parseDouble(x1);
                double b1 = Double.parseDouble(x2);
                double c1 = Double.parseDouble(x3);
                double a2 = Double.parseDouble(y1);
                double b2 = Double.parseDouble(y2);
                double c2 = Double.parseDouble(y3);

                double D = a1*b2 - a2*b1;
                double Dx = c1*b2 - c2*b1;
                double Dy = a1*c2 - a2*c1;
                if (D!=0){
                    String str1 = (Dx/D)+"";
                    String str2 = (Dy/D)+"";
                    JOptionPane.showMessageDialog(null,str1+" and "+str2,"The solution is: ",JOptionPane.INFORMATION_MESSAGE);

                }
                if (D==0){
                    if (Dx!=0 && Dy!=0){
                        JOptionPane.showMessageDialog(null,"NO SOLUTION","ERROR",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"THE EQUATION HAS MANY SOLUTIONS","Notification",
                        JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
        if(n==2){
            String x,y,z;
            x = JOptionPane.showInputDialog(null,"Input the first coefficient","Input the first num",
            JOptionPane.INFORMATION_MESSAGE);
            y = JOptionPane.showInputDialog(null,"Input the second coefficient","Input the 2nd num",
            JOptionPane.INFORMATION_MESSAGE);
            z = JOptionPane.showInputDialog(null,"Input the third coefficient","Input the 3rd num",
            JOptionPane.INFORMATION_MESSAGE);
            
            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);
            double c = Double.parseDouble(z);
            if(a==0){
                JOptionPane.showMessageDialog(null,"You have to put a≠0 or please put the degree equal to 1 in this case!","ERROR",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                double delta = b*b - 4*a*c;
                if(delta<0){
                    JOptionPane.showMessageDialog(null, "NO SOLUTION", "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                else if (delta==0){
                    double sol = -b/(2*a);
                    JOptionPane.showMessageDialog(null,sol,"THE SOLUTION IS: ",
                    JOptionPane.INFORMATION_MESSAGE);
                
                }
                else{
                    double s1 = (-b + Math.sqrt(delta))/2*a;
                    double s2 = (-b - Math.sqrt(delta))/2*a;
                    String x01 = s1+"";
                    String x02 = s2+"";
                    JOptionPane.showMessageDialog(null,x01+" and "+x02,"The solutions is: ",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            }
        

    }
}
