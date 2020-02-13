package aula2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Data {
	public LocalDate localDate = null;
    public DateTimeFormatter formatter = null;

	public Period calcularIdade(LocalDate startDate, LocalDate endDate) {
		try{
			Period period = Period.between(startDate, endDate); 
	        return period;
			}catch (Exception e) {e.printStackTrace();}
			return null;
		
	}
	
	public LocalDate transformarStringtoDate(String date) {
		// Converter string 'dd-MMM-yyyy' para LocalDate
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // set pattern
	    localDate = LocalDate.parse(date, formatter); // parse date to pattern
	    return localDate;
	
	}
	
}