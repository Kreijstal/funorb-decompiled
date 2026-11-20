/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TargetLockFactory implements GameStateFactory {
    static llb field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(-6, 97);
          return (SerializableGameState[]) ((Object) new TargetLock[param1]);
        }
        return (SerializableGameState[]) ((Object) new TargetLock[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 38 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new TargetLock());
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 >= -48) {
          field_a = (llb) null;
        }
    }

    static {
    }
}
