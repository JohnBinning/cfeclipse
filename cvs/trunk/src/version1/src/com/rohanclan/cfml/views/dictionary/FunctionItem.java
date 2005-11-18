/*
 * Created on 	: 05-Nov-2004
 * Created by 	: Mark Drew
 * File		  	: FunctionItem.java
 * Description	:
 * 
 */
package com.rohanclan.cfml.views.dictionary;

import com.rohanclan.cfml.dictionary.Function;


class FunctionItem extends DictionaryItem{
  
    

    public FunctionItem(String name){
        super(name);
    } 
    
    public String getHelp(){

      return super.getDictionary().getFunctionHelp(super.getName());
    }
   
    public Function getFunction(){
    	
    	return super.getDictionary().getFunction(super.getName());
    }
}