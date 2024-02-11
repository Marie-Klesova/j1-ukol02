package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliCtverecek(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i<4; i++){
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }


    public void nakresliObdelnik(int delkaA, int delkaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i<2; i++){
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
        }
    }


    public void nakresliRovnostrannyTrojuhelnik(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i<3; i++){
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }


    public void nakresliRovnoRamennyTrojuhelnik(int delkaC, int delkaD, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(delkaD);
        zofka.turnLeft(130);
        for (int i = 0; i<2; i++){
            zofka.move(delkaC);
            zofka.turnLeft(100);

        }
    }

    public void nakresliKolecko(int prumer, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i<360; i++){
            zofka.move(1.5 * Math.PI * prumer/360);
            zofka.turnRight(1);
        }
    }




    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.


        nakresliCtverecek(100, Color.blue);
        nakresliCtverecek(200, Color.red);
        nakresliCtverecek(300, Color.darkGray);



        nakresliObdelnik(100, 50, Color.red);


       nakresliRovnostrannyTrojuhelnik(100, Color.blue);


        nakresliObdelnik(100, 50, Color.red);


        nakresliKolecko(80, Color.GREEN);

        nakresliRovnoRamennyTrojuhelnik(100, 100, Color.cyan);


    }

}
