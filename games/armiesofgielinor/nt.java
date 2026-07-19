/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends tc {
    int field_q;
    int field_r;
    static String field_p;
    int[][] field_n;
    boolean field_l;
    int field_k;
    String[][] field_t;
    int field_o;
    int field_s;
    int field_m;

    public static void a(byte param0) {
        field_p = null;
        if (param0 != 97) {
            field_p = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        wk stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        wk stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        wk stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        wk stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        wk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        wk stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        wk stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        wk stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        wk stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        wk stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        wk stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        wk stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 894) {
                break L1;
              } else {
                nt.a((byte) 82);
                break L1;
              }
            }
            L2: {
              L3: {
                if (cu.field_a) {
                  break L3;
                } else {
                  fe.a(vf.field_j[3 & param1], param3, param4);
                  param1 = param1 >> 2;
                  vf.field_j[(3 & param1) + 4].f(param3, -4 + param4, 128);
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5_int = param1 & 3;
              param1 = param1 | param1 << 589217800;
              var6 = 0;
              L4: while (true) {
                L5: {
                  stackOut_6_0 = var6;
                  stackIn_12_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!cu.field_a) {
                    if (stackIn_12_0 >= 1) {
                      break L2;
                    } else {
                      break L5;
                    }
                  } else {
                    var11 = 4;
                    var10 = stackIn_7_0;
                    if (var9 != 0) {
                      if (var10 >= var11) {
                        break L2;
                      } else {
                        break L5;
                      }
                    } else {
                      if (var10 >= var11) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    var7 = (((15 & param1) + 15) * param2 / 16 + var6 * 20 - -(param1 & 15)) % 320;
                    var8 = 0;
                    if (64 > var7) {
                      break L7;
                    } else {
                      var8 = var7 - 64 >> 1864204449;
                      if (var9 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var8 = -var7 + 64 << -1044545695;
                  break L6;
                }
                L8: {
                  stackOut_16_0 = vf.field_j[var5_int];
                  stackOut_16_1 = param3;
                  stackOut_16_2 = param4 + -(var7 / 4);
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (cu.field_a) {
                    stackOut_18_0 = (wk) ((Object) stackIn_18_0);
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L8;
                  } else {
                    stackOut_17_0 = (wk) ((Object) stackIn_17_0);
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 2;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L8;
                  }
                }
                L9: {
                  fe.a(stackIn_19_0, stackIn_19_1, stackIn_19_2, stackIn_19_3 * (-var8 + 128));
                  param1 = param1 >> 2;
                  stackOut_19_0 = vf.field_j[4 + var5_int];
                  stackOut_19_1 = var5_int + param3;
                  stackOut_19_2 = -(var7 / 4) + param4;
                  stackOut_19_3 = 64 + -(var8 / 2);
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  stackIn_21_3 = stackOut_19_3;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  if (cu.field_a) {
                    stackOut_21_0 = (wk) ((Object) stackIn_21_0);
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = stackIn_21_3;
                    stackOut_21_4 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    stackIn_22_4 = stackOut_21_4;
                    break L9;
                  } else {
                    stackOut_20_0 = (wk) ((Object) stackIn_20_0);
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = stackIn_20_3;
                    stackOut_20_4 = 2;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    stackIn_22_3 = stackOut_20_3;
                    stackIn_22_4 = stackOut_20_4;
                    break L9;
                  }
                }
                ((wk) (Object) stackIn_22_0).f(stackIn_22_1, stackIn_22_2, stackIn_22_3 * stackIn_22_4);
                var5_int = 3 & (var5_int ^ param1);
                var6++;
                continue L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "nt.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2_int = kl.c(tf.field_l, -76, hi.field_j);
              if ((var2_int ^ -1) == -2) {
                param1 = "<img=0>" + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-3 != (var2_int ^ -1)) {
                break L2;
              } else {
                param1 = "<img=1>" + param1;
                break L2;
              }
            }
            var3 = 103 % ((param0 - -62) / 38);
            stackOut_5_0 = (String) (param1);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("nt.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    nt() {
    }

    static {
        field_p = "Yes";
    }
}
