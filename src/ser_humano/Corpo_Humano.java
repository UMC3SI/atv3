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
public class Corpo_Humano {
    private float massa;
    private float densidade;
    private float volume;
    private float altura;
    
    public Corpo_Humano(float massa, float volume, float altura){
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        densidade = massa/volume;
    }
    public float getMassa() {
    return massa;
}
     public float getDensidade() {
    return densidade;
}
     public float getVolume() {
    return volume;
}
     public float getAltura() {
    return altura;
}
     private void setMassa(float massa){
         this.massa = massa;
         densidade = massa/volume;
     }
    public void setVolume(float volume){
         this.volume = volume;
         densidade = massa/volume;
     }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float calcularIMC(){
    return massa/altura;
    }
}
