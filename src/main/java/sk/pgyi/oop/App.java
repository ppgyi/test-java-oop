package sk.pgyi.oop;

import com.sun.tools.javac.Main;

import java.io.*;

public class App {
    public static void main(String[] args){

        // =======================================================
        // TAKTO NIE, bo cez File - blbne ta cesta ked zbuildim na jar!!

//        File myFile = new File("src"+File.separator+"main"+
//                File.separator+"resources"+File.separator+"myTextFile");
//
////        FileInputStream fio;
//        FileReader fileReader;
//
//        try {
////            fio = new FileInputStream(myFile);
//            fileReader = new FileReader(myFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return;
//        }
//
//        BufferedReader reader = new BufferedReader(fileReader);
//
//        try {
//            for (String line = reader.readLine(); line != null;
//                 line = reader.readLine()){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // ======================================================
        // TAKTO:
        InputStream is = Main.class.getClassLoader().getResourceAsStream("myTextFile");

        if (is == null) {
            System.out.println("'myTextFile' nie je v resources");
            return;
        }

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader reader = new BufferedReader(isr);

        try {
            for (String line = reader.readLine(); line != null;
                 line = reader.readLine()){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
