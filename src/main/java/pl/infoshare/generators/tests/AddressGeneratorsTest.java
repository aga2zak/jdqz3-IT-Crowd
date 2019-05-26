package pl.infoshare.generators.tests;

import org.junit.jupiter.api.Test;
import pl.infoshare.generators.AddressGenerator;


import static org.assertj.core.api.Assertions.assertThat;

public class AddressGeneratorsTest {


    @Test
    void assertionsStreet() {
        //given
        String str;
        String str1;
        Integer number;

        //when
        str = AddressGenerator.generateStreetAddress();
        str1 = AddressGenerator.generateStreetAddress();
        number = Integer.parseInt(str.substring(13,15));

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str.length()).isBetween(12,16);
        assertThat(str.charAt(12)).isEqualTo(' ');
        assertThat(number).isBetween(4,250);
        assertThat(number).isGreaterThanOrEqualTo(4);
        assertThat(number).isNotEqualTo(0);
        assertThat(str.charAt(0)).isUpperCase();

    }

    @Test
    void assertionsCountry() {
        //given
        String str;
        String str1;

        //when
         str = AddressGenerator.generateCountry();
         str1 = AddressGenerator.generateCountry();

         //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str.charAt(0)).isUpperCase();
        assertThat(str).isIn("Belgium", "Brazil", "Czech Republic", "France", "India", "Italy");

    }

    @Test
    void assertionsPostalCode() {
        //given
        String str;
        String str1;

        //when
        str = AddressGenerator.generatePostalCode();
        str1 = AddressGenerator.generatePostalCode();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str)
                .hasSize(6)
                .contains("-")
                .doesNotContainAnyWhitespaces();
    }

    @Test
    void assertionsState() {
        //given
        String str;
        String str1;

        //when
        str = AddressGenerator.generateState();
        str1 = AddressGenerator.generateState();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str.charAt(0)).isUpperCase();
        assertThat(str)
                .hasSize(9)
                .doesNotContainAnyWhitespaces();
    }
    @Test
    void assertionsCity() {
        //given
        String str;
        String str1;

        //when
        str = AddressGenerator.generateCity();
        str1 = AddressGenerator.generateCity();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str.charAt(0)).isUpperCase();
        assertThat(str)
                .hasSize(7)
                .doesNotContainAnyWhitespaces();
    }
}
