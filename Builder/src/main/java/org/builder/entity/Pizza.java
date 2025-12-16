package org.builder.entity;

public class Pizza {

    private boolean cheese;
    private boolean bacon;
    private boolean pineapple;
    private boolean mushrooms;
    private boolean seafood;

    public Pizza(Builder builder) {
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.pineapple = builder.pineapple;
        this.mushrooms = builder.mushrooms;
        this.seafood = builder.seafood;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese=" + cheese +
                ", bacon=" + bacon +
                ", pineapple=" + pineapple +
                ", mushrooms=" + mushrooms +
                ", seafood=" + seafood +
                '}';
    }

    public static class Builder {

        private boolean cheese;
        private boolean bacon;
        private boolean pineapple;
        private boolean mushrooms;
        private boolean seafood;

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addBacon() {
            this.bacon = true;
            return this;
        }

        public Builder addPineapple() {
            this.pineapple = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Builder addSeafood() {
            this.seafood = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
