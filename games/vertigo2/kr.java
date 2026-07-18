/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    private ed field_d;
    private java.math.BigInteger field_i;
    private uk[] field_b;
    private t field_a;
    static jj field_g;
    private ia field_e;
    private tk field_f;
    static byte[] field_c;
    private java.math.BigInteger field_h;

    public static void c(int param0) {
        field_c = null;
        field_g = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (((kr) this).field_b == null) {
          return;
        } else {
          if (param0 > 33) {
            var2 = 0;
            L0: while (true) {
              if (((kr) this).field_b.length <= var2) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((kr) this).field_b.length) {
                    return;
                  } else {
                    if (null != ((kr) this).field_b[var4]) {
                      ((kr) this).field_b[var4].b(104);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (((kr) this).field_b[var2] != null) {
                  ((kr) this).field_b[var2].c((byte) -94);
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
    }

    final uk a(int param0, qh param1, boolean param2, int param3, qh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        uk var9 = null;
        byte[] var13 = null;
        uk stackIn_10_0 = null;
        uk stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        uk stackOut_9_0 = null;
        uk stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (null == ((kr) this).field_d) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (param3 < ((kr) this).field_b.length) {
                    if (null != ((kr) this).field_b[param3]) {
                      stackOut_9_0 = ((kr) this).field_b[param3];
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      L2: {
                        ((kr) this).field_d.field_u = param3 * 72 - -6;
                        var6_int = ((kr) this).field_d.b(true);
                        var7 = ((kr) this).field_d.b(true);
                        var13 = new byte[64];
                        ((kr) this).field_d.a(0, var13, 64, 67);
                        var9 = new uk(param3, param4, param1, ((kr) this).field_f, ((kr) this).field_a, var6_int, var13, var7, param2);
                        if (param0 == 18162) {
                          break L2;
                        } else {
                          u[] discarded$1 = kr.a((byte) -3);
                          break L2;
                        }
                      }
                      ((kr) this).field_b[param3] = var9;
                      stackOut_13_0 = (uk) var9;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("kr.F(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(String param0, byte param1) {
        an.a(1, param0);
        try {
            fi.a(31820, false, gn.field_a);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "kr.A(" + (param0 != null ? "{...}" : "null") + ',' + -70 + ')');
        }
    }

    final static u[] a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        u[] var1 = new u[eo.field_m];
        for (var2 = 0; eo.field_m > var2; var2++) {
            var1[var2] = new u(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], se.field_y[var2], in.field_c);
        }
        la.a((byte) 17);
        if (param0 >= -19) {
            u[] discarded$0 = kr.a((byte) 26);
        }
        return var1;
    }

    final static void a(int param0) {
        kd.field_x = va.field_s.a(1, sl.field_q[20]);
        int var1 = va.field_s.a(1, sl.field_q[21]);
        if (!(kd.field_x >= var1)) {
            kd.field_x = var1;
        }
        if (param0 != -3645) {
            kr.a(85);
        }
    }

    kr(tk param0, t param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private kr(tk param0, t param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              ((kr) this).field_f = param0;
              ((kr) this).field_i = param2;
              ((kr) this).field_a = param1;
              ((kr) this).field_h = param3;
              if (((kr) this).field_f.a(20)) {
                break L1;
              } else {
                ((kr) this).field_e = ((kr) this).field_f.a(255, 255, true, (byte) 0, false);
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
            stackOut_4_1 = new StringBuilder().append("kr.<init>(");
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
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        java.math.BigInteger var8_ref_java_math_BigInteger = null;
        int var8 = 0;
        int var9 = 0;
        ed var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (((kr) this).field_d == null) {
          L0: {
            if (null != ((kr) this).field_e) {
              break L0;
            } else {
              if (((kr) this).field_f.a(20)) {
                return false;
              } else {
                ((kr) this).field_e = ((kr) this).field_f.a(255, 255, true, (byte) 0, false);
                break L0;
              }
            }
          }
          if (!((kr) this).field_e.field_z) {
            L1: {
              L2: {
                var11 = new ed(((kr) this).field_e.a((byte) -106));
                var11.field_u = 5;
                var3 = var11.h(-11);
                var11.field_u = var11.field_u + var3 * 72;
                var5 = 13 % ((-4 - param0) / 48);
                var17 = new byte[var11.field_p.length + -var11.field_u];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(0, var4, var17.length, 61);
                if (null == ((kr) this).field_i) {
                  break L2;
                } else {
                  if (null == ((kr) this).field_h) {
                    break L2;
                  } else {
                    var13 = new java.math.BigInteger(var17);
                    var8_ref_java_math_BigInteger = var13.modPow(((kr) this).field_i, ((kr) this).field_h);
                    var6 = var8_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var6 = var4;
              break L1;
            }
            if (var6.length == 65) {
              var18 = de.a(5, (byte) -110, var11.field_u - var17.length + -5, var11.field_p);
              var8 = 0;
              L3: while (true) {
                if (var8 >= 64) {
                  ((kr) this).field_d = var11;
                  ((kr) this).field_b = new uk[var3];
                  return true;
                } else {
                  if (var6[var8 + 1] == var18[var8]) {
                    var8++;
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

    static {
    }
}
