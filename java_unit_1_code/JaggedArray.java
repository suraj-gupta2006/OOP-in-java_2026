public class JaggedArray {
    public static void main(String[] args){
int [][] jaggedArray = {{2,6,9},{2,10},{1,8,9,3}};
int sum=0;
for(int i=0;i<jaggedArray.length;i++){
    System.out.println("Elements of row");
    for(int j=0;j< jaggedArray[i].length;j++){
        System.out.println(jaggedArray[i][j]);
    sum = sum + jaggedArray[i][j];
}
}
System.out.println("sum ="+sum);
sum=0;
    }
    
}
