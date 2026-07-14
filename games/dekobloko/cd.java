/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    String field_f;
    boolean field_e;
    int field_h;
    static vj field_c;
    boolean field_n;
    static int[] field_b;
    static ck field_k;
    static ve field_m;
    String[] field_d;
    static String field_j;
    static boolean field_i;
    static int field_a;
    static String field_l;
    static volatile boolean field_g;

    final static lm a(String param0, ji param1, ji param2, byte param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 <= 86) {
          field_b = null;
          var5 = param2.b(-1, param4);
          var6 = param2.a(var5, 13030, param0);
          return ql.a(param2, (byte) 41, var6, var5, param1);
        } else {
          var5 = param2.b(-1, param4);
          var6 = param2.a(var5, 13030, param0);
          return ql.a(param2, (byte) 41, var6, var5, param1);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 8192) {
            field_c = null;
            return cl.field_v != null ? true : qc.field_N;
        }
        return cl.field_v != null ? true : qc.field_N;
    }

    final static void a(boolean param0) {
        am.field_a = null;
        nk.field_k = false;
        h.field_d = null;
        f.field_s = null;
        pd.field_d = null;
        ca.field_wb = null;
        kf.field_G = null;
        cl.field_B = null;
        if (!param0) {
            field_m = null;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_c = null;
        field_m = null;
        field_k = null;
        if (param0 < 119) {
            return;
        }
        field_b = null;
        field_j = null;
    }

    cd(boolean param0) {
        ((cd) this).field_n = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vj();
        field_b = new int[8192];
        field_i = false;
        field_j = "<%0> wants to draw.";
        field_g = true;
        field_l = "Full";
    }
}
