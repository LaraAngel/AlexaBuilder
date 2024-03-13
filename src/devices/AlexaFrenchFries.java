package devices;

import builder.AlexaBuilder;

public class AlexaFrenchFries {
    private Boolean hasCatsun;
    private Boolean hasMustard;
    private Boolean hasSalt;
    private Integer price;

    @Override
    public String toString() {
        return "AlexaFrenchFries{" +
                "hasCatsun=" + hasCatsun +
                ", hasMustard=" + hasMustard +
                ", hasSalt=" + hasSalt +
                ", price=" + price +
                "}\n";
    }

    public static class AlexaFrenchFriesBuilder {
        private AlexaFrenchFries frenchFries = new AlexaFrenchFries();
        protected AlexaBuilder parentBuilder = new AlexaBuilder();

        public AlexaFrenchFriesBuilder(AlexaBuilder parentBuilder) {
            this.parentBuilder = parentBuilder;
        }

        public AlexaFrenchFriesBuilder addCatsun() {
            frenchFries.hasCatsun = true;
            return this;
        }
        public AlexaFrenchFriesBuilder addMustard() {
            frenchFries.hasMustard = true;
            return this;
        }
        public AlexaFrenchFriesBuilder addSalt() {
            frenchFries.hasSalt = true;
            return this;
        }
        public AlexaFrenchFriesBuilder addPrice(Integer price) {
            frenchFries.price = price;
            return this;
        }
        public AlexaBuilder buildAlexaFrenchFries() {
            parentBuilder.saveFrenchFries(frenchFries);
            return parentBuilder;
        }
    }
}
