package vending.machine.strategy.concrete2classes;

import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.DisposeAdditive;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements logic to dispose of additives for VM2 (supports sugar and cream).
public class DisposeAdditive2 extends DisposeAdditive {

    public DisposeAdditive2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    @Override
    public void disposeAdditive(int[] A) {
        String additives = ""; // String to accumulate selected additives
        int additivesCount = 0; // Counter to check if any additive was selected

        // Check if sugar (index 0) is selected
        if (A[0] == 1) {
            additives += "SUGAR, ";
            additivesCount++;
        }

        // Check if cream (index 1) is selected
        if (A[1] == 1) {
            additives += "CREAM ";
            additivesCount++;
        }

        // If any additives were selected, print confirmation
        if (additivesCount > 0) {
            System.out.printf("with additives " + additives);
        }
    }
}
