package ventana;
import javax.swing.JFrame;
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500); //Establecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("El mejor titulo");
    }
}
