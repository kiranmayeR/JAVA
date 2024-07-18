class ReverseString{
    public static void main(String args[]){
        String input = "TEMPLE";
        String rev = revstring(input);
        System.out.println("REVERSE:"+rev);
    }
    public static String revstring(String a){
        String h = "";
        for(int i = a.length()-1; i>=0;i--){
            h+=a.charAt(i);
        }
        return h;
    }
}