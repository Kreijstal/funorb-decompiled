/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselEventFactory implements GameStateFactory {
    static String field_a;
    static int[] field_b;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 41) {
          CarouselEventFactory.clearSharedReferences((byte) 78);
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -107 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new CarouselEvent());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (String) null;
          return (SerializableGameState[]) ((Object) new CarouselEvent[param1]);
        }
        return (SerializableGameState[]) ((Object) new CarouselEvent[param1]);
    }

    static {
        field_a = "This game option has not yet been unlocked for use.";
        field_b = new int[1];
    }
}
