package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Courses {
	private String schoolName;
	private List <Visitor> visitors = new ArrayList<Visitor>();

}
public class Visitor{
	private String visitorName;
	private Date dateOfBirth;
	private int visitorID;
	private List <Training> attendedTrainings = new ArrayList<Training>();
	
}
public class Training{
	private String trainerName;
	private String language;
	private String level;
	private int successPercent;
}