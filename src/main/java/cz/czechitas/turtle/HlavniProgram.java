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


    public void nakresliRovnoRamennyTrojuhelnik_90(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        double delkaPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));
        // Math.pow() umocní první pamater na hodnotu druhého parametru. Math.sqrt() vypočítá druhou odmocninu.
        zofka.move(delkaPrepony);
        zofka.turnLeft(135);
        for (int i = 0; i<2; i++){
            zofka.move(delkaStrany);
            zofka.turnLeft(90);

        }
    }

    public void nakresliRovnoRamennyTrojuhelnik_strana(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);

        for (int i = 0; i<2; i++){
            zofka.move(delkaStrany);
            zofka.turnRight(90);
            }
        zofka.turnRight(45);
        double delkaPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));
        // Math.pow() umocní první pamater na hodnotu druhého parametru. Math.sqrt() vypočítá druhou odmocninu.
        zofka.move(delkaPrepony);

    }

/*
    public void nakresliTrojuhelnik(int delkaStranyA, int delkaStranyB, int uhelGama, Color barva) {
        zofka.setPenColor(barva);
        double delkaPreponyC = Math.sqrt(Math.pow(delkaStranyA, 2) + Math.pow(delkaStranyB, 2)
                - 2 * delkaStranyA * delkaStranyB * Math.cos(Math.toRadians(uhelGama)));
        // Math.pow() umocní první parametr na hodnotu druhého parametru.
        // Math.sqrt() vypočítá druhou odmocninu.
        // Math.cos()  kosinus úhlu z stupnu na radiány, protože metoda Math.cos() očekává úhel v radiánech.

        // výpočet úhlu Beta
        double uhelBeta = Math.toDegrees(Math.acos((Math.pow(delkaStranyA, 2) + Math.pow(delkaPreponyC, 2)
                 - Math.pow(delkaStranyB, 2)) / (2 * delkaStranyA * delkaPreponyC)));


        // výpočet úhlu Alfa
        double uhelAlfa = Math.toDegrees(Math.acos((Math.pow(delkaStranyB, 2) + Math.pow(delkaPreponyC, 2)
                 - Math.pow(delkaStranyA, 2)) / (2 * delkaStranyB * delkaPreponyC)));

        zofka.move(delkaPreponyC);
        zofka.turnLeft(uhelBeta);
        zofka.move(delkaStranyA);
        zofka.turnLeft(uhelGama);
        zofka.move(delkaStranyB);
        zofka.turnLeft(uhelAlfa);

        }
    }


*/

    public void nakresliKolecko(int prumer, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i<360; i++){
            zofka.move(1.5 * Math.PI * prumer/360);
            zofka.turnRight(1);
        }
    }


    public void nakresliKoleckoZ(int prumer){
        //double prumer = delkaPrepony;
        for (int i = 0; i < 360; i++) {
            zofka.move(1.5 * Math.PI * prumer / 360);
            zofka.turnLeft(1);
        }
    }


    public void nakresliZmrzlinu(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);

        double delkaPrepony = Math.sqrt(Math.pow(delkaStrany, 2) + Math.pow(delkaStrany, 2)
                - 2 * delkaStrany * delkaStrany * Math.cos(Math.toRadians(30)));
        // Math.pow() umocní první parametr na hodnotu druhého parametru. Math.sqrt() vypočítá druhou odmocninu.
        // Math.sqrt() vypočítá druhou odmocninu.
        // Math.cos()  kosinus úhlu z stupnu na radiány, protože metoda Math.cos() očekává úhel v radiánech.
        zofka.turnLeft(90);
        zofka.move(delkaPrepony);
        zofka.turnLeft(105);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(150);
        }
        zofka.turnRight(135);

    }







    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

/*
        nakresliCtverecek(100, Color.blue);
        nakresliCtverecek(200, Color.red);
        nakresliCtverecek(300, Color.darkGray);


        nakresliObdelnik(100, 50, Color.red);

        nakresliRovnostrannyTrojuhelnik(100, Color.blue);

        nakresliObdelnik(100, 50, Color.red);

        nakresliTrojuhelnik(100, 100, 30, Color.red);

        nakresliKolecko(80, Color.GREEN);

        nakresliRovnoRamennyTrojuhelnik_90(100, Color.cyan);



        //zmrzlina
        nakresliZmrzlinu(200, Color.BLACK);
        nakresliKoleckoZ(68);



        //snehulak

        //spodni koule
        nakresliKolecko(100, Color.blue);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(75);

        //prostřední koule
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(80, Color.blue);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(90);

        //levá ruka
        zofka.penDown();
        nakresliKoleckoZ(40);
        zofka.penUp();

        //pravá ruka
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(40, Color.blue);
        zofka.penUp();

        //hlava
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(60, Color.blue);
        zofka.turnRight(90);
        zofka.penUp();

   */

        //mašinka

        //kabina
        nakresliObdelnik(100, 60, Color.GRAY);
        nakresliKolecko(40, Color.gray);
        zofka.turnLeft(90);
        nakresliObdelnik(120, 60, Color.GRAY);
        zofka.penUp();

        //predni kola
        zofka.move(40);
        zofka.penDown();
        nakresliKoleckoZ(20);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        nakresliKoleckoZ(20);
        zofka.penUp();

        //radlice
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(10);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliRovnoRamennyTrojuhelnik_strana(40, Color.gray);
        zofka.penUp();
        zofka.turnLeft(45);

    }

}
