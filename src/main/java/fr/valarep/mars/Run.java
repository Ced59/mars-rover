package fr.valarep.mars;

import fr.valarep.mars.classes.Moto;
import fr.valarep.mars.classes.Play;
import fr.valarep.mars.classes.Rover;

public class Run {
    public static void main(String[] args) {


        String[] instructions = new String[] {"F", "F", "R", "F", "F", "B", "B", "B", "B", "B", "L"};

        Rover rover = new Rover(0,0,1, "Rover 1");

        Play playRover = new Play(rover, instructions);
        playRover.execute();
        playRover.display();

        Moto moto = new Moto(0,0,1,"Moto 1");

        Play playMoto = new Play(moto, instructions);
        playMoto.execute();
        playMoto.display();



    }
}
