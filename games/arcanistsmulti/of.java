/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of implements pf {
    private int field_g;
    private int field_i;
    private dj field_d;
    private int field_f;
    private int field_h;
    static ql field_n;
    private int field_o;
    static String field_l;
    static long field_j;
    static String field_c;
    static String[] field_e;
    private int field_b;
    static kc field_a;
    private int field_m;
    static String field_k;

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nk var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 16) {
              var4 = (nk) ((Object) pe.field_Lb.b(12623));
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fj.a(-26971, var4, param0);
                  var4 = (nk) ((Object) pe.field_Lb.a(param1 + -16));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "of.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        qb[] discarded$1 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        Object var14 = null;
        eg var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        qb var20 = null;
        qb var21 = null;
        var19 = de.field_l;
        var18 = var19;
        var16 = var18;
        var6 = var16;
        var7 = de.field_e;
        var8 = de.field_j;
        var9 = new qb(param0, -(2 * param0) + param1);
        var9.a();
        de.c(0, 0, param0, -(2 * param0) + param1, param4, param5);
        var10 = new qb(param0, param0);
        var10.a();
        de.d(0, 0, param0, param0, param4);
        var11 = new qb(16, param0);
        var11.a();
        de.d(0, 0, 16, param0, param4);
        var12 = new qb(param0, param0);
        var12.a();
        de.d(0, 0, param0, param0, param5);
        var13 = new qb(16, param0);
        var13.a();
        de.d(0, 0, 16, param0, param5);
        var14 = null;
        if (param2 != 1) {
          L0: {
            var15 = (eg) null;
            discarded$1 = of.a(90, (byte) 7, (eg) null, 120);
            if (-1 > (param3 ^ -1)) {
              var20 = new qb(16, 16);
              var14 = var20;
              var20.a();
              de.d(0, 0, 16, 16, param3);
              break L0;
            } else {
              break L0;
            }
          }
          de.a(var19, var7, var8);
          return new qb[]{var10, var11, var10, var9, (qb) (var14), var9, var12, var13, var12};
        } else {
          L1: {
            if (-1 > (param3 ^ -1)) {
              var21 = new qb(16, 16);
              var14 = var21;
              var21.a();
              de.d(0, 0, 16, 16, param3);
              break L1;
            } else {
              break L1;
            }
          }
          de.a(var19, var7, var8);
          return new qb[]{var10, var11, var10, var9, (qb) (var14), var9, var12, var13, var12};
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        var2 = -32 / ((63 - param0) / 50);
        if (4096 <= param1) {
          L0: {
            if (param1 < 6144) {
              stackOut_7_0 = -ge.field_l[-4096 + param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -ge.field_l[-param1 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackOut_3_0 = ge.field_l[4096 - param1];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ge.field_l[param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static qb[] a(int param0, byte param1, eg param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qb[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var4_int = -94 % ((param1 - -80) / 35);
            if (fc.a(-125, param2, param0, param3)) {
              stackOut_3_0 = pk.a((byte) -116);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("of.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rk var14 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
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
              if (!(param0 instanceof rk)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qm) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (qm) (param0);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var14 = (rk) ((Object) stackIn_3_0);
            if (param1 == 5592405) {
              L2: {
                if (var14 != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                de.d(param2 - -param0.field_n, param3 + param0.field_j, param0.field_v, param0.field_k, this.field_b);
                var7 = param0.field_n + (param2 + var14.field_T);
                var8 = var14.field_U + (param3 + param0.field_j);
                de.i(var7, var8, var14.field_V, this.field_m);
                if (var14.field_M != -1) {
                  var9 = 3.141592653589793 * (double)var14.field_M * 2.0 / (double)var14.field_P;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_V);
                  de.i(var11 + var7, var8 - -var12, 1, this.field_o);
                  break L3;
                } else {
                  break L3;
                }
              }
              de.i(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_P;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
              var12 = (int)(Math.cos(var9) * (double)var14.field_V);
              de.b(var7, var8, var7 + var11, var12 + var8, 1);
              if (null != this.field_d) {
                var13 = this.field_g + (var14.field_V + var14.field_T);
                discarded$1 = this.field_d.a(param0.field_g, var13 + (param2 - -param0.field_n), this.field_i + (param3 - -param0.field_j), -var13 - this.field_g + param0.field_v, -(this.field_g << -1323478399) + param0.field_k, this.field_h, this.field_f, 1, 1, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("of.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -4) {
            return;
        }
        field_k = null;
        field_c = null;
        field_l = null;
        field_n = null;
        field_e = null;
        field_a = null;
    }

    of(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_f = param4;
            this.field_g = param1;
            this.field_i = param2;
            this.field_o = param6;
            this.field_h = param3;
            this.field_d = param0;
            this.field_m = param5;
            this.field_b = param7;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_n = new ql("usename");
        field_k = "Status";
        field_e = new String[16];
        field_l = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
