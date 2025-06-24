package ch.so.agi.interlis;

import ch.ehi.basics.settings.Settings;

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

    }
}
