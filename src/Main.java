import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scooter s = new Scooter(100, 2000);
        System.out.println(s instanceof ElectricalScooter);

        Scooter s2 = new ElectricalScooter(100, 2000, 33);
        System.out.println(s2 instanceof ElectricalScooter);
        ((ElectricalScooter) s2).getChargingTime();

        //Scooter s2 = new ElectricalScooter(100, 2000, 33);
        //((ElectricalScooter) s2).getChargingTime();

        ArrayList<ElectricalScooter> scooters = new ArrayList<>();
        scooters.add((ElectricalScooter) s2);
        //scooters.add(s3);



    }
}
