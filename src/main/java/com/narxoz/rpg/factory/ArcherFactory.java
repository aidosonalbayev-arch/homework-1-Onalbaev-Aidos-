package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public class ArcherFactory extends CharacterFactory {

    @Override
    protected Character createCharacter(String name) {
        return new com.narxoz.rpg.character.Archer(name);
    }
    
}
