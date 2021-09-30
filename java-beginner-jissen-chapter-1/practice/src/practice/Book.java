package practice;

import java.util.*;

public class Book implements Comparable<Book> {
  private String title;
  private Date publishDate;
  private String comment;

//   その1
  public int hashCode() {
      return Object.hash(this.title, this.publishDate);
  }
// その2
  public int CompareTo(Book obj){
      if(this.publishDate < obj.publishDate) {
          return -1;
      }
      if(this.publishDate > obj.publishDate) {
          return 1;
      }
      return 0;
    }
// その3
  public Book clone {
      Book result = new Book();
      result.title = this.title;
      result.comment = this.comment
      return result;
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

