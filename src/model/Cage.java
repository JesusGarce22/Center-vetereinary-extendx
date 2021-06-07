package model;

public class Cage extends Habits{
	//Atributes
	private char hangingCage;//jaula colgada o tierra
	private double elevation;
	private int canBirds;
	
	//Metohd
	/**
	 *@author jesus garces
	 *Cage. <br>
	 *@version 2.0
	 *This is the constructor method of the Cage class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	 *@param cage variable to assign the habitat status of cage. cage != null.
	 *@param eleCage variable to assign the habitat elevation. eleCage != null.
	 *@param birds variable to assign the habitat number of bird in the cage. birds != null.
	*/
	public Cage(String idHabit, double lon, double wint,String no,char cage,double eleCage,int birds){
		super(idHabit,lon,wint,no);
		
		hangingCage=cage;
		elevation=eleCage;
		canBirds=birds;
	}
	/**
	 *@author jesus garces
	 *getHangingCage. <br>
	 *@version 1.0
	 *This method allows you to query the value of the hangingCage attribute
	 *<b>pre:</b> have correctly declared the hangingCage attribute <br>
	 *<b>post:</b> the value of the hangingCage attribute can be consulted <br>
	 *@return to return the value of the hangingCage attribute. return != null. 
	*/
	public char getHangingCage(){
		return hangingCage;
	}
	/**
	 *@author jesus garces
	 *setHangingCage. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute hangingCage
	 *<b>pre:</b> have correctly declared the hangingCage atribute <br>
	 *<b>post:</b> the value of the hangingCage atribute could be modified <br>
	 *@param hangingCage variable to store the modified value of the atribute hangingCage. hangingCage != null.
	*/
	public void setHangingCage(char hangingCage){
		this.hangingCage=hangingCage;
	}
	/**
	 *@author jesus garces
	 *getElevation. <br>
	 *@version 1.0
	 *This method allows you to query the value of the elevation attribute
	 *<b>pre:</b> have correctly declared the elevation attribute <br>
	 *<b>post:</b> the value of the elevation attribute can be consulted <br>
	 *@return to return the value of the elevation attribute. return != null. 
	*/
	public double getElevation(){
		return elevation;
	}
	/**
	 *@author jesus garces
	 *setElevation. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute elevation
	 *<b>pre:</b> have correctly declared the elevation atribute <br>
	 *<b>post:</b> the value of the elevation atribute could be modified <br>
	 *@param elevation variable to store the modified value of the atribute elevation. elevation != null.
	*/
	public void setElevation(double elevation){
		this.elevation=elevation;
	}
	/**
	 *@author jesus garces
	 *getCanBirds. <br>
	 *@version 1.0
	 *This method allows you to query the value of the canBirds attribute
	 *<b>pre:</b> have correctly declared the canBirds attribute <br>
	 *<b>post:</b> the value of the canBirds attribute can be consulted <br>
	 *@return to return the value of the canBirds attribute. return != null. 
	*/
	public int getCanBirds(){
		return canBirds;
	}
	/**
	 *@author jesus garces
	 *setCanBirds. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute canBirds
	 *<b>pre:</b> have correctly declared the canBirds atribute <br>
	 *<b>post:</b> the value of the canBirds atribute could be modified <br>
	 *@param canBirds variable to store the modified value of the atribute canBirds. canBirds != null.
	*/
	public void setCanBirds(int canBirds){
		this.canBirds=canBirds;
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
		message=super.toString()+", the cage are: "+hangingCage+", his elevation is: "+elevation+", have "+canBirds+" number of birds";
		
		return message;
	}
}