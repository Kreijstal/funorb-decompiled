/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static boolean field_c;
    static String field_b;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 < 14) {
            field_a = (String) null;
          }
          param2 = qe.a((byte) 36, '_', param2, "");
          var3 = pc.a(param2, 0);
          stackIn_7_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("tf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, mg param2, int param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          pj.field_r[0] = og.field_w.nextInt();
          pj.field_r[1] = og.field_w.nextInt();
          pj.field_r[2] = (int)(md.field_m >> 32);
          pj.field_r[3] = (int)md.field_m;
          sp.field_c.field_f = 0;
          sp.field_c.a(pj.field_r[0], -16384);
          sp.field_c.a(pj.field_r[1], -16384);
          sp.field_c.a(pj.field_r[2], param1 - 16459);
          sp.field_c.a(pj.field_r[3], -16384);
          lo.a(param1 - 51, sp.field_c);
          sp.field_c.c(-161478600, param3);
          param2.a(sp.field_c, (byte) 124);
          tp.field_f.field_f = 0;
          if (!param0) {
            tp.field_f.a(true, 16);
          } else {
            tp.field_f.a(true, 18);
          }
          tp.field_f.field_f = tp.field_f.field_f + 2;
          var5_int = tp.field_f.field_f;
          tp.field_f.a(tb.field_g, -16384);
          tp.field_f.b(vb.field_m, (byte) 13);
          var6 = 0;
          if (fj.field_d) {
            var6 = var6 | 1;
          }
          if (ag.field_b) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (ld.field_r != null) {
            var6 = var6 | 16;
          }
          tp.field_f.a(true, var6);
          var7 = mf.a(le.b((byte) -20), -28697);
          if (param1 != 75) {
            field_a = (String) null;
          }
          if (var7 == null) {
            var7 = "";
          }
          tp.field_f.b(var7, (byte) -23);
          if (null != ld.field_r) {
            tp.field_f.a(ld.field_r, (byte) -117);
          }
          tg.a(sp.field_c, tp.field_f, gn.field_S, -107, lm.field_j);
          tp.field_f.b(977272835, -var5_int + tp.field_f.field_f);
          ak.a(-1, (byte) -48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -6) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Last Spider";
        field_a = "Type your age in years";
    }
}
