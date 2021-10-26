package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitLog {
	private String target;
	private List<Visit> visits = new ArrayList<Visit>();
	private String securityOficerName;
}

private class Visit {
	private Date dateOfVisit;
	private String visitorName;
	private String timeOfEnter;
	private String timeOfExit;
	private String description;
	
}