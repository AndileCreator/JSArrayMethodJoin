package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBuilder rowData = new StringBuilder();
        String[][] databaseData = {{"John","Doe","Universitas"},{"Jane","Doe","Founa"}};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Database.csv")))
        {
            for(String[] data : databaseData){
                rowData.append(String.join(";", data));
                rowData.append("\n");
            }
            writer.write(rowData.toString());
            writer.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
//        String[] databaseData = {"John; Doe; Universitas","Jane; Doe; Founa"};
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Database.csv")))
//        {
//            String data = String.join("\n", databaseData);
//            writer.write(data);
//            writer.flush();
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
    }
}
