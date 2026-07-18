/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lk extends am {
    static byte[][] field_t;
    private int field_s;
    private int field_w;
    private int field_u;
    static dq field_v;

    public lk() {
        super(1, false);
        ((lk) this).field_s = 4096;
        ((lk) this).field_w = 4096;
        ((lk) this).field_u = 4096;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = hf.a(param2, 116);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (ra.a(var4.charAt(0), 252)) {
                              break L3;
                            } else {
                              if (!ra.a(var4.charAt(var4.length() - 1), 252)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (~var6 <= ~param2.length()) {
                                    if (var5 > 0) {
                                      stackOut_32_0 = cc.field_b;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (ra.a((char) var7, 252)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_25_0 = am.field_q;
                                      stackIn_26_0 = stackOut_25_0;
                                      return stackIn_26_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = cc.field_b;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = ml.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = ml.field_b;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = ml.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("lk.D(").append(false).append(',').append(23).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_33_0;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var28 = null;
        int[][] var32 = null;
        int[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var15 = Torquing.field_u;
          var33 = ((lk) this).field_r.a(15142, param1);
          var28 = var33;
          var23 = var28;
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (param0 == -29116) {
            break L0;
          } else {
            lk.b(-110);
            break L0;
          }
        }
        L1: {
          if (!((lk) this).field_r.field_b) {
            break L1;
          } else {
            var32 = ((lk) this).c(24066, param1, 0);
            var34 = var32[0];
            var36 = var32[1];
            var35 = var32[2];
            var8 = var33[0];
            var9 = var33[1];
            var10 = var33[2];
            var11 = 0;
            L2: while (true) {
              if (ci.field_c <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var14 == var13) {
                      var8[var11] = var12 * ((lk) this).field_s >> 12;
                      var9[var11] = var13 * ((lk) this).field_u >> 12;
                      var10[var11] = ((lk) this).field_w * var14 >> 12;
                      var11++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8[var11] = ((lk) this).field_s;
                var9[var11] = ((lk) this).field_u;
                var10[var11] = ((lk) this).field_w;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            lk.b(60);
        }
        field_t = null;
        field_v = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (1 != var4_int) {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    ((lk) this).field_w = param0.i(param1 ^ 7059);
                    break L1;
                  }
                } else {
                  ((lk) this).field_u = param0.i(7088);
                  break L1;
                }
              } else {
                ((lk) this).field_s = param0.i(7088);
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                int discarded$1 = lk.a('ﾻ', -28);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("lk.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(char param0, int param1) {
        if (param1 != 97) {
            return -54;
        }
        if (param0 >= 48) {
            if (57 >= param0) {
                return param0 - 48;
            }
        }
        if (param0 >= 97) {
            if (param0 <= 122) {
                return 10 - (97 + -param0);
            }
        }
        if (65 <= param0) {
            if (param0 <= 90) {
                return param0 - 29;
            }
        }
        return param0 != 43 ? 63 : 62;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new byte[50][];
    }
}
