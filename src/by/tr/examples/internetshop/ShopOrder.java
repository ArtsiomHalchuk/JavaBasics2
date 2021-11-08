package by.tr.examples.internetshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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