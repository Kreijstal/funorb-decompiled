/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ebb {
    static GameStateFactory field_a;
    static boolean field_b;

    final static void a(byte param0) {
        ola.field_p = null;
        if (param0 != -74) {
          field_a = (GameStateFactory) null;
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 23357) {
          ebb.clearSharedReferences(27);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = (GameStateFactory) ((Object) new ShipBodyFactory());
        field_b = true;
    }
}
