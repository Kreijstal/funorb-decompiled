/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    int field_f;
    static kc field_a;
    static ba field_m;
    byte[] field_e;
    int field_g;
    int field_k;
    int field_c;
    int field_h;
    byte[] field_l;
    int field_j;
    static int field_d;
    int field_b;
    static String field_i;

    final static boolean b() {
        int var1 = 0;
        if (ne.field_b == null) {
            return false;
        }
        if (!ne.field_b.b(95)) {
            return false;
        }
        return true;
    }

    public static void a() {
        field_a = null;
        field_m = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ba(0, 2, 2, 1);
        field_i = "Fullscreen";
    }
}
