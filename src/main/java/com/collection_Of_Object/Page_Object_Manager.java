package com.collection_Of_Object;

import org.openqa.selenium.WebDriver;

import com.Pom_CollectionOfElements.Address_Page;
import com.Pom_CollectionOfElements.Bank_Page;
import com.Pom_CollectionOfElements.Confirm_Page;
import com.Pom_CollectionOfElements.History_Page;
import com.Pom_CollectionOfElements.Home_Page;
import com.Pom_CollectionOfElements.Index_Page;
import com.Pom_CollectionOfElements.Order_Page;
import com.Pom_CollectionOfElements.Popup_Page;
import com.Pom_CollectionOfElements.Product_Page;
import com.Pom_CollectionOfElements.Result_Page;
import com.Pom_CollectionOfElements.Shipping_Page;
import com.Pom_CollectionOfElements.Signin_Page;
import com.Pom_CollectionOfElements.Women_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;

	private Home_Page hp;
	private Signin_Page sp;
	private Index_Page ip;
	private Women_Page wp;
	private Product_Page pp;
	private Popup_Page pop;
	private Order_Page op;
	private Address_Page ap;
	private Shipping_Page ship;
	private Bank_Page bp; 
	private Confirm_Page cp;
	private Result_Page rp;
	private History_Page hisp;
	
	
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;

	}
	public Home_Page get_Instance_Hp() {
		
		if (hp==null) {
			
			hp = new Home_Page(driver);
		}
		
		return hp;
	}
	public Signin_Page get_Instance_Sp() {
		
		if (sp==null) {
			
			sp = new Signin_Page(driver);
		}
		
		return sp;
	}
	public Index_Page get_Instance_Ip() {
		
		if (ip==null) {
			
			ip = new Index_Page(driver);
		}
		return ip;
	}
	public Women_Page get_Instance_Wp() {
		
		if (wp==null) {
			wp = new Women_Page(driver);
		}
		return wp;
	}
	public Product_Page get_Instance_Pp() {
		
		if (pp==null) {
			pp = new Product_Page(driver);
		}
		return pp;
	}
	public Popup_Page get_Instance_Pop() {
		
		if (pop==null) {
			pop = new Popup_Page(driver);
		}
		return pop;
	}
	public Order_Page get_Instance_Op() {
		
		if (op==null) {
			op = new Order_Page(driver);
		}
		return op;
	}
	public Address_Page get_Instance_Ap() {
		
		if (ap==null) {
			ap = new Address_Page(driver);
		}
		return ap;
	}
	public Shipping_Page get_Instance_Ship() {
		
		if (ship==null) {
			ship = new Shipping_Page(driver);
		}
		return ship;
	}
	public Bank_Page get_Instance_Bp() {
		
		if (bp==null) {
			bp = new Bank_Page(driver);
		}
		return bp;
	}
	public Confirm_Page get_Instance_Cp() {
		
		if (cp==null) {
			cp = new Confirm_Page(driver);
		}
		return cp;
	}
	public Result_Page get_Instance_Rp() {
		
		if (rp==null) {
			rp = new Result_Page(driver);
		}
		return rp;
	}
	public History_Page get_Instance_Hisp() {
		
		if (hisp==null) {
			hisp = new History_Page(driver);
		}
		return hisp;
	}
	
	
	
}
