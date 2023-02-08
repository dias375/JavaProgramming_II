
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        ArrayList items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit)) {
            return new ArrayList();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> itemsList = this.storage.get(storageUnit);
            this.removeItemFromList(itemsList, item);
        }
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsOccupied = new ArrayList<String>();
        for (Map.Entry<String, ArrayList<String>> entry : this.storage.entrySet()) {
            unitsOccupied.add(entry.getKey());
        }
        return unitsOccupied;
    }

    private void removeItemFromList(ArrayList<String> itemsList, String item) {
        if (itemsList.contains(item)) {
            for (int i = 0; i < itemsList.size(); i++) {
                if (itemsList.get(i).equals(item)) {
                    itemsList.remove(i);
                    return;
                }
            }
        }
    }

}
