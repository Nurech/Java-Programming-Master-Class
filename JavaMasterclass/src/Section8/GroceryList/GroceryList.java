package Section8.GroceryList;

import java.util.ArrayList;

//Array list is a class. In the array list we can store different type data like String.
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    //with array list we don't have to specify where to save it. it does that by itself
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // how many items we have on grocery list
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }

    // how to add an item to Array list
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // how to remove and item from Array list
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

}
