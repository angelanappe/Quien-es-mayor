import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        //2. Pedir al usuario que ingrese las fechas
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA: ");
        String primeraFecha = sc.nextLine();

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA: ");
        String segundaFecha = sc.nextLine();

        //3. Guardar día, mes, año como integer usando substring
        int primerDia = Integer.parseInt(primeraFecha.substring(0, 2));
        int primerMes = Integer.parseInt(primeraFecha.substring(3,5));
        int primerAnio = Integer.parseInt(primeraFecha.substring(6));

        int segundoDia = Integer.parseInt(segundaFecha.substring(0, 2));
        int segundoMes = Integer.parseInt(segundaFecha.substring(3, 5));
        int segundoAnio = Integer.parseInt(segundaFecha.substring(6));

        //4. Comparar las fechas de cada persona
        if (primerAnio < segundoAnio) {
            System.out.println("Persona 1 es mayor.");
        } else if (primerAnio > segundoAnio) {
            System.out.println("Persona 2 es mayor.");
        } else {
            if (primerMes < segundoMes) {
                System.out.println("Persona 1 es mayor.");
            } else if (primerMes > segundoMes){
                System.out.println("Persona 2 es mayor.");
            } else {
                if (primerDia < segundoDia) {
                    System.out.println("Persona 1 es mayor.");
                } else if (primerDia > segundoDia) {
                    System.out.println("Persona 2 es mayor.");
                } else {
                    System.out.println("Tienen la misma edad.");
                }
            }
        }
    }
}