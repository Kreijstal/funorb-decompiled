/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AdminMessageFactory implements GameStateFactory {
    static dpb field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = -86 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new AdminMessage());
    }

    public static void clearSharedReferences(int param0) {
        if (param0 > -73) {
          field_a = (dpb) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new AdminMessage[param1]);
    }

    static {
        field_a = new dpb();
        ShieldBehaviourFactory discarded$0 = new ShieldBehaviourFactory();
    }
}
