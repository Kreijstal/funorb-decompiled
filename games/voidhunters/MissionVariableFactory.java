/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionVariableFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 104);
          return (SerializableGameState[]) ((Object) new MissionVariable[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionVariable[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -59 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new MissionVariable());
    }

    static {
    }
}
