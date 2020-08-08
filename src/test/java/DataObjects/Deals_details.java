package DataObjects;




import java.util.Collections;
import java.util.List;

public class Deals_details {


	private List<Deals_details> lectures;
	
	public Deals_details() {}

	public Deals_details(List<Deals_details> lectures) {
		this.lectures = lectures;
	}
	
	public List<Deals_details> getLectures() {
		return Collections.unmodifiableList(lectures);
	}
	
	public boolean addLecture(Deals_details lect) {
		return lectures.add(lect);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectures == null) ? 0 : lectures.hashCode());
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
		Deals_details other = (Deals_details) obj;
		if (lectures == null) {
			if (other.lectures != null)
				return false;
		} else if (!lectures.equals(other.lectures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lectures [lectures=" + lectures + "]";
	}
	
	
}
