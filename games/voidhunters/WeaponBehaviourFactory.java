/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeaponBehaviourFactory implements GameStateFactory {
    static String field_a;
    static int field_b;

    public final SerializableGameState create(byte param0) {
        int var2 = 124 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new WeaponBehaviour());
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != -30938) {
          field_b = 84;
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new WeaponBehaviour[param1]);
    }

    static {
        field_a = "Hull hexagon";
    }
}
