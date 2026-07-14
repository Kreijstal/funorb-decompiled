/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int[] field_c;
    static int[] field_e;
    static String field_d;
    static String field_g;
    static String field_i;
    static hp field_f;
    static int field_h;
    static boolean field_b;
    static vi field_a;

    public static void b(int param0) {
        field_f = null;
        field_i = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 != 10) {
            ri.a(-3, (byte) 120);
        }
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            ri.a((String) null, false);
        }
    }

    final static boolean a(int param0) {
        if (param0 >= -71) {
            return false;
        }
        return true;
    }

    final static void a(int param0, byte param1) {
        de.field_e = new aa[param0 * 15];
        ee.field_d = param0;
        tm.field_O = new int[3];
        int var2 = 20 / ((param1 - -94) / 32);
        sd.field_L = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = "members-only content";
        field_e = new int[]{1, 2, 5, 10, 2, 5, 10, 3, 2, 2, 5, 2, 3, 10, 2, 5, 5, 5, 2, 2, 2, 2};
        field_c = new int[field_e.length];
        for (var0 = 0; field_c.length > var0; var0++) {
            field_c[var0] = field_e[var0] * 100;
        }
        field_g = "RuneScape clan";
        field_i = "Members' Benefits";
        field_b = false;
        field_h = 64;
    }
}
