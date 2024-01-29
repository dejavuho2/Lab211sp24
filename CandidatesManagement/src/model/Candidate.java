
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

public class Candidate {
    private String id,fName,lName,address,phone,email;
    private int type;
    private LocalDate bDate;

    public Candidate() {
    }

    public Candidate(String fName, String lName, String address, String phone, String email, String bDate) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.bDate = LocalDate.parse(bDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public Candidate(String fName, String lName, String address, String phone, String email, int type, LocalDate bDate) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.bDate = bDate;
    }    
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbDate() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(bDate);
    }

    public void setbDate(LocalDate bDate) {
        this.bDate = bDate;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
    
}
