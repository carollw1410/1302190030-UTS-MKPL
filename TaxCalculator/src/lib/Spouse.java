package lib;

public class Spouse extends Employee {
    private String spouseName;
	private String spouseIdNumber;
    public Spouse(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined,
            int monthJoined, int dayJoined, boolean isForeigner, boolean gender, String spouseName,
            String spouseIdNumber) {
        super(employeeId, firstName, lastName, idNumber, address, yearJoined, monthJoined, dayJoined, isForeigner,
                gender);
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }
}