class Average {
	
	public static float average(int[] values) {
		float total = 0;

		// début de ton code ici !
   
      for (int i = 0; i < values.length ; i = i + 1){
          total = total + values[i];
      }

		// fin de ton code :)

		return total / values.length;
	}
}
