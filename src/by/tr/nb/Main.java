package by.tr.nb;

import java.util.Date;

public class Main {
	
		public static void main(String[] args) {

			NoteBook nb = new NoteBook();
			Note n1 = new Note("note1");
			Note n2 = new Note("note2", new Date());
			
			
//			n1.setNote("noteNew");

			nb.addNote(n1);
			nb.addNote(n2);
			nb.deleteNote(n1);
			nb.getNotes();
			nb.printNotes();
			
			
		}

}
