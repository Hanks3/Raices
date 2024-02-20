package pue.java;

public class Raices {
    private final double a;
    private final double b;
    private final double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
    //tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    //tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor que 0.
    //obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
    //obtenerRaices(): imprime las 2 posibles soluciones
    //calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
    //Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)


    public double getDiscriminante(){

        double b2 = Math.pow(b,2);
        return b2-(4*a*c);
    }
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }

    public boolean tieneRaices(){

        return getDiscriminante() > 0;
    }

    public void obtenerRaiz(){
        double raiz = -b/2*a;
        System.out.println("Unica Raiz: " + raiz);
    }
    public void obtenerRaices(){
        double raizDiscriminante = Math.sqrt(getDiscriminante());
        double raizPositiva = (-b+raizDiscriminante)/2*a;
        double raizNegativa = (-b-raizDiscriminante)/2*a;
        System.out.println("Raiz 1: " + raizPositiva);
        System.out.println("Raiz 2: " + raizNegativa);
    }

    public void calcular(){
        if (tieneRaiz()){
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        }else {
            System.out.println("La ecuación no tiene solucion Real");
        }
    }

}
