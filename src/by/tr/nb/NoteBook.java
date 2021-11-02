package by.tr.nb;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	
	private List<Note> notes;
	
	public NoteBook() {
		notes = new ArrayList<Note>();
	}
	public void addNote(Note obj) {
		notes.add(obj);
	};
	
	public void deleteNote(Note obj) {
		notes.remove(obj);
	}

	public void printNotes() {
		for (Note note: notes) {
			System.out.printf("|%-10s|%-10s|\n", "Note", "Date");
			System.out.printf("|%-10s|%-10s|\n", note.getNote(), note.getDate());
		}
	}
	
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}
	
}
