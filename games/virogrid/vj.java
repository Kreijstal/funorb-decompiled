/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String field_a;
    static int[] field_b;

    public static void b(byte param0) {
        Object var2 = null;
        field_b = null;
        if (param0 != 17) {
          var2 = null;
          vj.a((eh) null, (eh) null, true, false);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(eh param0, eh param1, boolean param2, boolean param3) {
        kb.a(pl.field_a, ma.field_e, ub.field_z, ti.field_h, ke.field_u, da.field_n, p.field_a, wn.field_m, param2, -112, (e) (Object) em.field_d, nb.field_r);
        j.field_k = ke.a(32, param1, "lobby", "chatfilter");
        hn.field_i[1] = ng.field_Y;
        hn.field_i[0] = eh.field_g;
        hn.field_i[2] = jk.field_f;
        kb.a((e) (Object) db.field_h, false, param0);
        if (!param3) {
            field_a = null;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (!lb.a((byte) -20)) {
          if (null != ih.field_b) {
            if (!ih.field_b.field_a) {
              return;
            } else {
              am.a((byte) -16);
              ig.field_c.a(0, (fi) (Object) new mk(ig.field_c, rg.field_b));
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$12 = ig.field_c.a(uf.field_p, dc.field_P, (byte) -127, true);
          ig.field_c.i(16);
          L0: while (true) {
            if (!nd.b((byte) -98)) {
              var1 = 80 % ((-47 - param0) / 37);
              return;
            } else {
              boolean discarded$13 = ig.field_c.a(um.field_Gb, nm.field_d, -97);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add <%0> to friend list";
    }
}
