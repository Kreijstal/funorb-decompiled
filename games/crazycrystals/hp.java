/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends jb {
    static String field_r;
    int field_l;
    static int[] field_q;
    int field_f;
    int[] field_p;
    static int field_s;
    static dl field_g;
    long field_i;
    int field_o;
    int field_h;
    static int[] field_m;
    int field_n;
    int field_j;
    int field_k;

    public static void a(int param0) {
        field_q = null;
        field_g = null;
        field_m = null;
        field_r = null;
        if (param0 != 20974) {
            field_r = null;
        }
    }

    final static ef a(db param0, int param1, String param2, db param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var5 = param3.a(param4, -1);
        if (param1 != 0) {
          var7 = null;
          ef discarded$2 = hp.a((db) null, 9, (String) null, (db) null, (String) null);
          var6 = param3.a(-2862, param2, var5);
          return pl.a(var5, var6, param1 ^ -11, param3, param0);
        } else {
          var6 = param3.a(-2862, param2, var5);
          return pl.a(var5, var6, param1 ^ -11, param3, param0);
        }
    }

    final static String d(int param0) {
        if (l.field_b == lc.field_c) {
            return fh.field_i;
        }
        if (param0 != 5) {
            field_m = null;
            return ig.field_p;
        }
        return ig.field_p;
    }

    hp(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((hp) this).field_l = param2;
        ((hp) this).field_p = param6;
        int fieldTemp$0 = fq.field_D;
        fq.field_D = fq.field_D + 1;
        ((hp) this).field_n = fieldTemp$0 & 65535;
        ((hp) this).field_f = param3;
        ((hp) this).field_o = param4;
        ((hp) this).field_h = param5;
        ((hp) this).field_j = param1;
        ((hp) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
        field_r = "Open in popup window";
        field_m = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 8, 8, 8, 3, 2, 5, 5, 0, 99, 99, 99, 99, 0, 0, -1};
    }
}
