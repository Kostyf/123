package sllam;
import java.lang.*;
public class booki {
    private String name;
    private int pages;
    public booki(String n, int a){
        name = n;
        pages = a;
    }
    public booki(String n){
        name = n;
        pages = 0;
    }
    public booki(){
        name = "Pup";
        pages = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.name+", radius "+this.pages;
    }
    public void Size(){
        System.out.println("The book "+name+" have size "+pages*2+" pages");
    }
}