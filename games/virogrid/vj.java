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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kb.a(pl.field_a, ma.field_e, ub.field_z, ti.field_h, ke.field_u, da.field_n, p.field_a, wn.field_m, param2, -112, em.field_d, nb.field_r);
              j.field_k = ke.a(32, param1, "lobby", "chatfilter");
              hn.field_i[1] = ng.field_Y;
              hn.field_i[0] = eh.field_g;
              hn.field_i[2] = jk.field_f;
              kb.a(db.field_h, false, param0);
              if (param3) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vj.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
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
