/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencod_jueves;

/**
 *
 * @author Arturo Cascallar Expósito
 */
public class ExamenCOD_Jueves {

    public static void main(String[] args) {

//en esta clase se invocaran todos los metodos de la otra clase

    Config obj = new Config();
  
    boolean alarm = true;//este atributo en true enciende la alarma y en false la apaga   

//son los metodos invocados desde la otra clase    
    obj.SetAlarm();
    obj.ActiveAlarm(alarm);
    obj.Alarm(alarm);
    
    }
    
}
