package lab2;

public class Chrome extends WebBrowser {
    boolean isGameOn;
    public Chrome(String icon, int numOfRunningTabs, boolean isShown, boolean isGameOn) {
        super(icon, numOfRunningTabs, isShown);
        this.isGameOn = isGameOn;
    }
}
