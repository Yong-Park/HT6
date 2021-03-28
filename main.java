/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Hoja de Trabajo 6
 * Jose Pablo Monzon 20309, Yong Bum Park 20117
 *
 * -> main.java
 * Nucleo del proyecto
 *
 * @author  TheJPMZ
 * @author Yong-Park
 */

//La lectura del archivo txt se consigio de https://es.stackoverflow.com/questions/97747/leer-un-archivo-de-texto-y-comparar-su-contenido-con-un-arraylist-en-java?rq=1
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class main {
    //Variables
    static int elegido;
    static int eleccionmap;

    /**
     * Metodo de nucleo del programa que controla lo que sucede
     * @param args
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        do{
            //Trabajar segun lo que deseo el usuario
            elegido = menu();
            Factory factory = new Factory();
            ArrayList<String> lectur = new ArrayList<String>();
            System.out.println("____________________");
            if (elegido ==4){
                System.exit(0);
            }
            GeneralMap<String, String> operando = factory.FactorySelection(elegido);
            //Realizar la lectura del archivo.txt
            lectura(lectur);
            for(String s : lectur){
                String separador = Pattern.quote("|");
                String str[] = s.split(separador);
                List<String> al = new ArrayList<String>();
                al = Arrays.asList(str);
                //Lo agregar al hash correspondiente
                operando.put(al.get(0), al.get(1));
            }
            //Menu de opcion para que escoja que hacer con los datos
            do{
                //pedir la opcion que desea hacer
                eleccionmap = menu2();
                if(eleccionmap==1){
                    boolean ciclo = true;
                    System.out.println("Ingresa el nombre de la carta: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el tipo de la carta: ");
                    String tipo = scanner.nextLine();
                    //revisar si el tipo de carta es Monstruo o Hechizo
                    if(tipo.equals("Monstruo") || tipo.equals("Hechizo") || tipo.equals("Trampa")){
                        operando.put(nombre, tipo);
                    }else{
                        System.out.println("El tipo no es Monstruo o Hechizo");
                        System.out.println("Tomar en cuanta que tiene que ser mayuscula la primera letra");
                    }
                }else if(eleccionmap==2){
                    System.out.println("Ingrese el nombre de la carta que desea buscar su tipo: ");
                    String nombre = scanner.nextLine();
                    String contiene = operando.contain(nombre);
                    System.out.println(contiene);
                }else if(eleccionmap==3){
                    operando.nombrecantidad();
                }else if(eleccionmap==4){
                    operando.sortByValue();
                }else if(eleccionmap==5){
                    operando.read();
                }else if(eleccionmap==6){
                    operando.readOrden();
                }
            }while(eleccionmap !=7);
        }while(elegido != 4);
    }

    /**
     * Menu que escoje el tipo de mapa a utilizar
     * @return Regresa el mapa creado por el factory
     */
    public static int menu(){
        boolean ciclo = true;
        Scanner scanner = new Scanner(System.in);
        int elegido=0;
        do{
            System.out.println("___________________________________");
            System.out.println("Escoja el tipo de map que desea utilizar");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.println("4. Salir");
            //escoger
            elegido = opcion(4);
            ciclo=false;
        }while(ciclo);
        return elegido;
    }

    /**
     * Verifica que sea utilizado un dato valido para el menu
     * @param limite Cual es el numero maximo presente en el menu
     * @return int Regresa la opcion elegida
     */
    public static int opcion(int limite){
        Scanner scanner = new Scanner(System.in);
        int opcion_numero=0;
        boolean ciclo_numero=true;
        do{
            try{
                String opcion = scanner.next();
                //Verificar que sea una opcion adecuada
                opcion_numero = Integer.parseInt(opcion);
                if(opcion_numero>=1 && opcion_numero<=limite){
                    ciclo_numero=false;
                }else{
                    System.out.println("Porfavor escoja una de las opciones que se presentan en el menu");
                }
            }catch(Exception e){
                System.out.println("Ingresa solo datos numericos");
            }
        }while(ciclo_numero);
        return opcion_numero;
    }

    /**
     * Lee el archivo .txt
     * @param lectur Obtiene la lista a la que le mete los datos
     */
    public static void lectura(ArrayList<String> lectur){
        try{
            // Abrimos el archivo con la ruta especificada.
            FileInputStream fstream = new FileInputStream(new File("cards_desc.txt"));
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Guardamos cada linea en lectur
                lectur.add(strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    /**
     * Menu para escoger el proceso a realizar
     * @return int Regresa el numero del proceso
     */
    public static int menu2(){
        boolean ciclo=true;
        Scanner scanner = new Scanner(System.in);
        int elegido=0;
        do{
            System.out.println("___________________________________");
            System.out.println("Escoja lo que desea realizar a continuacion");
            System.out.println("1. Agregar carta nueva");
            System.out.println("2. Mostrar el tipo de una carta especifica");
            System.out.println("3. Mostrar el nombre y tipo de cantidad de cada carta en la coleccion");
            System.out.println("4. Mostrar el nombre y tipo de cantidad de cada carta en orden por tipo");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
            System.out.println("7. Regresar");
            //escoger
            elegido = opcion(7);
            ciclo=false;
        }while(ciclo);
        return elegido;
    }
}