/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpawnChoiceFactory implements GameStateFactory {
    static String field_a;
    static String field_b;
    static llb field_c;

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 >= -15) {
          SpawnChoiceFactory.clearSharedReferences(-124);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -119 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new SpawnChoice());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (String) null;
          return (SerializableGameState[]) ((Object) new SpawnChoice[param1]);
        }
        return (SerializableGameState[]) ((Object) new SpawnChoice[param1]);
    }

    static {
        field_a = "Missile lock";
        field_b = "Share your ship";
    }
}
