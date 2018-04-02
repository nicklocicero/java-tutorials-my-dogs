package edu.cnm.bootcamp.classes;

interface dogs {
  void setName(String name);
  void jumpsToLick();
  void settlesDown();
}

public class Dog implements dogs {
  int pawsOnGround = 4;
  boolean isLicking = false;
  String name = "";

  public void setName(String name) {
    this.name = name;
  }

  public void jumpsToLick() {
    if (isLicking == false) {
      pawsOnGround = 2;
      isLicking = true;
    } else {
      System.out.println(this.name + " licks even more!");
    }
  }

  public void settlesDown() {
    pawsOnGround = 4;
    isLicking = false;
  }

  void printStates() {
    if (pawsOnGround == 4) {
      System.out.println(this.name + " is on the ground and not licking anybody.");
    } else {
      System.out.println(this.name + " is jumping on someone and licking them!");
    }
  }
}

class BillyAndHoneyAndTiny extends Dog {
  public static void main(String[] args) {
    Dog Billy = new Dog();
    Dog Honey = new Dog();
    Dog Tiny = new Dog();
    Billy.setName("Billy");
    Honey.setName("Honey");
    Tiny.setName("Tiny");
    Tiny.jumpsToLick();
    Billy.jumpsToLick();
    Billy.jumpsToLick();
    Tiny.jumpsToLick();
    Honey.jumpsToLick();
    Honey.settlesDown();
    Billy.printStates();
    Tiny.printStates();
    Honey.printStates();
  }
}
