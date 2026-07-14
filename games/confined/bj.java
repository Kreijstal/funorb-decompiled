/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends rk {
    int field_o;
    int[] field_s;
    long field_v;
    int field_n;
    int field_p;
    int field_t;
    static String[] field_w;
    int field_r;
    int field_u;
    int field_x;
    static int field_q;
    static boolean field_m;

    final static ce a(String param0, mi param1, mi param2, String param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != 38) {
          return null;
        } else {
          var5 = param1.a(-92, param0);
          var6 = param1.a(var5, param3, -69);
          return cj.a(var6, var5, param2, param4 + 20710, param1);
        }
    }

    final static boolean a(boolean param0, String param1) {
        if (!param0) {
            return true;
        }
        return pm.a(param1, true) != null ? true : false;
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        kj.field_c = param3;
        hm.field_gb = param1;
        r.a((byte) 101, param0, sj.field_kb);
        if (param2 != 14451) {
            field_w = null;
        }
    }

    public static void a(byte param0) {
        if (param0 < 52) {
            return;
        }
        field_w = null;
    }

    bj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        wg.field_c = wg.field_c + 1;
        ((bj) this).field_p = wg.field_c & 65535;
        ((bj) this).field_s = param6;
        ((bj) this).field_t = param5;
        ((bj) this).field_n = param2;
        ((bj) this).field_u = param3;
        ((bj) this).field_o = param4;
        ((bj) this).field_x = param1;
        ((bj) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_q = 0;
    }
}
