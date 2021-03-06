package io.dropwizard.views;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ViewTest {
    private final View view = new View("/blah.tmp") {
    };

    @Test
    void hasATemplate() throws Exception {
        assertThat(view.getTemplateName())
                .isEqualTo("/blah.tmp");
    }
}
