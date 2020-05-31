public class CountingValleys {
    String s = "DDUUUUDD";
    public void countValleys(){
        char[] charArray=s.toCharArray();
        int i =0,currentValue=0,count=0;
        boolean flag=false;
        int valleyCount = 0;
        while(i<charArray.length){
            if(charArray[i] == 'U') currentValue = 1;
            else currentValue = -1;
            count = count+currentValue;
            if(count < 0) flag = true;
            else if(count > 0) flag = false;
            else if(flag == true) valleyCount += 1;
            i = i+1;
        }
        System.out.println(valleyCount);
    }
}
