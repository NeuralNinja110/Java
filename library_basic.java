import java.util.*;
class book{
  String title;
  String author;
  int isbn;
  book(){
  Scanner s = new Scanner(System.in);
  System.out.println("\nEnter Title: ");
  title = s.next();
  System.out.println("Enter Author name: ");
  author = s.next();
  System.out.println("Enter ISBN: ");
  isbn = s.nextInt();
  }
  void info(){
  System.out.println("\nTitle: "+title);
  System.out.println("Author: "+author);
  System.out.println("ISBN: "+isbn+"\n");
}}
class Main {
  static public void main(String args[]){ 
  Scanner s = new Scanner(System.in);'
  System.out.println("Enter the number of books: ");
  int n = s.nextInt();
  book[] b = new book[n];
  for(int j = 0;j<n;j++){
    b[j] = new book();
  }
  for(int i = 0;i<n;i++){
    System.out.println("INFORMATIONS ABOUT THE BOOKS DETAILS ENTERED");
    b[i].info();
  }
    
}}
