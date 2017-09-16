import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		Scanner sc = new Scanner(System.in);
		if(students==null)
			throw new IllegalArgumentException("Students is null!");
		for(i=0=i<students.length;i++)
		{
			int id;
			String date;
			String name;
			Double AvgMark;
			
			System.out.println("Enter id");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			name=sc.nextLine();
			System.out.println("Enter date");
			String date = sc.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			Date date2=null;
			date2 = dateFormat.parse(date);
			System.out.println("Enter AvgMarks");
			AvgMark = sc.nextDouble();
			
			
		    students[i].setId(id);
            students[i].setFullName(date);
            students[i].setBirthDate(date2);
            students[i].setAvgMark(AvgMark);		
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException("Student is null!");
		else if(index > students.length)
			throw new IllegalArgumentException("Student index out of bounds");
		else
		return student[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
