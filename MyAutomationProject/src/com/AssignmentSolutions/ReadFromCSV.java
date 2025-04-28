package com.AssignmentSolutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadFromCSV {

	public static void main(String[] args) throws IOException, CsvValidationException {
		String fPath = "C:\\Users\\Dell\\Desktop\\Friends.csv";
		CSVReader reader = new CSVReader(new FileReader(new File(fPath)));
		
	}

}
