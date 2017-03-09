package com.nested.staticexample;

public class Human {
    private Long identificationCode;

    private String firstName;
    private String lastName;
    private String gender;
    private Integer height;
    private Integer weight;
    private Integer age;

    private Human(Long identificationCode) {
        this.identificationCode = identificationCode;
    }

    // setters and getters


    @Override
    public String toString() {
        return "Human{" +
                "identificationCode=" + identificationCode +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private Long identificationCode;

        private String firstName;
        private String lastName;
        private String gender;
        private Integer height;
        private Integer weight;
        private Integer age;

        public Builder(Long identificationCode) {
            this.identificationCode = identificationCode;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        // other setters...

        public Human build() {
            Human human = new Human(this.identificationCode);
            human.firstName = this.firstName; // I have access to the outer's class private fields
            human.lastName = this.lastName;
            return human;
        }
    }

    public static void main(String[] args) {
        Human human = new Human.Builder(12345L).setFirstName("FirstName").setLastName("LastName").build();
        System.out.println(human.toString());
    }
}
