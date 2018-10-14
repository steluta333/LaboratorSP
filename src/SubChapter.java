import javafx.scene.control.Tab;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    ArrayList<Image> images=new ArrayList<>();
    ArrayList<Table> tables= new ArrayList<>();
    ArrayList<Paragraph> paragraphs=new ArrayList<>();
    SubChapter(String n){
        name=n;
    }
    public void print(){
        System.out.println("Imagini");
        System.out.println();
        for (Image i :images){
            i.print();

        }
        System.out.println("Tables");
        System.out.println();
        for (Table i :tables){
            i.print();

        }

        System.out.println("Paragraphs");
        System.out.println();
        for (Paragraph i :paragraphs){
            i.print();

        }
    }
    public void CreateNewParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);

    }

    public void CreateImage(Image image){
        images.add(image);
    }
    public void CreateTable(Table table){
        tables.add(table);
    }



}
