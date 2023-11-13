/**
 * Αυτή η κλάση αναπαριστά ένα ηλεκτρικό σκούτερ και είναι νέο μοντέλο του Scooter. Η κλάση αυτή επεκτείνει την
 * scooter.
 * <p>
 * This class represent an electrical scooter and it a new model of scooter. This class should extend the Scooter
 * class.
 */
public class ElectricalScooter extends Scooter  {
    private int chargingTime;

    /**
     * Κατασκευαστής / Constructor
     *
     * @param maxKM        Ο μέγιστος αριθμός χιλιομέτρων που μπορεί να διανύσει με ένα γέμισμα / The maximum number of
     *                     kilometers you can travel with a full tank.
     * @param year         Το έτος κυκλοφορίας του οχήματος / the release year of the vehicle.
     * @param chargingTime Ο χρόνος φόρτισης της μπαταρίας σε λεπτά / the charging time of the battery in minutes
     */


    public ElectricalScooter(int maxKM, int year, int chargingTime) {
        super(maxKM, year);
        this.chargingTime = chargingTime;
    }

    /**
     * @return Το χρόνο πλήρους φόρτισης / the charging time of the battery
     */
    public int getChargingTime() {
        //System.out.println("defrfr");
        return chargingTime;
    }

    /**
     * Κάθε όχημα χαρακτηρίζεται από μια βαθμολογία ανάλογα με τους ρύπου που παράγει. Το σκορ αυτό είναι ίσο με τον
     * χρόνο φόρτισης της μπαταρίας επί τον μέσο αριθμό φορτίσεων ανα έτος (300), διά το σύνολο των ημερών ενός έτους
     * (365)
     * <p>
     * Each vehicle has a score that represents the pollutants that produces. This score equals the charging time \
     * multiplied by the average number of charging during a year (300), divided by the number of days in a year (365)
     *
     * @return Το σκορ μόλυνσης του περιβάλλοντος, the pollution score.
     */
    public double getPollutionScore() {
        System.out.println("ES");
        return chargingTime * 300 / 365d;
    }

    /**
     * Μέθοδος που υπολογίζει τα τέλη κυκλοφορίας του οχήματος. Τα τέλη κυκλοφορίας ισούται με τα έτη που κυκλοφορεί το
     * όχημα μέχρι σήμερα (2018) επι 12.5 που είναι ένας σταθερός αριθμός. Αν πρόκειται για ηλεκτρικό όχημα το κόστος
     * μειώνεται κατά 20%.
     * <p>
     * This method computes the annual taxes of the vehicle. The annual taxes equal the number of years from the release
     * day till today (2018) multiplied by 12.5 which is a constant value. In case of an electric vehicle the score is
     * reduced by 20%.
     *
     * @return Τα τέλη κυκλοφορίας, the annual tax of the vehicle
     */
    public double getTaxes() {
        return super.getTaxes() * 0.8;
    }

}
