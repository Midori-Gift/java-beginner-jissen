package practice;

import java.util.Comparator;

//入力したコード ～ここから

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Book))
			return false;
		Book r = (Book) o;
		if (!this.bookNo.trim().equals(r.bookNo.trim()))
//		if (publishDate.equals(r.publishDate))　が正しい
		{
			return false;
		}
		return true;
	}

	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}

	public int compareTo(Book obj) {
		if(this.publishDate < obj.publishDate) {
			return -1;
		}
		if(this.publishDate > obj.publishDate) {
			return 1;
		}
		else return 0;
	}

//	public int compareTo(Book o) {
//		return this.publishDate.compareTo(o.publishDate);
//	}  が正しい

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = this.publishDate;
		result.comment = this.comment;
		return result;
	}

//	～ここまで


//	練習問題②回答
	public class TitleComparator implements Comparator<Book> {
		public int compare(Book x, Book y) {
			return(x.title - y.title);
		}
	}
	
	
	

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishData() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
