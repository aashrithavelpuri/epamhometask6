package home_task_6;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomCollectionMain {
	private static final Logger LOGGER = LogManager.getLogger(CustomCollectionDemo.class);
	public static void main(String args[]) {
		CustomCollectionDemo customCollectionObject = new CustomCollectionDemo();
    	Scanner sc = new Scanner(System.in);
    	int continueOrExit;
    	do
    	{
    		LOGGER.info("\n\t1)Add Element\n\t2) Size of the list\n\t3)Remove element\n\t4)Display\nEnter your choice:");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1:Object element = null;
    			//LOGGER.info("Enter object");
    				int objectTypeselection;
    				LOGGER.info("\n\tSelect which type of object you want to insert \n\t1)Integer\n\t2)Float \n\t3)Character\n\t4)String\n\tEnter your selection type :  ");
    				objectTypeselection=sc.nextInt();
    				switch(objectTypeselection)
    				{
    					case 1:LOGGER.info("\n\tEnter object:");
    						element=sc.nextInt();
    						break;
    					case 2:LOGGER.info("\n\tEnter object:");
    						element=sc.nextFloat();
    						break;
    					case 3:LOGGER.info("\n\tEnter object:");
    						element=sc.next();
    						break;
    					case 4:LOGGER.info("\n\tEnter object:");
    						element=sc.next();
    						break;
    					default:LOGGER.info("\n\tChoose only between 1-4!!");
    				}
    				customCollectionObject.addElement(element);
    				break;
    			case 2:LOGGER.info("Size : "+customCollectionObject.size());
    					break;
    			case 3:int indexNumberToBeDeleted;
    					LOGGER.info("Enter index number of the element to be deleted");
    					indexNumberToBeDeleted=sc.nextInt();
    					customCollectionObject.removeElement(indexNumberToBeDeleted);
    					break;
    		
    			case 4	:customCollectionObject.display();
    				break;
    			default:LOGGER.info("Required operation is not present");
    	}
    		LOGGER.info("Enter 1 to continue and 0 to exit");
    	 continueOrExit=sc.nextInt();
    	}while(continueOrExit == 1);
    	sc.close();
    }
}
