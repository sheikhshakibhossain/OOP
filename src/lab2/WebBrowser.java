package lab2;

public class WebBrowser {
    String icon; // will contain the path
    int numOfRunningTabs;
    boolean isShown; // if false then minimized

    public WebBrowser(String icon, int numOfRunningTabs, boolean isShown) {
        this.icon = icon;
        this.numOfRunningTabs = numOfRunningTabs;
        this.isShown = isShown;
    }
}
