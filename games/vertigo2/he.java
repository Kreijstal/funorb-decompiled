/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gp {
    static String field_B;
    private int[] field_w;
    private int[] field_y;
    static String field_t;
    private ji[] field_v;
    static String field_z;
    static cr field_x;
    private ji field_A;
    static int[] field_u;

    final int[] a(r param0, double param1, boolean param2, boolean param3, int param4, int param5, int param6, ka param7) {
        int var10_int = 0;
        int var19 = 0;
        int[] stackIn_43_0 = null;
        int[] stackIn_47_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        int var15Lifetime1;
        var24 = Vertigo2.field_L ? 1 : 0;
        try {
          mk.field_P = param7;
          nk.field_Hb = param0;
          for (var10_int = 0; var10_int < this.field_v.length; var10_int++) {
            this.field_v[var10_int].b(param4, param6, 255);
          }
          dl.a(param1, (byte) -107);
          ib.a((byte) -122, param4, param6);
          var26 = new int[param6 * param4];
          var10 = var26;
          if (!param2) {
            var11 = 0;
            var13 = 1;
            var12 = param6;
          } else {
            var13 = -1;
            var12 = -1;
            var11 = param6 - 1;
          }
          var14 = 0;
          for (var15 = 0; param4 > var15; var15++) {
            if (param3) {
              var14 = var15;
            }
            if (this.field_A.field_o) {
              var19_ref_int__ = this.field_A.c(var15, param5 - 27024);
              var18 = var19_ref_int__;
              var16 = var19_ref_int__;
              var17 = var19_ref_int__;
            } else {
              var28 = this.field_A.b(-3780, var15);
              var27 = var28;
              var25 = var27;
              var19_ref_int____ = var25;
              var17 = var28[1];
              var16 = var28[0];
              var18 = var28[2];
            }
            for (var19 = var11; var12 != var19; var19 = var19 + var13) {
              var20 = var16[var19] >> 4;
              if (var20 > 255) {
                var20 = 255;
              }
              if (var20 < 0) {
                var20 = 0;
              }
              var21 = var17[var19] >> 4;
              if (var21 > 255) {
                var21 = 255;
              }
              if (var21 < 0) {
                var21 = 0;
              }
              var22 = var18[var19] >> 4;
              if (var22 > 255) {
                var22 = 255;
              }
              var21 = li.field_l[var21];
              if (0 > var22) {
                var22 = 0;
              }
              var20 = li.field_l[var20];
              var22 = li.field_l[var22];
              var23 = (var20 << 16) - (-(var21 << 8) - var22);
              if (var23 != 0) {
                var23 = var23 | -16777216;
              }
              var26[var14++] = var23;
              if (param3) {
                var14 = var14 + (-1 + param6);
              }
            }
          }
          var15Lifetime1 = 0;
          if (param5 != 27127) {
            stackIn_43_0 = (int[]) null;
            return stackIn_43_0;
          }
          while (var15Lifetime1 < this.field_v.length) {
            this.field_v[var15Lifetime1].f(2);
            var15Lifetime1++;
          }
          stackIn_47_0 = var10;
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_50_0 = var10_ref;
          stackIn_50_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -113) {
          return;
        }
        field_B = null;
        field_u = null;
        field_z = null;
        field_x = null;
        field_t = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 > -72) {
          return true;
        }
        return 0 != (param1 & 2) ? true : false;
    }

    final static void a(int param0, ub param1, int param2) {
        mi var5 = null;
        int var4 = 0;
        try {
          var5 = uh.field_Wb;
          var5.j(param0, 118);
          var5.field_u = var5.field_u + 1;
          var4 = var5.field_u;
          var5.f(1, 117);
          var5.f(param1.field_u, -71);
          if (param2 != -27011) {
            he.a((byte) -108, 124);
          }
          var5.b(param1.field_q, (byte) -124);
          var5.e(param1.field_s, 0);
          var5.e(param1.field_o, 0);
          var5.e(param1.field_r, 0);
          var5.e(param1.field_n, 0);
          var5.c(var4, 85);
          var5.b((byte) 53, var5.field_u - var4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "he.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(r param0, ka param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (b.field_i >= 0) {
            for (var4_int = 0; var4_int < this.field_y.length; var4_int++) {
              if (!param0.b(param2 ^ 0, b.field_i, this.field_y[var4_int])) {
                return false;
              }
            }
          } else {
            for (var4_int = 0; var4_int < this.field_y.length; var4_int++) {
              if (!param0.a(this.field_y[var4_int], (byte) 53)) {
                return false;
              }
            }
          }
          var4_intLifetime1 = param2;
          while (true) {
            if (this.field_w.length <= var4_intLifetime1) {
              return true;
            }
            if (param1.f(0, this.field_w[var4_intLifetime1])) {
              var4_intLifetime1++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("he.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    he(ed param0) {
        int[] array$2 = null;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ji var13 = null;
        ji var14 = null;
        ji var15 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        try {
          var2_int = param0.h(-11);
          var3 = 0;
          var4 = 0;
          var12 = new int[var2_int][];
          this.field_v = new ji[var2_int];
          for (var6 = 0; var2_int > var6; var6++) {
            var13 = ve.a((byte) -109, param0);
            var14 = var13;
            if (0 <= var14.a((byte) -117)) {
              var3++;
            }
            if (var14.e(6557) >= 0) {
              var4++;
            }
            var8 = var14.field_u.length;
            array$2 = new int[var8];
            var12[var6] = array$2;
            for (var9 = 0; var9 < var8; var9++) {
              var12[var6][var9] = param0.h(-11);
            }
            this.field_v[var6] = var13;
          }
          this.field_y = new int[var3];
          var3Lifetime1 = 0;
          this.field_w = new int[var4];
          var4Lifetime1 = 0;
          for (var6Lifetime1 = 0; var2_int > var6Lifetime1; var6Lifetime1++) {
            var15 = this.field_v[var6Lifetime1];
            var8Lifetime1 = var15.field_u.length;
            for (var9Lifetime1 = 0; var8Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              var15.field_u[var9Lifetime1] = this.field_v[var12[var6Lifetime1][var9Lifetime1]];
            }
            var9Lifetime1Lifetime1 = var15.a((byte) -117);
            var10 = var15.e(6557);
            if (var9Lifetime1Lifetime1 > 0) {
              incrementValue$0 = var3Lifetime1;
              var3Lifetime1++;
              this.field_y[incrementValue$0] = var9Lifetime1Lifetime1;
            }
            if (var10 > 0) {
              incrementValue$1 = var4Lifetime1;
              var4Lifetime1++;
              this.field_w[incrementValue$1] = var10;
            }
            var12[var6Lifetime1] = null;
          }
          this.field_A = this.field_v[param0.h(-11)];
          param0.h(-11);
          var5 = (int[][]) null;
          param0.h(-11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("he.<init>(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_B = "Owner";
        field_t = "Personal Best: <%0>";
        field_z = "Play the game without logging in just yet";
        field_u = new int[4];
    }
}
