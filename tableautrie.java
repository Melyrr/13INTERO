public class tableautrie {
    public static void main(String[] args) {
    }
    public static int find(int[] registered,int nRegistered,int number){
        int pos = findPosition(registered, nRegistered, number);
        if(registered[pos] == number){
            return pos;}else{
                return -1;
            }
        }
    public static int findPosition(int[] registered, int nRegistered, int number){
        int pos = 0;
        while(pos< nRegistered && registered[pos] < number){
            pos++;
        }
        return pos;
    }
    public static int subscribe(int[] registered, int nRegistered,int number){
        int pos = findPosition(registered, nRegistered, number);
        shiftRight(registered,pos, nRegistered-1);
        registered[pos] = number;
        return nRegistered + 1;
    }
    public static void shiftRight(int[] tab, int begin, int end){
        for (int i = end; i >= begin; i = i - 1){
        tab[i + 1] = tab[i];
        }
    }
    public static void shiftLeft(int[] tab, int begin, int end){
        for (int i = begin; i <= end; i = i + 1){
        tab[i - 1] = tab[i];
        }
    }
    public static int unsubscribe(int[] registered, int nRegistered,int number){
        int pos = findPosition(registered, nRegistered, number);
        shiftLeft(registered,pos+1, nRegistered);
        return nRegistered - 1;
    }       
}

