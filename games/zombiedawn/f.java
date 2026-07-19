/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static dj field_i;
    static int[] field_g;
    int field_h;
    static int field_f;
    static int field_k;
    static int field_b;
    static vn field_e;
    static String[] field_j;
    static int field_a;
    static int field_c;
    static vn field_d;

    public static void a(byte param0) {
        if (param0 <= 4) {
          field_i = (dj) null;
          field_j = null;
          field_i = null;
          field_e = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          field_e = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (uh.field_g) {
            return;
        }
        try {
            int var2_int = -124 % ((-64 - param0) / 39);
            var3 = (aj.field_a * 5 >> -1082847742) + nk.field_c;
            var4 = uo.field_h - -(rh.field_a >> 678804545);
            var5 = param1.a(nk.field_c, (byte) -87);
            var6 = param1.a(uo.field_h, 0);
            var7 = pj.a(var6, 82, var5) * 5 >> -363823902;
            oe.field_c.h(var7);
            bi.f(var5, var6, var5 - -aj.field_a, var6 + rh.field_a);
            bi.a(param1.a(var3, (byte) -89) << 1269174660, param1.a(var4, 0) << -1091856220, pl.field_r, ga.field_q, b.field_p);
            bi.c();
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "f.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[8192];
        field_k = 1;
        field_c = 5;
        field_a = 9;
    }
}
