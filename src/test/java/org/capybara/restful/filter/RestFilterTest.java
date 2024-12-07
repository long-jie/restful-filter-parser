package org.capybara.restful.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestFilterTest {

    @Test
    void testToString() {
        // f1 eq 'v1' OR f2 nq 'v2' AND f3 eq 'v3'
        RestFilter restFilter1 = new RestFilter("f1", "eq", "v1");
        restFilter1 = restFilter1.or(new RestFilter("f2", "nq", "v2"));
        restFilter1 = restFilter1.and(new RestFilter("f3", "le", "v3"));
        assertEquals("((f1 eq v1 OR f2 nq v2) AND f3 le v3)", restFilter1.toString());
        assertEquals("f1", restFilter1.getFieldName());

        RestFilter restFilter2 = new RestFilter("f11", "eq", "v11");
        restFilter2 = restFilter2.or(new RestFilter("f12", "nq", "v12"));
        restFilter2 = restFilter2.and(new RestFilter("f13", "le", "v13"));
        assertEquals("((f11 eq v11 OR f12 nq v12) AND f13 le v13)", restFilter2.toString());
        assertEquals("f11", restFilter2.getFieldName());

        restFilter1 = restFilter1.and(restFilter2);
        assertEquals("f1", restFilter1.getFieldName());
        assertEquals("(((f1 eq v1 OR f2 nq v2) AND f3 le v3) AND ((f11 eq v11 OR f12 nq v12) AND f13 le v13))", restFilter1.toString());
    }

}