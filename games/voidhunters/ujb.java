/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ujb {
    static boolean field_j;
    String field_a;
    String field_i;
    static int field_g;
    static int field_h;
    String field_e;
    int field_b;
    asb field_f;
    static String field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 384) {
          L0: {
            boolean discarded$13 = ujb.a(-23, -58, 67);
            if (-1 == (384 & param2)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (384 & param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, int[] param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (param1.length <= var5_int) {
                stackOut_9_0 = fra.a(param1, param3, 2, param2);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var6 = param1[var5_int];
                var7 = param1[1 + var5_int];
                var8 = param1[(2 + var5_int) % param1.length];
                var9 = param1[(var5_int - -3) % param1.length];
                var10 = lv.a(param4, var7, var9, param2, var6, 8, var8, param3, 43);
                if (var10 == -1) {
                  var5_int += 2;
                  continue L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ujb.C(").append(-57).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_10_0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -99) {
            ujb.a((byte) 62);
        }
    }

    final static boolean a(int param0) {
        if (param0 < -99) {
          if (wh.g(-118)) {
            if (hcb.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = -105;
          if (wh.g(-118)) {
            if (hcb.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          hb.field_d[bea.field_e] = param4;
          sv.field_f[bea.field_e] = bea.field_e;
          fmb.field_o[bea.field_e] = param1;
          if (pn.field_b < param1) {
            qbb.field_a = param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= rha.field_d) {
          L1: {
            emb.field_o[bea.field_e] = param0;
            hma.field_d[bea.field_e] = param2;
            fv.field_o[bea.field_e] = param5;
            var6 = param0 + param2 - -param5;
            if (0 == var6) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L1;
            } else {
              stackOut_15_0 = 1000 * param0 / var6;
              stackIn_17_0 = stackOut_15_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_17_0;
            hga.field_o[bea.field_e] = var7;
            bea.field_e = bea.field_e + 1;
            if (var7 > qbb.field_a) {
              qbb.field_a = var7;
              break L2;
            } else {
              break L2;
            }
          }
          if (npa.field_d > var7) {
            npa.field_d = var7;
            return;
          } else {
            return;
          }
        } else {
          L3: {
            npa.field_d = param1;
            emb.field_o[bea.field_e] = param0;
            hma.field_d[bea.field_e] = param2;
            fv.field_o[bea.field_e] = param5;
            var6 = param0 + param2 - -param5;
            if (0 == var6) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = 1000 * param0 / var6;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          L4: {
            var7 = stackIn_7_0;
            hga.field_o[bea.field_e] = var7;
            bea.field_e = bea.field_e + 1;
            if (var7 > qbb.field_a) {
              qbb.field_a = var7;
              break L4;
            } else {
              break L4;
            }
          }
          if (npa.field_d > var7) {
            npa.field_d = var7;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_g = 1;
        field_h = 20;
        field_d = "Sound: ";
    }
}
