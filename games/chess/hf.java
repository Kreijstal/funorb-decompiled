/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hf {
    int field_f;
    String field_e;
    String field_b;
    static volatile boolean field_a;
    um field_c;
    static int field_g;
    String field_d;

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var12 = Chess.field_G;
        try {
          L0: {
            var4_int = -33;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L1: while (true) {
              if (var8 <= var9) {
                stackOut_34_0 = var6;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var10 = param1.charAt(var9);
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var10 == 45) {
                        var5 = 1;
                        var9++;
                        break L2;
                      } else {
                        if (var10 != 43) {
                          break L3;
                        } else {
                          var9++;
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var10 < 48) {
                        break L5;
                      } else {
                        if (var10 > 57) {
                          break L5;
                        } else {
                          var10 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var10 < 65) {
                        break L6;
                      } else {
                        if (var10 > 90) {
                          break L6;
                        } else {
                          var10 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var10 < 97) {
                        break L7;
                      } else {
                        if (var10 > 122) {
                          break L7;
                        } else {
                          var10 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                  if (var10 >= 10) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L8: {
                      if (var5 == 0) {
                        break L8;
                      } else {
                        var10 = -var10;
                        break L8;
                      }
                    }
                    var11 = var7 * 10 - -var10;
                    if (var11 / 10 == var7) {
                      var6 = 1;
                      var7 = var11;
                      break L2;
                    } else {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0 != 0;
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("hf.B(").append(true).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L9;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + -17 + ',' + 10 + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 >>> 31;
        return (var3 + param0) / param2 - var3;
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_17_0 = null;
        String stackOut_21_0 = null;
        String stackOut_25_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_28_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param2;
            int discarded$2 = 21257;
            if (!ed.a(var6)) {
              stackOut_2_0 = qj.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (ld.field_g != 2) {
                stackOut_6_0 = tf.field_k;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (qd.a((byte) 13, param2)) {
                  stackOut_10_0 = ed.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (!ah.a(param2, 54)) {
                    L1: {
                      if (100 > wg.field_w) {
                        break L1;
                      } else {
                        if (cl.field_d > 0) {
                          break L1;
                        } else {
                          stackOut_17_0 = df.field_c;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    if (wg.field_w >= 200) {
                      stackOut_21_0 = df.field_c;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    } else {
                      int discarded$3 = -19554;
                      if (va.a(param2)) {
                        stackOut_25_0 = oc.a(uh.field_n, new String[1], (byte) -42);
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        var5 = qn.field_U;
                        var5.f(param0, -88);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        if (param1 > 72) {
                          var5.c(0, (byte) -115);
                          var5.a(-113, param2);
                          var5.a(-var4 + var5.field_l, -1);
                          stackOut_30_0 = null;
                          stackIn_31_0 = stackOut_30_0;
                          break L0;
                        } else {
                          stackOut_28_0 = null;
                          stackIn_29_0 = stackOut_28_0;
                          return (String) (Object) stackIn_29_0;
                        }
                      }
                    }
                  } else {
                    stackOut_13_0 = oc.a(i.field_b, new String[1], (byte) -108);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("hf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return (String) (Object) stackIn_31_0;
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_g = 0;
    }
}
