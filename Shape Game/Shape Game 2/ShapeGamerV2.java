import javax.swing.JOptionPane;

public class ShapeGamerV2{

    public static void main(String [] args){

        String Option = JOptionPane.showInputDialog(null, "Select a Shape : " + "\n\n" +
                        "1 - Rectangle" + "\n\n" +
                        "2 - Circle" + "\n\n" +
                        "3 - Trangle");

        int op = Integer.parseInt(Option);
        
        double area = 0.0;
        double peremeter =0.0;

        if(op==1){

            String width = JOptionPane.showInputDialog(null, "Shape : Rectangle : " + "\n\n" + "Enter Value For Width");
            String height = JOptionPane.showInputDialog(null, "Shape : Rectange : " + "\n\n" + "Enter Value For Height");

            double wdt = Integer.parseInt(width);
            double hgt = Integer.parseInt(height);

            CalFunctionV1.showRecArea(wdt,hgt);
            CalFunctionV1.showRecPere(wdt,hgt);

        }
        else if(op==2){

            String radius = JOptionPane.showInputDialog(null, "Shape : circle : " + "\n\n" + "Enter Value For Radius");

            double rds = Integer.parseInt(radius);

            CalFunctionV1.showCirArea(rds);
            CalFunctionV1.showCirPere(rds);
        }
        else if(op==3){

            String base1 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "\n\n" + "Enter Value For Base");
            String side1 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "\n\n" + "Enter Value For Side 1");
            String side2 = JOptionPane.showInputDialog(null, "Shape : Trangle : " + "\n\n" + "Enter Value For Side 2");
            String verticalheight = JOptionPane.showInputDialog(null, "Shape : Trangle : "+"\n\n" + "Enter Value For Vertical Height");

            double base = Integer.parseInt(base1);
            double sde1 = Integer.parseInt(side1);
            double sde2 = Integer.parseInt(side2);
            double vhgt = Integer.parseInt(verticalheight);

            CalFunctionV1.showTraArea(base,vhgt);
            CalFunctionV1.showTraPere(base,sde1,sde2);

        }
        else{
            System.exit(0);
        }
    }   
}