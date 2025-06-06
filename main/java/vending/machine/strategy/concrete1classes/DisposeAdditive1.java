package vending.machine.strategy.concrete1classes;

import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.DisposeAdditive;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements additive disposal logic specific to VM1 (e.g., sugar only).
public class DisposeAdditive1 extends DisposeAdditive {

    public DisposeAdditive1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    @Override
    public void disposeAdditive(int[] A) {
        String additives = ""; // Holds names of selected additives
        int additivesCount = 0; // Tracks number of additives selected

        // Check if sugar (index 0) is selected
        if (A[0] == 1) {
            additives += "SUGAR";
            additivesCount++;
        }

        // Output result if any additive was selected
        if (additivesCount > 0) {
            System.out.printf(" Adding additives  " + additives + " to the drink, ");
        }
    }
}
