package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String armorType;

    public EnchantedRobes() {
        this.defense = 20;
        this.armorType = "Robes";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Lightweight robes infused with magical protection";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
    }
    
}
