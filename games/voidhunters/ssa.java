/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ssa {
    static BitmapFont field_a;
    static String field_b;

    final static boolean b(int param0) {
        if (param0 == 2) {
          return 2 <= SetAngularVelocitySustain.field_p ? true : false;
        }
        ssa.b(104);
        return 2 <= SetAngularVelocitySustain.field_p ? true : false;
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 2) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Launch fighters";
    }
}
