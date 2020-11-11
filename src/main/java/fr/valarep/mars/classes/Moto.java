package fr.valarep.mars.classes;

import fr.valarep.mars.Instruction;
import fr.valarep.mars.interfaces.IVehicule;

public class Moto implements IVehicule {

    private int x;
    private int y;
    private int direction;
    private String name;

    public Moto(int x, int y, int direction, String name) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.name = name;
    }
    public void playInstruction(Instruction instruc){

        if (instruc == Instruction.L || instruc == Instruction.R){
            changeDirection(instruc);
        }else{
            move(instruc);
        }
    }


    public void changeDirection(Instruction instruc){
        switch (instruc) {
            case L:
                direction--;
                if (direction == 0){
                    direction = 4;
                }
                break;
            case R:
                direction++;
                if (direction == 5){
                    direction = 1;
                }
                break;
        }

    }

    public void move(Instruction instruc) {
        if (direction == 1){
            switch (instruc){
                case B:
                    y-=2;
                    break;
                case F:
                    y+=2;
                    break;
            }
        }
        else if (direction == 2){
            switch (instruc){
                case B:
                    x-=2;
                    break;
                case F:
                    x+=2;
                    break;
            }
        }
        else if (direction == 3){
            switch (instruc){
                case B:
                    y+=2;
                    break;
                case F:
                    y-=2;
                    break;
            }
        }
        else {
            switch (instruc){
                case B:
                    x+=2;
                    break;
                case F:
                    x-=2;
                    break;
            }
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
