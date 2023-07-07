import javax.swing.JOptionPane;

public class Circle{

    double radius;

    public Circle(double x){
        radius = x ;

    }
    public void showCircleArea(){
        double area = Math.round(Math.PI * radius * radius);
        JOptionPane.showMessageDialog(null, "Area is : " + area);
    }
    public void showCirclePeremeter(){
        double peremeter = Math.round(2 * Math.PI * radius);
        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);

    }
}