
import model.Champion;
import model.Role;
import model.characterRoster;
import view.MainView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author levy
 */
public class MainController {

    private MainView mainV;
    private characterRoster champList;

    public MainController() {
        //this.mainV = new MainView(this);
        this.champList = initData();
        this.champList.showChamps();

    }

    public static characterRoster initData() {
        characterRoster v14 = new characterRoster("14.7");
        Role top = new Role("Top");
        Role jng = new Role("Jng");
        Role mid = new Role("Mid");
        Role bot = new Role("Bot");
        Role sup = new Role("Sup");
        v14.addRole(top);
        v14.addRole(jng);
        v14.addRole(mid);
        v14.addRole(bot);
        v14.addRole(sup);

        Champion twitch = new Champion(1, "Twitch", bot, 50, 2, 2, true);
        Champion aatrox = new Champion(2, "Aatrox", top, 50, 2, 2, false);
        Champion sion = new Champion(3, "Sion", top, 50, 2, 2, false);

        v14.addChamp(sion);
        v14.addChamp(aatrox);
        v14.addChamp(twitch);

        return v14;
    }

}
