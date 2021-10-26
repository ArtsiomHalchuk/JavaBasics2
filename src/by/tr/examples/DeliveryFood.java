package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryFood {
public String operatorName;
public String restoranteName;
public List<Order> orders = new ArrayList<Order>();
}

public class Order{
	public Date dateOfOrder;
	public String clientName;
	public String clientAddress;
	public String cilentPhone;
	public String timeOfDelivery;
	public boolean isPaid;
	public String paymnetType;
	public List<Dishes> orderlines = new ArrayList<Dishes>();
	public List<DeliveryBoy> deliveryBoys = new ArrayList<DeliveryBoy>();
	
}

public class Dishes{
	private String name;
	private double price;
	private int quontity;
	private double weight;
}

public class DeliveryBoy{
	private String personName;
	private String carType;
	private String carID;
	
}
