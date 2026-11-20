/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContentTransitionState {
    static VehicleDefinition[] field_c;
    static String field_d;
    static String field_a;
    static int field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return 250 < StrongCacheEntry.field_q ? true : false;
        }
        ContentTransitionState.clearSharedReferences(79);
        return 250 < StrongCacheEntry.field_q ? true : false;
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 != -31819) {
          field_a = (String) null;
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    static {
        field_c = null;
        field_a = "Loading graphics";
        field_d = "Return to game";
    }
}
