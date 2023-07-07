import javax.swing.JOptionPane;

public class ShapeGamer{

    public static void main(String [] args){

        String option = JOptionPane.showInputDialog(null, "Select a Shape : " + "\n\n" +
                        "1 - Rectangle" + "\n\n" + 
                        "2 - Circle" + "\n\n" + 
                        "3 - Trangle");
        int op = Integer.parseInt(option);

        double area = 0.0;
        double peremeter = 0.0;

        if(op==1){

            String width = JOptionPane.showInputDialog(null,"Shape : Rectangle : " + "\n\n" + "Enter Value For Width : ");
            String height = JOptionPane.showInputDialog(null, "Shape : Rectangle : " + "\n\n" + "Enter Value For Height :");
            
            int wdt = Integer.parseInt(width);
            int hgt = Integer.parseInt(height);
            
            area = wdt * hgt ;
            peremeter = 2 * (wdt + hgt);
            
            JOptionPane.showMessageDialog(null, "Area is : "+ area + "\n\n" + "Perameter is : " + peremeter);


        }
        else if(op==2){

            String radius = JOptionPane.showInputDialog(null,"Shape : Circus : " + "Enter Value For Radius : ");

            int rds = Integer.parseInt(radius);

            area = Math.round(Math.PI * (rds * rds));
            peremeter = Math.round(2 * (Math.PI * rds));

            JOptionPane.showMessageDialog(null, "Area is : "+ area + "\n\n" + "Peremeter is : " + peremeter);


        }
        else if(op==3){
            String base1 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "Enter Value For Base : ");
            String side1 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "Enter Value For Side 1 : ");
            String side2 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "Enter Value For Side 2 : ");
            String verticalheight = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "Enter Value For Vertical Height : ");

            double base = Integer.parseInt(base1);
            double sde1 = Integer.parseInt(side1);
            double sde2 = Integer.parseInt(side2);
            double vhgt = Integer.parseInt(verticalheight);

            area = 0.5 * base * vhgt ;
            peremeter = base + sde1 + sde2 ;

            JOptionPane.showMessageDialog(null, "Area is : " + area + "\n\n" + "Peremeter is : " + peremeter);


        }
        else{ 
            System.exit(0);
        }   

    }   
}