package Set;

public class Goods {
    private String sn;
    private String title;

    public Goods(String sn,String title ){
        this.title = title;
        this.sn = sn;
    }

    @Override
    public int hashCode() {
        return this.sn.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Goods){
            Goods goods = (Goods) obj;
            if(this.sn.equals(((Goods) obj).getSn())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.hashCode() + "=Goods{" +
                "sn='" + sn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getSn() {
        return sn;
    }

    public String getTitle() {
        return title;
    }
}