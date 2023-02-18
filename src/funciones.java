public class funciones{
private int kilos=0, tipoderopa=0,llenadoCompleto=0,lavadoCompleto=0,secadoCompleto=0;
    //crear constructor
    public funciones(int kilos, int tipoderopa){
this.kilos=kilos;
this tipoderopa=tipoderopa;
    }
private void llenado(){
    if(kilos<=12){
    llenadoCompleto=1;
    System.out.printl("Llenando...");
    System.out.println("Llenado completo");
    }else{
        System.out.priintln("La carga es muy pesada");}
private void lavado(){
    llenado();
    if(llenadoCompleto==1){
        if(tipoderopa==1){
        System.out.priintln("Ropa blanca--Lavado suave");
        System.out.priintln("Lavando...");
        lavadoCompleto=1;
        }else if(tipoderopa==2){
            System.out.printl("Ropa de color--Lavado fuerte");
            System.out.priintln("Lavando...");
            lavadoCompleto=1;
        }else{
            System.out.priintln("Tipo de ropa no disponible");
            System.out.printl("Se lavara como ropa de color");
            lavadoCompleto=1;
        }}}
            private void secado(){
                lavado();
                if(lavadoCompleto==1){
                    System.out.printl("Secando");
                    secadoCompleto=1;
}
        
    }
public void cicloFinalizado(){
    secado();
    if(secadoCompleto==1){
        System.out.printl("Ropa lista");
    }
}
    }}
