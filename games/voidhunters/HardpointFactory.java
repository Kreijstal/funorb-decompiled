/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardpointFactory implements GameStateFactory {
    static int[] field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 43);
          return (SerializableGameState[]) ((Object) new Hardpoint[param1]);
        }
        return (SerializableGameState[]) ((Object) new Hardpoint[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -113 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new Hardpoint());
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 8192) {
          HardpointFactory.clearSharedReferences(-29);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = new int[8192];
    }
}
