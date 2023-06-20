import java.util.Scanner;
/*
INTEGRANTES:
Juan pablo Vasquez
Andres Tapia
Sebastian Araya
Victor Briso
* */
public class Main {
    public static void main(String[] args) {
        String dia;
        String hora;
        String lugar;
        int duracion;
        int asistentes;
        String nombre;
        int edad;
        int iteral1=0, iteral2=0, iteral3=0, iteral=0;
        Asistentes capacitados[][];
        Scanner lectura = new Scanner (System.in);
        do {
            System.out.println("Ingrese el día de la capacitación");
            dia = lectura.next();
        }while (dia==null);
        do {
            lectura = new Scanner (System.in);
            System.out.println("Ingrese la hora de la capacitación");
            hora = lectura.next();
        }while (hora==null);
        do {
            lectura = new Scanner (System.in);
            System.out.println("Ingrese el lugar de la capacitación");
            lugar = lectura.next();
        }while(lugar==null);
        do {
            lectura = new Scanner (System.in);
            System.out.println("Ingrese la duracion de la capacitación, en MINUTOS");
            duracion = lectura.nextInt();
        }while(duracion<=0);
        do{
            lectura = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de asistentes a la capacitación, debe ser al menos 1");
            asistentes = lectura.nextInt();
        }while(asistentes<=0);
        Capacitaciones capacitacion = new Capacitaciones(dia, hora, lugar, duracion, asistentes);
        capacitados = new Asistentes[3][asistentes];
        for(int i=0; i<asistentes; i++){
            int grupo=0;
            lectura = new Scanner (System.in);
            System.out.println("Ingrese el nombre del asistente N° "+ (i+1));
            nombre = lectura.next();
            lectura = new Scanner (System.in);
            System.out.println("Ingrese la edad de "+nombre);
            edad = lectura.nextInt();
            Asistentes asistente = new Asistentes(nombre, edad);
            grupo=asistente.grupoEdad(edad);
            switch (grupo) {
                case 0:
                    iteral=iteral1;
                    iteral1++;
                    break;
                case 1:
                    iteral=iteral2;
                    iteral2++;
                    break;
                case 2 :
                    iteral=iteral3;
                    iteral3++;
                    break;
                default:
            }
            capacitados[grupo][iteral]=asistente;
        }
        System.out.println("************************************************");
        System.out.println("Día: "+capacitacion.getDia());
        System.out.println("Hora: "+capacitacion.getHora());
        System.out.println("Lugar: "+capacitacion.getLugar());
        System.out.println("Duración: "+ capacitacion.getDuracion());
        System.out.println("Cantidad de asistentes: "+ capacitacion.getAsistentes());
        System.out.println("************************************************");
        System.out.println("Participantes con edad menor o igual a 25");
        for(int i=0; i<3; i++){
            for (int k=0; k<asistentes; k++){
                if(capacitados[i][k]!=null){
                    System.out.println("Nombre: "+capacitados[i][k].getNombre());
                    System.out.println("Edad: "+capacitados[i][k].getEdad());
                }

            }
        }
    }
}
