import javax.swing.JOptionPane;

public class ShapeGamerV5{

public static void main (String[] args){

while(true){
    String option = JOptionPane.showInputDialog(null,"Select a Shape : " + "\n\n" +
                " 1 - Rectangle" + "\n" +
                " 2 - Circle" + "\n" +
                " 3 - Trangle\n" +
                " 0 - Exit\n\n");

    int op = Integer.parseInt(option);

    double area = 0.0;
    double peremeter = 0.0;

    if(op==1){

        String Width = JOptionPane.showInputDialog(null,"Shape : Rectangle : " + "\n\n" + "Enter Value For Width :");
        double width1 = Double.parseDouble(Width);
        
        String Height = JOptionPane.showInputDialog(null,"Shape : Rectangle : " + "\n\n" + "Enter Value For Height :");
        double height1 = Double.parseDouble(Height);

        Rectangle r1 = new Rectangle(width1, height1);

        peremeter =r1.getRectanglePeremeter();
        area = r1.getRectangleArea();

        JOptionPane.showMessageDialog(null,"Peremeter is : "+ peremeter +"\nArea is : "+ area);

    }

    else if (op==2){

        String Radius = JOptionPane.showInputDialog(null,"Shape : Circle : " + "\n\n" + "Enter Value For Radius :");

        double radius1 = Double.parseDouble(Radius);

        Circle c1 = new Circle(radius1);

        peremeter = c1.getCirclePeremeter();
        area = c1.getCircleArea();

        JOptionPane.showMessageDialog(null,"Peremeter is : "+ peremeter +"\nArea is : "+ area);

    
    }

    else if (op==3){
        
        String txtBase = JOptionPane.showInputDialog(null,"Shape : Trangle : " + "\n\n" + "Enter Value For Base :");
        String txtSide1 = JOptionPane.showInputDialog(null,"Shape : Trangle : " + "\n\n" + "Enter Value For Side 1 :");
        String txtSide2 = JOptionPane.showInputDialog(null,"Shape : Trangle : " + "\n\n" + "Enter Value For Side 2 :");
        String txtVerticalheight = JOptionPane.showInputDialog(null,"Shape : Trangle : " + "\n\n" + "Enter Value For Vertical Height :");

        double base1 = Double.parseDouble(txtBase);
        double side1 = Double.parseDouble(txtSide1);
        double side2 = Double.parseDouble(txtSide2);
        
        double verticalheight1 = Double.parseDouble(txtVerticalheight);

        Trangle t1 = new Trangle(base1, side1, side2, verticalheight1);
        
       peremeter = t1.getTranglePeremeter();
       area = t1.getTrangleArea();

       JOptionPane.showMessageDialog(null,"Peremeter is : "+ peremeter +"\nArea is : "+ area);

    }

    else{
    System.exit(0);  
    }

}

}

}

