package lectores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.lang.String;

import java.util.*;
public class CSVReader {

    String filepath;
    BufferedReader br = null;
    String line;
    String cvsSplitBy;
    ArrayList<String[]> list = new ArrayList<String[]>();

    public CSVReader(String filepath)
    {
        this.filepath=filepath;
        cvsSplitBy = ",";
        line = "";
    }

    public ArrayList<String[]> csvtoArray() {
        try {

            br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] element = line.split(cvsSplitBy);
                list.add(element);
                //System.out.println("Estado [c estado= " + estado[0] + " ,nombre estado=" + estado[1] + ",c municipio=" + estado[2] +"nombre estado=" + estado[3] +"]");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return list;
    }

    public static TreeMap<String,String> cloneMap(TreeMap<String,String> map)
    {
        TreeMap<String,String> clone = new TreeMap<String,String>();
        List<String> keys = new ArrayList<String>(map.keySet());
        for (String key: keys) {
                clone.put(key, map.get(key));   
            }
        return clone;
    }
}