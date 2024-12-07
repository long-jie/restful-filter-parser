package org.capybara.restful.filter;

import lombok.Getter;
import lombok.Setter;

/**
 * example:
 * <code>
 * (fieldName operator fieldValue) and (fieldName operator fieldValue)
 * </code>
 *
 * @author long jie
 * @since 2024/12/7 15:29
 */
@Getter
@Setter
public class RestFilter {

    protected String fieldName;
    protected String operator;
    protected String fieldValue;

    public RestFilter(String fieldName, String operator, String fieldValue) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.fieldValue = fieldValue;
    }

    public RestFilter or(RestFilter filter) {
        return new RestFilterLogic(fieldName, operator, fieldValue, this, "OR", filter);
    }

    public RestFilter and(RestFilter filter) {
        return new RestFilterLogic(fieldName, operator, fieldValue, this, "AND", filter);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", fieldName, operator, fieldValue);
    }

    @Getter
    private static class RestFilterLogic extends RestFilter {

        private final RestFilter left;
        private final String logicOperator;
        private final RestFilter right;

        public RestFilterLogic(String fieldName, String operator, String fieldValue, RestFilter left, String logicOperator, RestFilter right) {
            super(fieldName, operator, fieldValue);
            this.left = left;
            this.logicOperator = logicOperator;
            this.right = right;
        }

        @Override
        public String toString() {
            return String.format("(%s %s %s)", left.toString(), logicOperator, right.toString()); // 中序遍历
        }

    }

}
