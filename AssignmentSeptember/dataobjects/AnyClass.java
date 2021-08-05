package dataobjects;

public abstract class AnyClass{
    int seqNo;

    public AnyClass(){}

    public int getSeqNo(){
        return seqNo;
    }

    public void setSeqNo(int seqNo){
        this.seqNo = seqNo;
    }

    public String getData(){
        return String.valueOf(seqNo);
    }

    public String getKey(){
        return String.valueOf(seqNo);
    }

    public void edit(){
        
    }
}