package model;

public class Aquarium extends Habits{
	//Constants
	
	
	//Atributes
	private String material;
	private char type;
	
	//metohd
	/**
	 *@author jesus garces
	 *Aquarium. <br>
	 *@version 2.0
	 *This is the constructor method of the Aquarium class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	 *@param mate variable to assign the habitat material. mate != null.
	 *@param type variable to assign the habitat type of reptil. type != null.
	*/
	public Aquarium(String idHabit, double lon, double wint,String no,String mate,char type){
		super(idHabit,lon,wint,no);
		
		material=mate;
		this.type=type;
	}
	/**
	 *@author jesus garces
	 *getMaterial. <br>
	 *@version 1.0
	 *This method allows you to query the value of the material attribute
	 *<b>pre:</b> have correctly declared the material attribute <br>
	 *<b>post:</b> the value of the material attribute can be consulted <br>
	 *@return to return the value of the material attribute. return != null. 
	*/
	public String getMaterial(){
		return material;
	}
	/**
	 *@author jesus garces
	 *setMaterial. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute material
	 *<b>pre:</b> have correctly declared the material atribute <br>
	 *<b>post:</b> the value of the material atribute could be modified <br>
	 *@param material variable to store the modified value of the atribute material. material != null.
	*/
	public void setMaterial(String material){
		this.material=material;
	}
	/**
	 *@author jesus garces
	 *getType. <br>
	 *@version 1.0
	 *This method allows you to query the value of the type attribute
	 *<b>pre:</b> have correctly declared the type attribute <br>
	 *<b>post:</b> the value of the type attribute can be consulted <br>
	 *@return to return the value of the type attribute. return != null. 
	*/
	public char getType(){
		return type;
	}
	/**
	 *@author jesus garces
	 *setType. <br>
	 *@version 1.0
	 *This method allows modifying the value of the atribute type
	 *<b>pre:</b> have correctly declared the type atribute <br>
	 *<b>post:</b> the value of the type atribute could be modified <br>
	 *@param type variable to store the modified value of the atribute type. type != null.
	*/
	public void setType(char type){
		this.type=type;
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
		message=super.toString()+", his material is: "+material+", his type is: "+type;
		
		return message;
	}
}
	