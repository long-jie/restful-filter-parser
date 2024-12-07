package org.capybara.restful.filter.builder;

import org.capybara.restful.filter.RestFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestFilterBuilderTest {

    @Test
    void getRestFilter() {
        RestFilter restFilter = RestFilterBuilder.buildRestFilter("((f1 eq 12 OR f2 nq 'v2') AND f3 eq true)");
        assertEquals("((f1 eq 12 OR f2 nq 'v2') AND f3 eq true)", restFilter.toString());
    }

    @Test
    void getRestFilterContainsNull() {
        RestFilter restFilter = RestFilterBuilder.buildRestFilter("((f1 eq 12 OR f2 nq 'null') AND f3 eq null)");
        assertEquals("((f1 eq 12 OR f2 nq 'null') AND f3 eq null)", restFilter.toString());
    }

}