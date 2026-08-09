/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int[] field_b;
    static double[][] field_a;
    static double[][] field_c;
    static String field_d;
    static int field_f;
    static int field_h;
    static int field_g;
    static vh field_e;

    final static int a(int param0, int param1) {
        int var2;
        L0: {
          var2 = 0;
          if (0 != param1) {
            break L0;
          } else {
            var2 = ec.field_i;
            break L0;
          }
        }
        L1: {
          if (-2 == (param1 ^ -1)) {
            var2 = ol.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 == 2) {
            var2 = di.field_e;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 != 5) {
          return 112;
        } else {
          return var2;
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 125 / ((20 - param0) / 32);
            stackIn_1_0 = new int[]{param1[0], param1[1], param1[2], param1[3], param1[4], param1[5], param1[6], param1[7], param1[8], param1[9], param1[10], param1[11]};
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("f.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        field_h = qh.field_f;
        fr.field_s = qh.field_l;
        qi.a((byte) -95);
        kg.field_l.a(ir.field_a.field_Db + -40 + -2, ir.field_a.field_gb, 0, 0, (byte) -124);
        pm.field_m.b(0, 2147483647, 0, sn.field_m.field_gb, ad.field_x);
        int var1 = 2 + ad.field_x;
        c.field_e.b(!tq.field_p ? 0 : var1, 2147483647, 0, sn.field_m.field_gb, -(!tq.field_p ? 0 : var1) + sn.field_m.field_Db);
        da.a(true);
        gj.field_K.b(ir.field_a.field_Db + -40, 2147483647, 0, ir.field_a.field_gb, 40);
        ll.field_d.b(0, 2147483647, 0, oi.field_n.field_gb, 30);
        pk.field_a.b(30, 2147483647, 0, oi.field_n.field_gb, -70 + (oi.field_n.field_Db - 2));
        wk.field_N.b(5, 2147483647, 5, 68, 30);
        pp.field_c.b(5, param0 ^ 2147483599, 75, 78, 30);
        ac.field_p.b(5, 2147483647, 155, 48, 30);
        mm.field_g.b(5, 2147483647, 205, param0, 30);
        int var2 = tq.field_p ? 250 : 200;
        mn.field_e.b(5, 2147483647, 5 - -var2, -var2 + 363, 30);
        l.field_f.b(5, param0 ^ 2147483599, 370, -10 + oi.field_n.field_gb - 365, 30);
        vb.field_m.a(nk.field_n, -5 + (pk.field_a.field_Db + -37), (byte) -112, 2, pk.field_a.field_gb - 10, 5, 37);
        int var3 = (2 + oi.field_n.field_gb) / 2;
        rn.field_f.b(oi.field_n.field_Db - 40, 2147483647, 0, -2 + var3, 40);
        if (!(tq.field_p)) {
            var3 = 0;
        }
        uc.field_b.b(oi.field_n.field_Db + -40, param0 + 2147483599, var3, oi.field_n.field_gb - var3, 40);
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = (double[][]) null;
        if (param0 < 57) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = (double[][]) null;
    }

    static {
        hi.g(-128);
        field_d = "Location";
        field_f = 8;
        field_g = 12;
    }
}
