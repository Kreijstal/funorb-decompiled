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
        if (param0 != 5) {
            String var2 = (String) null;
            kr.a((String) null, (byte) 54);
        }
        field_g = null;
    }

    final void d(int param0) {
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (this.field_b == null) {
          return;
        } else {
          if (param0 > 33) {
            var2 = 0;
            L0: while (true) {
              if (this.field_b.length <= var2) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_b.length) {
                    return;
                  } else {
                    if (null != this.field_b[var2]) {
                      this.field_b[var2].b(104);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (this.field_b[var2] != null) {
                  this.field_b[var2].c((byte) -94);
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
        uk stackIn_10_0 = null;
        uk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        uk var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (null == this.field_d) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param3 < this.field_b.length) {
                    if (null != this.field_b[param3]) {
                      stackIn_10_0 = this.field_b[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_d.field_u = param3 * 72 - -6;
                        var6_int = this.field_d.b(true);
                        var7 = this.field_d.b(true);
                        var13 = new byte[64];
                        this.field_d.a(0, var13, 64, 67);
                        var9 = new uk(param3, param4, param1, this.field_f, this.field_a, var6_int, var13, var7, param2);
                        if (param0 == 18162) {
                          break L2;
                        } else {
                          kr.a((byte) -3);
                          break L2;
                        }
                      }
                      this.field_b[param3] = var9;
                      stackIn_14_0 = (uk) (var9);
                      decompiledRegionSelector0 = 1;
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
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("kr.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static void a(String param0, byte param1) {
        an.a(1, param0);
        if (param1 > -3) {
            return;
        }
        try {
            fi.a(31820, false, gn.field_a);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "kr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            kr.a((byte) 26);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_f = param0;
              this.field_i = param2;
              this.field_a = param1;
              this.field_h = param3;
              if (this.field_f.a(20)) {
                break L1;
              } else {
                this.field_e = this.field_f.a(255, 255, true, (byte) 0, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("kr.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final boolean b(int param0) {
        int var3;
        byte[] var4;
        int var5;
        byte[] var6;
        java.math.BigInteger var8_ref_java_math_BigInteger;
        int var8;
        int var9;
        ed var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (this.field_d == null) {
          L0: {
            if (null != this.field_e) {
              break L0;
            } else {
              if (this.field_f.a(20)) {
                return false;
              } else {
                this.field_e = this.field_f.a(255, 255, true, (byte) 0, false);
                break L0;
              }
            }
          }
          if (!this.field_e.field_z) {
            L1: {
              L2: {
                var11 = new ed(this.field_e.a((byte) -106));
                var11.field_u = 5;
                var3 = var11.h(-11);
                var11.field_u = var11.field_u + var3 * 72;
                var5 = 13 % ((-4 - param0) / 48);
                var14 = new byte[var11.field_p.length + -var11.field_u];
                var12 = var14;
                var4 = var12;
                var11.a(0, var4, var14.length, 61);
                if (null == this.field_i) {
                  break L2;
                } else {
                  if (null == this.field_h) {
                    break L2;
                  } else {
                    var13 = new java.math.BigInteger(var14);
                    var8_ref_java_math_BigInteger = var13.modPow(this.field_i, this.field_h);
                    var6 = var8_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var6 = var4;
              break L1;
            }
            if (var6.length == 65) {
              var16 = de.a(5, (byte) -110, var11.field_u - var14.length + -5, var11.field_p);
              var8 = 0;
              L3: while (true) {
                if (var8 >= 64) {
                  this.field_d = var11;
                  this.field_b = new uk[var3];
                  return true;
                } else {
                  if (var6[var8 + 1] == var16[var8]) {
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
