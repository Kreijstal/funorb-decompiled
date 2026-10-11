/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kt extends elb {
    private int field_p;
    private int field_s;
    private int field_o;
    static int[] field_r;
    private int field_j;
    static int field_l;
    private byte[] field_k;
    private int field_n;
    private int field_m;
    private int field_i;
    private int field_q;

    final void a(int param0, int param1, int param2) {
        int var5 = VoidHunters.field_G;
        int var4 = 102 / ((-53 - param0) / 48);
        if (0 == param1) {
          this.field_n = -(param2 >= 0 ? param2 : -param2) + this.field_o;
          this.field_n = this.field_n * this.field_n >> 12;
          this.field_j = 4096;
          this.field_p = this.field_n;
        } else {
          this.field_j = this.field_n * this.field_q >> 12;
          if (this.field_j < 0) {
            this.field_j = 0;
          } else {
            if (this.field_j > 4096) {
              this.field_j = 4096;
            }
          }
          this.field_n = this.field_o - (param2 >= 0 ? param2 : -param2);
          this.field_n = this.field_n * this.field_n >> 12;
          this.field_n = this.field_n * this.field_j >> 12;
          this.field_p = this.field_p + (this.field_n * this.field_i >> 12);
          this.field_i = this.field_s * this.field_i >> 12;
        }
    }

    public static void d(byte param0) {
        int var1 = 2 / ((25 - param0) / 36);
        field_r = null;
    }

    void a(int param0, byte param1, int param2) {
        this.field_k[param2] = (byte)param1;
        if (param0 != 0) {
          this.a(59, (byte) -51, -30);
        }
    }

    final void a(boolean param0) {
        this.field_p = 0;
        if (!param0) {
          return;
        }
        this.field_m = 0;
    }

    final static void a(wma param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        apb stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        apb var21 = null;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        wma var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = VoidHunters.field_G;
        try {
          var44 = param0;
          if (var44.field_E != null &&
            var44.field_z > 1) {
            var60 = var44.field_E;
            tga.a(rua.field_q, 0, (byte) 118, var60, 0);
          } else {
            ila.c((byte) -15);
          }
          var54 = new int[param0.field_L];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param0.field_L];
          var63 = bva.field_b;
          var62 = mpa.field_o;
          var61 = lf.field_p;
          for (var13 = 0; var13 < param0.field_L; var13++) {
            var14 = var61[var13] * param6 + (var62[var13] * param5 + var63[var13] * param7) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_15_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_15_0 = 128 + var14;
              } else {
                stackIn_15_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = var63[var13] * param2 + var62[var13] * param1 + param4 * var61[var13] >> 8;
            stackIn_17_0 = ap.field_p;
            if (0 <= var15) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < pca.field_j; var13Lifetime1++) {
            var14Lifetime1 = aq.field_p[var13Lifetime1];
            var15Lifetime1 = param0.field_w[var14Lifetime1];
            var16 = param0.field_N[var14Lifetime1];
            var17 = param0.field_D[var14Lifetime1];
            if (param0.field_j[var14Lifetime1] < bva.field_b.length) {
              stackIn_24_0 = param0.field_j[var14Lifetime1];
            } else {
              stackIn_24_0 = -1;
            }
            var18 = stackIn_24_0;
            if (param0.field_G[var14Lifetime1] < bva.field_b.length) {
              stackIn_27_0 = param0.field_G[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var19 = stackIn_27_0;
            if (bva.field_b.length > param0.field_I[var14Lifetime1]) {
              stackIn_30_0 = param0.field_I[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var20 = stackIn_30_0;
            if (gs.field_a != null &&
              param0.field_K != null &&
              param0.field_K.length > var14Lifetime1 &&
              param0.field_K[var14Lifetime1] != -1 &&
              param0.field_K[var14Lifetime1] < gs.field_a.length) {
              stackIn_38_0 = gs.field_a[param0.field_K[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = cl.field_b[var15Lifetime1];
            var23 = lr.field_o[var15Lifetime1];
            var24 = cl.field_b[var16];
            var25 = lr.field_o[var16];
            var26 = cl.field_b[var17];
            var27 = lr.field_o[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_43_0 = var21.field_c;
              } else {
                stackIn_43_0 = 8355711;
              }
              var30 = stackIn_43_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (-16711864 & var28 * var31) >>> 8 | (16711880 & var28 * var32) >>> 8;
              var33 = var33 + 65793 * var29;
              cma.a(var24, var26, false, var27, (16711422 & var33) >> 1, var23, var22, var25);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_47_0 = 8355711;
              } else {
                stackIn_47_0 = var21.field_c;
              }
              var34 = stackIn_47_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = (var28 * var36 & 16711864) >>> 8 | (-16711900 & var35 * var28) >>> 8;
              var38 = -1895890689 & var29 * var35 >>> 8 | (16711892 & var36 * var29) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = 234946304 & var30 * var36 >>> 8 | -218169089 & var35 * var30 >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = var39 + var33 * 65793;
              vqb.a(var39 >> 16, var38 >> 8 & 255, var38 >> 16, var22, (var39 & 65337) >> 8, var25, var37 >> 16, (65314 & var37) >> 8, var39 & 255, -18419, var26, var27, var37 & 255, var24, var38 & 255, var23);
            }
          }
          if (param3 > -109) {
            field_l = 50;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("kt.E(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    kt(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        this.field_q = (int)(param7 * 4096.0f);
        this.field_o = (int)(4096.0f * param6);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-param5)) * 4096.0);
        this.field_s = dupTemp$0;
        this.field_i = dupTemp$0;
    }

    final void a(int param0) {
        this.field_p = this.field_p >> 4;
        this.field_i = this.field_s;
        if (this.field_p < 0) {
          this.field_p = 0;
        } else {
          if (this.field_p > 255) {
            this.field_p = 255;
          }
        }
        if (param0 != 1424903724) {
          this.a(113, 123, 40);
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.a(0, (byte)this.field_p, fieldTemp$0);
        this.field_p = 0;
    }

    static {
        field_r = new int[]{0, 1, 21, 4, 3, 20, 12};
        field_l = 256;
    }
}
