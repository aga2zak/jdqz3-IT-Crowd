package pl.infoshare.generators.tests;

import org.junit.jupiter.api.Test;
import pl.infoshare.generators.AddressGenerator;
import pl.infoshare.generators.RandomGenerator;


import static org.assertj.core.api.Assertions.assertThat;

public class AddressGeneratorsTest {


    @Test
    void assertionsStreet() {
        String str = AddressGenerator.generateStreetAddress();
        String str1 = AddressGenerator.generateStreetAddress();
        Integer number = Integer.parseInt(str.substring(13,15));

        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str.length()).isBetween(12,16);
        assertThat(str.charAt(12)).isEqualTo(' ');
        assertThat(number).isBetween(4,250);
        assertThat(number).isGreaterThanOrEqualTo(4);
        assertThat(number).isNotEqualTo(0);

    }

    @Test
    void assertionsCountry() {
        String str = AddressGenerator.generateCountry();
        String str1 = AddressGenerator.generateCountry();

        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str).isIn("Belgium", "Brazil", "Czech Republic", "France", "India", "Italy");

    }

    @Test
    void assertionsPostalCode() {
        String str = AddressGenerator.generatePostalCode();
        String str1 = AddressGenerator.generatePostalCode();


        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str)
                .hasSize(6)
                .contains("-")
                .doesNotContainAnyWhitespaces();
    }
}
