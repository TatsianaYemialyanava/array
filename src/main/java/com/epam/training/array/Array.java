package com.epam.training.array;

import java.util.Arrays;

public class Array {

	private final int[] items;

	public Array(){
		items = new int[]{};
	}
	
	public Array(int[] items){
		this.items = items;
	}
	
	public int[] getItems() {
		return Arrays.copyOf(items, items.length);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (( items == null) ? 0 : items.hashCode());
        return result;    	    
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Array other = (Array) obj;
		if (!Arrays.equals(items, other.items)) {
			return false;
		}
		return true;
	}
	
	@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i = 0; i < items.length; i++) {
            stringBuilder.append(items[i]);
            if(i != items.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

	


		

}
