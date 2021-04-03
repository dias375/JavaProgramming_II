/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Container {

    private int amount;
    private int capacity;

    public Container() {
        this.amount = 0;
        this.capacity = 100;
    }

    public Container(int amount) {
        this.amount = amount;
        this.capacity = 100;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount += amount;
        if (this.amount > this.capacity) {
            this.amount = this.capacity;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    public int contains() {
        return this.amount;
    }

    public String toString() {
        return (this.amount + "/" + this.capacity);
    }

}
