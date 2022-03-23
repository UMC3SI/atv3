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
public class Corpo_Humano 
{

     private float massa;
     private float densidade;
     private float volume;
     
     public Corpo_Humano(float massa, float volume)
     {
         this.massa = massa;
         this.volume = volume;
         densidade = massa / volume;
         
         
     }
     public float GetMassa()
     {
         return massa;         
     }
     public float GetVolume()
     {
         return volume;        
     }
     public float GetDensidade()
     {
         return densidade;
     }
     public void SetMassa(float massa)
     {
         this.massa = massa;
         densidade = massa/volume;
     }
     public void SetVolume(float volume)
     {
         this.volume = volume;
         densidade = massa/volume;        
              }
     
 }

