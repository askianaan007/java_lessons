public  class cleanCoding {
    public static void main(String[] args){
        String message = greetUser("aski","anver");
        String message2 =  greetUser("anaan","anver");
    }

    public static String greetUser(String name, String lastName){
       return  "Hello" + name + " " + lastName ;
    }
}