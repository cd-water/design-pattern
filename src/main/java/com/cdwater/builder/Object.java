package com.cdwater.builder;

/**
 * 对象类
 */
public class Object {
    private String property1;
    private String property2;
    private String property3;

    private Object(Builder builder) {
        this.property1 = builder.property1;
        this.property2 = builder.property2;
        this.property3 = builder.property3;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }

    @Override
    public String toString() {
        return "Object{" +
                "property1='" + property1 + '\'' +
                ", property2='" + property2 + '\'' +
                ", property3='" + property3 + '\'' +
                '}';
    }

    public static class Builder {
        private String property1;
        private String property2;
        private String property3;

        public Builder property1(String property1) {
            this.property1 = property1;
            return this;
        }

        public Builder property2(String property2) {
            this.property2 = property2;
            return this;
        }

        public Builder property3(String property3) {
            this.property3 = property3;
            return this;
        }

        public Object build() {
            return new Object(this);
        }
    }
}