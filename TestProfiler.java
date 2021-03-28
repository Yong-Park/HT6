import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class TestProfiler {

    int x = 3;
    ArrayList<String> lectur = new ArrayList<String>();
    Factory factory = new Factory();

    @Test
    void testlectura() {

        GeneralMap<String, String> operando = factory.FactorySelection(x);

        main.lectura(lectur);
        for(String s : lectur){
            String separador = Pattern.quote("|");
            String str[] = s.split(separador);
            List<String> al = new ArrayList<String>();
            al = Arrays.asList(str);
            //agregar al hash correspondiente
            operando.put(al.get(0), al.get(1));
        }
    }

    @Test
    void testprint() {
        ArrayList<String> lectur = new ArrayList<String>();
        Factory factory = new Factory();

        GeneralMap<String, String> operando = factory.FactorySelection(x);

        main.lectura(lectur);
        for(String s : lectur){
            String separador = Pattern.quote("|");
            String str[] = s.split(separador);
            List<String> al = new ArrayList<String>();
            al = Arrays.asList(str);
            //agregar al hash correspondiente
            operando.put(al.get(0), al.get(1));
        }
        operando.read();
    }

    @Test
    void testprintorden() {
        ArrayList<String> lectur = new ArrayList<String>();
        Factory factory = new Factory();

        GeneralMap<String, String> operando = factory.FactorySelection(x);

        main.lectura(lectur);
        for(String s : lectur){
            String separador = Pattern.quote("|");
            String str[] = s.split(separador);
            List<String> al = new ArrayList<String>();
            al = Arrays.asList(str);
            //agregar al hash correspondiente
            operando.put(al.get(0), al.get(1));
        }
        operando.readOrden();
    }
}