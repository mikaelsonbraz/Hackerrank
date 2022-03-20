import java.io.*;
import java.util.*;

public class Solution8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 1;

        while (entrada.hasNext()){
            String frase = entrada.nextLine();
            System.out.println(numero + " " + frase);
            numero += 1;
            }
        }
    }

