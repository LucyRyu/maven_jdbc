package kr.re.kitri.model;


import java.util.Date;

public class JoinData {
    private Integer orderNum ;
    private Integer custId;
    private String userName;
    private String address;
    private Date orderDate;
    private String prodName;

    public JoinData() {
    }

    public JoinData(Integer orderNum, Integer custId, String userName, String address, Date orderDate, String prodName) {
        this.orderNum = orderNum;
        this.custId = custId;
        this.userName = userName;
        this.address = address;
        this.orderDate = orderDate;
        this.prodName = prodName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }


    @Override
    public String toString() {
        return "JoinData{" +
                "orderNum=" + orderNum +
                ", custId=" + custId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", orderDate=" + orderDate +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
