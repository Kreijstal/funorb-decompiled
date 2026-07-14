/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends l {
    static String field_i;
    static String field_s;
    int field_h;
    static long field_o;
    static lc field_q;
    static String field_g;
    int field_r;
    int field_m;
    static me field_l;
    static km field_n;
    static int field_k;
    static byte[] field_p;
    static e field_j;

    final static v a(int param0, byte[] param1) {
        v var2 = null;
        Object var3 = null;
        if (param0 == -9618) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new v(param1, el.field_w, mb.field_bb, db.field_k, gb.field_F, lj.field_j);
            pe.b((byte) -28);
            return var2;
          }
        } else {
          var3 = null;
          pm.a((eh) null, -49);
          if (param1 == null) {
            return null;
          } else {
            var2 = new v(param1, el.field_w, mb.field_bb, db.field_k, gb.field_F, lj.field_j);
            pe.b((byte) -28);
            return var2;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_s = null;
        if (param0 != 0) {
          var2 = null;
          pm.a((eh) null, -125);
          field_q = null;
          field_g = null;
          field_l = null;
          field_p = null;
          field_i = null;
          field_j = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_g = null;
          field_l = null;
          field_p = null;
          field_i = null;
          field_j = null;
          field_n = null;
          return;
        }
    }

    final static void a(eh param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        wm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        hg var8 = null;
        int var9 = 0;
        hg var10 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        var8 = new hg(param0.a("logo.fo3d", 100, ""));
        var10 = var8;
        var3 = var10.g(11132);
        var10.j(8);
        td.field_e = fj.a(var10, 9);
        ph.field_n = new wm[var3];
        kh.field_f = new int[var3][];
        var4 = -94 / ((9 - param1) / 56);
        var5_int = 0;
        L0: while (true) {
          if (var3 <= var5_int) {
            var10.k(7);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = ph.field_n[var9];
                var5.a(false, 6, 1, 6, 6);
                var5.b((byte) 126);
                var6 = new int[]{var5.field_C + var5.field_U >> 1039271841, var5.field_T + var5.field_g >> -1608293407, var5.field_p + var5.field_L >> -713543839};
                kh.field_f[var9] = var6;
                var5.a(-var6[1], -var6[0], -var6[2], (byte) 112);
                var9++;
                continue L1;
              }
            }
          } else {
            ph.field_n[var5_int] = qn.a(var8, 13472);
            var5_int++;
            continue L0;
          }
        }
    }

    pm(int param0, int param1, int param2) {
        ((pm) this).field_m = param0;
        ((pm) this).field_r = param2;
        ((pm) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = "Buying or selling an account";
        field_q = new lc(0, 2, 2, 1);
        mg discarded$0 = new mg(0, 0);
        field_l = new me();
    }
}
