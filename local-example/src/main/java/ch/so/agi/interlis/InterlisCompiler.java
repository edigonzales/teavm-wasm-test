package ch.so.agi.interlis;

import java.util.ArrayList;

import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.Ili2cSettings;
import ch.interlis.ilirepository.IliManager;

public class InterlisCompiler {
    public static void main(String[] args) {
        // var document = HTMLDocument.current();
        // var div = document.createElement("div");
        // div.appendChild(document.createTextNode("TeaVM generated element"));
        // document.getBody().appendChild(div);
        System.out.println("Hallo Welt.");

        Settings settings = new Settings();
        settings.setValue("foo", "bar");
        System.out.println(settings.getValue("foo"));
        
        IliManager manager = new IliManager();        
        manager.setRepositories(Ili2cSettings.DEFAULT_ILIDIRS.split(";"));
        //manager.setRepositories(ilidirs.split(";"));
        ArrayList<String> ilifiles = new ArrayList<String>();
        ilifiles.add("SO_ARP_SEin_Konfiguration_20250115.ili");


    }
}
