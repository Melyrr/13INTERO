public class tableauNonTrie {
    public static void main(String[] args) {
        
    }
    public static int register(int[] registered, int nRegistered,int number){
    registered[nRegistered] = number;
    return nRegistered + 1;
    }
    public static int check(int[] registered,int nRegistered,int number){
    int i = 0;
    while (i < nRegistered && registered[i] != number){
        i++;
        }
    if (i<nRegistered){
        return i;
    }else {
        return -1;
        }
    }
    public static int unsubscribe(int[] registered,int nRegistered, int number){
    int pos = check(registered, nRegistered, number);
    registered[pos] = registered[nRegistered - 1];
    return nRegistered - 1;
    }
}
