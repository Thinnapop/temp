
public class KidsMagazine extends Publication{
    protected String recommendAgeRange;

    public KidsMagazine(){
        super();
        recommendAgeRange = null;
    }
    public KidsMagazine(String recommendAgeRange,String publication,int pageNum, double price,String title){
        super(publication, pageNum, price,title);
        this.recommendAgeRange = recommendAgeRange;
    }
    @Override
    public String pubPrint(){
        return "The "+publication+" has publishs "+ title+" , "+pageNum+" , "+price+" Baht"+" \nthis kid magazine should read at age"+recommendAgeRange;
    }

}

