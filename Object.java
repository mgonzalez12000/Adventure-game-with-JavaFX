package FinalProject;

//This is the abstract class that each object will use
//Objects are Corona, CommonCold, and Player
public class Object {
	public String name;
	public int hitPoints;
	public int attack;
	public int prize;
	
	//Use proper encapsulation
	//Use getters and setter
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public int getPrize() {
		return prize;
	}
	
	public void setPrize(int prize) {
		this.prize = prize;
	}
	
}
