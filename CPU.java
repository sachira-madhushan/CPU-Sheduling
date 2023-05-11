import java.util.*;
class CPU{


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("[?]Enter number of processos :");
		int numOfProcess=sc.nextInt();
		String[] id=new String[numOfProcess];
		int[] runTime=new int[numOfProcess];
		int[] priority=new int[numOfProcess];

		int[] ct=new int[numOfProcess];
		int[] tat=new int[numOfProcess];
		int[] waiting=new int[numOfProcess];


		for(int i=0;i<numOfProcess;i++){
			sc.nextLine();
			System.out.println("-------------Process "+(i+1)+"------------");
			System.out.print("[?]Process Id :");
			id[i]=sc.nextLine();
			System.out.print("[?]Run time :");
			runTime[i]=sc.nextInt();
			System.out.print("[?]Priority :");
			priority[i]=sc.nextInt();
		}
		boolean completed=false;
		int prio=1;
		int loop=0;
		int sumOfCompletion=0;
		while(!completed){
			if(loop>numOfProcess-1){
				loop=0;
			}
			else if(prio==priority[loop]){
				sumOfCompletion+=runTime[loop];
				ct[prio-1]=sumOfCompletion;
				prio++;
			}
			else if(prio>numOfProcess-1){
				completed=true;
			}
				loop++;
		}

		for(int i=0;i<numOfProcess;i++){
			System.out.print(ct[i]+" ");
		}
	}
}