package kr.re.kitri.model;

import java.sql.Date;

public class Customer {
    private Integer custId;
    private String userName;
    private String address;
    private String email;

    public Customer(int anInt, Date date, int rs2Int, String string) {
    }

    public Customer(Integer custId, String userName, String address, String email) {
        this.custId = custId;
        this.userName = userName;
        this.address = address;
        this.email = email;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}