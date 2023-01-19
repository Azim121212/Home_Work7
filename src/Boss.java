public class Boss extends GameEntity{
     private Weapon weapon;

     public Boss(int damage, int life, Weapon weapon){
          super();
          this.setDamage(damage);
          this.setLife(life);
          this.weapon = weapon;
     }

     public Weapon getWeapon() {
          return weapon;
     }

     public void setWeapon(Weapon weapon) {
          this.weapon = weapon;
     }


     public String info(){
          return super.info() +
                  "\nWeapon type: " + this.weapon.getWeaponType() +
                  "\nWeapon name: " + this.weapon.getWeaponName();
     }
}