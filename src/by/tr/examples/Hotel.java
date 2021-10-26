package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
private String hotelName;
private String hostesName;
private List <Guest> guests = new ArrayList<Guest>();
private List <Room> rooms = new ArrayList<Room>();
}

public class Guest{
	private String guestName;
	private Date dateOfBirth;
	private int idNumber;
	private boolean isSmoking;
	private boolean paymentReceived;

}

public class Room{
	private int roomNumber;
	private boolean isOccupied;
	private Date dateOfOccupation;
	private Date nextCleaningDate;
	private Date releaseDate;
	private int guestLimit;
	private String roomDescription;
	private boolean smokeFree;
	private boolean windowExist;
}