public class VirtualPet {
   private String name;
  private int energy;
  private int weight;
  private int happiness;
  private int ageMonths;
  private int ageYears;

  public VirtualPet(String name){
      this.name = name;
      this.energy = 0;
      this.weight = 5;
      this.happiness = 0;
      this.ageMonths = 0;
      this.ageYears = 0;
  }

  public String getName(){
      return name;
  }
  
  public String toString(){
      return name + "'s information: \nEnergy: " + energy + "\nweight: " + weight 
      + "\nHappiness: " + happiness + "\nAge: " + ageYears + " years and " + 
      ageMonths + " months";
  }
  
  public int getEnergyLevel(){
      return energy;
  }
  
  public int getHappinessLevel(){
      return happiness;
  }
  
  public int getWeight() {
    return weight;
  }
  
  public int getAgeYears() {
    return ageYears;
  }
  
  public int getAgeMonths() {
    return ageMonths; 
  }
  
  public void feed(Food other){
      if (energy < 10){
        energy+= other.getEnergyIncrease();
        weight+= other.getWeightGain();
        happiness+= other.getHappinessIncrease();
        if (happiness > 10){
            happiness = 10;
        }
      }
