import java.util.Scanner;
public class MAIN_VASOS{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el diametro");
        double diametro=sc.nextDouble();
        System.out.println("Ingresa altura");
        double altura=sc.nextDouble();
        double pi=3.1416;
        double radio=diametro/2;
        double volumen=pi*Math.pow(radio,2)*altura;
System.out.println("Tu volumen es"+volumen);
double litro=sc.nextDouble();
double mililitros=litro*1000;

double vasos=mililitros/volumen;
double res=Math.round(vasos);
System.out.println("Solo pudes tomar"+res);

}}

        