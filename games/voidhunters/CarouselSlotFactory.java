/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselSlotFactory implements GameStateFactory {
    static String field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 < 16) {
          return;
        }
        field_a = null;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -35 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new CarouselSlot());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new CarouselSlot[param1]);
    }

    static {
        field_a = "Waiting for music";
    }
}
