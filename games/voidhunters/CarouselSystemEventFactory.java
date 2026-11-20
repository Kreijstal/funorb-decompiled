/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselSystemEventFactory implements GameStateFactory {
    static String field_a;
    static String field_b;

    public final SerializableGameState create(byte param0) {
        int var2 = -54 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new CarouselSystemEvent());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_b = (String) null;
          return (SerializableGameState[]) ((Object) new CarouselSystemEvent[param1]);
        }
        return (SerializableGameState[]) ((Object) new CarouselSystemEvent[param1]);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 > -98) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "No spectators";
        field_a = "Age:";
    }
}
