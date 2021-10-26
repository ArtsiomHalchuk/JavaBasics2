package by.tr.examples;

import java.util.ArrayList;
import java.util.List;

public class Tests {
private String testSystemName;
private List<User> users = new ArrayList<User>();
}
public class User{
	private String userName;
	private String userRaiting;
	private List<Subject>assignedSubjects = new ArrayList<Subject>();
	
}
public class Subject{
	private String subjectName;
	private String subjectDescription;
	private List <Questionire> testsAvailable = new ArrayList<Questionire>();
}
public class Questionire{
	private String questionireName;
	private int questionireLevel;
	private boolean isPassed;
	private int score;
	private List<Question> questionList = new ArrayList<Question>();
	}
public class Question{
	private int questionNumber;
	private String questionDescription;
	private String questionType;
	private int questionValue;
	private List<Option> options = new ArrayList<Option>();
}
public class Option{
	private String description;
	private boolean isRight;
	private boolean isChosen;
}