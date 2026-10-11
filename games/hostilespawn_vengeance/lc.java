/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static int[] field_c;
    static volatile int field_d;
    static bd field_a;
    static bd field_b;

    public static void a(int param0) {
        try {
          field_c = null;
          field_a = null;
          field_b = null;
          if (param0 <= 24) {
            field_d = -17;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ')');
        }
    }

    final static void a(oj param0, int param1) {
        boolean stackIn_14_0 = false;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = -101 / ((param1 + 64) / 34);
          if (param0.field_i == 125) {
            param0.field_I = 1;
            param0.field_i = 126;
            param0.field_u = ia.field_l[129];
            if (uj.field_l == 1 &&
              ej.d((byte) 115)) {
              eh.field_c.a(lm.field_A[17], 100, uh.field_i);
            }
            boolean decompiledFrameCompleted0 = true;
            am.a(param0.field_j.b(-4), (byte) 125);
            var3 = ln.field_a.field_g[param0.field_j.b(-4)];
            if (var3 > 0) {
              var4 = 0;
              while (!(el.field_j <= var4)) {
                stackOut_13_0 = mm.field_m[var4].field_b;
                stackIn_45_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var5 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_14_0 &&
                  mm.field_m[var4].field_i != 8 &&
                  var3 == ln.field_a.field_g[mm.field_m[var4].field_j.b(-4)]) {
                  if (mm.field_m[var4].field_i != 27) {
                    mm.field_m[var4].field_I = 0;
                  } else {
                    n.field_o = false;
                    if (bm.field_c == 1 &&
                      rl.field_c == 3) {
                      ti.a(231, (byte) -113, 24);
                    }
                    mm.field_m[var4].c((byte) -99);
                  }
                }
                var4++;
              }
            }
            if (decompiledFrameCompleted0) {
              if (q.field_g != null) {
                q.field_g.a(-45, param0);
              }
              stackIn_45_0 = 100;
            }
            if (stackIn_45_0 > tb.field_N) {
              tb.field_N = 100;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("lc.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, gb param1, gb param2, int param3, gb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          c.field_a = ta.a(false, "");
          c.field_a.a(param3 ^ 21648, false);
          ab.a(0, param4, param1, param2);
          qm.a(false);
          ki.field_f = e.field_q;
          if (param3 != 12789) {
            return;
          }
          od.field_I = e.field_q;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
        field_d = -1;
    }
}
