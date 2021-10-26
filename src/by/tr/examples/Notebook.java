package by.tr.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook{

	private String name;
	private String coverPath;
	
	private List<Note> notes = new ArrayList<Note>();


}


public class Note{

	private Date createDate;
	private String text;
	private boolean actual;


}