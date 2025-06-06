package vending.machine.op;

import vending.machine.abstract_factory.AbstractFactory;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.*;

public class OP {

    DataStore dataStore;
    StorePrice storePrice;
    ZeroCF zeroCF;
    IncreaseCF increaseCF;
    ReturnCoins returnCoins;
    DisposeDrink disposeDrink;
    DisposeAdditive disposeAdditive;

    public OP(AbstractFactory abstractFactory) {
        this.dataStore = abstractFactory.getDataStore();
        this.disposeAdditive = abstractFactory.getDisposeAdditive();
        this.zeroCF = abstractFactory.getZeroCF();
        this.disposeDrink = abstractFactory.getDisposeDrink();
        this.returnCoins = abstractFactory.getReturnCoins();
        this.storePrice = abstractFactory.getStorePrice();
        this.increaseCF = abstractFactory.getIncreaseCF();
    }

    public void storePrice() {
        this.storePrice.storePrice();
    }

    public void zeroCF() {
        this.zeroCF.zeroCF();
    }
    public void increaseCF() {
        this.increaseCF.increaseCF();
    }

    public void returnCoinsAll() {
        this.returnCoins.returnCoinsAll();
    }

    public void returnCoinsChange() {
        this.returnCoins.returnCoinsChange();
    }

    public void disposeDrink(int d) {this.disposeDrink.disposeDrink(d);}

    public void disposeAdditive(int[] A) {
        this.disposeAdditive.disposeAdditive(A);
    }
}
