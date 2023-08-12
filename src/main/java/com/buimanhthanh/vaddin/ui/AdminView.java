package com.buimanhthanh.vaddin.ui;

import com.buimanhthanh.vaddin.backend.Book;
import com.buimanhthanh.vaddin.backend.BookService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("admin")
@RolesAllowed("ADMIN")
public class AdminView extends VerticalLayout {

    AdminView(BookService service){
        var crud = new GridCrud<>(Book.class,service);
        crud.getGrid().setColumns("title","published","rating");
        crud.getCrudFormFactory().setVisibleProperties("title","published","rating");
        crud.setAddOperationVisible(false);
        add(
                new H1("HelloAdmin"),
                crud
        );
    }
}
