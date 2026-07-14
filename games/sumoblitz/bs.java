/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends hj {
    private int field_E;
    private int[] field_L;
    private int[] field_H;
    int[] field_R;
    private int[] field_F;
    private int[] field_T;
    private int[] field_y;
    private sh field_v;
    private int[] field_B;
    private int[] field_S;
    private uu[][] field_P;
    private int field_r;
    private int[] field_D;
    private te field_p;
    int[] field_x;
    private int[] field_N;
    private int[] field_w;
    private int[] field_G;
    private uu[][] field_t;
    private int[] field_z;
    private int[] field_K;
    static char[] field_o;
    int[] field_J;
    private boolean field_M;
    private long field_q;
    private rh field_s;
    private int field_C;
    private long field_O;
    private int field_Q;
    private int field_u;
    private boolean field_A;
    private tv field_I;

    final synchronized boolean c(int param0) {
        if (param0 != -8192) {
            Object var3 = null;
            ((bs) this).a(false, (tv) null, -40);
        }
        return ((bs) this).field_v.c();
    }

    final synchronized hj c() {
        return null;
    }

    private final int c(int param0, uu param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 != 255) {
            ((bs) this).field_T = null;
        }
        if (-1 == (((bs) this).field_y[param1.field_y] ^ -1)) {
            return 0;
        }
        mq var9 = param1.field_w;
        mq var10 = var9;
        int var4 = 4096 + ((bs) this).field_T[param1.field_y] * ((bs) this).field_w[param1.field_y] >> 1508202765;
        var4 = 16384 + var4 * var4 >> 1622959503;
        var4 = 16384 + param1.field_F * var4 >> -1884114673;
        var4 = 128 + ((bs) this).field_r * var4 >> 269218088;
        var4 = var4 * ((bs) this).field_y[param1.field_y] - -128 >> 2050093704;
        if (0 < var10.field_i) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_i));
        }
        if (null != var10.field_g) {
            var5 = param1.field_G;
            var6 = var10.field_g[param1.field_r + 1];
            if ((param1.field_r ^ -1) > (-2 + var10.field_g.length ^ -1)) {
                var7 = 65280 & var9.field_g[param1.field_r] << -2137375128;
                var8 = var10.field_g[param1.field_r + 2] << -1169234744 & 65280;
                var6 = var6 + (var5 + -var7) * (-var6 + var10.field_g[3 + param1.field_r]) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> -570420186;
        }
        if (-1 > (param1.field_x ^ -1)) {
            if (var10.field_h != null) {
                var5 = param1.field_x;
                var6 = var10.field_h[1 + param1.field_n];
                if (!((-2 + var10.field_h.length ^ -1) >= (param1.field_n ^ -1))) {
                    var7 = (var9.field_h[param1.field_n] & 255) << 272916840;
                    var8 = 65280 & var10.field_h[param1.field_n + 2] << -750033848;
                    var6 = var6 + (var10.field_h[3 + param1.field_n] + -var6) * (-var7 + var5) / (var8 - var7);
                }
                var4 = var6 * var4 - -32 >> -2031878778;
            }
        }
        return var4;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        uu var6 = null;
        int var7 = 0;
        uu var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = ((bs) this).field_t[param3][param1];
        if (var8 != null) {
          L0: {
            ((bs) this).field_t[param3][param1] = null;
            if (-1 == (((bs) this).field_J[param3] & 2 ^ -1)) {
              var8.field_x = 0;
              break L0;
            } else {
              var6 = (uu) (Object) ((bs) this).field_s.field_t.b(param2 + -12866);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var8.field_y != var6.field_y) {
                      break L2;
                    } else {
                      if (var6.field_x >= 0) {
                        break L2;
                      } else {
                        if (var8 != var6) {
                          var8.field_x = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                  continue L1;
                }
              }
            }
          }
          L3: {
            if (param2 == 12800) {
              break L3;
            } else {
              ((bs) this).field_r = 50;
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(boolean param0, uu param1) {
        int var3 = 0;
        mq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (param1.field_p * param1.field_k >> -511409044) + param1.field_m;
          var3 = var3 + (((bs) this).field_D[param1.field_y] * (-8192 + ((bs) this).field_L[param1.field_y]) >> 179164492);
          if (param0) {
            break L0;
          } else {
            ((bs) this).field_O = 8L;
            break L0;
          }
        }
        L1: {
          var4 = param1.field_w;
          if (-1 <= (var4.field_j ^ -1)) {
            break L1;
          } else {
            L2: {
              if ((var4.field_b ^ -1) < -1) {
                break L2;
              } else {
                if ((((bs) this).field_K[param1.field_y] ^ -1) < -1) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_b << -165543262;
              var6 = var4.field_e << -1276582079;
              if ((var6 ^ -1) < (param1.field_H ^ -1)) {
                var5 = var5 * param1.field_H / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((bs) this).field_K[param1.field_y] >> -2115991481);
            var7 = Math.sin((double)(511 & param1.field_C) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(param1.field_B.field_n * 256) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)du.field_k);
          if ((var5 ^ -1) <= -2) {
            stackOut_12_0 = var5;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        return stackIn_13_0;
    }

    private final void a(int param0, boolean param1) {
        int var4 = 0;
        Object var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (0 > param0) {
          param0 = 0;
          L0: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.a(param0, true);
              param0++;
              continue L0;
            }
          }
        } else {
          L1: {
            ((bs) this).field_w[param0] = 12800;
            ((bs) this).field_G[param0] = 8192;
            ((bs) this).field_T[param0] = 16383;
            ((bs) this).field_L[param0] = 8192;
            ((bs) this).field_K[param0] = 0;
            ((bs) this).field_z[param0] = 8192;
            this.b(param0, (byte) 126);
            this.a(param0, 32605);
            if (param1) {
              break L1;
            } else {
              var5 = null;
              int discarded$1 = this.a(45, (uu) null);
              break L1;
            }
          }
          ((bs) this).field_J[param0] = 0;
          ((bs) this).field_S[param0] = 32767;
          ((bs) this).field_D[param0] = 256;
          ((bs) this).field_R[param0] = 0;
          this.d(8192, param0, 41);
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
            this.c(-1, -1);
        } else {
            this.c(-1, (byte) -30);
        }
        this.a(-1, param1);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            ((bs) this).field_B[var3] = ((bs) this).field_H[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (-17 < (var5 ^ -1)) {
            ((bs) this).field_F[var5] = eb.a(((bs) this).field_H[var5], -128);
            var5++;
        }
    }

    final synchronized boolean a(og param0, tv param1, int param2, ki param3, int param4) {
        int[] var7_array = null;
        int var9 = 0;
        td var10 = null;
        td var10_ref = null;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        param1.b();
        int var6 = 1;
        Object var7 = null;
        if ((param4 ^ -1) < param2) {
            var7_array = new int[]{param4};
        }
        tj var8 = (tj) (Object) param1.field_l.a(52);
        while (var8 != null) {
            var9 = (int)var8.field_h;
            var10 = (td) (Object) ((bs) this).field_p.a(param2 ^ -119, (long)var9);
            if (var10 != null) {
                // ifeq L176
            } else {
                var10_ref = u.a(param3, var9, 0);
                if (var10_ref == null) {
                    var6 = 0;
                } else {
                    ((bs) this).field_p.a((ms) (Object) var10_ref, param2 ^ 0, (long)var9);
                    if (!(var10_ref.a(var8.field_m, var7_array, param0, 1255750754))) {
                        var6 = 0;
                    }
                }
            }
            var8 = (tj) (Object) param1.field_l.a(true);
        }
        if (!(var6 == 0)) {
            param1.a();
        }
        return var6 != 0;
    }

    final synchronized hj a() {
        return (hj) (Object) ((bs) this).field_s;
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(int param0, uu param1) {
        if (param0 != 16384) {
            ((bs) this).field_K = null;
        }
        int var3 = ((bs) this).field_G[param1.field_y];
        if (8192 > var3) {
            return var3 * param1.field_D + 32 >> 2065529958;
        }
        return 16384 + -((128 + -param1.field_D) * (16384 + -var3) + 32 >> -17436666);
    }

    final synchronized void a(boolean param0, tv param1, int param2) {
        if (param2 <= 48) {
            this.d(0, -127, 115);
        }
        this.a(param0, true, true, param1);
    }

    final boolean a(int[] param0, int param1, int param2, uu param3, int param4) {
        int var6 = 0;
        mq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Sumoblitz.field_L ? 1 : 0;
          param3.field_u = du.field_k / 100;
          if (-1 < (param3.field_x ^ -1)) {
            break L0;
          } else {
            L1: {
              if (param3.field_z == null) {
                break L1;
              } else {
                if (!param3.field_z.h()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param3.a(0);
              param3.b(false);
              if (-1 <= (param3.field_q ^ -1)) {
                break L2;
              } else {
                if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                  break L2;
                } else {
                  ((bs) this).field_P[param3.field_y][param3.field_q] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param3.field_k;
          if (var6 > 0) {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, (double)((bs) this).field_z[param3.field_y] * 0.0004921259842519685) + 0.5);
              if (var6 >= 0) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param3.field_k = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param3.field_z.e(this.a(true, param3));
          var7 = param3.field_w;
          param3.field_C = param3.field_C + var7.field_j;
          var8 = 0;
          param3.field_H = param3.field_H + 1;
          var9 = (double)((param3.field_k * param3.field_p >> 1320346796) + (-60 + param3.field_E << 678374184)) * 0.000005086263020833333;
          if (var7.field_i > 0) {
            L6: {
              if ((var7.field_d ^ -1) < -1) {
                param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                break L6;
              } else {
                param3.field_v = param3.field_v + 128;
                break L6;
              }
            }
            if (819200 > var7.field_i * param3.field_v) {
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
          if (var7.field_g == null) {
            break L7;
          } else {
            L8: {
              if (0 >= var7.field_f) {
                param3.field_G = param3.field_G + 128;
                break L8;
              } else {
                param3.field_G = param3.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if ((var7.field_g.length + -2 ^ -1) >= (param3.field_r ^ -1)) {
                  break L10;
                } else {
                  if (param3.field_G <= (255 & var7.field_g[param3.field_r - -2]) << -845544664) {
                    break L10;
                  } else {
                    param3.field_r = param3.field_r + 2;
                    continue L9;
                  }
                }
              }
              if ((var7.field_g.length - 2 ^ -1) != (param3.field_r ^ -1)) {
                break L7;
              } else {
                if (0 == var7.field_g[param3.field_r + 1]) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          }
        }
        L11: {
          if (param4 > param3.field_x) {
            break L11;
          } else {
            if (var7.field_h == null) {
              break L11;
            } else {
              if ((1 & ((bs) this).field_J[param3.field_y]) == 0) {
                L12: {
                  if (param3.field_q < 0) {
                    break L12;
                  } else {
                    if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if ((var7.field_c ^ -1) >= -1) {
                    param3.field_x = param3.field_x + 128;
                    break L13;
                  } else {
                    param3.field_x = param3.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param3.field_n >= var7.field_h.length + -2) {
                      break L15;
                    } else {
                      if (param3.field_x <= (var7.field_h[2 + param3.field_n] & 255) << 1815279624) {
                        break L15;
                      } else {
                        param3.field_n = param3.field_n + 2;
                        continue L14;
                      }
                    }
                  }
                  if (param3.field_n == var7.field_h.length + -2) {
                    var8 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
        }
        if (var8 == 0) {
          param3.field_z.a(param3.field_u, this.c(255, param3), this.a(param4 ^ 16384, param3));
          return false;
        } else {
          L16: {
            param3.field_z.d(param3.field_u);
            if (param0 == null) {
              param3.field_z.a(param2);
              break L16;
            } else {
              param3.field_z.b(param0, param1, param2);
              break L16;
            }
          }
          L17: {
            if (!param3.field_z.k()) {
              break L17;
            } else {
              ((bs) this).field_s.field_o.b((hj) (Object) param3.field_z);
              break L17;
            }
          }
          L18: {
            param3.a(0);
            if (-1 >= (param3.field_x ^ -1)) {
              param3.b(false);
              if (param3.field_q <= 0) {
                break L18;
              } else {
                if (((bs) this).field_P[param3.field_y][param3.field_q] == param3) {
                  ((bs) this).field_P[param3.field_y][param3.field_q] = null;
                  break L18;
                } else {
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          return true;
        }
    }

    private final void b(int param0, byte param1) {
        uu var3 = null;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (-1 == (2 & ((bs) this).field_J[param0] ^ -1)) {
            break L0;
          } else {
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-78);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_y != param0) {
                    break L2;
                  } else {
                    if (((bs) this).field_t[param0][var3.field_E] == null) {
                      if (0 > var3.field_x) {
                        var3.field_x = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                      continue L1;
                    }
                  }
                }
                var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param1 > 120) {
            break L3;
          } else {
            ((bs) this).field_J = null;
            break L3;
          }
        }
    }

    final void a(byte param0, uu param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param1.field_B.field_p.length;
            if (!param2) {
              break L1;
            } else {
              if (!param1.field_B.field_m) {
                break L1;
              } else {
                var6 = -param1.field_B.field_l + (var4 + var4);
                var5 = (int)((long)var6 * (long)((bs) this).field_R[param1.field_y] >> 2007001734);
                var4 = var4 << 8;
                if (var4 <= var5) {
                  param1.field_z.c(true);
                  var5 = -var5 + (var4 + var4) - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)var4 * (long)((bs) this).field_R[param1.field_y] >> 1910152134);
          break L0;
        }
        var6 = -121 / ((22 - param0) / 59);
        param1.field_z.g(var5);
    }

    final synchronized void b(int param0, boolean param1) {
        if (!param1) {
            ((bs) this).field_y = null;
        }
        ((bs) this).field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        ((bs) this).field_L[param0] = param2;
        if (param1 > -98) {
            ((bs) this).field_D = null;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var2 = ((bs) this).field_Q;
          if (param0 == 18922) {
            break L0;
          } else {
            ((bs) this).field_v = null;
            break L0;
          }
        }
        L1: {
          var3 = ((bs) this).field_C;
          var4 = ((bs) this).field_q;
          if (null == ((bs) this).field_I) {
            break L1;
          } else {
            if ((var3 ^ -1) == (((bs) this).field_u ^ -1)) {
              this.a(((bs) this).field_M, true, ((bs) this).field_A, ((bs) this).field_I);
              this.d(18922);
              return;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if ((var3 ^ -1) != (((bs) this).field_C ^ -1)) {
            L3: {
              ((bs) this).field_q = var4;
              ((bs) this).field_C = var3;
              ((bs) this).field_Q = var2;
              if (((bs) this).field_I == null) {
                break L3;
              } else {
                if ((((bs) this).field_u ^ -1) <= (var3 ^ -1)) {
                  break L3;
                } else {
                  ((bs) this).field_C = ((bs) this).field_u;
                  ((bs) this).field_Q = -1;
                  ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if ((var3 ^ -1) != (((bs) this).field_v.field_c[var2] ^ -1)) {
                  break L5;
                } else {
                  ((bs) this).field_v.b(var2);
                  var6 = ((bs) this).field_v.e(var2);
                  if ((var6 ^ -1) != -2) {
                    L6: {
                      if (0 == (var6 & 128)) {
                        break L6;
                      } else {
                        this.a(var6, (byte) -82);
                        break L6;
                      }
                    }
                    ((bs) this).field_v.a(var2);
                    ((bs) this).field_v.c(var2);
                    continue L4;
                  } else {
                    ((bs) this).field_v.a();
                    ((bs) this).field_v.c(var2);
                    if (((bs) this).field_v.d()) {
                      if (((bs) this).field_I != null) {
                        ((bs) this).a(((bs) this).field_M, ((bs) this).field_I, 107);
                        this.d(18922);
                        return;
                      } else {
                        L7: {
                          if (!((bs) this).field_M) {
                            break L7;
                          } else {
                            if (var3 != 0) {
                              ((bs) this).field_v.b(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.a(true, true);
                        ((bs) this).field_v.e();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = ((bs) this).field_v.b();
              var3 = ((bs) this).field_v.field_c[var2];
              var4 = ((bs) this).field_v.d(var3);
              continue L2;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        uu var5 = null;
        qp var6 = null;
        int var6_int = 0;
        uu var7 = null;
        int var8 = 0;
        uu var9 = null;
        int var10 = 0;
        td var11 = null;
        td var12 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uu stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uu stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uu stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uu stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        uu stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        uu stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          this.a(64, param3, 12800, param2);
          if ((((bs) this).field_J[param2] & 2) == 0) {
            break L0;
          } else {
            var5 = (uu) (Object) ((bs) this).field_s.field_t.a(9);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((param2 ^ -1) != (var5.field_y ^ -1)) {
                    break L2;
                  } else {
                    if (0 <= var5.field_x) {
                      break L2;
                    } else {
                      ((bs) this).field_t[param2][var5.field_E] = null;
                      ((bs) this).field_t[param2][param3] = var5;
                      var6_int = var5.field_m + (var5.field_p * var5.field_k >> 1057239788);
                      var5.field_m = var5.field_m + (-var5.field_E + param3 << -1227502136);
                      var5.field_p = -var5.field_m + var6_int;
                      var5.field_E = param3;
                      var5.field_k = 4096;
                      return;
                    }
                  }
                }
                var5 = (uu) (Object) ((bs) this).field_s.field_t.d(9);
                continue L1;
              }
            }
          }
        }
        var11 = (td) (Object) ((bs) this).field_p.a(115, (long)((bs) this).field_B[param2]);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_o[param3];
          if (var6 != null) {
            L3: {
              var7 = new uu();
              var7.field_A = var12;
              var7.field_y = param2;
              var7.field_B = var6;
              var7.field_w = var11.field_n[param3];
              var7.field_q = var11.field_r[param3];
              var8 = -115 % ((-80 - param1) / 43);
              var7.field_E = param3;
              var7.field_F = 1024 + var12.field_s * (param0 * (param0 * var11.field_q[param3])) >> -1616706517;
              var7.field_D = var11.field_t[param3] & 255;
              var7.field_m = -(32767 & var11.field_k[param3]) + (param3 << 1140439080);
              var7.field_G = 0;
              var7.field_r = 0;
              var7.field_x = -1;
              var7.field_v = 0;
              var7.field_n = 0;
              if (0 != ((bs) this).field_R[param2]) {
                L4: {
                  var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 110;
                  stackOut_14_2 = (uu) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (var12.field_k[param3] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (uu) (Object) stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (uu) (Object) stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L4;
                  }
                }
                ((bs) this).a((byte) stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                break L3;
              } else {
                var7.field_z = mf.a(var6, this.a(true, var7), this.c(255, var7), this.a(16384, var7));
                break L3;
              }
            }
            L5: {
              if ((var12.field_k[param3] ^ -1) <= -1) {
                break L5;
              } else {
                var7.field_z.c(-1);
                break L5;
              }
            }
            L6: {
              if (-1 >= (var7.field_q ^ -1)) {
                L7: {
                  var9 = ((bs) this).field_P[param2][var7.field_q];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 >= (var9.field_x ^ -1)) {
                      break L7;
                    } else {
                      ((bs) this).field_t[param2][var9.field_E] = null;
                      var9.field_x = 0;
                      break L7;
                    }
                  }
                }
                ((bs) this).field_P[param2][var7.field_q] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((bs) this).field_s.field_t.a((ms) (Object) var7, (byte) 39);
            ((bs) this).field_t[param2][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(int param0, uu param1) {
        if (param0 < 30) {
            ((bs) this).field_s = null;
        }
        if (param1.field_z != null) {
            return false;
        }
        if (!(param1.field_x < 0)) {
            param1.b(false);
            if (0 < param1.field_q) {
                if (!(param1 != ((bs) this).field_P[param1.field_y][param1.field_q])) {
                    ((bs) this).field_P[param1.field_y][param1.field_q] = null;
                }
            }
        }
        return true;
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (-129 != (var3 ^ -1)) {
          if (-145 != (var3 ^ -1)) {
            if (param1 < -52) {
              if (-161 != (var3 ^ -1)) {
                if (176 != var3) {
                  if (var3 == 192) {
                    var4 = param0 & 15;
                    var5 = (param0 & 32711) >> 505053448;
                    this.e(var4, ((bs) this).field_F[var4] + var5, 5174);
                    return;
                  } else {
                    if (208 == var3) {
                      var4 = 15 & param0;
                      var5 = (32605 & param0) >> 123435016;
                      this.a(var4, (byte) -101, var5);
                      return;
                    } else {
                      if (224 == var3) {
                        var4 = 15 & param0;
                        var5 = ((param0 & 8323255) >> -1023687511) + (param0 >> 1094630728 & 127);
                        this.b(var4, -105, var5);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if (var3 == 255) {
                          this.a(true, true);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L0: {
                    var4 = 15 & param0;
                    var5 = (32654 & param0) >> 2057640584;
                    var6 = (8345855 & param0) >> -1027799472;
                    if (0 == var5) {
                      ((bs) this).field_F[var4] = (var6 << 1880100622) + eb.a(-2080769, ((bs) this).field_F[var4]);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if ((var5 ^ -1) != -33) {
                      break L1;
                    } else {
                      ((bs) this).field_F[var4] = (var6 << 1839342279) + eb.a(((bs) this).field_F[var4], -16257);
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 == (var5 ^ -1)) {
                      ((bs) this).field_K[var4] = (var6 << 1719036519) + eb.a(-16257, ((bs) this).field_K[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (33 == var5) {
                      ((bs) this).field_K[var4] = eb.a(-128, ((bs) this).field_K[var4]) + var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -6) {
                      break L4;
                    } else {
                      ((bs) this).field_z[var4] = (var6 << 644505607) + eb.a(-16257, ((bs) this).field_z[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if (37 != var5) {
                      break L5;
                    } else {
                      ((bs) this).field_z[var4] = var6 + eb.a(-128, ((bs) this).field_z[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 7) {
                      ((bs) this).field_w[var4] = eb.a(-16257, ((bs) this).field_w[var4]) + (var6 << 1871576871);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (39 == var5) {
                      ((bs) this).field_w[var4] = var6 + eb.a(((bs) this).field_w[var4], -128);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (10 != var5) {
                      break L8;
                    } else {
                      ((bs) this).field_G[var4] = eb.a(-16257, ((bs) this).field_G[var4]) + (var6 << 1714289031);
                      break L8;
                    }
                  }
                  L9: {
                    if (42 == var5) {
                      ((bs) this).field_G[var4] = var6 + eb.a(-128, ((bs) this).field_G[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 11) {
                      break L10;
                    } else {
                      ((bs) this).field_T[var4] = eb.a(-16257, ((bs) this).field_T[var4]) + (var6 << 313173895);
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -44) {
                      ((bs) this).field_T[var4] = var6 + eb.a(-128, ((bs) this).field_T[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 64) {
                      if (var6 < 64) {
                        ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -2);
                        break L12;
                      } else {
                        ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 1);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-66 != (var5 ^ -1)) {
                      break L13;
                    } else {
                      if ((var6 ^ -1) <= -65) {
                        ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 2);
                        break L13;
                      } else {
                        this.b(var4, (byte) 122);
                        ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -3);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((var5 ^ -1) != -100) {
                      break L14;
                    } else {
                      ((bs) this).field_S[var4] = (var6 << 1207116103) + eb.a(127, ((bs) this).field_S[var4]);
                      break L14;
                    }
                  }
                  L15: {
                    if ((var5 ^ -1) == -99) {
                      ((bs) this).field_S[var4] = eb.a(16256, ((bs) this).field_S[var4]) + var6;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-102 == (var5 ^ -1)) {
                      ((bs) this).field_S[var4] = 16384 + (eb.a(127, ((bs) this).field_S[var4]) - -(var6 << 1573849703));
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-101 == (var5 ^ -1)) {
                      ((bs) this).field_S[var4] = 16384 - (-eb.a(((bs) this).field_S[var4], 16256) + -var6);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (-121 == (var5 ^ -1)) {
                      this.c(-1, var4);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-122 != (var5 ^ -1)) {
                      break L19;
                    } else {
                      this.a(var4, true);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 123) {
                      break L20;
                    } else {
                      this.c(var4, (byte) -109);
                      break L20;
                    }
                  }
                  L21: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = ((bs) this).field_S[var4];
                      if (16384 == var7) {
                        ((bs) this).field_D[var4] = eb.a(-16257, ((bs) this).field_D[var4]) + (var6 << -312279321);
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (-39 == (var5 ^ -1)) {
                      var7 = ((bs) this).field_S[var4];
                      if (-16385 != (var7 ^ -1)) {
                        break L22;
                      } else {
                        ((bs) this).field_D[var4] = var6 + eb.a(((bs) this).field_D[var4], -128);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (16 != var5) {
                      break L23;
                    } else {
                      ((bs) this).field_R[var4] = eb.a(((bs) this).field_R[var4], -16257) - -(var6 << 1027833191);
                      break L23;
                    }
                  }
                  L24: {
                    if ((var5 ^ -1) != -49) {
                      break L24;
                    } else {
                      ((bs) this).field_R[var4] = var6 + eb.a(((bs) this).field_R[var4], -128);
                      break L24;
                    }
                  }
                  L25: {
                    if (81 != var5) {
                      break L25;
                    } else {
                      if (-65 >= (var6 ^ -1)) {
                        ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 4);
                        break L25;
                      } else {
                        this.a(var4, 32605);
                        ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -5);
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) != -18) {
                      break L26;
                    } else {
                      this.d((var6 << 1547298695) + (-16257 & ((bs) this).field_N[var4]), var4, 97);
                      break L26;
                    }
                  }
                  L27: {
                    if (-50 == (var5 ^ -1)) {
                      this.d(var6 + (-128 & ((bs) this).field_N[var4]), var4, 42);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                var4 = param0 & 15;
                var5 = 127 & param0 >> 420624520;
                var6 = param0 >> -1981835152 & 127;
                this.b(97, var5, var6, var4);
                return;
              }
            } else {
              return;
            }
          } else {
            var4 = 15 & param0;
            var5 = (32657 & param0) >> -1924715480;
            var6 = 127 & param0 >> 1556304016;
            if (-1 <= (var6 ^ -1)) {
              this.a(64, var5, 12800, var4);
              return;
            } else {
              this.a(var6, (byte) -13, var4, var5);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> 1651568840 & 127;
          var6 = param0 >> 610672944 & 127;
          this.a(var6, var5, 12800, var4);
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if ((((bs) this).field_B[param0] ^ -1) != (param1 ^ -1)) {
            ((bs) this).field_B[param0] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((bs) this).field_P[param0][var4] = null;
            }
        }
        if (param2 != 5174) {
            ((bs) this).field_y = null;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 >= -26) {
            ((bs) this).field_r = -65;
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((bs) this).field_H[param1] = param2;
        ((bs) this).field_F[param1] = eb.a(-128, param2);
        if (param0 != -1823) {
            return;
        }
        this.e(param1, param2, param0 ^ -4905);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Sumoblitz.field_L ? 1 : 0;
            if (!((bs) this).field_v.c()) {
              break L1;
            } else {
              var4 = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
              L2: while (true) {
                var5 = (long)var4 * (long)param2 + ((bs) this).field_O;
                if (0L <= -var5 + ((bs) this).field_q) {
                  ((bs) this).field_O = var5;
                  break L1;
                } else {
                  var7 = (int)((((bs) this).field_q + (-((bs) this).field_O + (long)var4 - 1L)) / (long)var4);
                  ((bs) this).field_O = ((bs) this).field_O + (long)var7 * (long)var4;
                  ((bs) this).field_s.b(param0, param1, var7);
                  param2 = param2 - var7;
                  this.d(18922);
                  param1 = param1 + var7;
                  if (((bs) this).field_v.c()) {
                    continue L2;
                  } else {
                    ((bs) this).field_s.b(param0, param1, param2);
                    break L0;
                  }
                }
              }
            }
          }
          ((bs) this).field_s.b(param0, param1, param2);
          break L0;
        }
    }

    private final void a(int param0, int param1) {
        uu var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param1 != 32605) {
            ((bs) this).field_z = null;
        }
        if ((((bs) this).field_J[param0] & 4 ^ -1) != -1) {
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(param1 + -32539);
            while (var3 != null) {
                if ((param0 ^ -1) == (var3.field_y ^ -1)) {
                    var3.field_t = 0;
                }
                var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
            }
        }
    }

    private final void c(int param0, int param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -1) {
            ((bs) this).field_v = null;
        }
        uu var3 = (uu) (Object) ((bs) this).field_s.field_t.b(param0 ^ -95);
        while (var3 != null) {
            if (-1 >= (param1 ^ -1)) {
                // if_icmpne L177
            }
            if (null != var3.field_z) {
                var3.field_z.d(du.field_k / 100);
                if (!(!var3.field_z.k())) {
                    ((bs) this).field_s.field_o.b((hj) (Object) var3.field_z);
                }
                var3.a(param0 ^ -1);
            }
            if (-1 < (var3.field_x ^ -1)) {
                ((bs) this).field_t[var3.field_y][var3.field_E] = null;
            }
            var3.b(false);
            var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param0 <= 7) {
            ((bs) this).field_F = null;
        }
    }

    final synchronized void a(boolean param0, int param1, int param2, int param3, tv param4, boolean param5) {
        if (!(((bs) this).field_v.c())) {
            ((bs) this).a(param5, param4, 77);
            return;
        }
        ((bs) this).field_M = param5 ? true : false;
        ((bs) this).field_A = param0 ? true : false;
        ((bs) this).field_I = param4;
        int var7 = ((bs) this).field_v.a(((bs) this).field_O) * param3;
        if (param2 != 7094) {
            this.c(-41, (byte) 86);
        }
        int var8 = param1 * ((bs) this).field_v.field_d;
        var7 = var8 * ((-1 + var8 + var7) / var8);
        ((bs) this).field_u = ((param3 >> -1451976831) + var7) / param3;
    }

    final synchronized void e(int param0) {
        if (param0 != 0) {
            this.b(-55, (byte) 105);
        }
        this.a(true, (byte) 104);
    }

    final synchronized void a(byte param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        td var4 = (td) (Object) ((bs) this).field_p.a(79);
        while (var4 != null) {
            var4.d((byte) -36);
            var4 = (td) (Object) ((bs) this).field_p.a(true);
        }
        if (param0 != 28) {
            ((bs) this).field_y = null;
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            int discarded$0 = this.a(true, (uu) null);
        }
        ((bs) this).field_E = param0;
    }

    private final void d(int param0, int param1, int param2) {
        ((bs) this).field_N[param1] = param0;
        if (param2 <= 9) {
            this.a(-89, (byte) -88, -127);
        }
        ((bs) this).field_x[param1] = (int)(0.5 + Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0 ^ -1968, param2, param1);
        if (param0 != 177) {
            ((bs) this).field_z = null;
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((bs) this).field_v.e();
        ((bs) this).field_I = null;
        if (param1 < 0) {
            ((bs) this).field_q = 79L;
        }
        this.a(param0, true);
    }

    private final void c(int param0, byte param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        uu var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-96);
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpeq L47
            } else {
                if (!((var3.field_x ^ -1) <= -1)) {
                    ((bs) this).field_t[var3.field_y][var3.field_E] = null;
                    var3.field_x = 0;
                }
            }
            var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
        }
        if (param1 >= -15) {
            this.c(126, 58);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if ((param1 ^ -1) <= -1) {
            ((bs) this).field_y[param1] = param2;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (16 <= var4) {
                break L0;
              } else {
                ((bs) this).field_y[var4] = param2;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 < -42) {
            break L2;
          } else {
            hj discarded$1 = ((bs) this).c();
            break L2;
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, tv param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        this.a(param2, (byte) 69);
        ((bs) this).field_v.a(param3.field_k);
        ((bs) this).field_O = 0L;
        ((bs) this).field_M = param0 ? true : false;
        int var5 = ((bs) this).field_v.f();
        int var6 = 0;
        if (!param1) {
            ((bs) this).field_B = null;
        }
        while (var5 > var6) {
            ((bs) this).field_v.b(var6);
            ((bs) this).field_v.a(var6);
            ((bs) this).field_v.c(var6);
            var6++;
        }
        ((bs) this).field_Q = ((bs) this).field_v.b();
        ((bs) this).field_C = ((bs) this).field_v.field_c[((bs) this).field_Q];
        ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 >= -38) {
            bs.f(-53);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Sumoblitz.field_L ? 1 : 0;
            if (((bs) this).field_v.c()) {
              var2 = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
              L2: while (true) {
                var3 = ((bs) this).field_O + (long)param0 * (long)var2;
                if ((-var3 + ((bs) this).field_q ^ -1L) <= -1L) {
                  ((bs) this).field_O = var3;
                  break L1;
                } else {
                  var5 = (int)((((bs) this).field_q - ((bs) this).field_O + ((long)var2 + -1L)) / (long)var2);
                  ((bs) this).field_O = ((bs) this).field_O + (long)var5 * (long)var2;
                  param0 = param0 - var5;
                  ((bs) this).field_s.a(var5);
                  this.d(18922);
                  if (((bs) this).field_v.c()) {
                    continue L2;
                  } else {
                    ((bs) this).field_s.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((bs) this).field_s.a(param0);
          break L0;
        }
    }

    public bs() {
        ((bs) this).field_R = new int[16];
        ((bs) this).field_T = new int[16];
        ((bs) this).field_B = new int[16];
        ((bs) this).field_F = new int[16];
        ((bs) this).field_H = new int[16];
        ((bs) this).field_y = new int[16];
        ((bs) this).field_P = new uu[16][128];
        ((bs) this).field_r = 256;
        ((bs) this).field_w = new int[16];
        ((bs) this).field_E = 1000000;
        ((bs) this).field_L = new int[16];
        ((bs) this).field_N = new int[16];
        ((bs) this).field_t = new uu[16][128];
        ((bs) this).field_S = new int[16];
        ((bs) this).field_x = new int[16];
        ((bs) this).field_G = new int[16];
        ((bs) this).field_K = new int[16];
        ((bs) this).field_D = new int[16];
        ((bs) this).field_J = new int[16];
        ((bs) this).field_z = new int[16];
        ((bs) this).field_v = new sh();
        ((bs) this).field_s = new rh((bs) this);
        ((bs) this).field_p = new te(128);
        ((bs) this).a((byte) -127, -1, 256);
        this.a(true, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
