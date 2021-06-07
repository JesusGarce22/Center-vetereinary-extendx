package model;

public class Guacal extends Habits{
	//Atributes
	private double elevation;
	private double maxWeight;
	
	//Metohd
	/**
	 *@author jesus garces
	 *Guacal. <br>
	 *@version 2.0
	 *This is the constructor method of the Guacal class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	 *@param ele variable to assign the habitat elevation. ele != null.
	 *@param heigth variable to assign the habitat maximous heigth. heigth != null.
	*/
	public Guacal(String idHabit, double lon, double wint,String no,double ele,double heigth){
		super(idHabit,lon,wint,no);
		
		elevation=ele;
		maxWeight=heigth;
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
	 *getMaxWeigth. <br>
	 *@version 1.0
	 *This method allows you to query the value of the maxWeight attribute
	 *<b>pre:</b> have correctly declared the maxWeight attribute <br>
	 *<b>post:</b> the value of the maxWeight attribute can be consulted <br>
	 *@return to return the value of the maxWeight attribute. return != null. 
	*/
	public double getMaxWeigth(){
		return maxWeight;
	}
	/**
	 *@author jesus garces
	 *setMaxWeigth. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute maxWeight
	 *<b>pre:</b> have correctly declared the maxWeight atribute <br>
	 *<b>post:</b> the value of the maxWeight atribute could be modified <br>
	 *@param maxWeight variable to store the modified value of the atribute maxWeight. maxWeight != null.
	*/
	public void setMaxWeigth(double maxWeight){
		this.maxWeight=maxWeight;
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
		message=super.toString()+", his elevation is: "+elevation+", his maximum weight is: "+maxWeight;
		
		return message;
	}
}