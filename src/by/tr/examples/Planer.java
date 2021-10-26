package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Planer {
	private String ownerName;
	private String description;
	private List<Target>plans = new ArrayList<Target>();
}

public class Target{
	private String targetName;
	private Date deadlineForTarget;
	private Date startOfExecution;
	private String targetDetails;
	private boolean isDone;
}