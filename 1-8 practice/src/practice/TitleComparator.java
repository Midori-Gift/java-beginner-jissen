package practice;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
	public int compare(Book x, Book y) {
		return(x.title - y.title);
//		return  x.getTitle().compareTo(y.getComment()Title());　が正解
	}
}