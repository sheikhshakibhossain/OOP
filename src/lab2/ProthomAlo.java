package lab2;

public class ProthomAlo extends NewsPaper {
    boolean magazineAvailable;

    public ProthomAlo(String language, String url, int numOfPages, String headQuarterLocation, String fontFace, boolean magazineAvailable) {
        super(language, url, numOfPages, headQuarterLocation, fontFace);
        this.magazineAvailable = magazineAvailable;
    }
}
