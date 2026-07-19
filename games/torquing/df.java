/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fj {
    static int field_u;
    static ha field_q;
    private gn field_t;
    private int field_s;
    static cd field_r;
    static String field_p;

    final void a(byte param0, int[] param1) {
        RuntimeException runtimeException = null;
        byte[] var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_t = new gn(param1);
              if (param0 < -110) {
                break L1;
              } else {
                var4 = (byte[]) null;
                this.b(42, -84, (byte[]) null, 89);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("df.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 3) {
            return;
        }
        field_r = null;
        field_p = null;
        field_q = null;
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_j[fieldTemp$0] = (byte)(this.field_t.b((byte) -103) + param1);
        int var3 = -58 / ((param0 - 23) / 48);
    }

    final int a(boolean param0) {
        int fieldTemp$2 = 0;
        if (!param0) {
          return -70;
        } else {
          fieldTemp$2 = this.field_n;
          this.field_n = this.field_n + 1;
          return 255 & this.field_j[fieldTemp$2] - this.field_t.b((byte) -103);
        }
    }

    df(byte[] param0) {
        super(param0);
    }

    final static void a(float param0, int param1, String param2) {
        try {
            aj.field_E = param0;
            ob.field_b = param2;
            int var3_int = -112 % ((-29 - param1) / 32);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "df.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void j(byte param0) {
        this.field_s = this.field_n * 8;
        if (param0 > -1) {
            field_p = (String) null;
        }
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = Torquing.field_u;
        int var3 = this.field_s >> 1185944515;
        int var4 = -(7 & this.field_s) + 8;
        int var5 = 0;
        this.field_s = this.field_s + param0;
        while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((la.field_h[var4] & this.field_j[incrementValue$0]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        int var6 = -111 % ((param1 - -4) / 53);
        if (param0 != var4) {
            var5 = var5 + (this.field_j[var3] >> -param0 + var4 & la.field_h[param0]);
        } else {
            var5 = var5 + (this.field_j[var3] & la.field_h[var4]);
        }
        return var5;
    }

    df(int param0) {
        super(param0);
    }

    final static boolean a(df param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -23) {
                break L1;
              } else {
                field_u = -22;
                break L1;
              }
            }
            L2: {
              if (1 != param0.e(1, 99)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("df.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                this.field_t = (gn) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_n;
                this.field_n = this.field_n + 1;
                param2[var5_int - -param0] = (byte)(this.field_j[fieldTemp$5] + -this.field_t.b((byte) -103));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("df.C(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param2 == 26905) {
                break L1;
              } else {
                df.a(0, -73, 61, -97, -92, -87, 106, -79, 59, 91);
                break L1;
              }
            }
            L2: {
              if (param3 != param4) {
                break L2;
              } else {
                if (param5 != param8) {
                  break L2;
                } else {
                  if (param6 != param9) {
                    break L2;
                  } else {
                    if (param1 == param0) {
                      oh.a(param3, param5, param1, (byte) -128, param9, param7);
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            var10_int = param3;
            var11 = param5;
            var12 = 3 * param3;
            var13 = 3 * param5;
            var14 = 3 * param4;
            var15 = 3 * param8;
            var16 = 3 * param6;
            var17 = 3 * param0;
            var18 = param9 + (-var16 - (-var14 - -param3));
            var19 = -var17 + (param1 + var15 + -param5);
            var20 = var12 + (-var14 + var16 + -var14);
            var21 = var13 + (var17 + -var15) + -var15;
            var22 = -var12 + var14;
            var23 = -var13 + var15;
            var24 = 128;
            L3: while (true) {
              if (4096 < var24) {
                break L0;
              } else {
                var25 = var24 * var24 >> 1273181388;
                var26 = var24 * var25 >> 2007909612;
                var27 = var18 * var26;
                var28 = var19 * var26;
                var29 = var20 * var25;
                var30 = var21 * var25;
                var31 = var22 * var24;
                var32 = var24 * var23;
                var33 = param3 - -(var27 + (var29 + var31) >> -749075572);
                var34 = (var30 + var28 - -var32 >> 299422732) + param5;
                oh.a(var10_int, var11, var34, (byte) -128, var33, param7);
                var11 = var34;
                var10_int = var33;
                var24 += 128;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var10), "df.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void j(int param0) {
        if (param0 > -126) {
          field_r = (cd) null;
          this.field_n = (7 + this.field_s) / 8;
          return;
        } else {
          this.field_n = (7 + this.field_s) / 8;
          return;
        }
    }

    final static void a(int param0, double[] param1) {
        RuntimeException runtimeException = null;
        double var2_double = 0.0;
        double var4 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_double = ap.a(param1, 10, param1, 10);
            if (param0 == 3) {
              L1: {
                if (var2_double <= 685.3891945200804) {
                  break L1;
                } else {
                  var4 = 26.17993877991468 / Math.sqrt(var2_double);
                  param1[10] = param1[10] * var4;
                  param1[12] = param1[12] * var4;
                  param1[11] = param1[11] * var4;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("df.G(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_u = 64;
        field_r = new cd();
        field_p = "Type your age in years";
    }
}
