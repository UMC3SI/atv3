/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser_humano;

/**
 *
 * @author alunocmc
 */
public class Ser_Humano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Corpo_Humano c1 = new Corpo_Humano(62.5f, 100, 1.75f);
        float imc = c1.calcularIMC();
        System.out.println(imc);
    }
    
}
