package examencod_jueves;

import java.awt.event.KeyEvent;

/**
 *
 * @author Arturo Cascallar Expósito
 */
public class Config {

//estos atributos se utilizarán para la configuración y el funcionamiento de la alarma    
    int hourProg;
    int minProg;

//representa la hora y los minutos actuales    
    int hour;
    int min;

    public void SetAlarm() {//este método se utilizará para indicarle la hora a la que la alarma tiene que sonar
//esto es un acumulador para horas y minutos        
        hourProg = hourProg++;
        minProg = minProg++;
//estos if harán que cuando los minutos lleguen a 60 y las horas a 23 vuelvan a 0        
        if (hourProg > 23)
            hourProg = 0;
        if (minProg > 59)
            minProg = 0;
    }

    public void Alarm(boolean on) {//este metodo activará la alarma cogiendo el atributo horaProg que coger del metoddo de ConfigurarAlarma
        if (on == true) {
            if (hour == hourProg && min == minProg) {
                System.out.println("ALARMA");
            }
        }
    }

    public boolean ActiveAlarm(boolean on) {//este metodo tendra la funcionalidad de retornar si la alarma está encendida o apagada 
        if (on == true) {
            System.out.println("Alarma encendida");
        } else {
            System.out.println("Alarma apagada");
        }
        return on;
    }

}
