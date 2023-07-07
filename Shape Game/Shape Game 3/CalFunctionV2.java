import javax.swing.JOptionPane;

public class CalFunctionV2{

    public static double getRecArea(double x , double y){
        double area = x * y;
        return area;
    }
    public static double getRecPere(double x , double y){
        double peremeter = 2 * (x + y);
        return peremeter;
    }
    public static double getCirArea(double x){
        double area = Math.round(Math.PI * x * x);
        return area;
    }
    public static double getCirPere(double x){
        double peremeter = Math.round(Math.PI *2 * x);
        return peremeter;
    }
    public static double getTraArea(double x, double y){
        double area = 0.5 * x * y;
        return area;
    
    }
    public static double getTraPere(double x , double y , double z){
        double peremeter = x + y + z ;
        return peremeter;
    }
}
