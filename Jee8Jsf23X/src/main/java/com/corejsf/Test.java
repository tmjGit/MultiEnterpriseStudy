package com.corejsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by xinyuan.zhang on 9/4/17.
 */


@Named(value ="test")
@SessionScoped
public class Test implements Serializable{

    public Test() {
    }

    public Test(String output) {
        this.output = output;
    }

    private String output;

    public String getOutput() {
        output = "abc";
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}