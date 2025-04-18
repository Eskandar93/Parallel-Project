package model;

public class Student {

	 	private String id;
	    private String name;
	    private double grade;

	    public Student(String id, String name, double grade) {
	        this.id = id;
	        this.name = name;
	        this.grade = grade;
	    }

	    // Getters and Setters
	    public String getId() { 
	    	return id; 
	    }
	    public String getName() { 
	    	return name; 
	    }
	    public double getGrade() {
	    	return grade; 
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", grade=" + grade +
	                '}';
	    }
}
