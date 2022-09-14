package main.exceptions;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) throws IOException {
        lerArquivo();
    }

    /**
     * Try with resources will auto close the BufferedReader passing by parameter, to use the try with resourcer the parameter need to implements the interface Closeable or AutoCloseable
     */
    public static void lerArquivo() {
        try (Reader reader =  new BufferedReader(new FileReader("teste.txt"))){

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Example without try with resources
     */
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
