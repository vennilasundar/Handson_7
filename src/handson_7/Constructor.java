/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson_7;

/**
 *
 * @author user
 */
public class Constructor {
   int a;
   public Constructor(int x)
	{
		this.a=x;
		
	}
	public Constructor(float y)
	{
		this.a= (int)y;
	}
        public Constructor(){
        }
        
   void display(){
		System.out.println("the number is: "+ a);


}
      public static void main(String[] args) {
       Constructor one = new Constructor();
       Constructor two = new Constructor(8);
       Constructor three = new Constructor((float)5.6);
       one.display();
       two.display();
       three.display();
    }
    
}
