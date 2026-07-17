/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static gh field_b;
    q field_d;
    static ks field_a;
    static kj field_c;

    final static long a(int param0) {
        return pr.a(14274) + -pf.field_e;
    }

    final static void a(boolean param0) {
        cl var1 = (cl) (Object) ql.field_p.a(true);
        if (!(var1 != null)) {
            var1 = new cl();
        }
        var1.a(gf.field_i, gf.field_f, gf.field_h, gf.field_k, gf.field_a, 5, gf.field_b, gf.field_l);
        ta.field_b.a((byte) -113, (oh) (Object) var1);
    }

    public static void b(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(bi[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 >= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param3 < -86) {
                      break L2;
                    } else {
                      field_a = null;
                      break L2;
                    }
                  }
                  var5_int = param0[0].field_o;
                  var6 = param0[2].field_o;
                  var7 = param0[1].field_o;
                  param0[0].f(param4, param1);
                  param0[2].f(param2 + param4 - var6, param1);
                  gf.a(fc.field_g);
                  gf.i(var5_int + param4, param1, -var6 + param2 + param4, param0[1].field_p + param1);
                  var8 = var5_int + param4;
                  var9 = -var6 + param4 + param2;
                  param4 = var8;
                  L3: while (true) {
                    if (param4 >= var9) {
                      gf.b(fc.field_g);
                      break L0;
                    } else {
                      param0[1].f(param4, param1);
                      param4 = param4 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("wh.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    wh(String param0, qr param1) {
        String[] var3 = null;
        qr[] var4 = null;
        try {
            var3 = new String[]{param0, gm.field_o, wk.field_b};
            var4 = new qr[]{param1, cg.field_A, (qr) (Object) wg.field_a};
            ((wh) this).field_d = new q(0L, re.field_h, var3, tm.field_t, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        ((wh) this).field_d.a(param3, param4, param1, var6, param0, false, var7);
        rj.field_p.a(cg.field_A.field_K, cr.field_c, (byte) 59, 0, 0);
        vn.field_t.a(-pe.field_K + (cg.field_A.field_K - 84), 18, (byte) 82, 2 + cr.field_c, 0);
        mg.field_F.a(82 + pe.field_K, 18, (byte) 117, 2 + cr.field_c, -80 + -pe.field_K + (cg.field_A.field_K + -2));
        d.field_a.a(-22 + (cg.field_A.field_mb + -cr.field_c), 20 + cr.field_c + 2, pe.field_K, 2, 20, cg.field_A.field_K, (byte) 123, 0);
        wg.field_a.a(2, pe.field_K, 0, 20);
        if (param2 != 95) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    static {
    }
}
