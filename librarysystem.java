class libraryitem{
    protected String title;
    protected String author;

    libraryitem(String t1, String a1){
        this.title = t1;
        this.author = a1;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void checkout(){
        System.out.println("Item Serched");
    }
    public void returnitem(){
        System.out.println("Item returned");
    }
}
class book extends libraryitem{
    private double price;

    book(String t1, String a1, double p){
        super(t1,a1);
        this.price = p;
    }
    public double getPrice(){
        return price;
    }

    public void caldiscount(){
        System.out.println("Discount recieved: " + getPrice() * 10/100);
    }
}
class dvd extends libraryitem{
    private double duration;

    dvd(String t1 , String a1 , double d){
        super(t1,a1);
        this.duration = d;
    }
    public double getDuration(){
        return duration;
    }

}
class libdrive{
    public static void main(String args[]){
        book bk = new book("harry poter", "Ann" , 500.00);
        dvd dv  =new dvd("hary poter" , "Ann" , 2.18);

        System.out.println("Book title: " + bk.getTitle());
        System.out.println("Author Name: " + bk.getAuthor());
        System.out.println("Price: " + bk.getPrice());
        bk.caldiscount();
        System.out.println("Duration: " + dv.getDuration());
    }
}

