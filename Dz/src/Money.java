public class Money {
    private long rub;
    private char cop;

    public Money(long rub, char cop) {
        this.rub = rub;
        this.cop = cop;
    }
    public Money(){
        this.rub=0;
        this.cop=0;
    }
    public Money(long rub){
        this.rub=rub;
        this.cop=0;
    }
    public Money(char cop){
        this.cop=cop;
        this.rub=0;
    }

    public long getRub() {
        return rub;
    }

    public char getCop() {
        return cop;
    }
    public void print(){
        if (rub<0) rub=rub*(-1);
        System.out.println(rub+","+(int)cop);
    }
    public void print1(){
        System.out.println(rub+"/"+(int)cop);
    }
    public Money Add(Money d){
        long Rub= this.rub+d.rub;
        int Cop=this.cop+d.cop;
        if (Cop>=100){
            long Rub2=  (Rub+Cop/100);
            int Cop2=Cop%100;
            return new Money(Rub2, (char) Cop2);
        }
        return new Money(Rub, (char) Cop);

    }
    public Money Sub(Money d){
        long Rub= this.rub-d.rub;
        int Cop=this.cop-d.cop;
        if (Cop<0){
            long Rub2=Rub-1;
            int Cop2=Cop+100;
            return new Money(Rub2, (char) Cop2);
        }
        else return new Money(Rub, (char) Cop);

    }
    public Money Del(Money d){
        double Rub1=(this.rub*100)+this.cop;
        double Rub2=(d.rub*100)+d.cop;
        double Rub3= (Rub1/Rub2);
        double Cop= Rub3*100%100;
        return new Money((long) Rub3, (char) Cop);
    }
    public Money DelDrob(Money a,Money d){
        double Rub1=(a.rub*100)+a.cop;
        double Rub2=Rub1*d.cop/d.rub;
        double Rub= Rub2/1000;
        double Cop=Rub2%1000;
        if (Cop>100){
            long Rub3= (long) (Rub+Cop/100);
            int Cop2= (int) (Cop%100);
            return new Money(Rub3, (char) Cop2);
        }
        return new Money((long) Rub, (char) Cop);
    }
    public Money Rov(Money d){
        if ((this.rub==d.rub)&&this.cop>d.cop){
            System.out.println(this.rub+","+(int)this.cop+">"+d.rub+","+(int)d.cop);
        }
        if ((this.rub==d.rub)&&this.cop<d.cop){
            System.out.println(this.rub+","+(int)this.cop+"<"+d.rub+","+(int)d.cop);
        }
        if (this.rub==d.rub&&this.cop==d.cop) System.out.println(this.rub+","+(int)this.cop+"="+d.rub+","+(int)d.cop);
        if(this.rub>d.rub) System.out.println(this.rub+","+(int)this.cop+">"+d.rub+","+(int)d.cop);
        if (this.rub<d.rub)System.out.println(this.rub+","+(int)this.cop+"<"+d.rub+","+(int)d.cop);
        return d;
    }
}

