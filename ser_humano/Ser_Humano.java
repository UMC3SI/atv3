
package ser_humano;

public class Ser_Humano {

    
    public static void main(String[] args) {
        
        double massa;
        double volume;
        
        massa = 90;
        volume = 30;
        
        Corpo_Humano c1 = new Corpo_Humano(massa, volume);
        
        //c1.massa = 2;
        c1.setMassa(80);
        c1.setVolume(40);
        
        c1.setAltura(1.80);
        
        double IMC = c1.calcularIMC();
        
        System.out.println(c1.getMassa());
        System.out.println(c1.getVolume());
        System.out.println(c1.getDensidade());
        
        System.out.println("O IMC é: " + IMC);
        
    }
    
}
