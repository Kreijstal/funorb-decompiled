/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static boolean field_a;
    static String[] field_d;
    static ci field_c;
    static String field_e;
    static int field_b;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != 3) {
            Object var2 = null;
            vk.a(-114, (tg[]) null, -39, 70, 118, -53, -38, 23, -5, (tj) null, (tj) null, (tg[]) null, 94, -108);
        }
    }

    final static void a(int param0, tg[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, tj param9, tj param10, tg[] param11, int param12, int param13) {
        if (param7 != 3) {
            field_a = true;
        } else {
            va.a(2);
            return;
        }
        va.a(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = 3;
        field_e = "Loading music";
    }
}
