package org.mypackage.hello;

/**
 *
 * @author nbuser
 */

public class NameHandler {

    private String name;

    /** Creates a new instance of NameHandler */
    public NameHandler() {
       name = null;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = "Mr. "+name;
    }

}