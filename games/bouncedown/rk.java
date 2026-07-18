/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        sa var4 = null;
        he var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            var5 = (he) (Object) of.field_b.a((byte) -105);
            L1: while (true) {
              if (var5 == null) {
                var4 = (sa) (Object) jl.field_f.a((byte) -58);
                L2: while (true) {
                  if (var4 == null) {
                    break L0;
                  } else {
                    int discarded$4 = 3;
                    ha.a(-17765, var4);
                    var4 = (sa) (Object) jl.field_f.d((byte) -29);
                    continue L2;
                  }
                }
              } else {
                mi.a(3, -115, var5);
                var5 = (he) (Object) of.field_b.d((byte) -18);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "rk.F(" + 3 + ',' + -29 + ')');
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
            ig.a(-92);
            q.field_N.k(-20281);
            vk.field_c = new ci(gi.field_b, (String) null, fe.field_g, param3, param2);
            ed.field_c = new ec(q.field_N, (lk) (Object) vk.field_c);
            q.field_N.b((lk) (Object) ed.field_c, false);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "rk.E(" + 4 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_2_0 = lh.a(-121, param1.length, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rk.B(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static o a(gk param0, gk param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 0;
            if (c.a(param0, false, param4, param3)) {
              int discarded$2 = 41;
              stackOut_3_0 = gi.a(param1.b(-127, param3, param4));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("rk.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -20 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(boolean param0, boolean param1) {
        int var4 = 0;
        var4 = 0;
        if (param1) {
          L0: {
            var4 += 4;
            if (param0) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          return vg.field_a[var4];
        } else {
          L1: {
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          return vg.field_a[var4];
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, si param6, int param7, int param8) {
        bd.field_l = param2;
        a.field_a = param4;
        try {
            vc.field_G = param6;
            mf.field_e = param0;
            fi.field_c = param5;
            pe.field_c = param1;
            uj.field_s = param7;
            fk.field_d = param8;
            tb.field_p = (v) (Object) new tb();
            hb.field_F = new vi(param6);
            ih.field_Q = new oj(tb.field_p, hb.field_F);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "rk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 0 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
