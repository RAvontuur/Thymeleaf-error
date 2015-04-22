package org.thymeleaf.sample.model;

import java.util.ArrayList;
import java.util.Collection;

public class Page{
    Collection<PageElement> elementCollection = new ArrayList<PageElement>();

    public Collection<PageElement> getElementCollection() {
        return elementCollection;
    }

    public void setElementCollection(Collection<PageElement> elementCollection) {
        this.elementCollection = elementCollection;
    }
}
