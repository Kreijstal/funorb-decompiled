/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot extends dr {
    static at field_E;
    static int field_G;
    static String field_H;
    static String field_F;

    final static void a(byte param0, int param1, iw param2) {
        int var4 = 0;
        Object var5 = null;
        bv var6 = null;
        var6 = vl.field_n;
        var6.h(32161, param1);
        var6.field_q = var6.field_q + 1;
        var4 = var6.field_q;
        var6.b(param0 ^ 113, 1);
        var6.b(1, param2.field_r);
        if (param0 != 112) {
          var5 = null;
          ot.a((byte) 26, -53, (iw) null);
          var6.b(1, param2.field_k);
          var6.a((byte) -96, param2.field_q);
          var6.a((byte) -102, param2.field_m);
          var6.a((byte) -86, param2.field_t);
          var6.a((byte) -60, param2.field_s);
          int discarded$2 = var6.b((byte) -39, var4);
          var6.e(var6.field_q + -var4, 5930);
          return;
        } else {
          var6.b(1, param2.field_k);
          var6.a((byte) -96, param2.field_q);
          var6.a((byte) -102, param2.field_m);
          var6.a((byte) -86, param2.field_t);
          var6.a((byte) -60, param2.field_s);
          int discarded$3 = var6.b((byte) -39, var4);
          var6.e(var6.field_q + -var4, 5930);
          return;
        }
    }

    final static void g(int param0) {
        L0: {
          if (tn.field_Z == null) {
            break L0;
          } else {
            if (tn.field_Z.field_g != null) {
              tn.field_Z.field_g.field_rb = false;
              break L0;
            } else {
              tn.field_Z = null;
              if (param0 == 76) {
                pq.field_b = null;
                return;
              } else {
                ot.e((byte) -104);
                pq.field_b = null;
                return;
              }
            }
          }
        }
        tn.field_Z = null;
        if (param0 != 76) {
          ot.e((byte) -104);
          pq.field_b = null;
          return;
        } else {
          pq.field_b = null;
          return;
        }
    }

    ot(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            return null;
        }
        return new nd((Object) (Object) ih.e(90));
    }

    public static void e(byte param0) {
        field_E = null;
        field_H = null;
        int var1 = -2 % ((param0 - -35) / 35);
        field_F = null;
    }

    final static void a(ha param0, dg param1, int param2, ic param3) {
        jf.field_C = param3;
        bv.field_w = param0;
        pr.field_g = new vj(param2);
        pr.field_g.a(-1, ck.field_e[sf.field_P[76]][0]);
        kl.field_a = jf.field_C.field_M;
        wk discarded$0 = new wk(80, 40);
        ef.field_c = bv.field_w.field_db;
        ks.field_y = bv.field_w.field_v;
        og.field_p = kl.field_a.field_o;
        vs.field_e = bv.field_w.field_Eb;
        bt.field_f = bv.field_w.field_hb;
        nk.a((byte) 111);
        jd.field_L = false;
        ro.field_lb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> has lost connection.";
        field_G = 0;
        field_F = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
