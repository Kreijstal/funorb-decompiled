/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    private static boolean field_a;
    private static int field_i;
    private static int[] field_n;
    private static int field_s;
    private static int field_j;
    private static int field_k;
    private static int[] field_b;
    private static int[] field_u;
    private static int[] field_q;
    private static int field_e;
    private static int[] field_d;
    private static int[] field_m;
    private static int[] field_l;
    private static int[] field_r;
    static int[] field_h;
    static int[] field_o;
    static int field_c;
    private static int field_t;
    private static int[] field_v;
    private static int[] field_f;
    private static boolean field_p;
    static int[] field_g;

    private final static void c() {
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
        var0 = ti.field_k;
        var1 = ti.field_f;
        var2 = 0;
        var3 = field_u[0];
        var4 = field_u[1];
        var5 = field_u[2];
        if (var3 < field_c) {
          var6 = field_f[0];
          var7 = field_m[0];
          var8 = field_k;
          if (var5 >= field_c) {
            var9 = (field_c - var3) * field_n[var5 - var3];
            field_b[var2] = var0 + (var6 + ((field_f[2] - var6) * var9 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7 + ((field_m[2] - var7) * var9 >> 16) << 9) / field_c;
            incrementValue$0 = var2;
            var2++;
            field_l[incrementValue$0] = var8 + ((field_s - var8) * var9 >> 16);
          }
          if (var4 >= field_c) {
            var9Lifetime4 = (field_c - var3) * field_n[var4 - var3];
            field_b[var2] = var0 + (var6 + ((field_f[1] - var6) * var9Lifetime4 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7 + ((field_m[1] - var7) * var9Lifetime4 >> 16) << 9) / field_c;
            incrementValue$1 = var2;
            var2++;
            field_l[incrementValue$1] = var8 + ((field_t - var8) * var9Lifetime4 >> 16);
          }
        } else {
          field_b[var2] = field_r[0];
          field_q[var2] = field_d[0];
          incrementValue$2 = var2;
          var2++;
          field_l[incrementValue$2] = field_k;
        }
        if (var4 < field_c) {
          var6Lifetime1 = field_f[1];
          var7Lifetime1 = field_m[1];
          var8Lifetime1 = field_t;
          if (var3 >= field_c) {
            var9Lifetime1 = (field_c - var4) * field_n[var3 - var4];
            field_b[var2] = var0 + (var6Lifetime1 + ((field_f[0] - var6Lifetime1) * var9Lifetime1 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7Lifetime1 + ((field_m[0] - var7Lifetime1) * var9Lifetime1 >> 16) << 9) / field_c;
            incrementValue$3 = var2;
            var2++;
            field_l[incrementValue$3] = var8Lifetime1 + ((field_k - var8Lifetime1) * var9Lifetime1 >> 16);
          }
          if (var5 >= field_c) {
            var9Lifetime1Lifetime1 = (field_c - var4) * field_n[var5 - var4];
            field_b[var2] = var0 + (var6Lifetime1 + ((field_f[2] - var6Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7Lifetime1 + ((field_m[2] - var7Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_c;
            incrementValue$4 = var2;
            var2++;
            field_l[incrementValue$4] = var8Lifetime1 + ((field_s - var8Lifetime1) * var9Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_b[var2] = field_r[1];
          field_q[var2] = field_d[1];
          incrementValue$5 = var2;
          var2++;
          field_l[incrementValue$5] = field_t;
        }
        if (var5 < field_c) {
          var6Lifetime2 = field_f[2];
          var7Lifetime2 = field_m[2];
          var8Lifetime2 = field_s;
          if (var4 >= field_c) {
            var9Lifetime2 = (field_c - var5) * field_n[var4 - var5];
            field_b[var2] = var0 + (var6Lifetime2 + ((field_f[1] - var6Lifetime2) * var9Lifetime2 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7Lifetime2 + ((field_m[1] - var7Lifetime2) * var9Lifetime2 >> 16) << 9) / field_c;
            incrementValue$6 = var2;
            var2++;
            field_l[incrementValue$6] = var8Lifetime2 + ((field_t - var8Lifetime2) * var9Lifetime2 >> 16);
          }
          if (var3 >= field_c) {
            var9Lifetime2Lifetime1 = (field_c - var5) * field_n[var3 - var5];
            field_b[var2] = var0 + (var6Lifetime2 + ((field_f[0] - var6Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_c;
            field_q[var2] = var1 + (var7Lifetime2 + ((field_m[0] - var7Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_c;
            incrementValue$7 = var2;
            var2++;
            field_l[incrementValue$7] = var8Lifetime2 + ((field_k - var8Lifetime2) * var9Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_b[var2] = field_r[2];
          field_q[var2] = field_d[2];
          incrementValue$8 = var2;
          var2++;
          field_l[incrementValue$8] = field_s;
        }
        var6Lifetime3 = field_b[0];
        var7Lifetime3 = field_b[1];
        var8Lifetime3 = field_b[2];
        var9Lifetime3 = field_q[0];
        var10 = field_q[1];
        var11 = field_q[2];
        ti.field_c = false;
        if (var2 == 3) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= ti.field_e) ||
            !(var7Lifetime3 <= ti.field_e) ||
            !(var8Lifetime3 <= ti.field_e)) {
            ti.field_c = true;
          }
          var12 = field_i & 3;
          if (var12 != 0) {
            if (var12 != 1) {
              if (var12 != 2) {
                if (var12 == 3) {
                  ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                }
              } else {
                ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_l[0], field_l[1], field_l[2], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
              }
            } else {
              ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_v[field_k]);
            }
          } else {
            ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_l[0], field_l[1], field_l[2]);
          }
        }
        if (var2 == 4) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= ti.field_e) ||
            !(var7Lifetime3 <= ti.field_e) ||
            !(var8Lifetime3 <= ti.field_e) ||
            !(field_b[3] >= 0) ||
            !(field_b[3] <= ti.field_e)) {
            ti.field_c = true;
          }
          var12Lifetime1 = field_i & 3;
          if (var12Lifetime1 != 0) {
            if (var12Lifetime1 != 1) {
              if (var12Lifetime1 != 2) {
                if (var12Lifetime1 == 3) {
                  ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                  ti.a(var9Lifetime3, var11, field_q[3], var6Lifetime3, var8Lifetime3, field_b[3], field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                }
              } else {
                ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_l[0], field_l[1], field_l[2], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                ti.a(var9Lifetime3, var11, field_q[3], var6Lifetime3, var8Lifetime3, field_b[3], field_l[0], field_l[2], field_l[3], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
              }
            } else {
              var13 = field_v[field_k];
              ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, var13);
              ti.a(var9Lifetime3, var11, field_q[3], var6Lifetime3, var8Lifetime3, field_b[3], var13);
            }
          } else {
            ti.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_l[0], field_l[1], field_l[2]);
            ti.a(var9Lifetime3, var11, field_q[3], var6Lifetime3, var8Lifetime3, field_b[3], field_l[0], field_l[2], field_l[3]);
          }
        }
    }

    public static void b() {
        field_r = null;
        field_d = null;
        field_f = null;
        field_m = null;
        field_u = null;
        field_h = null;
        field_g = null;
        field_o = null;
        field_b = null;
        field_q = null;
        field_l = null;
        field_v = null;
        field_n = null;
    }

    private final static void a() {
        if (field_p) {
          t.c();
          return;
        }
        ti.field_c = field_a;
        ti.field_h = field_j;
        int var0 = field_i & 3;
        if (var0 == 0) {
          ti.a(field_d[0], field_d[1], field_d[2], field_r[0], field_r[1], field_r[2], field_k, field_t, field_s);
        } else {
          if (var0 == 1) {
            ti.a(field_d[0], field_d[1], field_d[2], field_r[0], field_r[1], field_r[2], field_v[field_k]);
          } else {
            if (var0 == 2) {
              ti.a(field_d[0], field_d[1], field_d[2], field_r[0], field_r[1], field_r[2], field_k, field_t, field_s, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
            } else {
              if (var0 == 3) {
                ti.a(field_d[0], field_d[1], field_d[2], field_r[0], field_r[1], field_r[2], field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int[] param5, int param6, int param7, int param8) {
        int var12_int = 0;
        Throwable decompiledCaughtException = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Exception var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        field_j = param0;
        field_i = param1;
        field_e = param2;
        field_k = param6;
        field_t = param7;
        field_s = param8;
        var9 = ti.field_k;
        var10 = ti.field_f;
        var11 = 0;
        for (var12_int = 0; var12_int < 3; var12_int++) {
          var13 = param3[var12_int];
          var14 = param4[var12_int];
          var15 = param5[var12_int];
          if (var15 < field_c) {
            field_r[var12_int] = -5000;
            var11 = 1;
          } else {
            field_r[var12_int] = var9 + (var13 << 9) / var15;
            field_d[var12_int] = var10 + (var14 << 9) / var15;
          }
          field_f[var12_int] = var13;
          field_m[var12_int] = var14;
          field_u[var12_int] = var15;
        }
        try {
          t.a(var11 != 0, false, 0);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = (Exception) (Object) decompiledCaughtException;
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
        if (field_i == -1) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = field_r[0];
        var4 = field_r[1];
        var5 = field_r[2];
        if (param0 && (var3 == -5000 ||
          var4 == -5000 ||
          var5 == -5000)) {
          var6 = field_f[0];
          var7 = field_f[1];
          var8 = field_f[2];
          var9 = field_m[0];
          var10 = field_m[1];
          var11 = field_m[2];
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
          field_p = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          if ((var3 - var4) * (field_d[2] - field_d[1]) - (field_d[0] - field_d[1]) * (var5 - var4) <= 0) {
            return;
          }
          field_p = false;
          if (var3 >= 0 &&
            var4 >= 0 &&
            var5 >= 0 &&
            var3 <= ti.field_e &&
            var4 <= ti.field_e &&
            var5 <= ti.field_e) {
            field_a = false;
          } else {
            field_a = true;
          }
        }
        t.a();
    }

    static {
        field_d = new int[3];
        field_u = new int[3];
        field_n = ti.field_i;
        field_h = new int[3];
        field_m = new int[3];
        field_c = 50;
        field_r = new int[3];
        field_q = new int[10];
        field_l = new int[10];
        field_v = ti.field_o;
        field_o = new int[3];
        field_g = new int[3];
        field_f = new int[3];
        field_b = new int[10];
    }
}
