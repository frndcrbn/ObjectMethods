package main;

public class Character {

    String name, dialog;
    int hp, mp, lvl;

    Character(String name, String dialog, int hp, int mp, int lvl){
        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;
    }

    void introduced(){
        System.out.println("I am " + name);
    }

    void talkTo(String firstName){
        System.out.println(name + " : Hello, " + firstName);
    }
}
