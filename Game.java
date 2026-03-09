public class Game{
    private String name;
    private int happinessIncrease;
    private int weightDecrease;
    
    public Game(String name, int happinessIncrease, int weightDecrease){
        this.name = name;
        this.happinessIncrease = happinessIncrease;
        this.weightDecrease = weightDecrease;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHappinessIncrease(){
        return happinessIncrease;
    }
    
    public int getWeightDecrease(){
        return weightDecrease;
    }
    
    public boolean isWinner(){
        return Math.random() < 0.5;
    }
}
