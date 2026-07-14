/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends hn {
    private dw field_q;
    private int[] field_u;
    static int[] field_E;
    static nj field_H;
    private mi[][] field_I;
    int[] field_s;
    private int[] field_F;
    private bg field_T;
    private int[] field_P;
    private mi[][] field_M;
    private int[] field_C;
    private int field_v;
    private int field_U;
    private int[] field_A;
    static rg field_p;
    private int[] field_V;
    private static byte[] field_G;
    private int[] field_r;
    private int[] field_D;
    private int[] field_x;
    int[] field_o;
    int[] field_W;
    private int[] field_N;
    private int[] field_O;
    static String field_R;
    private int[] field_w;
    private int[] field_J;
    static int field_ab;
    static String field_X;
    private long field_z;
    private int field_K;
    private int field_t;
    private boolean field_Z;
    private long field_Y;
    private os field_Q;
    private boolean field_y;
    private um field_B;
    private int field_L;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = ((ih) this).field_K;
          var3 = ((ih) this).field_t;
          var4 = ((ih) this).field_Y;
          if (null == ((ih) this).field_B) {
            break L0;
          } else {
            if (var3 != ((ih) this).field_L) {
              break L0;
            } else {
              ((ih) this).a(((ih) this).field_Z, (byte) -90, ((ih) this).field_y, ((ih) this).field_B);
              this.a((byte) 36);
              return;
            }
          }
        }
        L1: {
          if (param0 == 36) {
            break L1;
          } else {
            ((ih) this).field_Y = -103L;
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != ((ih) this).field_t) {
            L3: {
              ((ih) this).field_Y = var4;
              ((ih) this).field_K = var2;
              ((ih) this).field_t = var3;
              if (((ih) this).field_B == null) {
                break L3;
              } else {
                if (((ih) this).field_L < var3) {
                  ((ih) this).field_t = ((ih) this).field_L;
                  ((ih) this).field_K = -1;
                  ((ih) this).field_Y = ((ih) this).field_q.b(((ih) this).field_t);
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
                if (var3 != ((ih) this).field_q.field_i[var2]) {
                  break L5;
                } else {
                  ((ih) this).field_q.d(var2);
                  var6 = ((ih) this).field_q.c(var2);
                  if (var6 == 1) {
                    ((ih) this).field_q.a();
                    ((ih) this).field_q.a(var2);
                    if (((ih) this).field_q.b()) {
                      if (null == ((ih) this).field_B) {
                        L6: {
                          if (!((ih) this).field_Z) {
                            break L6;
                          } else {
                            if (var3 == 0) {
                              break L6;
                            } else {
                              ((ih) this).field_q.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, true);
                        ((ih) this).field_q.f();
                        return;
                      } else {
                        ((ih) this).a(param0 + -34, ((ih) this).field_Z, ((ih) this).field_B);
                        this.a((byte) 36);
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (0 == (var6 & 128)) {
                        break L7;
                      } else {
                        this.a((byte) 127, var6);
                        break L7;
                      }
                    }
                    ((ih) this).field_q.f(var2);
                    ((ih) this).field_q.a(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((ih) this).field_q.e();
              var3 = ((ih) this).field_q.field_i[var2];
              var4 = ((ih) this).field_q.b(var3);
              continue L2;
            }
          }
        }
    }

    private final int a(byte param0, mi param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(((ih) this).field_w[param1.field_m] != 0)) {
            return 0;
        }
        fq var9 = param1.field_v;
        fq var10 = var9;
        int var4 = ((ih) this).field_A[param1.field_m] * ((ih) this).field_N[param1.field_m] + 4096 >> 502408429;
        if (param0 != -110) {
            this.a(102, (byte) -86);
        }
        var4 = 16384 + var4 * var4 >> 213302575;
        var4 = param1.field_u * var4 + 16384 >> -526523825;
        var4 = 128 + var4 * ((ih) this).field_v >> 182833000;
        var4 = var4 * ((ih) this).field_w[param1.field_m] - -128 >> 1581713032;
        if (!(0 >= var10.field_d)) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_o * (double)var10.field_d) * (double)var4);
        }
        if (!(var10.field_l == null)) {
            var5 = param1.field_s;
            var6 = var10.field_l[param1.field_A - -1];
            if (param1.field_A < -2 + var10.field_l.length) {
                var7 = (var9.field_l[param1.field_A] & 255) << 1225094824;
                var8 = var10.field_l[2 + param1.field_A] << -1873665272 & 65280;
                var6 = var6 + (-var6 + var10.field_l[3 + param1.field_A]) * (var5 + -var7) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> -1453460090;
        }
        if (0 < param1.field_x) {
            if (var10.field_g != null) {
                var5 = param1.field_x;
                var6 = var10.field_g[param1.field_p + 1];
                if (!(var10.field_g.length + -2 <= param1.field_p)) {
                    var7 = var9.field_g[param1.field_p] << -933056344 & 65280;
                    var8 = (var10.field_g[param1.field_p - -2] & 255) << -2112136536;
                    var6 = var6 + (-var6 + var10.field_g[param1.field_p - -3]) * (-var7 + var5) / (-var7 + var8);
                }
                var4 = var6 * var4 + 32 >> 1850343622;
            }
        }
        return var4;
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= -13) {
          L0: {
            if (0 <= param1) {
              ((ih) this).field_w[param1] = param0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (16 <= var4) {
                  break L0;
                } else {
                  ((ih) this).field_w[var4] = param0;
                  var4++;
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, mi param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param2 == 16) {
            break L0;
          } else {
            this.a(-101, 56, -32, -116);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param1.field_q.field_o.length;
            if (!param0) {
              break L2;
            } else {
              if (!param1.field_q.field_l) {
                break L2;
              } else {
                var6 = -param1.field_q.field_m + var4 + var4;
                var5 = (int)((long)((ih) this).field_W[param1.field_m] * (long)var6 >> 1749947142);
                var4 = var4 << 8;
                if (var4 <= var5) {
                  param1.field_K.a(true);
                  var5 = -var5 + var4 + (var4 + -1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)((ih) this).field_W[param1.field_m] * (long)var4 >> 1922895558);
          break L1;
        }
        param1.field_K.g(var5);
    }

    final synchronized hn b() {
        return null;
    }

    synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param2, -128);
        if (param1 > -78) {
            return;
        }
        ((ih) this).field_q.a(param3.field_k);
        ((ih) this).field_z = 0L;
        ((ih) this).field_Z = param0 ? true : false;
        int var5 = ((ih) this).field_q.d();
        for (var6 = 0; var6 < var5; var6++) {
            ((ih) this).field_q.d(var6);
            ((ih) this).field_q.f(var6);
            ((ih) this).field_q.a(var6);
        }
        ((ih) this).field_K = ((ih) this).field_q.e();
        ((ih) this).field_t = ((ih) this).field_q.field_i[((ih) this).field_K];
        ((ih) this).field_Y = ((ih) this).field_q.b(((ih) this).field_t);
    }

    final synchronized void f(int param0, int param1) {
        if (param0 >= -49) {
            return;
        }
        ((ih) this).field_v = param1;
    }

    private final void a(int param0, int param1, boolean param2) {
        ((ih) this).field_P[param1] = param0;
        ((ih) this).field_D[param1] = rn.a(-128, param0);
        this.a(param1, (byte) 114, param0);
        if (!param2) {
            ((ih) this).field_z = -32L;
        }
    }

    final synchronized boolean a(p param0, kl param1, int param2, um param3, byte param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        vc var8 = null;
        int var9 = 0;
        int var11 = 0;
        io var12 = null;
        io var13 = null;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          param3.b();
          var6 = 1;
          var7 = null;
          if (param2 > 0) {
            var7_array = new int[]{param2};
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 == 86) {
          var8 = (vc) (Object) param3.field_l.b(1);
          L1: while (true) {
            if (var8 == null) {
              L2: {
                if (var6 == 0) {
                  break L2;
                } else {
                  param3.a();
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              L3: {
                var9 = (int)var8.field_i;
                var12 = (io) (Object) ((ih) this).field_T.a(-27, (long)var9);
                if (var12 == null) {
                  var13 = wl.a(param1, var9, true);
                  if (var13 != null) {
                    ((ih) this).field_T.a((tc) (Object) var13, (long)var9, 24);
                    if (var13.a(param4 + 10922, var8.field_n, var7_array, param0)) {
                      break L3;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  } else {
                    var6 = 0;
                    break L3;
                  }
                } else {
                  if (var12.a(param4 + 10922, var8.field_n, var7_array, param0)) {
                    break L3;
                  } else {
                    var6 = 0;
                    var8 = (vc) (Object) param3.field_l.b((byte) 115);
                    continue L1;
                  }
                }
              }
              var8 = (vc) (Object) param3.field_l.b((byte) 115);
              continue L1;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(param2 == ((ih) this).field_O[param0])) {
            ((ih) this).field_O[param0] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((ih) this).field_I[param0][var4] = null;
            }
        }
        if (param1 < 111) {
            field_E = null;
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!((ih) this).field_q.g()) {
              break L1;
            } else {
              var4 = ((ih) this).field_U * ((ih) this).field_q.field_c / rc.field_d;
              L2: while (true) {
                var5 = ((ih) this).field_z - -((long)param2 * (long)var4);
                if (0L > -var5 + ((ih) this).field_Y) {
                  var7 = (int)(((long)var4 + (((ih) this).field_Y - (((ih) this).field_z + 1L))) / (long)var4);
                  ((ih) this).field_z = ((ih) this).field_z + (long)var4 * (long)var7;
                  ((ih) this).field_Q.b(param0, param1, var7);
                  this.a((byte) 36);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (((ih) this).field_q.g()) {
                    continue L2;
                  } else {
                    ((ih) this).field_Q.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((ih) this).field_z = var5;
                  break L1;
                }
              }
            }
          }
          ((ih) this).field_Q.b(param0, param1, param2);
          break L0;
        }
    }

    final boolean c(byte param0, mi param1) {
        if (param0 > -76) {
            ((ih) this).field_C = null;
        }
        if (param1.field_K == null) {
            if (param1.field_x >= 0) {
                param1.d(56);
                if (-1 > (param1.field_F ^ -1)) {
                    if (((ih) this).field_I[param1.field_m][param1.field_F] != param1) {
                        return true;
                    }
                    ((ih) this).field_I[param1.field_m][param1.field_F] = null;
                }
            }
            return true;
        }
        return false;
    }

    final synchronized void h(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        io var5 = (io) (Object) ((ih) this).field_T.b(1);
        int var3 = -125 % ((-68 - param0) / 49);
        while (var5 != null) {
            var5.a(126);
            var5 = (io) (Object) ((ih) this).field_T.b((byte) 55);
        }
    }

    private final void b(boolean param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 == (2 & ((ih) this).field_o[param1])) {
            break L0;
          } else {
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 89);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_m != param1) {
                    break L2;
                  } else {
                    if (null == ((ih) this).field_M[param1][var3.field_D]) {
                      if (0 <= var3.field_x) {
                        break L2;
                      } else {
                        var3.field_x = 0;
                        break L2;
                      }
                    } else {
                      var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
                      continue L1;
                    }
                  }
                }
                var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
                continue L1;
              }
            }
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            var5 = null;
            boolean discarded$1 = ((ih) this).a((p) null, (kl) null, -24, (um) null, (byte) 111);
            break L3;
          }
        }
    }

    public static void f(int param0) {
        field_G = null;
        if (param0 != -128) {
            field_X = null;
        }
        field_H = null;
        field_X = null;
        field_p = null;
        field_E = null;
        field_R = null;
    }

    final int i(int param0) {
        if (param0 != 4096) {
            ((ih) this).field_W = null;
        }
        return ((ih) this).field_v;
    }

    final static String e(int param0) {
        int var3 = 0;
        at var4 = null;
        jd var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ic var1 = rd.field_j;
        if (!(var1 != null)) {
            return "No game in progress.";
        }
        at[] var2 = var1.field_xb.field_t;
        if (param0 <= 10) {
            return null;
        }
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            var5 = (jd) (Object) var4.e((byte) 99);
            while (var5 != null) {
                var5.field_u = false;
                var5 = (jd) (Object) var4.a((byte) 123);
            }
        }
        return "Did that work?";
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        mi var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        mi var8 = ((ih) this).field_M[param3][param1];
        if (var8 == null) {
            return;
        }
        ((ih) this).field_M[param3][param1] = null;
        if (param2 != -44) {
            String discarded$0 = ih.e(-77);
        }
        if (-1 == (((ih) this).field_o[param3] & 2 ^ -1)) {
            var8.field_x = 0;
        } else {
            var6 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 87);
            while (var6 != null) {
                if (var6.field_m == var8.field_m) {
                    if ((var6.field_x ^ -1) > -1) {
                        if (var8 != var6) {
                            var8.field_x = 0;
                            break;
                        }
                    }
                }
                var6 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            }
        }
    }

    final synchronized void j(int param0) {
        this.a(true, -128);
        if (param0 != 7) {
            ((ih) this).field_I = null;
        }
    }

    private final int a(int param0, mi param1) {
        int var3 = 0;
        fq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 == 1370206316) {
            break L0;
          } else {
            ((ih) this).field_T = null;
            break L0;
          }
        }
        L1: {
          var3 = param1.field_t + (param1.field_n * param1.field_J >> 1370206316);
          var3 = var3 + (((ih) this).field_x[param1.field_m] * (-8192 + ((ih) this).field_r[param1.field_m]) >> 2006173580);
          var4 = param1.field_v;
          if (var4.field_b <= 0) {
            break L1;
          } else {
            L2: {
              if (-1 > (var4.field_j ^ -1)) {
                break L2;
              } else {
                if (((ih) this).field_u[param1.field_m] > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_j << -191257566;
              var6 = var4.field_e << -908471167;
              if (var6 <= param1.field_I) {
                break L3;
              } else {
                var5 = param1.field_I * var5 / var6;
                break L3;
              }
            }
            var5 = var5 + (((ih) this).field_u[param1.field_m] >> 505567495);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_y & 511));
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(param1.field_q.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)rc.field_d);
          if (1 > var5) {
            stackOut_11_0 = 1;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = var5;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
    }

    final synchronized hn a() {
        return (hn) (Object) ((ih) this).field_Q;
    }

    final boolean a(int param0, int param1, mi param2, byte param3, int[] param4) {
        int var6 = 0;
        fq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          param2.field_w = rc.field_d / 100;
          if (0 > param2.field_x) {
            break L0;
          } else {
            L1: {
              if (param2.field_K == null) {
                break L1;
              } else {
                if (param2.field_K.i()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param2.e(13301);
              param2.d(-119);
              if ((param2.field_F ^ -1) >= -1) {
                break L2;
              } else {
                if (param2 != ((ih) this).field_I[param2.field_m][param2.field_F]) {
                  break L2;
                } else {
                  ((ih) this).field_I[param2.field_m][param2.field_F] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param2.field_n;
          if (0 >= var6) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((ih) this).field_F[param2.field_m] * 0.0004921259842519685));
              if (0 > var6) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param2.field_n = var6;
            break L3;
          }
        }
        L5: {
          param2.field_K.e(this.a(1370206316, param2));
          var7 = param2.field_v;
          param2.field_y = param2.field_y + var7.field_b;
          param2.field_I = param2.field_I + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param2.field_J * param2.field_n >> 1025410028) + (-60 + param2.field_D << -1030717176));
          if (0 < var7.field_d) {
            L6: {
              if (-1 > (var7.field_i ^ -1)) {
                param2.field_o = param2.field_o + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
                break L6;
              } else {
                param2.field_o = param2.field_o + 128;
                break L6;
              }
            }
            if (var7.field_d * param2.field_o > -819201) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          } else {
            break L5;
          }
        }
        L7: {
          if (var7.field_l != null) {
            L8: {
              if (-1 >= var7.field_m) {
                param2.field_s = param2.field_s + 128;
                break L8;
              } else {
                param2.field_s = param2.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_m) * 128.0);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (param2.field_A >= var7.field_l.length - 2) {
                  break L10;
                } else {
                  if ((255 & var7.field_l[param2.field_A - -2]) << -72772568 >= param2.field_s) {
                    break L10;
                  } else {
                    param2.field_A = param2.field_A + 2;
                    continue L9;
                  }
                }
              }
              if (param2.field_A != var7.field_l.length + -2) {
                break L7;
              } else {
                if (var7.field_l[1 + param2.field_A] != 0) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
          } else {
            break L7;
          }
        }
        L11: {
          if (param3 > 34) {
            break L11;
          } else {
            this.b(-100, -5, -59);
            break L11;
          }
        }
        L12: {
          if ((param2.field_x ^ -1) > -1) {
            break L12;
          } else {
            if (var7.field_g == null) {
              break L12;
            } else {
              if (0 != (1 & ((ih) this).field_o[param2.field_m])) {
                break L12;
              } else {
                L13: {
                  if ((param2.field_F ^ -1) > -1) {
                    break L13;
                  } else {
                    if (param2 != ((ih) this).field_I[param2.field_m][param2.field_F]) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if (var7.field_c <= 0) {
                    param2.field_x = param2.field_x + 128;
                    break L14;
                  } else {
                    param2.field_x = param2.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (param2.field_p >= var7.field_g.length - 2) {
                      break L16;
                    } else {
                      if ((255 & var7.field_g[2 + param2.field_p]) << -1112088760 >= param2.field_x) {
                        break L16;
                      } else {
                        param2.field_p = param2.field_p + 2;
                        continue L15;
                      }
                    }
                  }
                  if (-2 + var7.field_g.length == param2.field_p) {
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
        if (var8 == 0) {
          param2.field_K.a(param2.field_w, this.a((byte) -110, param2), this.b((byte) 112, param2));
          return false;
        } else {
          L17: {
            param2.field_K.h(param2.field_w);
            if (param4 == null) {
              param2.field_K.a(param0);
              break L17;
            } else {
              param2.field_K.b(param4, param1, param0);
              break L17;
            }
          }
          L18: {
            if (!param2.field_K.e()) {
              break L18;
            } else {
              ((ih) this).field_Q.field_s.a((hn) (Object) param2.field_K);
              break L18;
            }
          }
          L19: {
            param2.e(13301);
            if (param2.field_x >= 0) {
              param2.d(93);
              if (0 >= param2.field_F) {
                break L19;
              } else {
                if (((ih) this).field_I[param2.field_m][param2.field_F] != param2) {
                  break L19;
                } else {
                  ((ih) this).field_I[param2.field_m][param2.field_F] = null;
                  break L19;
                }
              }
            } else {
              break L19;
            }
          }
          return true;
        }
    }

    private final void b(int param0, int param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 != 0) {
            ((ih) this).f(81, -106);
        }
        mi var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 105);
        while (var3 != null) {
            if (0 <= param0) {
                // if_icmpeq L59
            } else {
                if (!(-1 >= (var3.field_x ^ -1))) {
                    ((ih) this).field_M[var3.field_m][var3.field_D] = null;
                    var3.field_x = 0;
                }
            }
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
        }
    }

    private final void e(int param0, int param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        mi var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 121);
        if (param0 != -23024) {
            ((ih) this).field_W = null;
        }
        while (var3 != null) {
            if (-1 >= (param1 ^ -1)) {
                // if_icmpne L174
            }
            if (null != var3.field_K) {
                var3.field_K.h(rc.field_d / 100);
                if (var3.field_K.e()) {
                    ((ih) this).field_Q.field_s.a((hn) (Object) var3.field_K);
                }
                var3.e(13301);
            }
            if ((var3.field_x ^ -1) > -1) {
                ((ih) this).field_M[var3.field_m][var3.field_D] = null;
            }
            var3.d(-118);
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 != -1) {
            this.a(true, false);
        }
        this.a(param1, param2, true);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != 2) {
            ((ih) this).f(-56, 47);
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((ih) this).field_r[param0] = param1;
        if (param2 < 117) {
            ((ih) this).field_I = null;
        }
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 >= (param1 ^ -1)) {
          L0: {
            ((ih) this).field_N[param1] = 12800;
            ((ih) this).field_V[param1] = 8192;
            ((ih) this).field_A[param1] = 16383;
            ((ih) this).field_r[param1] = 8192;
            ((ih) this).field_u[param1] = 0;
            ((ih) this).field_F[param1] = 8192;
            this.b(false, param1);
            if (param0 > 31) {
              break L0;
            } else {
              this.a(-1, (byte) -1, 112, 0);
              break L0;
            }
          }
          this.a(param1, (byte) 83);
          ((ih) this).field_o[param1] = 0;
          ((ih) this).field_J[param1] = 32767;
          ((ih) this).field_x[param1] = 256;
          ((ih) this).field_W[param1] = 0;
          this.d(10287, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.d(59, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 240 & param1;
        if (param0 >= 102) {
          if (var3 != 128) {
            L0: {
              if (var3 != 144) {
                if (var3 != 160) {
                  if (-177 != (var3 ^ -1)) {
                    if ((var3 ^ -1) == -193) {
                      var4 = param1 & 15;
                      var5 = param1 >> 422195368 & 127;
                      this.a(var4, (byte) 112, var5 + ((ih) this).field_D[var4]);
                      return;
                    } else {
                      if (var3 == 208) {
                        var4 = param1 & 15;
                        var5 = 127 & param1 >> -446554008;
                        this.b(var5, 2, var4);
                        return;
                      } else {
                        if (var3 == 224) {
                          var4 = 15 & param1;
                          var5 = (param1 >> -1973025368 & 127) + (param1 >> -32676663 & 16256);
                          this.c(var4, var5, 124);
                          return;
                        } else {
                          var3 = 255 & param1;
                          if (var3 != 255) {
                            return;
                          } else {
                            this.a(true, true);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L1: {
                      var4 = 15 & param1;
                      var5 = (param1 & 32599) >> -1979291608;
                      var6 = 127 & param1 >> -1730200496;
                      if (0 == var5) {
                        ((ih) this).field_D[var4] = rn.a(-2080769, ((ih) this).field_D[var4]) + (var6 << -1422155858);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (var5 == 32) {
                        ((ih) this).field_D[var4] = (var6 << -41524697) + rn.a(((ih) this).field_D[var4], -16257);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if ((var5 ^ -1) == -2) {
                        ((ih) this).field_u[var4] = rn.a(((ih) this).field_u[var4], -16257) - -(var6 << 283211143);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if ((var5 ^ -1) == -34) {
                        ((ih) this).field_u[var4] = rn.a(((ih) this).field_u[var4], -128) + var6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (5 != var5) {
                        break L5;
                      } else {
                        ((ih) this).field_F[var4] = rn.a(-16257, ((ih) this).field_F[var4]) + (var6 << 1206599719);
                        break L5;
                      }
                    }
                    L6: {
                      if (37 != var5) {
                        break L6;
                      } else {
                        ((ih) this).field_F[var4] = var6 + rn.a(((ih) this).field_F[var4], -128);
                        break L6;
                      }
                    }
                    L7: {
                      if (7 == var5) {
                        ((ih) this).field_N[var4] = (var6 << 172069607) + rn.a(-16257, ((ih) this).field_N[var4]);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((var5 ^ -1) != -40) {
                        break L8;
                      } else {
                        ((ih) this).field_N[var4] = var6 + rn.a(-128, ((ih) this).field_N[var4]);
                        break L8;
                      }
                    }
                    L9: {
                      if (10 == var5) {
                        ((ih) this).field_V[var4] = rn.a(-16257, ((ih) this).field_V[var4]) - -(var6 << -1894561625);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 42) {
                        break L10;
                      } else {
                        ((ih) this).field_V[var4] = var6 + rn.a(((ih) this).field_V[var4], -128);
                        break L10;
                      }
                    }
                    L11: {
                      if (-12 == (var5 ^ -1)) {
                        ((ih) this).field_A[var4] = rn.a(((ih) this).field_A[var4], -16257) - -(var6 << -1487157177);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if ((var5 ^ -1) != -44) {
                        break L12;
                      } else {
                        ((ih) this).field_A[var4] = rn.a(-128, ((ih) this).field_A[var4]) - -var6;
                        break L12;
                      }
                    }
                    L13: {
                      if (-65 != (var5 ^ -1)) {
                        break L13;
                      } else {
                        if ((var6 ^ -1) <= -65) {
                          ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 1);
                          break L13;
                        } else {
                          ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -2);
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (var5 == 65) {
                        if ((var6 ^ -1) > -65) {
                          this.b(false, var4);
                          ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -3);
                          break L14;
                        } else {
                          ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 2);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if ((var5 ^ -1) != -100) {
                        break L15;
                      } else {
                        ((ih) this).field_J[var4] = rn.a(127, ((ih) this).field_J[var4]) - -(var6 << 1718482119);
                        break L15;
                      }
                    }
                    L16: {
                      if (-99 == (var5 ^ -1)) {
                        ((ih) this).field_J[var4] = rn.a(16256, ((ih) this).field_J[var4]) - -var6;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((var5 ^ -1) == -102) {
                        ((ih) this).field_J[var4] = 16384 - (-rn.a(127, ((ih) this).field_J[var4]) - (var6 << -2018841465));
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if ((var5 ^ -1) == -101) {
                        ((ih) this).field_J[var4] = var6 + (rn.a(((ih) this).field_J[var4], 16256) + 16384);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if ((var5 ^ -1) != -121) {
                        break L19;
                      } else {
                        this.e(-23024, var4);
                        break L19;
                      }
                    }
                    L20: {
                      if ((var5 ^ -1) == -122) {
                        this.d(107, var4);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (123 == var5) {
                        this.b(var4, 0);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 == 6) {
                        var7 = ((ih) this).field_J[var4];
                        if (16384 != var7) {
                          break L22;
                        } else {
                          ((ih) this).field_x[var4] = rn.a(-16257, ((ih) this).field_x[var4]) - -(var6 << 808055399);
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (38 == var5) {
                        var7 = ((ih) this).field_J[var4];
                        if ((var7 ^ -1) != -16385) {
                          break L23;
                        } else {
                          ((ih) this).field_x[var4] = var6 + rn.a(-128, ((ih) this).field_x[var4]);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (16 != var5) {
                        break L24;
                      } else {
                        ((ih) this).field_W[var4] = rn.a(-16257, ((ih) this).field_W[var4]) + (var6 << -596374681);
                        break L24;
                      }
                    }
                    L25: {
                      if ((var5 ^ -1) == -49) {
                        ((ih) this).field_W[var4] = var6 + rn.a(((ih) this).field_W[var4], -128);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var5 != 81) {
                        break L26;
                      } else {
                        if (var6 < 64) {
                          this.a(var4, (byte) -66);
                          ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -5);
                          break L26;
                        } else {
                          ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 4);
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (-18 != (var5 ^ -1)) {
                        break L27;
                      } else {
                        this.d(10287, var4, (-16257 & ((ih) this).field_C[var4]) + (var6 << -1786454681));
                        break L27;
                      }
                    }
                    if (-50 != (var5 ^ -1)) {
                      break L0;
                    } else {
                      this.d(10287, var4, var6 + (((ih) this).field_C[var4] & -128));
                      return;
                    }
                  }
                } else {
                  var4 = 15 & param1;
                  var5 = param1 >> -37303256 & 127;
                  var6 = (param1 & 8346101) >> 1231257520;
                  this.a(var4, (byte) 79, var5, var6);
                  return;
                }
              } else {
                var4 = 15 & param1;
                var5 = param1 >> 702033928 & 127;
                var6 = param1 >> 473058608 & 127;
                if (0 < var6) {
                  this.b(64, var5, var6, var4);
                  return;
                } else {
                  this.a(64, var5, -44, var4);
                  break L0;
                }
              }
            }
            return;
          } else {
            var4 = param1 & 15;
            var5 = (32625 & param1) >> 267686408;
            var6 = (8335388 & param1) >> -133102640;
            this.a(var6, var5, -44, var4);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!((ih) this).field_q.g()) {
              break L1;
            } else {
              var2 = ((ih) this).field_q.field_c * ((ih) this).field_U / rc.field_d;
              L2: while (true) {
                var3 = ((ih) this).field_z + (long)param0 * (long)var2;
                if (-1L < (-var3 + ((ih) this).field_Y ^ -1L)) {
                  var5 = (int)((-1L + ((long)var2 + -((ih) this).field_z) + ((ih) this).field_Y) / (long)var2);
                  ((ih) this).field_z = ((ih) this).field_z + (long)var2 * (long)var5;
                  ((ih) this).field_Q.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 36);
                  if (((ih) this).field_q.g()) {
                    continue L2;
                  } else {
                    ((ih) this).field_Q.a(param0);
                    break L0;
                  }
                } else {
                  ((ih) this).field_z = var3;
                  break L1;
                }
              }
            }
          }
          ((ih) this).field_Q.a(param0);
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        mi var5 = null;
        sn var6 = null;
        int var6_int = 0;
        mi var7 = null;
        mi var8 = null;
        int var9 = 0;
        io var10 = null;
        io var11 = null;
        io var12 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.a(param0, param1, -44, param3);
          if ((2 & ((ih) this).field_o[param3]) == 0) {
            break L0;
          } else {
            var5 = (mi) (Object) ((ih) this).field_Q.field_p.d((byte) -83);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_m != param3) {
                    break L2;
                  } else {
                    if ((var5.field_x ^ -1) <= -1) {
                      break L2;
                    } else {
                      ((ih) this).field_M[param3][var5.field_D] = null;
                      ((ih) this).field_M[param3][param1] = var5;
                      var6_int = var5.field_t - -(var5.field_J * var5.field_n >> -1581962420);
                      var5.field_t = var5.field_t + (param1 - var5.field_D << 1196212008);
                      var5.field_J = -var5.field_t + var6_int;
                      var5.field_D = param1;
                      var5.field_n = 4096;
                      return;
                    }
                  }
                }
                var5 = (mi) (Object) ((ih) this).field_Q.field_p.b((byte) 60);
                continue L1;
              }
            }
          }
        }
        var10 = (io) (Object) ((ih) this).field_T.a(-22, (long)((ih) this).field_O[param3]);
        var11 = var10;
        var12 = var11;
        if (var11 != null) {
          var6 = var10.field_y[param1];
          if (var6 != null) {
            L3: {
              var7 = new mi();
              var7.field_q = var6;
              var7.field_H = var11;
              var7.field_m = param3;
              var7.field_v = var10.field_v[param1];
              var7.field_F = var10.field_k[param1];
              var7.field_D = param1;
              var7.field_u = 1024 + param2 * param2 * (var10.field_s * var10.field_l[param1]) >> -166795733;
              var7.field_E = 255 & var10.field_x[param1];
              var7.field_t = (param1 << -79119032) - (32767 & var10.field_r[param1]);
              var7.field_o = 0;
              var7.field_p = 0;
              var7.field_x = -1;
              var7.field_A = 0;
              var7.field_s = 0;
              if (((ih) this).field_W[param3] != 0) {
                L4: {
                  var7.field_K = aa.b(var6, this.a(1370206316, var7), 0, this.b((byte) -119, var7));
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (0 <= var12.field_r[param1]) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L4;
                  }
                }
                ((ih) this).a(stackIn_16_1 != 0, var7, param0 + -48);
                break L3;
              } else {
                var7.field_K = aa.b(var6, this.a(1370206316, var7), this.a((byte) -110, var7), this.b((byte) -117, var7));
                break L3;
              }
            }
            L5: {
              if (0 > var12.field_r[param1]) {
                var7.field_K.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 >= (var7.field_F ^ -1)) {
                L7: {
                  var8 = ((ih) this).field_I[param3][var7.field_F];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if ((var8.field_x ^ -1) <= -1) {
                      break L7;
                    } else {
                      ((ih) this).field_M[param3][var8.field_D] = null;
                      var8.field_x = 0;
                      break L7;
                    }
                  }
                }
                ((ih) this).field_I[param3][var7.field_F] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((ih) this).field_Q.field_p.a((byte) -119, (tc) (Object) var7);
            ((ih) this).field_M[param3][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0, boolean param1, um param2) {
        ((ih) this).a(param1, (byte) -113, true, param2);
        if (param0 != 2) {
            ((ih) this).a(-44);
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((ih) this).field_q.f();
        ((ih) this).field_B = null;
        if (param1 != -128) {
            Object var4 = null;
            ((ih) this).a(-112, true, (um) null);
        }
        this.a(true, param0);
    }

    final synchronized boolean g(int param0) {
        if (param0 != 11899) {
            ((ih) this).field_C = null;
        }
        return ((ih) this).field_q.g();
    }

    private final void a(int param0, byte param1) {
        mi var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = -88 / ((param1 - 1) / 57);
        if ((4 & ((ih) this).field_o[param0]) != 0) {
            var4 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 107);
            while (var4 != null) {
                if (!(var4.field_m != param0)) {
                    var4.field_B = 0;
                }
                var4 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var6 = 0;
        int var5 = 0;
        wk var8 = null;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        param2 = param2 << 254558216 | param2;
        int var4 = param2 ^ param2 >> -1327939647;
        if (param0 >= -119) {
            field_R = null;
        }
        for (var7 = 0; (var7 ^ -1) > -5; var7++) {
            var6 = -64 + (param3 + (bm.field_y[var7][1] - -(param2 & 3)));
            var5 = (var4 & 7) + (bm.field_y[var7][0] + param1) - 44;
            var8 = tn.field_eb[0 + param2 % 6];
            fe.a(var8, var5, var6);
            var4 = var4 >> 1;
            param2 = param2 >> 1;
        }
    }

    private final void d(int param0, int param1, int param2) {
        ((ih) this).field_C[param1] = param2;
        ((ih) this).field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 10287) {
            this.a(60, -113, 122, -42);
        }
    }

    private final int b(byte param0, mi param1) {
        int var3 = ((ih) this).field_V[param1.field_m];
        int var4 = 78 / ((param0 - 63) / 40);
        if ((var3 ^ -1) > -8193) {
            return 32 + var3 * param1.field_E >> -1156598330;
        }
        return 16384 - ((-var3 + 16384) * (128 - param1.field_E) - -32 >> -436802810);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 33) {
            this.a(-79, 59, false);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param0) {
            return;
        }
        if (!param1) {
            this.b(-1, 0);
        } else {
            this.e(-23024, -1);
        }
        this.d(89, -1);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            ((ih) this).field_O[var3] = ((ih) this).field_P[var3];
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((ih) this).field_D[var5] = rn.a(((ih) this).field_P[var5], -128);
            var5++;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 >= -13) {
            ((ih) this).field_C = null;
        }
        ((ih) this).field_U = param0;
    }

    protected ih() {
        ((ih) this).field_F = new int[16];
        ((ih) this).field_u = new int[16];
        ((ih) this).field_P = new int[16];
        ((ih) this).field_M = new mi[16][128];
        ((ih) this).field_C = new int[16];
        ((ih) this).field_o = new int[16];
        ((ih) this).field_x = new int[16];
        ((ih) this).field_U = 1000000;
        ((ih) this).field_A = new int[16];
        ((ih) this).field_v = 256;
        ((ih) this).field_W = new int[16];
        ((ih) this).field_O = new int[16];
        ((ih) this).field_N = new int[16];
        ((ih) this).field_I = new mi[16][128];
        ((ih) this).field_s = new int[16];
        ((ih) this).field_r = new int[16];
        ((ih) this).field_w = new int[16];
        ((ih) this).field_D = new int[16];
        ((ih) this).field_V = new int[16];
        ((ih) this).field_J = new int[16];
        ((ih) this).field_q = new dw();
        ((ih) this).field_Q = new os((ih) this);
        ((ih) this).field_T = new bg(128);
        ((ih) this).a(256, -1, (byte) -116);
        this.a(true, true);
    }

    ih(ih param0) {
        ((ih) this).field_F = new int[16];
        ((ih) this).field_u = new int[16];
        ((ih) this).field_P = new int[16];
        ((ih) this).field_M = new mi[16][128];
        ((ih) this).field_C = new int[16];
        ((ih) this).field_o = new int[16];
        ((ih) this).field_x = new int[16];
        ((ih) this).field_U = 1000000;
        ((ih) this).field_A = new int[16];
        ((ih) this).field_v = 256;
        ((ih) this).field_W = new int[16];
        ((ih) this).field_O = new int[16];
        ((ih) this).field_N = new int[16];
        ((ih) this).field_I = new mi[16][128];
        ((ih) this).field_s = new int[16];
        ((ih) this).field_r = new int[16];
        ((ih) this).field_w = new int[16];
        ((ih) this).field_D = new int[16];
        ((ih) this).field_V = new int[16];
        ((ih) this).field_J = new int[16];
        ((ih) this).field_q = new dw();
        ((ih) this).field_Q = new os((ih) this);
        ((ih) this).field_T = param0.field_T;
        ((ih) this).a(256, -1, (byte) -70);
        this.a(true, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_E = new int[4096];
        field_p = null;
        field_G = new byte[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_E[var0] = 1;
            field_G[var0] = (byte)-128;
        }
        field_X = "Offensive account name";
        field_R = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
