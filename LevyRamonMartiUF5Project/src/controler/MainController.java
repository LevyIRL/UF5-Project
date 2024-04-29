package controler;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Champion;
import model.Region;
import model.Role;
import model.characterRoster;
import view.AddView;
import view.ChooseLoadFileView;
import view.ChooseModifyView;
import view.ConfirmationDeleteView;
import view.DeleteView;
import view.MainView;
import view.ModifyView;

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
    private AddView addView;
    private DeleteView delView;
    private ConfirmationDeleteView confirmDelView;
    private ModifyView modifyView;
    private ChooseModifyView chooseModifyView;
    private ChooseLoadFileView chooseLoadFileView;
    private boolean dataLoaded = false;

    public MainController() {
        //chooseLoadFileView();
        this.mainV = new MainView(this);
        if(!dataLoaded){
           this.champList = initData(); 
        }
        showChamps();
        this.mainV.setVisible(true);
    }

    private String getChampsTxt() {
        String txt = "";
        Set<Champion> champions = champList.getChampionList();
        for (Champion champ : champions) {
            txt += champ.toString() + "\n";
        }
        return txt;
    }

    private TableModel getChampsDataTable() {
        DefaultTableModel tm = new DefaultTableModel() {
            Class[] columnTypes = {Integer.class, String.class, Integer.class, Double.class, Double.class, String.class, Boolean.class, String.class};

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override

            public Class getColumnClass(int columnIndex) {

                return columnTypes[columnIndex];
            }

        };
        tm.addColumn("Code");
        tm.addColumn("Name");
        tm.addColumn("Winrate");
        tm.addColumn("Pickrate");
        tm.addColumn("Banrate");
        tm.addColumn("Role");
        tm.addColumn("Is Ranged");
        tm.addColumn("Region");

        TreeSet<Champion> champs = new TreeSet<>();
        champs.addAll(champList.getChampionList());

        for (Champion champ : champs) {
            Object[] row = new Object[8];
            row[0] = champ.getCode();
            row[1] = champ.getName();
            row[2] = champ.getWinrate();
            row[3] = champ.getPickrate();
            row[4] = champ.getBanrate();
            row[5] = champ.getRole().getName();
            row[6] = champ.isIsRanged();
            row[7] = champ.getRegion().getName();
            tm.addRow(row);
        }
        return tm;
    }

    public void showChamps() {
        //String txt = this.getChampsTxt();
        //mainV.setInfoTextArea(txt);
        TableModel tm = this.getChampsDataTable();
        mainV.setInfoTable(tm);
    }
    
    public static void saveChamp(Champion item){
        try {
            File f = new File("champs.obj");
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(item);

            oos.close();
        } catch (IOException e) {
            System.out.println("IOExceptionMain");
        }
    }
    
    public void loadRoaster(String fileName){
        characterRoster loadChampList = null;
        ObjectInputStream ois = null;
        try {
            File f = new File(fileName);
            
                FileInputStream fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Object ob =  ois.readObject();
                loadChampList.addChamp((Champion) ob);
            
        } catch (EOFException exc) {
            //System.out.println("\n**************** FIN ARXIU **************");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException io) {
                System.out.println("IOException"+ io);
            }
        }
        
        this.champList = loadChampList;
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
        Region runeterra = new Region("Runeterra");
        Region zaun = new Region("Zaun");
        v14.addRegion(runeterra);
        v14.addRegion(zaun);

        Champion twitch = new Champion(1, "Twitch", bot, zaun, 50, 2, 2, true);
        Champion aatrox = new Champion(2, "Aatrox", top, runeterra, 50, 2, 2, false);
        Champion sion = new Champion(3, "Sion", top, runeterra, 50, 2, 2, false);
        Champion lux = new Champion(4, "Lux", mid, runeterra, 50, 2, 2, true);
        Champion draven = new Champion(5, "Draven", bot, runeterra, 50, 2, 2, true);
        Champion zed = new Champion(6, "Zed", mid, runeterra, 50, 2, 2, false);
        Champion jhin = new Champion(7, "Jhin", bot, runeterra, 50, 2, 2, true);
        Champion darius = new Champion(8, "Darius", top, runeterra, 50, 2, 2, false);
        Champion caitlyn = new Champion(9, "Caitlyn", bot, runeterra, 50, 2, 2, true);
        Champion irelia = new Champion(10, "Irelia", top, runeterra, 50, 2, 2, false);
        Champion vayne = new Champion(11, "Vayne", bot, runeterra, 50, 2, 2, true);
        Champion yasuo = new Champion(12, "Yasuo", mid, runeterra, 50, 2, 2, false);
        Champion jinx = new Champion(13, "Jinx", bot, zaun, 50, 2, 2, true);
        Champion riven = new Champion(14, "Riven", top, runeterra, 50, 2, 2, false);
        Champion kaisa = new Champion(15, "Kai'Sa", bot, runeterra, 50, 2, 2, true);
        Champion malphite = new Champion(16, "Malphite", top, runeterra, 50, 2, 2, false);
        Champion ashe = new Champion(17, "Ashe", bot, runeterra, 50, 2, 2, true);
        Champion ekko = new Champion(18, "Ekko", mid, zaun, 50, 2, 2, false);
        Champion missFortune = new Champion(19, "Miss Fortune", bot, runeterra, 50, 2, 2, true);
        Champion sett = new Champion(20, "Sett", top, runeterra, 50, 2, 2, false);
        

        v14.addChamp(sion);
        v14.addChamp(aatrox);
        v14.addChamp(twitch);
        v14.addChamp(lux);
        v14.addChamp(draven);
        v14.addChamp(zed);
        v14.addChamp(jhin);
        v14.addChamp(darius);
        v14.addChamp(caitlyn);
        v14.addChamp(irelia);
        v14.addChamp(vayne);
        v14.addChamp(yasuo);
        v14.addChamp(jinx);
        v14.addChamp(riven);
        v14.addChamp(kaisa);
        v14.addChamp(malphite);
        v14.addChamp(ashe);
        v14.addChamp(ekko);
        v14.addChamp(missFortune);
        v14.addChamp(sett);

        return v14;
    }

    
    public void addChampView() {
        System.out.println("El botó afegir ha arribat al controlador");
        addView = new AddView(mainV, true, this);
        addView.setVisible(true);
    }
    
    public void chooseModifyView(){
        System.out.println("El botó modificar ha arribat al controlador");
        chooseModifyView = new ChooseModifyView(mainV, true, this);
        chooseModifyView.setVisible(true);
    }
    
    public void modifidyChampView(int code) {
        System.out.println("El botó modificar ha arribat al controlador");
        modifyView = new ModifyView(mainV, true, this, code);
        modifyView.setVisible(true);
    }
    
    public void delChampView(){
        System.out.println("El botó delete ha arribat al controlador");
        delView = new DeleteView(mainV, true, this);
        delView.setVisible(true);
    }
    
    public void confirmDelChampView(int code){
        confirmDelView = new ConfirmationDeleteView(mainV, true, this, code);
        confirmDelView.setVisible(true);
    }
    
    public void chooseLoadFileView(){
       chooseLoadFileView = new ChooseLoadFileView(this);
       chooseLoadFileView.setVisible(true);
    }

    public characterRoster getChampList() {
        return champList;
    }

    public void setChampList(characterRoster champList) {
        this.champList = champList;
    }

    public boolean isDataLoaded() {
        return dataLoaded;
    }

    public void setDataLoaded(boolean dataLoaded) {
        this.dataLoaded = dataLoaded;
    }
    
    
    
}
