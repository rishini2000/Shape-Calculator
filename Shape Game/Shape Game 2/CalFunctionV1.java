import javax.swing.JOptionPane;

public class CalFunctionV1{

    public static void showRecPere(Double x, Double y ){
        double peremeter = 2 * (x + y);

        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);
    }
    public static void showRecArea(Double x,Double y){
        double area = x * y;
        
        JOptionPane.showMessageDialog(null, "Area is : " + area);
    }
    public static void showCirArea(Double x){
        double area = Math.round(Math.PI * (x * x));

        JOptionPane.showMessageDialog(null, "Area is : " + area);
    }
    public static void showCirPere(Double x){
        double peremeter = Math.round(2 * (Math.PI * x));

        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);
    }
    public static void showTraArea(Double x, Double y){
        double area = 0.5 * x * y;

        JOptionPane.showMessageDialog(null, "Area is : " + area);
    }
    public static void showTraPere(Double x,Double y,Double z){
        double peremeter = x + y + z;

        JOptionPane.showMessageDialog(null, "Peremeter is : " + peremeter);
    }
}