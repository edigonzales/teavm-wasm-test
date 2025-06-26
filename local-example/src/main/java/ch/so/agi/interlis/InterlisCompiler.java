package ch.so.agi.interlis;

import java.io.IOException;
import java.util.ArrayList;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.Ili2cException;
import ch.interlis.ili2c.Ili2cSettings;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.ilirepository.IliManager;

import javax.xml.namespace.QName;

public class InterlisCompiler {
    public static void main(String[] args) throws IOException {
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
        Configuration config;
        try {
            EhiLogger.logState("ili2c"+"-"+TransferDescription.getVersion());
            config = manager.getConfigWithFiles(ilifiles);
        } catch (Ili2cException e) {
            throw new IOException(e.getMessage());
        } 

        
        System.out.println("Hallo Stefan");

    }
}
