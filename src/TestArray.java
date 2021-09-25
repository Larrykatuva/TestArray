
public class TestArray {
	private int [] arr; //Array reference
	private int nItems; //Number of items in the array
	
	/**
	 * Class constructor
	 * @param size
	 */
	public TestArray(int size) {
		this.arr = new int[size];
		this.nItems = 0; 
	}
	
	/**
	 * Inserting item into the array
	 * @param value
	 */
	public void insertItem(int value) {
		this.arr[this.nItems] = value; 
		this.nItems++;
	}
	
	
	/**
	 * Finding item from the array using linear search
	 * @param searchkey
	 * @return boolean found or not
	 */
	public boolean findItem(int searchkey) {
		int j;
		for(j = 0; j<nItems; j++) {
			if(this.arr[j] == searchkey) {
				break;
			}
		}
		if(j == this.nItems) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * Finding item from the array using binary search
	 * @param searchKey
	 * @return integer found item
	 */
	public int BinarySearch(int searchKey) {
		int lowerBound = 0;
		int upperBound = this.nItems - 1;
		int curItem;
		
		while(true) {
			curItem = (lowerBound + upperBound) / 2;
			if(this.arr[curItem] == searchKey) {
				return curItem;
			}
			if(lowerBound > upperBound) {
				return this.nItems;
			}else {
				if(this.arr[curItem] < searchKey) {
					lowerBound = curItem + 1;
				}else {
					upperBound = curItem - 1;
				}
			}
		}
	}
	
	/**
	 * Deleting item from the array
	 * @param deleteKey
	 * @return boolean item deleted or not
	 */
	public boolean deleteItem(int deleteKey) {
		int j;
		for(j = 0; j< this.nItems; j++) {
			if(this.arr[j] == deleteKey) {
				break;
			}
		}
		if(j == this.nItems) {
			return false;
		}else {
			for(int k = j; k < this.nItems; k++) {
				this.arr[k] = this.arr[k+1];
			}
			this.nItems --;
			return true;
		}
	}
	
	/**
	 * Displaying array items
	 */
	public void display() {
		for(int i = 0; i< this.nItems; i++) {
			System.out.println("Index: "+i+" => "+this.arr[i]);
			
		}
	}

}
