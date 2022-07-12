package ventana;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setTitle("El mejor titulo"); 
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200)); 
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creacion de un panel
        panel.setLayout(null); //Desactivamos el diseño por defecto
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta
        etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(10, 10, 30, 20);
        etiqueta.setForeground(Color.WHITE);//Establecemos el color de la letra
        etiqueta.setOpaque(true);//Establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.black);
        panel.add(etiqueta); //Agregamos la etiqueta al panel
    }
}
