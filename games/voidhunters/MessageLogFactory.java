/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageLogFactory implements GameStateFactory {
    static cbb[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 == 65536) {
          return (65536 & param2) != 0 ? true : false;
        }
        field_a = (cbb[]) null;
        return (65536 & param2) != 0 ? true : false;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) -6);
          return (SerializableGameState[]) ((Object) new MessageLog[param1]);
        }
        return (SerializableGameState[]) ((Object) new MessageLog[param1]);
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 != 27) {
          MessageLogFactory.clearSharedReferences((byte) 66);
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -99 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MessageLog());
    }

    static {
    }
}
