package items;

public class Treasure extends Item {

    private int value;

    public Treasure (String name, int value){
        super(name);
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
