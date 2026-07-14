/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static String field_b;
    static int field_c;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_c = 88;
        }
    }

    final static java.awt.Canvas b(int param0) {
        int var1 = 30 / ((param0 - 33) / 43);
        return (java.awt.Canvas) (null == gk.field_o ? qn.field_f : gk.field_o);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Mouse over an icon for details";
        field_a = 0;
    }
}
