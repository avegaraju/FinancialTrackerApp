package com.appifyit.com.fintrack;

/**
 * Created by ashishv on 1/2/2016.
 */
public class DataObject {

    private String _name;
    private String _finance_desc;

    DataObject(String name, String finance_desc){
        _name = name;
        _finance_desc = finance_desc;
    }

    public void setName(String name)
    {
        this._name = name;
    }
    public void setFinanceDesc(String fin_desc)
    {
        this._finance_desc = fin_desc;
    }
    public String getName()
    {
        return this._name;
    }
    public String getFinanceDescription() {
        return this._finance_desc;
    }
}
