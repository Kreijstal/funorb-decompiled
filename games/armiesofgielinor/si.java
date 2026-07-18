/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si {
    int field_h;
    int field_g;
    int field_i;
    int field_f;
    int field_e;
    int field_d;
    static String field_a;
    static long field_c;
    static java.awt.Canvas field_b;

    final static void b(int param0) {
        ro.field_lb = null;
    }

    final static boolean a(String param0, int param1) {
        return null != db.a(param0, -87);
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This is not your unit";
    }
}
