import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class StackSort extends Stack {
	int[] a;
	Map<Integer,Stack> stackMap = new HashMap<>(a.length);
	
	public StackSort(int[] stackSizes) {
	   stackSizes = a;
	}

	public Map arrayToStack() {
		for(int i=0; i < a.length; i++)
		{
		   stackMap.put(i, new Stack<Boolean>());
		}
		return stackMap;
	}
	
	public Stack fillStack(int num, Stack y) {
		for (int i = 0; i < num; i++) {
			y.push(true);
		}
		return y;
	}
	
	public void fillAll() {
		int num;
		for (int i = 0; i < stackMap.size(); i++) {
			num = a[i];
			((StackSort) stackMap.get(i)).fillStack(num, stackMap.get(i));
		}
	}
	
	public int dropStack(Stack x) {
		int dropTime = 0;
		for (int i = x.size(); i > 0; i--) {
			dropTime++;
		}
		return dropTime;
	}
	
	public Map<Integer,Stack> sortStack() {
		int temp;
		Map<Integer,Stack> sortMap = new HashMap<Integer, Stack>(stackMap);
		
		for (int i = 0; i < sortMap.size() - 1; i++) {
			 for (int j = 1; j < sortMap.size() - i; j++) {
				if (sortMap.get(j - 1).size() > sortMap.get(j).size()) {
					temp = sortMap.get(j - 1).size();
					//crunchifyArr[j - 1] = crunchifyArr[j];
					sortMap.put(j - 1, sortMap.get(i));
					//crunchifyArr[j] = temp;
					sortMap.put(j, sortMap.get(temp));
				}
			 }
		}
		return sortMap;
	}
}