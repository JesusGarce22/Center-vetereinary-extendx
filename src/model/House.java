package model;

public class House extends Habits{
	//Atributes
	private int canToy;
	
	//Metohd
	/**
	 *@author jesus garces
	 *House. <br>
	 *@version 2.0
	 *This is the constructor method of the Cage class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	 *@param toy variable to assign the habitat number of toys. toy != null.
	*/
	public House(String idHabit, double lon, double wint,String no,int toy){
		super(idHabit,lon,wint,no);
		
		canToy=toy;
	}
	/**
	 *@author jesus garces
	 *getCanToy. <br>
	 *@version 1.0
	 *This method allows you to query the value of the canToy attribute
	 *<b>pre:</b> have correctly declared the canToy attribute <br>
	 *<b>post:</b> the value of the canToy attribute can be consulted <br>
	 *@return to return the value of the canToy attribute. return != null. 
	*/
	public int getCanToy(){
		return canToy;
	}
	/**
	 *@author jesus garces
	 *setCanToy. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute canToy
	 *<b>pre:</b> have correctly declared the canToy atribute <br>
	 *<b>post:</b> the value of the canToy atribute could be modified <br>
	 *@param canToy variable to store the modified value of the atribute canToy. canToy != null.
	*/
	public void setCanToy(int canToy){
		this.canToy=canToy;
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
		message=super.toString()+", the number of toys he has is: "+canToy;
		
		return message;
	}
}