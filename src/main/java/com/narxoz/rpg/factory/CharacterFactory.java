package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;


public abstract class  CharacterFactory {
    public Character orderCharacter(String name) {
        Character character = createCharacter(name);
        System.out.println("Creating character: " + character.getName());
        return character;
    }

    protected abstract Character createCharacter(String name);
    
}
