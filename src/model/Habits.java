package model;

public class Habits{
	//Atributes
	private String id;
	private double longer;
	private double width;//ancho
	
	//Relation
	private Use now;
	
	//Metohd
	/**
	 *@author jesus garces
	 *registerHabitad. <br>
	 *@version 2.0
	 *This is the constructor method of the Habits class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> display in the screen a message informing<br>
	 *@param idHabit variable to assign the id of the habits. idHabit != null.
	 *@param lon variable to assign the long of the habits. lon != null.
	 *@param wint variable to assign the winth of the habits. wint != null.
	 *@param no variable to assign the status of the habits. no != null.
	*/
	public Habits(String idHabit, double lon, double wint,String no){
		id=idHabit;
		longer=lon;
		width=wint;
		
		now=Use.valueOf(no);
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
	 *getLonger. <br>
	 *@version 1.0
	 *This method allows you to query the value of the long attribute
	 *<b>pre:</b> have correctly declared the long attribute <br>
	 *<b>post:</b> the value of the long attribute can be consulted <br>
	 *@return to return the value of the long attribute. return != null. 
	*/
	public double getLonger(){
		return longer;
	}
	/**
	 *@author jesus garces
	 *getWidth. <br>
	 *@version 1.0
	 *This method allows you to query the value of the width attribute
	 *<b>pre:</b> have correctly declared the width attribute <br>
	 *<b>post:</b> the value of the width attribute can be consulted <br>
	 *@return to return the value of the width attribute. return != null. 
	*/
	public double getWidth(){
		return width;
	}
	/**
	 *@author jesus garces
	 *getNow. <br>
	 *@version 1.0
	 *This method allows you to query the value of the now relation
	 *<b>pre:</b> have correctly declared the now relation <br>
	 *<b>post:</b> the value of the now relation can be consulted <br>
	 *@return to return the value of the now relation. return != null. 
	*/
	public Use getNow(){
		return now;
	}
	/**
	 *@author jesus garces
	 *setNow. <br>
	 *@version 1.0
	 *This method allows modifying the value of the relation now
	 *<b>pre:</b> have correctly declared the now relation <br>
	 *<b>post:</b> the value of the now relation could be modified <br>
	 *@param now variable to store the modified value of the relation now. now != null.
	*/
	public void setNow(Use now){
		this.now=now;
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
	public String toString(){
		String message="";
		
		message="The habitat identifier is: "+id+", It has a length dimension of: "+longer+", of widrh: "+width+", its type of use is: "+now;
		
		return message;
	}
	
}