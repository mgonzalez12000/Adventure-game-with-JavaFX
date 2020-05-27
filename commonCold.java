package FinalProject;
//Seems to be fine
public class commonCold extends Object implements virusInterface {
	
	//No args constructor
	public commonCold() {
		
	}
	
	//Constructor
	public commonCold(String name, int hitPoints, int attack) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attack = attack;
		
	}

	//Common Flu attacks player. Takes away player's hit points
	@Override
	public void useAttackCommon2(humanclass player, commonCold commonFlu2) {
		// TODO Auto-generated method stub
		player.hitPoints = player.getHitPoints() - commonFlu2.getAttack();
	}
	
	@Override
	public void useAttackCorona2(humanclass player, corona coronaAlt) {
		// TODO Auto-generated method stub
		
	}

}
