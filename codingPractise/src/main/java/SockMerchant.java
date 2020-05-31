/*
John works at a clothing store. He has a large pile of socks that he must pair by
color for sale. Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

For example, there are  n =7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of 2
color . There are three odd socks left, one of each color. The number of pairs is 2.
 */
public class SockMerchant {
    int[][] socksCounter;
    int lastPos;
    public SockMerchant(int len) {
        this.socksCounter = new int[len][2];
        this.lastPos = -1;
    }
    public int getIndex(int socks){
        int index=-1;
        if(lastPos > -1){
            for(int i=0;i<=lastPos;i++){
                if(socksCounter[i][0]==socks){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public void setSocksCounter(int socks){
        int index = getIndex(socks);
        if(index == -1){
            //This is first occurrence
            lastPos++;
            socksCounter[lastPos][0]=socks;
            socksCounter[lastPos][1]=1;
        }
        else{
            //This is repeated occurrence
            int prevCount = socksCounter[index][1];
            socksCounter[index][1] = prevCount+1;
        }
    }
    public void display(){
        for (int row =0;row<=lastPos;row++){
            System.out.println("Row = "+row+",sock is "+socksCounter[row][0]+",count is "+socksCounter[row][1]);
        }
    }

    public int pairedSocks(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            setSocksCounter(array[i]);
        }
        //display();
        for(int row=0;row<=lastPos;row++){
            int pair = socksCounter[row][1]/2;
            System.out.println("Row = "+row+",sock is "+socksCounter[row][0]+",count is "+socksCounter[row][1]+",pair is "+pair);
            count +=pair;
        }
        return count;
    }
}
