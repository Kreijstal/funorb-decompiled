/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    private ce[] field_h;
    private java.math.BigInteger field_e;
    private v field_d;
    private wi field_f;
    static double field_c;
    private vi field_a;
    private lf field_g;
    private java.math.BigInteger field_b;

    final ce a(boolean param0, vh param1, vh param2, int param3, int param4) {
        ce stackIn_10_0 = null;
        ce stackIn_14_0 = null;
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
        ce var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_f == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (0 > param3) {
                  break L1;
                } else {
                  if (this.field_h.length <= param3) {
                    break L1;
                  } else {
                    if (null != this.field_h[param3]) {
                      stackIn_10_0 = this.field_h[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        if (param4 == -18023) {
                          break L2;
                        } else {
                          this.field_d = (v) null;
                          break L2;
                        }
                      }
                      this.field_f.field_h = 6 + 72 * param3;
                      var6_int = this.field_f.j(-3);
                      var7 = this.field_f.j(-3);
                      var13 = new byte[64];
                      this.field_f.a((byte) 125, 64, var13, 0);
                      var9 = new ce(param3, param1, param2, this.field_d, this.field_a, var6_int, var13, var7, param0);
                      this.field_h[param3] = var9;
                      stackIn_14_0 = (ce) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
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

            stackIn_17_1 = new StringBuilder().append("oj.B(").append(param0).append(',');

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


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        var3 = Bounce.field_N;
        if (this.field_h != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_h.length) {
              L1: {
                if (param0 == -16840) {
                  break L1;
                } else {
                  this.field_b = (java.math.BigInteger) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_h.length) {
                  return;
                } else {
                  if (null != this.field_h[var2]) {
                    this.field_h[var2].c(98);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != this.field_h[var2]) {
                this.field_h[var2].d(param0 + 19188);
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

    oj(v param0, vi param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(int param0) {
        int var2;
        wi var3;
        int var4;
        byte[] var5;
        byte[] var6;
        java.math.BigInteger var8_ref_java_math_BigInteger;
        int var8;
        int var9;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var9 = Bounce.field_N;
        var2 = 67 / ((-16 - param0) / 55);
        if (null == this.field_f) {
          L0: {
            if (this.field_g != null) {
              break L0;
            } else {
              if (!this.field_d.b(false)) {
                this.field_g = this.field_d.a(255, (byte) 0, -93, true, 255);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!this.field_g.field_n) {
            L1: {
              L2: {
                var3 = new wi(this.field_g.d((byte) -116));
                var3.field_h = 5;
                var4 = var3.d((byte) -119);
                var3.field_h = var3.field_h + 72 * var4;
                var13 = new byte[var3.field_i.length + -var3.field_h];
                var11 = var13;
                var5 = var11;
                var3.a((byte) 126, var13.length, var13, 0);
                if (null == this.field_e) {
                  break L2;
                } else {
                  if (null == this.field_b) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var8_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_b);
                    var6 = var8_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var6 = var5;
              break L1;
            }
            if (var6.length == 65) {
              var15 = jd.a(var3.field_i, 5, -5 + (var3.field_h - var13.length), 0);
              var8 = 0;
              L3: while (true) {
                if (var8 >= 64) {
                  this.field_h = new ce[var4];
                  this.field_f = var3;
                  return true;
                } else {
                  if (var15[var8] == var6[var8 - -1]) {
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

    final static int a(kk param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 15 % ((param1 - -69) / 48);
            stackIn_1_0 = param0.a(-1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("oj.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private oj(v param0, vi param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_a = param1;
              this.field_d = param0;
              this.field_e = param2;
              this.field_b = param3;
              if (this.field_d.b(false)) {
                break L1;
              } else {
                this.field_g = this.field_d.a(255, (byte) 0, 112, true, 255);
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

            stackIn_6_1 = new StringBuilder().append("oj.<init>(");

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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_c = 0.0;
    }
}
