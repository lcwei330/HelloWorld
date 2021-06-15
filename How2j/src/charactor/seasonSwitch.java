package charactor;
import java.util.Scanner;
//continue 继续下一次循环/ break; 直接结束当前for循环
public class seasonSwitch {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int day = s.nextInt();
	        if (day==1)
	            System.out.println("monday");
	              
	        else if (day==2)
	            System.out.println("tuesday");
	        else if (day==3)
	            System.out.println("wednesday");
	        else if (day==4)
	            System.out.println("thursday");
	        else if (day==5)
	            System.out.println("friday");
	        else if (day==6)
	            System.out.println("saturday");
	        else if (day==7)
	            System.out.println("sunday");
	        else
	            System.out.println("what the hell");
	        
	        System.out.println("inut month num");
	        int month = s.nextInt();
	        String season;
	        switch (month) {
	        case 1:
	        case 2:
	        case 3:
	            season = "spring";
	            break;
	        case 4:
	        case 5:
	        case 6:
	            season = "summer";
	            break;
	        case 7:
	        case 8:
	        case 9:
	            season = "autumn";
	            break;
	        case 10:
	        case 11:
	        case 12:
	            season = "winnter";
	            break;
	        default:
	            season = "what the hell";
	 
	        }
	         
	        System.out.println(season);
	 
	    }
	}
