/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrappleLauncherBehaviourFactory implements GameStateFactory {
    static Widget field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = 39 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new GrappleLauncherBehaviour());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(114, 88);
          return (SerializableGameState[]) ((Object) new GrappleLauncherBehaviour[param1]);
        }
        return (SerializableGameState[]) ((Object) new GrappleLauncherBehaviour[param1]);
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = 76 / ((param0 + 65) / 53);
        field_a = null;
    }

    static {
    }
}
