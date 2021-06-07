package model;

public class Mascot{
	//Atributes
	private String name;
	private int age;
	private String race;
	private String sympthom;
	private boolean consul; //variable to save if the pet has already finished query
	
	//Relation
	private Priority priority;
	private Status statu;
	private Owner property;
	private Veterinary veterinariCons;
	private Specie specie;
	private Habits hir; // variable vara asignar el habitad a la mascota
	
	
	
	//Method
	/**
	 *@author jesus garces
	 *Mascot. <br>
	 *@version 1.0
	 *This is the constructor method of the Mascot class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> attributes and relationships will have been initialized <br>
	 *@param spe variable to assign to the pet species. spe != null.
	 *@param nam variable to assign the name of the pets. nam != null.
	 *@param ag variable to assign the age of the pets. ag != null.
	 *@param ra variable to assign the race of the pets. ra != null.
	 *@param sym variable to assign the sympthom of the pets. sym != null.
	 *@param ido variable assigned to the id of the pet owner. ido != null.
	 *@param nao variable assigned to the name of the pet owner. nao != null.
	 *@param ph variable assigned to the phone of the pet owner. ph != null.
	 *@param dir variable assigned to the direction of the pet owner. dir != null.
	*/
	public Mascot(String spe,String nam,int ag,String ra,String sym,String ido,String nao,int ph,String dir){
	    specie=specie.valueOf(spe);
	    name=nam;
	    age=ag;
	    race=ra;
	    sympthom=sym;
		consul=false; 
	    statu=Status.WAIT;
		
		hir=null;
		veterinariCons=null;
	}
	/**
	 *@author jesus garces
	 *getSpecie. <br>
	 *@version 1.0
	 *This method allows you to query the value of the specie attribute
	 *<b>pre:</b>  have correctly declared the attribute specie <br>
	 *<b>post:</b> the value of the attribute could be consulted specie <br>
	 *@return to return the value of the attribute specie. return != null. 
	*/
	public Specie getSpecie(){
		return specie;
	}
	/**
	 *@author jesus garces
	 *getName. <br>
	 *@version 1.0
	 *This method allows you to query the value of the name attribute
	 *<b>pre:</b>  have correctly declared the attribute name <br>
	 *<b>post:</b> the value of the attribute could be consulted name <br>
	 *@return to return the value of the attribute name. return != null. 
	*/
	public String getName(){
		return name;
	}
	/**
	 *@author jesus garces
	 *getAge. <br>
	 *@version 1.0
	 *This method allows you to query the value of the age attribute
	 *<b>pre:</b>  have correctly declared the attribute age <br>
	 *<b>post:</b> the value of the attribute could be consulted age <br>
	 *@return to return the value of the attribute age. return != null. 
	*/
	public int getAge(){
		return age;
	}
	/**
	 *@author jesus garces
	 *getRace. <br>
	 *@version 1.0
	 *This method allows you to query the value of the race attribute
	 *<b>pre:</b>  have correctly declared the attribute race <br>
	 *<b>post:</b> the value of the attribute could be consulted race <br>
	 *@return to return the value of the attribute race. return != null. 
	*/
	public String getRace(){
		return race;
	}
	/**
	 *@author jesus garces
	 *getSympthom. <br>
	 *@version 1.0
	 *This method allows you to query the value of the sympthom attribute
	 *<b>pre:</b>  have correctly declared the attribute sympthom <br>
	 *<b>post:</b> the value of the attribute could be consulted sympthom <br>
	 *@return to return the value of the attribute sympthom. return != null. 
	*/
	public String getSympthom(){
		return sympthom;
	}
	/**
	 *@author jesus garces
	 *getPriority. <br>
	 *@version 1.0
	 *This method allows you to query the value of the priority relation
	 *<b>pre:</b>  have correctly declared the relation priority <br>
	 *<b>post:</b> the value of the relation could be consulted priority <br>
	 *@return to return the value of the relation priority. return != null. 
	*/
	public Priority getPriority(){
		return priority;
	}
	/**
	 *@author jesus garces
	 *setPriority. <br>
	 *@version 1.0
	 *This method allows modifying the value of the relation priority
	 *<b>pre:</b> have correctly declared the priority relation <br>
	 *<b>post:</b> the value of the priority relation could be modified <br>
	 *@param newprio variable to store the modified value of the relation priority. newprio != null.
	*/
	public void setPriority(Priority newprio){
		priority=newprio;
	}
	/**
	 *@author jesus garces
	 *getStatu. <br>
	 *@version 1.0
	 *This method allows you to query the value of the statu relation
	 *<b>pre:</b>  have correctly declared the relation statu <br>
	 *<b>post:</b> the value of the relation could be consulted statu <br>
	 *@return to return the value of the relation statu. return != null. 
	*/
	public Status getStatu(){
		return statu;
	}
	/**
	 *@author jesus garces
	 *setStatu. <br>
	 *@version 1.0
	 *This method allows modifying the value of the relation statu
	 *<b>pre:</b> have correctly declared the statu relation <br>
	 *<b>post:</b> the value of the statu relation could be modified <br>
	 *@param newsta variable to store the modified value of the relation statu. newsta != null.
	*/
	public void setStatu(Status newsta){
		statu=newsta;
	}
	/**
	 *@author jesus garces
	 *getVeterinaryCons. <br>
	 *@version 1.0
	 *This method allows you to query the value of the veterinariCons relation
	 *<b>pre:</b>  have correctly declared the relation veterinariCons <br>
	 *<b>post:</b> the value of the relation could be consulted veterinariCons <br>
	 *@return to return the value of the relation veterinariCons. return != null. 
	*/
	public Veterinary getVeterinaryCons(){
		return veterinariCons;
	}
	/**
	 *@author jesus garces
	 *setVeterinaryCons. <br>
	 *@version 1.0
	 *This method allows modifying the value of the relation veterinariCons
	 *<b>pre:</b> have correctly declared the veterinariCons relation <br>
	 *<b>post:</b> the value of the veterinariCons relation could be modified <br>
	 *@param newCons variable to store the modified value of the relation veterinariCons. newCons != null.
	*/
	public void setVeterinaryCons(Veterinary newCons){
		veterinariCons=newCons;
	}
	/**
	 *@author jesus garces
	 *getConsul. <br>
	 *@version 1.0
	 *This method allows you to query the value of the consul attribute
	 *<b>pre:</b>  have correctly declared the attribute consul <br>
	 *<b>post:</b> the value of the attribute could be consulted consul <br>
	 *@return to return the value of the attribute consul. return != null. 
	*/
	public boolean getConsul(){
		return consul;
	}
	/**
	 *@author jesus garces
	 *setVeterinaryCons. <br>
	 *@version 1.0
	 *This method allows modifying the value of the attribute consul
	 *<b>pre:</b> have correctly declared the consul attribute <br>
	 *<b>post:</b> the value of the consul attribute could be modified <br>
	 *@param newConsul variable to store the modified value of the attribute consul. newConsul != null.
	*/
	public void setConsul(boolean newConsul){
		consul=newConsul;
	}
	/**
	 *@author jesus garces
	 *getHir. <br>
	 *@version 1.0
	 *This method allows you to query the value of the Habits relation
	 *<b>pre:</b>  have correctly declared the relation Habits <br>
	 *<b>post:</b> the value of the relation could be consulted Habits <br>
	 *@return to return the value of the relation Habits. return != null. 
	*/
	public Habits getHir(){
		return hir;
	}
	/**
	 *@author jesus garces
	 *setHir. <br>
	 *@version 1.0
	 *This method allows modifying the value of the relation Habits
	 *<b>pre:</b> have correctly declared the Habits relation <br>
	 *<b>post:</b> the value of the Habits relation could be modified <br>
	 *@param newHir variable to store the modified value of the relation Habits. newHir != null.
	*/
	public void setHir(Habits newHir){
		hir=newHir;
	}
}
