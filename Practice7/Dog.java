class Dog {
    private String name;
    private int age;
    private String kind;

    public Dog(String kind) {
        this.kind = kind;
    } 
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showProfile() {
        System.out.println( kind + "で、名前は" + this.name + "といい、" + this.age + "歳です。" );
    }
}