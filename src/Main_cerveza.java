import java.util.Scanner;
public class Main_cerveza {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Ingrese el diámetro del vaso: ");
        double diametro = sc.nextDouble();

        System.out.print("Ingrese la altura del vaso: ");
        double altura = sc.nextDouble();

        Metodos vol =new Metodos(diametro, altura);
vol.volumen();
        

}}