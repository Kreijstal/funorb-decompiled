/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    private static int[] field_j;
    private static int[] field_k;
    private static int field_s;
    private static int field_g;
    private static int field_b;
    private static int[] field_v;
    private static int[] field_a;
    private static int[] field_p;
    private static int field_r;
    private static int[] field_d;
    private static int field_f;
    private static boolean field_i;
    private static int[] field_o;
    private static int field_m;
    private static int[] field_u;
    private static int[] field_e;
    private static int field_n;
    private static int[] field_q;
    private static int[] field_h;
    private static int[] field_t;
    private static int[] field_c;
    private static boolean field_l;

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        Throwable decompiledCaughtException = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Exception var18 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        field_s = param0;
        field_m = param1;
        field_r = param2;
        field_n = param9;
        field_g = param10;
        field_b = param11;
        var12 = cc.field_n;
        var13 = cc.field_p;
        var14 = 0;
        var15 = param3[param6];
        var16 = param4[param6];
        var17 = param5[param6];
        if (var17 < field_f) {
          field_q[0] = -5000;
          var14 = 1;
        } else {
          field_q[0] = var12 + (var15 << 9) / var17;
          field_a[0] = var13 + (var16 << 9) / var17;
        }
        field_c[0] = var15;
        field_k[0] = var16;
        field_u[0] = var17;
        var15Lifetime1 = param3[param7];
        var16Lifetime1 = param4[param7];
        var17Lifetime1 = param5[param7];
        if (var17Lifetime1 < field_f) {
          field_q[1] = -5000;
          var14 = 1;
        } else {
          field_q[1] = var12 + (var15Lifetime1 << 9) / var17Lifetime1;
          field_a[1] = var13 + (var16Lifetime1 << 9) / var17Lifetime1;
        }
        field_c[1] = var15Lifetime1;
        field_k[1] = var16Lifetime1;
        field_u[1] = var17Lifetime1;
        var15Lifetime2 = param3[param8];
        var16Lifetime2 = param4[param8];
        var17Lifetime2 = param5[param8];
        if (var17Lifetime2 < field_f) {
          field_q[2] = -5000;
          var14 = 1;
        } else {
          field_q[2] = var12 + (var15Lifetime2 << 9) / var17Lifetime2;
          field_a[2] = var13 + (var16Lifetime2 << 9) / var17Lifetime2;
        }
        field_c[2] = var15Lifetime2;
        field_k[2] = var16Lifetime2;
        field_u[2] = var17Lifetime2;
        try {
          qa.a(var14 != 0, false, 0);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = (Exception) (Object) decompiledCaughtException;
        }
    }

    private final static void a() {
        int var0 = 0;
        if (!field_i) {
          cc.field_q = field_l;
          cc.field_d = field_s;
          var0 = field_m & 3;
          if (var0 == 0) {
            cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_g, field_b);
          } else {
            if (var0 == 1) {
              cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_t[field_n]);
            } else {
              if (var0 == 2) {
                cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_g, field_b, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
              } else {
                if (var0 == 3) {
                  cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                }
              }
            }
          }
          return;
        }
        qa.b();
    }

    final static void a(int[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int[] param6, int[] param7, int param8, int param9, int param10) {
        int var11 = param6[param8];
        int var12 = param7[param8];
        int var13 = param6[param9];
        int var14 = param7[param9];
        int var15 = param6[param10];
        int var16 = param7[param10];
        int var17 = var13 * var16 - var15 * var14 + 2048 >> 12;
        int var18 = var14 * 4096 - var16 * 4096 + 2048 >> 12;
        int var19 = 4096 * var15 - 4096 * var13 + 2048 >> 12;
        int var20 = var15 * var12 - var11 * var16 + 2048 >> 12;
        int var21 = var16 * 4096 - var12 * 4096 + 2048 >> 12;
        int var22 = 4096 * var11 - 4096 * var15 + 2048 >> 12;
        int var23 = var11 * var14 - var13 * var12 + 2048 >> 12;
        int var24 = var12 * 4096 - var14 * 4096 + 2048 >> 12;
        int var25 = 4096 * var13 - 4096 * var11 + 2048 >> 12;
        int var26 = 16777216 / (4096 * var17 + var11 * var18 + var12 * var19 + 2048 >> 12);
        var17 = var17 * var26 + 2048 >> 12;
        var20 = var20 * var26 + 2048 >> 12;
        var23 = var23 * var26 + 2048 >> 12;
        var18 = var18 * var26 + 2048 >> 12;
        var21 = var21 * var26 + 2048 >> 12;
        var24 = var24 * var26 + 2048 >> 12;
        var19 = var19 * var26 + 2048 >> 12;
        var22 = var22 * var26 + 2048 >> 12;
        var25 = var25 * var26 + 2048 >> 12;
        int var27 = param0[param3];
        int var28 = param1[param3];
        int var29 = param2[param3];
        int var30 = param0[param4];
        int var31 = param1[param4];
        int var32 = param2[param4];
        int var33 = param0[param5];
        int var34 = param1[param5];
        int var35 = param2[param5];
        var26 = var27 * var17 + var30 * var20 + var33 * var23;
        field_v[0] = var27 * var17 + var30 * var20 + var33 * var23 + 2048 >> 12;
        field_v[1] = var26 + var27 * var18 + var30 * var21 + var33 * var24 + 2048 >> 12;
        field_v[2] = var26 + var27 * var19 + var30 * var22 + var33 * var25 + 2048 >> 12;
        var26 = var28 * var17 + var31 * var20 + var34 * var23;
        field_o[0] = var28 * var17 + var31 * var20 + var34 * var23 + 2048 >> 12;
        field_o[1] = var26 + var28 * var18 + var31 * var21 + var34 * var24 + 2048 >> 12;
        field_o[2] = var26 + var28 * var19 + var31 * var22 + var34 * var25 + 2048 >> 12;
        var26 = var29 * var17 + var32 * var20 + var35 * var23;
        field_j[0] = var29 * var17 + var32 * var20 + var35 * var23 + 2048 >> 12;
        field_j[1] = var26 + var29 * var18 + var32 * var21 + var35 * var24 + 2048 >> 12;
        field_j[2] = var26 + var29 * var19 + var32 * var22 + var35 * var25 + 2048 >> 12;
    }

    public static void c() {
        field_q = null;
        field_a = null;
        field_c = null;
        field_k = null;
        field_u = null;
        field_v = null;
        field_o = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_t = null;
        field_p = null;
    }

    private final static void b() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var12Lifetime1;
        int var9Lifetime4;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        var0 = cc.field_n;
        var1 = cc.field_p;
        var2 = 0;
        var3 = field_u[0];
        var4 = field_u[1];
        var5 = field_u[2];
        if (var3 < field_f) {
          var6 = field_c[0];
          var7 = field_k[0];
          var8 = field_n;
          if (var5 >= field_f) {
            var9 = (field_f - var3) * field_p[var5 - var3];
            field_h[var2] = var0 + (var6 + ((field_c[2] - var6) * var9 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7 + ((field_k[2] - var7) * var9 >> 16) << 9) / field_f;
            incrementValue$0 = var2;
            var2++;
            field_d[incrementValue$0] = var8 + ((field_b - var8) * var9 >> 16);
          }
          if (var4 >= field_f) {
            var9Lifetime4 = (field_f - var3) * field_p[var4 - var3];
            field_h[var2] = var0 + (var6 + ((field_c[1] - var6) * var9Lifetime4 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7 + ((field_k[1] - var7) * var9Lifetime4 >> 16) << 9) / field_f;
            incrementValue$1 = var2;
            var2++;
            field_d[incrementValue$1] = var8 + ((field_g - var8) * var9Lifetime4 >> 16);
          }
        } else {
          field_h[var2] = field_q[0];
          field_e[var2] = field_a[0];
          incrementValue$2 = var2;
          var2++;
          field_d[incrementValue$2] = field_n;
        }
        if (var4 < field_f) {
          var6Lifetime1 = field_c[1];
          var7Lifetime1 = field_k[1];
          var8Lifetime1 = field_g;
          if (var3 >= field_f) {
            var9Lifetime1 = (field_f - var4) * field_p[var3 - var4];
            field_h[var2] = var0 + (var6Lifetime1 + ((field_c[0] - var6Lifetime1) * var9Lifetime1 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7Lifetime1 + ((field_k[0] - var7Lifetime1) * var9Lifetime1 >> 16) << 9) / field_f;
            incrementValue$3 = var2;
            var2++;
            field_d[incrementValue$3] = var8Lifetime1 + ((field_n - var8Lifetime1) * var9Lifetime1 >> 16);
          }
          if (var5 >= field_f) {
            var9Lifetime1Lifetime1 = (field_f - var4) * field_p[var5 - var4];
            field_h[var2] = var0 + (var6Lifetime1 + ((field_c[2] - var6Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7Lifetime1 + ((field_k[2] - var7Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_f;
            incrementValue$4 = var2;
            var2++;
            field_d[incrementValue$4] = var8Lifetime1 + ((field_b - var8Lifetime1) * var9Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_h[var2] = field_q[1];
          field_e[var2] = field_a[1];
          incrementValue$5 = var2;
          var2++;
          field_d[incrementValue$5] = field_g;
        }
        if (var5 < field_f) {
          var6Lifetime2 = field_c[2];
          var7Lifetime2 = field_k[2];
          var8Lifetime2 = field_b;
          if (var4 >= field_f) {
            var9Lifetime2 = (field_f - var5) * field_p[var4 - var5];
            field_h[var2] = var0 + (var6Lifetime2 + ((field_c[1] - var6Lifetime2) * var9Lifetime2 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7Lifetime2 + ((field_k[1] - var7Lifetime2) * var9Lifetime2 >> 16) << 9) / field_f;
            incrementValue$6 = var2;
            var2++;
            field_d[incrementValue$6] = var8Lifetime2 + ((field_g - var8Lifetime2) * var9Lifetime2 >> 16);
          }
          if (var3 >= field_f) {
            var9Lifetime2Lifetime1 = (field_f - var5) * field_p[var3 - var5];
            field_h[var2] = var0 + (var6Lifetime2 + ((field_c[0] - var6Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_f;
            field_e[var2] = var1 + (var7Lifetime2 + ((field_k[0] - var7Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_f;
            incrementValue$7 = var2;
            var2++;
            field_d[incrementValue$7] = var8Lifetime2 + ((field_n - var8Lifetime2) * var9Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_h[var2] = field_q[2];
          field_e[var2] = field_a[2];
          incrementValue$8 = var2;
          var2++;
          field_d[incrementValue$8] = field_b;
        }
        var6Lifetime3 = field_h[0];
        var7Lifetime3 = field_h[1];
        var8Lifetime3 = field_h[2];
        var9Lifetime3 = field_e[0];
        var10 = field_e[1];
        var11 = field_e[2];
        cc.field_q = false;
        if (var2 == 3) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= cc.field_m) ||
            !(var7Lifetime3 <= cc.field_m) ||
            !(var8Lifetime3 <= cc.field_m)) {
            cc.field_q = true;
          }
          var12 = field_m & 3;
          if (var12 != 0) {
            if (var12 != 1) {
              if (var12 != 2) {
                if (var12 == 3) {
                  cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                }
              } else {
                cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_d[0], field_d[1], field_d[2], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
              }
            } else {
              cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_t[field_n]);
            }
          } else {
            cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_d[0], field_d[1], field_d[2]);
          }
        }
        if (var2 == 4) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= cc.field_m) ||
            !(var7Lifetime3 <= cc.field_m) ||
            !(var8Lifetime3 <= cc.field_m) ||
            !(field_h[3] >= 0) ||
            !(field_h[3] <= cc.field_m)) {
            cc.field_q = true;
          }
          var12Lifetime1 = field_m & 3;
          if (var12Lifetime1 != 0) {
            if (var12Lifetime1 != 1) {
              if (var12Lifetime1 != 2) {
                if (var12Lifetime1 == 3) {
                  cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                  cc.a(var9Lifetime3, var11, field_e[3], var6Lifetime3, var8Lifetime3, field_h[3], field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                }
              } else {
                cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_d[0], field_d[1], field_d[2], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                cc.a(var9Lifetime3, var11, field_e[3], var6Lifetime3, var8Lifetime3, field_h[3], field_d[0], field_d[2], field_d[3], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
              }
            } else {
              var13 = field_t[field_n];
              cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, var13);
              cc.a(var9Lifetime3, var11, field_e[3], var6Lifetime3, var8Lifetime3, field_h[3], var13);
            }
          } else {
            cc.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_d[0], field_d[1], field_d[2]);
            cc.a(var9Lifetime3, var11, field_e[3], var6Lifetime3, var8Lifetime3, field_h[3], field_d[0], field_d[2], field_d[3]);
          }
        }
    }

    private final static void a(boolean param0, boolean param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        if (field_m == -1) {
          return;
        }
        var3 = field_q[0];
        var4 = field_q[1];
        var5 = field_q[2];
        if (param0 && (var3 == -5000 ||
          var4 == -5000 ||
          var5 == -5000)) {
          var6 = field_c[0];
          var7 = field_c[1];
          var8 = field_c[2];
          var9 = field_k[0];
          var10 = field_k[1];
          var11 = field_k[2];
          var12 = field_u[0];
          var13 = field_u[1];
          var14 = field_u[2];
          var6 = var6 - var7;
          var8 = var8 - var7;
          var9 = var9 - var10;
          var11 = var11 - var10;
          var12 = var12 - var13;
          var14 = var14 - var13;
          var15 = var9 * var14 - var12 * var11;
          var16 = var12 * var8 - var6 * var14;
          var17 = var6 * var11 - var9 * var8;
          if (var7 * var15 + var10 * var16 + var13 * var17 <= 0) {
            return;
          }
          field_i = true;
          qa.a();
          return;
        }
        if ((var3 - var4) * (field_a[2] - field_a[1]) - (field_a[0] - field_a[1]) * (var5 - var4) <= 0) {
          return;
        }
        field_i = false;
        if (var3 >= 0 &&
          var4 >= 0 &&
          var5 >= 0 &&
          var3 <= cc.field_m &&
          var4 <= cc.field_m &&
          var5 <= cc.field_m) {
          field_l = false;
        } else {
          field_l = true;
        }
        qa.a();
    }

    static {
        field_p = cc.field_l;
        field_o = new int[3];
        field_v = new int[3];
        field_e = new int[10];
        field_d = new int[10];
        field_a = new int[3];
        field_k = new int[3];
        field_f = 50;
        field_q = new int[3];
        field_h = new int[10];
        field_j = new int[3];
        field_u = new int[3];
        field_c = new int[3];
        field_t = cc.field_e;
    }
}
