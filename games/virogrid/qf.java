/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    private static boolean field_h;
    private static int[] field_f;
    private static int[] field_v;
    private static int field_m;
    private static int[] field_a;
    private static int[] field_u;
    private static int field_p;
    private static int field_b;
    private static int[] field_e;
    private static int[] field_j;
    private static int[] field_c;
    private static int field_q;
    private static int field_d;
    private static int[] field_g;
    private static int[] field_n;
    private static boolean field_o;
    private static int field_t;
    private static int[] field_i;
    private static int field_k;
    private static int[] field_r;
    private static int[] field_s;
    private static int[] field_l;

    private final static void b() {
        if (field_o) {
          qf.a();
          return;
        }
        fk.field_g = field_h;
        fk.field_d = field_p;
        int var0 = field_q & 3;
        if (var0 == 0) {
          fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_t, field_d);
        } else {
          if (var0 == 1) {
            fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_j[field_m]);
          } else {
            if (var0 == 2) {
              fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_t, field_d, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
            } else {
              if (var0 == 3) {
                fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
              }
            }
          }
        }
    }

    private final static void a() {
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
        var0 = fk.field_j;
        var1 = fk.field_k;
        var2 = 0;
        var3 = field_a[0];
        var4 = field_a[1];
        var5 = field_a[2];
        if (var3 < field_k) {
          var6 = field_g[0];
          var7 = field_l[0];
          var8 = field_m;
          if (var5 >= field_k) {
            var9 = (field_k - var3) * field_c[var5 - var3];
            field_r[var2] = var0 + (var6 + ((field_g[2] - var6) * var9 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7 + ((field_l[2] - var7) * var9 >> 16) << 9) / field_k;
            incrementValue$0 = var2;
            var2++;
            field_n[incrementValue$0] = var8 + ((field_d - var8) * var9 >> 16);
          }
          if (var4 >= field_k) {
            var9Lifetime4 = (field_k - var3) * field_c[var4 - var3];
            field_r[var2] = var0 + (var6 + ((field_g[1] - var6) * var9Lifetime4 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7 + ((field_l[1] - var7) * var9Lifetime4 >> 16) << 9) / field_k;
            incrementValue$1 = var2;
            var2++;
            field_n[incrementValue$1] = var8 + ((field_t - var8) * var9Lifetime4 >> 16);
          }
        } else {
          field_r[var2] = field_e[0];
          field_s[var2] = field_v[0];
          incrementValue$2 = var2;
          var2++;
          field_n[incrementValue$2] = field_m;
        }
        if (var4 < field_k) {
          var6Lifetime1 = field_g[1];
          var7Lifetime1 = field_l[1];
          var8Lifetime1 = field_t;
          if (var3 >= field_k) {
            var9Lifetime1 = (field_k - var4) * field_c[var3 - var4];
            field_r[var2] = var0 + (var6Lifetime1 + ((field_g[0] - var6Lifetime1) * var9Lifetime1 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7Lifetime1 + ((field_l[0] - var7Lifetime1) * var9Lifetime1 >> 16) << 9) / field_k;
            incrementValue$3 = var2;
            var2++;
            field_n[incrementValue$3] = var8Lifetime1 + ((field_m - var8Lifetime1) * var9Lifetime1 >> 16);
          }
          if (var5 >= field_k) {
            var9Lifetime1Lifetime1 = (field_k - var4) * field_c[var5 - var4];
            field_r[var2] = var0 + (var6Lifetime1 + ((field_g[2] - var6Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7Lifetime1 + ((field_l[2] - var7Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / field_k;
            incrementValue$4 = var2;
            var2++;
            field_n[incrementValue$4] = var8Lifetime1 + ((field_d - var8Lifetime1) * var9Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_r[var2] = field_e[1];
          field_s[var2] = field_v[1];
          incrementValue$5 = var2;
          var2++;
          field_n[incrementValue$5] = field_t;
        }
        if (var5 < field_k) {
          var6Lifetime2 = field_g[2];
          var7Lifetime2 = field_l[2];
          var8Lifetime2 = field_d;
          if (var4 >= field_k) {
            var9Lifetime2 = (field_k - var5) * field_c[var4 - var5];
            field_r[var2] = var0 + (var6Lifetime2 + ((field_g[1] - var6Lifetime2) * var9Lifetime2 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7Lifetime2 + ((field_l[1] - var7Lifetime2) * var9Lifetime2 >> 16) << 9) / field_k;
            incrementValue$6 = var2;
            var2++;
            field_n[incrementValue$6] = var8Lifetime2 + ((field_t - var8Lifetime2) * var9Lifetime2 >> 16);
          }
          if (var3 >= field_k) {
            var9Lifetime2Lifetime1 = (field_k - var5) * field_c[var3 - var5];
            field_r[var2] = var0 + (var6Lifetime2 + ((field_g[0] - var6Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_k;
            field_s[var2] = var1 + (var7Lifetime2 + ((field_l[0] - var7Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / field_k;
            incrementValue$7 = var2;
            var2++;
            field_n[incrementValue$7] = var8Lifetime2 + ((field_m - var8Lifetime2) * var9Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_r[var2] = field_e[2];
          field_s[var2] = field_v[2];
          incrementValue$8 = var2;
          var2++;
          field_n[incrementValue$8] = field_d;
        }
        var6Lifetime3 = field_r[0];
        var7Lifetime3 = field_r[1];
        var8Lifetime3 = field_r[2];
        var9Lifetime3 = field_s[0];
        var10 = field_s[1];
        var11 = field_s[2];
        fk.field_g = false;
        if (var2 == 3) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= fk.field_o) ||
            !(var7Lifetime3 <= fk.field_o) ||
            !(var8Lifetime3 <= fk.field_o)) {
            fk.field_g = true;
          }
          var12 = field_q & 3;
          if (var12 != 0) {
            if (var12 != 1) {
              if (var12 != 2) {
                if (var12 == 3) {
                  fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                }
              } else {
                fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n[0], field_n[1], field_n[2], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
              }
            } else {
              fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_j[field_m]);
            }
          } else {
            fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n[0], field_n[1], field_n[2]);
          }
        }
        if (var2 == 4) {
          if (var6Lifetime3 < 0 ||
            var7Lifetime3 < 0 ||
            var8Lifetime3 < 0 ||
            !(var6Lifetime3 <= fk.field_o) ||
            !(var7Lifetime3 <= fk.field_o) ||
            !(var8Lifetime3 <= fk.field_o) ||
            !(field_r[3] >= 0) ||
            !(field_r[3] <= fk.field_o)) {
            fk.field_g = true;
          }
          var12Lifetime1 = field_q & 3;
          if (var12Lifetime1 != 0) {
            if (var12Lifetime1 != 1) {
              if (var12Lifetime1 != 2) {
                if (var12Lifetime1 == 3) {
                  fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                  fk.a(var9Lifetime3, var11, field_s[3], var6Lifetime3, var8Lifetime3, field_r[3], field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                }
              } else {
                fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n[0], field_n[1], field_n[2], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                fk.a(var9Lifetime3, var11, field_s[3], var6Lifetime3, var8Lifetime3, field_r[3], field_n[0], field_n[2], field_n[3], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
              }
            } else {
              var13 = field_j[field_m];
              fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, var13);
              fk.a(var9Lifetime3, var11, field_s[3], var6Lifetime3, var8Lifetime3, field_r[3], var13);
            }
          } else {
            fk.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_n[0], field_n[1], field_n[2]);
            fk.a(var9Lifetime3, var11, field_s[3], var6Lifetime3, var8Lifetime3, field_r[3], field_n[0], field_n[2], field_n[3]);
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
        if (field_q == -1) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = field_e[0];
        var4 = field_e[1];
        var5 = field_e[2];
        if (param0 && (var3 == -5000 ||
          var4 == -5000 ||
          var5 == -5000)) {
          var6 = field_g[0];
          var7 = field_g[1];
          var8 = field_g[2];
          var9 = field_l[0];
          var10 = field_l[1];
          var11 = field_l[2];
          var12 = field_a[0];
          var13 = field_a[1];
          var14 = field_a[2];
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
          field_o = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          if ((var3 - var4) * (field_v[2] - field_v[1]) - (field_v[0] - field_v[1]) * (var5 - var4) <= 0) {
            return;
          }
          field_o = false;
          if (var3 >= 0 &&
            var4 >= 0 &&
            var5 >= 0 &&
            var3 <= fk.field_o &&
            var4 <= fk.field_o &&
            var5 <= fk.field_o) {
            field_h = false;
          } else {
            field_h = true;
          }
        }
        qf.b();
    }

    public static void c() {
        field_e = null;
        field_v = null;
        field_g = null;
        field_l = null;
        field_a = null;
        field_f = null;
        field_i = null;
        field_u = null;
        field_r = null;
        field_s = null;
        field_n = null;
        field_j = null;
        field_c = null;
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
        field_p = param0;
        field_q = param1;
        field_b = param2;
        field_m = param6;
        field_t = param7;
        field_d = param8;
        var9 = fk.field_j;
        var10 = fk.field_k;
        var11 = 0;
        for (var12_int = 0; var12_int < 3; var12_int++) {
          var13 = param3[var12_int];
          var14 = param4[var12_int];
          var15 = param5[var12_int];
          if (var15 < field_k) {
            field_e[var12_int] = -5000;
            var11 = 1;
          } else {
            field_e[var12_int] = var9 + (var13 << 9) / var15;
            field_v[var12_int] = var10 + (var14 << 9) / var15;
          }
          field_g[var12_int] = var13;
          field_l[var12_int] = var14;
          field_a[var12_int] = var15;
        }
        try {
          qf.a(var11 != 0, false, 0);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = (Exception) (Object) decompiledCaughtException;
        }
    }

    static {
        field_a = new int[3];
        field_j = fk.field_l;
        field_e = new int[3];
        field_u = new int[3];
        field_c = fk.field_a;
        field_i = new int[3];
        field_v = new int[3];
        field_k = 50;
        field_r = new int[10];
        field_g = new int[3];
        field_s = new int[10];
        field_f = new int[3];
        field_n = new int[10];
        field_l = new int[3];
    }
}
