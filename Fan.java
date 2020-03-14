public class Fan
{
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan()
	{
		speed = SLOW;
		on = false;
		radius = 5.0;
		color = "blue";
	}

	public Fan(int s, boolean fanOn, double r,String c)
	{
		speed = s;
		on = fanOn;
		radius = r;
		color = c;
	}
	public int getSpeed()
	{
		return speed;
	}
	public boolean getOn()
	{
		return on;
	}
	public double getRadius()
	{
		return radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setSpeed(int s)
	{
		speed = s;
	}
	public void setOn(boolean fanOn)
	{
		on = fanOn;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public void setColor(String c)
	{
		color = c;
	}

	public String fanSpeed()
	{
		String str = " ";
		if(speed == SLOW) str = "SLOW";
		else if(speed == MEDIUM) str = "MEDIUM";
		else str = "FAST";
		return str;
	}

	public String toString()
	{
		String str = " ";
		if(on == true) str = str + "Fan Speed is " + fanSpeed()+" = "+ speed + " "+ "Fan Color is " + color + " Fan Radius is "+ radius;
		else str = str + "Fan Color is " + color + " Fan Radius is " + radius + " Fan is off";
		return str;
	}



}