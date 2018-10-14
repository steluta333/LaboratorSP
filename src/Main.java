public class Main {

    public static void main(String[] args){
        Book iscoTitanic =new Book("titanic");
        Author whatever=new Author("Whatever");
        iscoTitanic.addAuthor(whatever);
        int indexChapterOne=iscoTitanic.CreateChapter("chapter 1");
        Chapter chp1= iscoTitanic.getChapter(indexChapterOne);
        int indexSubchapter =chp1.

    }
}
