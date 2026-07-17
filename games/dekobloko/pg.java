/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static ck field_f;
    static boolean[] field_a;
    static ud field_d;
    static ck field_e;
    static String field_g;
    static String field_c;
    static double field_b;

    final static Boolean a() {
        Boolean var1 = wb.field_Ub;
        wb.field_Ub = null;
        return var1;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_d = null;
        if (param0 != 126) {
            pg.a((byte) 95);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[8];
        field_c = "Accept draw";
        field_g = "TAB - hide chat temporarily";
        field_b = 0.0;
    }
}
