package FinalProject;

public class corona extends Object implements virusInterface {
	//Create no args constructor 
	public corona() {
		//nothing
	}
	
	//Create constructor
	public corona (String name, int hitPoints, int attack) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attack = attack;
	}
	
	//Create method Corona attacks
	@Override
	public void useAttackCorona2(humanclass player, corona coronaAlt) {
		// TODO Auto-generated method stub
		player.hitPoints = player.hitPoints - coronaAlt.getAttack();
	}
	
	@Override
	public void useAttackCommon2(humanclass player, commonCold commonFlu2) {
		// TODO Auto-generated method stub
		
	}

}
