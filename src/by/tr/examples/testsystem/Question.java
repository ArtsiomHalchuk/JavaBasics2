package by.tr.examples.testsystem;

import java.util.ArrayList;
import java.util.List;

public class Question{
	private int questionNumber;
	private String questionDescription;
	private String questionType;
	private int questionValue;
	private List<Option> options = new ArrayList<Option>();
}