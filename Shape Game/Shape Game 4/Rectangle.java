import javax.swing.JOptionPane;

public class Rectangle{

    double width;
    double height;

    public Rectangle(double x , double y){
        width = x;
        height = y;
    }
    public void showRectangleArea(){

        double area = width * height ;
        JOptionPane.showMessageDialog(null, "Area is :" + area);

    }
    public void showRectanglePeremeter(){
        double peremeter = 2 * (width + height);
        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);
    }
    
}
