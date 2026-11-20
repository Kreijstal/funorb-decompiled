/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PartitionZoneFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = 6 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new PartitionZone());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = 108;
          return (SerializableGameState[]) ((Object) new PartitionZone[param1]);
        }
        return (SerializableGameState[]) ((Object) new PartitionZone[param1]);
    }

    static {
    }
}
