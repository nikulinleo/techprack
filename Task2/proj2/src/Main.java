public class Main {
	public static void main(String[] args){
		StrList mylist = new StrList();

		mylist.push("terrible");
		mylist.push("something1");
		mylist.push("something2");
		mylist.push("something3");
		mylist.push("something4");
		mylist.push("something5");
		mylist.push("something6");
		mylist.push("something7");
		mylist.push("something8");
		mylist.push("something9");
		mylist.push("something10");
		mylist.push("something11");
		mylist.push("something111");

		System.out.println(mylist);
		System.out.println(mylist.avg());
		System.out.println(mylist.max());
		System.err.println();
	}
}