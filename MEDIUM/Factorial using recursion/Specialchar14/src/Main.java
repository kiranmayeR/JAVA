import java.util.Scanner;
class Specialchar{
    public static void main(String ar[]){
        String a = "kir@nm@ye_$ is @ b!?(H";
        int count = spclcharcount(a);
        System.out.println("number of special char in statement:"+count);
    }
    public static int spclcharcount(String a){
        String sp = "~!@#$%^&*()_+-=`</>?:{}|[]/,'.;l'";
        int c =0;
        for(int i =0;i<a.length();i++){
            if(sp.indexOf(a.charAt(i))!=-1){
                c++;
            }
        }
        return c;
    }
}