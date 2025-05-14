package lingua.linguagens.java;
import java.time.LocalTime;

public class horario{
    public static void main (String [] args){
        LocalTime horario = LocalTime.now();
        int horas = horario.getHour();

    if (horas >= 6 && horas < 12) {
        System.out.println("Bom dia!");
    }
    else if (horas >= 13 && horas < 18){
        System.out.println("Boa tarde!");
    }
    else if (horas >= 19 && horas < 24){
        System.out.println("Boa noite");
    }
}
}


