package kr.re.kitri;

import kr.re.kitri.model.Customer;
import kr.re.kitri.model.Order;
import kr.re.kitri.service.OrderService;

import java.util.List;

public class OrderMain {
    public static void main( String[] args ) {

        //드라이버 로딩은 OrderService에서 생성자에서 수행하도록 선언함
        OrderService service = new OrderService();

        List<Customer> Customerlist = service.getCustomerList();
        List<Order> Orderlist = service.getOrderList();

        for(Customer e : Customerlist){
            System.out.println(e);
        }

        for(Order e : Orderlist){
            System.out.println(e);
        }


    }

}
