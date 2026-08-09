/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static int field_e;
    private be field_i;
    private sd field_f;
    private gd[] field_g;
    private ae field_a;
    static String field_h;
    private java.math.BigInteger field_b;
    private hi field_c;
    private java.math.BigInteger field_d;

    final static void b(int param0) {
        if (param0 <= 113) {
            field_h = (String) null;
        }
        wb var2 = (wb) null;
        rg.a((wb) null, 14915);
    }

    final void a(byte param0) {
        int var2;
        int var3;
        gd stackIn_13_0 = null;
        var3 = TrackController.field_F ? 1 : 0;
        if (null != this.field_g) {
          var2 = 0;
          L0: while (true) {
            if (this.field_g.length <= var2) {
              L1: {
                if (param0 == 95) {
                  break L1;
                } else {
                  this.a((byte) -54);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_g.length) {
                  return;
                } else {
                  stackIn_13_0 = this.field_g[var2];
                  if (stackIn_13_0 != null) {
                    this.field_g[var2].b(false);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_g[var2] != null) {
                this.field_g[var2].a((byte) -41);
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

    wg(ae param0, sd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1) {
        nk.a(false, 40, param1);
        if (param0 >= -99) {
            wg.a(-69, false);
        }
    }

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        be var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = TrackController.field_F ? 1 : 0;
        if (null == this.field_i) {
          L0: {
            if (null == this.field_c) {
              if (!this.field_a.d(-18316)) {
                this.field_c = this.field_a.a(255, true, false, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (this.field_c.field_w) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new be(this.field_c.g(512));
                var10.field_k = 5;
                var3 = var10.h(16383);
                var10.field_k = var10.field_k + 72 * var3;
                var13 = new byte[-var10.field_k + var10.field_j.length];
                var11 = var13;
                var4 = var11;
                var10.a(122, var4, 0, var13.length);
                if (this.field_d == null) {
                  break L2;
                } else {
                  if (this.field_b == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_d, this.field_b);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (65 == var5.length) {
              L3: {
                var15 = cf.a(5, var10.field_j, -5 + var10.field_k - var13.length, -6196);
                if (param0 <= -62) {
                  break L3;
                } else {
                  this.a((byte) -115);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  this.field_i = var10;
                  this.field_g = new gd[var3];
                  return true;
                } else {
                  if (var15[var7] == var5[var7 - -1]) {
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
          }
        } else {
          return true;
        }
    }

    public static void c(int param0) {
        if (param0 != 6883) {
            wg.b(-95);
        }
        field_h = null;
    }

    final static nj a(byte param0, int param1, String param2) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        nj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new nj(false);
            var3.field_b = param1;
            var4 = 109 / ((param0 - -54) / 61);
            var3.field_c = param2;
            stackIn_1_0 = (nj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private wg(ae param0, sd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_f = param1;
              this.field_b = param3;
              this.field_a = param0;
              this.field_d = param2;
              if (this.field_a.d(-18316)) {
                break L1;
              } else {
                this.field_c = this.field_a.a(255, true, false, 255, (byte) 0);
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

            stackIn_6_1 = new StringBuilder().append("wg.<init>(");

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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final gd a(int param0, int param1, hf param2, boolean param3, hf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gd var9 = null;
        byte[] var13 = null;
        gd stackIn_8_0 = null;
        gd stackIn_12_0 = null;
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
            if (null != this.field_i) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 >= this.field_g.length) {
                    break L1;
                  } else {
                    if (this.field_g[param1] == null) {
                      L2: {
                        this.field_i.field_k = param1 * 72 + 6;
                        var6_int = this.field_i.e((byte) 113);
                        if (param0 >= 67) {
                          break L2;
                        } else {
                          field_h = (String) null;
                          break L2;
                        }
                      }
                      var7 = this.field_i.e((byte) 113);
                      var13 = new byte[64];
                      this.field_i.a(102, var13, 0, 64);
                      var9 = new gd(param1, param4, param2, this.field_a, this.field_f, var6_int, var13, var7, param3);
                      this.field_g[param1] = var9;
                      stackIn_12_0 = (gd) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_g[param1];
                      decompiledRegionSelector0 = 0;
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
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("wg.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_e = 0;
        field_h = "Play free version";
    }
}
