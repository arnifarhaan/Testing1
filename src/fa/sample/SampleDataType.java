package fa.sample;

public class SampleDataType {

	private void branch1() {
		System.out.println("This code was written by branch1");

	}

	public static void main(String[] args) {
		System.out.println("My Bio Data");
		System.out.println("-----------");

		String fullName = "Saifuddin";
		System.out.println("1. Name: " + fullName);

		byte age = 25;
		System.out.println("2. Age: " + age);

		char gender = 'M';
		System.out.println("3. Gender: " + gender);

		float height = 175.14f;
		System.out.println("4. Height: " + height);

		float weight = 80.45f;
		System.out.println("5. Weight: " + weight);

		boolean isMarried = true;
		System.out.println("6. Marital Status: " + isMarried);

		long mobNumber = 9876543210l;
		System.out.println("7. Contact Number: " + mobNumber);

		String email = "saifuddin@gmail.com";
		System.out.println("8. Email: " + email);

		String address = "#101, Mosque Street, Periamet, Chennai - 600001";
		System.out.println("9. Address: " + address);

		short gyear = 2022;
		System.out.println("10. Graduation Year: " + gyear);

		float cgpa = 8.98f;
		System.out.println("11. CGPA: " + cgpa);

		char isEmployed = 'Y';
		System.out.println("12. Employed: " + isEmployed);

		String jobTitle = "Project Manager";
		System.out.println("13. Job Title: " + jobTitle);

		String bloodGroup = "O+ve";
		System.out.println("14. Blood Group: " + bloodGroup);

		char siblings = 'N';
		System.out.println("15. Siblings: " + siblings);

		float yOE = 5.6f;
		System.out.println("16. Years Of Experience: " + yOE);

		int empId = 120209;
		System.out.println("17. Employee Id: " + empId);

		double annualSalary = 101099912.34;
		System.out.println("18. Annual Salary: \u20B9" + annualSalary);

		char hasPassport = 'Y';
		System.out.println("19. Has Passport: " + hasPassport);

		String nationality = "Indian";
		System.out.println("20. Nationality: " + nationality);

	}

}
