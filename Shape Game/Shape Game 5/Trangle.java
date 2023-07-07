import javax.swing.JOptionPane;

public class Trangle{

    double base;
    double side1;
    double side2;
    double verticalheight;

    public Trangle(double x , double y , double z , double w){
        base = x;
        side1 = y;
        side2 = z;
        verticalheight = w;
    }

    public double getTranglePeremeter(){
       
        double peremeter = base + side1 + side2;
        return peremeter;  
        

    }

    public double getTrangleArea(){
       
        double area = 0.5 * verticalheight * base;
        return area;

    
    }

    public void showTrangleArea() {
    }

    public void showTranglePeremeter() {
    }
    
}