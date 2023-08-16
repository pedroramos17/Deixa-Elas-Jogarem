package br.com.etecia.deixaelasjogarem;

public class Player {
    private String title;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int imgid) {
        this.img = imgid;
    }

    public Player(String title, int img) {
        this.title = title;
        this.img = img;
    }
}
