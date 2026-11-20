/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncrementVariableActionFactory implements GameStateFactory {
    static int field_b;
    static int field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(76, 47);
          return (SerializableGameState[]) ((Object) new IncrementVariableAction[param1]);
        }
        return (SerializableGameState[]) ((Object) new IncrementVariableAction[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -122 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new IncrementVariableAction());
    }

    static {
    }
}
