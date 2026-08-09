/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private ac field_b;
    private jp field_g;
    private co field_c;
    private java.math.BigInteger field_a;
    private gl[] field_f;
    private java.math.BigInteger field_j;
    static int field_d;
    static uc field_e;
    static ei field_l;
    private fj field_h;
    static String field_i;
    static int field_k;

    public static void a(int param0) {
        if (param0 != 21384) {
            field_i = (String) null;
        }
        field_i = null;
        field_e = null;
        field_l = null;
    }

    bo(jp param0, co param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        var3 = Torquing.field_u;
        if (this.field_f != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_f.length) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= this.field_f.length) {
                  return;
                } else {
                  if (this.field_f[var4] != null) {
                    this.field_f[var4].b(-1);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != this.field_f[var2]) {
                this.field_f[var2].c((byte) -94);
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

    final gl a(pb param0, byte param1, int param2, pb param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gl var9 = null;
        byte[] var13 = null;
        gl stackIn_9_0 = null;
        gl stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != this.field_h) {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 >= this.field_f.length) {
                    break L1;
                  } else {
                    if (this.field_f[param2] != null) {
                      stackIn_9_0 = this.field_f[param2];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_h.field_n = param2 * 72 - -6;
                        var6_int = this.field_h.c((byte) -127);
                        var7 = this.field_h.c((byte) -49);
                        var13 = new byte[64];
                        this.field_h.a(48, 64, var13, 0);
                        var9 = new gl(param2, param0, param3, this.field_g, this.field_c, var6_int, var13, var7, param4);
                        this.field_f[param2] = var9;
                        if (param1 == 101) {
                          break L2;
                        } else {
                          field_k = -42;
                          break L2;
                        }
                      }
                      stackIn_13_0 = (gl) (var9);
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("bo.B(");

            if (param0 == null) {
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
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        fj var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Torquing.field_u;
        if (null != this.field_h) {
          return true;
        } else {
          L0: {
            if (null == this.field_b) {
              if (this.field_g.a(20)) {
                return false;
              } else {
                this.field_b = this.field_g.a((byte) 0, 255, true, (byte) -51, 255);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_b.field_r) {
            L1: {
              var10 = new fj(this.field_b.c((byte) 119));
              if (param0 == -74) {
                break L1;
              } else {
                field_l = (ei) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var10.field_n = 5;
                var3 = var10.i((byte) -101);
                var10.field_n = var10.field_n + 72 * var3;
                var13 = new byte[-var10.field_n + var10.field_j.length];
                var11 = var13;
                var4 = var11;
                var10.a(48, var13.length, var13, 0);
                if (null == this.field_j) {
                  break L3;
                } else {
                  if (this.field_a == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var15 = np.a(5, var10.field_j, -5 + (var10.field_n + -var13.length), -81);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  this.field_f = new gl[var3];
                  this.field_h = var10;
                  return true;
                } else {
                  if (var5[var7 - -1] != var15[var7]) {
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

    private bo(jp param0, co param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_c = param1;
              this.field_a = param3;
              this.field_j = param2;
              this.field_g = param0;
              if (this.field_g.a(20)) {
                break L1;
              } else {
                this.field_b = this.field_g.a((byte) 0, 255, true, (byte) -51, 255);
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

            stackIn_6_1 = new StringBuilder().append("bo.<init>(");

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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_i = "Waiting for graphics";
        field_l = new ei();
    }
}
