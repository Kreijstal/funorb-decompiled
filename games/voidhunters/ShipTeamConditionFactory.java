/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipTeamConditionFactory implements GameStateFactory {
    static lta field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = 45 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new ShipTeamCondition());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 27);
          return (SerializableGameState[]) ((Object) new ShipTeamCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new ShipTeamCondition[param1]);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -18593) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
