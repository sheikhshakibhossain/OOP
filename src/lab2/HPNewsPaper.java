package lab2;

public class HPNewsPaper extends NewsPaper{
    int numOfVideos;

    public HPNewsPaper(String language, String url, int numOfPages, String headQuarterLocation, String fontFace, int numOfVideos) {
        super(language, url, numOfPages, headQuarterLocation, fontFace);
        this.numOfVideos = numOfVideos;
    }
}
