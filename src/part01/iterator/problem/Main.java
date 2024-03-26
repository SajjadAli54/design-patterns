package part01.iterator.problem;

public class Main {
    public static void main() {
        var browserHistory = new BrowseHistory();

        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");

        var urls = browserHistory.getUrls();

        for (int i = 0; i < urls.size(); i++) {
            System.out.println(urls.get(i));
        }

    }
}
