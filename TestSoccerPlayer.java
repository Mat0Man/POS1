public class TestSoccerPlayer
{

    public TestSoccerPlayer() {
        SoccerPlayer sp; 
        /*
        sp = new SoccerPlayer();
        sp.print();
        
        sp.setName("Lionel Messi");
        sp.print();
        
        sp.setAge(30);
        sp.print();
        
        sp.setStrength(96);
        sp.print();
        
        sp.setStrength(10);
        sp.print();
        sp.setAge(15);
        sp.print();
        
        sp.setStrength(51);
        sp.print();
        */
        sp = new SoccerPlayer("Cristiano Ronaldo", 32, "Goalkeeper");
        sp.setStrength(98);
        sp.print();
        
        sp.setAge(15);
        sp.print();
        
    }

}
