/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimedSpecialOrderBehaviourFactory implements GameStateFactory {
    public final SerializableGameState create(byte param0) {
        int var2 = 121 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new TimedSpecialOrderBehaviour());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new TimedSpecialOrderBehaviour[param1]);
    }

    static {
    }
}
