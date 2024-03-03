/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangledemo;

class rectangles{
    int length;
   int width;
    void rectangl(int l,int w) {
     width= w;
     length=l;
        
    }
      public double calculateerea(){
    return (length*width);
}
     
    public double calculateperimeter(){
    return (length+width)*2;
}
      

}
public class RectangleDem {

  
    public static void main(String[] args) {
        rectangles r1=new rectangles();
        r1.rectangl(12, 8);
        System.out.println("Area:"+r1.calculateerea());
        System.out.println("Perimeter:"+r1.calculateperimeter());
    }
    
}
