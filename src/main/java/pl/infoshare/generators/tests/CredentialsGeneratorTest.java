package pl.infoshare.generators.tests;

import org.junit.jupiter.api.Test;
import pl.infoshare.generators.CredentialsGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class CredentialsGeneratorTest {

    @Test
    void assertionsFirstName() {
        String str = CredentialsGenerator.generateFirstname();
        String str1 = CredentialsGenerator.generateFirstname();

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
        String str = CredentialsGenerator.generateLastname();
        String str1 = CredentialsGenerator.generateLastname();

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
        String str = CredentialsGenerator.generateEmail();
        String str1 = CredentialsGenerator.generateEmail();

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
        String str = CredentialsGenerator.generatePassword();
        String str1 = CredentialsGenerator.generatePassword();

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
        String str = CredentialsGenerator.generatePhoneNumber();
        String str1 = CredentialsGenerator.generatePhoneNumber();

        assertThat(str).isNotBlank();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotEqualTo(str1);
        assertThat(str)
                .hasSize(9)
                .contains(str).containsOnlyDigits()
                .doesNotContainAnyWhitespaces();

    }
}
