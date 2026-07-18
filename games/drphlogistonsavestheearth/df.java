/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static q field_l;
    static vj field_a;
    static int field_h;
    private de[] field_e;
    static he[] field_f;
    static boolean field_o;
    static he[] field_k;
    private n field_d;
    private od field_c;
    private java.math.BigInteger field_n;
    private cm field_i;
    private gb field_j;
    static vj field_m;
    private java.math.BigInteger field_g;
    static String field_b;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == ((df) this).field_e) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((df) this).field_e.length <= var2) {
              L1: {
                if (param0 == 64) {
                  break L1;
                } else {
                  ((df) this).field_n = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (((df) this).field_e.length <= var4) {
                  return;
                } else {
                  if (((df) this).field_e[var4] != null) {
                    ((df) this).field_e[var4].c(97);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((df) this).field_e[var2]) {
                ((df) this).field_e[var2].a(false);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final de a(int param0, boolean param1, ik param2, ik param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        de var9 = null;
        byte[] var13 = null;
        de stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        de stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        de stackOut_9_0 = null;
        de stackOut_14_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (null == ((df) this).field_c) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= ((df) this).field_e.length) {
                    break L1;
                  } else {
                    if (((df) this).field_e[param0] != null) {
                      stackOut_9_0 = ((df) this).field_e[param0];
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      ((df) this).field_c.field_j = param0 * 72 - -6;
                      if (param4 >= 64) {
                        var6_int = ((df) this).field_c.h(-97);
                        var7 = ((df) this).field_c.h(9);
                        var13 = new byte[64];
                        ((df) this).field_c.b(0, 64, 128, var13);
                        var9 = new de(param0, param3, param2, ((df) this).field_j, ((df) this).field_d, var6_int, var13, var7, param1);
                        ((df) this).field_e[param0] = var9;
                        stackOut_14_0 = (de) var9;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        stackOut_12_0 = null;
                        stackIn_13_0 = stackOut_12_0;
                        return (de) (Object) stackIn_13_0;
                      }
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("df.B(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ')');
        }
        return stackIn_15_0;
    }

    df(gb param0, n param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0) {
        p.field_a.field_c = 0;
        p.field_a.field_h = 0;
        int var1 = 19 % ((54 - param0) / 39);
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        od var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((df) this).field_c != null) {
          return true;
        } else {
          L0: {
            if (((df) this).field_i != null) {
              break L0;
            } else {
              if (((df) this).field_j.a(true)) {
                return false;
              } else {
                ((df) this).field_i = ((df) this).field_j.a(255, 11259, (byte) 0, 255, true);
                break L0;
              }
            }
          }
          if (!((df) this).field_i.field_u) {
            L1: {
              L2: {
                var10 = new od(((df) this).field_i.i(13095));
                var10.field_j = 5;
                var3 = var10.l(31760);
                var10.field_j = var10.field_j + var3 * 72;
                var16 = new byte[-var10.field_j + var10.field_h.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.b(0, var16.length, 128, var16);
                if (null == ((df) this).field_n) {
                  break L2;
                } else {
                  if (((df) this).field_g != null) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((df) this).field_n, ((df) this).field_g);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            L3: {
              if (param0 == 64) {
                break L3;
              } else {
                field_f = null;
                break L3;
              }
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = b.a(5, 51, var10.field_h, -5 + var10.field_j + -var16.length);
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((df) this).field_e = new de[var3];
                  ((df) this).field_c = var10;
                  return true;
                } else {
                  if (var17[var7] != var5[1 + var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void c() {
        field_a = null;
        field_k = null;
        int var1 = 0;
        field_b = null;
        field_l = null;
        field_f = null;
        field_m = null;
    }

    private df(gb param0, n param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              ((df) this).field_j = param0;
              ((df) this).field_d = param1;
              ((df) this).field_g = param3;
              ((df) this).field_n = param2;
              if (((df) this).field_j.a(true)) {
                break L1;
              } else {
                ((df) this).field_i = ((df) this).field_j.a(255, 11259, (byte) 0, 255, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("df.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
