package fr.valarep.mars.classes;

import fr.valarep.mars.Instruction;
import fr.valarep.mars.interfaces.IVehicule;

public class Play {

    private IVehicule vehicule;
    private String[] instructions;

    public Play(IVehicule vehicule, String[] instructions){
        this.vehicule = vehicule;
        this.instructions = instructions;
    }


    public void execute(){

        int index = 1;

        if (instructions.length > 0) {
            for (String instruction : instructions) {

                try {
                    Instruction instruc = Instruction.valueOf(instruction);
                    vehicule.playInstruction(instruc);
                    index++;

                } catch (IllegalArgumentException e) {
                    System.out.println("L'instruction n° " + index + " n'est pas valide. Elle sera ignorée!");
                    index++;
                }
            }
        }
    }

    public void display(){
        System.out.println("Le véhicule "+ vehicule.getName() +" est arrivé en position : (" + vehicule.getX() + " ; " + vehicule.getY() + ")");
    }

    public IVehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(IVehicule vehicule) {
        this.vehicule = vehicule;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }
}
