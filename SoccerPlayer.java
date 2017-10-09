

/**
 * 2017-09-28
 * Code zur Aufgabe SoccerPlayer
 * Ein Problem mit dieser Klasse gilt es noch zu beheben! (HÜ bis 2.10.2017)
 */
public class SoccerPlayer
{
    private String name;
    private int age;
    private String position;
    private int strength;
    private int technique;
    private int condition;
    private int strategy;
    
    public SoccerPlayer() {
        setName("n/a");
        setAge(18);
        setPosition("Striker");
        technique = 30;
        condition = 30;
        strategy = 40;
    }
     
    
    public SoccerPlayer(String name, int age, String position) {
        setName(name);
        setAge(age);
        setPosition(position);
    }
    
    public void setAttributes(int tech, int cond, int strat)
    {
        if (tech >= 0 && tech <=100 && cond >= 0 && cond <=100 && strat >= 0 && strat <=100)
        {
            if ((tech + cond + strat) !=100)
            {
                System.out.println("The sum of technique, condition and strategy has to be 100!");
            }
        } else 
        {
            System.out.println("Input has to be in a range from 0 to 100!");
        }
    }
    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        if (age < 12 || age > 45) { // invalid argument
            System.err.println("Age " + age + " not in range 12 to 45");
            System.err.println("Setting age to default value 18");
            age = 18;
        } else if ((getStrength() >= 50 && age < 16) 
                   || (getStrength() >= 80 && age < 18)) 
        { // inconsistent state
            System.err.println("Strength is " + getStrength() + ". Cannot set age to " + age);
        
        } else { // standard case
            this.age = age;
        }
    }
    
    public int getAge() {
        return this.age;
    }

    public void setPosition(String pos) {
        if (pos != null) {
            if (pos.equals("Striker") 
                || pos.equals("Midfielder")
                || pos.equals("Defender")
                || pos.equals("Goalkeeper"))
            {
                this.position = pos;
            } else {
                System.err.println("Invalid value " + pos 
                                   + " for position");
            }
        } else {
            System.err.println("Invalid paramter: null");
        }
    }
    
    public String getPosition() {
        return this.position;
    }
    
    /*
     * Unter 18 Jahren kann die Staerke maximal 80 betragen, 
     * unter 16 Jahren maximal 50 */
    public void setStrength(int strength) {
        if (strength < 0 || strength > 100) {
            // error case
            System.err.println("Invalid value " + strength 
                               + " for attribute strength");
            this.strength = 0;
        } else {
            // standard case
            if ((getAge() < 16 && strength <= 50)
                || (getAge() >= 16 && getAge() < 18 && strength <= 80)
                || (getAge() >= 18)) 
            {
                this.strength = strength;
            } else {
                System.err.println("Invalid value " + strength 
                                   + " regarding age " + getAge());
                this.strength = 0;
            }
            print();
        }
    }
    
    public int getStrength() {
        return this.strength;
    }
    
    public void print() {
        System.out.println("name: " + getName() 
                           + ", age: " + getAge()
                           + ", position: " + getPosition()
                           + ", strength: " + getStrength());
    }
    
    
    
    
    
    
}
