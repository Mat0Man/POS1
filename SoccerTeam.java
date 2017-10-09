
/**
 * @author Matthias Ensinger 
 */
public class SoccerTeam
{
    private String name;
    private String country;
    private int foundation;
    private SoccerPlayer player1;
    private SoccerPlayer player2;
    private SoccerPlayer player3;
    
    public SoccerTeam()
    {
        setName("TestTeam");
        setCountry("Austria");
        setFoundation(0);
    }
    
    public SoccerTeam(String name, String country, int foundation)
    {
        setName(name);
        setCountry(country);
        setFoundation(foundation);
    }
    
    public void addPlayer(SoccerPlayer player)
    {
        if (player != null)
        {
            if (player1 == null)
            {
                player1 = player;
            } else if (player2 == null)
            {
                player2 = player;
            } else if (player3 == null)
            {
                player3 = player;
            } else
            {
                System.out.println("Team is already full!");
            }
        } else 
        {
            System.out.println("Input can't be empty!");
        }
    }
    
    public SoccerPlayer removePlayer(String name)
    {
        SoccerPlayer rueck;
        if (player1 != null && player1.getName().equals(name))
        {
            rueck = player1;
            player1 = null;
            return rueck;
        } else if (player2 != null && player2.getName().equals(name))
        {
            rueck = player2;
            player2 = null;
            return rueck;
        } else if (player3 != null && player3.getName().equals(name))
        {
            rueck = player3;
            player3 = null;
            return rueck;
        } else
        {
            System.out.println("No player has the name " + name + "!");
            return null;
        }
    }
    
    
    
    
    
    public void setFoundation(int input)
    {
        foundation = input;
    }
    
    public void setCountry(String input)
    {
        country = input;
    }
    
    public void setName(String input)
    {
        name = input;
    }
    
    public int getFoundation()
    {
        return foundation;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public String getName()
    {
        return name;
    }
    
    public SoccerPlayer getPlayer1()
    {
        return player1;
    }
    
    public SoccerPlayer getPlayer2()
    {
        return player2;
    }
    
    public SoccerPlayer getPlayer3()
    {
        return player3;
    }
    
    public void print()
    {
        System.out.println("Team Name: " + name);
        System.out.println("Team country: " + country);
        System.out.println("Team foundation: " + foundation);
        //System.out.println("Player 1: " + foundation);
        if (player1 != null)
        {
            System.out.println("###### Player 1: ");
            player1.print();
        }
        
        if (player2 != null)
        {
            System.out.println("###### Player 2: ");
            player2.print();
        }
        
        if (player3 != null)
        {
            System.out.println("###### Player 2: ");
            player3.print();
        }
    }
}
