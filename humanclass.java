package FinalProject;

public class humanclass extends Object implements humanInterface{
	

	//No args constructor
	public humanclass() {
		//nothing
	}
	
	//Create constructor
	public humanclass(String name, int hitPoints, int attack, int prize) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attack = attack;
		this.prize = prize;
	}
	
	//Create method so player earns ONE prize
	public void prizeAmmount(humanclass player) {
		player.prize = prize +1;
	}

	//Method that takes away Corona's hit points when player attacks
	@Override
	public void useAttackCorona(humanclass player, corona coronaAlt) {
		// TODO Auto-generated method stub
		coronaAlt.hitPoints = coronaAlt.hitPoints - player.getAttack();
	}

	//Method when Player attacks commonFlu. Takes away hit points
	@Override
	public void useAttackCommon(humanclass player, commonCold commonFlu2) {
		// TODO Auto-generated method stub
		commonFlu2.hitPoints = commonFlu2.hitPoints - player.getAttack();
	}
	
	//Consider adding an array list for prizes to keep total amount of prices collected by a monster being defeated
}
