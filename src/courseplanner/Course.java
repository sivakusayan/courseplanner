package courseplanner;

/**
 * The <code>Course</code> class provides a basic model for a university course.
 * 
 *
 * @author Sayan Sivakumaran e-mail: sayan.sivakumaran@stonybrook.edu Stony
 *         Brook ID: 110261379
 **/

public class Course implements Cloneable {
	private String name;
	private String department;
	private int code;
	private byte section;
	private String instructor;

	/**
	 * Return the course name.
	 * 
	 * @return The name of the course.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the course name.
	 * 
	 * @param name The new name of the course.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return the course department.
	 * 
	 * @return The department of the course.
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Set the course department.
	 * 
	 * @param department The new department of the course.
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Return the course code.
	 * 
	 * @return The code of the course.
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Set the course code.
	 * 
	 * @param code The new code of the course.
	 * 
	 *             <dl>
	 *             <dt>Preconditions:</dt>
	 *             <dd><code>section</code> is at least 0.</dd>
	 *             </dl>
	 * 
	 * @throws NegativeNumberException if <code>code</code> is below 0.
	 * 
	 */
	public void setCode(int code) throws NegativeNumberException {
		if (code < 0) {
			throw new NegativeNumberException("Code can't be a negative number.");
		}
		this.code = code;
	}

	/**
	 * Return the course section.
	 * 
	 * @return The section of the course.
	 */
	public byte getSection() {
		return section;
	}

	/**
	 * Set the course section.
	 * 
	 * @param section The new section of the course.
	 *
	 *                <dl>
	 *                <dt>Preconditions:</dt>
	 *                <dd><code>section</code> is at least 0.</dd>
	 *                </dl>
	 * 
	 * @throws NegativeNumberException if <code>section</code> is below 0.
	 */
	public void setSection(byte section) throws NegativeNumberException {
		if (section < 0) {
			throw new NegativeNumberException("Section can't be a negative number");
		}
		this.section = section;
	}

	/**
	 * Return the course instructor.
	 * 
	 * @return The instructor of the course.
	 */
	public String getInstructor() {
		return instructor;
	}

	/**
	 * Set the course instructor.
	 * 
	 * @param instructor The new instructor of the course.
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	/**
	 * 
	 * Returns an instance of <code>Course</code>.
	 * 
	 * @param name       The course's name.
	 * @param department The course's department.
	 * @param code       The course code.
	 * @param section    The course section.
	 * @param instructor The course's instructor.
	 */
	public Course(String name, String department, int code, byte section, String instructor) {
		this.name = name;
		this.department = department;
		this.code = code;
		this.section = section;
		this.instructor = instructor;
	}

	/**
	 * Provides a deep copy of the course.
	 * 
	 * <p>
	 * <strong>Note:</strong> Make sure to typecast the return value to <code>Course</code>.
	 * </p>
	 * 
	 * @return Deep copy of the course.
	 */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("This course cannot be cloned.");
			return null;
		}
	}

	/**
	 * Checks if all the fields of <code>this</code> and <code>course</code> are
	 * equal.
	 * 
	 * @param course The course to check equality with.
	 * 
	 * @return True if all the corresponding fields are equal, false if there is
	 *         some field that differs.
	 */
	@Override
	public boolean equals(Object course) {
		Course otherCourse = (Course) course;
		return this.name == otherCourse.name && this.department == otherCourse.department
				&& this.code == otherCourse.code && this.section == otherCourse.section
				&& this.instructor == otherCourse.instructor;
	}

	/**
	 * Returns a string representation of a course table entry.
	 * 
	 * @param position The position (preference) of the course.
	 * 
	 * @return The table entry string representation of the course.
	 */
	public String toString(int position) {
		return String.format("%-10s%-30s%-15s%-10s0%-9s%-15s\n", position, name, department, code, section, instructor);
	}

	/**
	 * Returns a short string representation of a course.
	 * 
	 * @return A short string representation of the course.
	 */
	public String toShortString() {
		return getDepartment() + " " + getCode() + "." + getSection();
	}

}
