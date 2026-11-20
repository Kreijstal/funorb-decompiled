/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SettingsChangeFactory implements GameStateFactory {
    static ContentTransitionPhase field_e;
    static String field_d;
    static Widget field_b;
    static apb[] field_a;
    static int field_c;

    public static void clearSharedReferences(byte param0) {
        if (param0 > 66) {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
        SettingsChangeFactory.clearSharedReferences((byte) -38);
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -113 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new SettingsChange());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          SettingsChangeFactory.clearSharedReferences((byte) 40);
          return (SerializableGameState[]) ((Object) new SettingsChange[param1]);
        }
        return (SerializableGameState[]) ((Object) new SettingsChange[param1]);
    }

    static {
        field_d = "Set up new game";
        field_e = new ContentTransitionPhase();
        field_c = 262144;
    }
}
