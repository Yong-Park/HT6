import java.util.Scanner;
public class Main {
    //pedir cual de los tres maps desea aplicar y luego que escoga realizar la lectura del archivo txt

    public static void main (String[] args){
        //trabajar segun lo que deseo el usuario
        int elegido =menu();
        Factory factory = new Factory();
        System.out.println("____________________");
        GeneralMap<String, String> operando = factory.FactorySelection(elegido);

        
    }

    public static int menu(){
        boolean ciclo=true;
        Scanner scanner = new Scanner(System.in);
        int elegido=0;
        do{
          System.out.println("___________________________________");
          System.out.println("Escoja el tipo de map que desea utilizar");
          System.out.println("1. HashMap");
          System.out.println("2. TreeMap");
          System.out.println("3. LinkedHashMap");
          //escoger
          elegido = opcion();
          ciclo=false;
        }while(ciclo);
        return elegido;
    }
    
    public static int opcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion_numero=0;
        boolean ciclo_numero=true;
        do{
            try{
                String opcion = scanner.next();
                //verificar que sea una opcion adecuada
                opcion_numero = Integer.parseInt(opcion);
                if(opcion_numero>=1 && opcion_numero<=3){
                    ciclo_numero=false;
                }else{
                    System.out.println("Porfavor escoja una de las opcioens que se presentan en el menu");
                }
            }catch(Exception e){
                System.out.println("Ingersa solo datos numericos");
            }
        }while(ciclo_numero);
        return opcion_numero;
    }    
}


