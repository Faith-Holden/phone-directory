package solution;

import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    int directorySize = 0;

    Map<String,PhoneDirectoryEntry> phoneDirectory = new TreeMap<>();

    //for the phone number objects
    private class PhoneDirectoryEntry {
        String name;
        String phoneNumber;
        public PhoneDirectoryEntry(String name, String Number){
            this.name = name;
            this.phoneNumber = Number;
        }
    }

    public void addEntry(String name, String number){
        phoneDirectory.put(name, new PhoneDirectoryEntry(name,number));
        directorySize++;
    }

    public String getNumber(String name){
        if(phoneDirectory.containsKey(name)){
            return phoneDirectory.get(name).phoneNumber;
        }else{
            throw new IllegalArgumentException("No such person in the phone directory!");
        }
    }
}
