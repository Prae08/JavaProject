public class Fish extends Animal{
    public Fish(String name){
        super(name);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + "swims");
        
    }

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println(name + "cannot make sound");
    }

    
}
