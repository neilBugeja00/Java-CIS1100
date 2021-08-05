package Dataobjects;

import java.util.Scanner;

public class AnyClass {

    public int seqNo;

    public AnyClass(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getKey() {
        return String.valueOf(seqNo);
    }

    public int getSeqNo() {

        return seqNo;
    }

    public void setSeqNo(int seq) {

        this.seqNo = seq;
    }

    public String getData() {

        return "Sequence number: " + seqNo;
    }

    public void edit() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a new Sequence number: ");
        int newNum = s.nextInt();

        setSeqNo(newNum);
    }

    public int edit(int num) {

        Scanner s = new Scanner(System.in);

        System.out.println("Current Sequence Number is:" + num);

        System.out.println("Enter a new Sequence Number:");
        int newNum = s.nextInt();

        setSeqNo(newNum);

        return newNum;
    }

    private static int randInt(int min, int max) {

        return min + (int) (Math.random() * (double) (max = min + 1));
    }

    private static String randName(int length) {
        String genName = "";

        genName += (char) randInt(65, 65 + 25);
        for (int charNo = 2; charNo <= length; charNo++) {

            genName += (char) randInt(65 + 32, 65 + 25 + 32);

        }

        return genName;
    }

}
