package home_task_6;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CustomCollectionDemo extends ArrayList{
	private static final Logger LOGGER = LogManager.getLogger(CustomCollectionDemo.class);
	private Object[] objectsArray=new Object[10];
	private int objectCount=0;
	public void addElement(Object obj)
	{
		if(objectCount == objectsArray.length)
		{
		increaseCapacityOfArray();
		}
		objectsArray[objectCount] = obj;
		objectCount++;
	}
	public void increaseCapacityOfArray()
	{
		int newcapacity = objectsArray.length + 1;
		Object[] expandedArray = new Object[newcapacity];
		for(int i = 0; i < objectsArray.length; i++)
		{
		expandedArray[i] = objectsArray[i];
		}
		objectsArray = expandedArray;
	}
	public int capacity()
	{
		return objectsArray.length;
	}
	public int size()
	{
		return objectCount;
	}
	public void replaceElement(int index,Object obj)
	{
		if(index < 0 || index >= size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		objectsArray[index] = obj;
		LOGGER.info("After replacement of an element the object array is as follows : ");
		for(Object val : objectsArray)
		{
			LOGGER.info(val+"\t");
		}
		System.out.println();
	}
	public void removeElement(int index)
	{
		if(index < 0 || index >= size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		while(index<size()-1)
		{
			objectsArray[index] = objectsArray[index + 1];
			index++;
		}
		objectsArray[index] = null;
		objectCount--;
		LOGGER.info("After removal of an element the object array is as follows : ");
		for(Object val : objectsArray)
		{
			LOGGER.info(val+"\t");
		}
		System.out.println();
	}
	public void insert(int index,Object obj)
	{
		if(index < 0 || index >= size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		if(size() == capacity())
		{
		increaseCapacityOfArray();
		}
		int i;
		for(i = size() - 1;i >= index; i--)
		{
			objectsArray[i + 1] = objectsArray[i];
		}
		objectsArray[i + 1] = obj;
		objectCount++;
		LOGGER.info("After insertion the object array is as follows : ");
		for(Object val : objectsArray)
		{
			LOGGER.info(val+"\t");
		}
		System.out.println();
	}
	public void display()
	{
		for(int i = 0;i < size(); i++)
		{
			LOGGER.info(objectsArray[i]+"\t");
		}
		System.out.println();
	}
}