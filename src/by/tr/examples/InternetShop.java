package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InternetShop {
private String shopName;
private String shopID;
private String contactNumber;
private List<ShopOrder> orders = new ArrayList<ShopOrder>();
}
public class ShopOrder{
	public Date dateOfOrder;
	public String clientName;
	public String clientAddress;
	public String cilentPhone;
	public String timeOfDelivery;
	public boolean isPaid;
	public String paymnetType;
	public String shipmentType;
	public List<Goods> orderlines = new ArrayList<Goods>();
	public List<ShopDeliveryBoy> deliveryBoys = new ArrayList<ShopDeliveryBoy>();
	
}

public class Goods{
	private String name;
	private double price;
	private int quontity;
	private String goodDescription;
}

public class ShopDeliveryBoy{
	private String personName;
	private String carType;
	private String carID;
	
}