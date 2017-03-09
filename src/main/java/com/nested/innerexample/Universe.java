package com.nested.innerexample;

/**
 * Created by miruna on 3/8/2017.
 */
public class Universe {
    private String name = "I'm the Universe";

    public class Earth {
        private String name = "I'm the Earth";

        public void printName() {
            System.out.println(this.name); // inner class shadowing
            System.out.println(Universe.this.name);
        }
    }

    public static void main(String[] args) {

        // new Human.Builder
        // new Universe.Earth

        Universe universe = new Universe();
        Universe.Earth earth =  universe.new Earth(); // new Universe().new Earth()
        earth.printName();
    }
}
