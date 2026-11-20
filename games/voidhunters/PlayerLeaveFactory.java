/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerLeaveFactory implements GameStateFactory {
    static int field_a;
    static int[] field_b;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new PlayerLeave[param1]);
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != 0) {
          PlayerLeaveFactory.clearSharedReferences(-84);
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 108 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new PlayerLeave());
    }

    static {
        field_a = 0;
        field_b = new int[8192];
    }
}
