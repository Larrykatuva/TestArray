
public class TestArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArray  arr = new TestArray(20);
		arr.insertItem(99);
		arr.insertItem(44);
		arr.insertItem(55);
		arr.insertItem(22);
		arr.insertItem(88);
		arr.insertItem(11);
		arr.insertItem(10);
		
		arr.display();
		System.out.println("Search 55 binary search => "+arr.BinarySearch(11));
		arr.deleteItem(44);
		System.out.println("After deleing");
		arr.display();
		System.out.println("Finding 18 linear search => "+arr.findItem(18));
		System.out.println("Finding 11 linear seatch => "+arr.findItem(11));

		

	}

}
