package kodalamaIo.entities;

public class Course  {
	private int id;
	private String courseName;
	private Category courseCategory;
	private Instructor courseInstructor;
	private double price;

	public Course() {
	}

	public Course(int id, String courseName, Category courseCategory, Instructor courseInstructor, double price) {
		this.id = id;
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseInstructor = courseInstructor;
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Category getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(Category courseCategory) {
		this.courseCategory = courseCategory;
	}

	public Instructor getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(Instructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
