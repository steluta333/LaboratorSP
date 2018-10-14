import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private int index;
    //private TableOfContents tableOfContents;
    private ArrayList<Author> authors=new ArrayList<>();
    private ArrayList<Chapter> Chapters= new ArrayList<>();
    Book(String bookTitle){
       title=bookTitle;
       index=0;
    }
    public void print(){
        System.out.println("Book "+ title);
        for (Chapter c: Chapters ){
            c.print();
        }
    }
    public void addAuthor(Author author){
        authors.add(author);
    }
    public int CreateChapter(String c){
        Chapter chapter =new Chapter(c);
        Chapters.add(chapter);
        index+=1;
        return index;
    }
    public Chapter getChapter(int ind){
        return Chapters.get(ind);

    }
}
