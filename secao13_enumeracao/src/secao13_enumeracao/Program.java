package secao13_enumeracao;

import java.util.Date;

import secao13_enumeracao.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order o = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(o);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
