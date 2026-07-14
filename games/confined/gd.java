/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends rk {
    static int[] field_m;
    int field_s;
    static pf field_q;
    static String field_r;
    static nf[] field_t;
    static int field_n;
    int[] field_p;
    static int field_u;
    boolean field_o;

    final static in a(int param0, String param1, int param2) {
        in var3 = null;
        var3 = new in(false);
        var3.field_f = param1;
        var3.field_g = param2;
        if (param0 != 4) {
          gd.a((byte) 14);
          return var3;
        } else {
          return var3;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -3) {
          var2 = null;
          gd.a(21, 49, (bi) null, (pm) null);
          field_r = null;
          field_q = null;
          field_m = null;
          field_t = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          field_m = null;
          field_t = null;
          return;
        }
    }

    final static void a(int param0, int param1, bi param2, pm param3) {
        da.a(param0, 0, param2, false, param3);
        int var4 = -74 / ((param1 - -76) / 32);
    }

    gd() {
        ((gd) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Account created successfully!";
        field_u = 4;
    }
}
