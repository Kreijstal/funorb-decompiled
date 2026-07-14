/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hl {
    int field_m;
    static boolean field_k;
    boolean field_j;
    static ib field_s;
    static hj field_t;
    int field_n;
    static va field_q;
    static vn field_p;
    int field_i;
    int field_l;
    static String field_o;
    static int[] field_r;

    final static void a(int param0, ih param1, byte param2) {
        io.field_c.a((byte) -105, (hl) (Object) param1);
        mk.a(1, param0, param1);
        if (param2 != -79) {
            na.a(54);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_t = null;
        field_o = null;
        field_q = null;
        field_s = null;
        field_p = null;
        if (param0 >= -70) {
            field_q = null;
        }
    }

    na(int param0, int param1, int param2, int param3, hj param4) {
        ((na) this).field_l = param0;
        ((na) this).field_j = false;
        ((na) this).field_i = param3;
        ((na) this).field_n = param1;
        ((na) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_o = "Creating your account";
        field_r = new int[128];
    }
}
