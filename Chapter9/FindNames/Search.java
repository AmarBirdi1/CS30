package FindNames;

// Search class


	public class Search {
		public static int linear(String[] namesArr,String name){
			for(int i=0;i<namesArr.length;i++){
				if(namesArr[i].equals(name))
					return i;
			}
			return -1;
		}
	}
