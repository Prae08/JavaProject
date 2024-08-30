public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + "can fly");
        
    }

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println(name + "can sing");
    }

    
}
