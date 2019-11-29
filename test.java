

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand =new Random();
		int[] val = new int[10];

		// 1
		//乱数生成
		//配列に代入
		for(int i = 0; i < val.length; i++) {
			val[i] = rand.nextInt(100);
		    System.out.printf("%d ", val[i]);
		}
		System.out.println();
		System.out.print("--------------------------------------");
		System.out.println();
		
		
		
		// 2
		// アルゴ
		// 基本選択法
		for(int i = 0; i < val.length; i++) {
			int min = i;
			for(int j = i + 1; j < val.length; j++) {
				if (val[min] > val[j]) {
					// 最小値を選択
					min = j;
				}
			}
	
			if (i != min) {
				// 配列の現在要素と最小値を入れ替える
				int tmp = val[i];
				val[i] = val[min];
				val[min] = tmp;
			}
	
		}
		//配列を出力
		for (int k = 0; k < val.length; k++) {
			System.out.print(val[k] + ", ");
		}
		System.out.println();
		System.out.print("--------------------------------------");
		System.out.println();
		
		
		
		// 3
		//アルゴ
		//基本交換法
		for(int i=0;i<val.length;i++) {
			for(int j=0;j+1<val.length-i;j++) {
				if(val[j]>val[j+1]) {
					int tmp = val[j];
					val[j] = val[j+1];
					val[j+1] = tmp;
				}
			}
		}
		//配列を出力
		for (int k = 0; k < val.length; k++) {
			System.out.print(val[k] + ", ");
		}
		System.out.println();
		System.out.print("--------------------------------------");
		System.out.println();
		
		
		
		//4
		//アルゴ
		//基本挿入法
		for(int i=1;i<val.length;i++) {
			int target = val[i];
			int j = i;
			
			while(j>0 && val[j-1]>target) {
				val[j] = val[j-1];
				j--;
			}
			
			val[j] = target;
		}
		//配列を出力
		for (int k = 0; k < val.length; k++) {
			System.out.print(val[k] + ", ");
		}
		System.out.println();
		System.out.print("--------------------------------------");
		System.out.println();
		
		
		
		//5
		//アルゴ
		//二分探索法
		System.out.println("0~99の値を入力してください。：");
		Scanner scan = new Scanner(System.in);
        int ent = scan.nextInt();
        int low = 0;
        int high = val.length-1;
        int answer = -1;
        while(low <= high) {
        	int mid = (low+high)/2;
        	if(val[mid] == ent) {
            	answer = mid;
            	break;
            }
        	else if(val[mid] > ent) {
        		high = mid-1;
        		
        	}
        	else {
        		low = mid+1;
        	
        	}
        	
        }
        if(answer < 0) {
        	System.out.print("入力した値が見つかりません。");
        }
        else {
        	System.out.print(ent+"は"+(answer+1)+"番目です。");
        }
        
		
		
	}

}
