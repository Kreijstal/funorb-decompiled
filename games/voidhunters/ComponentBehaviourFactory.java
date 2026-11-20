/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ComponentBehaviourFactory implements GameStateFactory {
    static int field_c;
    static int field_a;
    static String field_d;
    static String field_b;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_c = -32;
          return (SerializableGameState[]) ((Object) new ComponentBehaviour[param1]);
        }
        return (SerializableGameState[]) ((Object) new ComponentBehaviour[param1]);
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        field_d = null;
        if (param0 < 49) {
          ComponentBehaviourFactory.clearSharedReferences(-57);
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 73 % ((-64 - param0) / 50);
        return null;
    }

    static {
        field_c = 20;
        field_d = "Please enter a year between <%0> and <%1>";
        field_b = "Toggle shields";
        field_a = 640;
    }
}
