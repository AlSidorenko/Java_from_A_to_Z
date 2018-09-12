package ru.job4j.classes_and_objects_1;

/**
 * Created on 12.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ProfessionStart {

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        Doctor doctor = new Doctor("Denis", 35, "man", "dentist");
        Patient patient = new Patient("Alec", 25, "man");

        System.out.printf("%s\n", doctor.diagnoseHeal(patient));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms", timeFinish - timeStart);
    }
}
