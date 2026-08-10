/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    private rb field_b;
    private gp field_h;
    static eg field_e;
    private java.math.BigInteger field_c;
    private un field_a;
    private java.math.BigInteger field_f;
    private fg[] field_g;
    static String field_i;
    private dk field_d;

    public static void b(int param0) {
        if (param0 != -14991) {
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static el a(wl param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte[] param7) {
        RuntimeException var8 = null;
        el stackIn_8_0 = null;
        el stackIn_10_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 == 9980) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0.field_Cc) {
                break L2;
              } else {
                L3: {
                  if (!mg.a(param1, (byte) -26)) {
                    break L3;
                  } else {
                    if (mg.a(param2, (byte) 124)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param0.field_u) {
                  stackIn_10_0 = new el(param0, 34037, param4, param1, param2, param3, param7, param5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = new el(param0, param4, param1, param2, fk.a(param1, 87), fk.a(param2, 61), param7, param5);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_12_0 = new el(param0, 3553, param4, param1, param2, param3, param7, param5);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("wq.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (null == this.field_g) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_g.length <= var2) {
              L1: {
                if (param0 >= 65) {
                  break L1;
                } else {
                  this.field_g = (fg[]) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_g.length) {
                  return;
                } else {
                  if (null != this.field_g[var2]) {
                    this.field_g[var2].a((byte) 89);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != this.field_g[var2]) {
                this.field_g[var2].b(-20254);
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

    wq(un param0, dk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final fg a(byte param0, bl param1, bl param2, boolean param3, int param4) {
        fg stackIn_8_0 = null;
        fg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        fg var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            if (this.field_b != null) {
              L1: {
                var6_int = -115 % ((param0 - 8) / 42);
                if ((param4 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_g.length > param4) {
                    if (this.field_g[param4] == null) {
                      this.field_b.field_g = 6 + param4 * 72;
                      var7 = this.field_b.a((byte) 122);
                      var8 = this.field_b.a((byte) 125);
                      var14 = new byte[64];
                      this.field_b.a(0, 7186, 64, var14);
                      var10 = new fg(param4, param2, param1, this.field_a, this.field_d, var7, var14, var8, param3);
                      this.field_g[param4] = var10;
                      stackIn_10_0 = (fg) (var10);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_g[param4];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("wq.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        rb var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (null == this.field_b) {
          L0: {
            if (this.field_h == null) {
              if (!this.field_a.a(false)) {
                this.field_h = this.field_a.a(255, 255, -21, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_h.field_p) {
            L1: {
              var10 = new rb(this.field_h.a(true));
              var10.field_g = 5;
              if (param0 > 2) {
                break L1;
              } else {
                this.a(115);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = var10.g(-52);
                var10.field_g = var10.field_g + 72 * var3;
                var13 = new byte[var10.field_f.length - var10.field_g];
                var11 = var13;
                var4 = var11;
                var10.a(0, 7186, var13.length, var13);
                if (null == this.field_f) {
                  break L3;
                } else {
                  if (null == this.field_c) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_f, this.field_c);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if ((var5.length ^ -1) == -66) {
              var15 = qm.a(0, var10.field_g + -var13.length + -5, var10.field_f, 5);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  this.field_g = new fg[var3];
                  this.field_b = var10;
                  return true;
                } else {
                  if (var15[var7] == var5[var7 + 1]) {
                    var7++;
                    continue L4;
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

    private wq(un param0, dk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_d = param1;
            this.field_a = param0;
            this.field_f = param2;
            this.field_c = param3;
            if (!this.field_a.a(false)) {
                this.field_h = this.field_a.a(255, 255, -21, true, (byte) 0);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "arcade";
        field_e = new eg();
    }
}
