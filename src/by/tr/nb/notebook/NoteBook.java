package by.tr.nb.notebook;

import java.util.ArrayList;
import java.util.Date;
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

	public void addNote(String noteContent) {
		notes.add(new Note(noteContent));
	}
	public int size() {
		return notes.size();
	}
	
	public List<Note> find(String noteText){
		List<Note> result = new ArrayList<Note>();
		for (Note note: notes) {
			if (note.getNote().equals(noteText)) {
				result.add(note);
			}
		}
		return result;
	}
	
	public List<Note> find(Date date){
		List<Note> result = new ArrayList<Note>();
		for (Note note: notes) {
			if (note.getDate().equals(date)) {
				result.add(note);
			}
		}
		return result;
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
