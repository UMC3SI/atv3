
package ser_humano;

public class Ser_humano {
    public static void main(String[] args) {

        Corpo_Humano c1 = new Corpo_Humano(68, 50);
		
        c1.SetAltura(1.79f);
	
        System.out.println("Massa: " + c1.GetMassa());
        System.out.println("Volume: " + c1.GetVolume());
        System.out.println("Densidade: " + c1.GetDensidade());
        System.out.println("IMC: " + c1.calcIMC());
    }
}
