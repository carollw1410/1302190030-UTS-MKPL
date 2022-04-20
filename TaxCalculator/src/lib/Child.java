package lib;

public class Child extends Employee {
    private List<String> childNames;
	private List<String> childIdNumbers;

    public Child(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined,
            int monthJoined, int dayJoined, boolean isForeigner, boolean gender, List<String> childNames,
            List<String> childIdNumbers) {
        super(employeeId, firstName, lastName, idNumber, address, yearJoined, monthJoined, dayJoined, isForeigner,
                gender);
        this.childNames = childNames;
        this.childIdNumbers = childIdNumbers;
    }
}