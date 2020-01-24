public class ActivitySelection{
    public static void printMaxActivities(int s[],int f[],int n){
        int i,j;
        System.out.println("Following activities are selected : n");
        i = 0;
        System.out.println(i+" ");
        for (j=1; j<n ; j++){
            if (s[j] >= f[i]){
                System.out.println(j+" ");
                i=j;
            }
        }
    }

    public static void main(String[] args) {
        int s[] = {1,3,2,4,0,6,7};
        int f[] = {2,4,6,5,1,1,0};
        int n = s.length;

        printMaxActivities(s,f,n);
    }
}
