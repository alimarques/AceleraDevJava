package desafio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    
    
    public List<Jogador> lerCSV() {
    	int contador = 0;
    	List<Jogador> jogadores = new ArrayList<Jogador>();
    	try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            	if(contador > 0) {
	                String[] registro = line.split(cvsSplitBy);
	                Jogador jogador = new Jogador();
	                
	                jogador.setId(registro[0]);
	                jogador.setName(registro[1]);
	                jogador.setFullName(registro[2]);
	                jogador.setClub(registro[3]);
	                jogador.setNationality(registro[14]);
	                
	                if(! registro[6].isEmpty()) {
	                	try {
		                	jogador.setAge(Integer.parseInt(registro[6]));
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}
	                }
	                
	                if(! registro[18].isEmpty()) {
		                try {
		                	jogador.setEur(Float.parseFloat(registro[18]));
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}
	                }
	                
	                if(! registro[17].isEmpty()) {
		                try {
		                	jogador.setEurWage(Float.parseFloat(registro[17]));
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}
	                }
	                
	                if(! registro[8].isEmpty()) {
		                try {
							jogador.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse(registro[8]));
						} catch (ParseException e) {
							e.printStackTrace();
						}
	                }
	                
	                jogadores.add(jogador);
	            }
            contador ++;
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
        return jogadores;
    }

}