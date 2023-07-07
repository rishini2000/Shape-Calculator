import javax.swing.JOptionPane;

public class ShapeGamerV4{

    public static void main(String [] args){

        String option = JOptionPane.showInputDialog(null, "Select a Shape : " + "\n\n" + 
                        "1 - Rectangle" + "\n\n" +
                        "2 - Circle " + "\n\n" +
                        "3 - Trangle");
        
        int op = Integer.parseInt(option);

        double area = 0.0;
        double peremeter = 0.0;

        if(op==1){

            String width = JOptionPane.showInputDialog(null, " Shape : Rectangle :" + "\n\n" + "Enter Value For Width");
            double wdt = Double.parseDouble(width);

            String height = JOptionPane.showInputDialog(null, " Shape : Rectangle : " + "\n\n" + "Enter Value For Height");
            double hgt = Double.parseDouble(height);

            Rectangle r1 = new Rectangle(wdt,hgt);

            r1.showRectangleArea();
            r1.showRectanglePeremeter();

        }
        else if(op==2){

            String radius = JOptionPane.showInputDialog(null, " Shape : Circle : " + "\n\n" + "Enter Value For Radius");
            double radius1 = Double.parseDouble(radius);

            Circle c1 = new Circle (radius1);

            c1.showCircleArea();
            c1.showCirclePeremeter();
        }
        else if(op==3){

            String base1 = JOptionPane.showInputDialog(null, " Shape : Trangle : " + "\n\n" + "Enter Value For Base");
            double base = Double.parseDouble(base1);

            String side1 = JOptionPane.showInputDialog(null, " Shape : Trangle : " + "\n\n" + "Enter Value For Side 1");
            double sde1 = Double.parseDouble(side1);

            String side2 = JOptionPane.showInputDialog(null, " Shape : Trangle : " + "\n\n" + "Enter Value For Side 2");
            double sde2 = Double.parseDouble(side2);

            String verticalheight = JOptionPane.showInputDialog(null, " Shape : Trangle : " + "\n\n" + "Enter Value For Vertical Height");
            double vhgt = Double.parseDouble(verticalheight);

            Trangle t1 = new Trangle(base,sde1,sde2,vhgt);

            t1.showTrangleArea();
            t1.showTranglePeremeter();
        }
        else{
            System.exit(0);

        }

    }

}