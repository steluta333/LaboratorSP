import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters= new ArrayList<>();
    Chapter(String n){
        name=n;
    }
    public void print (){
        for (SubChapter s:subChapters ){
            s.print();

        }
    }
    public int CreateSubChapter(String subchapt){
        SubChapter subChapter=new SubChapter(subchapt);
    }
}
