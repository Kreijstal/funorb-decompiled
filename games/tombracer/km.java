/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends od {
    private ci[] field_l;
    private ci field_r;
    private ci field_k;
    private ci field_m;
    static fta field_p;
    static String field_n;
    private int[] field_o;
    private int[] field_q;

    final boolean a(cn param0, d param1, int param2) {
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 <= gla.field_m) {
            for (var4_int = 0; var4_int < this.field_q.length; var4_int++) {
              if (!param0.a(gla.field_m, (byte) -106, this.field_q[var4_int])) {
                return false;
              }
            }
          } else {
            var4_int = 0;
            while (var4_int < this.field_q.length) {
              if (param0.a(-15121, this.field_q[var4_int])) {
                var4_int++;
                continue;
              }
              return false;
            }
          }
          for (var4_intLifetime1 = 0; var4_intLifetime1 < this.field_o.length; var4_intLifetime1++) {
            if (!param1.a(this.field_o[var4_intLifetime1], (byte) 105)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("km.C(");
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
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_n = null;
        if (param0 > -95) {
          field_p = (fta) null;
        }
    }

    final float[] a(d param0, byte param1, int param2, int param3, boolean param4, cn param5) {
        int var7_int = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        float[] stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15_ref_int__ = null;
        int[][] var15_ref_int____ = null;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[][] var19 = null;
        float[] var20 = null;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int var9Lifetime1;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          qw.field_j = param0;
          np.field_m = param5;
          for (var7_int = 0; this.field_l.length > var7_int; var7_int++) {
            this.field_l[var7_int].b(param3, param2, -256);
          }
          uta.a(0, param2, param3);
          var20 = new float[4 * param2 * param3];
          var7 = var20;
          var8 = 0;
          for (var9 = 0; var9 < param2; var9++) {
            if (this.field_k.field_g) {
              var15_ref_int__ = this.field_k.c(1, var9);
              var10_ref_int__ = var15_ref_int__;
              var11 = var15_ref_int__;
              var12 = var15_ref_int__;
            } else {
              var23 = this.field_k.b(var9, -1);
              var22 = var23;
              var19 = var22;
              var15_ref_int____ = var19;
              var11 = var23[1];
              var12 = var23[2];
              var10_ref_int__ = var23[0];
            }
            if (this.field_r.field_g) {
              var13 = this.field_r.c(1, var9);
            } else {
              var13 = this.field_r.b(var9, -1)[0];
            }
            if (param4) {
              var8 = var9 << 2;
            }
            if (this.field_m.field_g) {
              var14 = this.field_m.c(1, var9);
            } else {
              var14 = this.field_m.b(var9, -1)[0];
            }
            for (var15 = param3 - 1; var15 >= 0; var15--) {
              var16 = (float)var13[var15] / 4096.0f;
              if (!(0.0f > var16)) {
                if (1.0f < var16) {
                  var16 = 1.0f;
                }
              } else {
                var16 = 0.0f;
              }
              var17 = (1.0f + (float)var14[var15] * 31.0f / 4096.0f) / 4096.0f;
              incrementValue$0 = var8;
              var8++;
              var20[incrementValue$0] = var17 * (float)var10_ref_int__[var15];
              incrementValue$1 = var8;
              var8++;
              var20[incrementValue$1] = var17 * (float)var11[var15];
              incrementValue$2 = var8;
              var8++;
              var20[incrementValue$2] = (float)var12[var15] * var17;
              incrementValue$3 = var8;
              var8++;
              var20[incrementValue$3] = var16;
              if (param4) {
                var8 = var8 + ((param3 << 2) - 4);
              }
            }
          }
          var10 = -41 / ((-67 - param1) / 38);
          var21 = 0;
          var9Lifetime1 = var21;
          while (var21 < this.field_l.length) {
            this.field_l[var21].b(-54);
            var21++;
          }
          stackIn_34_0 = var7;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_37_0 = var7_ref;
          stackIn_37_1 = new StringBuilder().append("km.D(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final int[] a(int param0, cn param1, boolean param2, double param3, d param4, byte param5, int param6, boolean param7) {
        int var10_int = 0;
        int var19 = 0;
        int[] stackIn_6_0 = null;
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
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          qw.field_j = param4;
          np.field_m = param1;
          for (var10_int = 0; this.field_l.length > var10_int; var10_int++) {
            this.field_l[var10_int].b(param6, param0, -256);
          }
          if (param5 < 17) {
            stackIn_6_0 = (int[]) null;
            return stackIn_6_0;
          }
          js.a(param3, -256);
          uta.a(0, param0, param6);
          var26 = new int[param6 * param0];
          var10 = var26;
          if (param2) {
            var13 = -1;
            var11 = param6 - 1;
            var12 = -1;
          } else {
            var12 = param6;
            var11 = 0;
            var13 = 1;
          }
          var14 = 0;
          for (var15 = 0; var15 < param0; var15++) {
            if (this.field_k.field_g) {
              var19_ref_int__ = this.field_k.c(1, var15);
              var16 = var19_ref_int__;
              var18 = var19_ref_int__;
              var17 = var19_ref_int__;
            } else {
              var29 = this.field_k.b(var15, -1);
              var28 = var29;
              var25 = var28;
              var19_ref_int____ = var25;
              var16 = var29[0];
              var17 = var29[1];
              var18 = var29[2];
            }
            if (param7) {
              var14 = var15;
            }
            for (var19 = var11; var19 != var12; var19 = var19 + var13) {
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
              if (255 < var22) {
                var22 = 255;
              }
              if (var22 < 0) {
                var22 = 0;
              }
              var20 = sk.field_c[var20];
              var21 = sk.field_c[var21];
              var22 = sk.field_c[var22];
              var23 = var22 + ((var21 << 8) + (var20 << 16));
              if (0 != var23) {
                var23 = var23 | -16777216;
              }
              var26[var14++] = var23;
              if (param7) {
                var14 = var14 + (-1 + param6);
              }
            }
          }
          var27 = 0;
          var15Lifetime1 = var27;
          while (var27 < this.field_l.length) {
            this.field_l[var27].b(-50);
            var27++;
          }
          stackIn_46_0 = var10;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_49_0 = var10_ref;
          stackIn_49_1 = new StringBuilder().append("km.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    km(uia param0) {
        int[] array$2 = null;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        ci var13 = null;
        ci var14 = null;
        ci var15 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        try {
          var2_int = param0.h(255);
          var3 = 0;
          var4 = 0;
          this.field_l = new ci[var2_int];
          var12 = new int[var2_int][];
          for (var6 = 0; var6 < var2_int; var6++) {
            var13 = aw.a(param0, 0);
            var14 = var13;
            if (var14.a(125) >= 0) {
              var3++;
            }
            if (var14.c((byte) -117) >= 0) {
              var4++;
            }
            var8 = var14.field_j.length;
            array$2 = new int[var8];
            var12[var6] = array$2;
            for (var9 = 0; var8 > var9; var9++) {
              var12[var6][var9] = param0.h(255);
            }
            this.field_l[var6] = var13;
          }
          this.field_q = new int[var3];
          this.field_o = new int[var4];
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          for (var6Lifetime1 = 0; var2_int > var6Lifetime1; var6Lifetime1++) {
            var15 = this.field_l[var6Lifetime1];
            var8Lifetime1 = var15.field_j.length;
            for (var9Lifetime1 = 0; var8Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              var15.field_j[var9Lifetime1] = this.field_l[var12[var6Lifetime1][var9Lifetime1]];
            }
            var9Lifetime1Lifetime1 = var15.a(100);
            var10 = var15.c((byte) -117);
            if (var9Lifetime1Lifetime1 > 0) {
              incrementValue$0 = var3Lifetime1;
              var3Lifetime1++;
              this.field_q[incrementValue$0] = var9Lifetime1Lifetime1;
            }
            if (0 < var10) {
              incrementValue$1 = var4Lifetime1;
              var4Lifetime1++;
              this.field_o[incrementValue$1] = var10;
            }
            var12[var6Lifetime1] = null;
          }
          this.field_k = this.field_l[param0.h(255)];
          this.field_r = this.field_l[param0.h(255)];
          var5 = (int[][]) null;
          this.field_m = this.field_l[param0.h(255)];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("km.<init>(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1, int param2, double param3, cn param4, d param5, boolean param6) {
        int var9_int = 0;
        int var16 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var15_array = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[] var23 = null;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        int[] var15_arrayLifetime1;
        int var11Lifetime1;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          qw.field_j = param5;
          np.field_m = param4;
          for (var9_int = 0; this.field_l.length > var9_int; var9_int++) {
            this.field_l[var9_int].b(param0, param2, -256);
          }
          js.a(param3, -256);
          uta.a(0, param2, param0);
          if (param6) {
            this.field_m = (ci) null;
          }
          var9 = new int[param0 * param2];
          var10 = 0;
          for (var11 = 0; param2 > var11; var11++) {
            if (!this.field_k.field_g) {
              var26 = this.field_k.b(var11, -1);
              var25 = var26;
              var22 = var25;
              var15 = var22;
              var13 = var26[1];
              var12 = var26[0];
              var14 = var26[2];
            } else {
              var23 = this.field_k.c(1, var11);
              var15_array = var23;
              var14 = var23;
              var12 = var23;
              var13 = var23;
            }
            if (this.field_r.field_g) {
              var15_arrayLifetime1 = this.field_r.c(1, var11);
            } else {
              var15_arrayLifetime1 = this.field_r.b(var11, -1)[0];
            }
            if (param1) {
              var10 = var11;
            }
            for (var16 = -1 + param0; var16 >= 0; var16--) {
              var17 = var12[var16] >> 4;
              if (var17 > 255) {
                var17 = 255;
              }
              if (0 > var17) {
                var17 = 0;
              }
              var18 = var13[var16] >> 4;
              if (var18 > 255) {
                var18 = 255;
              }
              if (0 > var18) {
                var18 = 0;
              }
              var19 = var14[var16] >> 4;
              if (var19 > 255) {
                var19 = 255;
              }
              var17 = sk.field_c[var17];
              var18 = sk.field_c[var18];
              if (var19 < 0) {
                var19 = 0;
              }
              var19 = sk.field_c[var19];
              if (var17 == 0 &&
                var18 == 0 &&
                var19 == 0) {
                var20 = 0;
              } else {
                var20 = var15_arrayLifetime1[var16] >> 4;
                if (var20 > 255) {
                  var20 = 255;
                }
                if (var20 < 0) {
                  var20 = 0;
                }
              }
              incrementValue$0 = var10;
              var10++;
              var9[incrementValue$0] = var19 + ((var18 << 8) + ((var17 << 16) + (var20 << 24)));
              if (param1) {
                var10 = var10 + (param0 - 1);
              }
            }
          }
          var24 = 0;
          var11Lifetime1 = var24;
          while (var24 < this.field_l.length) {
            this.field_l[var24].b(-126);
            var24++;
          }
          stackIn_52_0 = var9;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_55_0 = var9_ref;
          stackIn_55_1 = new StringBuilder().append("km.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param5 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_n = "LASER stands for Light Amplification by Stimulated Emission of Radiation. Misuse of a LASER can turn a PLAYER into TOAST.";
    }
}
