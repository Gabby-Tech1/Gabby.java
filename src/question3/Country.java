package question3;

public class Country {
    private String name;
    private double population;
    private double area;

    public Country(String name, double population, double area){
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName(){
        return name;
    }

    public double getPopulation(){
        return population;
    }

    public double getArea(){
        return area;
    }

    public double getPopulationDensity(){
        return population/area;
    }

    

    
}
