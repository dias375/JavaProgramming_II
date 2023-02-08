
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap database;

    public VehicleRegistry() {
        this.database = new HashMap();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (alreadyInDatabase(licensePlate)) {
            return false;
        }
        database.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (alreadyInDatabase(licensePlate)) {
            return String.valueOf(database.get(licensePlate));
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (alreadyInDatabase(licensePlate)) {
            database.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (Object key : this.database.keySet()) {
            System.out.println(key.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList();
        for (Object key : this.database.keySet()) {
            String owner = this.database.get(key).toString();
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
            }
        }
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }

    private boolean alreadyInDatabase(LicensePlate licensePlate) {
        if (database.containsKey(licensePlate)) {
            return true;
        }
        return false;
    }
}
