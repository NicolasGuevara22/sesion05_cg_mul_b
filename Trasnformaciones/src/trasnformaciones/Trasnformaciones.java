package trasnformaciones;

import java.util.Scanner;

public class Trasnformaciones {

   
    public static void main(String[] args) {
        
        int x,y;
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		 System.out.println ("Por favor introduzca los valores del vector de Traslacion: ");
		 System.out.println ("x: ");
		 Scanner entrada = new Scanner(System.in);
		 x = entrada.nextInt();
		 System.out.println ("y: ");
		 y = entrada.nextInt();
	}
}

class Coord {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}

class Cuadrado {
    private Coord c;
    private int lado;
    private float ang;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord tra) {  // Complete los parámetros requeridos
        c.setX(tra.getX()+ c.getX());
        c.setY(tra.getY()+ c.getY());
    }
    public void Escalado(int sc) {  // Complete los parámetros requeridos
        lado = (int) (lado *(1+ sc/100.0f));
    }
    public void Rotacion(int x, int y, float ang) {  // Complete los parámetros requeridos
         
       c.setX*Math.cos(ang)-y*Math.sin(ang);
       c.setX*Math.sin(ang)+y*Math.cos(ang);
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
}

