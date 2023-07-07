import javax.swing.JOptionPane;

public class Circle{

    double radius;

    public Circle(double x){
        radius = x;
        
    }

    public double getCirclePeremeter(){
       
       double peremeter = Math.round(2 * (Math.PI * radius));
       return peremeter;   
        

    }

    public double getCircleArea(){
       
       double  area = Math.round(Math.PI * (radius * radius));
       return area; 
    
    }

    public void showCircleArea() {
    }

    public void showCirclePeremeter() {
    }
    
}