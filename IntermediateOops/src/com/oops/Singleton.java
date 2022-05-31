package com.oops;


class Ton{
	  static Ton obj = new Ton();
	  private Ton(){
		  
	  }
	  public static Ton getInstance() {
		  return obj;
	  }
}
public class Singleton {

	public static void main(String[] args) {
		
		Ton obj1= Ton.getInstance();
		System.out.println(obj1);
		}

}
