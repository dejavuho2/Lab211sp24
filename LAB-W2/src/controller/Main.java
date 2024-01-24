package controller;

import model.CharacterAndLetter;
import view.Menu;
import view.Utils;

public class Main extends Menu {
    private static String[] mc={"Enter your content","Count character","Count letter","Exit"};
    private CharacterAndLetter cal;
    private String s;

    public Main() {
        super("Character And Letter Count",mc);
        cal= new CharacterAndLetter();
    }
    
    public static void main(String[] args) {
        new Main().run();
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: s=Utils.getString("Enter");cal.setS(s);cal.makePerfect();break;
            case 2: cal.countCharacter();break;
            case 3: cal.countLectter();break;
            case 4: System.exit(0);
        }
    }
    
    
}
