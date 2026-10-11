/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends eo {
    private k field_v;
    static int[] field_u;
    static int field_n;
    static String field_p;
    static eaa field_r;
    private int[] field_o;
    static char[] field_s;
    static int[] field_w;
    private k[] field_y;
    private int[] field_q;
    static boolean field_x;
    static int field_t;

    public static void e(int param0) {
        if (param0 != -29639) {
          field_t = -81;
        }
        field_p = null;
        field_u = null;
        field_w = null;
        field_r = null;
        field_s = null;
    }

    final boolean a(q param0, vr param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var5 = BachelorFridge.field_y;
        try {
          if (sp.field_l < 0) {
            for (var4_int = 0; this.field_o.length > var4_int; var4_int++) {
              if (!param1.a(0, this.field_o[var4_int])) {
                return false;
              }
            }
          } else {
            var4_int = 0;
            while (var4_int < this.field_o.length) {
              if (param1.a(-122, this.field_o[var4_int], sp.field_l)) {
                var4_int++;
                continue;
              }
              return false;
            }
          }
          var4_intLifetime1 = 0;
          while (true) {
            if (var4_intLifetime1 >= this.field_q.length) {
              if (param2 > -44) {
                on.e(-105);
              }
              return true;
            }
            if (param0.c((byte) -98, this.field_q[var4_intLifetime1])) {
              var4_intLifetime1++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("on.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    on(lu param0) {
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
        k var13 = null;
        k var14 = null;
        k var15 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        try {
          var2_int = param0.b(16711935);
          var3 = 0;
          var4 = 0;
          this.field_y = new k[var2_int];
          var12 = new int[var2_int][];
          for (var6 = 0; var6 < var2_int; var6++) {
            var13 = wb.b(param0, 94);
            var14 = var13;
            if (var14.a(-2359) >= 0) {
              var3++;
            }
            if (var14.c((byte) 78) >= 0) {
              var4++;
            }
            var8 = var14.field_g.length;
            array$2 = new int[var8];
            var12[var6] = array$2;
            for (var9 = 0; var9 < var8; var9++) {
              var12[var6][var9] = param0.b(16711935);
            }
            this.field_y[var6] = var13;
          }
          this.field_o = new int[var3];
          this.field_q = new int[var4];
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < var2_int; var6Lifetime1++) {
            var15 = this.field_y[var6Lifetime1];
            var8Lifetime1 = var15.field_g.length;
            for (var9Lifetime1 = 0; var8Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              var15.field_g[var9Lifetime1] = this.field_y[var12[var6Lifetime1][var9Lifetime1]];
            }
            var9Lifetime1Lifetime1 = var15.a(-2359);
            var10 = var15.c((byte) 47);
            if (var9Lifetime1Lifetime1 > 0) {
              incrementValue$0 = var3Lifetime1;
              var3Lifetime1++;
              this.field_o[incrementValue$0] = var9Lifetime1Lifetime1;
            }
            if (var10 > 0) {
              incrementValue$1 = var4Lifetime1;
              var4Lifetime1++;
              this.field_q[incrementValue$1] = var10;
            }
            var12[var6Lifetime1] = null;
          }
          this.field_v = this.field_y[param0.b(16711935)];
          param0.b(16711935);
          param0.b(16711935);
          var5 = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("on.<init>(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int[] a(double param0, boolean param1, q param2, int param3, int param4, vr param5, boolean param6, int param7) {
        int var10_int = 0;
        int var19 = 0;
        int[] stackIn_9_0 = null;
        int[] stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
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
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int var15Lifetime1;
        var24 = BachelorFridge.field_y;
        try {
          da.field_c = param2;
          l.field_r = param5;
          for (var10_int = 0; var10_int < this.field_y.length; var10_int++) {
            this.field_y[var10_int].a(param4, (byte) -93, param3);
          }
          vd.a(param0, 81);
          jp.a(-117, param3, param4);
          var26 = new int[param4 * param3];
          var10 = var26;
          if (!param6) {
            var13 = 1;
            var12 = param3;
            var11 = 0;
          } else {
            var11 = -1 + param3;
            var13 = -1;
            var12 = -1;
          }
          var14 = 0;
          if (param7 != -1) {
            stackIn_9_0 = (int[]) null;
            return stackIn_9_0;
          }
          for (var15 = 0; param4 > var15; var15++) {
            if (param1) {
              var14 = var15;
            }
            if (this.field_v.field_f) {
              var19_ref_int__ = this.field_v.a(var15, 0);
              var17 = var19_ref_int__;
              var16 = var19_ref_int__;
              var18 = var19_ref_int__;
            } else {
              var29 = this.field_v.a(false, var15);
              var28 = var29;
              var25 = var28;
              var19_ref_int____ = var25;
              var17 = var29[1];
              var16 = var29[0];
              var18 = var29[2];
            }
            for (var19 = var11; var12 != var19; var19 = var19 + var13) {
              var20 = var16[var19] >> 4;
              if (var20 > 255) {
                var20 = 255;
              }
              if (0 > var20) {
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
              var21 = jna.field_f[var21];
              if (var22 < 0) {
                var22 = 0;
              }
              var20 = jna.field_f[var20];
              var22 = jna.field_f[var22];
              var23 = (var20 << 16) + (var21 << 8) + var22;
              if (var23 != 0) {
                var23 = var23 | -16777216;
              }
              var26[var14++] = var23;
              if (param1) {
                var14 = var14 + (-1 + param3);
              }
            }
          }
          var27 = 0;
          var15Lifetime1 = var27;
          while (var27 < this.field_y.length) {
            this.field_y[var27].b(-256);
            var27++;
          }
          stackIn_46_0 = var10;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_49_0 = var10_ref;
          stackIn_49_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_n = 0;
        field_u = new int[]{3, 5, 1, 3, 1, 1, 1, 1, 2, 1, 1, 1, 3, 5, 2, 1, 1, 1, 5, 1, 2, 2, 1, 1, 1, 5, 3, 3, 2, 2, 10, 5, 3, 5, 3, 5, 5, 3, 10, 5, 5, 5, 3, 5, 3, 3, 2, 5, 3, 1};
        field_s = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_w = new int[8192];
        field_p = "Buying or selling an account";
        field_r = new eaa();
    }
}
