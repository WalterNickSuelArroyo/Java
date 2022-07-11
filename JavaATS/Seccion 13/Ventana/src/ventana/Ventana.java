package ventana;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500); //Establecemos el tamaño de la ventana
        setTitle("El mejor titulo"); //Establecemos el titulo de la ventana
        //setLocation(100, 200); // Establecemos la posicion inicial de la ventana
        //setBounds(100, 200, 500, 500); //Juntamos el setlocation con setsize
        setLocationRelativeTo(null); //Establecemos la ventana en el centro
        
        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
        
        this.getContentPane().setBackground(Color.blue);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
