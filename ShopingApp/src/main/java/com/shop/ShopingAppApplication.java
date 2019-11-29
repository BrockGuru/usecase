package com.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shop.model.entity.Customer;
import com.shop.model.entity.MyOrder;
import com.shop.model.entity.Product;
import com.shop.model.entity.Store;
import com.shop.model.repository.CustomerRepository;
import com.shop.model.repository.MyOrderRepository;
import com.shop.model.repository.ProductRepository;
import com.shop.model.repository.StoreRepository;

@SpringBootApplication
public class ShopingAppApplication implements CommandLineRunner{
/*	@Autowired
	private CustomerRepository customerrepository;
	@Autowired
	private MyOrderRepository myOrderRespository;*/
	@Autowired
	private ProductRepository productRepository ;
	@Autowired
	private StoreRepository StoreRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Customer customer1=new Customer("guru","madurai","6696796","guru@gmail.com");
		Customer customer2=new Customer("guptha","Btm","6696796","guru1@gmail.com");
		Customer customer3=new Customer("karthi","EC&BTM","6696796","guru1@gmail.com");
		
		Myorder myorder1=new Myorder("nokia1100",12344);
		Myorder myorder2=new Myorder("nokiaXpressMusic", 77777);
		Myorder myorder3=new Myorder("nokialumia", 100021);
		customer1.addOrders(myorder1);
		customer2.addOrders(myorder2);
		customer3.addOrders(myorder3);
		customerrepository.save(customer1);
		customerrepository.save(customer2);
		customerrepository.save(customer3);*/
		
	
		
	
		Product product1=new Product("nokia1100", 12344);
		Product product2=new Product("nokiaXpressMusic", 77777);
		Product product3=new Product("nokialumia", 100021);
		Store store1=new Store("poorvika", "878556765", "poorvika@gmail.com",4.5, 4L);
		Store store2=new Store("chennai-mobile", "87855673", "chennai@gmail.com",5.5, 4L);
		Store store3=new Store("oppo", "8785565", "oppo@gmail.com",4.5, 4L);
		
		store1.addProductDetail(product1);
		store2.addProductDetail(product2);
		store3.addProductDetail(product3);
		StoreRepository.save(store1);
		StoreRepository.save(store2);
		StoreRepository.save(store3);
		
		
		
}

}
