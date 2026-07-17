/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static int field_c;
    static String field_b;
    static sh field_a;

    final static void a(nc param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        th var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7 = ed.field_q;
            var8 = var7;
            if (param2 > 71) {
              var8.h(param1, 0);
              var8.field_h = var8.field_h + 1;
              var4 = var8.field_h;
              var8.c(1, -1);
              var8.e(96, param0.field_j);
              var8.e(105, param0.field_k);
              var8.e(111, param0.field_l);
              var8.f(param0.field_i, -32287);
              var8.f(param0.field_q, -32287);
              var8.f(param0.field_o, -32287);
              var8.f(param0.field_s, -32287);
              var8.c(param0.field_m.length, -1);
              var5 = 0;
              L1: while (true) {
                if (param0.field_m.length <= var5) {
                  int discarded$1 = var8.a(var4, (byte) 29);
                  var8.d(-var4 + var8.field_h, (byte) -124);
                  break L0;
                } else {
                  var7.f(param0.field_m[var5], -32287);
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ga.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (wf.field_i >= 10) {
                if (og.a(23440)) {
                  if (ta.field_g != 0) {
                    uj.a(param0 + -126, param2);
                    break L1;
                  } else {
                    tg.a(param1, false, param0 + 49);
                    lj.a(0, param2, 0, (byte) -128);
                    break L1;
                  }
                } else {
                  lf.a();
                  ra.a(320, 150, 240);
                  lj.a(0, param2, 0, (byte) -128);
                  break L1;
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (dl.field_b) {
                    dl.field_b = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                hd.a(aa.a((byte) 92), (byte) -90, ik.a((byte) 94), var3_int != 0, te.field_E);
                break L1;
              }
            }
            if (param0 == 57) {
              break L0;
            } else {
              field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ga.A(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static void b(int param0) {
        di.field_x.b(123, (w) (Object) new mh());
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            ga.a((byte) -81, true, (java.awt.Canvas) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "GAME OVER";
    }
}
