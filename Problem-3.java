public class Main{
  public List<Integer>generatedValue2(int a){
    int n=a;

        if (a % 2 == 0) {
            n = a - 1;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(i + (i + 1));
        }
        return ans;
  }
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    List<Integer>ans=generatedValue2(a);
    for(int i=0;i<ans.size();i++){
      System.out.print(ans.get(i)+",");
    }
    
  }
}
