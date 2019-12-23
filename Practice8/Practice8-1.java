class Main {
  public static void main(String[] args) {

    Cat cat = new Cat();
    Dog dog = new Dog();

    cat.name = "たま";
    cat.age = 3;
    dog.name = " ごん";
    dog.age = 4;

    cat.ShowProfile();
    cat.Sleep();
    cat.Speak();
    dog.ShowProfile();
    dog.run();
    dog.Speak();
  } 

}