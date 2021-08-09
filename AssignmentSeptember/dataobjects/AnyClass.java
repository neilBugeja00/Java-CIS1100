package dataobjects;

public class AnyClass{

    public int seqNo;

    public AnyClass(int seqNo){
        this.seqNo = seqNo;
    }

    public int getSeqNo(){
        return seqNo;
    }

    public void setSeqNo(int seqNo){
        this.seqNo = seqNo;
    }

    public String getData(){
        return "Sequence number: "+seqNo;
    }

    public String getKey(){
        return String.valueOf(seqNo);
    }

    public void edit(){
    }

}