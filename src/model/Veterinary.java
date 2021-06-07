package model;

public class Veterinary {
	//Atributes
	private String name;
	private String lastname;
	private String id;
	private String record;//registro
	private boolean isAvailable;//Variable to know if the vet is available or not
	private int count;//variable to store the number of consultations the vet has per day
	
	//Relation
	private Mascot consultation;
	
	//Method
	/**
	 *@author jesus garces
	 *Veterinary. <br>
	 *@version 1.0
	 *This is the constructor method of the Veterinary class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> attributes and relationships will have been initialized <br>
	 *@param nav attribute to assign to the vet's name. nav != null.
	 *@param lastn attribute to assign to the vet's last name. lastn != null.
	 *@param idv attribute to assign to the vet's id. idv != null.
	 *@param rec attribute to assign to the vet's record. rec != null.
	*/
	public Veterinary(String nav,String lastn,String idv,String rec){
		name=nav;
		lastname=lastn;
		id=idv;
		record=rec;
		isAvailable=true;
		count=0;
		
		consultation=null;
	}
	/**
	 *@author jesus garces
	 *getName. <br>
	 *@version 1.0
	 *This method allows you to query the value of the name attribute
	 *<b>pre:</b> have correctly declared the name attribute <br>
	 *<b>post:</b> the value of the name attribute can be consulted <br>
	 *@return to return the value of the name attribute. return != null. 
	*/
	public String getName(){
		return name;
	}
	/**
	 *@author jesus garces
	 *getLastname. <br>
	 *@version 1.0
	 *This method allows you to query the value of the lastname attribute
	 *<b>pre:</b> have correctly declared the lastname attribute <br>
	 *<b>post:</b> the value of the lastname attribute can be consulted <br>
	 *@return to return the value of the lastname attribute. return != null. 
	*/
	public String getLastname(){
		return lastname;
	}
	/**
	 *@author jesus garces
	 *getId. <br>
	 *@version 1.0
	 *This method allows you to query the value of the id attribute
	 *<b>pre:</b> have correctly declared the id attribute <br>
	 *<b>post:</b> the value of the id attribute can be consulted <br>
	 *@return to return the value of the id attribute. return != null. 
	*/
	public String getId(){
		return id;
	}
	/**
	 *@author jesus garces
	 *getRecord. <br>
	 *@version 1.0
	 *This method allows you to query the value of the record attribute
	 *<b>pre:</b> have correctly declared the record attribute <br>
	 *<b>post:</b> the value of the record attribute can be consulted <br>
	 *@return to return the value of the record attribute. return != null. 
	*/
	public String getRecord(){
		return record;
	}
	/**
	 *@author jesus garces
	 *getIsAvailable. <br>
	 *@version 1.0
	 *This method allows you to query the value of the isAvailable attribute
	 *<b>pre:</b> have correctly declared the isAvailable attribute <br>
	 *<b>post:</b> the value of the isAvailable attribute can be consulted <br>
	 *@return to return the value of the isAvailable attribute. return != null. 
	*/
	public boolean getIsAvailable(){
		return isAvailable;
	}
	/**
	 *@author jesus garces
	 *setIsAvailable. <br>
	 *@version 1.0
	 *This method allows modifying the value of the attribute isAvailable
	 *<b>pre:</b> have correctly declared the isAvailable attribute <br>
	 *<b>post:</b> the value of the isAvailable attribute could be modified <br>
	 *@param newAvailable variable to store the modified value of the attribute isAvailable. newAvailable != null.
	*/
	public void setIsAvailable(boolean newAvailable){
		isAvailable=newAvailable;
	}
	/**
	 *@author jesus garces
	 *setConsultation. <br>
	 *@version 1.0
	 *This method allows modifying the value of the attribute consultation
	 *<b>pre:</b> have correctly declared the consultation attribute <br>
	 *<b>post:</b> the value of the consultation attribute could be modified <br>
	 *@param newConsultation variable to store the modified value of the attribute consultation. newConsultation != null.
	*/
	public void setConsultation(Mascot newConsultation){
		consultation=newConsultation;
	}
	/**
	 *@author jesus garces
	 *getCount. <br>
	 *@version 1.0
	 *This method allows you to query the value of the count attribute
	 *<b>pre:</b> have correctly declared the count attribute <br>
	 *<b>post:</b> the value of the count attribute can be consulted <br>
	 *@return to return the value of the count attribute. return != null. 
	*/
	public int getCount(){
		return count;
	}
	/**
	 *@author jesus garces
	 *setCount. <br>
	 *@version 1.0
	 *This method allows modifying the value of the attribute count
	 *<b>pre:</b> have correctly declared the count attribute <br>
	 *<b>post:</b> the value of the count attribute could be modified <br>
	 *@param newCount variable to store the modified value of the attribute count. newCount != null.
	*/
	public void setCount(int newCount){
		count=newCount;
	}
}