package kr.re.kitri.model;

import java.util.Date;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class Order {

    private Integer orderNum ;
    private Date orderDate;
    private Integer custId;
    private String prodName;

    public Order(int anInt, String string, String rs1String, String prodName) {
    }

    public Order(Integer orderNum, Date orderDate, Integer custId, String prodName) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.custId = custId;
        this.prodName = prodName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderDate=" + orderDate +
                ", custId=" + custId +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
