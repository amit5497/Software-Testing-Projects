package learning_java.lab012_AbstractInterface;

abstract class Car {
   public String buttonName="";

//   Car(String buttonName){
//      this.buttonName = buttonName;
//   }
   public abstract void musicPlayer();
   abstract String start();
   public void stop(){
      System.out.println("Power off the Tata car");
   }

}

