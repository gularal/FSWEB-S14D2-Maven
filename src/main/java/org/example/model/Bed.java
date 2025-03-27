package org.example.model;

public class Bed {

    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public String getStyle() {
        return style;
    }

    private String style;

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public Bed(int pillows, int height, int sheets, int quilt, String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilt;
        this.style = style;
    }

    public void make()
    {
        System.out.println("The bed is being made.");
    }


}