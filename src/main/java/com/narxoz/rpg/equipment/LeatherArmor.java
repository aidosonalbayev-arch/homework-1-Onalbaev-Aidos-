package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String armorType;

    public LeatherArmor() {
        this.defense = 15;
        this.armorType = "Leather";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Medieval) - Light armor made from toughened animal hides";
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
