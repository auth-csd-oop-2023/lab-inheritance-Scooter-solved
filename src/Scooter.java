/**
 * Αυτή η κλάση αναπαριστά ένα σκούτερ με μηχανή εσωτερικής καύσης.
 * <p>
 * This class represents a scooter with an internal combustion engine.
 */
public class Scooter {

    private int maxKM;
    private int year;

    public Scooter() {

    }

    /**
     * Κατασκευαστής / Constructor
     *
     * @param maxKM Ο μέγιστος αριθμός χιλιομέτρων που μπορεί να διανύσει με ένα γέμισμα. The maximum number of
     *              kilometers you can travel with a full tank.
     * @param year  Το έτος κυκλοφορίας του οχήματος / the release year of the vehicle.
     */
    public Scooter(int maxKM, int year) {
        this.maxKM = maxKM;
        this.year = year;
    }

    /**
     * @return Το μέγιστο αριθμό χιλιομέτρων που μπορεί να διανύσει με ένα γέμισμα.
     * <p>
     * The maximum number of kilometers you can travel with a full tank.
     */
    public int getMaxKM() {
        return this.maxKM;
    }

    /**
     * @return Το έτος κυκλοφορίας του οχήματος / the release year of the vehicle.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Κάθε όχημα χαρακτηρίζεται από μια βαθμολογία ανάλογα με τους ρύπους που παράγει. Το σκορ αυτό είναι ίσο με τον
     * αριθμό των μέγιστων χιλιομέτρων επί τον μέσο αριθμό γεμισμάτων ανα έτος (250), διά το σύνολο των ημερών ενός
     * έτους (365)
     * <p>
     * Each vehicle has a score that represents the pollutants that produces. This score equals the maximum kilometers
     * of the vehicle multiplied by the average number of fillings during  a year (250), divided by the number of days
     * in a year (365)
     *
     * @return Το σκορ μόλυνσης του περιβάλλοντος, the pollution score.
     */
    public double getPollutionScore() {
        return this.maxKM * 250 / 365d;
    }

    /**
     * Μέθοδος που υπολογίζει τα τέλη κυκλοφορίας του οχήματος. Τα τέλη κυκλοφορίας ισούται με τα έτη που κυκλοφορεί το
     * όχημα μέχρι σήμερα (2018) επι 12.5 που είναι ένας σταθερός αριθμός.
     * <p>
     * This method computes the annual taxes of the vehicle. The annual taxes equal the number of years from the release
     * day till today (2018) multiplied by 12.5 which is a constant value.
     *
     * @return Τα τέλη κυκλοφορίας / the annual tax of the vehicle
     */
    public double getTaxes() {
        return (2018 - this.year) * 12.5;
    }
}
