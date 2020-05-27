package FinalProject;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Map extends Application {
	//Here is where will work with the ap layout
	public void start(Stage primaryStage) throws Exception{
		//Create pane
		BorderPane BP = new BorderPane();
		
		//Creating GridPane using a 
		GridPane map = new GridPane();
		//Create matrix 
		for (int row = 0; row<8; row++) {
			for (int coloumn = 0; coloumn<8; coloumn++) {
				Rectangle squares = new Rectangle();
				squares.setFill(Color.GREEN);
				squares.setStroke (Color.WHITE);
				squares.setWidth(80);
				squares.setHeight(80);
				map.add(squares, row, coloumn);
			}
		}
		
		
		//Create random locations for circle objects
		Random random = new Random();
		int random1 = random.nextInt(5)+1;
		int random2 = random.nextInt(5)+1;
		int random3 = random.nextInt(5)+1;
		int random4 = random.nextInt(5)+1;
		int random5 = random.nextInt(5)+1;
		int random6 = random.nextInt(5)+1;
		int random7 = random.nextInt(5)+1;
		int random8 = random.nextInt(5)+1;
		//Create random positions for objects
		int random9 = random.nextInt(5)+1;
		int random10 = random.nextInt(5)+1;
		int random11 = random.nextInt(5)+1;
		int random12 = random.nextInt(5)+1;
		int random13 = random.nextInt(5)+1;
		int random14 = random.nextInt(5)+1;
		
		
		//Create obstacle objects
		Rectangle obstacle1 = new Rectangle();
		obstacle1.setStroke(Color.BLACK);
		obstacle1.setFill(Color.BLACK);
		//Set random positioning
		obstacle1.setLayoutX(((2*random9)+1)*40);
		obstacle1.setLayoutY(((2*random10)+1)*40);
		obstacle1.setLayoutX(obstacle1.getLayoutX()+67);
		obstacle1.setLayoutY(obstacle1.getLayoutY()-20);
		//Set width and height for rectangle
		obstacle1.setWidth(35);
		obstacle1.setHeight(35);
		obstacle1.setVisible(false);
	
		
		Rectangle obstacle2 = new Rectangle();
		//Create obstacle objects
		obstacle2.setStroke(Color.BLACK);
		obstacle2.setFill(Color.BLACK);
		//Set random positioning
		obstacle2.setLayoutX(((2*random11)+1)*40);
		obstacle2.setLayoutY(((2*random12)+1)*40);
		obstacle2.setLayoutX(obstacle2.getLayoutX()+67);
		obstacle2.setLayoutY(obstacle2.getLayoutY()-20);
		//Set width and height for rectangle
		obstacle2.setWidth(35);
		obstacle2.setHeight(35);
		obstacle2.setVisible(false);
		
		
		Rectangle obstacle3 = new Rectangle();
		//Create obstacle objects
		obstacle3.setStroke(Color.BLACK);
		obstacle3.setFill(Color.BLACK);
		//Set random positioning
		obstacle3.setLayoutX(((2*random13)+1)*40);
		obstacle3.setLayoutY(((2*random14)+1)*40);
		obstacle3.setLayoutX(obstacle3.getLayoutX()+67);
		obstacle3.setLayoutY(obstacle3.getLayoutY()-20);
		//Set width and height for rectangle
		obstacle3.setWidth(35);
		obstacle3.setHeight(35);
		obstacle3.setVisible(false);
		
		
		//Create the viruses
		//COVID-19
		//At. for player
		corona coronaAlt = new corona("Corona", 100,20);
		//Create rectnagle object
		Rectangle Corona = new Rectangle(35, 35, Color.PURPLE);
		//Set stroke for Corona
		Corona.setStroke(Color.BLACK);
		//Set random positioning
		Corona.setLayoutX(((2*random1)+1)*40);
		Corona.setLayoutY(((2*random2)+1)*40);
		Corona.setLayoutX(Corona.getLayoutX()+67);
		Corona.setLayoutY(Corona.getLayoutY()-20);
		//Set visibility to false
		Corona.setVisible(false);
		
		
		//Common Flu
		//Alt. for common flu
		commonCold commonFlu2 = new commonCold ("Common Flu", 100,20);
		//Create common flu object
		Rectangle CommonFlu = new Rectangle(35, 35, Color.BLUE);
		//Set Stroke Color
		CommonFlu.setStroke(Color.BLACK);
		//Set random positioning
		CommonFlu.setLayoutX(((2*random3)+1)*40);
		CommonFlu.setLayoutY(((2*random4)+1)*40);
		CommonFlu.setLayoutX(CommonFlu.getLayoutX()+67);
		CommonFlu.setLayoutY(CommonFlu.getLayoutY()-20);
		//Set Visibility false
		CommonFlu.setVisible(false);

		
		//Create starting point for human
		Label start = new Label("S");
		start.setTextFill(Color.WHITE);
		//Same position as the human
		start.setLayoutX(((2*random5)+1)*40);
		start.setLayoutY(((2*random6)+1)*40);
		start.setLayoutX(start.getLayoutX()+85);
		start.setLayoutY(start.getLayoutY()-0);
		//Create ending point for human
		Label end = new Label("G");
		end.setTextFill(Color.WHITE);
		end.setLayoutX(((2*random7)+1)*40);
		end.setLayoutY(((2*random8)+1)*40);
		end.setLayoutX(start.getLayoutX()+85);
		end.setLayoutY(start.getLayoutY()-0);
		
		//Create winner and loser labels
		Label winner = new Label("WINNER! You have escaped!  ");
		winner.setVisible(false);
		Label loser = new Label("You have not collected your 2 prizes yet!  ");
		loser.setTextFill(Color.RED);
		loser.setVisible(false);
		
		
		//Human object
		//At. for player
		humanclass player = new humanclass("Player", 200, 20,0);
		//Create human
		Circle human = new Circle(25, Color.TAN);
		human.setStroke(Color.BLACK);
		//Set random positioning
		human.setLayoutX(((2*random5)+1)*40);
		human.setLayoutY(((2*random6)+1)*40);
		human.setLayoutX(human.getLayoutX()+85);
		human.setLayoutY(human.getLayoutY()-0);
		
		
		Label humanTrackerCoord = new Label();
		humanTrackerCoord.setVisible(true);
	
		
		//Create pane for the virus objects
		Pane paneForObjects = new Pane();
		//Add objects to paneForObjects to the matrix
		paneForObjects.getChildren().addAll(Corona, CommonFlu, human,start, end, obstacle1, obstacle2, obstacle3);
		
		
		//Create button objects to control player
		Button Up = new Button("Up");
		Button Down = new Button("Down");
		Button Left = new Button("Left");
		Button Right = new Button ("Right");
		Button debug = new Button("Debug ON");
		Button debugOff = new Button("Debug OFF");
		//Create vbox for directional buttons
		HBox Hbox = new HBox();
		Hbox.setPadding(new Insets(19,19,19,19));
		Hbox.setStyle("-fx-border-color: black");
		Hbox.getChildren().addAll(Up, Down, Left, Right, debug, debugOff);
		//Set vbox to the bottom
		BP.setBottom(Hbox);
		
		
		//Create labels
		Label message = new Label("Can you escape from the viruses?");
		message.setLayoutX(800);
		message.setLayoutY(100);
		Label instructionsForCorona = new Label("You have encountered the Corona Virus! Fight it?  ");
		instructionsForCorona.setVisible(false);
		Label instructionsForHuman = new Label("");
		instructionsForHuman.setVisible(true);
		Label coronaPrize = new Label("You have won a vaccine");
		coronaPrize.setVisible(false);
		coronaPrize.setTextFill(Color.MAGENTA);
		Label instructionsForCommonFlu = new Label("You have encountered the Common Flu! Fight it?  ");
		instructionsForCommonFlu.setVisible(false);
		Label commonFluPrize = new Label("You have won a NyQuil bottle");
		commonFluPrize.setVisible(false);
		commonFluPrize.setTextFill(Color.MAGENTA);
		Label hitWall = new Label("You hit a wall!!!");
		hitWall.setVisible(false);
		hitWall.setTextFill(Color.RED);
		Label hitWall2 = new Label("You hit a wall!!!");
		hitWall2.setVisible(false);
		hitWall2.setTextFill(Color.RED);
		Label hitWall3 = new Label("You hit a wall!!!");
		hitWall3.setVisible(false);
		hitWall3.setTextFill(Color.RED);
		
		//Created prize objects 
		Rectangle NyQuil = new Rectangle();
		NyQuil.setWidth(30);
		NyQuil.setHeight(50);
		NyQuil.setStroke(Color.BLACK);
		NyQuil.setFill(Color.PINK);
		NyQuil.setVisible(false);
		Rectangle Vaccine = new Rectangle();
		Vaccine.setWidth(8);
		Vaccine.setHeight(50);
		Vaccine.setStroke(Color.BLACK);
		Vaccine.setFill(Color.AQUA);
		Vaccine.setVisible(false);
		
		
		//Attack buttons
		//Create Vbox for the attack buttons
		VBox vboxAttackButtons = new VBox();
		//Create attack buttons
		Button attackCorona = new Button("Hit Corona");
		attackCorona.setVisible(false);
		Button attackCommonFlu = new Button("Hit Common Flu");
		attackCommonFlu.setVisible(false);
		Button confirm = new Button("Confirm");
		confirm.setVisible(false);
		Button exit = new Button ("EXIT GAME");
		exit.setVisible(false);
		
		
		//Add everything to the VBox
		vboxAttackButtons.getChildren().addAll(message, instructionsForHuman, instructionsForCorona, attackCorona,instructionsForCommonFlu, attackCommonFlu ,  hitWall, hitWall2, hitWall3, coronaPrize, Vaccine, commonFluPrize, NyQuil, loser, confirm, humanTrackerCoord, winner, exit);
		BP.setRight(vboxAttackButtons);
		
		
		//Add all the panes to the main pane
		BP.getChildren().addAll(map, paneForObjects);
		
		
		//Button Action Event for up button
		Up.setOnAction(new EventHandler <ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				
				//Create tracker circle to add to the pane
				Circle tracker = new Circle(10, Color.TAN);
				tracker.setStroke(Color.BLACK);
				//Create tracker
				tracker.setLayoutX(human.getLayoutX());
				tracker.setLayoutY(human.getLayoutY());
				paneForObjects.getChildren().add(tracker);				
				//Move object Up
				human.setLayoutY(human.getLayoutY()-80);
				//Coordinates tracker
				humanTrackerCoord.setText("Coordinates for Player: " + human.getLayoutX() + ", " + human.getLayoutY());
				//Dont let objects touch obstacle
				if(human.getLayoutX()-18 == obstacle1.getLayoutX() && human.getLayoutY()-20 == obstacle1.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()+80);
					hitWall.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle2.getLayoutX() && human.getLayoutY()-20 == obstacle2.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()+80);
					hitWall2.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle3.getLayoutX() && human.getLayoutY()-20 == obstacle3.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()+80);
					hitWall3.setVisible(true);
				}
				//Keep object within the boundaries
				if(human.getLayoutY()<40) {
					human.setLayoutY(human.getLayoutY()+80);
				}
				
				//Human object lands on goal
				if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() == 2) {
					//set false
					instructionsForHuman.setVisible(false);
					instructionsForCommonFlu.setVisible(false);
					instructionsForCorona.setVisible(false);
					attackCorona.setVisible(false);
					coronaPrize.setVisible(false);
					Vaccine.setVisible(false);
					commonFluPrize.setVisible(false);
					NyQuil.setVisible(false);
					loser.setVisible(false);
					confirm.setVisible(false);
					hitWall.setVisible(false);
					hitWall2.setVisible(false);
					hitWall3.setVisible(false);
					humanTrackerCoord.setVisible(false);
					human.setVisible(false);
					
					//set visible true
					winner.setTextFill(Color.GREEN);
					winner.setVisible(true);
					//Set exit button visible 
					exit.setVisible(true);
				}
				
				else if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() < 2) {
					loser.setVisible(true);
					confirm.setVisible(true);
				}

				
				//Used to find and debug coordinates to match if statements 
				
//				System.out.println("Human X " + human.getLayoutX());
//				System.out.println("Corona X " + Corona.getLayoutX());
//				
//				System.out.println("Human Y " + human.getLayoutY());
//				System.out.println("Corona Y "+ Corona.getLayoutY());
				
				
//				System.out.println("human X "+ human.getLayoutX());
//				System.out.println("end X " + end.getLayoutX());
//	
//				System.out.println("human Y " + human.getLayoutY());
//				System.out.println("end Y " + end.getLayoutY());
				
				
				//Object lands on a Corona
				if(human.getLayoutX()-18 == Corona.getLayoutX() && human.getLayoutY()-20 == Corona.getLayoutY()) {
					//"You have encountered the Corona Virus! Fight it?" LABEL will appear on the screen
					instructionsForCorona.setVisible(true);
					//Button to attack Corona will appear
					attackCorona.setVisible(true);
					//Event handler for attacking the Corona
					attackCorona.setOnAction(new EventHandler<ActionEvent>()
							{
								@Override
								public void handle(ActionEvent arg0) {
									// TODO Auto-generated method stub
									
									Random rand = new Random();
									switch (rand.nextInt(2)+1){
									
									case 1: 
										player.useAttackCorona(player, coronaAlt);
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										break;
									
									case 2:
										coronaAlt.useAttackCorona2(player, coronaAlt);
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										
									}
	
									if(coronaAlt.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForCorona.setText("The Corona Virus has been defeated.  ");
										Corona.setVisible(false);
										coronaPrize.setVisible(true);
										Vaccine.setVisible(true);
										player.prizeAmmount(player);
										BP.getChildren().remove(Corona);
									}
									
									if(player.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForHuman.setTextFill(Color.RED);
										instructionsForHuman.setText("You died!  ");
										instructionsForCorona.setVisible(false);
										instructionsForCommonFlu.setVisible(false);
										attackCorona.setVisible(false);
										coronaPrize.setVisible(false);
										Vaccine.setVisible(false);
										commonFluPrize.setVisible(false);
										NyQuil.setVisible(false);
										loser.setVisible(false);
										confirm.setVisible(false);
										hitWall.setVisible(false);
										hitWall2.setVisible(false);
										hitWall3.setVisible(false);
										humanTrackerCoord.setVisible(false);
										human.setVisible(false);
										exit.setVisible(true);
								}
								}
							});
				}
				//Else if human lands on commonFlu
				else if(human.getLayoutX()-18 == CommonFlu.getLayoutX() && human.getLayoutY()-20 == CommonFlu.getLayoutY()){
					//"You have encountered the Common Flu! Fight it?" LABEL will appear on the screen
					instructionsForCommonFlu.setVisible(true);
					//Button to attack Common Flu will appear
					attackCommonFlu.setVisible(true);
					//Event handler for attack the Common Flu
					attackCommonFlu.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Random rand = new Random();
							switch (rand.nextInt(2)+1){
							
							case 1: 
								player.useAttackCommon(player, commonFlu2);
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								break;
							
							case 2:
								commonFlu2.useAttackCommon2(player, commonFlu2);
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								
							}

							if(commonFlu2.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForCommonFlu.setText("The Common Flu has been defeated.  ");
								CommonFlu.setVisible(false);
								commonFluPrize.setVisible(true);
								NyQuil.setVisible(true);
								player.prizeAmmount(player);
								BP.getChildren().remove(Corona);
							}
							
							if(player.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForHuman.setTextFill(Color.RED);
								instructionsForHuman.setText("You died!  ");
								instructionsForCommonFlu.setVisible(false);
								instructionsForCorona.setVisible(false);
								attackCommonFlu.setVisible(false);
								coronaPrize.setVisible(false);
								Vaccine.setVisible(false);
								commonFluPrize.setVisible(false);
								NyQuil.setVisible(false);
								loser.setVisible(false);
								confirm.setVisible(false);
								hitWall.setVisible(false);
								hitWall2.setVisible(false);
								hitWall3.setVisible(false);
								humanTrackerCoord.setVisible(false);
								human.setVisible(false);
								exit.setVisible(true);
							}
						}
						
					});
				}
				
			}
		});
		
		//Button Action Event for down button
		Down.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				//Create tracker circle to add to the pane
				Circle tracker = new Circle(10, Color.TAN);
				tracker.setStroke(Color.BLACK);
				//Create tracker
				tracker.setLayoutX(human.getLayoutX());
				tracker.setLayoutY(human.getLayoutY());
				paneForObjects.getChildren().add(tracker);
				//Move object Down
				human.setLayoutY(human.getLayoutY()+80);
				//Coordinates tracker
				humanTrackerCoord.setText("Coordinates for Player: " + human.getLayoutX() + ", " + human.getLayoutY());
				//Dont let objects touch obstacle
				if(human.getLayoutX()-18 == obstacle1.getLayoutX() && human.getLayoutY()-20 == obstacle1.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()-80);
					hitWall.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle2.getLayoutX() && human.getLayoutY()-20 == obstacle2.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()-80);
					hitWall2.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle3.getLayoutX() && human.getLayoutY()-20 == obstacle3.getLayoutY()) {
					human.setLayoutY(human.getLayoutY()-80);
					hitWall3.setVisible(true);
				}
				//Keep objects within the boundaries
				if(human.getLayoutY()>640) {
				human.setLayoutY(human.getLayoutY()-80);
				}
				
				//Human object lands on goal
				if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() == 2) {
					//set false
					instructionsForHuman.setVisible(false);
					instructionsForCommonFlu.setVisible(false);
					instructionsForCorona.setVisible(false);
					attackCorona.setVisible(false);
					coronaPrize.setVisible(false);
					Vaccine.setVisible(false);
					commonFluPrize.setVisible(false);
					NyQuil.setVisible(false);
					loser.setVisible(false);
					confirm.setVisible(false);
					hitWall.setVisible(false);
					hitWall2.setVisible(false);
					hitWall3.setVisible(false);
					humanTrackerCoord.setVisible(false);
					human.setVisible(false);
					
					//set visible true
					winner.setTextFill(Color.GREEN);
					winner.setVisible(true);
					//Set exit button visible 
					exit.setVisible(true);
				}
				
				else if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() < 2) {
					loser.setVisible(true);
					confirm.setVisible(true);
				}

				//Object lands on a Corona
				if(human.getLayoutX()-18 == Corona.getLayoutX() && human.getLayoutY()-20 == Corona.getLayoutY()) {
					//"You have encountered the Corona Virus! Fight it?" LABEL will appear on the screen
					instructionsForCorona.setVisible(true);
					//Button to attack Corona will appear
					attackCorona.setVisible(true);
					//Event handler for attacking the Corona
					attackCorona.setOnAction(new EventHandler<ActionEvent>()
							{
								@Override
								public void handle(ActionEvent arg0) {
									// TODO Auto-generated method stub
									Random rand = new Random();
									switch (rand.nextInt(2)+1){
									
									case 1: 
										player.useAttackCorona(player, coronaAlt);
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										break;
									
									case 2:
										coronaAlt.useAttackCorona2(player, coronaAlt);
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										
									}
	
									if(coronaAlt.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForCorona.setText("The Corona Virus has been defeated.  ");
										Corona.setVisible(false);
										coronaPrize.setVisible(true);
										Vaccine.setVisible(true);
										player.prizeAmmount(player);
										BP.getChildren().remove(Corona);
									}
									
									if(player.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForHuman.setTextFill(Color.RED);
										instructionsForHuman.setText("You died!  ");
										instructionsForCorona.setVisible(false);
										instructionsForCommonFlu.setVisible(false);
										attackCorona.setVisible(false);
										coronaPrize.setVisible(false);
										Vaccine.setVisible(false);
										commonFluPrize.setVisible(false);
										NyQuil.setVisible(false);
										loser.setVisible(false);
										confirm.setVisible(false);
										hitWall.setVisible(false);
										hitWall2.setVisible(false);
										hitWall3.setVisible(false);
										humanTrackerCoord.setVisible(false);
										human.setVisible(false);
										exit.setVisible(true);
								}
								}
							});
				}
				//Else if human lands on commonFlu
				else if(human.getLayoutX()-18 == CommonFlu.getLayoutX() && human.getLayoutY()-20 == CommonFlu.getLayoutY()){
					//"You have encountered the Common Flu! Fight it?" LABEL will appear on the screen
					instructionsForCommonFlu.setVisible(true);
					//Button to attack Common Flu will appear
					attackCommonFlu.setVisible(true);
					//Event handler for attack the Common Flu
					attackCommonFlu.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Random rand = new Random();
							switch (rand.nextInt(2)+1){
							
							case 1: 
								player.useAttackCommon(player, commonFlu2);
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								break;
							
							case 2:
								commonFlu2.useAttackCommon2(player, commonFlu2);
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								
							}

							if(commonFlu2.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForCommonFlu.setText("The Common Flu has been defeated.  ");
								CommonFlu.setVisible(false);
								commonFluPrize.setVisible(true);
								NyQuil.setVisible(true);
								player.prizeAmmount(player);
								BP.getChildren().remove(Corona);
							}
							
							if(player.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForHuman.setTextFill(Color.RED);
								instructionsForHuman.setText("You died!  ");
								instructionsForCorona.setVisible(false);
								instructionsForCommonFlu.setVisible(false);
								attackCommonFlu.setVisible(false);
								coronaPrize.setVisible(false);
								Vaccine.setVisible(false);
								commonFluPrize.setVisible(false);
								NyQuil.setVisible(false);
								loser.setVisible(false);
								confirm.setVisible(false);
								hitWall.setVisible(false);
								hitWall2.setVisible(false);
								hitWall3.setVisible(false);
								humanTrackerCoord.setVisible(false);
								human.setVisible(false);
								exit.setVisible(true);
							}
						}
						
					});
				}
			}
		});
		
		
		//Button Action Event for left button
		Left.setOnAction(new EventHandler <ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				//Create tracker circle to add to the pane
				Circle tracker = new Circle(10, Color.TAN);
				tracker.setStroke(Color.BLACK);
				//Create tracker
				tracker.setLayoutX(human.getLayoutX());
				tracker.setLayoutY(human.getLayoutY());
				paneForObjects.getChildren().add(tracker);
				//Move object Left
				human.setLayoutX(human.getLayoutX()-80);
				//Coordinates tracker
				humanTrackerCoord.setText("Coordinates for Player: " + human.getLayoutX() + ", " + human.getLayoutY());
				//Dont let objects touch obstacle
				if(human.getLayoutX()-18 == obstacle1.getLayoutX() && human.getLayoutY()-20 == obstacle1.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()+80);
					hitWall.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle2.getLayoutX() && human.getLayoutY()-20 == obstacle2.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()+80);
					hitWall2.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle3.getLayoutX() && human.getLayoutY()-20 == obstacle3.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()+80);
					hitWall3.setVisible(true);
				}
				//Keep objects within the boundaries
				if(human.getLayoutX()<40) {
					human.setLayoutX(human.getLayoutX()+80);
				}
				
				//Human object lands on goal
				if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() == 2) {
					//set false
					instructionsForHuman.setVisible(false);
					instructionsForCommonFlu.setVisible(false);
					instructionsForCorona.setVisible(false);
					attackCorona.setVisible(false);
					coronaPrize.setVisible(false);
					Vaccine.setVisible(false);
					commonFluPrize.setVisible(false);
					NyQuil.setVisible(false);
					loser.setVisible(false);
					confirm.setVisible(false);
					hitWall.setVisible(false);
					hitWall2.setVisible(false);
					hitWall3.setVisible(false);
					humanTrackerCoord.setVisible(false);
					human.setVisible(false);
					
					//set visible true
					winner.setTextFill(Color.GREEN);
					winner.setVisible(true);
					//Set exit button visible 
					exit.setVisible(true);
				}
				
				else if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() < 2) {
					loser.setVisible(true);
					confirm.setVisible(true);
				}

				//Object lands on a Corona
				if(human.getLayoutX()-18 == Corona.getLayoutX() && human.getLayoutY()-20 == Corona.getLayoutY()) {
					//"You have encountered the Corona Virus! Fight it?" LABEL will appear on the screen
					instructionsForCorona.setVisible(true);
					//Button to attack Corona will appear
					attackCorona.setVisible(true);
					//Event handler for attacking the Corona
					attackCorona.setOnAction(new EventHandler<ActionEvent>()
							{
								@Override
								public void handle(ActionEvent arg0) {
									// TODO Auto-generated method stub
									Random rand = new Random();
									switch (rand.nextInt(2)+1){
									
									case 1: 
										player.useAttackCorona(player, coronaAlt);
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										break;
									
									case 2:
										coronaAlt.useAttackCorona2(player, coronaAlt);
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										
									}
	
									if(coronaAlt.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForCorona.setText("The Corona Virus has been defeated.  ");
										Corona.setVisible(false);
										coronaPrize.setVisible(true);
										Vaccine.setVisible(true);
										player.prizeAmmount(player);
										BP.getChildren().remove(Corona);
									}
									
									if(player.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForHuman.setTextFill(Color.RED);
										instructionsForHuman.setText("You died!  ");
										instructionsForCorona.setVisible(false);
										instructionsForCommonFlu.setVisible(false);
										attackCorona.setVisible(false);
										coronaPrize.setVisible(false);
										Vaccine.setVisible(false);
										commonFluPrize.setVisible(false);
										NyQuil.setVisible(false);
										loser.setVisible(false);
										confirm.setVisible(false);
										hitWall.setVisible(false);
										hitWall2.setVisible(false);
										hitWall3.setVisible(false);
										humanTrackerCoord.setVisible(false);
										human.setVisible(false);
										exit.setVisible(true);
								}
								}
							});
				}
				//Else if human lands on commonFlu
				else if(human.getLayoutX()-18 == CommonFlu.getLayoutX() && human.getLayoutY()-20 == CommonFlu.getLayoutY()){
					//"You have encountered the Common Flu! Fight it?" LABEL will appear on the screen
					instructionsForCommonFlu.setVisible(true);
					//Button to attack Common Flu will appear
					attackCommonFlu.setVisible(true);
					//Event handler for attack the Common Flu
					attackCommonFlu.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Random rand = new Random();
							switch (rand.nextInt(2)+1){
							
							case 1: 
								player.useAttackCommon(player, commonFlu2);
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								break;
							
							case 2:
								commonFlu2.useAttackCommon2(player, commonFlu2);
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								
							}

							if(commonFlu2.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForCommonFlu.setText("The Common Flu has been defeated.  ");
								CommonFlu.setVisible(false);
								commonFluPrize.setVisible(true);
								NyQuil.setVisible(true);
								player.prizeAmmount(player);
								BP.getChildren().remove(Corona);
							}
							
							if(player.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForHuman.setTextFill(Color.RED);
								instructionsForHuman.setText("You died!  ");
								instructionsForCorona.setVisible(false);
								instructionsForCommonFlu.setVisible(false);
								attackCommonFlu.setVisible(false);
								coronaPrize.setVisible(false);
								Vaccine.setVisible(false);
								commonFluPrize.setVisible(false);
								NyQuil.setVisible(false);
								loser.setVisible(false);
								confirm.setVisible(false);
								hitWall.setVisible(false);
								hitWall2.setVisible(false);
								hitWall3.setVisible(false);
								humanTrackerCoord.setVisible(false);
								human.setVisible(false);
								exit.setVisible(true);
							}
						}
						
					});
				}
				
			}
		});
		
		//Button Action Event for right button
		Right.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				//Create tracker circle to add to the pane
				Circle tracker = new Circle(10, Color.TAN);
				tracker.setStroke(Color.BLACK);
				//Create tracker
				tracker.setLayoutX(human.getLayoutX());
				tracker.setLayoutY(human.getLayoutY());
				paneForObjects.getChildren().add(tracker);
				//Move object Right
				human.setLayoutX(human.getLayoutX()+80);
				//Coordinates tracker
				humanTrackerCoord.setText("Coordinates for Player: " + human.getLayoutX() + ", " + human.getLayoutY());
				//Dont let objects touch obstacle
				if(human.getLayoutX()-18 == obstacle1.getLayoutX() && human.getLayoutY()-20 == obstacle1.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()-80);
					hitWall.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle2.getLayoutX() && human.getLayoutY()-20 == obstacle2.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()-80);
					hitWall2.setVisible(true);
				}
				if(human.getLayoutX()-18 == obstacle3.getLayoutX() && human.getLayoutY()-20 == obstacle3.getLayoutY()) {
					human.setLayoutX(human.getLayoutX()-80);
					hitWall3.setVisible(true);
				}
				//Keep objects within the boundaries
				if(human.getLayoutX()>640) {
					human.setLayoutX(human.getLayoutX()-80);
				}
				
				//Human object lands on goal
				if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() == 2) {
					//set false
					instructionsForHuman.setVisible(false);
					instructionsForCommonFlu.setVisible(false);
					instructionsForCorona.setVisible(false);
					attackCorona.setVisible(false);
					coronaPrize.setVisible(false);
					Vaccine.setVisible(false);
					commonFluPrize.setVisible(false);
					NyQuil.setVisible(false);
					loser.setVisible(false);
					confirm.setVisible(false);
					hitWall.setVisible(false);
					hitWall2.setVisible(false);
					hitWall3.setVisible(false);
					humanTrackerCoord.setVisible(false);
					human.setVisible(false);
					
					//set visible true
					winner.setTextFill(Color.GREEN);
					winner.setVisible(true);
					//Set exit button visible 
					exit.setVisible(true);
				}
				
				else if(end.getLayoutX()-5==human.getLayoutX() && end.getLayoutY() == human.getLayoutY() && player.getPrize() < 2) {
					loser.setVisible(true);
					confirm.setVisible(true);
				}

				//Object lands on a Corona
				if(human.getLayoutX()-18 == Corona.getLayoutX() && human.getLayoutY()-20 == Corona.getLayoutY()) {
					//"You have encountered the Corona Virus! Fight it?" LABEL will appear on the screen
					instructionsForCorona.setVisible(true);
					//Button to attack Corona will appear
					attackCorona.setVisible(true);
					//Event handler for attacking the Corona
					attackCorona.setOnAction(new EventHandler<ActionEvent>()
							{
								@Override
								public void handle(ActionEvent arg0) {
									// TODO Auto-generated method stub
									Random rand = new Random();
									switch (rand.nextInt(2)+1){
									
									case 1: 
										player.useAttackCorona(player, coronaAlt);
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										break;
									
									case 2:
										coronaAlt.useAttackCorona2(player, coronaAlt);
										instructionsForHuman.setTextFill(Color.BROWN);
										instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
										instructionsForCorona.setTextFill(Color.PURPLE);
										instructionsForCorona.setText("COVID-19 hit points left: " + (coronaAlt.getHitPoints()));
										
									}
	
									if(coronaAlt.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForCorona.setText("The Corona Virus has been defeated.  ");
										Corona.setVisible(false);
										coronaPrize.setVisible(true);
										Vaccine.setVisible(true);
										player.prizeAmmount(player);
										BP.getChildren().remove(Corona);
									}
									
									if(player.getHitPoints() <= 0) {
										vboxAttackButtons.getChildren().remove(attackCorona);
										instructionsForHuman.setTextFill(Color.RED);
										instructionsForHuman.setText("You died!  ");
										instructionsForCorona.setVisible(false);
										instructionsForCommonFlu.setVisible(false);
										attackCorona.setVisible(false);
										coronaPrize.setVisible(false);
										Vaccine.setVisible(false);
										commonFluPrize.setVisible(false);
										NyQuil.setVisible(false);
										loser.setVisible(false);
										confirm.setVisible(false);
										hitWall.setVisible(false);
										hitWall2.setVisible(false);
										hitWall3.setVisible(false);
										humanTrackerCoord.setVisible(false);
										human.setVisible(false);
										exit.setVisible(true);
								}
								}
							});
				}
				//Else if human lands on commonFlu
				else if(human.getLayoutX()-18 == CommonFlu.getLayoutX() && human.getLayoutY()-20 == CommonFlu.getLayoutY()){
					//"You have encountered the Common Flu! Fight it?" LABEL will appear on the screen
					instructionsForCommonFlu.setVisible(true);
					//Button to attack Common Flu will appear
					attackCommonFlu.setVisible(true);
					//Event handler for attack the Common Flu
					attackCommonFlu.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Random rand = new Random();
							switch (rand.nextInt(2)+1){
							
							case 1: 
								player.useAttackCommon(player, commonFlu2);
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								break;
							
							case 2:
								commonFlu2.useAttackCommon2(player, commonFlu2);
								instructionsForHuman.setTextFill(Color.BROWN);
								instructionsForHuman.setText("Player hit points left: " + (player.getHitPoints()));
								instructionsForCommonFlu.setTextFill(Color.BLUE);
								instructionsForCommonFlu.setText("Common Flu hit points left: " + (commonFlu2.getHitPoints()));
								
							}

							if(commonFlu2.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForCommonFlu.setText("The Common Flu has been defeated.  ");
								CommonFlu.setVisible(false);
								commonFluPrize.setVisible(true);
								NyQuil.setVisible(true);
								player.prizeAmmount(player);
								BP.getChildren().remove(Corona);
							}
							
							if(player.getHitPoints() <= 0) {
								vboxAttackButtons.getChildren().remove(attackCommonFlu);
								instructionsForHuman.setTextFill(Color.RED);
								instructionsForHuman.setText("You died!  ");
								instructionsForCorona.setVisible(false);
								instructionsForCommonFlu.setVisible(false);
								attackCommonFlu.setVisible(false);
								coronaPrize.setVisible(false);
								Vaccine.setVisible(false);
								commonFluPrize.setVisible(false);
								NyQuil.setVisible(false);
								loser.setVisible(false);
								confirm.setVisible(false);
								hitWall.setVisible(false);
								hitWall2.setVisible(false);
								hitWall3.setVisible(false);
								humanTrackerCoord.setVisible(false);
								human.setVisible(false);
								exit.setVisible(true);
							}
						}
						
					});
				}
			}
		});
		
		
		//Action event for the debug button
		debug.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				//Setting visibility to true to allow objects to appear on the matrix
				Corona.setVisible(true);
				CommonFlu.setVisible(true);
				obstacle1.setVisible(true);
				obstacle2.setVisible(true);
				obstacle3.setVisible(true);
			}
		});
		
		debugOff.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				//Setting visibility to false to allow user to go back into the original game mode. User wont see objects or obstacles
				Corona.setVisible(false);
				CommonFlu.setVisible(false);
				obstacle1.setVisible(false);
				obstacle2.setVisible(false);
				obstacle3.setVisible(false);
			}
		});
		
		
		//Action event for the confirm button. Will be removed from the VBox
		confirm.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				loser.setVisible(false);
				vboxAttackButtons.getChildren().remove(confirm);
			}
		});
		
		//Action event for the exit button. Will allow program to close
		exit.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		

		//Create scene
		Scene scene = new Scene (BP, 950, 715, Color.GREEN);
		//Set primary stage title
		primaryStage.setTitle("Escape From The Viruses");
		//Set scene
		primaryStage.setScene(scene);
		//Show scene
		primaryStage.show();
	}
	
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
}
