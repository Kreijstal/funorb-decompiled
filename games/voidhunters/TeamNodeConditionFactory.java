/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamNodeConditionFactory implements GameStateFactory {
    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.createArray(-57, 110);
          return (SerializableGameState[]) ((Object) new TeamNodeCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new TeamNodeCondition[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -80 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new TeamNodeCondition());
    }

    static {
    }
}
