/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static java.awt.Color field_d;
    static int[] field_b;
    static int field_a;
    static String field_c;
    static int[] field_e;

    final static void b(byte param0) {
        we var1 = (we) ((Object) ug.field_g.a((byte) 74));
        if (param0 != -10) {
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        tc.a(var1.field_k, var1.field_s, var1.field_m);
        tc.a(var1.field_i, var1.field_r, var1.field_q, var1.field_u);
        var1.field_k = null;
        fl.field_i.a((byte) -101, var1);
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -20) {
            dm.b((byte) -112);
        }
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              li.c();
              il.field_c = 11;
              qf.field_i = new int[260];
              if (param0 == 255) {
                break L1;
              } else {
                field_a = -31;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (qf.field_i.length <= var5) {
                    break L0;
                  } else {
                    qf.field_i[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                qf.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "dm.D(" + param0 + ')');
        }
    }

    final static void a(da param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              eg.a(d.field_c[param1], 16, true, param0);
              if (param2 == 255) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dm.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new java.awt.Color(10040319);
        field_b = new int[4];
        field_a = 0;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
