package com.company;
import java.util.Scanner;
public class Main {
    public static void display_menu() {
        System.out.println ( "1) Create basic recruit \n2) Create recruit \n3) Create warrior \n4) Create mage \n" +
         "5) Create rogue \n6) List \n7) display character \n8) quit \n9) Fight" );
        System.out.print ( "Selection: " );
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner in = new Scanner ( System.in );
        Recruit recruit = new Recruit("didier",100,1000,50);
        ListPerso list = new ListPerso();
        boolean cont = true;
        while(cont) {
            display_menu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println(recruit);
                    list.addListePerso(recruit);
                    break;
                case 2:
                    System.out.println("entrer le nom de votre personnage: ");
                    String name = in.next();
                    System.out.println("choisissez un montant de dégats: ");
                    int dmg = in.nextInt();
                    System.out.println("choisissez un montant de point de vie: ");
                    int lp = in.nextInt();
                    System.out.println("choisissez un montant d'initiative: ");
                    int ini = in.nextInt();
                    Recruit recruit1 = new Recruit(name, dmg, lp, ini);
                    list.addListePerso(recruit1);
                    break;
                case 3:
                    System.out.println("entrer le nom de votre personnage: ");
                    String namewar = in.next();
                    System.out.println("choisissez un montant de dégats: ");
                    int dmgwar = in.nextInt();
                    System.out.println("choisissez un montant de point de vie: ");
                    int lpwar = in.nextInt();
                    System.out.println("choisissez un montant de résistance du bouclier: ");
                    int shieldwar = in.nextInt();
                    System.out.println("choisissez un montant d'initiative: ");
                    int iniwar = in.nextInt();
                    Warrior warrior1 = new Warrior(namewar, dmgwar, lpwar, iniwar, shieldwar);
                    list.addListePerso(warrior1);
                    break;
                case 6:
                    list.displayList();
                    break;
                case 7:
                    System.out.println("quel personnage voulez vous voir");
                    int index = in.nextInt();
                    list.displayChar(index);
                    break;
                case 8:
                    cont = false;
                    break;
                case 9:
                    list.displayList();
                    System.out.println("choisissez le premier personnage : ");
                    int indexPerso1 = in.nextInt();
                    Recruit Perso = list.getRecruit(indexPerso1);
                    Recruit Perso1 = (Recruit)Perso.clone();

                    System.out.println("choisissez le deuxième personnage : ");
                    int indexPerso2 = in.nextInt();
                    Recruit PersoBis = list.getRecruit(indexPerso2);
                    Recruit Perso2 = (Recruit)PersoBis.clone();

                    boolean fight = true;
                    if (Perso1.getInitiative() > Perso2.getInitiative()) {
                        System.out.println(Perso1.getName() + " commence");
                    }
                    else{
                        System.out.println(Perso2.getName() + " commence");
                    }
                    while (fight){
                        if (Perso1.getInitiative() > Perso2.getInitiative()){
                            int domage;
                            if (Perso1.getLifePoints() > 0){
                                domage = Perso1.getDamage();
                                domage = Perso2.takeDamage(domage);
                                System.out.println(Perso1.getName() + " à infligé " + domage + " à " + Perso2.getName() + " il lui reste " + Perso2.getLifePoints());
                            }
                            else{
                                System.out.println(Perso2.getName() + " à gagné avec " + Perso2.getLifePoints() + " restant");
                                fight = false;
                            }
                            try{
                                Thread.sleep(1500);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            if (Perso2.getLifePoints() > 0){
                                domage = Perso2.getDamage();
                                domage = Perso1.takeDamage(domage);
                                System.out.println(Perso2.getName() + " à infligé " + domage + " à " + Perso1.getName() + " il lui reste " + Perso1.getLifePoints());
                            }
                            else{
                                System.out.println(Perso1.getName() + " à gagné avec " + Perso1.getLifePoints() + " restant");
                                fight = false;
                            }
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        else if (Perso2.getInitiative()> Perso1.getInitiative()){
                            int domage;
                            if (Perso2.getLifePoints() > 0){
                                domage = Perso2.getDamage();
                                domage = Perso1.takeDamage(domage);
                                System.out.println(Perso2.getName() + " à infligé " + domage + " à " + Perso1.getName() + " il lui reste " + Perso1.getLifePoints());
                            }
                            else{
                                System.out.println(Perso1.getName() + " à gagné avec " + Perso1.getLifePoints() + " restant");
                                fight = false;
                            }
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            if (Perso1.getLifePoints() > 0){
                                domage = Perso1.getDamage();
                                domage = Perso2.takeDamage(domage);
                                System.out.println(Perso1.getName() + " à infligé " + domage + " à " + Perso2.getName() + " il lui reste " + Perso2.getLifePoints());
                            }
                            else{
                                System.out.println(Perso2.getName() + " à gagné avec " + Perso2.getLifePoints() + " restant");
                                fight = false;
                            }
                            try{
                                Thread.sleep(1500);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }


                    break;
                default:
                    System.err.println("Unrecognized option");
                    break;
            }
        }
    }
}
