package com.company;

public class AuthorizedWebPage extends WebPageDecorator{
    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }
    public  void authorizedUser() {
        System.out.println("Authorizing user");
    }
    public void display() {
        super.display();
        authorizedUser();

    }
}
