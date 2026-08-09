/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private java.math.BigInteger field_a;
    private gj field_j;
    private na field_k;
    static de field_l;
    private ch field_b;
    static int field_f;
    private pb field_e;
    private uc[] field_h;
    private java.math.BigInteger field_g;
    static int[] field_i;
    static int field_d;
    static ef field_c;

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        pb var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Main.field_T;
        if (null != this.field_e) {
          return true;
        } else {
          L0: {
            if (this.field_k == null) {
              if (!this.field_b.a(false)) {
                this.field_k = this.field_b.a(true, -1640279264, 255, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (this.field_k.field_n) {
            return false;
          } else {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                this.field_j = (gj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = new pb(this.field_k.b(true));
                var10.field_i = 5;
                var3 = var10.f(56);
                var10.field_i = var10.field_i + var3 * 72;
                var13 = new byte[-var10.field_i + var10.field_g.length];
                var11 = var13;
                var4 = var11;
                var10.a(57, var4, 0, var13.length);
                if (this.field_a == null) {
                  break L3;
                } else {
                  if (this.field_g == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_a, this.field_g);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var15 = ti.a(5, var10.field_g, var10.field_i + -var13.length + -5, 0);
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  this.field_h = new uc[var3];
                  this.field_e = var10;
                  return true;
                } else {
                  if (var5[1 + var7] == var15[var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          }
        }
    }

    final uc a(int param0, int param1, boolean param2, hc param3, hc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        uc var9 = null;
        byte[] var13 = null;
        uc stackIn_9_0 = null;
        uc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != this.field_e) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= this.field_h.length) {
                    break L1;
                  } else {
                    if (null != this.field_h[param0]) {
                      stackIn_9_0 = this.field_h[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_e.field_i = param1 * param0 - -6;
                      var6_int = this.field_e.e((byte) 127);
                      var7 = this.field_e.e((byte) 125);
                      var13 = new byte[64];
                      this.field_e.a(63, var13, 0, 64);
                      var9 = new uc(param0, param4, param3, this.field_b, this.field_j, var6_int, var13, var7, param2);
                      this.field_h[param0] = var9;
                      stackIn_11_0 = (uc) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("eb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static nc a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        nc stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var2_int <= var3) {
                L2: {
                  if (param0 == -3124) {
                    break L2;
                  } else {
                    eb.a(false);
                    break L2;
                  }
                }
                stackIn_13_0 = ij.field_i;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("eb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nc) ((Object) stackIn_8_0);
        } else {
          return stackIn_13_0;
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (param0 <= -1) {
          if (null == this.field_h) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (var2 >= this.field_h.length) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_h.length) {
                    return;
                  } else {
                    if (null != this.field_h[var2]) {
                      this.field_h[var2].c(-3028);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != this.field_h[var2]) {
                  this.field_h[var2].c((byte) 118);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
        if (!param0) {
            field_i = (int[]) null;
        }
        field_c = null;
    }

    final static void a(le param0, int param1, int param2, String param3, int param4, byte param5, int param6, int param7, int param8) {
        try {
            cc.field_c = param4;
            al.field_c = param3;
            eh.field_l = param2;
            bi.field_b = param0;
            oj.field_d = param1;
            ak.field_O = param8;
            pf.field_h = param6;
            ej.field_kb = param7;
            if (param5 > -52) {
                eb.a(true);
            }
            dg.field_H = (ch) ((Object) new a());
            sc.field_b = new gj(param0);
            ja.field_b = new eb(dg.field_H, sc.field_b);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "eb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private eb(ch param0, gj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private eb(ch param0, gj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_a = param2;
              this.field_b = param0;
              this.field_g = param3;
              this.field_j = param1;
              if (this.field_b.a(false)) {
                break L1;
              } else {
                this.field_k = this.field_b.a(true, -1640279264, 255, (byte) 0, 255);
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

            stackIn_6_1 = new StringBuilder().append("eb.<init>(");

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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_i = new int[]{1, 1, 2, 3, 5, 2, 3, 5, 1, 2, 3, 5, 2, 2, 3};
        field_l = new de(1, 2, 2, 0);
    }
}
