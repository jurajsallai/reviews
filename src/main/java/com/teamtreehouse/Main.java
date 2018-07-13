package com.teamtreehouse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Craig", 5, "Ahoj, ako sa mas");
            printer.printRecord("Juraj", 4, "Ahoj, ako, sa mas");
            printer.printRecord("John", 15, "blabla master");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
