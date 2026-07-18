/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static hk field_b;
    static String field_d;
    static sg field_c;
    static kg field_a;

    final static int a(int[] param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0[0] != 0) {
                if (param0[0] != 55) {
                  if (param0[0] == 57) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 1;
                stackIn_9_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_9_0;
              if (var3_int == 0) {
                break L2;
              } else {
                var11 = nl.a(param0[0], (byte) 124);
                if (var11.length == param0.length) {
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= param0.length) {
                      break L2;
                    } else {
                      if (param0[var5] == var11[var5]) {
                        var5++;
                        continue L3;
                      } else {
                        var3_int = 0;
                        break L2;
                      }
                    }
                  }
                } else {
                  var3_int = 0;
                  break L2;
                }
              }
            }
            L4: {
              int discarded$1 = 78;
              var4 = nn.a(param0);
              if (param2 == 44) {
                break L4;
              } else {
                field_a = null;
                break L4;
              }
            }
            L5: {
              if (var4 > 6100) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L5;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L5;
              }
            }
            L6: {
              var5 = stackIn_22_0;
              var6 = 4;
              if (var3_int != 0) {
                var6 = var6 | 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var5 == 0) {
                break L7;
              } else {
                var6 = var6 | 2;
                break L7;
              }
            }
            stackOut_27_0 = var6;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("nf.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 55) {
            nf.a(-99);
        }
    }

    final static void a(boolean param0, gi param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var7_int = me.a(param4, -97);
              if (null == hb.field_c) {
                hb.field_c = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var16 = new int[4];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var8 = var13;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (hj.field_H == null) {
                      break L4;
                    } else {
                      if (hj.field_H.field_t.length < var7_int) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  hj.field_H = new gi(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    hj.field_H.field_p = 0;
                    hj.field_H.a(param4, (byte) -122, param3, param6);
                    hj.field_H.b(-2, var7_int);
                    hj.field_H.a(var16, -108);
                    if (sj.field_u == null) {
                      break L6;
                    } else {
                      if (sj.field_u.field_t.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  sj.field_u = new gi(100);
                  break L5;
                }
                L7: {
                  sj.field_u.field_p = 0;
                  sj.field_u.a((byte) 122, 10);
                  var12 = 0;
                  var9 = var12;
                  if (!param0) {
                    break L7;
                  } else {
                    var11 = null;
                    nf.a(true, (gi) null, (java.math.BigInteger) null, -45, 111, (java.math.BigInteger) null, (byte[]) null);
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var12 >= 4) {
                    sj.field_u.d(param4, 17);
                    sj.field_u.a(param2, param5, -10048);
                    param1.a(sj.field_u.field_p, (byte) -122, 0, sj.field_u.field_t);
                    param1.a(hj.field_H.field_p, (byte) -122, 0, hj.field_H.field_t);
                    break L0;
                  } else {
                    sj.field_u.b(true, var16[var12]);
                    var12++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = hb.field_c.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("nf.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param6 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Solicitation";
    }
}
