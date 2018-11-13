package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        File file = new File("file");

        //parametr append: true - plik mozna aktualizowac, dopisac do pliu
        //append: false plik nadpisujemy - tworzymy od nowa
        //FileWriter mozna opakowac np w BufferedWriter:
        //BufferedWriter bf = new BufferedWriter(new FileWriter("file.txt", true));
        try (FileWriter f = new FileWriter(file, false)) {
            f.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
