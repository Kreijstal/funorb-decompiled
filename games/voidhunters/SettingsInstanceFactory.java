/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SettingsInstanceFactory implements GameStateFactory {
    static String field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (String) null;
          return (SerializableGameState[]) ((Object) new SettingsInstance[param1]);
        }
        return (SerializableGameState[]) ((Object) new SettingsInstance[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 118 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new SettingsInstance());
    }

    public static void clearSharedReferences(int param0) {
        if (param0 < 100) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Yes";
    }
}
