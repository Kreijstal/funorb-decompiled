/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static ie field_h;
    static int[] field_d;
    static int field_a;
    static String field_g;
    static qb[] field_c;
    static int field_b;
    static int field_e;
    static int field_f;

    final static ie a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ie stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2_int = param1.length();
            var3 = param0;
            L1: while (true) {
              if (var2_int <= var3) {
                stackIn_10_0 = pj.field_K;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (48 <= var4) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("la.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, boolean param5, int param6, int param7) {
        try {
            if (-1 == (ph.field_d.field_R ^ -1)) {
            } else {
                if (!ea.field_z) {
                    if (!hr.field_y) {
                        rg.field_p = true;
                    } else {
                        r.c((byte) 50);
                    }
                }
            }
            int var8_int = -106 % ((param0 - -1) / 55);
            if (rg.field_p) {
                lm.a(param1, param6, 20, 4, param2, param7, param4, param3, param3);
                uq.field_D.a(param5, false);
                if (!param5) {
                    return;
                }
                if (!(0 == be.field_L.field_R)) {
                    rg.field_p = false;
                }
                if (0 == wn.field_g.field_R) {
                    return;
                }
                cl.a(14851);
                rg.field_p = false;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 64 % ((53 - param0) / 52);
        field_d = null;
        field_g = null;
    }

    static {
        field_h = new ie();
        field_b = 0;
        field_g = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = 10;
    }
}
