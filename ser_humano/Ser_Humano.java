
package ser_humano;

public class Ser_Humano {

    
    public static void main(String[] args) {
        Corpo_Humano c1 = new Corpo_Humano(90, 30);
        
        
        System.out.println(c1.GetMassa());
        System.out.println(c1.GetVolume());
        System.out.println(c1.GetDensidade());
    }
    
}
