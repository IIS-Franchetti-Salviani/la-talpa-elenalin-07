/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author zxt02
 */
public class RecordManager {
    private String path = "record.txt";
    
    public void salva(String s) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(s);
        }
    }
    
    public String legge() throws FileNotFoundException, IOException{
        String record;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            record = reader.readLine();
        }
        return record;
    }
}
