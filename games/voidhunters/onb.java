/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class onb implements dja {
    static int field_a;

    public final SerializableGameState a(byte param0) {
        int var2 = 6 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new PartitionZone());
    }

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_a = 108;
          return (SerializableGameState[]) ((Object) new PartitionZone[param1]);
        }
        return (SerializableGameState[]) ((Object) new PartitionZone[param1]);
    }

    static {
    }
}
