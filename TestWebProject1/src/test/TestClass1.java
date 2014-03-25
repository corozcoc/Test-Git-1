package test;

public class TestClass1 {

  public static void main(String[] args) {
  	System.out.println("Starting...");
  	
    for(String token : args) {
      System.out.println("-> " + token);
    }
    
    System.out.println("Finished successfully :)");
  }
}
