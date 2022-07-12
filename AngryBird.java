public class AngryBird 

{

    private String color;
    public int x;
    public int y;
    private int speed;
    private int strength;
    
    public AngryBird(String color)
    {
        this.color = "Red";
        if(color.equals("Red") || color.equals("Yellow") || color.equals("Blue"))
        this.color = color;
        this.x = 2;
        this.y = 5;
        this.speed = (this.color == "Yellow")? 5:3;
        this.strength = (this.color == "Red")? 5:3;

    }
    public AngryBird(AngryBird a)
    {
        this.color = a.color;
        this.x = a.x;
        this.y = a.y;
        this.speed = a.speed;
        this.strength = a.strength;
    }
    public String getColor()
    {

        return this.color;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public void launch(double angleInRadians)
    {
        this.x += this.speed * Math.cos(angleInRadians);
        this.y += this.speed * Math.sin(angleInRadians);
    }
    public AngryBird[] scatter()
    {
        AngryBird[] birds = null;
        if(this.color == "Blue")
        {
            birds = new AngryBird[3];
            for(int i =0; i < birds.length; i++)
            {
                birds[i] = new AngryBird(this);
                birds[i].strength = 1;
            }
        }
        return birds;
    }
    @Override
    public String toString()
    {
        return "Color: "+ this.color+"; x = "+this.x+"; y = "+this.y+"; str = "+this.strength;

    }

}

