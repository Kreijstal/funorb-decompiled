/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String field_a;
    static int[] field_b;

    public static void b(byte param0) {
        eh var2;
        field_b = null;
        if (param0 != 17) {
          var2 = (eh) null;
          vj.a((eh) null, (eh) null, true, false);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(eh param0, eh param1, boolean param2, boolean param3) {
        try {
            kb.a(pl.field_a, ma.field_e, ub.field_z, ti.field_h, ke.field_u, da.field_n, p.field_a, wn.field_m, param2, -112, em.field_d, nb.field_r);
            j.field_k = ke.a(32, param1, "lobby", "chatfilter");
            hn.field_i[1] = ng.field_Y;
            hn.field_i[0] = eh.field_g;
            hn.field_i[2] = jk.field_f;
            kb.a(db.field_h, false, param0);
            if (!param3) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "vj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        int var2 = Virogrid.field_F ? 1 : 0;
        if (!lb.a((byte) -20)) {
            if (null != ih.field_b) {
                if (!(!ih.field_b.field_a)) {
                    am.a((byte) -16);
                    ig.field_c.a(0, new mk(ig.field_c, rg.field_b));
                }
            }
            return;
        }
        try {
            ig.field_c.a(uf.field_p, dc.field_P, (byte) -127, true);
            ig.field_c.i(16);
            while (nd.b((byte) -98)) {
                ig.field_c.a(um.field_Gb, nm.field_d, -97);
            }
            int var1_int = 80 % ((-47 - param0) / 37);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "vj.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Add <%0> to friend list";
    }
}
