/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipBlueprintFactory implements GameStateFactory {
    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new ShipBlueprint[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 57 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ShipBlueprint());
    }

    static {
    }
}
