/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lra extends fh {
    private le field_m;
    static String field_o;
    private int[] field_n;
    private int[] field_l;
    private le[] field_q;
    private le field_k;
    private le field_p;

    final float[] a(int param0, int param1, d param2, boolean param3, asb param4, int param5) {
        int var7_int = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        float[] stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
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
        var18 = VoidHunters.field_G;
        try {
          qnb.field_o = param4;
          nl.field_e = param2;
          for (var7_int = 0; this.field_q.length > var7_int; var7_int++) {
            this.field_q[var7_int].b(-9163, param1, param5);
          }
          hr.a(param5, param1, -116);
          var20 = new float[4 * (param1 * param5)];
          var7 = var20;
          var8 = 0;
          for (var9 = 0; var9 < param5; var9++) {
            if (this.field_m.field_g) {
              var15_ref_int__ = this.field_m.a(var9, true);
              var12 = var15_ref_int__;
              var11 = var15_ref_int__;
              var10 = var15_ref_int__;
            } else {
              var23 = this.field_m.a(255, var9);
              var22 = var23;
              var19 = var22;
              var15_ref_int____ = var19;
              var11 = var23[1];
              var10 = var23[0];
              var12 = var23[2];
            }
            if (this.field_p.field_g) {
              var13 = this.field_p.a(var9, true);
            } else {
              var13 = this.field_p.a(255, var9)[0];
            }
            if (param3) {
              var8 = var9 << 2;
            }
            if (this.field_k.field_g) {
              var14 = this.field_k.a(var9, true);
            } else {
              var14 = this.field_k.a(255, var9)[0];
            }
            for (var15 = param1 - 1; 0 <= var15; var15--) {
              var16 = (float)var13[var15] / 4096.0f;
              var17 = (31.0f * (float)var14[var15] / 4096.0f + 1.0f) / 4096.0f;
              if (0.0f > var16) {
                var16 = 0.0f;
              } else {
                if (1.0f < var16) {
                  var16 = 1.0f;
                }
              }
              incrementValue$0 = var8;
              var8++;
              var20[incrementValue$0] = var17 * (float)var10[var15];
              incrementValue$1 = var8;
              var8++;
              var20[incrementValue$1] = (float)var11[var15] * var17;
              incrementValue$2 = var8;
              var8++;
              var20[incrementValue$2] = (float)var12[var15] * var17;
              incrementValue$3 = var8;
              var8++;
              var20[incrementValue$3] = var16;
              if (param3) {
                var8 = var8 + (-4 + (param1 << 2));
              }
            }
          }
          var21 = 0;
          var9Lifetime1 = var21;
          while (var21 < this.field_q.length) {
            this.field_q[var21].c(-36);
            var21++;
          }
          if (param0 != 2) {
            lra.a(false);
          }
          stackIn_35_0 = var7;
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_38_0 = var7_ref;
          stackIn_38_1 = new StringBuilder().append("lra.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, asb param1, d param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var5 = VoidHunters.field_G;
        try {
          if (dbb.field_o >= 0) {
            for (var4_int = 0; var4_int < this.field_n.length; var4_int++) {
              if (!param1.a((byte) 67, this.field_n[var4_int], dbb.field_o)) {
                return false;
              }
            }
          } else {
            var4_int = 0;
            while (var4_int < this.field_n.length) {
              if (param1.a(this.field_n[var4_int], true)) {
                var4_int++;
                continue;
              }
              return false;
            }
          }
          var4_intLifetime1 = param0;
          while (true) {
            if (var4_intLifetime1 >= this.field_l.length) {
              return true;
            }
            if (param2.a(this.field_l[var4_intLifetime1], (byte) -84)) {
              var4_intLifetime1++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("lra.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1, int param2, boolean param3, asb param4, d param5, double param6) {
        int var9_int = 0;
        int var16 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_51_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[][] var15_array = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        d var22 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        int[][] var26 = null;
        int[][] var27 = null;
        int[] var15Lifetime1;
        int var11Lifetime1;
        var21 = VoidHunters.field_G;
        try {
          if (param1) {
            var22 = (d) null;
            this.a(45, (asb) null, (d) null);
          }
          nl.field_e = param5;
          qnb.field_o = param4;
          for (var9_int = 0; this.field_q.length > var9_int; var9_int++) {
            this.field_q[var9_int].b(-9163, param0, param2);
          }
          igb.a(true, param6);
          hr.a(param2, param0, -99);
          var9 = new int[param2 * param0];
          var10 = 0;
          for (var11 = 0; param2 > var11; var11++) {
            if (this.field_m.field_g) {
              var24 = this.field_m.a(var11, true);
              var15 = var24;
              var14 = var24;
              var13 = var24;
              var12 = var24;
            } else {
              var27 = this.field_m.a(255, var11);
              var26 = var27;
              var23 = var26;
              var15_array = var23;
              var12 = var27[0];
              var14 = var27[2];
              var13 = var27[1];
            }
            if (param3) {
              var10 = var11;
            }
            if (this.field_p.field_g) {
              var15Lifetime1 = this.field_p.a(var11, true);
            } else {
              var15Lifetime1 = this.field_p.a(255, var11)[0];
            }
            for (var16 = -1 + param0; var16 >= 0; var16--) {
              var17 = var12[var16] >> 4;
              if (255 < var17) {
                var17 = 255;
              }
              if (var17 < 0) {
                var17 = 0;
              }
              var18 = var13[var16] >> 4;
              if (255 < var18) {
                var18 = 255;
              }
              if (var18 < 0) {
                var18 = 0;
              }
              var19 = var14[var16] >> 4;
              if (255 < var19) {
                var19 = 255;
              }
              var17 = pp.field_o[var17];
              var18 = pp.field_o[var18];
              if (var19 < 0) {
                var19 = 0;
              }
              var19 = pp.field_o[var19];
              if (var17 == 0 &&
                var18 == 0 &&
                var19 == 0) {
                var20 = 0;
              } else {
                var20 = var15Lifetime1[var16] >> 4;
                if (var20 > 255) {
                  var20 = 255;
                }
                if (var20 < 0) {
                  var20 = 0;
                }
              }
              incrementValue$0 = var10;
              var10++;
              var9[incrementValue$0] = (var17 << 16) + (var20 << 24) + (var18 << 8) + var19;
              if (param3) {
                var10 = var10 + (param0 - 1);
              }
            }
          }
          var25 = 0;
          var11Lifetime1 = var25;
          while (this.field_q.length > var25) {
            this.field_q[var25].c(-72);
            var25++;
          }
          stackIn_51_0 = var9;
          return stackIn_51_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_54_0 = var9_ref;
          stackIn_54_1 = new StringBuilder().append("lra.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param5 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param6).append(')').toString());
        }
    }

    final int[] a(boolean param0, d param1, asb param2, int param3, boolean param4, int param5, double param6, int param7) {
        int var10_int = 0;
        int[][] dupTemp$0 = null;
        int var19 = 0;
        int[] stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
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
        int[][] var19_ref_int____ = null;
        int[] var19_ref_int__ = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var15Lifetime1;
        var24 = VoidHunters.field_G;
        try {
          qnb.field_o = param2;
          nl.field_e = param1;
          for (var10_int = 0; this.field_q.length > var10_int; var10_int++) {
            this.field_q[var10_int].b(-9163, param5, param7);
          }
          igb.a(true, param6);
          hr.a(param7, param5, -128);
          var26 = new int[param5 * param7];
          var10 = var26;
          if (!param0) {
            var12 = param5;
            var13 = 1;
            var11 = 0;
          } else {
            var13 = -1;
            var12 = -1;
            var11 = -1 + param5;
          }
          var14 = 0;
          for (var15 = 0; var15 < param7; var15++) {
            if (param4) {
              var14 = var15;
            }
            if (!this.field_m.field_g) {
              dupTemp$0 = this.field_m.a(255, var15);
              var25 = dupTemp$0;
              var19_ref_int____ = dupTemp$0;
              var17 = var25[1];
              var16 = var25[0];
              var18 = var25[2];
            } else {
              var19_ref_int__ = this.field_m.a(var15, true);
              var16 = var19_ref_int__;
              var17 = var19_ref_int__;
              var18 = var19_ref_int__;
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
              if (0 > var21) {
                var21 = 0;
              }
              var22 = var18[var19] >> 4;
              if (var22 > 255) {
                var22 = 255;
              }
              if (0 > var22) {
                var22 = 0;
              }
              var20 = pp.field_o[var20];
              var21 = pp.field_o[var21];
              var22 = pp.field_o[var22];
              var23 = var22 + (var20 << 16) + (var21 << 8);
              if (var23 != 0) {
                var23 = var23 | -16777216;
              }
              var26[var14++] = var23;
              if (param4) {
                var14 = var14 + (param5 - 1);
              }
            }
          }
          var27 = param3;
          var15Lifetime1 = var27;
          while (this.field_q.length > var27) {
            this.field_q[var27].c(-91);
            var27++;
          }
          stackIn_43_0 = var10;
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_46_0 = var10_ref;
          stackIn_46_1 = new StringBuilder().append("lra.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    lra(ds param0) {
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
        le var13 = null;
        le var14 = null;
        le var15 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        try {
          var2_int = param0.e((byte) -120);
          var3 = 0;
          var4 = 0;
          var12 = new int[var2_int][];
          this.field_q = new le[var2_int];
          for (var6 = 0; var2_int > var6; var6++) {
            var13 = sk.a(param0, (byte) 55);
            var14 = var13;
            if (var14.a(-1) >= 0) {
              var3++;
            }
            if (var14.d((byte) 81) >= 0) {
              var4++;
            }
            var8 = var14.field_e.length;
            array$2 = new int[var8];
            var12[var6] = array$2;
            for (var9 = 0; var8 > var9; var9++) {
              var12[var6][var9] = param0.e((byte) -125);
            }
            this.field_q[var6] = var13;
          }
          this.field_n = new int[var3];
          var3Lifetime1 = 0;
          this.field_l = new int[var4];
          var4Lifetime1 = 0;
          for (var6Lifetime1 = 0; var2_int > var6Lifetime1; var6Lifetime1++) {
            var15 = this.field_q[var6Lifetime1];
            var8Lifetime1 = var15.field_e.length;
            for (var9Lifetime1 = 0; var8Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              var15.field_e[var9Lifetime1] = this.field_q[var12[var6Lifetime1][var9Lifetime1]];
            }
            var9Lifetime1Lifetime1 = var15.a(-1);
            var10 = var15.d((byte) 77);
            if (0 < var9Lifetime1Lifetime1) {
              incrementValue$0 = var3Lifetime1;
              var3Lifetime1++;
              this.field_n[incrementValue$0] = var9Lifetime1Lifetime1;
            }
            if (var10 > 0) {
              incrementValue$1 = var4Lifetime1;
              var4Lifetime1++;
              this.field_l[incrementValue$1] = var10;
            }
            var12[var6Lifetime1] = null;
          }
          this.field_m = this.field_q[param0.e((byte) -114)];
          this.field_p = this.field_q[param0.e((byte) -90)];
          var5 = (int[][]) null;
          this.field_k = this.field_q[param0.e((byte) -108)];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("lra.<init>(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
          lra.a(false);
        }
    }

    static {
        field_o = "This game has started.";
    }
}
