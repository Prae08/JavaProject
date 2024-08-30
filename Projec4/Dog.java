public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + "runs");
    }

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println(name + "barks");
    }

    
}   
