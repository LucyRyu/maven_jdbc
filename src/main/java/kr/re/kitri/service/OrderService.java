package kr.re.kitri.service;

import com.sun.org.apache.xpath.internal.operations.Or;
import kr.re.kitri.model.Customer;
import kr.re.kitri.model.Order;
import kr.re.kitri.util.OrderConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static kr.re.kitri.util.OrderConstants.DB_URL;
import static kr.re.kitri.util.OrderConstants.PASSWORD;
import static kr.re.kitri.util.OrderConstants.USERNAME;

public class OrderService {

    //Driver loading
    public OrderService(){
        try {
            Class.forName(OrderConstants.DRIVER_POSTGRES);
            System.out.println("dirver ok...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> getCustomerList() {
        String sqlSelectCustomer = "select * from customer;";
        List<Customer> customerList = new ArrayList<>();

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("connetion ok...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {

            PreparedStatement prpsnt2 = conn.prepareStatement(sqlSelectCustomer);
            prpsnt2.executeQuery();

            ResultSet rs2 = prpsnt2.executeQuery();

            while(rs2.next()){
                Customer customer = new Customer(rs2.getInt(1),rs2.getString(2),
                        rs2.getString(3),rs2.getString(4));

                customerList.add(customer);
            }

            System.out.println("select ok...");
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("select failed...");
        }

        return customerList;
    }


    public List<Order> getOrderList(){

        String sqlSelectOrder = "select * from orders;";
        List<Order> orderList = new ArrayList<>();

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            System.out.println("connetion ok...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            PreparedStatement prpsnt1 = conn.prepareStatement(sqlSelectOrder);
            prpsnt1.executeQuery();
            ResultSet rs1 = prpsnt1.executeQuery();

            while(rs1.next()){
                Order order = new Order(rs1.getInt(1),rs1.getDate(2),
                        rs1.getInt(3),rs1.getString(4));

                orderList.add(order);
            }
            System.out.println("select ok...");
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("select failed...");
        }

     return orderList;
    }

}
