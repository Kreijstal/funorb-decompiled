/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jca {
    static String field_b;
    static BitmapFont field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -8270) {
          jca.releaseStatics(-125);
        }
    }

    final static void a(int param0, int param1) {
        fe.field_h = 1000000000L / (long)param0;
        if (param1 != -14350) {
          field_a = (BitmapFont) null;
        }
    }

    static {
        field_b = "Concluded";
    }
}
