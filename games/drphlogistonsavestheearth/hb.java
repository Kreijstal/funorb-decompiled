/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb implements cg {
    private int field_h;
    private int field_e;
    private int field_l;
    private int field_i;
    static int field_g;
    private int field_p;
    static nh field_a;
    private int field_c;
    private int field_d;
    private int field_o;
    private int field_k;
    static String field_b;
    private int field_n;
    static String field_m;
    private rf field_f;
    static int field_q;
    private int field_j;

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        vg stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nc var11 = null;
        try {
          L0: {
            L1: {
              if (param2 instanceof nc) {
                stackIn_3_0 = (vg) (param2);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var11 = (nc) ((Object) stackIn_3_0);
              if (var11 != null) {
                param0 = param0 & var11.field_E;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              wj.f(param2.field_o + param4, param3 - -param2.field_m, param2.field_w, param2.field_k, this.field_p);
              var8 = this.field_h + (param4 - -param2.field_o);
              var9 = this.field_o + (param2.field_m + param3);
              wj.b(var8, var9, this.field_e, this.field_k, 5592405);
              wj.f(var8, var9, this.field_e, this.field_k, var7);
              if (var11.field_A) {
                wj.g(var8, var9, var8 + this.field_e, var9 - -this.field_k, 1);
                wj.g(var8 - -this.field_e, var9, var8, var9 - -this.field_k, 1);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_f) {
                var10 = this.field_l + (this.field_e - -this.field_h);
                this.field_f.a(param2.field_p, var10 + (param4 - -param2.field_o), this.field_n + param3 - -param2.field_m, param2.field_w + -this.field_l + -var10, param2.field_k + -(this.field_l << -1477459871), this.field_i, this.field_c, this.field_j, this.field_d, 0);
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 > 94) {
              break L0;
            } else {
              this.field_i = -108;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("hb.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -27 / ((-26 - param0) / 63);
        field_m = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte[] param0, java.math.BigInteger param1, java.math.BigInteger param2, byte param3, int param4, int param5, od param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = eg.a(-17077, param4);
              if (null != wb.field_c) {
                break L1;
              } else {
                wb.field_c = new java.security.SecureRandom();
                break L1;
              }
            }
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (null == li.field_h) {
                      break L4;
                    } else {
                      if (var7_int > li.field_h.field_h.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  li.field_h = new od(var7_int);
                  break L3;
                }
                L5: {
                  li.field_h.field_j = 0;
                  li.field_h.a(param4, param5, 29211, param0);
                  li.field_h.a((byte) -39, var7_int);
                  if (param3 <= -25) {
                    break L5;
                  } else {
                    var11 = (java.awt.Canvas) null;
                    hb.a(120, (java.awt.Canvas) null);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    li.field_h.a(var14, 7221);
                    if (null == hm.field_e) {
                      break L7;
                    } else {
                      if ((hm.field_e.field_h.length ^ -1) <= -101) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  hm.field_e = new od(100);
                  break L6;
                }
                hm.field_e.field_j = 0;
                hm.field_e.c(10, (byte) -86);
                var12 = 0;
                var9 = var12;
                L8: while (true) {
                  if (-5 >= (var12 ^ -1)) {
                    hm.field_e.c(param4, -17402);
                    hm.field_e.a(param2, param1, 0);
                    param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                    param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                    break L0;
                  } else {
                    hm.field_e.a(var14[var12], (byte) -8);
                    var12++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = wb.field_c.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("hb.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            tb.a(param0 ^ 4, (java.awt.Component) ((Object) param1));
            pi.a((java.awt.Component) ((Object) param1), 1);
            if (param0 == -5) {
              L1: {
                if (sc.field_e == null) {
                  break L1;
                } else {
                  sc.field_e.a((java.awt.Component) ((Object) param1), (byte) 12);
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
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("hb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, String param1, int param2, String param3, int param4, String param5, boolean param6) {
        a var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        a var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = 85 % ((param0 - 53) / 54);
            var7 = new a(param5);
            var9 = new a(param3);
            stackIn_1_0 = pj.a(param1, param4, var9, var7, 0, param2, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("hb.B(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    hb(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_j = 1;
        try {
            this.field_e = param8;
            this.field_l = param1;
            this.field_h = param5;
            this.field_n = param2;
            this.field_i = param3;
            this.field_o = param6;
            this.field_f = param0;
            this.field_c = param4;
            this.field_k = param7;
            this.field_p = param9;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_m = "Hard";
    }
}
