package by.tr.examples.deliveryfood;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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