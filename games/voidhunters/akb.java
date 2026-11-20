/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class akb implements dja {
    static asb field_a;

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          akb.clearSharedReferences((byte) -90);
          return (SerializableGameState[]) ((Object) new MissionEvent[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionEvent[param1]);
    }

    public final SerializableGameState a(byte param0) {
        int var2 = -41 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new MissionEvent());
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -21 % ((param0 + 35) / 34);
        field_a = null;
    }

    static {
    }
}
