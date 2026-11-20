/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VariableConditionFactory implements GameStateFactory {
    static boolean field_c;
    static int field_a;
    static String field_b;

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != 50) {
          VariableConditionFactory.takeConfirmedShipComponentWords(-69);
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          VariableConditionFactory.clearSharedReferences(105);
          return (SerializableGameState[]) ((Object) new VariableCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new VariableCondition[param1]);
    }

    final static int[] takeConfirmedShipComponentWords(int param0) {
        int[] var2 = null;
        int[] var1 = null;
        int[] var2Lifetime1;
        int[] var1Lifetime1;
        if (!SetFixedaim.shipImportResolved) {
          return null;
        }
        if (param0 >= 97) {
          var2 = GetBombletSprayPushMultiplier.importedShipComponentWords;
          var1 = var2;
          GetBombletSprayPushMultiplier.importedShipComponentWords = null;
          return var2;
        }
        VariableConditionFactory.takeConfirmedShipComponentWords(-101);
        var2Lifetime1 = GetBombletSprayPushMultiplier.importedShipComponentWords;
        var1Lifetime1 = var2Lifetime1;
        GetBombletSprayPushMultiplier.importedShipComponentWords = null;
        return var2Lifetime1;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -45 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new VariableCondition());
    }

    static {
        field_c = false;
        field_a = 50;
        field_b = "Show chat";
    }
}
