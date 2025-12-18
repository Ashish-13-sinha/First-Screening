public class Main{
  public List<Integer>generatedValue(int a){
    List<Integer>ans=new ArrayList<>();
    for(int i=0;i<a;i++){
      ans.add(i+(i+1));
    }
    return ans;
  }
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    List<Integer>ans=generatedValue(a);
    for(int i=0;i<ans.size();i++){
      System.out.print(ans.get(i)+",");
    }
    
  }
}
