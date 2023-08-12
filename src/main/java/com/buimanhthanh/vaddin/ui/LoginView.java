package com.buimanhthanh.vaddin.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends Composite<LoginOverlay> {
    LoginView(){
        getContent().setOpened(true);
        getContent().setAction("login");
    }
}
