/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DebrisFactory implements GameStateFactory {
    static String field_b;
    static llb field_a;
    static BitmapFont field_c;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 102) {
          field_b = (String) null;
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -12 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new Debris());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          DebrisFactory.clearSharedReferences((byte) 12);
          return (SerializableGameState[]) ((Object) new Debris[param1]);
        }
        return (SerializableGameState[]) ((Object) new Debris[param1]);
    }

    static {
        field_b = "Releases powerful homing ordnance";
    }
}
