//Tarea integradora #3
package ui;

import java.util.Scanner;
import model.CenterVeterinary;

public class Main {
	//object
	public static Scanner sn=new Scanner(System.in);
	public static CenterVeterinary cv=new CenterVeterinary(120,7);
	
	public static void main(String[]args){
		//Main menu
		
		int p=0;
		while (p==0){
			
			int oopcion=mainMenu();
			
			switch(oopcion){
				
				case 1:
				   
				   int i=0;
		           while (i==0){
			
			         int opcion=menu();
			
			         switch(opcion){
			
	            		    case 1:
		         		     registerVeterinary();
				            break;
			
	             			case 2: 
	            			  registerMascot();
	             			break;
			
		            		case 3:
	             			  addConsultation();
		            		break;
			
		             		case 4: 
			            	  removeMascot();
			            	break;
				
			             	case 5:  
			            	 deleteConsultation();
		               		break;
				
		            		case 6:  
	            			 mascotAtended();
	            			break;
				
		              		case 7:
		            		 deleteVeterinary();
		            		break;
							
							case 8:
							 enterHospitalization();
							break;
							
		             		case 9:  
			             	 int op=closeCenter();
			             	 int a=0;
				 
				            	switch(op){
			                        case 1:
			                         showVeterinary();
			                        break;
	                                case 2: 
			                         showPriority();
		                          	break;
	                            	case 3:
			                         showPorcen();
		                            break;
		                            case 4:
			                         deleteMascot();
			                        break;
			                        case 5: a=1;
			                         System.out.println("your return to the previous menu.");
			                        break;
		                        }
				            break;
				
				            case 10:  i=1;
				             System.out.println("your return to the previous menu.");
				            break;
			            }
		            } 
				break;
				
				case 2:
					int j=0;
				 
		           while (j==0){
			
			         int op=menuKindergarden();
			
			         switch(op){
						 
						    case 1:
                             registerMascotkg();
						    break;
							
						    case 2:
                             showMascot();
						    break;
							
						    case 3:
                             showKindergarden();
						    break;
							
						    case 4:
                             habitsInformation();
						    break;
							
						    case 5:
                             ocupationPorcen();
						    break;
							
						    case 6:
                             generalPorcen();
						    break;
							
							case 7:
							 healtPorcen();
							break;
							
						    case 8: j=1;
                             System.out.println("your return to the previous menu.");
						    break;
					    }
				    }
				break;
				
				case 3: p=1;
				 System.out.println("3: He has exited the program.");
				break;
			}
		}
		
	}
	/**
	 *@author jesus garces
	 *mainMenu.<br>
	 *@version 2.0
	 *This method shows the main menu where the user will choose the option to execute.
	 *<b>pre:</b> star the program <br>
	 *<b>post:</b> displays the main menu on the screen <br>
	 @return to return the option to execute in the program. return != null.
	*/
	public static int mainMenu(){
		int chose=0;
		int a=0;
		
		System.out.println("      \n          MAIN MENU                             ");
		System.out.println("\n please choose an option: \n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1: Veterinary emergencies");
		System.out.println("2: pet nursery");
		System.out.println("3: out of the program.");
		System.out.println("--------------------------------------------------------------");
		
		while (a==0){
			
			chose=sn.nextInt();
			sn.nextLine();
		
			if (chose>3){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				a=1;
		}
		
		return chose;
	}
	/**
	 *@author jesus garces
	 *menuKindergarden.<br>
	 *@version 2.0
	 *This method shows the main menu where the user will choose the option to execute.
	 *<b>pre:</b> choose the 2 option in the main menu <br>
	 *<b>post:</b> displays the main menu on the screen <br>
	 @return to return the option to execute in the program. return != null.
	*/
	public static int menuKindergarden(){
		int choo=0;
		int c=0;
		
		System.out.println("      \n          KINDERGARDEN MENU                             ");
		System.out.println("\n please choose an option: \n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1: Register a mascot in the kindergarden");
		System.out.println("2: for see information of a mascot");
		System.out.println("3: show kindergarden map");
		System.out.println("4: show habits information");
		System.out.println("5: see percentage of ocupation for zone");
		System.out.println("6: see percentage general ocupation of the kindergarden");
		System.out.println("7: see percentage heigth mascot and percentage of mascot in hospitalization");
		System.out.println("8: return to the previous menu. ");
		System.out.println("--------------------------------------------------------------");
		
		while (c==0){
			
			choo=sn.nextInt();
			sn.nextLine();
		
			if (choo>8){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				c=1;
		}
		
		return choo;
	}
	/**
	 *@author jesus garces
	 *menu.<br>
	 *@version 2.0
	 *This method shows the center vetrinary menu where the user will choose the option to execute in the main menu
	 *<b>pre:</b> choose the oprion 1 in the main menu <br>
	 *<b>post:</b> displays the main menu on the screen <br>
	 @returnto return the option to execute in the program. return != null.
	*/
	public static int menu() {
		int choose=0;
		int b=0;
		
		System.out.println("      \n          CENTER VETERYNARY MENU                             ");
		System.out.println("\n please choose an option: \n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1: register a veterinary ");
		System.out.println("2: register a mascot");
		System.out.println("3: star a consultation");
		System.out.println("4: remove a mascot");
		System.out.println("5: finich a consultation");
		System.out.println("6: see the number of mascot that have not been attended");
		System.out.println("7: delete a veterinary");
		System.out.println("8: enter hospitalization a mascot");
		System.out.println("9: menu close center");
		System.out.println("10: return to the previous menu. ");
		System.out.println("--------------------------------------------------------------");
		
		while (b==0){
			
			choose=sn.nextInt();
			sn.nextLine();
		
			if (choose>10){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				b=1;
		}
		
		return choose;
	}
	/**
	 *@author jesus garces
	 *registerVeterinary.<br>
	 *@version 1.0
	 *This method is used to record the data of a veterinarian
	 *<b>pre:</b> the veterinary object must have been created in its corresponding class <br>
	 *<b>post:</b> a veterinarian will have registered <br>
	*/
	public static void registerVeterinary(){
		
		System.out.println("\n Enter the name of the veterinary \n");
		String namev=sn.nextLine();
		
		System.out.println("\n Enter the lastname of the veterinary \n");
		String lastn=sn.nextLine();
		
		System.out.println("\n Enter the id of the veterinary \n");
		String idv=sn.nextLine();
		
		System.out.println("\n Enter the record of the veterinary \n");
		String rec=sn.nextLine();
		
		String message=cv.addVeterinary(namev,lastn,idv,rec);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *registerMascot. <br>
	 *@version 1.0
	 *This method is used to record the data of a pet
	 *<b>pre:</b> have created the pet object in the corresponding class <br>
	 *<b>post:</b> a pet has been registered <br>
	*/
	public static void registerMascot(){
		
		System.out.println("\n Enter the specie of the mascot \n");
		String specie=sn.nextLine();
		
		System.out.println("\n Enter the name of the mascot \n");
		String namem=sn.nextLine();
		
		System.out.println("\n Enter the age of the mascot \n");
		int age=sn.nextInt();
		sn.nextLine();
		
		System.out.println("\n Enter the race of the mascot \n");
		String race=sn.nextLine();
		
		System.out.println("\n Enter the sympthom of the mascot \n");
		String sympthom=sn.nextLine();
		
		System.out.println("\n Enter the priority of the mascot. Enter 1 for PRIORITY1, 2 for PRIORITY2, 3 for PRIORITY3, 4 for PRIORITY4, 5 for PRIORITY5 \n");
		int p=sn.nextInt();
		sn.nextLine();

		System.out.println("\n Enter the id of the Owner \n");
		String ido=sn.nextLine();
		
		System.out.println("\n Enter the name of the Owner \n");
		String nameo=sn.nextLine();
		
		System.out.println("\n Enter the phone of the Owner \n");
		int phone=sn.nextInt();
		sn.nextLine();
		
		System.out.println("\n Enter the direction of the Owner \n");
		String direction=sn.nextLine();
		
		String message=cv.addMascot(specie,namem,age,race,sympthom,ido,nameo,phone,direction,p);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *addConsultation.<br> 
	 *@version 1.0
	 *This method is used to start a query
	 *<b>pre:</b> that the vet is not in consultation, that there is a pet to attend <br>
	 *<b>post:</b> a consultation has been started <br>
	*/
	public static void addConsultation(){
		String read="";
		String message="";
		
		System.out.println("Enter the CC of the veterinary");
		read=sn.nextLine();
		
		message=cv.addConsultation(read);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteConsultation. <br>
	 *@version 1.0
	 *This method is used to end a query
	 *<b>pre:</b> have started a consultation <br>
	 *<b>post:</b> a consultation will have been completed <br>
	*/
	public static void deleteConsultation(){
		String c="";
		String message="";
		
		System.out.println("\n Enter the CC of the veterinary \n");
		c=sn.nextLine();
		
		System.out.println("\n Enter the name of the mascot \n");
		String namee=sn.nextLine();
		
		System.out.println("Do you authorize the departure of your pet? Enter 1 for 'YES', 2 for 'Transfer to hospitalization'");
		int auto=sn.nextInt();
		
		message=cv.deleteConsultation(c,namee,auto);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *removeMascot. <br>
	 *@version 1.0
	 *This method is used to remove a pet from the veterinary center
	 *<b>pre:</b> which pet is pending to be attended. <br>
	 *<b>post:</b> a pet will have been withdrawn from the veterinary center <br>
	*/
	public static void removeMascot(){
		String readd="";
		String message="";
		
		System.out.println("Enter the name of the mascot");
		readd=sn.nextLine();
		
		message=cv.removeMascot(readd);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *mascotAtended. <br>
	 *@version 1.0
	 *This method is used to know how many pets registered in the center, which have the status of waiting to be cared for
	 *<b>pre:</b> have at least one pet registered with the veterinary center, and who has the status of waiting to be cared for <br>
	 *<b>post:</b> The number of pets registered in the center is shown on the screen, which have the status of waiting to be attended <br>
	*/
	public static void mascotAtended(){
		int message=0;
		
		message=cv.mascotAtended();
		System.out.println("the number of pets that have not been laid is: "+message);
	}
	/**
	 *@author jesus garces
	 *closeCenter. <br>
	 *@version 1.0
	 *This method shows on the screen the closing menu of the veterinary center
	 *<b>pre:</b> choose option 8 in the main menu <br>
	 *<b>post:</b> the closing menu of the veterinary center is displayed on the screen <br>
	 *@return to return a number. return != null.
	*/
	public static int closeCenter(){
		int choose=0;
		int b=0;
		//menu close center veterinary
		System.out.println("\n please choose an option: \n");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1: Show the name of the veterinarian with the highest number of consultations");
		System.out.println("2: see Number of pets cared for by priority");
		System.out.println("3: Percentage of pets that left the center without being cared for");
		System.out.println("4: Remove all cared pets");
		System.out.println("5: return to the previous menu.");
		System.out.println("----------------------------------------------------------------------");
		
		while (b==0){
			
			choose=sn.nextInt();
			sn.nextLine();
		
			if (choose>5){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				b=1;
		}
		
		return choose;
	}
	/**
	 *@author jesus garces
	 *showVeterinary. <br>
	 *@version 1.0
	 *This method shows on the screen the name of the veterinarian who had the highest number of consultations.
	 *<b>pre:</b> that the vet has had at least one consultation <br>
	 *<b>post:</b> The name of the veterinarian with the highest number of consultations is displayed on the screen <br>
	*/
	public static void showVeterinary(){
		String message="";
		
		message=cv.maxVeterinary();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showPriority. <br>
	 *@version 1.0
	 *This method shows on screen the number of pets attended by priority
	 *<b>pre:</b> have registered at least one pet, and that it has been in consultation <br>
	 *<b>post:</b> shows on screen the number of pets cared for by priority <br>
	*/
	public static void showPriority(){
		String message="";
		
		message=cv.countPriority();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showPorcen. <br>
	 *@version 1.0
	 *This method shows the Percentage of pets that left the center without being cared for
	 *<b>pre:</b> have registered at least one pet <br>
	 *<b>post:</b> shows the Percentage of pets that left the center without being cared for <br>
	*/
	public static void showPorcen(){
		String message="";
		cv.setHorary(10.30);
		
		message=cv.calculatePorcen();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteMascot. <br>
	 *@version 1.0
	 *This method is used to remove all cared pets
	 *<b>pre:</b> have registered a pet, and that it has been consulted <br>
	 *<b>post:</b> all cared pets will have been removed <br>
	*/
	public static void deleteMascot(){
		String message="";
		
		message=cv.deleteAllmascot();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteVeterinary. <br>
	 *@version 1.0
	 *This method serves to eliminate a veterinarian
	 *<b>pre:</b> that there are no pets registered at the veterinary center <br>
	 *<b>post:</b> a vet will have been removed <br>
	*/
	public static void deleteVeterinary(){
		String message="";
		
		System.out.println("Enter the ID of the veterinarian you want to delete");
		String cc=sn.nextLine();
		
		message=cv.deleteVeterinary(cc);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *enterHospitalization. <br>
	 *@version 1.0
	 *This metohd allow the admission to hospitalization of a pet that has been cared for by one of the veterinarians.
	 *<b>pre:</b> Verify that there is space in the corresponding area according to the type of pet. <br>
	 *<b>post:</b> show message whit information. <br>
	*/
	public static void enterHospitalization(){
		String message="";
		
		System.out.println("Enter the name od the mascot what should enter to hospitalization");
		String nameMascot=sn.nextLine();
		
		System.out.println("Enter the specie of the mascot.enter (1) for DOG,(2) for CAT,(3) for RABBIT,(4) for BIRD,(5) for REPTILES");
		int spe=sn.nextInt();
		sn.nextLine();
		
		switch(spe){
			case 1:
			 System.out.println("\n Enter the id of the habits");
			 String idHabit=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lon=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wint=sn.nextDouble();
			 sn.nextLine();
			 
             String now="EMPTY";
			 
			 System.out.println("\n Enter the number of toy of the habits");
			 int toy=sn.nextInt();
			 sn.nextLine();
			 
			 String m=cv.registerHabitad(idHabit,lon,wint,now,toy);
			 System.out.println(m);
			break;
			
			case 2:
			 System.out.println("\n Enter the id of the habits");
			 String idHabita=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lona=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double winta=sn.nextDouble();
			 sn.nextLine();
			 
             String noa="EMPTY";
			 
			 System.out.println("\n Enter the elevation of the habits");
			 double elea=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the heigth of the habits");
			 double heigtha=sn.nextDouble();
			 sn.nextLine();
			 
			 String ma=cv.registerHabitad(idHabita,lona,winta,noa,elea,heigtha);
			 System.out.println(ma);
			break;
			
			case 3:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitb=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lonb=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintb=sn.nextDouble();
			 sn.nextLine();
			 
             String nob="EMPTY";
			 
			 System.out.println("\n Enter the elevation of the habits");
			 String plant=sn.nextLine();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the heigth of the habits");
			 int cPlant=sn.nextInt();
			 sn.nextLine();
			 
			 String mb=cv.registerHabitad(idHabitb,lonb,wintb,nob,plant,cPlant);
			 System.out.println(mb);
			break;
			
			case 4:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitc=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lonc=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintc=sn.nextDouble();
			 sn.nextLine();
			 
             String noc="EMPTY";
			 
			 System.out.println("\n ingrese un numero para saber como esta la jaula. (G) para colgada, (T) para en tierra");
			 char cage=sn.nextLine().charAt(0);
			 sn.nextLine();
			 
			 System.out.println("\n Enter the elevation of the habits");
			 double eleCage=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the cantidad de aves que puede albergar the habits");
			 int birds=sn.nextInt();
			 sn.nextLine();
			 
			 String mc=cv.registerHabitad(idHabitc,lonc,wintc,noc,cage,eleCage,birds);
			 System.out.println(mc);
			break;
			
			case 5:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitd=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lond=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintd=sn.nextDouble();
			 sn.nextLine();
			 
             String nod="EMPTY";
			 
			 System.out.println("\n Enter the material of the aquarium");
			 String mate=sn.nextLine();
			 
			 System.out.println("\n Enter the type of the aquarium. (A) for anfibius. (T) for earth ");
			 char type=sn.nextLine().charAt(0);
			 
			 String md=cv.registerHabitad(idHabitd,lond,wintd,nod,mate,type);
			 System.out.println(md);
			break;
		}
		
		message=cv.enterHospitalization(nameMascot,spe);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *registerMascotkg. <br>
	 *@version 1.0
	 *This metohd allows you to register the entry of a pet in the nursery
	 *<b>pre:</b> Ask the user the data of the pet, the owner of the pet and the number of days in which it is will use the service. Verify that there is space in the corresponding area according to the type of pet. Register the pet a free habitat and change the habitat status to occupied-healthy. <br>
	 *<b>post:</b> show message whit information. <br>
	*/
	public static void registerMascotkg(){
		String message="";
		
		System.out.println("\n Enter the specie of the mascot.enter (1) for DOG,(2) for CAT,(3) for RABBIT,(4) for BIRD,(5) for REPTILES"); 
		int spec=sn.nextInt();
		sn.nextLine();
		
		System.out.println("\n Enter the name of the mascot \n");
		String namema=sn.nextLine();
		
		System.out.println("\n Enter the id of the Owner \n");
		String idow=sn.nextLine();
		
		System.out.println("\n how many days will you use the service");
		int days=sn.nextInt();
		sn.nextLine();
		
		switch(spec){
			case 1:
			 System.out.println("\n Enter the id of the habits");
			 String idHabit=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lon=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wint=sn.nextDouble();
			 sn.nextLine();
			 
             String now="EMPTY";
			 
			 System.out.println("\n Enter the number of toy of the habits");
			 int toy=sn.nextInt();
			 sn.nextLine();
			 
			 String m=cv.registerHabitad(idHabit,lon,wint,now,toy);
			 System.out.println(m);
			break;
			
			case 2:
			 System.out.println("\n Enter the id of the habits");
			 String idHabita=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lona=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double winta=sn.nextDouble();
			 sn.nextLine();
			 
             String noa="EMPTY";
			 
			 System.out.println("\n Enter the elevation of the habits");
			 double elea=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the heigth of the habits");
			 double heigtha=sn.nextDouble();
			 sn.nextLine();
			 
			 String ma=cv.registerHabitad(idHabita,lona,winta,noa,elea,heigtha);
			 System.out.println(ma);
			break;
			
			case 3:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitb=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lonb=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintb=sn.nextDouble();
			 sn.nextLine();
			 
             String nob="EMPTY";
			 
			 System.out.println("\n Enter the elevation of the habits");
			 String plant=sn.nextLine();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the heigth of the habits");
			 int cPlant=sn.nextInt();
			 sn.nextLine();
			 
			 String mb=cv.registerHabitad(idHabitb,lonb,wintb,nob,plant,cPlant);
			 System.out.println(mb);
			break;
			
			case 4:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitc=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lonc=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintc=sn.nextDouble();
			 sn.nextLine();
			 
             String noc="EMPTY";
			 
			 System.out.println("\n ingrese un numero para saber como esta la jaula. (G) para colgada, (T) para en tierra");
			 char cage=sn.nextLine().charAt(0);
			 sn.nextLine();
			 
			 System.out.println("\n Enter the elevation of the habits");
			 double eleCage=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the cantidad de aves que puede albergar the habits");
			 int birds=sn.nextInt();
			 sn.nextLine();
			 
			 String mc=cv.registerHabitad(idHabitc,lonc,wintc,noc,cage,eleCage,birds);
			 System.out.println(mc);
			break;
			
			case 5:
			 System.out.println("\n Enter the id of the habits");
			 String idHabitd=sn.nextLine();
			 
			 System.out.println("\n Enter the long of the habits");
			 double lond=sn.nextDouble();
			 sn.nextLine();
			 
			 System.out.println("\n Enter the width of the habits");
			 double wintd=sn.nextDouble();
			 sn.nextLine();
			 
             String nod="EMPTY";
			 
			 System.out.println("\n Enter the material of the aquarium");
			 String mate=sn.nextLine();
			 
			 System.out.println("\n Enter the type of the aquarium. (A) for anfibius. (T) for earth ");
			 char type=sn.nextLine().charAt(0);
			 
			 String md=cv.registerHabitad(idHabitd,lond,wintd,nod,mate,type);
			 System.out.println(md);
			break;
		}
		
		message=cv.registerMascotkg(spec,namema,idow);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showMascot. <br>
	 *@version 1.0
	 *This metohd shows if a pet is in daycare and report the zone, the habitat identifier, and if it is sick or healthy.
	 *<b>pre:</b> enter the name of mascot <br>
	 *<b>post:</b> displays in the screen  if a pet is in daycare and report the zone, the habitat identifier, and if it is sick or healthy. <br>
	*/
	public static void showMascot(){
		String message="";
		
		System.out.println("\n Enter the name of the mascot \n");
		String mascotName=sn.nextLine();  
		
		message=cv.showMascot(mascotName);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showKindergarden. <br>
	 *@version 1.0
	 *This metohd prints on the console the map of the nursery showing the status of each habitat.
	 *<b>pre:</b> choose the opcion 4 in the kindergarden menu <br>
	 *<b>post:</b> prints on the console the map of the nursery showing the status of each habitat. <br>
	*/
	public static void showKindergarden(){
		String message=""; 
		
		message=cv.showKindergarden();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *habitsInformation. <br>
	 *@version 1.0
	 *This metohd displays on the console the information on the habitat and the pet that is housed.
	 *<b>pre:</b> enter a habitat identifier <br>
	 *<b>post:</b> displays on screen the information on the habitat and the pet that is housed. <br>
	*/
	public static void habitsInformation(){
		String message="";
		
		System.out.println("\n Enter the id of the habits \n");
		String habi=sn.nextLine();  
		
		message=cv.habitsInformation(habi);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *ocupationPorcen. <br>
	 *@version 1.0
	 *This metohd show the percentage of general occupation of the nursery.
	 *<b>pre:</b> choose 5 in the kindergarden menu <br>
	 *<b>post:</b> displays on screen the percentage of general occupation of the nursery. <br>
	*/
	public static void ocupationPorcen(){
		String message=""; 
		
		message=cv.ocupationPorcen();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *generalPorcen. <br>
	 *@version 1.0
	 *This metohd show percentage of general occupation of the nursery.
	 *<b>pre:</b> choose 6 in the kindergarden menu <br>
	 *<b>post:</b> displays on screen the percentage of general occupation of the nursery. <br>
	*/
	public static void generalPorcen(){
		String message=""; 
		
		message=cv.generalPorcen();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *healtPorcen. <br>
	 *@version 1.0
	 *This metohd show the percentage of healthy pets and percentage of hospitalized pets.
	 *<b>pre:</b> choose 7 in the kindergarden menu <br>
	 *<b>post:</b> displays on screen the percentage of healthy pets and percentage of hospitalized pets. <br>
	*/
	public static void healtPorcen(){
		String message=""; 
		
		message=cv.healtPorcen();
		System.out.println(message);
	}
}