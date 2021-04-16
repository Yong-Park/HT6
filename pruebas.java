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

    @Test
    void agregaratree() {
        BinarySearchTree Test = new BinarySearchTree();
        for (int i = 0; i < 100; i++) {
            Test.add(i);
        }
        String arbol=Test.treeString();
        System.out.println(arbol);
        arbol = Test.toString();
        System.out.println(arbol);
    }

    @Test
    void buscarentree() {
        BinarySearchTree Test = new BinarySearchTree();
        for (int i = 0; i < 100; i++) {
            Test.add(i);
        }
        Test.contains(1);
    }
}
