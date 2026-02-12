package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    private int damage;
    private String weaponType;

    public Longbow() {
        this.damage = 25;
        this.weaponType = "Bow";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranged) - A powerful bow with long range and high accuracy";
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
