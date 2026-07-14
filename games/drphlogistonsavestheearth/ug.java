/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ug extends ic {
    private int[] field_n;
    private rl field_R;
    private int[] field_z;
    private cc[][] field_s;
    private int[] field_q;
    int[] field_C;
    private int[] field_F;
    int[] field_E;
    private int[] field_y;
    private int[] field_u;
    private tg field_O;
    private int[] field_U;
    private int[] field_r;
    static Random field_m;
    static boolean field_x;
    private int field_S;
    static String field_T;
    static v field_I;
    private int[] field_Q;
    int[] field_B;
    private int[] field_t;
    private int[] field_D;
    private int[] field_A;
    static String field_p;
    private cc[][] field_G;
    private int[] field_o;
    private int field_M;
    private boolean field_w;
    private int field_v;
    private long field_P;
    private long field_J;
    private am field_H;
    private int field_N;
    private ok field_K;
    private int field_L;
    private boolean field_l;

    final boolean a(int param0, cc param1) {
        if (!(param1.field_D != null)) {
            if (param1.field_k < 0) {
                return true;
            }
            param1.a(-16175);
            if (param1.field_z > 0) {
                if (!(((ug) this).field_G[param1.field_u][param1.field_z] != param1)) {
                    ((ug) this).field_G[param1.field_u][param1.field_z] = null;
                }
            }
            return true;
        }
        if (param0 > -102) {
            return true;
        }
        return false;
    }

    private final int b(cc param0, int param1) {
        if (param1 != -16385) {
            ((ug) this).field_N = -115;
        }
        int var3 = ((ug) this).field_y[param0.field_u];
        if (-8193 < (var3 ^ -1)) {
            return param0.field_v * var3 + 32 >> 1559270726;
        }
        return 16384 - ((-param0.field_v + 128) * (-var3 + 16384) + 32 >> -1253764250);
    }

    final synchronized ic a() {
        return (ic) (Object) ((ug) this).field_H;
    }

    final boolean a(int param0, int[] param1, int param2, cc param3, int param4) {
        int var6 = 0;
        ri var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          param3.field_l = id.field_d / 100;
          if (param3.field_k < 0) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_D) {
                break L1;
              } else {
                if (param3.field_D.m()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.d(param2 ^ 9);
              param3.a(-16175);
              if (-1 <= (param3.field_z ^ -1)) {
                break L2;
              } else {
                if (param3 == ((ug) this).field_G[param3.field_u][param3.field_z]) {
                  ((ug) this).field_G[param3.field_u][param3.field_z] = null;
                  break L2;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param3.field_x;
          if (var6 <= 0) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((ug) this).field_D[param3.field_u]));
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param3.field_x = var6;
            break L3;
          }
        }
        L5: {
          param3.field_D.h(this.b(950080514, param3));
          var7 = param3.field_q;
          var8 = 0;
          param3.field_j = param3.field_j + var7.field_k;
          param3.field_A = param3.field_A + 1;
          var9 = 0.000005086263020833333 * (double)((param3.field_F + -60 << 1355350408) - -(param3.field_x * param3.field_s >> 1018383116));
          if (var7.field_i > 0) {
            L6: {
              if (0 < var7.field_j) {
                param3.field_m = param3.field_m + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                break L6;
              } else {
                param3.field_m = param3.field_m + 128;
                break L6;
              }
            }
            if (819200 > param3.field_m * var7.field_i) {
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
          if (null == var7.field_a) {
            break L7;
          } else {
            L8: {
              if (var7.field_n <= 0) {
                param3.field_E = param3.field_E + 128;
                break L8;
              } else {
                param3.field_E = param3.field_E + (int)(Math.pow(2.0, var9 * (double)var7.field_n) * 128.0 + 0.5);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (param3.field_n >= -2 + var7.field_a.length) {
                  break L10;
                } else {
                  if ((65280 & var7.field_a[param3.field_n - -2] << -2142853176 ^ -1) <= (param3.field_E ^ -1)) {
                    break L10;
                  } else {
                    param3.field_n = param3.field_n + 2;
                    continue L9;
                  }
                }
              }
              if (var7.field_a.length - 2 != param3.field_n) {
                break L7;
              } else {
                if (var7.field_a[1 + param3.field_n] != 0) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
          }
        }
        L11: {
          if (param3.field_k < 0) {
            break L11;
          } else {
            if (null == var7.field_m) {
              break L11;
            } else {
              if ((1 & ((ug) this).field_C[param3.field_u]) != 0) {
                break L11;
              } else {
                L12: {
                  if (-1 < (param3.field_z ^ -1)) {
                    break L12;
                  } else {
                    if (param3 != ((ug) this).field_G[param3.field_u][param3.field_z]) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (0 < var7.field_g) {
                    param3.field_k = param3.field_k + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                    break L13;
                  } else {
                    param3.field_k = param3.field_k + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if ((-2 + var7.field_m.length ^ -1) >= (param3.field_r ^ -1)) {
                      break L15;
                    } else {
                      if (((255 & var7.field_m[param3.field_r - -2]) << 284446664 ^ -1) <= (param3.field_k ^ -1)) {
                        break L15;
                      } else {
                        param3.field_r = param3.field_r + 2;
                        continue L14;
                      }
                    }
                  }
                  if (param3.field_r != var7.field_m.length + -2) {
                    break L11;
                  } else {
                    var8 = 1;
                    break L11;
                  }
                }
              }
            }
          }
        }
        if (var8 != 0) {
          L16: {
            param3.field_D.k(param3.field_l);
            if (param1 != null) {
              param3.field_D.b(param1, param0, param4);
              break L16;
            } else {
              param3.field_D.d(param4);
              break L16;
            }
          }
          L17: {
            if (!param3.field_D.g()) {
              break L17;
            } else {
              ((ug) this).field_H.field_r.a((ic) (Object) param3.field_D);
              break L17;
            }
          }
          L18: {
            param3.d(-101);
            if (0 <= param3.field_k) {
              param3.a(-16175);
              if (param3.field_z <= 0) {
                break L18;
              } else {
                if (param3 == ((ug) this).field_G[param3.field_u][param3.field_z]) {
                  ((ug) this).field_G[param3.field_u][param3.field_z] = null;
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
        } else {
          param3.field_D.a(param3.field_l, this.a(param3, 15), this.b(param3, -16385));
          if (param2 == -128) {
            return false;
          } else {
            return false;
          }
        }
    }

    private final void c(int param0, int param1) {
        cc var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != -16596) {
            ((ug) this).d(-16);
        }
        if (!((((ug) this).field_C[param0] & 2 ^ -1) == -1)) {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(param1 + 5445);
            while (var3 != null) {
                if ((var3.field_u ^ -1) == (param0 ^ -1)) {
                    if (((ug) this).field_s[param0][var3.field_F] == null) {
                        if (!(0 <= var3.field_k)) {
                            var3.field_k = 0;
                        }
                    }
                }
                var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
            }
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((ug) this).field_R.a();
        if (param1 > -113) {
            return;
        }
        ((ug) this).field_K = null;
        this.a(false, param0);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            field_T = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param1) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    private final int b(int param0, cc param1) {
        int var3 = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param1.field_h - -(param1.field_x * param1.field_s >> -1205029204);
          var3 = var3 + ((-8192 + ((ug) this).field_A[param1.field_u]) * ((ug) this).field_z[param1.field_u] >> 1526397996);
          var4 = param1.field_q;
          if (0 >= var4.field_k) {
            break L0;
          } else {
            L1: {
              if (-1 > (var4.field_l ^ -1)) {
                break L1;
              } else {
                if (((ug) this).field_q[param1.field_u] > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              var5 = var4.field_l << 950080514;
              var6 = var4.field_p << -2011433279;
              if (var6 > param1.field_A) {
                var5 = param1.field_A * var5 / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((ug) this).field_q[param1.field_u] >> -1503747161);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_j));
            var3 = var3 + (int)((double)var5 * var7);
            break L0;
          }
        }
        var5 = (int)((double)(256 * param1.field_C.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)id.field_d + 0.5);
        if (param0 == 950080514) {
          L3: {
            if ((var5 ^ -1) > -2) {
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = var5;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          return stackIn_13_0;
        } else {
          return -20;
        }
    }

    final void a(cc param0, boolean param1, byte param2) {
        int var7 = 0;
        int var6 = 0;
        int var4 = -66 % ((param2 - 41) / 36);
        int var5 = param0.field_C.field_i.length;
        if (param1) {
            // ifeq L131
            var7 = var5 + var5 + -param0.field_C.field_k;
            var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var7 >> 1467533830);
            var5 = var5 << 8;
            if ((var6 ^ -1) <= (var5 ^ -1)) {
                var6 = -var6 + -1 + (var5 - -var5);
                param0.field_D.a(true);
            }
        } else {
            var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var5 >> -1159370938);
        }
        param0.field_D.g(var6);
    }

    final static void a(int param0, int param1, nh[] param2, int param3) {
        if (param3 != 37) {
            Object var5 = null;
            vc discarded$0 = ug.a((String) null, -50);
        }
        cb.field_a = new gk(param2);
        df.field_h = param0;
        di.field_d = param1;
        nl.d(-1321745375);
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized boolean e(int param0) {
        if (param0 != 16) {
            ((ug) this).field_y = null;
        }
        return ((ug) this).field_R.g();
    }

    private final void b(int param0, int param1) {
        cc var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((4 & ((ug) this).field_C[param0]) == 0)) {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(param1 ^ -12545);
            while (var3 != null) {
                if (!(var3.field_u != param0)) {
                    var3.field_i = 0;
                }
                var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
            }
        }
        if (param1 != 6798) {
            ((ug) this).field_w = true;
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        cc var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
        while (var3 != null) {
            if ((param0 ^ -1) <= -1) {
                // if_icmpne L93
            }
            if ((var3.field_k ^ -1) > -1) {
                ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                var3.field_k = 0;
            }
            var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
        }
        if (!param1) {
            this.c(-123, 19);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param1) {
            ((ug) this).field_S = 17;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 <= param1) {
          ((ug) this).field_u[param1] = param0;
          ((ug) this).field_y[param1] = 8192;
          ((ug) this).field_o[param1] = 16383;
          ((ug) this).field_A[param1] = 8192;
          ((ug) this).field_q[param1] = 0;
          ((ug) this).field_D[param1] = 8192;
          this.c(param1, -16596);
          this.b(param1, 6798);
          ((ug) this).field_C[param1] = 0;
          ((ug) this).field_n[param1] = 32767;
          ((ug) this).field_z[param1] = 256;
          ((ug) this).field_E[param1] = 0;
          this.b(8192, -1, param1);
          return;
        } else {
          param1 = 0;
          L0: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a(12800, param1);
              param1++;
              continue L0;
            }
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, ok param2, int param3) {
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.a(param0, -115);
        ((ug) this).field_R.a(param2.field_h);
        ((ug) this).field_w = param1 ? true : false;
        ((ug) this).field_J = 0L;
        int var5 = ((ug) this).field_R.c();
        if (param3 != -1) {
            this.b(42, 33);
        }
        for (var6 = 0; (var6 ^ -1) > (var5 ^ -1); var6++) {
            ((ug) this).field_R.f(var6);
            ((ug) this).field_R.e(var6);
            ((ug) this).field_R.c(var6);
        }
        ((ug) this).field_N = ((ug) this).field_R.d();
        ((ug) this).field_v = ((ug) this).field_R.field_h[((ug) this).field_N];
        ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
    }

    final static vc a(String param0, int param1) {
        if (param1 != 0) {
            Object var3 = null;
            ug.a(14, 3, (nh[]) null, -32);
        }
        return new vc(param0);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = ((ug) this).field_N;
          var3 = ((ug) this).field_v;
          var4 = ((ug) this).field_P;
          if (null == ((ug) this).field_K) {
            break L0;
          } else {
            if (((ug) this).field_L != var3) {
              break L0;
            } else {
              this.a(((ug) this).field_l, ((ug) this).field_w, ((ug) this).field_K, -1);
              this.g(32675);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((ug) this).field_v) {
            L2: {
              if (param0 == 32675) {
                break L2;
              } else {
                ((ug) this).field_C = null;
                break L2;
              }
            }
            L3: {
              ((ug) this).field_P = var4;
              ((ug) this).field_N = var2;
              ((ug) this).field_v = var3;
              if (((ug) this).field_K == null) {
                break L3;
              } else {
                if (((ug) this).field_L < var3) {
                  ((ug) this).field_N = -1;
                  ((ug) this).field_v = ((ug) this).field_L;
                  ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
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
                if (((ug) this).field_R.field_h[var2] != var3) {
                  break L5;
                } else {
                  ((ug) this).field_R.f(var2);
                  var6 = ((ug) this).field_R.b(var2);
                  if (1 == var6) {
                    ((ug) this).field_R.b();
                    ((ug) this).field_R.c(var2);
                    if (((ug) this).field_R.e()) {
                      if (null != ((ug) this).field_K) {
                        ((ug) this).a(((ug) this).field_K, ((ug) this).field_w, (byte) 120);
                        this.g(32675);
                        return;
                      } else {
                        L6: {
                          if (!((ug) this).field_w) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((ug) this).field_R.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(false, true);
                        ((ug) this).field_R.a();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (0 != (128 & var6)) {
                        this.d(var6, 32696);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((ug) this).field_R.e(var2);
                    ((ug) this).field_R.c(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((ug) this).field_R.d();
              var3 = ((ug) this).field_R.field_h[var2];
              var4 = ((ug) this).field_R.d(var3);
              continue L1;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = param0 & 240;
          if (param1 == 32696) {
            break L0;
          } else {
            int discarded$1 = ((ug) this).d();
            break L0;
          }
        }
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (param0 & 32538) >> 1051707944;
          var6 = (param0 & 8379937) >> 2050059888;
          this.a((byte) 91, var5, var4, var6);
          return;
        } else {
          L1: {
            if (-145 == (var3 ^ -1)) {
              var4 = param0 & 15;
              var5 = (32547 & param0) >> -384649400;
              var6 = (8346333 & param0) >> -1793331696;
              if (0 < var6) {
                this.b((byte) 15, var6, var5, var4);
                return;
              } else {
                this.a((byte) 91, var5, var4, 64);
                break L1;
              }
            } else {
              if ((var3 ^ -1) != -161) {
                if (176 == var3) {
                  L2: {
                    var4 = param0 & 15;
                    var5 = (param0 & 32675) >> 128622184;
                    var6 = (8325095 & param0) >> -903746800;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      ((ug) this).field_t[var4] = rk.a(((ug) this).field_t[var4], -2080769) + (var6 << -914588946);
                      break L2;
                    }
                  }
                  L3: {
                    if (-33 != (var5 ^ -1)) {
                      break L3;
                    } else {
                      ((ug) this).field_t[var4] = (var6 << 397931911) + rk.a(-16257, ((ug) this).field_t[var4]);
                      break L3;
                    }
                  }
                  L4: {
                    if (-2 != (var5 ^ -1)) {
                      break L4;
                    } else {
                      ((ug) this).field_q[var4] = (var6 << 2071769703) + rk.a(((ug) this).field_q[var4], -16257);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) != -34) {
                      break L5;
                    } else {
                      ((ug) this).field_q[var4] = rk.a(-128, ((ug) this).field_q[var4]) + var6;
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 5) {
                      break L6;
                    } else {
                      ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -16257) + (var6 << -85585113);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 37) {
                      break L7;
                    } else {
                      ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -128) - -var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      ((ug) this).field_u[var4] = (var6 << -921185753) + rk.a(((ug) this).field_u[var4], -16257);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-40 == (var5 ^ -1)) {
                      ((ug) this).field_u[var4] = rk.a(((ug) this).field_u[var4], -128) + var6;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-11 != (var5 ^ -1)) {
                      break L10;
                    } else {
                      ((ug) this).field_y[var4] = rk.a(-16257, ((ug) this).field_y[var4]) + (var6 << -462288537);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 == 42) {
                      ((ug) this).field_y[var4] = var6 + rk.a(((ug) this).field_y[var4], -128);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) != -12) {
                      break L12;
                    } else {
                      ((ug) this).field_o[var4] = rk.a(-16257, ((ug) this).field_o[var4]) + (var6 << 1883403879);
                      break L12;
                    }
                  }
                  L13: {
                    if ((var5 ^ -1) == -44) {
                      ((ug) this).field_o[var4] = var6 + rk.a(-128, ((ug) this).field_o[var4]);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (64 != var5) {
                      break L14;
                    } else {
                      if (var6 >= 64) {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 1);
                        break L14;
                      } else {
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -2);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (-66 != (var5 ^ -1)) {
                      break L15;
                    } else {
                      if (-65 >= (var6 ^ -1)) {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 2);
                        break L15;
                      } else {
                        this.c(var4, -16596);
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -3);
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (99 != var5) {
                      break L16;
                    } else {
                      ((ug) this).field_n[var4] = rk.a(127, ((ug) this).field_n[var4]) - -(var6 << -1461837593);
                      break L16;
                    }
                  }
                  L17: {
                    if (98 == var5) {
                      ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + var6;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (-102 != (var5 ^ -1)) {
                      break L18;
                    } else {
                      ((ug) this).field_n[var4] = rk.a(((ug) this).field_n[var4], 127) + 16384 + (var6 << 1273233063);
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + (16384 + var6);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((var5 ^ -1) == -121) {
                      this.b(var4, (byte) 6);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-122 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      this.a(param1 ^ 19896, var4);
                      break L21;
                    }
                  }
                  L22: {
                    if (123 == var5) {
                      this.a(var4, true);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = ((ug) this).field_n[var4];
                      if (16384 == var7) {
                        ((ug) this).field_z[var4] = rk.a(((ug) this).field_z[var4], -16257) - -(var6 << 1292980039);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (-39 != (var5 ^ -1)) {
                      break L24;
                    } else {
                      var7 = ((ug) this).field_n[var4];
                      if ((var7 ^ -1) == -16385) {
                        ((ug) this).field_z[var4] = rk.a(-128, ((ug) this).field_z[var4]) + var6;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (var5 == 16) {
                      ((ug) this).field_E[var4] = (var6 << -1884177785) + rk.a(((ug) this).field_E[var4], -16257);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) == -49) {
                      ((ug) this).field_E[var4] = var6 + rk.a(-128, ((ug) this).field_E[var4]);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (-82 != (var5 ^ -1)) {
                      break L27;
                    } else {
                      if (64 > var6) {
                        this.b(var4, 6798);
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -5);
                        break L27;
                      } else {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 4);
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if ((var5 ^ -1) == -18) {
                      this.b((-16257 & ((ug) this).field_U[var4]) - -(var6 << -1216306041), -1, var4);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (49 != var5) {
                    break L1;
                  } else {
                    this.b((-128 & ((ug) this).field_U[var4]) - -var6, param1 + -32697, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = param0 & 15;
                    var5 = (param0 & 32596) >> 227408264;
                    this.c(((ug) this).field_t[var4] + var5, 0, var4);
                    return;
                  } else {
                    if ((var3 ^ -1) != -209) {
                      if (-225 == (var3 ^ -1)) {
                        var4 = param0 & 15;
                        var5 = (param0 >> -693096120 & 127) + ((8323499 & param0) >> 1771148233);
                        this.e(var4, var5, -128);
                        return;
                      } else {
                        var3 = param0 & 255;
                        if (255 == var3) {
                          this.a(false, true);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (param0 & 32689) >> 981493896;
                      this.a(var5, false, var4);
                      return;
                    }
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 1520657640;
                var6 = (8334836 & param0) >> 247998608;
                this.a(var6, param1 ^ 32327, var5, var4);
                return;
              }
            }
          }
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (!((ug) this).field_R.g()) {
              break L1;
            } else {
              var4 = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
              L2: while (true) {
                var5 = ((ug) this).field_J - -((long)param2 * (long)var4);
                if (-1L >= (-var5 + ((ug) this).field_P ^ -1L)) {
                  ((ug) this).field_J = var5;
                  break L1;
                } else {
                  var7 = (int)((-1L + ((long)var4 + (((ug) this).field_P - ((ug) this).field_J))) / (long)var4);
                  ((ug) this).field_J = ((ug) this).field_J + (long)var7 * (long)var4;
                  ((ug) this).field_H.b(param0, param1, var7);
                  param2 = param2 - var7;
                  param1 = param1 + var7;
                  this.g(32675);
                  if (((ug) this).field_R.g()) {
                    continue L2;
                  } else {
                    ((ug) this).field_H.b(param0, param1, param2);
                    break L0;
                  }
                }
              }
            }
          }
          ((ug) this).field_H.b(param0, param1, param2);
          break L0;
        }
    }

    final synchronized ic c() {
        return null;
    }

    private final void b(int param0, byte param1) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        cc var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
        if (param1 < 3) {
            return;
        }
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpeq L54
            } else {
                if (!(var3.field_D == null)) {
                    var3.field_D.k(id.field_d / 100);
                    if (var3.field_D.g()) {
                        ((ug) this).field_H.field_r.a((ic) (Object) var3.field_D);
                    }
                    var3.d(-79);
                }
                if (!(-1 >= (var3.field_k ^ -1))) {
                    ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                }
                var3.a(-16175);
            }
            var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
        }
    }

    final synchronized void b(byte param0) {
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ig var2 = (ig) (Object) ((ug) this).field_O.b(-1);
        while (var2 != null) {
            var2.d(param0 ^ 107);
            var2 = (ig) (Object) ((ug) this).field_O.a((byte) -114);
        }
        if (param0 != 47) {
            Object var4 = null;
            int discarded$0 = this.b(-122, (cc) null);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
            this.a(-1, true);
        } else {
            this.b(-1, (byte) 21);
        }
        this.a(12800, -1);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            ((ug) this).field_r[var3] = ((ug) this).field_F[var3];
        }
        if (param0) {
            field_T = null;
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((ug) this).field_t[var5] = rk.a(((ug) this).field_F[var5], -128);
            var5++;
        }
    }

    final static int f(int param0) {
        if (param0 <= 85) {
            sa[] discarded$0 = ug.c((byte) 77);
        }
        return rd.field_z;
    }

    final synchronized void a(byte param0) {
        this.a(true, -122);
        if (param0 >= -86) {
            ((ug) this).field_G = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((ug) this).field_F[param0] = param2;
        ((ug) this).field_t[param0] = rk.a(-128, param2);
        this.c(param2, 0, param0);
        if (param1 != 26818) {
            ((ug) this).field_J = 40L;
        }
    }

    private final void e(int param0, int param1, int param2) {
        ((ug) this).field_A[param0] = param1;
        if (param2 > -125) {
            this.b(-86, -27, 1);
        }
    }

    private final int a(cc param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 != 15) {
            ((ug) this).field_L = -99;
        }
        if (!((((ug) this).field_Q[param0.field_u] ^ -1) != -1)) {
            return 0;
        }
        ri var9 = param0.field_q;
        ri var10 = var9;
        int var4 = ((ug) this).field_u[param0.field_u] * ((ug) this).field_o[param0.field_u] + 4096 >> 218968781;
        var4 = var4 * var4 - -16384 >> 1538862607;
        var4 = param0.field_t * var4 - -16384 >> -1190063857;
        var4 = 128 + var4 * ((ug) this).field_S >> -525649208;
        var4 = var4 * ((ug) this).field_Q[param0.field_u] + 128 >> -699653272;
        if (!(-1 <= (var10.field_i ^ -1))) {
            var4 = (int)(Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_m)) * (double)var4 + 0.5);
        }
        if (var10.field_a != null) {
            var5 = param0.field_E;
            var6 = var10.field_a[param0.field_n + 1];
            if (param0.field_n < -2 + var10.field_a.length) {
                var7 = (255 & var9.field_a[param0.field_n]) << 1437743848;
                var8 = (255 & var10.field_a[param0.field_n - -2]) << 355343176;
                var6 = var6 + (-var7 + var5) * (-var6 + var10.field_a[param0.field_n - -3]) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> -1410405882;
        }
        if ((param0.field_k ^ -1) < -1) {
            if (!(var10.field_m == null)) {
                var5 = param0.field_k;
                var6 = var10.field_m[1 + param0.field_r];
                if (!(param0.field_r >= var10.field_m.length - 2)) {
                    var7 = (var9.field_m[param0.field_r] & 255) << -1288533720;
                    var8 = (255 & var10.field_m[param0.field_r + 2]) << 1478198056;
                    var6 = var6 + (-var7 + var5) * (var10.field_m[param0.field_r - -3] + -var6) / (-var7 + var8);
                }
                var4 = var6 * var4 - -32 >> 769459814;
            }
        }
        return var4;
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.a(param0, 26818, param1);
        int var4 = 19 / ((70 - param2) / 34);
    }

    private final void b(int param0, int param1, int param2) {
        ((ug) this).field_U[param2] = param0;
        if (param1 != -1) {
            ((ug) this).field_S = 32;
        }
        ((ug) this).field_B[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 511) {
            this.a(89, -46, -107);
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (((ug) this).field_R.g()) {
              var2 = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
              L2: while (true) {
                var3 = (long)var2 * (long)param0 + ((ug) this).field_J;
                if ((-var3 + ((ug) this).field_P ^ -1L) > -1L) {
                  var5 = (int)((-1L + ((long)var2 + (((ug) this).field_P - ((ug) this).field_J))) / (long)var2);
                  ((ug) this).field_J = ((ug) this).field_J + (long)var2 * (long)var5;
                  ((ug) this).field_H.d(var5);
                  param0 = param0 - var5;
                  this.g(32675);
                  if (((ug) this).field_R.g()) {
                    continue L2;
                  } else {
                    ((ug) this).field_H.d(param0);
                    break L0;
                  }
                } else {
                  ((ug) this).field_J = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((ug) this).field_H.d(param0);
          break L0;
        }
    }

    final synchronized void a(ok param0, boolean param1, byte param2) {
        if (param2 <= 77) {
            return;
        }
        this.a(true, param1, param0, -1);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cc var6 = null;
        int var7 = 0;
        cc var8 = null;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 91) {
            break L0;
          } else {
            this.b((byte) 92, 20, -113, -69);
            break L0;
          }
        }
        var8 = ((ug) this).field_s[param2][param1];
        if (var8 != null) {
          L1: {
            ((ug) this).field_s[param2][param1] = null;
            if (-1 == (2 & ((ug) this).field_C[param2] ^ -1)) {
              var8.field_k = 0;
              break L1;
            } else {
              var6 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8.field_u != var6.field_u) {
                      break L3;
                    } else {
                      if (var6.field_k >= 0) {
                        break L3;
                      } else {
                        if (var6 == var8) {
                          break L3;
                        } else {
                          var8.field_k = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        cc var5 = null;
        vk var6 = null;
        int var6_int = 0;
        cc var7 = null;
        cc var8 = null;
        int var9 = 0;
        ig var10 = null;
        ig var11 = null;
        Object stackIn_17_0 = null;
        cc stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        cc stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        cc stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackOut_16_0 = null;
        cc stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        cc stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        cc stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          this.a((byte) 91, param2, param3, 64);
          if ((((ug) this).field_C[param3] & 2) == 0) {
            break L0;
          } else {
            var5 = (cc) (Object) ((ug) this).field_H.field_q.b(param0 ^ 2861);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_u) {
                    break L2;
                  } else {
                    if (0 <= var5.field_k) {
                      break L2;
                    } else {
                      ((ug) this).field_s[param3][var5.field_F] = null;
                      ((ug) this).field_s[param3][param2] = var5;
                      var6_int = var5.field_h + (var5.field_s * var5.field_x >> 888816332);
                      var5.field_h = var5.field_h + (param2 + -var5.field_F << -384632440);
                      var5.field_F = param2;
                      var5.field_x = 4096;
                      var5.field_s = -var5.field_h + var6_int;
                      return;
                    }
                  }
                }
                var5 = (cc) (Object) ((ug) this).field_H.field_q.c(-113);
                continue L1;
              }
            }
          }
        }
        var10 = (ig) (Object) ((ug) this).field_O.a(true, (long)((ug) this).field_r[param3]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_j[param2];
          if (var6 != null) {
            var7 = new cc();
            var7.field_u = param3;
            var7.field_C = var6;
            var7.field_o = var11;
            if (param0 == 15) {
              L3: {
                var7.field_q = var10.field_q[param2];
                var7.field_z = var10.field_n[param2];
                var7.field_F = param2;
                var7.field_t = 1024 + var11.field_l * (param1 * param1 * var10.field_m[param2]) >> 1956790987;
                var7.field_v = 255 & var10.field_s[param2];
                var7.field_h = -(var10.field_p[param2] & 32767) + (param2 << 1257163944);
                var7.field_r = 0;
                var7.field_k = -1;
                var7.field_n = 0;
                var7.field_E = 0;
                var7.field_m = 0;
                if (((ug) this).field_E[param3] != 0) {
                  L4: {
                    var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7, -16385));
                    stackOut_16_0 = this;
                    stackOut_16_1 = (cc) var7;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (-1 >= (var11.field_p[param2] ^ -1)) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = (cc) (Object) stackIn_18_1;
                      stackOut_18_2 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L4;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = (cc) (Object) stackIn_17_1;
                      stackOut_17_2 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      break L4;
                    }
                  }
                  ((ug) this).a(stackIn_19_1, stackIn_19_2 != 0, (byte) 101);
                  break L3;
                } else {
                  var7.field_D = ag.b(var6, this.b(950080514, var7), this.a(var7, 15), this.b(var7, -16385));
                  break L3;
                }
              }
              L5: {
                if (var11.field_p[param2] < 0) {
                  var7.field_D.f(-1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-1 < (var7.field_z ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    var8 = ((ug) this).field_G[param3][var7.field_z];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if (0 > var8.field_k) {
                        ((ug) this).field_s[param3][var8.field_F] = null;
                        var8.field_k = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((ug) this).field_G[param3][var7.field_z] = var7;
                  break L6;
                }
              }
              ((ug) this).field_H.field_q.a((gi) (Object) var7, 255);
              ((ug) this).field_s[param3][param2] = var7;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(param0 == ((ug) this).field_r[param2])) {
            ((ug) this).field_r[param2] = param0;
            for (var4 = 0; 128 > var4; var4++) {
                ((ug) this).field_G[param2][var4] = null;
            }
        }
        if (param1 != 0) {
            field_I = null;
        }
    }

    private final synchronized void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != 70) {
            boolean discarded$0 = ug.a(-61, '');
        }
        if ((param0 ^ -1) <= -1) {
            ((ug) this).field_Q[param0] = param2;
        } else {
            for (var4 = 0; 16 > var4; var4++) {
                ((ug) this).field_Q[var4] = param2;
            }
        }
    }

    final synchronized boolean a(int param0, vj param1, int param2, ok param3, cf param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        ga var8 = null;
        int var9 = 0;
        ig var10 = null;
        ig var10_ref = null;
        int var11 = 0;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          param3.a();
          var6 = 1;
          var7 = null;
          if (param2 < param0) {
            var7_array = new int[]{param0};
            break L0;
          } else {
            break L0;
          }
        }
        var8 = (ga) (Object) param3.field_i.b(-1);
        L1: while (true) {
          if (var8 == null) {
            L2: {
              if (var6 != 0) {
                param3.b();
                break L2;
              } else {
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              L4: {
                var9 = (int)var8.field_g;
                var10 = (ig) (Object) ((ug) this).field_O.a(true, (long)var9);
                if (var10 != null) {
                  break L4;
                } else {
                  var10_ref = u.a(param1, 0, var9);
                  if (var10_ref == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((ug) this).field_O.a((gi) (Object) var10_ref, (long)var9, -1);
                    break L4;
                  }
                }
              }
              if (!var10_ref.a(var7_array, 103, param4, var8.field_h)) {
                var6 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = (ga) (Object) param3.field_i.a((byte) -114);
            continue L1;
          }
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -13) {
            this.a(22, -65, -100, -116);
        }
        ((ug) this).field_S = param0;
    }

    final static sa[] c(byte param0) {
        if (param0 != -23) {
            field_m = null;
        }
        return new sa[]{oh.field_c, ei.field_n, cd.field_c, pi.field_N, vb.field_q, qj.field_b, db.field_d, b.field_i, wd.field_d, sc.field_d, cm.field_P, lb.field_z, bc.field_a, vj.field_d};
    }

    public static void h(int param0) {
        field_T = null;
        field_p = null;
        if (param0 != -921185753) {
            ug.h(38);
        }
        field_I = null;
        field_m = null;
    }

    public ug() {
        ((ug) this).field_n = new int[16];
        ((ug) this).field_z = new int[16];
        ((ug) this).field_C = new int[16];
        ((ug) this).field_F = new int[16];
        ((ug) this).field_u = new int[16];
        ((ug) this).field_q = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_y = new int[16];
        ((ug) this).field_E = new int[16];
        ((ug) this).field_S = 256;
        ((ug) this).field_B = new int[16];
        ((ug) this).field_t = new int[16];
        ((ug) this).field_r = new int[16];
        ((ug) this).field_s = new cc[16][128];
        ((ug) this).field_D = new int[16];
        ((ug) this).field_A = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_G = new cc[16][128];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_M = 1000000;
        ((ug) this).field_R = new rl();
        ((ug) this).field_H = new am((ug) this);
        ((ug) this).field_O = new tg(128);
        this.a(-1, (byte) 70, 256);
        this.a(false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new Random(2684L);
        field_x = false;
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_T = "Checking";
    }
}
