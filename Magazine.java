
public class Magazine extends Publication{
    protected String publicationUnit;

    public Magazine(){
        super();
        publicationUnit = null;
    }
    public Magazine(String publication,int pageNum, double price,String publicationUnit,String title){
        super(publication, pageNum, price,title);
        this.publicationUnit = publicationUnit;
    }
    @Override
    public String pubPrint(){
        return "The "+publication+" has publishs "+ publisher+" , "+pageNum+" , "+price+" Baht "+"\nthis magazine is "+publicationUnit+"print";
    }

}
