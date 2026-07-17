/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements el {
    private uc field_c;
    static byte field_e;
    private int field_k;
    private int field_h;
    static String field_a;
    static int field_j;
    private int field_i;
    private int field_g;
    static volatile int field_b;
    private int field_l;
    private int field_d;
    static volatile int field_f;

    public static void a(byte param0) {
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var12 = null;
        gm stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        gm stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof ri)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (gm) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (gm) param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (ri) (Object) stackIn_4_0;
              ph.d(param2 + param4.field_w, param1 - -param4.field_k, param4.field_p, param4.field_o, ((rn) this).field_i);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 >= 89) {
              var7 = -(2 * var12.field_F) + param4.field_p;
              var8 = param4.field_w + param2 + var12.field_F;
              var9 = var12.field_C + (param1 + param4.field_k);
              ph.a(var8, var9, var7 + var8, var9, ((rn) this).field_g);
              var10 = var12.a(0) + -1;
              L3: while (true) {
                if (0 > var10) {
                  if (((rn) this).field_c == null) {
                    break L0;
                  } else {
                    ((rn) this).field_c.c(var12.field_m, var7 / 2 + var8, var12.field_C + var9 + ((rn) this).field_c.field_q, ((rn) this).field_l, ((rn) this).field_d);
                    return;
                  }
                } else {
                  ph.d(var8 - -(var7 * var12.b(var10, 0) / var12.a((byte) -108)), var9, ((rn) this).field_k, ((rn) this).field_h);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("rn.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param0 >> 16;
        if (param1 != -18) {
          field_b = 126;
          var4 = param0 & 65535;
          var5 = param2 >> 16;
          var6 = param2 & 65535;
          return var4 * var5 + (var3 * param2 - -(var4 * var6 >> 16));
        } else {
          var4 = param0 & 65535;
          var5 = param2 >> 16;
          var6 = param2 & 65535;
          return var4 * var5 + (var3 * param2 - -(var4 * var6 >> 16));
        }
    }

    rn(uc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((rn) this).field_g = param3;
            ((rn) this).field_l = param1;
            ((rn) this).field_d = param2;
            ((rn) this).field_h = param6;
            ((rn) this).field_c = param0;
            ((rn) this).field_k = param5;
            ((rn) this).field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(int param0) {
        oh.field_c = 0;
        if (param0 > -3) {
            field_j = 64;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_e = (byte) 1;
        field_a = "EXCLUSIVE";
        field_f = 0;
        field_b = -1;
    }
}
