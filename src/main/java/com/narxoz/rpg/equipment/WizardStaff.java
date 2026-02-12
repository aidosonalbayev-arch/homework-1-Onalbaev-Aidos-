package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String weaponType;

    public WizardStaff() {
        this.damage = 30;
        this.weaponType = "Staff";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - A mystical staff imbued with arcane power";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }
    
}
