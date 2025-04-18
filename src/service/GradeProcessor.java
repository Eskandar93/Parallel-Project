package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import model.Student;

public class GradeProcessor implements Callable<List<Student>> {

	 private File file = null;

	    public GradeProcessor(File file) {
	        this.file = file;
	    }

	    @Override
	    public List<Student> call() throws Exception {
	        List<Student> students = new ArrayList<>();
	        System.out.println("Processing file: " + file.getName() + " in thread: " + Thread.currentThread().getName());
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length == 3) {
	                    String id = parts[0].trim();
	                    String name = parts[1].trim();
	                    double grade = Double.parseDouble(parts[2].trim());
	                    students.add(new Student(id, name, grade));
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + file.getName());
	            }

	        return students;
	    }
}
