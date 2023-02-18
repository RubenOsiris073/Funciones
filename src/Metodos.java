public class Metodos{
public double diametro, volumen;
public double altura;

public Metodos(double diametro, double altura){
    this.altura=altura;
    this.diametro=diametro;

}


    public void calcularVolumen(){
    double pi=3.1416;
    double radio=diametro/2;
    double volumen=(pi*Math.pow(radio,2)*altura);

}
public void volumen(){
calcularVolumen();
System.out.println("el volumen"+volumen);

}
}