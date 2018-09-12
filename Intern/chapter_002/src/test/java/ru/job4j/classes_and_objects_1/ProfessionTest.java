package ru.job4j.classes_and_objects_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 12.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ProfessionTest {

    @Test
    public void whenDoctorTreatsPatient() {
        Doctor doctor = new Doctor("Denis", 35, "man", "dentist");
        Patient patient = new Patient("Alec", 25, "man");
        String result = doctor.diagnoseHeal(patient);
        String expected = "Doctor Denis treats the patient Alec.";
        assertThat(result, is(expected));
    }
}
