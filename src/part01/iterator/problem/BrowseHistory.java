package part01.iterator.problem;

import java.util.List;
import java.util.Stack;

public class BrowseHistory {

    private Stack<String> urls = new Stack<String>();

    public void push(String url) {
        urls.push(url);
    }

    public String pop() {
        return urls.pop();
    }

    public List<String> getUrls() {
        return urls;
    }

}