package ch.bbw.seleniumprojekt;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BerechnungsViewController {

    private String value1;
    private String value2;
    private String result;

    public BerechnungsViewController() {
    }

    public void berechne() {
        double tempResult = Double.parseDouble(value1) + Double.parseDouble(value2);
        result = "" + tempResult;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
