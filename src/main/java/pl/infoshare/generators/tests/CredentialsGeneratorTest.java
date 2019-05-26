package pl.infoshare.generators.tests;

import org.junit.jupiter.api.Test;
import pl.infoshare.generators.CredentialsGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class CredentialsGeneratorTest {

    @Test
    void assertionsFirstName() {
        //given
        String str;
        String str1;

        //when
        str = CredentialsGenerator.generateFirstname();
        str1 = CredentialsGenerator.generateFirstname();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str.charAt(0)).isUpperCase();
        assertThat(str)
                .hasSize(8)
                .doesNotContainAnyWhitespaces();

    }

    @Test
    void assertionsLastName() {
        //given
        String str;
        String str1;

        //when
        str = CredentialsGenerator.generateLastname();
        str1 = CredentialsGenerator.generateLastname();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str.charAt(0)).isUpperCase();
        assertThat(str)
                .hasSize(14)
                .doesNotContainAnyWhitespaces();

    }

    @Test
    void assertionsEmail() {
        //given
        String str;
        String str1;

        //when
        str = CredentialsGenerator.generateEmail();
        str1 = CredentialsGenerator.generateEmail();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str)
                .hasSize(19)
                .contains("@test.com")
                .doesNotContainAnyWhitespaces();

    }

    @Test
    void assertionsPassword() {
        //given
        String str;
        String str1;

        //when
        str = CredentialsGenerator.generatePassword();
        str1 = CredentialsGenerator.generatePassword();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str).isEqualToIgnoringCase(str);
        assertThat(str)
                .hasSize(12)
                .doesNotContainAnyWhitespaces();

    }

    @Test
    void assertionsPhoneNumber() {
        //given
        String str;
        String str1;

        //when
        str = CredentialsGenerator.generatePhoneNumber();
        str1 = CredentialsGenerator.generatePhoneNumber();

        //then
        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str)
                .hasSize(9)
                .contains(str).containsOnlyDigits()
                .doesNotContainAnyWhitespaces();

    }
}
