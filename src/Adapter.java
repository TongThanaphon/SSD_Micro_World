public class Adapter implements IUnit{

    private LegacyUnit le = new LegacyUnit();
    private String name;

    public Adapter(String name){
        this.name = name;
    }

    @Override
    public void move() {
        le.walk();
    }

    @Override
    public int getX() {
        return le.getPositionX();
    }

    @Override
    public int getY() {
        return le.getPositionY();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return 99;
    }

    @Override
    public boolean dead() {
        return false;
    }
}
