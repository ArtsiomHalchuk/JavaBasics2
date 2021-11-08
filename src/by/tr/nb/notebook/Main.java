package by.tr.nb.notebook;

import java.util.Date;
import java.util.List;

public class Main {
	
		public static void main(String[] args) {

			NoteBookProvider provider = NoteBookProvider.getInstance();
			
			NoteBook nb = provider.getNoteBook(0);
			
			nb.addNote("note1");
			nb.addNote("note2");
			
			System.out.println(nb.size());
			
			int newIndex =provider.createNewNoteBook();
			nb = provider.getNoteBook(newIndex);
			
			System.out.println(nb.size());
			
			
			nb=provider.getNoteBook(0);
			nb.find("note1");
			print(nb.find("note1"));
			print(nb.find(new Date()));
		
			
			
		
		}
		
		public static void print(List<Note> notes) {
			System.out.printf("|%-10s|%-10s|\n", "Note", "Date");
			for (Note note : notes) {
				System.out.printf("|%-10s|%-10s|\n", note.getNote(), note.getDate());
			}
			
		}
}
