class AppForm{
    private String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

     void setValues(String str, int num){
        name = str;
    }
}

    class Main{
        public static void main(String[] args) {
            AppForm codeio = new AppForm();
//            codeio.name = "aski";
            codeio.setValues("anaan",21);
            codeio.rollno = 123;
            codeio.display();

            AppForm views = new AppForm();
//            views.name = "aski";
            views.rollno = 123;
            codeio.display();
        }

    }

