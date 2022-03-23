
package ser_humano;


public class Corpo_Humano {
    
    private double massa;
    private double densidade;
    private double volume;
    private double altura;
    
    public Corpo_Humano(double massa, double volume){
        this.massa = massa;
        this.volume = volume;
        densidade = massa / volume;
    }
    
    public double getMassa(){
        return massa;
    }
    public double getVolume(){
        return volume;
    }
    public double getDensidade(){
        return densidade;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setMassa(double massa){
        this.massa = massa;
        densidade = massa / volume;
    }
    
    public void setVolume(double volume){
        this.volume = volume;
        densidade = massa / volume;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double calcularIMC(){
        return massa/(altura * altura);
    }
}
