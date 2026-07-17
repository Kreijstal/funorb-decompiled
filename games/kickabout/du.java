/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du implements gj {
    private int field_d;
    static int field_a;
    private int field_c;
    static int field_e;
    static int field_k;
    static ut field_i;
    private hu field_m;
    static hd field_f;
    static int field_j;
    private int field_l;
    private int field_h;
    private int field_o;
    static String field_g;
    private int field_b;
    static int field_n;

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nv var13 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        fd stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof nv)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (fd) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (fd) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (nv) (Object) stackIn_4_0;
              on.a(param3.field_t + param4, param3.field_g + param2, param3.field_n, param3.field_i, ((du) this).field_b);
              if (var13 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param3.field_n - var13.field_H * 2;
            var8 = var13.field_H + param4 + param3.field_t;
            var9 = var13.field_J + (param2 + param3.field_g);
            on.b(var8, var9, var8 + var7, var9, ((du) this).field_h);
            var10 = 47 / ((59 - param0) / 53);
            var11 = var13.a((byte) 31) + -1;
            L3: while (true) {
              if (0 > var11) {
                if (null == ((du) this).field_m) {
                  break L0;
                } else {
                  ((du) this).field_m.d(var13.field_q, var8 + var7 / 2, var13.field_J + ((du) this).field_m.field_x + var9, ((du) this).field_c, ((du) this).field_o);
                  return;
                }
              } else {
                on.d(var13.a((byte) -120, var11) * var7 / var13.h((byte) -88) + var8, var9, ((du) this).field_d, ((du) this).field_l);
                var11--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("du.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
    }

    du(hu param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((du) this).field_b = param4;
            ((du) this).field_m = param0;
            ((du) this).field_o = param2;
            ((du) this).field_h = param3;
            ((du) this).field_c = param1;
            ((du) this).field_l = param6;
            ((du) this).field_d = param5;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "du.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_g = "spectate";
    }
}
