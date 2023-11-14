package question3;

public class Details {
    
    public static void main(String[] args) {
        Country country1 = new Country("Ghana", 567.6, 7.43);
        Country country2 = new Country("Togo", 7956.1, 5.67);
        Country country3 = new Country("Japan", 866.0, 5.09);
        Country country4 = new Country("Mali", 2456, 9.62);

        Country[] countries = {country1, country2, country3, country4};

         checkArea(countries);


    }

    public static void checkArea(Country[] countries){
        Country largestAreaCountry = null;
        double largestArea = 0.0;

        for (int i = 0; i < countries.length; i++){
            Country country = countries[i];
            if (country.getArea() > largestArea){
                largestArea = country.getArea();
                largestAreaCountry = country;
            }
        }

        System.out.println("The country with the largest area is: " + largestAreaCountry.getName());
        checkPopulation(countries);
        checkPopuationDensity(countries);

    }

    public static void checkPopulation(Country[] countries){
        Country largestPopulationCountry = null;
        double largetsPopulation = 0.0;

        for (int i = 0; i < countries.length; i++){
            Country country = countries[i];
            if (country.getPopulation() > largetsPopulation){
                largetsPopulation = country.getPopulation();
                largestPopulationCountry = country;
            }
        }

        System.out.println("The country with the largest population is: " + largestPopulationCountry.getName());

    }

    public static void checkPopuationDensity(Country[] countries){
        Country largestDensityCountry = null;
        double largestDensity = 0.0;

        for (int i = 0; i < countries.length; i++){
            Country country = countries[i];
            if (country.getPopulationDensity() > largestDensity){
                largestDensity = country.getPopulationDensity();
                largestDensityCountry = country;
            }
        }

        System.out.println("The country with the largest population density is: " + largestDensityCountry.getName());

    }
}
