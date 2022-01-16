import java.util.Random;

public class Lesson5 {
	
	 static int incre_subseq(int[] vetor, int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (vetor[i] > vetor[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }

    public static void main(String[] args) {

    	int[] numRandom = new int[100];
        for(int i = 0; i < numRandom.length; i++) {
            int rnd = (int) (1 + Math.random() * 100);
            numRandom[i] = rnd; 
        }

        for(int i = 0; i < numRandom.length; i++) {
            System.out.println(numRandom[i]);
        }
        
        int n = numRandom.length;
        System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(numRandom, n));
    
    }
}