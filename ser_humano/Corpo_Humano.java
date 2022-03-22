
package ser_humano;


public class Corpo_Humano {
    
    public float massa;
    private float densidade;
    private float volume;
    private float altura;
    
    public Corpo_Humano(float massa, float volume){
        this.massa = massa;
        this.volume = volume;
        densidade = massa / volume;
    }
    
    public float GetMassa(){
        return massa;
    }
    public float GetVolume(){
        return volume;
    }
    public float GetDensidade(){
        return densidade;
    }
    public float GetAltura(){
        return altura;
    }
    
    public void SetMassa(float massa){
        this.massa = massa;
        densidade = massa / volume;
    }
    
    public void SetVolume(float volume){
        this.volume = volume;
        densidade = massa / volume;
    }
    public void SetAltura(float altura){
        this.altura = altura;
    }
    public float calcularIMC(){
        return massa/volume;
    }
}
