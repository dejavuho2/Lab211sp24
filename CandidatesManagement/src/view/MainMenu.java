
package view;

public class MainMenu extends Menu{

    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: new Information(ch);break;
            case 2: new Information(ch);break;
            case 3: new Information(ch);break;
            case 4: new Search();break;
            case 5: System.exit(0);
        }
    }  
}
