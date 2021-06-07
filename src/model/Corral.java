package model;

public class Corral extends Habits{
	//Atributes
	private String typePlant;
	private int canPlant;
	
	//Metohd
	/**
	 *@author jesus garces
	 *Corral. <br>
	 *@version 2.0
	 *This is the constructor method of the Corral class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	 *@param plant variable to assign the habitat type plant. plant != null.
	 *@param cPlant variable to assign the habitat number of plant . cPlant != null.
	*/
	public Corral(String idHabit, double lon, double wint,String no,String plant,int cPlant){
		super(idHabit,lon,wint,no);
		
		typePlant=plant;
		canPlant=cPlant;
	}
	/**
	 *@author jesus garces
	 *getTypePlant. <br>
	 *@version 1.0
	 *This method allows you to query the value of the typePlant attribute
	 *<b>pre:</b> have correctly declared the typePlant attribute <br>
	 *<b>post:</b> the value of the typePlant attribute can be consulted <br>
	 *@return to return the value of the typePlant attribute. return != null. 
	*/
	public String getTypePlant(){
		return typePlant;
	}
	/**
	 *@author jesus garces
	 *setTypePlant. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute typePlant
	 *<b>pre:</b> have correctly declared the typePlant atribute <br>
	 *<b>post:</b> the value of the typePlant atribute could be modified <br>
	 *@param typePlant variable to store the modified value of the atribute typePlant. typePlant != null.
	*/
	public void setTypePlant(String typePlant){
		this.typePlant=typePlant;
	}
	/**
	 *@author jesus garces
	 *getCanPlant. <br>
	 *@version 1.0
	 *This method allows you to query the value of the canPlant attribute
	 *<b>pre:</b> have correctly declared the canPlant attribute <br>
	 *<b>post:</b> the value of the canPlant attribute can be consulted <br>
	 *@return to return the value of the canPlant attribute. return != null. 
	*/
	public int getCanPlant(){
		return canPlant;
	}
	/**
	 *@author jesus garces
	 *setCanPlant. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute canPlant
	 *<b>pre:</b> have correctly declared the canPlant atribute <br>
	 *<b>post:</b> the value of the canPlant atribute couldatributebe modified <br>
	 *@param return variable to store the modified value of the a canPlant. return != null.
	*/
	public void setCanPlant(int canPlant){
		this.canPlant=canPlant;
	}
	/**
	 *@author jesus garces
	 *toString. <br>
	 *@version 1.0
	 *This method is used to display the information of the habitat
	 *<b>pre:</b> invoke the metohd <br>
	 *<b>post:</b> display the information of the habitat <br>
	 *@return to return the value of the information habitat. return != null. 
	*/
	public String toString() {
		
		String message="";
		message=super.toString()+", have a type of plant: "+typePlant+", have "+canPlant+" number of plant";
		
		return message;
	}
}