/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kd extends wm {
    static int field_p;
    static int[][] field_s;
    static int field_u;
    static String field_r;
    static String field_q;
    static ck field_t;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_6_0 = null;
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
            if (((kd) this).b(param0, (byte) -40) == vm.field_u) {
              stackOut_2_0 = um.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 != -11) {
                field_u = 2;
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kd.A(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_7_0;
    }

    final tb b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        tb stackIn_2_0 = null;
        tb stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        tb stackOut_8_0 = null;
        tb stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            if (be.a((byte) 98, var4)) {
              L1: {
                if (param1 == -40) {
                  break L1;
                } else {
                  field_t = null;
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) (Object) param0;
                var3_int = cb.a((byte) -106, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (var3_int > 130) {
                    break L2;
                  } else {
                    return dc.field_b;
                  }
                }
              }
              stackOut_8_0 = vm.field_u;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = vm.field_u;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kd.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
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
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1 + param0;
              var6 = param4 + param3;
              if (param1 > hk.field_c) {
                stackOut_3_0 = param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = hk.field_c;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              var9 = -83 / ((param2 - 29) / 53);
              if (hk.field_h >= param3) {
                stackOut_6_0 = hk.field_h;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param3;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (hk.field_g <= var5_int) {
                stackOut_9_0 = hk.field_g;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_10_0;
              if (var6 < hk.field_b) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = hk.field_b;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_13_0;
              if (param1 < hk.field_c) {
                break L5;
              } else {
                if (hk.field_g <= param1) {
                  break L5;
                } else {
                  var12 = param1 + var8 * hk.field_j;
                  var13 = -var8 + var11 + 1 >> 1;
                  L6: while (true) {
                    var13--;
                    if (var13 < 0) {
                      break L5;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 = var12 + hk.field_j * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param3 < hk.field_h) {
                break L7;
              } else {
                if (hk.field_b <= var6) {
                  break L7;
                } else {
                  var12 = hk.field_j * param3 + var7;
                  var13 = -var7 + var10 + 1 >> 1;
                  L8: while (true) {
                    var13--;
                    if (var13 < 0) {
                      break L7;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (var5_int < hk.field_c) {
                break L9;
              } else {
                if (var5_int < hk.field_g) {
                  var12 = (var8 - -(var5_int - param1 & 1)) * hk.field_j - -var5_int;
                  var13 = -var8 + 1 + var11 >> 1;
                  L10: while (true) {
                    var13--;
                    if (var13 < 0) {
                      break L9;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 = var12 + 2 * hk.field_j;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (hk.field_h > param3) {
                break L11;
              } else {
                if (hk.field_b > var6) {
                  var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                  var13 = 1 - -var10 - var7 >> 1;
                  L12: while (true) {
                    var13--;
                    if (0 > var13) {
                      break L11;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L12;
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
          throw dh.a((Throwable) (Object) var5, "kd.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    kd(rk param0) {
        super(param0);
    }

    public static void e() {
        field_t = null;
        field_q = null;
        field_s = null;
        field_r = null;
        int var1 = 6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[2][8];
        field_r = "Find opponent";
        field_q = "Loading music";
        vj discarded$0 = new vj();
    }
}
