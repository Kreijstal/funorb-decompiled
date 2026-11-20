/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipComponentFactory implements GameStateFactory {
    static boolean field_a;

    final static String a(int param0) {
        if (param0 != -8225) {
          ShipComponentFactory.a(59);
          return "Lo!";
        }
        return "Lo!";
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 29 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ShipComponent());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new ShipComponent[param1]);
    }

    static {
        field_a = false;
    }
}
