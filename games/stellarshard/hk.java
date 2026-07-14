/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends gg {
    boolean field_s;
    long[][] field_w;
    String[][] field_u;
    static String field_m;
    static int field_k;
    static String field_v;
    static pb[] field_l;
    static int field_n;
    int field_q;
    int[][] field_o;
    int field_r;
    static int field_p;
    int field_t;

    final static boolean a(int param0, String param1) {
        if (param0 <= 86) {
            return true;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return wb.field_b.equals((Object) (Object) nh.a(var3, false));
    }

    public static void a(boolean param0) {
        field_m = null;
        field_v = null;
        if (param0) {
            field_m = null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    hk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_k = -1;
        field_v = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_n = 0;
        field_p = 810586144;
    }
}
