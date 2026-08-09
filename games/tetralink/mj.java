/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private static int[] field_o;
    private static int[] field_g;
    private static boolean field_c;
    private static int[] field_i;
    private static int[] field_k;
    private static int[] field_a;
    private static int[] field_u;
    private static int field_d;
    private static int[] field_n;
    private static int[] field_l;
    private static int field_m;
    private static int field_j;
    private static int[] field_r;
    private static int field_t;
    private static int[] field_h;
    private static int[] field_b;
    private static boolean field_q;
    private static int field_v;
    private static int field_s;
    private static int field_f;
    private static int[] field_e;
    private static int[] field_p;

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
        field_t = param0;
        field_j = param1;
        field_m = param2;
        field_f = param6;
        field_d = param7;
        field_s = param8;
        var9 = vn.field_a;
        var10 = vn.field_f;
        var11 = 0;
        var12_int = 0;
        L0: while (true) {
          if (var12_int >= 3) {
            try {
              L1: {
                mj.a(var11 != 0, false, 0);
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
              if (var15 < field_v) {
                field_h[var12_int] = -5000;
                var11 = 1;
                break L3;
              } else {
                field_h[var12_int] = var9 + (var13 << 9) / var15;
                field_o[var12_int] = var10 + (var14 << 9) / var15;
                break L3;
              }
            }
            field_i[var12_int] = var13;
            field_r[var12_int] = var14;
            field_k[var12_int] = var15;
            var12_int++;
            continue L0;
          }
        }
    }

    public static void b() {
        field_h = null;
        field_o = null;
        field_i = null;
        field_r = null;
        field_k = null;
        field_a = null;
        field_e = null;
        field_p = null;
        field_n = null;
        field_b = null;
        field_g = null;
        field_u = null;
        field_l = null;
    }

    private final static void c() {
        if (field_q) {
            mj.a();
            return;
        }
        vn.field_e = field_c;
        vn.field_i = field_t;
        int var0 = field_j & 3;
        if (var0 == 0) {
            vn.a(field_o[0], field_o[1], field_o[2], field_h[0], field_h[1], field_h[2], field_f, field_d, field_s);
        } else {
            if (var0 == 1) {
                vn.a(field_o[0], field_o[1], field_o[2], field_h[0], field_h[1], field_h[2], field_u[field_f]);
            } else {
                if (var0 == 2) {
                    vn.a(field_o[0], field_o[1], field_o[2], field_h[0], field_h[1], field_h[2], field_f, field_d, field_s, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                } else {
                    if (var0 == 3) {
                        vn.a(field_o[0], field_o[1], field_o[2], field_h[0], field_h[1], field_h[2], field_f, field_f, field_f, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                    }
                }
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
        if (field_j != -1) {
          L0: {
            L1: {
              var3 = field_h[0];
              var4 = field_h[1];
              var5 = field_h[2];
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
                var6 = field_i[0];
                var7 = field_i[1];
                var8 = field_i[2];
                var9 = field_r[0];
                var10 = field_r[1];
                var11 = field_r[2];
                var12 = field_k[0];
                var13 = field_k[1];
                var14 = field_k[2];
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
                  field_q = true;
                  break L0;
                } else {
                  return;
                }
              }
            }
            if ((var3 - var4) * (field_o[2] - field_o[1]) - (field_o[0] - field_o[1]) * (var5 - var4) > 0) {
              L3: {
                field_q = false;
                if (var3 < 0) {
                  break L3;
                } else {
                  if (var4 < 0) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var3 > vn.field_k) {
                        break L3;
                      } else {
                        if (var4 > vn.field_k) {
                          break L3;
                        } else {
                          if (var5 <= vn.field_k) {
                            field_c = false;
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
              field_c = true;
              break L0;
            } else {
              return;
            }
          }
          mj.c();
          return;
        } else {
          return;
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
        int var13 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var0 = vn.field_a;
        int var1 = vn.field_f;
        int var2 = 0;
        int var3 = field_k[0];
        int var4 = field_k[1];
        int var5 = field_k[2];
        if (var3 >= field_v) {
            field_n[var2] = field_h[0];
            field_b[var2] = field_o[0];
            incrementValue$0 = var2;
            var2++;
            field_g[incrementValue$0] = field_f;
        } else {
            var6 = field_i[0];
            var7 = field_r[0];
            var8 = field_f;
            if (var5 >= field_v) {
                var9 = (field_v - var3) * field_l[var5 - var3];
                field_n[var2] = var0 + (var6 + ((field_i[2] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[2] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$1 = var2;
                var2++;
                field_g[incrementValue$1] = var8 + ((field_s - var8) * var9 >> 16);
            }
            if (var4 >= field_v) {
                var9 = (field_v - var3) * field_l[var4 - var3];
                field_n[var2] = var0 + (var6 + ((field_i[1] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[1] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$2 = var2;
                var2++;
                field_g[incrementValue$2] = var8 + ((field_d - var8) * var9 >> 16);
            }
        }
        if (var4 >= field_v) {
            field_n[var2] = field_h[1];
            field_b[var2] = field_o[1];
            incrementValue$3 = var2;
            var2++;
            field_g[incrementValue$3] = field_d;
        } else {
            var6 = field_i[1];
            var7 = field_r[1];
            var8 = field_d;
            if (var3 >= field_v) {
                var9 = (field_v - var4) * field_l[var3 - var4];
                field_n[var2] = var0 + (var6 + ((field_i[0] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[0] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$4 = var2;
                var2++;
                field_g[incrementValue$4] = var8 + ((field_f - var8) * var9 >> 16);
            }
            if (var5 >= field_v) {
                var9 = (field_v - var4) * field_l[var5 - var4];
                field_n[var2] = var0 + (var6 + ((field_i[2] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[2] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$5 = var2;
                var2++;
                field_g[incrementValue$5] = var8 + ((field_s - var8) * var9 >> 16);
            }
        }
        if (var5 >= field_v) {
            field_n[var2] = field_h[2];
            field_b[var2] = field_o[2];
            incrementValue$6 = var2;
            var2++;
            field_g[incrementValue$6] = field_s;
        } else {
            var6 = field_i[2];
            var7 = field_r[2];
            var8 = field_s;
            if (var4 >= field_v) {
                var9 = (field_v - var5) * field_l[var4 - var5];
                field_n[var2] = var0 + (var6 + ((field_i[1] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[1] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$7 = var2;
                var2++;
                field_g[incrementValue$7] = var8 + ((field_d - var8) * var9 >> 16);
            }
            if (var3 >= field_v) {
                var9 = (field_v - var5) * field_l[var3 - var5];
                field_n[var2] = var0 + (var6 + ((field_i[0] - var6) * var9 >> 16) << 9) / field_v;
                field_b[var2] = var1 + (var7 + ((field_r[0] - var7) * var9 >> 16) << 9) / field_v;
                incrementValue$8 = var2;
                var2++;
                field_g[incrementValue$8] = var8 + ((field_f - var8) * var9 >> 16);
            }
        }
        var6 = field_n[0];
        var7 = field_n[1];
        var8 = field_n[2];
        var9 = field_b[0];
        int var10 = field_b[1];
        int var11 = field_b[2];
        vn.field_e = false;
        if (var2 == 3) {
            if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > vn.field_k || var7 > vn.field_k || var8 > vn.field_k) {
                vn.field_e = true;
            }
            var12 = field_j & 3;
            if (var12 == 0) {
                vn.a(var9, var10, var11, var6, var7, var8, field_g[0], field_g[1], field_g[2]);
            } else {
                if (var12 == 1) {
                    vn.a(var9, var10, var11, var6, var7, var8, field_u[field_f]);
                } else {
                    if (var12 == 2) {
                        vn.a(var9, var10, var11, var6, var7, var8, field_g[0], field_g[1], field_g[2], field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                    } else {
                        if (var12 == 3) {
                            vn.a(var9, var10, var11, var6, var7, var8, field_f, field_f, field_f, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                        }
                    }
                }
            }
        }
        if (var2 == 4) {
            if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > vn.field_k || var7 > vn.field_k || var8 > vn.field_k || field_n[3] < 0 || field_n[3] > vn.field_k) {
                vn.field_e = true;
            }
            var12 = field_j & 3;
            if (var12 == 0) {
                vn.a(var9, var10, var11, var6, var7, var8, field_g[0], field_g[1], field_g[2]);
                vn.a(var9, var11, field_b[3], var6, var8, field_n[3], field_g[0], field_g[2], field_g[3]);
            } else {
                if (var12 == 1) {
                    var13 = field_u[field_f];
                    vn.a(var9, var10, var11, var6, var7, var8, var13);
                    vn.a(var9, var11, field_b[3], var6, var8, field_n[3], var13);
                } else {
                    if (var12 == 2) {
                        vn.a(var9, var10, var11, var6, var7, var8, field_g[0], field_g[1], field_g[2], field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                        vn.a(var9, var11, field_b[3], var6, var8, field_n[3], field_g[0], field_g[2], field_g[3], field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                    } else {
                        if (var12 == 3) {
                            vn.a(var9, var10, var11, var6, var7, var8, field_f, field_f, field_f, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                            vn.a(var9, var11, field_b[3], var6, var8, field_n[3], field_f, field_f, field_f, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_p[0], field_p[1], field_p[2], field_m);
                        }
                    }
                }
            }
        }
    }

    static {
        field_i = new int[3];
        field_k = new int[3];
        field_o = new int[3];
        field_r = new int[3];
        field_h = new int[3];
        field_u = vn.field_m;
        field_b = new int[10];
        field_g = new int[10];
        field_n = new int[10];
        field_l = vn.field_q;
        field_a = new int[3];
        field_e = new int[3];
        field_v = 50;
        field_p = new int[3];
    }
}
