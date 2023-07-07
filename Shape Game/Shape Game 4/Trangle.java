import javax.swing.JOptionPane;

public class Trangle{

    double base1;
    double side1;
    double side2;
    double verticalheight;

    public Trangle(double x , double y , double z, double q ){

        base1 = x;
        side1 = y;
        side2 = z;
        verticalheight = q;
    }
    public void showTrangleArea(){
        double area = 0.5 * base1 * verticalheight;
        JOptionPane.showMessageDialog(null, "Area is : " + area);
    }
    public void showTranglePeremeter(){
        double peremeter = base1 + side1 + side2;
        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);
    }
}