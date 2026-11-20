/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PartitioningManagerFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = -2 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new PartitioningManager());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new PartitioningManager[param1]);
    }

    static {
    }
}
