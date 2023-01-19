public enum WeaponType {
    FIRE_GUN(""),
    LASER_GUN(""),
    KNIFE("");

    private String weaponType;

    WeaponType(String weaponType){
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }
}