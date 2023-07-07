import javax.swing.JOptionPane;

public class Rectangle{

    double width;
    double height;

    public Rectangle(double x , double y){
        width = x;
        height = y;
    }

    public double getRectanglePeremeter(){
       
        double peremeter = 2*(width + height);
        return peremeter;    
        

    }

    public double getRectangleArea(){
       
        double area = width * height; 
        return area;

    
    }

    public void showRectanglePeremeter() {
    }

    public void showRectangleArea() {
    }



}