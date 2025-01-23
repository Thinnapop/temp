
public class Publication {
    protected String publication;
    protected String publisher;
    protected int pageNum;
    protected double price;
    protected String title;

    
    public Publication(){
        publication = null;
        publisher = null;
        pageNum = 0;
        price = 0.0;
    }
    public Publication(String publication, int pageNum, double price, String title){
        this.publication = publication;
        this.pageNum = pageNum;
        this.price = price;
        this.title = title;
    }
    public String pubPrint(){
        return "The "+publication+" has publishs "+ title+" , "+pageNum+" , "+price+" Baht";
    }
}



