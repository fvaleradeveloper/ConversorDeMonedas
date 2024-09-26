/*
Aplicación desarrollada mediante el uso del aprendizaje en
ALuraLatam-OracleONE-G7 BackEnd-Dev en Formación. También se
utiliza Foros, Consultas en Google, A.I. y un afán por
aprender cada día más. Comencé el programa esquematizando
las labores que iba a realizar para obtener un resultado
satisfactorio.
En primera instancia sabía qué pasos iba a dar, tenía la idea
de los estudiado hasta ahora, pero no sabía si era lo adecuado
para mi caso. Al final se unieron muchas variables y determinaron
el éxito de la app.
 */

//Importar utilidad necesaria
import java.util.Scanner;

public class Principal {
    //Crear clase principal main
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        boolean continuar = true;  
        //Menú de la app
        while (continuar) {  
            System.out.println("*************************************");  
            System.out.println("**      Conversor de Monedas       **");  
            System.out.println("*************************************");  
            System.out.println("  1)   Dólar => Sol peruano");
            System.out.println("  2)   Sol peruano => Dólar");
            System.out.println("  3)   Dólar => Peso argentino");
            System.out.println("  4)   Peso argentino => Dólar");
            System.out.println("  5)   Dólar => Real brasileño");
            System.out.println("  6)   Real brasileño => Dólar");
            System.out.println("  7)   Dólar => Peso colombiano");
            System.out.println("  8)   Peso colombiano => Dólar");
            System.out.println("  9)   Dólar => Bs venezolano");
            System.out.println(" 10)   Bs venezolano => Dólar");
            System.out.println(" 11)   Salir");
            System.out.print("Elija una opción válida: ");  

            //Qué opcion escoge el usuario
            int opcion = Integer.parseInt(scanner.nextLine());  
            //Opción de salida
            if (opcion == 11) {  
                continuar = false;  
                int hora = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);  
                if (hora < 12) {  
                    System.out.println("¡Buenos días!");  
                } else {  
                    System.out.println("¡Buenas tardes!");  
                }  
                break;  
            }  

            // Crea instancia ApiConsulta para obtener tasas de cambio
            ApiConsulta apiConsulta = new ApiConsulta();  
            Moneda[] monedas = apiConsulta.obtenerMonedas();  

            // Crea instancia de Conversor
            Conversor conversor = new Conversor(monedas);  
            conversor.conversion(opcion);  

            //Desea continuar? Si no, se despide...
            System.out.print("¿Desea hacer otra conversión? (si/no): ");  
            String respuesta = scanner.nextLine();  
            if (!respuesta.equalsIgnoreCase("si")) {  
                continuar = false;  
                int hora = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);  
                if (hora < 12) {  
                    System.out.println("¡Buenos días!");  
                } else {  
                    System.out.println("¡Buenas tardes!");  
                }  
            }  
        }
        //Cierra el scanner
        scanner.close();  
    }  
}
