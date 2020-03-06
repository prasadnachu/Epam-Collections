package com.epam.CustomList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomList<Integer> mylist = new CustomList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        LOGGER.debug(mylist);
        mylist.remove(2);
        LOGGER.debug(mylist);
        LOGGER.debug(mylist.get(0) );
        LOGGER.debug(mylist.get(1) );
        LOGGER.debug(mylist.size());
        CustomList<String>mylist2=new CustomList<>();
        mylist2.add("ant");
        mylist2.add("ball");
        mylist2.add("cat");
        mylist2.add("doll");
        LOGGER.debug(mylist2);
        LOGGER.debug(mylist.get(0));
        LOGGER.debug(mylist2.size());
        mylist2.remove(2);
        LOGGER.debug(mylist2);
    }
}
