package com.example.hugo.ac11;

import static android.R.attr.id;

/**
 * Created by Hugo on 18/10/2017.
 */

public class pro {
    private int _id;
    private String _name;
    private double _price;

    public pro(String name, double price){

    }
    public pro(){
        this._id = id;
        this._name = _name;
        this._price = _price;
    }
    public int get_id(){
        return _id;
    }
    public void set_id(int _id){
        this._id = _id;
    }
    public String get_name(){
        return _name;
    }
    public void set_name(String _name){
        this._name = _name;
    }
    public double get_price(){
        return _price;
    }
    public void set_price(double _price){
        this._price = _price;
    }

}
