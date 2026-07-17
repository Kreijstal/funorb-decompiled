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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == -57) {
              var5_int = 0;
              L1: while (true) {
                if (param1.length <= var5_int) {
                  stackOut_10_0 = fra.a(param1, param3, 2, param2);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var6 = param1[var5_int];
                  var7 = param1[1 + var5_int];
                  var8 = param1[(2 + var5_int) % param1.length];
                  var9 = param1[(var5_int - -3) % param1.length];
                  var10 = lv.a(param4, var7, var9, param2, var6, 8, var8, param3, param0 + 100);
                  if (var10 == -1) {
                    var5_int += 2;
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ujb.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_11_0;
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
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
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
          emb.field_o[bea.field_e] = param0;
          hma.field_d[bea.field_e] = param2;
          fv.field_o[bea.field_e] = param5;
          var6 = param0 + param2 - -param5;
          if (param3 == 13336) {
            L1: {
              if (0 == var6) {
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L1;
              } else {
                stackOut_37_0 = 1000 * param0 / var6;
                stackIn_39_0 = stackOut_37_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_39_0;
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
              field_c = -21;
              if (0 == var6) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L3;
              } else {
                stackOut_27_0 = 1000 * param0 / var6;
                stackIn_29_0 = stackOut_27_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_29_0;
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
        } else {
          npa.field_d = param1;
          emb.field_o[bea.field_e] = param0;
          hma.field_d[bea.field_e] = param2;
          fv.field_o[bea.field_e] = param5;
          var6 = param0 + param2 - -param5;
          if (param3 != 13336) {
            L5: {
              field_c = -21;
              if (0 == var6) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 1000 * param0 / var6;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_18_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L6;
              } else {
                break L6;
              }
            }
            if (npa.field_d > var7) {
              npa.field_d = var7;
              return;
            } else {
              return;
            }
          } else {
            L7: {
              if (0 == var6) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L7;
              } else {
                stackOut_6_0 = 1000 * param0 / var6;
                stackIn_8_0 = stackOut_6_0;
                break L7;
              }
            }
            L8: {
              var7 = stackIn_8_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L8;
              } else {
                break L8;
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
