package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;
    
     public Mage(String name) {
        this.name = name;
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 80;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getMana() { return mana; }

    @Override
    public int getStrength() { return strength; }
    
    @Override
    public int getIntelligence() { return intelligence; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL! Deals massive magic damage!");
    }

    @Override
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override
    public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayEquipment() {
        System.out.println("--- Equipped ---");
        if(weapon != null) weapon.displayInfo();
        if(armor != null) armor.displayInfo();
    }
}
