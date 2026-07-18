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
        int var2 = 0;
        if (0 == param1) {
            var2 = ec.field_i;
        }
        if (!(param1 != 1)) {
            var2 = ol.field_e;
        }
        if (!(param1 != 2)) {
            var2 = di.field_e;
        }
        return var2;
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 125 / ((20 - param0) / 32);
            stackOut_0_0 = new int[]{param1[0], param1[1], param1[2], param1[3], param1[4], param1[5], param1[6], param1[7], param1[8], param1[9], param1[10], param1[11]};
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("f.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        vh stackIn_1_0 = null;
        vh stackIn_2_0 = null;
        vh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        vh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_9_0 = 0;
        vh stackOut_0_0 = null;
        vh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        vh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        vh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        vh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        vh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          field_h = qh.field_f;
          fr.field_s = qh.field_l;
          qi.a((byte) -95);
          kg.field_l.a(ir.field_a.field_Db - 42, ir.field_a.field_gb, 0, 0, (byte) -124);
          pm.field_m.b(0, 2147483647, 0, sn.field_m.field_gb, ad.field_x);
          var1 = 2 + ad.field_x;
          stackOut_0_0 = c.field_e;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (tq.field_p) {
            stackOut_2_0 = (vh) (Object) stackIn_2_0;
            stackOut_2_1 = var1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (vh) (Object) stackIn_1_0;
            stackOut_1_1 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (vh) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = 2147483647;
          stackOut_3_3 = 0;
          stackOut_3_4 = sn.field_m.field_gb;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_5_4 = stackOut_3_4;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          if (tq.field_p) {
            stackOut_5_0 = (vh) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = stackIn_5_4;
            stackOut_5_5 = var1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            stackIn_6_5 = stackOut_5_5;
            break L1;
          } else {
            stackOut_4_0 = (vh) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            break L1;
          }
        }
        L2: {
          ((vh) (Object) stackIn_6_0).b(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, -stackIn_6_5 + sn.field_m.field_Db);
          da.a(true);
          gj.field_K.b(ir.field_a.field_Db + -40, 2147483647, 0, ir.field_a.field_gb, 40);
          ll.field_d.b(0, 2147483647, 0, oi.field_n.field_gb, 30);
          pk.field_a.b(30, 2147483647, 0, oi.field_n.field_gb, -70 + (oi.field_n.field_Db - 2));
          wk.field_N.b(5, 2147483647, 5, 68, 30);
          pp.field_c.b(5, 2147483647, 75, 78, 30);
          ac.field_p.b(5, 2147483647, 155, 48, 30);
          mm.field_g.b(5, 2147483647, 205, 48, 30);
          if (!tq.field_p) {
            stackOut_8_0 = 200;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 250;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          mn.field_e.b(5, 2147483647, 5 - -var2, -var2 + 363, 30);
          l.field_f.b(5, 2147483647, 370, -10 + oi.field_n.field_gb - 365, 30);
          vb.field_m.a(nk.field_n, -5 + (pk.field_a.field_Db + -37), (byte) -112, 2, pk.field_a.field_gb - 10, 5, 37);
          var3 = (2 + oi.field_n.field_gb) / 2;
          rn.field_f.b(oi.field_n.field_Db - 40, 2147483647, 0, -2 + var3, 40);
          if (!tq.field_p) {
            var3 = 0;
            break L3;
          } else {
            break L3;
          }
        }
        uc.field_b.b(oi.field_n.field_Db + -40, 2147483647, var3, oi.field_n.field_gb - var3, 40);
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = -128;
        hi.g();
        field_d = "Location";
        field_f = 8;
        field_g = 12;
    }
}
