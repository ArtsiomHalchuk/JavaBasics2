package by.tr.examples;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HabitsTracker{

	private String habit;
	private String monthName;
	private List<DayOfMonth> calendar = new ArrayList<DayOfMonth>();
	
}

public class DayOfMonth {
	public int indexNumber;
	public Date date;
	public String dayOfWeek;
	private boolean isHabitDone;
}