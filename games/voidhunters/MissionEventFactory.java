/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionEventFactory implements GameStateFactory {
    static ResourceArchive field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          MissionEventFactory.clearSharedReferences((byte) -90);
          return (SerializableGameState[]) ((Object) new MissionEvent[param1]);
        }
        return (SerializableGameState[]) ((Object) new MissionEvent[param1]);
    }

    public final SerializableGameState create(byte param0) {
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
