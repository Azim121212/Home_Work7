public class Skeleton extends Boss{
    int numberOfArrows;

    public Skeleton(int damage, int health, Weapon weapon, int numberOfArrows){
        super(damage, health, weapon);
        this.numberOfArrows = numberOfArrows;
    }
    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String info(){
        return super.info() +
                "\nNumber of arrows: "
                + this.numberOfArrows;
    }
}