/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private static boolean field_m;
    private static int[] field_c;
    private static int[] field_j;
    private static boolean field_h;
    private static int[] field_e;
    private static int[] field_k;
    private static int[] field_g;
    private static int field_i;
    private static int[] field_n;
    private static int[] field_o;
    private static int field_l;
    private static int[] field_b;
    private static int field_f;
    private static int[] field_p;
    private static int[] field_a;
    private static int[] field_q;
    private static int field_r;
    private static int field_d;

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if ((param3 >= 0 ||
          param4 >= 0 ||
          param5 >= 0) &&
          (!(param3 > be.field_p) ||
          !(param4 > be.field_p) ||
          !(param5 > be.field_p)) &&
          (param0 >= 0 ||
          param1 >= 0 ||
          param2 >= 0) &&
          (!(param0 > be.field_f) ||
          !(param1 > be.field_f) ||
          !(param2 > be.field_f))) {
          be.a(param0, param1, param2, param3, param4, param5, param6);
          return;
        }
    }

    private final static void a() {
        int var0;
        if (field_h) {
          nf.b();
          return;
        }
        be.field_q = field_m;
        be.field_h = 0;
        var0 = field_r & 3;
        if (var0 != 0) {
          if (var0 != 1) {
            if (var0 != 2) {
              if (var0 == 3) {
                nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
              }
            } else {
              nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_i, field_d, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
            }
          } else {
            nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], be.field_a[field_f]);
          }
        } else {
          nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_i, field_d);
        }
        return;
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
        boolean stackIn_28_0 = false;
        boolean stackIn_48_0 = false;
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
        var0 = be.field_g;
        var1 = be.field_b;
        var2 = 0;
        var3 = field_c[0];
        var4 = field_c[1];
        var5 = field_c[2];
        if (var3 < 50) {
          var6 = field_p[0];
          var7 = field_b[0];
          var8 = field_f;
          if (var5 >= 50) {
            var9 = (50 - var3) * be.field_e[var5 - var3];
            field_g[var2] = var0 + (var6 + ((field_p[2] - var6) * var9 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7 + ((field_b[2] - var7) * var9 >> 16) << 9) / 50;
            incrementValue$0 = var2;
            var2++;
            field_a[incrementValue$0] = var8 + ((field_d - var8) * var9 >> 16);
          }
          if (var4 >= 50) {
            var9Lifetime4 = (50 - var3) * be.field_e[var4 - var3];
            field_g[var2] = var0 + (var6 + ((field_p[1] - var6) * var9Lifetime4 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7 + ((field_b[1] - var7) * var9Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var2;
            var2++;
            field_a[incrementValue$1] = var8 + ((field_i - var8) * var9Lifetime4 >> 16);
          }
        } else {
          field_g[var2] = field_q[0];
          field_o[var2] = field_j[0];
          incrementValue$2 = var2;
          var2++;
          field_a[incrementValue$2] = field_f;
        }
        if (var4 < 50) {
          var6Lifetime1 = field_p[1];
          var7Lifetime1 = field_b[1];
          var8Lifetime1 = field_i;
          if (var3 >= 50) {
            var9Lifetime1 = (50 - var4) * be.field_e[var3 - var4];
            field_g[var2] = var0 + (var6Lifetime1 + ((field_p[0] - var6Lifetime1) * var9Lifetime1 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7Lifetime1 + ((field_b[0] - var7Lifetime1) * var9Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var2;
            var2++;
            field_a[incrementValue$3] = var8Lifetime1 + ((field_f - var8Lifetime1) * var9Lifetime1 >> 16);
          }
          if (var5 >= 50) {
            var9Lifetime1Lifetime1 = (50 - var4) * be.field_e[var5 - var4];
            field_g[var2] = var0 + (var6Lifetime1 + ((field_p[2] - var6Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7Lifetime1 + ((field_b[2] - var7Lifetime1) * var9Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var2;
            var2++;
            field_a[incrementValue$4] = var8Lifetime1 + ((field_d - var8Lifetime1) * var9Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_g[var2] = field_q[1];
          field_o[var2] = field_j[1];
          incrementValue$5 = var2;
          var2++;
          field_a[incrementValue$5] = field_i;
        }
        if (var5 < 50) {
          var6Lifetime2 = field_p[2];
          var7Lifetime2 = field_b[2];
          var8Lifetime2 = field_d;
          if (var4 >= 50) {
            var9Lifetime2 = (50 - var5) * be.field_e[var4 - var5];
            field_g[var2] = var0 + (var6Lifetime2 + ((field_p[1] - var6Lifetime2) * var9Lifetime2 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7Lifetime2 + ((field_b[1] - var7Lifetime2) * var9Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var2;
            var2++;
            field_a[incrementValue$6] = var8Lifetime2 + ((field_i - var8Lifetime2) * var9Lifetime2 >> 16);
          }
          if (var3 >= 50) {
            var9Lifetime2Lifetime1 = (50 - var5) * be.field_e[var3 - var5];
            field_g[var2] = var0 + (var6Lifetime2 + ((field_p[0] - var6Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_o[var2] = var1 + (var7Lifetime2 + ((field_b[0] - var7Lifetime2) * var9Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var2;
            var2++;
            field_a[incrementValue$7] = var8Lifetime2 + ((field_f - var8Lifetime2) * var9Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_g[var2] = field_q[2];
          field_o[var2] = field_j[2];
          incrementValue$8 = var2;
          var2++;
          field_a[incrementValue$8] = field_d;
        }
        var6Lifetime3 = field_g[0];
        var7Lifetime3 = field_g[1];
        var8Lifetime3 = field_g[2];
        var9Lifetime3 = field_o[0];
        var10 = field_o[1];
        var11 = field_o[2];
        if (var2 == 3) {
          stackIn_28_0 = !(var6Lifetime3 >= ph.field_k) || !(var7Lifetime3 >= ph.field_k) || !(var8Lifetime3 >= ph.field_k) || !(var6Lifetime3 <= ph.field_a) || !(var7Lifetime3 <= ph.field_a) || !(var8Lifetime3 <= ph.field_a);
          be.field_q = stackIn_28_0;
          var12 = field_r & 3;
          if (var12 != 0) {
            if (var12 != 1) {
              if (var12 != 2) {
                if (var12 == 3) {
                  nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                }
              } else {
                nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
              }
            } else {
              nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, be.field_a[field_f]);
            }
          } else {
            nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_a[0], field_a[1], field_a[2]);
          }
        }
        if (var2 == 4) {
          stackIn_48_0 = !(var6Lifetime3 >= ph.field_k) || !(var7Lifetime3 >= ph.field_k) || !(var8Lifetime3 >= ph.field_k) || !(var6Lifetime3 <= ph.field_a) || !(var7Lifetime3 <= ph.field_a) || !(var8Lifetime3 <= ph.field_a) || !(field_g[3] >= 0) || !(field_g[3] <= ph.field_a);
          be.field_q = stackIn_48_0;
          var12Lifetime1 = field_r & 3;
          if (var12Lifetime1 != 0) {
            if (var12Lifetime1 != 1) {
              if (var12Lifetime1 != 2) {
                if (var12Lifetime1 == 3) {
                  nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                  nf.a(var9Lifetime3, var11, field_o[3], var6Lifetime3, var8Lifetime3, field_g[3], field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                }
              } else {
                nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                nf.a(var9Lifetime3, var11, field_o[3], var6Lifetime3, var8Lifetime3, field_g[3], field_a[0], field_a[2], field_a[3], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
              }
            } else {
              var13 = be.field_a[field_f];
              nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, var13);
              nf.a(var9Lifetime3, var11, field_o[3], var6Lifetime3, var8Lifetime3, field_g[3], var13);
            }
          } else {
            nf.a(var9Lifetime3, var10, var11, var6Lifetime3, var7Lifetime3, var8Lifetime3, field_a[0], field_a[1], field_a[2]);
            nf.a(var9Lifetime3, var11, field_o[3], var6Lifetime3, var8Lifetime3, field_g[3], field_a[0], field_a[2], field_a[3]);
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if ((param3 >= 0 ||
          param4 >= 0 ||
          param5 >= 0) &&
          (!(param3 > be.field_p) ||
          !(param4 > be.field_p) ||
          !(param5 > be.field_p)) &&
          (param0 >= 0 ||
          param1 >= 0 ||
          param2 >= 0) &&
          (!(param0 > be.field_f) ||
          !(param1 > be.field_f) ||
          !(param2 > be.field_f))) {
          be.a(param0, param1, param2, param3, param4, param5, param6, param7, param8);
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int[] param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        if (param0 == -1) {
          return;
        }
        field_r = param0;
        field_l = param1;
        field_f = param5 & 65535;
        field_i = param6;
        field_d = param7;
        var8 = be.field_g;
        var9 = be.field_b;
        field_h = false;
        for (var10_int = 0; var10_int < 3; var10_int++) {
          var11 = param2[var10_int];
          var12 = param3[var10_int];
          var13 = param4[var10_int];
          if (var13 < 50) {
            field_q[var10_int] = -5000;
            field_h = true;
          } else {
            field_q[var10_int] = var8 + (var11 << 9) / var13;
            field_j[var10_int] = var9 + (var12 << 9) / var13;
          }
          field_p[var10_int] = var11;
          field_b[var10_int] = var12;
          field_c[var10_int] = var13;
        }
        try {
          var10_int = field_q[0];
          var11 = field_q[1];
          var12 = field_q[2];
          if (!field_h) {
            stackIn_18_0 = !(var10_int >= ph.field_k) || !(var11 >= ph.field_k) || !(var12 >= ph.field_k) || !(var10_int <= ph.field_a) || !(var11 <= ph.field_a) || !(var12 <= ph.field_a);
            field_m = stackIn_18_0;
          }
          nf.a();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
        }
    }

    public static void c() {
        field_q = null;
        field_j = null;
        field_p = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_n = null;
        field_k = null;
        field_g = null;
        field_o = null;
        field_a = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        if ((param3 >= 0 ||
          param4 >= 0 ||
          param5 >= 0) &&
          (!(param3 > be.field_p) ||
          !(param4 > be.field_p) ||
          !(param5 > be.field_p)) &&
          (param0 >= 0 ||
          param1 >= 0 ||
          param2 >= 0) &&
          (!(param0 > be.field_f) ||
          !(param1 > be.field_f) ||
          !(param2 > be.field_f))) {
          be.a(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
          return;
        }
    }

    static {
        field_c = new int[3];
        field_n = g.field_c;
        field_o = new int[10];
        field_j = new int[3];
        field_k = g.field_a;
        field_p = new int[3];
        field_g = new int[10];
        field_b = new int[3];
        field_e = g.field_b;
        field_a = new int[10];
        field_q = new int[3];
    }
}
