/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AdjustVariableActionFactory implements GameStateFactory {
    static Widget field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (Widget) null;
          return (SerializableGameState[]) ((Object) new AdjustVariableAction[param1]);
        }
        return (SerializableGameState[]) ((Object) new AdjustVariableAction[param1]);
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 != 27) {
          field_a = (Widget) null;
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 5 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new AdjustVariableAction());
    }

    static {
    }
}
