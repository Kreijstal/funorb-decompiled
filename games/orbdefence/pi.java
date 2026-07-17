/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static uh field_j;
    private cd field_i;
    private mg field_f;
    private ge field_h;
    private java.math.BigInteger field_a;
    private java.math.BigInteger field_e;
    static String field_g;
    static String field_c;
    private vl field_d;
    private ak[] field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (!param0) {
            pi.a(true);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        mg var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (null == ((pi) this).field_f) {
          L0: {
            if (((pi) this).field_i != null) {
              break L0;
            } else {
              if (!((pi) this).field_h.d(-114)) {
                ((pi) this).field_i = ((pi) this).field_h.a(15937, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((pi) this).field_i.field_l) {
            L1: {
              L2: {
                var10 = new mg(((pi) this).field_i.f(0));
                var10.field_i = 5;
                var3 = var10.b((byte) 90);
                var10.field_i = var10.field_i + var3 * 72;
                var16 = new byte[var10.field_j.length + -var10.field_i];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a((byte) 126, var4, 0, var16.length);
                if (((pi) this).field_e == null) {
                  break L2;
                } else {
                  if (((pi) this).field_a == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((pi) this).field_e, ((pi) this).field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              var17 = ee.a(-1, -var16.length + (var10.field_i + -5), 5, var10.field_j);
              var7 = param0;
              L3: while (true) {
                if (var7 >= 64) {
                  ((pi) this).field_f = var10;
                  ((pi) this).field_b = new ak[var3];
                  return true;
                } else {
                  if (var17[var7] == var5[var7 - -1]) {
                    var7++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    pi(ge param0, vl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final ak a(boolean param0, int param1, boolean param2, eh param3, eh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ak var9 = null;
        byte[] var13 = null;
        ak stackIn_8_0 = null;
        ak stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_11_0 = null;
        ak stackOut_7_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (null != ((pi) this).field_f) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 >= ((pi) this).field_b.length) {
                    break L1;
                  } else {
                    if (null == ((pi) this).field_b[param1]) {
                      L2: {
                        ((pi) this).field_f.field_i = 6 + param1 * 72;
                        var6_int = ((pi) this).field_f.l(0);
                        var7 = ((pi) this).field_f.l(0);
                        if (!param2) {
                          break L2;
                        } else {
                          ((pi) this).field_f = null;
                          break L2;
                        }
                      }
                      var13 = new byte[64];
                      ((pi) this).field_f.a((byte) 123, var13, 0, 64);
                      var9 = new ak(param1, param4, param3, ((pi) this).field_h, ((pi) this).field_d, var6_int, var13, var7, param0);
                      ((pi) this).field_b[param1] = var9;
                      stackOut_11_0 = (ak) var9;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_7_0 = ((pi) this).field_b[param1];
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("pi.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null != ((pi) this).field_b) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((pi) this).field_b.length) {
              var4 = param0;
              var2 = var4;
              L1: while (true) {
                if (var4 >= ((pi) this).field_b.length) {
                  return;
                } else {
                  if (((pi) this).field_b[var4] != null) {
                    ((pi) this).field_b[var4].a(true);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((pi) this).field_b[var2]) {
                ((pi) this).field_b[var2].e((byte) 57);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        lc.field_r = 1;
        dm.field_a = param2;
        da.field_B = param0;
    }

    private pi(ge param0, vl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              ((pi) this).field_h = param0;
              ((pi) this).field_e = param2;
              ((pi) this).field_a = param3;
              ((pi) this).field_d = param1;
              if (((pi) this).field_h.d(-92)) {
                break L1;
              } else {
                ((pi) this).field_i = ((pi) this).field_h.a(15937, 255, true, 255, (byte) 0);
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
            stackOut_4_1 = new StringBuilder().append("pi.<init>(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Checking";
        field_c = "Age:";
    }
}
