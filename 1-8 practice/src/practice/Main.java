package practice;

public class Main {
    public static void Main(String[] args) {
        System.out.println(b1);
    }
    Book b1 = new Book();
    Book b2 = new Book();
    Book b3 = new Book();
    
    b1.settitle(java入門) ;
    b2.settitle(Python入門);
    b3.settitle(C言語入門) ;
    
    b2.setpublishDate(2018);
    b3.setpublishDate(2019);
    b1.setpublishDate(2011);
    
    b1.setcomment(スッキリ);System.out.println(b1);
    b2.setcomment(カレーがたべ);
    b3.setcomment(ポインタ);
    
    System.println(b1);
    System.println(b2);
    System.println(b3);
    
    Collections.sort(Book, new TitleComparatar());
}

// 自分の回答

・良かった点

 セッターは使えてた
.sortで並べようとしている
 
・悪かった点

配列の用意をしていない
例外のスローができていない
