package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    // a function that display the main menu
    public static void display_menu() {
        System.out.println ( "1) Create basic recruit \n2) Create recruit \n3) List  \n4) Display Character   \n5) Quit   \n6) Save \n7) Remove Character  \n8) Fight  \n9) Class dictionary" );
        System.out.print ( "Selection: " );
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        //instantiation of the Scanner util
        Scanner in = new Scanner ( System.in );
        Scanner charDefault = new Scanner(System.in);
        Scanner charPersonalize = new Scanner(System.in);
        Scanner liste = new Scanner(System.in);

        //creation of the basic Fighter
        Fighter recruitDefault = new Recruit("didier",100,1000,50);
        Fighter wariorDefault = new Warrior("Theo",120,900,100,20);
        Fighter mageDefault = new Magician("Mesmer",90,1000,50,70);
        Fighter roguedDefault = new Rogue("Naruto",100,800,90, 50,20);
        Fighter mageguerrierDefault = new MageGuerrier("Eragon",100,1000,30, 20,70);
        Fighter guerriervoleurDefault = new GuerrierVoleur("Robin",100,1000,40, 50,20,20);
        Fighter magevoleurDefault = new MageVoleur("Renard gris",100,1000,30,70,50,20);
        Fighter fouDefault = new Fou("David",100,1000,70,50);
        ListPerso list = new ListPerso();

        //Fighter that has been chosen if the two fighters have the same initiative stats
        Fighter chooseChar = null;

        //boolean that permit to do the loop
        boolean cont = true;

        //print of the welcome msg
        System.out.println("Welcome in \n--¡-- __     ___      __ |        /\\   __ __     ¡ _  __ ___ __   ¡--\\ __ ______| __   /--\\'  _   _       | __ ___ _ ¡ _   |||\n" +
                                        "  |  /__\\ \\/  | |   |/  ||\\  /   /__\\ /  /  |   ||/  /  | | /__\\  |--</  | |  | |/__\\  '--.||/ \\ / \\ |   ||/  | | / \\|/    |||\n" +
                                        "  |  \\__; /\\  |  \\_/|\\__|| \\/   /    \\\\__\\__ \\_/||   \\__| | \\__;  |__/\\__| |  | |\\__;  \\__/||   |   | \\_/||\\__| | \\_/|     ...\n" +
                                        "                          _/");
        System.out.println("Press enter for access the menu");
        String wait = in.nextLine();

        //loop of the main menu
        while(cont) {

            display_menu();
            switch (in.nextInt()) {

                // First choice, display a new menu for basic Fighter creation
                case 1:
                    //the choice of class
                    System.out.println("Choose the type : \n1) Basic recruit \nBasic class Hybrid class\n2) Warrior  5) MagicWarrior\n3) Mage     6) RogueMage\n4) Rogue    7) RogueWarrior\nCustom class\n8)Foul");

                    switch (charDefault.nextInt()){
                        case 1:
                            System.out.println(recruitDefault);
                            list.addListePerso(recruitDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;

                        case 2:
                            System.out.println(wariorDefault);
                            list.addListePerso(wariorDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;

                        case 3:
                            System.out.println(mageDefault);
                            list.addListePerso(mageDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;

                        case 4:
                            System.out.println(roguedDefault);
                            list.addListePerso(roguedDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 5:
                            System.out.println(mageguerrierDefault);
                            list.addListePerso(mageguerrierDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 7:
                            System.out.println(guerriervoleurDefault);
                            list.addListePerso(guerriervoleurDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 6:
                            System.out.println(magevoleurDefault);
                            list.addListePerso(magevoleurDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 8:
                            System.out.println(fouDefault);
                            list.addListePerso(fouDefault);
                            System.out.println("Hiring in progress");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        default:
                            System.err.println("Unrecognized option");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                    }
                    break;



                // Second choice, display a new menu for the Fighter creation
                case 2:
                    // choose the class of the fighter
                    System.out.println("Choose the type : \n1) Basic recruit \nBasic class Hybrid class\n2) Warrior  5) MagicWarrior\n3) Mage     6) RogueMage\n4) Rogue    7) RogueWarrior\nCustom class\n8)Foul");
                    switch (charPersonalize.nextInt()){
                        // create a recruit
                        case 1:

                            System.out.println("entrer the name of your character: ");
                            String name = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmg = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lp = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int ini = in.nextInt();
                            Fighter recruit1 = new Recruit(name, dmg, lp, ini);
                            list.addListePerso(recruit1);
                            break;

                        // create a warrior
                        case 2:

                            System.out.println("entrer the name of your character: ");
                            String namewar = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgwar = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lpwar = in.nextInt();
                            System.out.println("choose an amount of shield resistance: ");
                            int shieldwar = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int iniwar = in.nextInt();
                            Fighter warrior1 = new Warrior(namewar, dmgwar, lpwar, iniwar, shieldwar);
                            list.addListePerso(warrior1);
                            break;

                        // create a magician
                        case 3:
                            System.out.println("entrer the name of your character: ");
                            String nameMag = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgMag = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lpMag = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int iniMag = in.nextInt();
                            System.out.println("choose an amount of magic damage: ");
                            int dmgMagBonus = in.nextInt();
                            Fighter magician = new Magician(nameMag, dmgMag, lpMag, iniMag,dmgMagBonus);
                            list.addListePerso(magician);
                            break;

                        // create a rogue
                        case 4:
                            System.out.println("entrer the name of your character: ");
                            String name1 = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmg1 = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lp1 = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int ini1 = in.nextInt();
                            System.out.println("choose a probability of critical chance: ");
                            int crit = in.nextInt();
                            System.out.println("choose a probability of dodge chance: ");
                            int dodge = in.nextInt();
                            Fighter rogue = new Rogue(name1, dmg1, lp1, ini1,crit,dodge);
                            list.addListePerso(rogue);
                            break;
                        case 5:
                            System.out.println("entrer the name of your character: ");
                            String namemg = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgmg = in.nextInt();
                            System.out.println("choose an amount of magic damage: ");
                            int dmgMagmg = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lpmg = in.nextInt();
                            System.out.println("choose an amount of shield resistance: ");
                            int shieldmg = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int inimg = in.nextInt();
                            Fighter magicwarrior = new MageGuerrier(namemg,dmgmg,lpmg,inimg, shieldmg,dmgMagmg);
                            list.addListePerso(magicwarrior);
                            break;
                        case 6:
                            System.out.println("entrer the name of your character: ");
                            String namerm = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgrm = in.nextInt();
                            System.out.println("choose an amount of magic damage: ");
                            int dmgMagrm = in.nextInt();
                            System.out.println("choose a probability of critical chance: ");
                            int critrm = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lprm = in.nextInt();
                            System.out.println("choose a probability of dodge chance: ");
                            int dodgerm = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int inirm = in.nextInt();
                            Fighter roguemage = new MageVoleur(namerm,dmgrm,lprm,inirm,dmgMagrm,critrm,dodgerm);
                            list.addListePerso(roguemage);
                            break;
                        case 7:
                            System.out.println("entrer the name of your character: ");
                            String namerw = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgrw = in.nextInt();
                            System.out.println("choose a probability of critical chance: ");
                            int critrw = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lprw = in.nextInt();
                            System.out.println("choose an amount of shield resistance: ");
                            int shieldrw = in.nextInt();
                            System.out.println("choose a probability of dodge chance: ");
                            int dodgerw = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int inirw = in.nextInt();
                            Fighter roguewarrior = new GuerrierVoleur(namerw,dmgrw,lprw,inirw, critrw,dodgerw,shieldrw);
                            list.addListePerso(roguewarrior);
                            break;
                        case 8:
                            System.out.println("entrer the name of your character: ");
                            String namef = in.next();
                            System.out.println("choose a damage amount: ");
                            int dmgf = in.nextInt();
                            System.out.println("choose an amount of mental sanity: ");
                            int msf = in.nextInt();
                            System.out.println("choose an amount of life points: ");
                            int lpf = in.nextInt();
                            System.out.println("choose an initative amount: ");
                            int inif = in.nextInt();
                            Fighter foul = new Fou(namef, dmgf, lpf, inif, msf);
                            list.addListePerso(foul);
                            break;
                        default:

                            System.err.println("Unrecognized option");
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                    }

                // Third choice, permit to display the list of fighter
                case 3:
                    list.displayList();
                    System.out.println("Come back to the menu : (Press Enter)");
                    String valUser = liste.nextLine();
                    break;

                // Fourth choice, permit to look at specific Fighter
                case 4:
                    //A loop that make the menu for seeing a character reappears if you enter an invalid index
                    boolean wantLook = true;
                    while (wantLook) {
                        System.out.println("Which character do you want to see : ");
                        int index = in.nextInt();
                        if ((list.sizeList() > index - 1) && (index - 1 != -1)) {
                            list.displayChar(index);
                            wantLook = false;
                            System.out.println("Come back to the menu : (Press Enter)");
                            String continutoMenu = liste.nextLine();
                        } else {
                            System.out.println("This character doesn't exist in the list \n Do you want to return to menu ? (0) yes (1) no");
                            index = in.nextInt();
                            if (index==0){
                                wantLook = false;
                            }
                        }
                    }
                    break;

                // Fifth choice, permit to quit the simulation
                case 5:
                    System.out.println("You have just left the simulation");
                    cont = false;
                    break;

                // Sixth, menu that permit to save
                case 6:
                    System.out.println("save(1) or load(2) or return to the menu(3) ?");
                    int choose = in.nextInt();
                    while ((choose != 1)&&(choose != 2)&&(choose != 3)){
                        System.out.println();
                        choose = in.nextInt();
                    }
                    if (choose==1){
                        System.out.println("which file's path ?");
                        String input = in.next();
                        list.exportsave(input);
                        break;
                    }else if (choose==2){
                        System.out.println("which file's path ?");
                        String output = in.next();
                        break;
                    }else{
                        break;
                    }

                // Seventh choice, function that permit to remove a Fighter from the list
                case 7:
                    // a loop that make the menu for deleting a character reappears if you give a wrong index
                    boolean wantSuppr = true;
                    while (wantSuppr) {
                        list.displayList();
                        System.out.println("Choose the character to delete");
                        int index = in.nextInt();
                        if ((list.sizeList() > index - 1) && (index - 1 != -1)) {
                            list.displayChar(index);
                            wantSuppr = false;
                            list.removeList(index);
                        } else {
                            System.out.println("This character doesn't exist in the list \n Do you want to return to menu ? (0) yes (1) no");
                            index = in.nextInt();
                            if (index == 0) {
                                wantSuppr = false;
                            }
                        }
                    }
                    list.displayList();
                    break;

                //Function to make two different fighters fight
                case 8:
                    list.displayList();

                    // a loop that make sure that you pick an existing fighter
                    boolean Perso1noselected= true;
                    int indexPerso1 = 0;
                    while (Perso1noselected) {
                        System.out.println("Choose your first character : ");
                        indexPerso1 = in.nextInt();
                        if ((list.sizeList()>indexPerso1-1)&&(indexPerso1-1!=-1)) {
                            list.getRecruit(indexPerso1);
                            Perso1noselected = false;
                        } else {
                            System.out.println("This character doesn't exist in the list");
                        }
                    }
                    // cloning the first fighter
                    Fighter Perso = list.getRecruit(indexPerso1);
                    Fighter Perso1 = (Fighter)Perso.clone();

                    boolean Perso2noselected= true;
                    int indexPerso2 = 0;
                    while(Perso2noselected) {
                        System.out.println("Choose your second character : ");
                        indexPerso2 = in.nextInt();
                        if ((list.sizeList()>indexPerso2-1)&&(indexPerso2-1!=-1)) {
                            list.getRecruit(indexPerso2);
                            Perso2noselected = false;
                        } else {
                            System.out.println("This character doesn't exist in the list");
                        }
                    }
                    //cloning the second fighter

                    Fighter PersoBis = list.getRecruit(indexPerso2);
                    Fighter Perso2 = (Fighter)PersoBis.clone();

                    //function that determine which player start the fight
                    boolean fight = true;
                    if (Perso1.getInitiative() > Perso2.getInitiative()) {
                        System.out.println(Perso1.getName() + " start");
                    }
                    else if(Perso1.getInitiative()< Perso2.getInitiative()){
                        System.out.println(Perso2.getName() + " start");
                    }else {
                        Fighter[] tabPerso = {Perso1,Perso2};
                        int randFirst = new Random().nextInt(tabPerso.length);
                        chooseChar = tabPerso[randFirst];
                        System.out.println("Same initiative, so random draw : " + chooseChar.getName());
                    }

                    // the loop that compose the fight
                    int nbtour = 0;
                    System.out.println("It's time to du-du-du-duel !!!");
                    while (fight){
                        // case where the first fighter has more initiative
                        if (Perso1.getInitiative() > Perso2.getInitiative()){
                            //incrementation of the number of turn
                            nbtour++;
                            int domage;
                            //Whole function that permit to a Fighter to attack and receive damage, if the fighter hp are 0 he can't act
                            if (Perso1.getLifePoints() > 0){
                                domage = Perso1.getDamage();
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                domage = Perso2.takeDamage(domage);
                                System.out.println("Turn " + nbtour + " : " + Perso1.getName() + " inflicted " + domage + " to " + Perso2.getName() + " he has " +Perso2.getLifePoints() + " HP left"  );
                            }else{
                                System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " wins with " + Perso2.getLifePoints() + " left. ");
                                System.out.println("Come back to the menu : (Press Enter)");
                                String goToMenu = liste.nextLine();
                                fight = false;
                                break;
                            }
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            if (Perso2.getLifePoints() > 0){
                                domage = Perso2.getDamage();
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                domage = Perso1.takeDamage(domage);
                                System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " inflicted " + domage + " to " + Perso1.getName() + " he has " + Perso1.getLifePoints() + " HP left");
                            }
                            else{
                                System.out.println("Turn " + nbtour + " : " + Perso1.getName() + " wins with " + Perso1.getLifePoints() + " left");
                                System.out.println("Come back to the menu : (Press Enter)");
                                String goMenu = liste.nextLine();
                                fight = false;
                                break;
                            }
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        else if (Perso2.getInitiative()> Perso1.getInitiative()){
                            nbtour++;
                            int domage;
                            if (Perso2.getLifePoints() > 0){
                                domage = Perso2.getDamage();
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                domage = Perso1.takeDamage(domage);
                                System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " inflected " + domage + " to " + Perso1.getName() + "  he has " + Perso1.getLifePoints() + " HP left");
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                            }else{
                                System.out.println("Turn " + nbtour + " : " + Perso1.getName() + "  wins with " + Perso1.getLifePoints() + " HP left");
                                System.out.println("Come back to the menu : (Press Enter)");
                                String gotoMenu = liste.nextLine();
                                fight = false;
                                break;
                            }
                            if (Perso1.getLifePoints() > 0){
                                domage = Perso1.getDamage();
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                domage = Perso2.takeDamage(domage);
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                System.out.println("Turn " + nbtour + ":" + Perso1.getName() + " inflected " + domage + " to " + Perso2.getName() + " he has " + Perso2.getLifePoints()+ " HP left");
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                            }else{
                                System.out.println(Perso2.getName() + " wins with " + Perso2.getLifePoints() + " HP left");
                                System.out.println("Come back to the menu : (Press Enter)");
                                String continuToMenu = liste.nextLine();
                                fight = false;
                                System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " wins with " + Perso2.getLifePoints() + " HP left");
                                break;
                            }
                        }else{
                            nbtour++;
                            if( chooseChar == Perso1 ){
                                int domage;
                                if (Perso1.getLifePoints() > 0){
                                    domage = Perso1.getDamage();
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    domage = Perso2.takeDamage(domage);
                                    System.out.println("Turn " + nbtour + " : " + Perso1.getName() + " inflected " + domage + " to " + Perso2.getName() + " he has " + Perso2.getLifePoints() + " HP left ");
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                }else{
                                    System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " wins with " + Perso2.getLifePoints() + " HP left");
                                    System.out.println("Come back to the menu : (Press Enter)");
                                    String displayMenu = liste.nextLine();
                                    fight = false;
                                    break;
                                }
                                if (Perso2.getLifePoints() > 0){
                                    domage = Perso2.getDamage();
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    domage = Perso1.takeDamage(domage);
                                    System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " inflected " + domage + " to " + Perso1.getName() + " he has " + Perso1.getLifePoints()+ " HP left ");
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                }
                                else{
                                    System.out.println(Perso1.getName() + " wins with " + Perso1.getLifePoints() + " HP left ");
                                    System.out.println("Come back to the menu : (Press Enter)");
                                    String displaymenu = liste.nextLine();
                                    fight = false;
                                    break;
                                }
                            }else {
                                int domage;
                                if (Perso2.getLifePoints() > 0){
                                    domage = Perso2.getDamage();
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    domage = Perso1.takeDamage(domage);
                                    System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " inflected " + domage + " to " + Perso1.getName() + " he has " + Perso1.getLifePoints()+ " HP left");
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                }
                                else{
                                    System.out.println("Turn " + nbtour + " : " + Perso1.getName() + " wins with " + Perso1.getLifePoints() + " HP left");
                                    System.out.println("Come back to the menu : (Press Enter)");
                                    String openMenu = liste.nextLine();
                                    fight = false;
                                    break;
                                }
                                if (Perso1.getLifePoints() > 0){
                                    domage = Perso1.getDamage();
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    domage = Perso2.takeDamage(domage);
                                    System.out.println("Turn " + nbtour + " : " + Perso1.getName() + " inflected " + domage + " to " + Perso2.getName() + "  he has " + Perso2.getLifePoints() + " HP left");
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                }
                                else{
                                    System.out.println("Turn " + nbtour + " : " + Perso2.getName() + " wins with " + Perso2.getLifePoints() + " HP left");
                                    System.out.println("Come back to the menu : (Press Enter)");
                                    String menu = liste.nextLine();
                                    fight = false;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 9:
                    // A class dictionary that explain the effect of the different class
                    int displayInformation = 0;

                    while(displayInformation == 0) {

                        System.out.println("which class information do you want to see ? :\n 1) the Recruit \n 2) the Warrior \n 3) the Mage \n 4) the Rogue \n 5) the Magic Warrior \n 6) the Rogue Mage \n 7) the Rogue warrior\n 8) Quit");
                        switch (in.nextInt()){
                            case 1:
                                System.out.println("A basic fighter with no special specificity");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                String continutoMenu = liste.nextLine();
                                break;
                            case 2:
                                System.out.println("The Warrior is a more advanced fighter well trained in the way of the shield \n " +
                                        "He have a supplementary stat called ShieldRes that block a fixed amount of incoming damage");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 3:
                                System.out.println("the Mage is a scholar that pursuit the best spell in the world, he resided in the magic tower with a bunch of other mage \n" +
                                        "he have a supplementary stat called MagicDamage that deal additional damage, but the value of MagicDamage halves each turn");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 4:
                                System.out.println("The Rogue is an orphan that grew in the undercity, he has been trained in the way of assassination since his childhood making him a fierce enemy \n" +
                                        "The Rogue have the possibilities of making a critical strike and dodge any attack, the probability of those two characteristic are influenced by the stats CritChance and Dodge Chance  ");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 5:
                                System.out.println("The Magic Warrior is a man that grew up with the dream using magic, but he was born in a important military family making him train as a knight \n despite that he trained secretly his magic by himself. While his magic is not very powerful it can do some serious damage \n" +
                                        "The Magic Warrior have the possibility to block a fixed amount of damage due to his ShieldRes stat and he inflict more damage with his Magic Damage stat but those additional damage halves every turn");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 6:
                                System.out.println("The Rogue mage is an infiltrated Rogue in the magic tower, while his magic may not be top notch, he got some serious assassination skills making him a versatile Fighter \n" +
                                        "The Rogue Mage have the same abilities as a basic rogue, but he use a dagger infused with his magic power that deal additional damage until his power runs out");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 7:
                                System.out.println("The Rogue Warrior is a fallen knight that lost his position after an incident, since then he roam around the world and steal from people to pay his debt back \n" +
                                        "The Rogue Warrior can block a fixed amount of damage with his shield and can even dodge incoming attack. Ultimately he can do critical strike");
                                System.out.println("Come back to the Dictionary : (Press Enter)");
                                continutoMenu = liste.nextLine();
                                break;
                            case 8:
                                displayInformation = 1;
                                break;
                        }
                    }

                default:

                    System.err.println("Unrecognized option");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
