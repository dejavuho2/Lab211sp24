package model;

import java.time.LocalDate;

public class Internship extends Candidate {
    private String major,semester,university;
    private static int count=1000;

    public Internship(String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.setId("I"+String.valueOf(++count));
    }
    
    public Internship(String major, String semester, String university, String fName, String lName, String address, String phone, String email, int type, LocalDate bDate) {
        super(fName, lName, address, phone, email, type, bDate);
        this.major = major;
        this.semester = semester;
        this.university = university;
        this.setId("I"+String.valueOf(++count));
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-5s | %-5s | %-10s | %-10s | %-10s | %-5d", this.getfName(), this.getlName(), this.getbDate(), this.getAddress(), this.getId(), this.getEmail(),this.getType());
    }
}
