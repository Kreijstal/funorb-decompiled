/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static hk field_b;
    static String field_d;
    static sg field_c;
    static kg field_a;

    final static int a(int[] param0, int param1, byte param2) {
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (-1 != (param0[0] ^ -1)) {
                if (param0[0] != 55) {
                  if ((param0[0] ^ -1) == -58) {
                    stackIn_9_0 = 1;
                    break L1;
                  } else {
                    stackIn_9_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_9_0 = 1;
                  break L1;
                }
              } else {
                stackIn_9_0 = 1;
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
              var4 = nn.a(param0, (byte) 78);
              if (param2 == 44) {
                break L4;
              } else {
                field_a = (kg) null;
                break L4;
              }
            }
            L5: {
              if (-6101 > (var4 ^ -1)) {
                stackIn_22_0 = 0;
                break L5;
              } else {
                stackIn_22_0 = 1;
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
            stackIn_28_0 = var6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("nf.C(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
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
            var14 = new int[4];
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
                    hj.field_H.a(var14, -108);
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
                    var11 = (byte[]) null;
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
                    sj.field_u.b(true, var14[var12]);
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
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("nf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    static {
        field_d = "Solicitation";
    }
}
