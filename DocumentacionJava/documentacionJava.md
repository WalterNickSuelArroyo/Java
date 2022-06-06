# Seccion 9: Programacion orientada a objetos (POO)
## 115. Miembros estaticos de una clase
- Tambien se les conoce como miembros de clase (ya que no le pertenece al objeto sino solo a la clase)
- Los miembros son los atributos y los metodos
- Para convertir un miembro a estatico tenemos que agregar la palabra static que ira despues del modificador de acceso.
Ejemplo:    private static numero = 1;
Al yo agregar static y posteriormente agrego un cambio en algun atributo no importa en que objeto este repercute y se asignara el ultimo cambio la cual sera el definitivo para todos los objetos

**Sin static**
```java
public class Estatico {
    private String frase = "Primera frase";
    public static void main(String[] args) {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }
}
```
Resultado obtenido: 

Primera frase

Segunda frase




**Con static**
```java
public class Estatico {
    private static String frase = "Primera frase";
    public static void main(String[] args) {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }
}
```
Resultado obtenido: 

Segunda frase

Segunda frase

Todos los objetos van a compartir ese atributo, que si yo lo cambio en un objeto cambiara para todos los objetos porque ya no le pertenece a cada objeto individual porque ahora es de la clase
- Otra caracteristica que tienen los atributos staticos es que ya no necesitan que instanciemos un objeto para poder utilizarlos. Ejemplo
```java
public class Estatico {
    private static String frase = "Primera frase";
    public static void main(String[] args) {
        //Podemos imprimir sin necesidad de instanciar un objeto
        System.out.println(Estatico.frase);
    }
}
```
Resultado obtenido: 

Primera frase

- Lo mismo ocurre con los metodos estaticos. Ejemplo:
```java
public class Estatico {
    public static int sumar(int n1, int n2){
            int suma = n1 + n2;
            return suma;
        }
    public static void main(String[] args) {
        System.out.println("La suma es: "+Estatico.sumar(3, 4));
    }
}
```
Resultado obtenido:

La suma es: 7

## 116. Ejercicio 1 - Obtener el perimetro y area de un cuadrilatero 
Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longitud de sus dos lados. Los valores de la longitud deberan introducirse por linea de ordenes. Si es un cuadrado, solo se proporcionara la longitud de uno de los lados al constructor. 

**Solucion**

Diagrama de clases:

![Diagrama de clases UML](dc.PNG)

```java
package Ejercicio1;
public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    //Metodos
    //Metodo constructor 1 (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Metodo constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
}
```

```java
package Ejercicio1;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1,lado2;    
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));      
        if(lado1 == lado2){ //Es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else{
            c1 = new Cuadrilatero(lado1, lado2);
        }     
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}
```

## 117. Ejercicio 2 - Mover un objeto en un tablero
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posicion dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada movimiento el programa mostrara la nueva direccion elegida y las coordenadas de situacion del objeto dentro del tablero.

**Solucion:**
![Diagrama de clases ejercicio 2](dc2.PNG)

```java
package Ejercicio2;
public class Tablero {
    private int x;
    private int y;
    //Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moverArriba(int incremento){
        y+=incremento;
    }
    public void moverAbajo(int incremento){
        y-=incremento;
    }
    public void moverDerecha(int incremento){
        x+=incremento;
    }
    public void moverIzquierda(int incremento){
        x-=incremento;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

```

```java
package Ejercicio2;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;
        int x,y,opcion,incremento=0;
        System.out.print("Digite la coordenada inicial de X: ");
        x=entrada.nextInt();
        System.out.print("Digite la coordenada inicial de Y: ");
        y=entrada.nextInt();
        //Posicion inicial del objeto
        t1=new Tablero(x, y);
        do {            
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia DERECHA");
            System.out.println("4. Mover hacia IZQUIERDA");
            System.out.println("5. Salir");
            System.out.print("Digite la opcion: ");
            opcion=entrada.nextInt();
            
            if(opcion>=1 && opcion<=4){
                System.out.print("\nDigite la cantidad de espacios a moverse: ");
                incremento = entrada.nextInt();
            }
            switch(opcion){
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.print("Error, se equivoco de opcion de menu"); break;
            }
            System.out.print("\nPosicion Actual (X,Y): ("+t1.getX()+" , "+t1.getY()+")"); 
        } while (opcion !=5);
    }
}

```


