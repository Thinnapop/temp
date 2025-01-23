
public class Book extends Publication{
    protected String author;

    public Book(){
            super();
            author = null;
        }
        public Book(String publication,String title,int pageNum, double price,String author){
            super(publication, pageNum, price,title);
            this.author = author;
            this. publication = null;
            this.publisher = null;
            this.pageNum = 0;
            this.price = 0.0;
        }
        @Override
        public String pubPrint(){
            return "The "+publication+" has publishs "+ title+" , "+pageNum+" , "+price+" Baht"+"\nthis book has written by "+author;
        }
    
    }
    
