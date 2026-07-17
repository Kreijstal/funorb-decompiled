/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int[] field_a;
    static int field_c;
    static int field_d;
    static qk field_b;

    final static void b(int param0) {
        int var1 = ef.a((byte) 30);
        int var2 = jg.c(24178);
        mk.field_d.a(-q.field_d + ei.field_M, 0, (q.field_d << 1) + var1, var2 - -(bb.field_C << 1), -bb.field_C + rb.field_H);
        gh.e(-46);
    }

    public static void a(int param0) {
        if (param0 != 26189) {
            field_d = -125;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
