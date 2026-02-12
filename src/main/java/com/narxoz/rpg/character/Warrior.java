package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?


    public Warrior(String name) {
        this.name = name;
        // Warrior stats: high health and strength, low mana and intelligence
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    // TODO: Implement methods from Character interface
    // You need to define those methods in Character interface first!

    // Example method structure:
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equips " + weapon.getWeaponInfo() + "!");
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equips " + armor.getArmorInfo() + "!");
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

    // TODO: Add equipment-related methods
    // Examples:
    // - void equipWeapon(Weapon weapon)
    // - void equipArmor(Armor armor)
    // - void displayEquipment()

}
