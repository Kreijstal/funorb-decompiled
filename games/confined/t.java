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
        int var13 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var0 = ti.field_k;
        int var1 = ti.field_f;
        int var2 = 0;
        int var3 = field_u[0];
        int var4 = field_u[1];
        int var5 = field_u[2];
        if (var3 >= field_c) {
            field_b[var2] = field_r[0];
            field_q[var2] = field_d[0];
            incrementValue$0 = var2;
            var2++;
            field_l[incrementValue$0] = field_k;
        } else {
            var6 = field_f[0];
            var7 = field_m[0];
            var8 = field_k;
            if (var5 >= field_c) {
                var9 = (field_c - var3) * field_n[var5 - var3];
                field_b[var2] = var0 + (var6 + ((field_f[2] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[2] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$1 = var2;
                var2++;
                field_l[incrementValue$1] = var8 + ((field_s - var8) * var9 >> 16);
            }
            if (var4 >= field_c) {
                var9 = (field_c - var3) * field_n[var4 - var3];
                field_b[var2] = var0 + (var6 + ((field_f[1] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[1] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$2 = var2;
                var2++;
                field_l[incrementValue$2] = var8 + ((field_t - var8) * var9 >> 16);
            }
        }
        if (var4 >= field_c) {
            field_b[var2] = field_r[1];
            field_q[var2] = field_d[1];
            incrementValue$3 = var2;
            var2++;
            field_l[incrementValue$3] = field_t;
        } else {
            var6 = field_f[1];
            var7 = field_m[1];
            var8 = field_t;
            if (var3 >= field_c) {
                var9 = (field_c - var4) * field_n[var3 - var4];
                field_b[var2] = var0 + (var6 + ((field_f[0] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[0] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$4 = var2;
                var2++;
                field_l[incrementValue$4] = var8 + ((field_k - var8) * var9 >> 16);
            }
            if (var5 >= field_c) {
                var9 = (field_c - var4) * field_n[var5 - var4];
                field_b[var2] = var0 + (var6 + ((field_f[2] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[2] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$5 = var2;
                var2++;
                field_l[incrementValue$5] = var8 + ((field_s - var8) * var9 >> 16);
            }
        }
        if (var5 >= field_c) {
            field_b[var2] = field_r[2];
            field_q[var2] = field_d[2];
            incrementValue$6 = var2;
            var2++;
            field_l[incrementValue$6] = field_s;
        } else {
            var6 = field_f[2];
            var7 = field_m[2];
            var8 = field_s;
            if (var4 >= field_c) {
                var9 = (field_c - var5) * field_n[var4 - var5];
                field_b[var2] = var0 + (var6 + ((field_f[1] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[1] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$7 = var2;
                var2++;
                field_l[incrementValue$7] = var8 + ((field_t - var8) * var9 >> 16);
            }
            if (var3 >= field_c) {
                var9 = (field_c - var5) * field_n[var3 - var5];
                field_b[var2] = var0 + (var6 + ((field_f[0] - var6) * var9 >> 16) << 9) / field_c;
                field_q[var2] = var1 + (var7 + ((field_m[0] - var7) * var9 >> 16) << 9) / field_c;
                incrementValue$8 = var2;
                var2++;
                field_l[incrementValue$8] = var8 + ((field_k - var8) * var9 >> 16);
            }
        }
        var6 = field_b[0];
        var7 = field_b[1];
        var8 = field_b[2];
        var9 = field_q[0];
        int var10 = field_q[1];
        int var11 = field_q[2];
        ti.field_c = false;
        if (var2 == 3) {
            if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > ti.field_e || var7 > ti.field_e || var8 > ti.field_e) {
                ti.field_c = true;
            }
            var12 = field_i & 3;
            if (var12 == 0) {
                ti.a(var9, var10, var11, var6, var7, var8, field_l[0], field_l[1], field_l[2]);
            } else {
                if (var12 == 1) {
                    ti.a(var9, var10, var11, var6, var7, var8, field_v[field_k]);
                } else {
                    if (var12 == 2) {
                        ti.a(var9, var10, var11, var6, var7, var8, field_l[0], field_l[1], field_l[2], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                    } else {
                        if (var12 == 3) {
                            ti.a(var9, var10, var11, var6, var7, var8, field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                        }
                    }
                }
            }
        }
        if (var2 == 4) {
            if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > ti.field_e || var7 > ti.field_e || var8 > ti.field_e || field_b[3] < 0 || field_b[3] > ti.field_e) {
                ti.field_c = true;
            }
            var12 = field_i & 3;
            if (var12 == 0) {
                ti.a(var9, var10, var11, var6, var7, var8, field_l[0], field_l[1], field_l[2]);
                ti.a(var9, var11, field_q[3], var6, var8, field_b[3], field_l[0], field_l[2], field_l[3]);
            } else {
                if (var12 == 1) {
                    var13 = field_v[field_k];
                    ti.a(var9, var10, var11, var6, var7, var8, var13);
                    ti.a(var9, var11, field_q[3], var6, var8, field_b[3], var13);
                } else {
                    if (var12 == 2) {
                        ti.a(var9, var10, var11, var6, var7, var8, field_l[0], field_l[1], field_l[2], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                        ti.a(var9, var11, field_q[3], var6, var8, field_b[3], field_l[0], field_l[2], field_l[3], field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                    } else {
                        if (var12 == 3) {
                            ti.a(var9, var10, var11, var6, var7, var8, field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                            ti.a(var9, var11, field_q[3], var6, var8, field_b[3], field_k, field_k, field_k, field_h[0], field_h[1], field_h[2], field_g[0], field_g[1], field_g[2], field_o[0], field_o[1], field_o[2], field_e);
                        }
                    }
                }
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
        Throwable decompiledCaughtException = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
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
        var12_int = 0;
        L0: while (true) {
          if (var12_int >= 3) {
            try {
              L1: {
                t.a(var11 != 0, false, 0);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var12 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var13 = param3[var12_int];
              var14 = param4[var12_int];
              var15 = param5[var12_int];
              if (var15 < field_c) {
                field_r[var12_int] = -5000;
                var11 = 1;
                break L3;
              } else {
                field_r[var12_int] = var9 + (var13 << 9) / var15;
                field_d[var12_int] = var10 + (var14 << 9) / var15;
                break L3;
              }
            }
            field_f[var12_int] = var13;
            field_m[var12_int] = var14;
            field_u[var12_int] = var15;
            var12_int++;
            continue L0;
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
        if (field_i != -1) {
          L0: {
            L1: {
              var3 = field_r[0];
              var4 = field_r[1];
              var5 = field_r[2];
              if (!param0) {
                break L1;
              } else {
                L2: {
                  if (var3 == -5000) {
                    break L2;
                  } else {
                    if (var4 == -5000) {
                      break L2;
                    } else {
                      if (var5 != -5000) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
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
                if (var7 * var15 + var10 * var16 + var13 * var17 > 0) {
                  field_p = true;
                  break L0;
                } else {
                  return;
                }
              }
            }
            if ((var3 - var4) * (field_d[2] - field_d[1]) - (field_d[0] - field_d[1]) * (var5 - var4) > 0) {
              L3: {
                field_p = false;
                if (var3 < 0) {
                  break L3;
                } else {
                  if (var4 < 0) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var3 > ti.field_e) {
                        break L3;
                      } else {
                        if (var4 > ti.field_e) {
                          break L3;
                        } else {
                          if (var5 <= ti.field_e) {
                            field_a = false;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              field_a = true;
              break L0;
            } else {
              return;
            }
          }
          t.a();
          return;
        } else {
          return;
        }
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
