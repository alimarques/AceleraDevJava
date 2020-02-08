package aula3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

	private String csvFile;
    public BufferedReader br = null;
	public String line = "";
    public String cvsSplitBy = ",";
	
    // Construtor
	public CSVReader(String file) {
		this.csvFile = file;
	}
	
	// Ler cabecalho para ver quais colunas possui
	public void lerCabecalho() {
        try {
            br = new BufferedReader(new FileReader(csvFile));
            // use comma as separator
            String[] registro = br.readLine().split(cvsSplitBy);
            for(String reg: registro) {
            	System.out.println(reg);
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
    }
	
    public List<String> lerCSV(int col) {
    	List<String> coluna = new ArrayList<String>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] registro = line.split(cvsSplitBy);
                coluna.add(registro[col]);
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
        coluna.remove(0);
        return coluna;
    }

}