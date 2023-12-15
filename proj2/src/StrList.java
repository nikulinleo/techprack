public class StrList {
	private String[] container;
	private int allocatedspace;
	private int length;

	public StrList(){
		container = new String[10];
		allocatedspace = 10;
		length = 0;
	}

	public void push(String toadd){
		if (allocatedspace <= length){
			String[] tmp = new String[allocatedspace * 2];
			for(int i = 0; i < allocatedspace; ++i){
				tmp[i] = container[i];
			}
			container = tmp;
			allocatedspace *= 2;
		}
		container[length++] = new String(toadd);
		int pos = length - 1;
		while( (pos >= 1) && (container[pos-1].length() > container[pos].length())){
			String tmp;
			tmp = container[pos-1];
			container[pos-1] = container[pos];
			container[pos] = tmp;
			--pos;
		}
	}

	public String max(){
		return new String(container[length - 1]);
	}

	public float avg(){
		int sum = 0;
		for(int i = 0; i < length; ++i){
			sum += container[i].length();
		}
		return sum/length;
	}

	public String toString(){
		String str = "Contents of list:\n";
		for(int i = 0; i < length; ++i){
			str += "..." + container[i] + "...";
			if(i != length-1) str += "\n";
		}
		return str;
	}
}
