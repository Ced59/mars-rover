package fr.valarep.mars.interfaces;

import fr.valarep.mars.Instruction;

public interface IVehicule {
    void playInstruction(Instruction instruc);
    void changeDirection(Instruction instruc);
    void move(Instruction instruc);

    int getX();
    int getY();

    String getName();
}
