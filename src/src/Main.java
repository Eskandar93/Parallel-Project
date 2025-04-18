package src;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import model.Student;
import service.GradeProcessor;

public class Main {

	public static void main(String[] args) {
	
        int numberOfThreads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        File[] gradeFiles = {
                new File("src/resources/file1.txt"),
                new File("src/resources/file2.txt"),
                new File("src/resources/file3.txt")
        };

        try {
            for (File file : gradeFiles) {
                GradeProcessor processor = new GradeProcessor(file);
                Future<List<Student>> future = executor.submit(processor);
                
                List<Student> students = future.get();
                System.out.println("Processed " + students.size() + " students from " + file.getName());
                students.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

}
