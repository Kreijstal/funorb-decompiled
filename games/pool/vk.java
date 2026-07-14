/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends kd {
    private int[] field_Y;
    private int[] field_T;
    static tf field_db;
    private int[] field_G;
    int[] field_L;
    private int[] field_s;
    private int[] field_cb;
    private int[] field_r;
    private int[] field_v;
    private int field_N;
    private int[] field_A;
    private gq field_Z;
    static dd[] field_y;
    private int[] field_B;
    int[] field_U;
    private int[] field_p;
    private int field_w;
    private int[] field_q;
    int[] field_F;
    private pr[][] field_R;
    private int[] field_K;
    private bm field_z;
    private pr[][] field_I;
    private int[] field_J;
    static int field_bb;
    static String field_O;
    private boolean field_M;
    private int field_t;
    private ib field_u;
    private long field_D;
    private long field_ab;
    private int field_X;
    static int field_H;
    static String field_P;
    private boolean field_W;
    static nl field_V;
    private cg field_C;
    static String field_x;
    private int field_S;

    final synchronized int d() {
        return 0;
    }

    final synchronized kd a() {
        return (kd) (Object) ((vk) this).field_u;
    }

    final synchronized boolean a(cf param0, di param1, cg param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        te var8 = null;
        int var9 = 0;
        g var10 = null;
        g var10_ref = null;
        int var11 = 0;
        var11 = Pool.field_O;
        if (param3 > 54) {
          L0: {
            param2.b();
            var6 = 1;
            var7 = null;
            if (param4 <= 0) {
              break L0;
            } else {
              var7_array = new int[]{param4};
              break L0;
            }
          }
          var8 = (te) (Object) param2.field_m.a(0);
          L1: while (true) {
            if (var8 == null) {
              L2: {
                if (var6 == 0) {
                  break L2;
                } else {
                  param2.a();
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              var9 = (int)var8.field_c;
              var10 = (g) (Object) ((vk) this).field_z.a(false, (long)var9);
              if (var10 == null) {
                L3: {
                  var10_ref = hk.a(param1, (byte) 127, var9);
                  if (var10_ref == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((vk) this).field_z.a((byte) -120, (ma) (Object) var10_ref, (long)var9);
                    if (var10_ref.a(23605, var8.field_l, var7_array, param0)) {
                      break L3;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  }
                }
                var8 = (te) (Object) param2.field_m.b(-1);
                continue L1;
              } else {
                L4: {
                  if (var10.a(23605, var8.field_l, var7_array, param0)) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
                var8 = (te) (Object) param2.field_m.b(-1);
                continue L1;
              }
            }
          }
        } else {
          return true;
        }
    }

    public static void c(int param0) {
        field_V = null;
        if (param0 != -819201) {
            return;
        }
        field_x = null;
        field_P = null;
        field_O = null;
        field_y = null;
        field_db = null;
    }

    private final int a(boolean param0, pr param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((vk) this).field_T[param1.field_t] == 0) {
            return 0;
        }
        kp var9 = param1.field_x;
        kp var10 = var9;
        int var4 = ((vk) this).field_G[param1.field_t] * ((vk) this).field_K[param1.field_t] + 4096 >> 199733165;
        var4 = 16384 + var4 * var4 >> 129275695;
        var4 = 16384 + var4 * param1.field_E >> -2051338193;
        if (!param0) {
            ((vk) this).field_t = 0;
        }
        var4 = ((vk) this).field_w * var4 - -128 >> 1328308968;
        var4 = var4 * ((vk) this).field_T[param1.field_t] + 128 >> 429709576;
        if ((var10.field_e ^ -1) < -1) {
            var4 = (int)(Math.pow(0.5, (double)param1.field_p * 0.00001953125 * (double)var10.field_e) * (double)var4 + 0.5);
        }
        if (!(var10.field_a == null)) {
            var5 = param1.field_z;
            var6 = var10.field_a[param1.field_F - -1];
            if (!(var10.field_a.length - 2 <= param1.field_F)) {
                var7 = var9.field_a[param1.field_F] << -731960952 & 65280;
                var8 = (255 & var10.field_a[param1.field_F - -2]) << -75974232;
                var6 = var6 + (-var6 + var10.field_a[3 + param1.field_F]) * (-var7 + var5) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> -588217434;
        }
        if (param1.field_G > 0) {
            if (var10.field_l != null) {
                var5 = param1.field_G;
                var6 = var10.field_l[param1.field_w + 1];
                if (!(param1.field_w >= var10.field_l.length + -2)) {
                    var7 = (var9.field_l[param1.field_w] & 255) << 888391112;
                    var8 = var10.field_l[2 + param1.field_w] << 1737382728 & 65280;
                    var6 = var6 + (-var6 + var10.field_l[3 + param1.field_w]) * (-var7 + var5) / (var8 - var7);
                }
                var4 = 32 + var4 * var6 >> -1543802970;
            }
        }
        return var4;
    }

    private final void a(byte param0, int param1) {
        if (param1 < 0) {
            for (param1 = 0; (param1 ^ -1) > -17; param1++) {
                this.a((byte) -44, param1);
            }
            return;
        }
        ((vk) this).field_G[param1] = 12800;
        ((vk) this).field_B[param1] = 8192;
        ((vk) this).field_K[param1] = 16383;
        ((vk) this).field_Y[param1] = 8192;
        ((vk) this).field_q[param1] = 0;
        ((vk) this).field_s[param1] = 8192;
        this.d(param1, 0);
        this.a(param1, false);
        if (param0 != -44) {
            Object var4 = null;
            ((vk) this).a((cg) null, 67, false);
        }
        ((vk) this).field_F[param1] = 0;
        ((vk) this).field_cb[param1] = 32767;
        ((vk) this).field_p[param1] = 256;
        ((vk) this).field_U[param1] = 0;
        this.a(8192, param1, 6779);
    }

    final static String a(String param0, int param1, byte param2) {
        int var3 = 0;
        if (-2 == (param1 ^ -1)) {
          return nr.a(new String[1], -1, th.field_k);
        } else {
          var3 = 23 / ((param2 - -71) / 45);
          if (-3 == (param1 ^ -1)) {
            return nr.a(new String[1], -1, up.field_I);
          } else {
            if (3 == param1) {
              return nr.a(new String[1], -1, da.field_a);
            } else {
              if (param1 == 4) {
                return nr.a(new String[1], -1, s.field_g);
              } else {
                if (param1 != 5) {
                  if (param1 == 6) {
                    return nr.a(new String[1], -1, hr.field_w);
                  } else {
                    if (-8 != (param1 ^ -1)) {
                      if (param1 == 8) {
                        return nr.a(new String[1], -1, fd.field_M);
                      } else {
                        if (-12 == (param1 ^ -1)) {
                          return nr.a(new String[1], -1, sg.field_I);
                        } else {
                          if (param1 != 12) {
                            if (-14 == (param1 ^ -1)) {
                              return nr.a(new String[1], -1, np.field_c);
                            } else {
                              return null;
                            }
                          } else {
                            return nr.a(new String[1], -1, sd.field_U);
                          }
                        }
                      }
                    } else {
                      return nr.a(new String[1], -1, ii.field_f);
                    }
                  }
                } else {
                  return nr.a(new String[1], -1, lh.field_a);
                }
              }
            }
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Pool.field_O;
            if (!((vk) this).field_Z.a()) {
              break L1;
            } else {
              var4 = ((vk) this).field_N * ((vk) this).field_Z.field_f / bp.field_h;
              L2: while (true) {
                var5 = ((vk) this).field_ab - -((long)var4 * (long)param2);
                if (0L > ((vk) this).field_D + -var5) {
                  var7 = (int)(((long)var4 + ((vk) this).field_D - ((vk) this).field_ab - 1L) / (long)var4);
                  ((vk) this).field_ab = ((vk) this).field_ab + (long)var7 * (long)var4;
                  ((vk) this).field_u.a(param0, param1, var7);
                  param2 = param2 - var7;
                  param1 = param1 + var7;
                  this.d((byte) -89);
                  if (((vk) this).field_Z.a()) {
                    continue L2;
                  } else {
                    ((vk) this).field_u.a(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((vk) this).field_ab = var5;
                  break L1;
                }
              }
            }
          }
          ((vk) this).field_u.a(param0, param1, param2);
          break L0;
        }
    }

    private final int a(byte param0, pr param1) {
        if (param0 < 118) {
            field_y = null;
        }
        int var3 = ((vk) this).field_B[param1.field_t];
        if ((var3 ^ -1) > -8193) {
            return param1.field_m * var3 + 32 >> 2019429542;
        }
        return 16384 + -(32 + (-param1.field_m + 128) * (16384 - var3) >> -1771917818);
    }

    final boolean a(int param0, pr param1) {
        if (param0 != -16257) {
            ((vk) this).field_z = null;
        }
        if (null != param1.field_o) {
            return false;
        }
        if (!(-1 < (param1.field_G ^ -1))) {
            param1.a((byte) -117);
            if ((param1.field_n ^ -1) < -1) {
                if (!(param1 != ((vk) this).field_R[param1.field_t][param1.field_n])) {
                    ((vk) this).field_R[param1.field_t][param1.field_n] = null;
                }
            }
        }
        return true;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Pool.field_O;
        if (((vk) this).field_v[param2] != param1) {
            ((vk) this).field_v[param2] = param1;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((vk) this).field_R[param2][var4] = null;
            }
        }
        if (param0 > -98) {
            this.b(112, -108, -34, -62);
        }
    }

    final synchronized void e(int param0) {
        ((vk) this).a(true, param0);
    }

    private final int b(int param0, pr param1) {
        int var3 = 0;
        kp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = (param1.field_v * param1.field_r >> -941458996) + param1.field_B;
        var3 = var3 + ((-8192 + ((vk) this).field_Y[param1.field_t]) * ((vk) this).field_p[param1.field_t] >> -1525548756);
        var4 = param1.field_x;
        if (param0 == 1) {
          L0: {
            if (var4.field_o <= 0) {
              break L0;
            } else {
              L1: {
                if (var4.field_b > 0) {
                  break L1;
                } else {
                  if (((vk) this).field_q[param1.field_t] > 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                var5 = var4.field_b << 1000968130;
                var6 = var4.field_n << -402945311;
                if (param1.field_q >= var6) {
                  break L2;
                } else {
                  var5 = param1.field_q * var5 / var6;
                  break L2;
                }
              }
              var5 = var5 + (((vk) this).field_q[param1.field_t] >> 1539780743);
              var7 = Math.sin((double)(param1.field_s & 511) * 0.01227184630308513);
              var3 = var3 + (int)((double)var5 * var7);
              break L0;
            }
          }
          L3: {
            var5 = (int)(0.5 + (double)(param1.field_C.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)bp.field_h);
            if (1 > var5) {
              stackOut_11_0 = 1;
              stackIn_12_0 = stackOut_11_0;
              break L3;
            } else {
              stackOut_10_0 = var5;
              stackIn_12_0 = stackOut_10_0;
              break L3;
            }
          }
          return stackIn_12_0;
        } else {
          return -128;
        }
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            this.a(-1, 0);
        } else {
            this.c(-45, -1);
        }
        this.a((byte) -44, -1);
        for (var3 = 0; var3 < 16; var3++) {
            ((vk) this).field_v[var3] = ((vk) this).field_r[var3];
        }
        if (param1 != 123) {
            return;
        }
        int var4 = 0;
        var3 = var4;
        while (16 > var4) {
            ((vk) this).field_J[var4] = rb.b(((vk) this).field_r[var4], -128);
            var4++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((vk) this).field_A[param1] = param0;
        ((vk) this).field_L[param1] = (int)(Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param2 != 6779) {
            this.a(-51, false);
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        pr var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 124);
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpeq L43
            } else {
                if (!((var3.field_G ^ -1) <= -1)) {
                    ((vk) this).field_I[var3.field_t][var3.field_A] = null;
                    var3.field_G = 0;
                }
            }
            var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 62 / ((param0 - -68) / 53);
        if (-1 >= (param1 ^ -1)) {
            ((vk) this).field_T[param1] = param2;
        } else {
            for (var5 = 0; 16 > var5; var5++) {
                ((vk) this).field_T[var5] = param2;
            }
        }
    }

    final synchronized void a(cg param0, int param1, boolean param2) {
        if (param1 != 8821) {
            return;
        }
        ((vk) this).a(param0, true, (byte) -14, param2);
    }

    private final void d(int param0, int param1) {
        pr var3 = null;
        if (!(param1 == (((vk) this).field_F[param0] & 2))) {
            var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) -92);
            while (var3 != null) {
                if (var3.field_t == param0) {
                    if (null == ((vk) this).field_I[param0][var3.field_A]) {
                        if (!(var3.field_G >= 0)) {
                            var3.field_G = 0;
                        }
                    }
                }
                var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 8192) {
            ((vk) this).field_q = null;
        }
    }

    private final void a(int param0, boolean param1) {
        pr var3 = null;
        if ((4 & ((vk) this).field_F[param0]) != 0) {
            var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 88);
            while (var3 != null) {
                if (var3.field_t == param0) {
                    var3.field_y = 0;
                }
                var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
        if (param1) {
            field_db = null;
        }
    }

    final synchronized boolean d(int param0) {
        if (param0 != -11414) {
            return true;
        }
        return ((vk) this).field_Z.a();
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var2 = ((vk) this).field_X;
          var3 = ((vk) this).field_t;
          if (param0 == -89) {
            break L0;
          } else {
            ((vk) this).a(false, 85);
            break L0;
          }
        }
        L1: {
          var4 = ((vk) this).field_D;
          if (null == ((vk) this).field_C) {
            break L1;
          } else {
            if (((vk) this).field_S != var3) {
              break L1;
            } else {
              ((vk) this).a(((vk) this).field_C, ((vk) this).field_W, (byte) -14, ((vk) this).field_M);
              this.d((byte) -89);
              return;
            }
          }
        }
        L2: while (true) {
          if (var3 != ((vk) this).field_t) {
            L3: {
              ((vk) this).field_D = var4;
              ((vk) this).field_X = var2;
              ((vk) this).field_t = var3;
              if (null == ((vk) this).field_C) {
                break L3;
              } else {
                if (var3 > ((vk) this).field_S) {
                  ((vk) this).field_X = -1;
                  ((vk) this).field_t = ((vk) this).field_S;
                  ((vk) this).field_D = ((vk) this).field_Z.b(((vk) this).field_t);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((vk) this).field_Z.field_g[var2]) {
                  break L5;
                } else {
                  ((vk) this).field_Z.a(var2);
                  var6 = ((vk) this).field_Z.d(var2);
                  if ((var6 ^ -1) == -2) {
                    ((vk) this).field_Z.c();
                    ((vk) this).field_Z.e(var2);
                    if (((vk) this).field_Z.f()) {
                      if (((vk) this).field_C != null) {
                        ((vk) this).a(((vk) this).field_C, 8821, ((vk) this).field_M);
                        this.d((byte) -89);
                        return;
                      } else {
                        L6: {
                          if (!((vk) this).field_M) {
                            break L6;
                          } else {
                            if (-1 != (var3 ^ -1)) {
                              ((vk) this).field_Z.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.b(true, 123);
                        ((vk) this).field_Z.e();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.b(var6, -122);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((vk) this).field_Z.f(var2);
                    ((vk) this).field_Z.e(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((vk) this).field_Z.b();
              var3 = ((vk) this).field_Z.field_g[var2];
              var4 = ((vk) this).field_Z.b(var3);
              continue L2;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pr var6 = null;
        int var7 = Pool.field_O;
        pr var8 = ((vk) this).field_I[param0][param1];
        if (!(var8 != null)) {
            return;
        }
        if (param2 < 18) {
            ((vk) this).field_F = null;
        }
        ((vk) this).field_I[param0][param1] = null;
        if (-1 == (2 & ((vk) this).field_F[param0] ^ -1)) {
            var8.field_G = 0;
        } else {
            var6 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 124);
            while (var6 != null) {
                if (var8.field_t == var6.field_t) {
                    if (var6.field_G < 0) {
                        if (!(var6 == var8)) {
                            var8.field_G = 0;
                            break;
                        }
                    }
                }
                var6 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
    }

    final synchronized void a(cg param0, boolean param1, byte param2, boolean param3) {
        int var6 = 0;
        ((vk) this).a(param1, -1);
        ((vk) this).field_Z.a(param0.field_l);
        ((vk) this).field_ab = 0L;
        ((vk) this).field_M = param3 ? true : false;
        int var5 = ((vk) this).field_Z.d();
        if (param2 != -14) {
            kd discarded$0 = ((vk) this).a();
        }
        for (var6 = 0; var5 > var6; var6++) {
            ((vk) this).field_Z.a(var6);
            ((vk) this).field_Z.f(var6);
            ((vk) this).field_Z.e(var6);
        }
        ((vk) this).field_X = ((vk) this).field_Z.b();
        ((vk) this).field_t = ((vk) this).field_Z.field_g[((vk) this).field_X];
        ((vk) this).field_D = ((vk) this).field_Z.b(((vk) this).field_t);
    }

    final synchronized void a(boolean param0) {
        int var3 = Pool.field_O;
        if (!param0) {
            field_H = -40;
        }
        g var4 = (g) (Object) ((vk) this).field_z.a(0);
        while (var4 != null) {
            var4.c(23478);
            var4 = (g) (Object) ((vk) this).field_z.b(-1);
        }
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            ((vk) this).field_t = 53;
        }
        return ((vk) this).field_ab / (long)((vk) this).field_Z.field_f;
    }

    private final void c(byte param0, int param1, int param2) {
        if (param0 != -62) {
            ((vk) this).field_z = null;
        }
    }

    private final void c(int param0, int param1) {
        pr var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 62);
        if (param0 >= -17) {
            this.a(-123, -25, 81);
        }
        while (var3 != null) {
            if (0 <= param1) {
                // if_icmpeq L58
            } else {
                if (null != var3.field_o) {
                    var3.field_o.c(bp.field_h / 100);
                    if (!(!var3.field_o.g())) {
                        ((vk) this).field_u.field_p.b((kd) (Object) var3.field_o);
                    }
                    var3.a(2);
                }
                if (!((var3.field_G ^ -1) <= -1)) {
                    ((vk) this).field_I[var3.field_t][var3.field_A] = null;
                }
                var3.a((byte) -117);
            }
            var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pr var5 = null;
        jg var6 = null;
        int var6_int = 0;
        pr var7 = null;
        pr var8 = null;
        int var9 = 0;
        g var10 = null;
        g var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pr stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        pr stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        pr stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pr stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        pr stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pr stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Pool.field_O;
          this.c(param3, param1, 104, 64);
          if (0 != (((vk) this).field_F[param3] & 2)) {
            var5 = (pr) (Object) ((vk) this).field_u.field_t.a((byte) -127);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_t) {
                    break L2;
                  } else {
                    if (var5.field_G >= 0) {
                      break L2;
                    } else {
                      ((vk) this).field_I[param3][var5.field_A] = null;
                      ((vk) this).field_I[param3][param1] = var5;
                      var6_int = var5.field_B + (var5.field_r * var5.field_v >> -1864731892);
                      var5.field_B = var5.field_B + (param1 - var5.field_A << -1962966392);
                      var5.field_v = -var5.field_B + var6_int;
                      var5.field_r = 4096;
                      var5.field_A = param1;
                      return;
                    }
                  }
                }
                var5 = (pr) (Object) ((vk) this).field_u.field_t.b((byte) -46);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (g) (Object) ((vk) this).field_z.a(false, (long)((vk) this).field_v[param3]);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_u[param1];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new pr();
              var7.field_u = var11;
              var7.field_C = var6;
              var7.field_t = param3;
              var7.field_x = var10.field_t[param1];
              var7.field_n = var10.field_p[param1];
              var7.field_A = param1;
              var7.field_E = 1024 + param2 * param2 * var11.field_q * var10.field_n[param1] >> 2130373067;
              var7.field_m = var10.field_v[param1] & 255;
              var7.field_B = -(32767 & var10.field_s[param1]) + (param1 << -2036030584);
              var7.field_w = param0;
              var7.field_G = -1;
              var7.field_z = 0;
              var7.field_F = 0;
              var7.field_p = 0;
              if (((vk) this).field_U[param3] != 0) {
                L4: {
                  var7.field_o = nb.b(var6, this.b(1, var7), 0, this.a((byte) 123, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = -123;
                  stackOut_15_2 = (pr) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (var11.field_s[param1] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (pr) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (pr) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((vk) this).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              } else {
                var7.field_o = nb.b(var6, this.b(param0 + 1, var7), this.a(true, var7), this.a((byte) 121, var7));
                break L3;
              }
            }
            L5: {
              if ((var11.field_s[param1] ^ -1) > -1) {
                var7.field_o.e(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var7.field_n ^ -1) > -1) {
                break L6;
              } else {
                L7: {
                  var8 = ((vk) this).field_R[param3][var7.field_n];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_G >= 0) {
                      break L7;
                    } else {
                      ((vk) this).field_I[param3][var8.field_A] = null;
                      var8.field_G = 0;
                      break L7;
                    }
                  }
                }
                ((vk) this).field_R[param3][var7.field_n] = var7;
                break L6;
              }
            }
            ((vk) this).field_u.field_t.b((byte) -93, (ma) (Object) var7);
            ((vk) this).field_I[param3][param1] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pool.field_O;
          var3 = 240 & param0;
          if (param1 == -122) {
            break L0;
          } else {
            kd discarded$1 = ((vk) this).a();
            break L0;
          }
        }
        if (128 != var3) {
          if (144 == var3) {
            var4 = param0 & 15;
            var5 = 127 & param0 >> 34625000;
            var6 = (8367257 & param0) >> -1590636816;
            if (0 < var6) {
              this.b(param1 + 122, var5, var6, var4);
              return;
            } else {
              this.c(var4, var5, 96, 64);
              return;
            }
          } else {
            if ((var3 ^ -1) != -161) {
              if (176 != var3) {
                if (192 == var3) {
                  var4 = param0 & 15;
                  var5 = param0 >> -1716098264 & 127;
                  this.b(-118, ((vk) this).field_J[var4] + var5, var4);
                  return;
                } else {
                  if (var3 == 208) {
                    var4 = 15 & param0;
                    var5 = (param0 & 32677) >> -2065222808;
                    this.c((byte) -62, var4, var5);
                    return;
                  } else {
                    if ((var3 ^ -1) == -225) {
                      var4 = 15 & param0;
                      var5 = ((param0 & 32702) >> 1942956616) + ((8323364 & param0) >> -565465303);
                      this.b((byte) 90, var4, var5);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if ((var3 ^ -1) != -256) {
                        return;
                      } else {
                        this.b(true, 123);
                        return;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  var4 = 15 & param0;
                  var5 = param0 >> 722181352 & 127;
                  var6 = (param0 & 8325787) >> -1170767120;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    ((vk) this).field_J[var4] = rb.b(((vk) this).field_J[var4], -2080769) + (var6 << -642386482);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 32) {
                    break L2;
                  } else {
                    ((vk) this).field_J[var4] = (var6 << -1506968249) + rb.b(-16257, ((vk) this).field_J[var4]);
                    break L2;
                  }
                }
                L3: {
                  if ((var5 ^ -1) != -2) {
                    break L3;
                  } else {
                    ((vk) this).field_q[var4] = (var6 << -1564113113) + rb.b(-16257, ((vk) this).field_q[var4]);
                    break L3;
                  }
                }
                L4: {
                  if (33 == var5) {
                    ((vk) this).field_q[var4] = rb.b(-128, ((vk) this).field_q[var4]) - -var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 == 5) {
                    ((vk) this).field_s[var4] = rb.b(((vk) this).field_s[var4], -16257) + (var6 << -395397849);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-38 == (var5 ^ -1)) {
                    ((vk) this).field_s[var4] = var6 + rb.b(-128, ((vk) this).field_s[var4]);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((var5 ^ -1) != -8) {
                    break L7;
                  } else {
                    ((vk) this).field_G[var4] = (var6 << 2116198311) + rb.b(-16257, ((vk) this).field_G[var4]);
                    break L7;
                  }
                }
                L8: {
                  if (var5 == 39) {
                    ((vk) this).field_G[var4] = var6 + rb.b(-128, ((vk) this).field_G[var4]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (10 != var5) {
                    break L9;
                  } else {
                    ((vk) this).field_B[var4] = (var6 << 1581196871) + rb.b(-16257, ((vk) this).field_B[var4]);
                    break L9;
                  }
                }
                L10: {
                  if (42 == var5) {
                    ((vk) this).field_B[var4] = rb.b(-128, ((vk) this).field_B[var4]) - -var6;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 11) {
                    ((vk) this).field_K[var4] = rb.b(-16257, ((vk) this).field_K[var4]) + (var6 << 1475678471);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((var5 ^ -1) == -44) {
                    ((vk) this).field_K[var4] = rb.b(((vk) this).field_K[var4], -128) + var6;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (64 == var5) {
                    if (var6 < 64) {
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -2);
                      break L13;
                    } else {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 1);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (-66 != (var5 ^ -1)) {
                    break L14;
                  } else {
                    if ((var6 ^ -1) <= -65) {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 2);
                      break L14;
                    } else {
                      this.d(var4, param1 ^ -122);
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -3);
                      break L14;
                    }
                  }
                }
                L15: {
                  if (var5 != 99) {
                    break L15;
                  } else {
                    ((vk) this).field_cb[var4] = (var6 << 1733118279) + rb.b(127, ((vk) this).field_cb[var4]);
                    break L15;
                  }
                }
                L16: {
                  if (98 == var5) {
                    ((vk) this).field_cb[var4] = var6 + rb.b(((vk) this).field_cb[var4], 16256);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (101 != var5) {
                    break L17;
                  } else {
                    ((vk) this).field_cb[var4] = 16384 - (-rb.b(127, ((vk) this).field_cb[var4]) + -(var6 << -232554073));
                    break L17;
                  }
                }
                L18: {
                  if (100 != var5) {
                    break L18;
                  } else {
                    ((vk) this).field_cb[var4] = rb.b(((vk) this).field_cb[var4], 16256) + (16384 - -var6);
                    break L18;
                  }
                }
                L19: {
                  if (-121 != var5) {
                    break L19;
                  } else {
                    this.c(-50, var4);
                    break L19;
                  }
                }
                L20: {
                  if (-122 == var5) {
                    this.a((byte) -44, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 123) {
                    break L21;
                  } else {
                    this.a(var4, 0);
                    break L21;
                  }
                }
                L22: {
                  if (6 != var5) {
                    break L22;
                  } else {
                    var7 = ((vk) this).field_cb[var4];
                    if (-16385 == (var7 ^ -1)) {
                      ((vk) this).field_p[var4] = rb.b(((vk) this).field_p[var4], -16257) + (var6 << -167963609);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if ((var5 ^ -1) == -39) {
                    var7 = ((vk) this).field_cb[var4];
                    if ((var7 ^ -1) == -16385) {
                      ((vk) this).field_p[var4] = rb.b(-128, ((vk) this).field_p[var4]) + var6;
                      break L23;
                    } else {
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (16 == var5) {
                    ((vk) this).field_U[var4] = (var6 << -832519193) + rb.b(((vk) this).field_U[var4], -16257);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (48 != var5) {
                    break L25;
                  } else {
                    ((vk) this).field_U[var4] = rb.b(((vk) this).field_U[var4], -128) + var6;
                    break L25;
                  }
                }
                L26: {
                  if (81 == var5) {
                    if ((var6 ^ -1) > -65) {
                      this.a(var4, false);
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -5);
                      break L26;
                    } else {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 4);
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if ((var5 ^ -1) == -18) {
                    this.a((((vk) this).field_A[var4] & -16257) + (var6 << -134379321), var4, param1 + 6901);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (-50 == (var5 ^ -1)) {
                    this.a(var6 + (((vk) this).field_A[var4] & -128), var4, 6779);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32765) >> -1309506200;
              var6 = (param0 & 8339384) >> 1045262064;
              this.a(var6, var5, param1 ^ -8314, var4);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> -749445400 & 127;
          var6 = (8324615 & param0) >> 1287319088;
          this.c(var4, var5, 37, var6);
          return;
        }
    }

    final synchronized kd b() {
        return null;
    }

    final synchronized void a(int param0, byte param1) {
        ((vk) this).field_w = param0;
        if (param1 > 0) {
            Object var4 = null;
            ((vk) this).a(70, (pr) null, true);
        }
    }

    final void a(int param0, pr param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var4 = param1.field_C.field_n.length;
            var6 = 11 % ((-54 - param0) / 63);
            if (!param2) {
              break L1;
            } else {
              if (param1.field_C.field_o) {
                var7 = var4 + (var4 + -param1.field_C.field_m);
                var4 = var4 << 8;
                var5 = (int)((long)var7 * (long)((vk) this).field_U[param1.field_t] >> -228494394);
                if (var5 < var4) {
                  break L0;
                } else {
                  param1.field_o.a(true);
                  var5 = var4 - -var4 - (1 - -var5);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((vk) this).field_U[param1.field_t] >> -2122212474);
          break L0;
        }
        param1.field_o.g(var5);
    }

    final synchronized void a(boolean param0, int param1) {
        ((vk) this).field_Z.e();
        ((vk) this).field_C = null;
        if (param1 != -1) {
            Object var4 = null;
            ((vk) this).a(88, (pr) null, true);
        }
        this.b(param0, 123);
    }

    private final void b(byte param0, int param1, int param2) {
        ((vk) this).field_Y[param1] = param2;
        if (param0 != 90) {
            this.b((byte) 60, 14, -98);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pool.field_O;
          if (!((vk) this).field_Z.a()) {
            break L0;
          } else {
            var2 = ((vk) this).field_Z.field_f * ((vk) this).field_N / bp.field_h;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((vk) this).field_ab;
              if (0L <= ((vk) this).field_D - var3) {
                ((vk) this).field_ab = var3;
                break L0;
              } else {
                var5 = (int)((-((vk) this).field_ab + ((vk) this).field_D + ((long)var2 - 1L)) / (long)var2);
                ((vk) this).field_ab = ((vk) this).field_ab + (long)var5 * (long)var2;
                ((vk) this).field_u.a(var5);
                param0 = param0 - var5;
                this.d((byte) -89);
                if (!((vk) this).field_Z.a()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((vk) this).field_u.a(param0);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, pr param4) {
        int var6 = 0;
        kp var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Pool.field_O;
          param4.field_D = bp.field_h / 100;
          if (-1 < (param4.field_G ^ -1)) {
            break L0;
          } else {
            L1: {
              if (param4.field_o == null) {
                break L1;
              } else {
                if (param4.field_o.i()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param4.a(param3 ^ 3);
              param4.a((byte) -117);
              if (0 >= param4.field_n) {
                break L2;
              } else {
                if (param4 != ((vk) this).field_R[param4.field_t][param4.field_n]) {
                  break L2;
                } else {
                  ((vk) this).field_R[param4.field_t][param4.field_n] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param4.field_r;
          if (0 >= var6) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((vk) this).field_s[param4.field_t]) + 0.5);
              if ((var6 ^ -1) <= -1) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param4.field_r = var6;
            break L3;
          }
        }
        L5: {
          param4.field_o.f(this.b(param3 ^ 0, param4));
          var7 = param4.field_x;
          param4.field_s = param4.field_s + var7.field_o;
          if (param3 == 1) {
            break L5;
          } else {
            boolean discarded$1 = ((vk) this).d(27);
            break L5;
          }
        }
        L6: {
          param4.field_q = param4.field_q + 1;
          var8 = 0;
          var9 = (double)((param4.field_r * param4.field_v >> 1465242988) + (-60 + param4.field_A << 2141863880)) * 0.000005086263020833333;
          if (var7.field_e <= 0) {
            break L6;
          } else {
            L7: {
              if ((var7.field_k ^ -1) >= -1) {
                param4.field_p = param4.field_p + 128;
                break L7;
              } else {
                param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_k));
                break L7;
              }
            }
            if ((param4.field_p * var7.field_e ^ -1) > -819201) {
              break L6;
            } else {
              var8 = 1;
              break L6;
            }
          }
        }
        L8: {
          if (var7.field_a != null) {
            L9: {
              if ((var7.field_j ^ -1) < -1) {
                param4.field_z = param4.field_z + (int)(0.5 + Math.pow(2.0, (double)var7.field_j * var9) * 128.0);
                break L9;
              } else {
                param4.field_z = param4.field_z + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (var7.field_a.length - 2 <= param4.field_F) {
                  break L11;
                } else {
                  if ((65280 & var7.field_a[param4.field_F + 2] << -1718671064) >= param4.field_z) {
                    break L11;
                  } else {
                    param4.field_F = param4.field_F + 2;
                    continue L10;
                  }
                }
              }
              if (var7.field_a.length - 2 != param4.field_F) {
                break L8;
              } else {
                if (var7.field_a[1 + param4.field_F] != 0) {
                  break L8;
                } else {
                  var8 = 1;
                  break L8;
                }
              }
            }
          } else {
            break L8;
          }
        }
        L12: {
          if (param4.field_G < 0) {
            break L12;
          } else {
            if (var7.field_l == null) {
              break L12;
            } else {
              if (-1 != (((vk) this).field_F[param4.field_t] & 1 ^ -1)) {
                break L12;
              } else {
                L13: {
                  if (param4.field_n < 0) {
                    break L13;
                  } else {
                    if (param4 == ((vk) this).field_R[param4.field_t][param4.field_n]) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-1 > (var7.field_g ^ -1)) {
                    param4.field_G = param4.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                    break L14;
                  } else {
                    param4.field_G = param4.field_G + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (-2 + var7.field_l.length <= param4.field_w) {
                      break L16;
                    } else {
                      if ((255 & var7.field_l[2 + param4.field_w]) << 1004918216 >= param4.field_G) {
                        break L16;
                      } else {
                        param4.field_w = param4.field_w + 2;
                        continue L15;
                      }
                    }
                  }
                  if (var7.field_l.length + -2 == param4.field_w) {
                    var8 = 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
            }
          }
        }
        if (var8 != 0) {
          L17: {
            param4.field_o.c(param4.field_D);
            if (param1 == null) {
              param4.field_o.a(param0);
              break L17;
            } else {
              param4.field_o.a(param1, param2, param0);
              break L17;
            }
          }
          L18: {
            if (!param4.field_o.g()) {
              break L18;
            } else {
              ((vk) this).field_u.field_p.b((kd) (Object) param4.field_o);
              break L18;
            }
          }
          L19: {
            param4.a(2);
            if (-1 >= (param4.field_G ^ -1)) {
              param4.a((byte) -117);
              if (0 >= param4.field_n) {
                break L19;
              } else {
                if (((vk) this).field_R[param4.field_t][param4.field_n] == param4) {
                  ((vk) this).field_R[param4.field_t][param4.field_n] = null;
                  break L19;
                } else {
                  break L19;
                }
              }
            } else {
              break L19;
            }
          }
          return true;
        } else {
          param4.field_o.a(param4.field_D, this.a(true, param4), this.a((byte) 120, param4));
          return false;
        }
    }

    public vk() {
        ((vk) this).field_G = new int[16];
        ((vk) this).field_s = new int[16];
        ((vk) this).field_r = new int[16];
        ((vk) this).field_v = new int[16];
        ((vk) this).field_T = new int[16];
        ((vk) this).field_cb = new int[16];
        ((vk) this).field_B = new int[16];
        ((vk) this).field_F = new int[16];
        ((vk) this).field_q = new int[16];
        ((vk) this).field_w = 256;
        ((vk) this).field_U = new int[16];
        ((vk) this).field_p = new int[16];
        ((vk) this).field_Y = new int[16];
        ((vk) this).field_R = new pr[16][128];
        ((vk) this).field_K = new int[16];
        ((vk) this).field_J = new int[16];
        ((vk) this).field_N = 1000000;
        ((vk) this).field_L = new int[16];
        ((vk) this).field_I = new pr[16][128];
        ((vk) this).field_A = new int[16];
        ((vk) this).field_Z = new gq();
        ((vk) this).field_u = new ib((vk) this);
        ((vk) this).field_z = new bm(128);
        ((vk) this).a((byte) -127, -1, 256);
        this.b(true, 123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Enter name of friend to delete from list";
        field_db = new tf(0);
        field_P = "Private";
        field_V = new nl();
        field_x = "Join";
    }
}
