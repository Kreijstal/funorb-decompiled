/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements gj {
    private hu field_k;
    static String field_c;
    static boolean field_n;
    static String field_f;
    private int field_i;
    private int field_h;
    static int field_e;
    static hd field_b;
    private int field_a;
    private int field_g;
    private int field_l;
    static al field_d;
    private int field_j;
    private int field_m;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 != -19485) {
          field_n = false;
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        s var15 = null;
        fd stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        try {
          if (!(param3 instanceof s)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (fd) (param3);
          }
          var15 = (s) (stackIn_3_0);
          if (var15 != null) {
          }
          on.a(param4 + param3.field_t, param2 + param3.field_g, param3.field_n, param3.field_i, this.field_m);
          var7 = param4 + (param3.field_t + var15.field_H);
          var8 = param3.field_g + (param2 + var15.field_G);
          on.d(var7, var8, var15.field_J, this.field_i);
          var12 = -80 % ((59 - param0) / 53);
          if (var15.field_I != -1) {
            var9 = 2.0 * (3.141592653589793 * (double)var15.field_I) / (double)var15.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
            var13 = (int)(Math.cos(var9) * (double)var15.field_J);
            on.d(var11 + var7, var13 + var8, 1, this.field_g);
          }
          on.d(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var15.field_L) / (double)var15.field_K;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var15.field_J);
          var13Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var15.field_J);
          on.b(var7, var8, var11Lifetime1 + var7, var13Lifetime1 + var8, 1);
          if (this.field_k != null) {
            var14 = this.field_h + (var15.field_J + var15.field_H);
            this.field_k.a(param3.field_q, param4 - (-param3.field_t - var14), param2 + (param3.field_g + this.field_a), -var14 - this.field_h + param3.field_n, param3.field_i - (this.field_h << 1), this.field_l, this.field_j, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, kk param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        gf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
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
        gf var21 = null;
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
        kk var44 = null;
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
        var40 = Kickabout.field_G;
        try {
          var44 = param6;
          if (null != var44.field_G &&
            1 < var44.field_u) {
            var60 = var44.field_G;
            th.a(param5 ^ -125, 0, var60, vu.field_zb, 0);
          } else {
            or.b(false);
          }
          var54 = new int[param6.field_k];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param6.field_k];
          var62 = pv.field_F;
          if (param5 != -125) {
            ei.a(0);
          }
          var63 = ba.field_q;
          var61 = el.field_E;
          for (var13 = 0; param6.field_k > var13; var13++) {
            var14 = param3 * var61[var13] + (var62[var13] * param1 + param0 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 > var14) {
              stackIn_16_0 = 128;
            } else {
              if (var14 >= 128) {
                stackIn_16_0 = 256;
              } else {
                stackIn_16_0 = 128 + var14;
              }
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = param4 * var63[var13] + param2 * var62[var13] + var61[var13] * param7 >> 8;
            stackIn_18_0 = mr.field_Y;
            if (var15 < 0) {
              stackIn_19_1 = -var15;
            } else {
              stackIn_19_1 = var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < sp.field_Ob; var13Lifetime1++) {
            var14Lifetime1 = nb.field_e[var13Lifetime1];
            var15Lifetime1 = param6.field_n[var14Lifetime1];
            var16 = param6.field_z[var14Lifetime1];
            var17 = param6.field_T[var14Lifetime1];
            if (pv.field_F.length <= param6.field_M[var14Lifetime1]) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param6.field_M[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (param6.field_U[var14Lifetime1] >= pv.field_F.length) {
              stackIn_28_0 = -1;
            } else {
              stackIn_28_0 = param6.field_U[var14Lifetime1];
            }
            var19 = stackIn_28_0;
            if (param6.field_l[var14Lifetime1] >= pv.field_F.length) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param6.field_l[var14Lifetime1];
            }
            var20 = stackIn_31_0;
            if (sq.field_H != null &&
              null != param6.field_o &&
              param6.field_o.length > var14Lifetime1 &&
              -1 != param6.field_o[var14Lifetime1] &&
              param6.field_o[var14Lifetime1] < sq.field_H.length) {
              stackIn_39_0 = sq.field_H[param6.field_o[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = fb.field_M[var15Lifetime1];
            var23 = fk.field_k[var15Lifetime1];
            var24 = fb.field_M[var16];
            var25 = fk.field_k[var16];
            var26 = fb.field_M[var17];
            var27 = fk.field_k[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_g;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = var28 * var31 >>> 8 & -671153921 | -1090453760 & var28 * var32 >>> 8;
              var33 = var33 + var29 * 65793;
              lw.a(var23, var27, var25, (byte) -56, var22, var24, var26, (var33 & 16711422) >> 1);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_g;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = (var28 * var35 & -16711794) >>> 8 | (var28 * var36 & 16711732) >>> 8;
              var38 = var35 * var29 >>> 8 & -335609601 | (var36 * var29 & 16711773) >>> 8;
              var39 = (16711933 & var36 * var30) >>> 8 | (-16711773 & var35 * var30) >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + 65793 * var31;
              var39 = var39 + 65793 * var33;
              os.a(var26, (var38 & 65313) >> 8, var25, (65336 & var37) >> 8, var37 & 255, 255 & var39, (var39 & 65385) >> 8, var37 >> 16, var38 >> 16, var38 & 255, var24, var39 >> 16, var23, -15343, var27, var22);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("ei.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -23) {
          field_f = (String) null;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
          return param0 < 6144 ? -mg.field_b[param0 - 4096] : -mg.field_b[8192 - param0];
        }
        return param0 >= 2048 ? mg.field_b[-param0 + 4096] : mg.field_b[param0];
    }

    ei(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_g = param6;
          this.field_j = param4;
          this.field_l = param3;
          this.field_m = param7;
          this.field_h = param1;
          this.field_a = param2;
          this.field_i = param5;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        er.a((byte) 71, param0);
        if (null != sn.field_e) {
          ar.a(15707, sn.field_e);
        }
        if (param1) {
          field_n = true;
        }
    }

    static {
        field_c = "<%0>%";
        field_f = "Previous";
        field_n = true;
    }
}
