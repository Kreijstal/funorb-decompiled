/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aha extends rqa {
    static llb field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(80, 62, param0[0].a(109));
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("aha.A(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = param2 - -param1;
              var6 = param3 + param0;
              if (param2 <= dma.field_d) {
                stackOut_3_0 = dma.field_d;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (dma.field_c < param0) {
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = dma.field_c;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (param4 < -41) {
                break L3;
              } else {
                aha.a(110);
                break L3;
              }
            }
            L4: {
              if (dma.field_a <= var5_int) {
                stackOut_11_0 = dma.field_a;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (var6 < dma.field_f) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = dma.field_f;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (param2 < dma.field_d) {
                break L6;
              } else {
                if (dma.field_a > param2) {
                  var11 = dma.field_g * var8 + param2;
                  var12 = 1 - -var10 - var8 >> 1;
                  L7: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L6;
                    } else {
                      dma.field_i[var11] = 16777215;
                      var11 = var11 + 2 * dma.field_g;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (dma.field_c > param0) {
                break L8;
              } else {
                if (var6 >= dma.field_f) {
                  break L8;
                } else {
                  var11 = dma.field_g * param0 - -var7;
                  var12 = var9 + 1 + -var7 >> 1;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      dma.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                }
              }
            }
            L10: {
              if (var5_int < dma.field_d) {
                break L10;
              } else {
                if (var5_int >= dma.field_a) {
                  break L10;
                } else {
                  var11 = (var8 + (var5_int - param2 & 1)) * dma.field_g - -var5_int;
                  var12 = 1 - (-var10 + var8) >> 1;
                  L11: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L10;
                    } else {
                      dma.field_i[var11] = 16777215;
                      var11 = var11 + dma.field_g * 2;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (dma.field_c > param0) {
                break L12;
              } else {
                if (dma.field_f > var6) {
                  var11 = dma.field_g * var6 + var7 - -(1 & -param0 + var6);
                  var12 = -var7 + (1 + var9) >> 1;
                  L13: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L12;
                    } else {
                      dma.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5, "aha.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 1511754497) {
            aha.a(-121, 80, -93, -27, (byte) -68);
        }
    }

    aha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
