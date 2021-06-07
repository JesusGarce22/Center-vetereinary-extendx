package model;

public class Owner {
	//Atributes
	private String id;
	private String name;
	private int phone;
	private String direction;
	
	//Method
	/**
	 *@author jesus garces
	 *Owner. <br>
	 *@version 1.0
	 *This is the constructor method of the Owner class
	 *<b>pre:</b> have declared the class attributes and relationships  <br>
	 *<b>post:</b> attributes and relationships will have been initialized <br>
	 *@param ido variable to assign the id of the pet owner. ido != null.
	 *@param nao variable to assign to the name of the pet owner. nao != null.
	 *@param ph variable to assign to the pet owner's phone. ph != null.
	 *@param dir variable to assign to the pet owner's address. dir != null.
	*/
	public Owner(String ido,String nao,int ph,String dir){
		id=ido;
	    name=nao;
	    phone=ph;
	    direction=dir;
	}
	/**
	 *@author jesus garces
	 *getId. <br>
	 *@version 1.0
	 *This method allows you to query the value of the id attribute
	 *<b>pre:</b> have correctly declared the attribute id <br>
	 *<b>post:</b> the value of the attribute could be consulted id <br>
	 *@return to return the value of the attribute id. return != null. 
	*/
	public String getId(){
		return id;
	}
	/**
	 *@author jesus garces
	 *getName. <br>
	 *@version 1.0
	 *This method allows you to query the value of the name attribute
	 *<b>pre:</b> have correctly declared the attribute name <br>
	 *<b>post:</b> the value of the attribute could be consulted name <br>
	 *@return to return the value of the attribute name. return != null. 
	*/
	public String getName(){
		return name;
	}
	/**
	 *@author jesus garces
	 *getPhone. <br>
	 *@version 1.0
	 *This method allows you to query the value of the phone attribute
	 *<b>pre:</b> have correctly declared the attribute phone <br>
	 *<b>post:</b> the value of the attribute could be consulted phone <br>
	 *@return to return the value of the attribute phone. return != null. 
	*/
	public int getPhone(){
		return phone;
	}
	/**
	 *@author jesus garces
	 *getDirection. <br>
	 *@version 1.0
	 *This method allows you to query the value of the direction attribute
	 *<b>pre:</b> have correctly declared the attribute direction <br>
	 *<b>post:</b> the value of the attribute could be consulted direction <br>
	 *@return to return the value of the attribute direction. return != null. 
	*/
	public String getDirection(){
		return direction;
	}
}