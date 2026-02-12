package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 50;
        this.strength = 60;
        this.intelligence = 40;
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
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses MULTI-SHOT! Attacks multiple enemies at once!");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void displayEquipment() {
        System.out.println("--- Equipped ---");
        if(weapon != null) weapon.displayInfo();
        if(armor != null) armor.displayInfo();
    }

    @Override
    public int getTotalAttack() {
        return strength + (weapon != null ? weapon.getDamage() : 0);
    }

    @Override
    public int getTotalDefense() {
        return armor != null ? armor.getDefense() : 0;
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getTotalAttack() - enemy.getTotalDefense();
        if (damage < 0) damage = 0;

        System.out.println(name + " attacks " + enemy.getName() + " for " + damage + " damage!");
    }
    
}
