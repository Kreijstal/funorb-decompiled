/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ug extends qb {
    private int field_L;
    private wa field_W;
    private int[] field_O;
    private int[] field_q;
    private lp[][] field_u;
    private int[] field_J;
    private int[] field_U;
    private int[] field_m;
    private lp[][] field_r;
    private int field_x;
    private int[] field_N;
    private int[] field_K;
    int[] field_Q;
    private vm field_A;
    private int[] field_s;
    private int[] field_I;
    int[] field_o;
    private int[] field_n;
    private int[] field_V;
    private int[] field_B;
    private int[] field_P;
    static int[] field_E;
    int[] field_G;
    static fd field_w;
    private long field_F;
    private boolean field_T;
    private long field_z;
    private int field_t;
    private int field_p;
    static qk field_y;
    private hg field_R;
    private vh field_S;
    private int field_v;
    private boolean field_D;
    static String[] field_M;

    final synchronized void d(int param0) {
        this.c(true, 100);
        if (param0 >= -78) {
            this.b(false, -122);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 != 78) {
            ((ug) this).f(61);
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((ug) this).field_O[param2] = param1;
        ((ug) this).field_Q[param2] = (int)(0.5 + 2097152.0 * Math.pow((double)2, 0.00054931640625 * (double)param1));
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        lp var6 = null;
        int var7 = 0;
        lp var8 = null;
        var7 = DungeonAssault.field_K;
        var8 = ((ug) this).field_u[param2][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((ug) this).field_u[param2][param1] = null;
            if ((((ug) this).field_G[param2] & 2) == 0) {
              var8.field_r = 0;
              break L0;
            } else {
              var6 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var6.field_p != var8.field_p) {
                      break L2;
                    } else {
                      if (var6.field_r >= 0) {
                        break L2;
                      } else {
                        if (var6 == var8) {
                          break L2;
                        } else {
                          var8.field_r = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var6 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    final synchronized void a(vh param0, int param1, boolean param2) {
        try {
            this.a(true, -16257, param0, param2);
            if (param1 != 20938) {
                Object var5 = null;
                String discarded$0 = ug.a(false, 34, (CharSequence) null);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param0 < 70) {
            return;
        }
        if (!(param1 == ((ug) this).field_P[param2])) {
            ((ug) this).field_P[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((ug) this).field_r[param2][var4] = null;
            }
        }
    }

    private final void a(int param0, boolean param1) {
        lp var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (var3.field_p == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (null != var3.field_v) {
                  L4: {
                    var3.field_v.f(vn.field_t / 100);
                    if (!var3.field_v.e()) {
                      break L4;
                    } else {
                      ((ug) this).field_R.field_o.b((qb) (Object) var3.field_v);
                      break L4;
                    }
                  }
                  var3.b(true);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_r >= 0) {
                  break L5;
                } else {
                  ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                  break L5;
                }
              }
              var3.a(false);
              break L1;
            }
            var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
            continue L0;
          }
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 >= -116) {
            ((ug) this).field_q = null;
        }
        return ((ug) this).field_A.g();
    }

    private final void b(byte param0, int param1, int param2) {
        ((ug) this).field_J[param2] = param1;
        ((ug) this).field_K[param2] = nb.a(-128, param1);
        this.a((byte) 114, param1, param2);
    }

    private final void a(int param0, int param1, int param2, int param3) {
    }

    final synchronized void f(int param0) {
        int var3 = DungeonAssault.field_K;
        if (param0 != -50) {
            this.a(100, (byte) 104, 28);
        }
        kk var4 = (kk) (Object) ((ug) this).field_W.a(true);
        while (var4 != null) {
            var4.a((byte) -97);
            var4 = (kk) (Object) ((ug) this).field_W.a(4318);
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void d(boolean param0) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (param0) {
            this.a(-1, false);
        } else {
            this.b(true, -1);
        }
        this.e(-1, 0);
        for (var3 = 0; 16 > var3; var3++) {
            ((ug) this).field_P[var3] = ((ug) this).field_J[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((ug) this).field_K[var5] = nb.a(((ug) this).field_J[var5], -128);
            var5++;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        lp var6 = null;
        va var7 = null;
        int var7_int = 0;
        lp var8 = null;
        lp var9 = null;
        int var10 = 0;
        kk var11 = null;
        kk var12 = null;
        Object stackIn_15_0 = null;
        lp stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        lp stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        lp stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        lp stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        Object stackOut_16_0 = null;
        lp stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        lp stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        L0: {
          var10 = DungeonAssault.field_K;
          this.a(true, param2, param3, 64);
          var5 = 109;
          if (0 == (2 & ((ug) this).field_G[param3])) {
            break L0;
          } else {
            var6 = (lp) (Object) ((ug) this).field_R.field_q.d(-14205);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (~var6.field_p != ~param3) {
                    break L2;
                  } else {
                    if (var6.field_r >= 0) {
                      break L2;
                    } else {
                      ((ug) this).field_u[param3][var6.field_y] = null;
                      ((ug) this).field_u[param3][param2] = var6;
                      var7_int = var6.field_s - -(var6.field_w * var6.field_J >> 12);
                      var6.field_s = var6.field_s + (param2 - var6.field_y << 8);
                      var6.field_y = param2;
                      var6.field_J = var7_int + -var6.field_s;
                      var6.field_w = 4096;
                      return;
                    }
                  }
                }
                var6 = (lp) (Object) ((ug) this).field_R.field_q.g(20);
                continue L1;
              }
            }
          }
        }
        var11 = (kk) (Object) ((ug) this).field_W.a((long)((ug) this).field_P[param3], 8);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var7 = var11.field_k[param2];
          if (var7 == null) {
            return;
          } else {
            L3: {
              var8 = new lp();
              var8.field_x = var12;
              var8.field_I = var7;
              var8.field_p = param3;
              var8.field_A = var11.field_n[param2];
              var8.field_D = var11.field_o[param2];
              var8.field_y = param2;
              var8.field_t = 1024 + var11.field_m[param2] * var12.field_j * (param0 * param0) >> 11;
              var8.field_i = var11.field_p[param2] & 255;
              var8.field_s = (param2 << 8) + -(32767 & var11.field_r[param2]);
              var8.field_r = -1;
              var8.field_j = 0;
              var8.field_u = 0;
              var8.field_k = 0;
              var8.field_l = 0;
              if (0 == ((ug) this).field_o[param3]) {
                int discarded$3 = 0;
                int discarded$4 = 0;
                var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8), this.a(var8));
                break L3;
              } else {
                L4: {
                  int discarded$5 = 0;
                  var8.field_v = ni.a(var7, this.a((byte) 46, var8), 0, this.a(var8));
                  stackOut_14_0 = this;
                  stackOut_14_1 = (lp) var8;
                  stackOut_14_2 = 4917;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (var11.field_r[param2] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (lp) (Object) stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = (lp) (Object) stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L4;
                  }
                }
                ((ug) this).a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                break L3;
              }
            }
            L5: {
              if (var11.field_r[param2] >= 0) {
                break L5;
              } else {
                var8.field_v.e(-1);
                break L5;
              }
            }
            L6: {
              if (var8.field_D < 0) {
                break L6;
              } else {
                L7: {
                  var9 = ((ug) this).field_r[param3][var8.field_D];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (var9.field_r >= 0) {
                      break L7;
                    } else {
                      ((ug) this).field_u[param3][var9.field_y] = null;
                      var9.field_r = 0;
                      break L7;
                    }
                  }
                }
                ((ug) this).field_r[param3][var8.field_D] = var8;
                break L6;
              }
            }
            ((ug) this).field_R.field_q.a((ne) (Object) var8, false);
            ((ug) this).field_u[param3][param2] = var8;
            return;
          }
        }
    }

    private final void f(int param0, int param1) {
        lp var4 = null;
        int var5 = DungeonAssault.field_K;
        int var3 = 13 / ((param1 - -35) / 49);
        if (!((((ug) this).field_G[param0] & 4) == 0)) {
            var4 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
            while (var4 != null) {
                if (!(param0 != var4.field_p)) {
                    var4.field_m = 0;
                }
                var4 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
            }
        }
    }

    final boolean a(lp param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0.field_v == null) {
              L1: {
                if (0 > param0.field_r) {
                  break L1;
                } else {
                  param0.a(false);
                  if (param0.field_D <= 0) {
                    break L1;
                  } else {
                    if (param0 != ((ug) this).field_r[param0.field_p][param0.field_D]) {
                      break L1;
                    } else {
                      ((ug) this).field_r[param0.field_p][param0.field_D] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              L2: {
                if (param1 == -16257) {
                  break L2;
                } else {
                  ((ug) this).field_r = null;
                  break L2;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ug.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final void a(boolean param0, int param1, int param2) {
        ((ug) this).field_B[param2] = param1;
    }

    private final synchronized void c(boolean param0, int param1) {
        ((ug) this).field_A.c();
        if (param1 <= 27) {
            return;
        }
        ((ug) this).field_S = null;
        int discarded$0 = 16;
        this.d(param0);
    }

    private final int a(byte param0, lp param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        of var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        Object var9 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_J * param1.field_w >> 12) + param1.field_s;
              var3_int = var3_int + ((-8192 + ((ug) this).field_B[param1.field_p]) * ((ug) this).field_I[param1.field_p] >> 12);
              if (param0 > 2) {
                break L1;
              } else {
                var9 = null;
                ((ug) this).b((int[]) null, 108, -85);
                break L1;
              }
            }
            L2: {
              var4 = param1.field_A;
              if (var4.field_i <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_h > 0) {
                    break L3;
                  } else {
                    if (((ug) this).field_U[param1.field_p] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_h << 2;
                  var6 = var4.field_a << 1;
                  if (~param1.field_G > ~var6) {
                    var5 = param1.field_G * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((ug) this).field_U[param1.field_p] >> 7);
                var7 = Math.sin((double)(param1.field_E & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_I.field_n) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vn.field_t + 0.5);
              if (var5 < 1) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var5;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ug.T(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param1 >= 0) {
            ((ug) this).field_V[param1] = param0;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((ug) this).field_V[var4] = param0;
            }
        }
        var4 = 54 / ((-2 - param2) / 60);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!((ug) this).field_A.g()) {
                break L1;
              } else {
                var4_int = ((ug) this).field_A.field_c * ((ug) this).field_x / vn.field_t;
                L2: while (true) {
                  var5 = ((ug) this).field_z - -((long)param2 * (long)var4_int);
                  if (((ug) this).field_F - var5 >= 0L) {
                    ((ug) this).field_z = var5;
                    break L1;
                  } else {
                    var7 = (int)(((long)var4_int + ((ug) this).field_F - ((ug) this).field_z + -1L) / (long)var4_int);
                    ((ug) this).field_z = ((ug) this).field_z + (long)var4_int * (long)var7;
                    ((ug) this).field_R.b(param0, param1, var7);
                    this.a((byte) -24);
                    param1 = param1 + var7;
                    param2 = param2 - var7;
                    if (!((ug) this).field_A.g()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            ((ug) this).field_R.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ug.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void e(int param0, int param1) {
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param1 <= param0) {
          ((ug) this).field_q[param0] = 12800;
          ((ug) this).field_n[param0] = 8192;
          ((ug) this).field_m[param0] = 16383;
          ((ug) this).field_B[param0] = 8192;
          ((ug) this).field_U[param0] = 0;
          ((ug) this).field_s[param0] = 8192;
          this.d(param0, -1);
          this.f(param0, param1 + -108);
          ((ug) this).field_G[param0] = 0;
          ((ug) this).field_N[param0] = 32767;
          ((ug) this).field_I[param0] = 256;
          ((ug) this).field_o[param0] = 0;
          this.a(2, 8192, param0);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.e(param0, param1);
              param0++;
              continue L0;
            }
          }
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = cm.a(false, -125, param2);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param2.length()) {
                  if (param1 > -39) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (!rp.a(param2.charAt(var4), (byte) -120)) {
                    stackOut_8_0 = me.field_a;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ug.H(").append(0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return (String) (Object) stackIn_14_0;
    }

    final synchronized qb d() {
        return (qb) (Object) ((ug) this).field_R;
    }

    final synchronized void c(byte param0, int param1, int param2) {
        this.b((byte) -87, param1, param2);
        int var4 = -56 % ((param0 - -57) / 43);
    }

    private final synchronized void a(boolean param0, int param1, vh param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        try {
            this.c(param0, param1 + 16353);
            ((ug) this).field_A.a(param2.field_i);
            ((ug) this).field_z = 0L;
            if (param1 != -16257) {
                Object var8 = null;
                ((ug) this).a((vh) null, -111, false);
            }
            ((ug) this).field_T = param3 ? true : false;
            var5_int = ((ug) this).field_A.a();
            for (var6 = 0; var5_int > var6; var6++) {
                ((ug) this).field_A.d(var6);
                ((ug) this).field_A.b(var6);
                ((ug) this).field_A.a(var6);
            }
            ((ug) this).field_p = ((ug) this).field_A.b();
            ((ug) this).field_t = ((ug) this).field_A.field_d[((ug) this).field_p];
            ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.EA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final synchronized qb c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        lp var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((ug) this).field_x = 27;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (~param1 == ~var3.field_p) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_r >= 0) {
                break L2;
              } else {
                ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                var3.field_r = 0;
                break L2;
              }
            }
            var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
            continue L0;
          }
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 != 24509) {
            return;
        }
        ((ug) this).field_L = param0;
    }

    public static void e() {
        field_E = null;
        field_y = null;
        field_M = null;
        field_w = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var2 = ((ug) this).field_p;
          var3 = ((ug) this).field_t;
          var4 = ((ug) this).field_F;
          if (((ug) this).field_S == null) {
            break L0;
          } else {
            if (((ug) this).field_v != var3) {
              break L0;
            } else {
              this.a(((ug) this).field_D, -16257, ((ug) this).field_S, ((ug) this).field_T);
              this.a((byte) -24);
              return;
            }
          }
        }
        L1: while (true) {
          if (~((ug) this).field_t != ~var3) {
            L2: {
              ((ug) this).field_t = var3;
              ((ug) this).field_F = var4;
              ((ug) this).field_p = var2;
              if (null == ((ug) this).field_S) {
                break L2;
              } else {
                if (var3 <= ((ug) this).field_v) {
                  break L2;
                } else {
                  ((ug) this).field_p = -1;
                  ((ug) this).field_t = ((ug) this).field_v;
                  ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (((ug) this).field_A.field_d[var2] != var3) {
                  break L4;
                } else {
                  ((ug) this).field_A.d(var2);
                  var6 = ((ug) this).field_A.c(var2);
                  if (1 != var6) {
                    L5: {
                      if ((128 & var6) != 0) {
                        this.a(var6, 16384);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((ug) this).field_A.b(var2);
                    ((ug) this).field_A.a(var2);
                    continue L3;
                  } else {
                    ((ug) this).field_A.e();
                    ((ug) this).field_A.a(var2);
                    if (!((ug) this).field_A.f()) {
                      break L4;
                    } else {
                      if (null == ((ug) this).field_S) {
                        L6: {
                          if (!((ug) this).field_T) {
                            break L6;
                          } else {
                            if (0 != var3) {
                              ((ug) this).field_A.a(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        int discarded$1 = 16;
                        this.d(true);
                        ((ug) this).field_A.c();
                        return;
                      } else {
                        ((ug) this).a(((ug) this).field_S, 20938, ((ug) this).field_T);
                        this.a((byte) -24);
                        return;
                      }
                    }
                  }
                }
              }
              var2 = ((ug) this).field_A.b();
              var3 = ((ug) this).field_A.field_d[var2];
              var4 = ((ug) this).field_A.e(var3);
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, lp param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        of var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              param3.field_H = vn.field_t / 100;
              if (param3.field_r < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_v) {
                    break L2;
                  } else {
                    if (param3.field_v.f()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.b(true);
                  param3.a(false);
                  if (param3.field_D <= 0) {
                    break L3;
                  } else {
                    if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                      ((ug) this).field_r[param3.field_p][param3.field_D] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_w;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((ug) this).field_s[param3.field_p]) * 16.0 + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_w = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_v.g(this.a((byte) 119, param3));
              var7 = param3.field_A;
              param3.field_E = param3.field_E + var7.field_i;
              var8 = 0;
              param3.field_G = param3.field_G + 1;
              var9 = (double)((param3.field_J * param3.field_w >> 12) + (-60 + param3.field_y << 8)) * 0.000005086263020833333;
              if (0 >= var7.field_c) {
                break L6;
              } else {
                L7: {
                  if (0 < var7.field_b) {
                    param3.field_k = param3.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                    break L7;
                  } else {
                    param3.field_k = param3.field_k + 128;
                    break L7;
                  }
                }
                if (819200 > param3.field_k * var7.field_c) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (var7.field_n == null) {
                break L8;
              } else {
                L9: {
                  if (var7.field_e > 0) {
                    param3.field_u = param3.field_u + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
                    break L9;
                  } else {
                    param3.field_u = param3.field_u + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_l >= var7.field_n.length - 2) {
                      break L11;
                    } else {
                      if (~param3.field_u >= ~((var7.field_n[param3.field_l - -2] & 255) << 8)) {
                        break L11;
                      } else {
                        param3.field_l = param3.field_l + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_n.length - 2 != param3.field_l) {
                    break L8;
                  } else {
                    if (var7.field_n[1 + param3.field_l] != 0) {
                      break L8;
                    } else {
                      var8 = 1;
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (param3.field_r < 0) {
                break L12;
              } else {
                if (null == var7.field_o) {
                  break L12;
                } else {
                  if ((1 & ((ug) this).field_G[param3.field_p]) != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_D < 0) {
                        break L13;
                      } else {
                        if (((ug) this).field_r[param3.field_p][param3.field_D] != param3) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (0 < var7.field_m) {
                        param3.field_r = param3.field_r + (int)(Math.pow(2.0, var9 * (double)var7.field_m) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_r = param3.field_r + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (~(var7.field_o.length - 2) >= ~param3.field_j) {
                          break L16;
                        } else {
                          if (~((var7.field_o[param3.field_j - -2] & 255) << 8) <= ~param3.field_r) {
                            break L16;
                          } else {
                            param3.field_j = param3.field_j + 2;
                            continue L15;
                          }
                        }
                      }
                      if (~param3.field_j == ~(var7.field_o.length + -2)) {
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
            var11 = -89 % ((param0 - -80) / 44);
            if (var8 != 0) {
              L17: {
                param3.field_v.f(param3.field_H);
                if (param4 == null) {
                  param3.field_v.a(param2);
                  break L17;
                } else {
                  param3.field_v.b(param4, param1, param2);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_v.e()) {
                  break L18;
                } else {
                  ((ug) this).field_R.field_o.b((qb) (Object) param3.field_v);
                  break L18;
                }
              }
              L19: {
                param3.b(true);
                if (param3.field_r < 0) {
                  break L19;
                } else {
                  param3.a(false);
                  if (0 >= param3.field_D) {
                    break L19;
                  } else {
                    if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                      ((ug) this).field_r[param3.field_p][param3.field_D] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              stackOut_59_0 = 1;
              stackIn_60_0 = stackOut_59_0;
              return stackIn_60_0 != 0;
            } else {
              int discarded$2 = 0;
              int discarded$3 = 0;
              param3.field_v.a(param3.field_H, this.b(param3), this.a(param3));
              stackOut_61_0 = 0;
              stackIn_62_0 = stackOut_61_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var6;
            stackOut_63_1 = new StringBuilder().append("ug.MA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param3 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L20;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L20;
            }
          }
          L21: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param4 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L21;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
        }
        return stackIn_62_0 != 0;
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var3 = param0 & 240;
        if (var3 != 128) {
          if (var3 != 144) {
            if (var3 == 160) {
              var4 = param0 & 15;
              var5 = (param0 & 32616) >> 8;
              var6 = param0 >> 16 & 127;
              this.a(var5, var6, var4, 73);
              return;
            } else {
              if (176 == var3) {
                L0: {
                  var4 = 15 & param0;
                  var5 = param0 >> 8 & 127;
                  var6 = (param0 & 8364021) >> 16;
                  if (0 == var5) {
                    ((ug) this).field_K[var4] = (var6 << 14) + nb.a(((ug) this).field_K[var4], -2080769);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (32 != var5) {
                    break L1;
                  } else {
                    ((ug) this).field_K[var4] = (var6 << 7) + nb.a(((ug) this).field_K[var4], -16257);
                    break L1;
                  }
                }
                L2: {
                  if (1 != var5) {
                    break L2;
                  } else {
                    ((ug) this).field_U[var4] = (var6 << 7) + nb.a(((ug) this).field_U[var4], -16257);
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 33) {
                    ((ug) this).field_U[var4] = nb.a(-128, ((ug) this).field_U[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 != 5) {
                    break L4;
                  } else {
                    ((ug) this).field_s[var4] = (var6 << 7) + nb.a(((ug) this).field_s[var4], -16257);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    ((ug) this).field_s[var4] = var6 + nb.a(-128, ((ug) this).field_s[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 == 7) {
                    ((ug) this).field_q[var4] = (var6 << 7) + nb.a(((ug) this).field_q[var4], -16257);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var5 == 39) {
                    ((ug) this).field_q[var4] = nb.a(-128, ((ug) this).field_q[var4]) - -var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 == 10) {
                    ((ug) this).field_n[var4] = (var6 << 7) + nb.a(((ug) this).field_n[var4], -16257);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var5 != 42) {
                    break L9;
                  } else {
                    ((ug) this).field_n[var4] = var6 + nb.a(-128, ((ug) this).field_n[var4]);
                    break L9;
                  }
                }
                L10: {
                  if (var5 != 11) {
                    break L10;
                  } else {
                    ((ug) this).field_m[var4] = (var6 << 7) + nb.a(((ug) this).field_m[var4], -16257);
                    break L10;
                  }
                }
                L11: {
                  if (43 != var5) {
                    break L11;
                  } else {
                    ((ug) this).field_m[var4] = var6 + nb.a(-128, ((ug) this).field_m[var4]);
                    break L11;
                  }
                }
                L12: {
                  if (64 == var5) {
                    if (var6 < 64) {
                      ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -2);
                      break L12;
                    } else {
                      ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 == 65) {
                    if (64 > var6) {
                      this.d(var4, -1);
                      ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -3);
                      break L13;
                    } else {
                      ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 2);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var5 != 99) {
                    break L14;
                  } else {
                    ((ug) this).field_N[var4] = (var6 << 7) + nb.a(127, ((ug) this).field_N[var4]);
                    break L14;
                  }
                }
                L15: {
                  if (var5 == 98) {
                    ((ug) this).field_N[var4] = nb.a(16256, ((ug) this).field_N[var4]) - -var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var5 == 101) {
                    ((ug) this).field_N[var4] = (var6 << 7) + 16384 - -nb.a(((ug) this).field_N[var4], 127);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var5 != 100) {
                    break L17;
                  } else {
                    ((ug) this).field_N[var4] = nb.a(((ug) this).field_N[var4], 16256) + (16384 + var6);
                    break L17;
                  }
                }
                L18: {
                  if (120 != var5) {
                    break L18;
                  } else {
                    this.a(var4, false);
                    break L18;
                  }
                }
                L19: {
                  if (121 != var5) {
                    break L19;
                  } else {
                    this.e(var4, 0);
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 123) {
                    this.b(true, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 == 6) {
                    var7 = ((ug) this).field_N[var4];
                    if (var7 != 16384) {
                      break L21;
                    } else {
                      ((ug) this).field_I[var4] = nb.a(-16257, ((ug) this).field_I[var4]) + (var6 << 7);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (38 != var5) {
                    break L22;
                  } else {
                    var7 = ((ug) this).field_N[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((ug) this).field_I[var4] = nb.a(-128, ((ug) this).field_I[var4]) - -var6;
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 == 16) {
                    ((ug) this).field_o[var4] = nb.a(-16257, ((ug) this).field_o[var4]) + (var6 << 7);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (var5 == 48) {
                    ((ug) this).field_o[var4] = nb.a(-128, ((ug) this).field_o[var4]) + var6;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 >= 64) {
                      ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 4);
                      break L25;
                    } else {
                      this.f(var4, 34);
                      ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -5);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 17) {
                    this.a(2, (-16257 & ((ug) this).field_O[var4]) + (var6 << 7), var4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.a(2, var6 + (((ug) this).field_O[var4] & -128), var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (var3 == 192) {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 8;
                  this.a((byte) 106, ((ug) this).field_K[var4] + var5, var4);
                  return;
                } else {
                  if (var3 != 208) {
                    if (224 == var3) {
                      var4 = param0 & 15;
                      var5 = (param0 >> 9 & 16256) + ((32761 & param0) >> 8);
                      this.a(false, var5, var4);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 == 255) {
                        int discarded$1 = 16;
                        this.d(true);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 8;
                    this.a(var5, (byte) 78, var4);
                    return;
                  }
                }
              }
            }
          } else {
            var4 = param0 & 15;
            var5 = param0 >> 8 & 127;
            var6 = (param0 & 8385741) >> 16;
            if (0 < var6) {
              this.b(var6, -29, var5, var4);
              return;
            } else {
              this.a(true, var5, var4, 64);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = (32667 & param0) >> 8;
          var6 = (8372321 & param0) >> 16;
          this.a(true, var5, var4, var6);
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        if (65536L > (long)param1) {
          if (256L <= (long)param1) {
            if ((long)param1 < 4096L) {
              if ((long)param1 < 1024L) {
                return lc.field_h[param1 >> 2] >> 11;
              } else {
                return lc.field_h[param1 >> 4] >> 10;
              }
            } else {
              if ((long)param1 >= 16384L) {
                return lc.field_h[param1 >> 8] >> 8;
              } else {
                return lc.field_h[param1 >> 6] >> 9;
              }
            }
          } else {
            if (param1 < 0) {
              return -1;
            } else {
              return lc.field_h[param1] >> 12;
            }
          }
        } else {
          if ((long)param1 < 16777216L) {
            if ((long)param1 < 1048576L) {
              if ((long)param1 < 262144L) {
                return lc.field_h[param1 >> 10] >> 7;
              } else {
                return lc.field_h[param1 >> 12] >> 6;
              }
            } else {
              if ((long)param1 < 4194304L) {
                return lc.field_h[param1 >> 14] >> 5;
              } else {
                return lc.field_h[param1 >> 16] >> 4;
              }
            }
          } else {
            if ((long)param1 < 268435456L) {
              if ((long)param1 >= 67108864L) {
                return lc.field_h[param1 >> 20] >> 2;
              } else {
                return lc.field_h[param1 >> 18] >> 3;
              }
            } else {
              if ((long)param1 < 1073741824L) {
                return lc.field_h[param1 >> 22] >> 1;
              } else {
                return lc.field_h[param1 >> 24];
              }
            }
          }
        }
    }

    private final int a(lp param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = ((ug) this).field_n[param0.field_p];
            if (var3_int >= 8192) {
              stackOut_3_0 = -((-param0.field_i + 128) * (-var3_int + 16384) + 32 >> 6) + 16384;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + var3_int * param0.field_i >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ug.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    private final void d(int param0, int param1) {
        lp var3 = null;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if ((((ug) this).field_G[param0] & 2) != 0) {
            var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (~param0 != ~var3.field_p) {
                    break L2;
                  } else {
                    if (((ug) this).field_u[param0][var3.field_y] == null) {
                      if (var3.field_r >= 0) {
                        break L2;
                      } else {
                        var3.field_r = 0;
                        break L2;
                      }
                    } else {
                      var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                      continue L1;
                    }
                  }
                }
                var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final synchronized void b(int param0, int param1) {
        ((ug) this).field_x = param0;
        if (param1 != 0) {
            Object var4 = null;
            this.a(true, -114, (vh) null, false);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DungeonAssault.field_K;
            if (((ug) this).field_A.g()) {
              var2 = ((ug) this).field_x * ((ug) this).field_A.field_c / vn.field_t;
              L2: while (true) {
                var3 = (long)param0 * (long)var2 + ((ug) this).field_z;
                if (((ug) this).field_F + -var3 >= 0L) {
                  ((ug) this).field_z = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + (long)var2 + ((ug) this).field_F + -((ug) this).field_z) / (long)var2);
                  ((ug) this).field_z = ((ug) this).field_z + (long)var5 * (long)var2;
                  ((ug) this).field_R.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) -24);
                  if (((ug) this).field_A.g()) {
                    continue L2;
                  } else {
                    ((ug) this).field_R.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((ug) this).field_R.a(param0);
          break L0;
        }
    }

    final synchronized boolean a(boolean param0, lc param1, nh param2, int param3, vh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        mk var8 = null;
        int var9 = 0;
        kk var10 = null;
        int var11 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              param4.a();
              if (!param0) {
                break L1;
              } else {
                ((ug) this).field_u = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (param3 > 0) {
                var7 = (Object) (Object) new int[]{param3};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (mk) (Object) param4.field_j.a(true);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param4.b();
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_h;
                    var10 = (kk) (Object) ((ug) this).field_W.a((long)var9, 8);
                    if (var10 != null) {
                      break L6;
                    } else {
                      var10 = dl.a((byte) 110, var9, param2);
                      if (var10 == null) {
                        var6_int = 0;
                        break L5;
                      } else {
                        ((ug) this).field_W.a((ne) (Object) var10, 12460, (long)var9);
                        break L6;
                      }
                    }
                  }
                  if (!var10.a((byte) 45, param1, (int[]) var7, var8.field_k)) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var8 = (mk) (Object) param4.field_j.a(4318);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ug.L(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    private final int b(lp param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        of var9 = null;
        of var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((ug) this).field_V[param0.field_p] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param0.field_A;
                var10 = var9;
                var4 = 4096 + ((ug) this).field_q[param0.field_p] * ((ug) this).field_m[param0.field_p] >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = 16384 + var4 * param0.field_t >> 15;
                var4 = var4 * ((ug) this).field_L - -128 >> 8;
                var4 = ((ug) this).field_V[param0.field_p] * var4 + 128 >> 8;
                if (var10.field_c <= 0) {
                  break L1;
                } else {
                  var4 = (int)(Math.pow(0.5, (double)param0.field_k * 0.00001953125 * (double)var10.field_c) * (double)var4 + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_u;
                    var6 = var10.field_n[param0.field_l + 1];
                    if (param0.field_l < var10.field_n.length + -2) {
                      var7 = 65280 & var9.field_n[param0.field_l] << 8;
                      var8 = (255 & var10.field_n[2 + param0.field_l]) << 8;
                      var6 = var6 + (-var6 + var10.field_n[3 + param0.field_l]) * (-var7 + var5) / (var8 + -var7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_r) {
                  break L4;
                } else {
                  if (null == var10.field_o) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_r;
                      var6 = var10.field_o[1 + param0.field_j];
                      if (~param0.field_j <= ~(-2 + var10.field_o.length)) {
                        break L5;
                      } else {
                        var7 = (255 & var9.field_o[param0.field_j]) << 8;
                        var8 = (var10.field_o[param0.field_j - -2] & 255) << 8;
                        var6 = var6 + (-var7 + var5) * (-var6 + var10.field_o[param0.field_j - -3]) / (var8 + -var7);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_16_0 = var4;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ug.BA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 0 + 41);
        }
        return stackIn_17_0;
    }

    final void a(lp param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param0.field_I.field_k.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param0.field_I.field_j) {
                    break L2;
                  } else {
                    var6 = -param0.field_I.field_l + var4_int + var4_int;
                    var5 = (int)((long)var6 * (long)((ug) this).field_o[param0.field_p] >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      param0.field_v.b(true);
                      var5 = var4_int + var4_int + -1 + -var5;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((ug) this).field_o[param0.field_p] >> 6);
              break L1;
            }
            L3: {
              param0.field_v.i(var5);
              if (param1 == 4917) {
                break L3;
              } else {
                var7 = null;
                boolean discarded$1 = ((ug) this).a(false, (lc) null, (nh) null, 98, (vh) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ug.IA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public ug() {
        ((ug) this).field_L = 256;
        ((ug) this).field_q = new int[16];
        ((ug) this).field_u = new lp[16][128];
        ((ug) this).field_O = new int[16];
        ((ug) this).field_I = new int[16];
        ((ug) this).field_K = new int[16];
        ((ug) this).field_m = new int[16];
        ((ug) this).field_x = 1000000;
        ((ug) this).field_r = new lp[16][128];
        ((ug) this).field_V = new int[16];
        ((ug) this).field_J = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_N = new int[16];
        ((ug) this).field_B = new int[16];
        ((ug) this).field_s = new int[16];
        ((ug) this).field_P = new int[16];
        ((ug) this).field_n = new int[16];
        ((ug) this).field_G = new int[16];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_A = new vm();
        ((ug) this).field_R = new hg((ug) this);
        ((ug) this).field_W = new wa(128);
        ((ug) this).a(256, -1, (byte) -84);
        int discarded$0 = 16;
        this.d(true);
    }

    ug(ug param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ug) this).field_L = 256;
        ((ug) this).field_q = new int[16];
        ((ug) this).field_u = new lp[16][128];
        ((ug) this).field_O = new int[16];
        ((ug) this).field_I = new int[16];
        ((ug) this).field_K = new int[16];
        ((ug) this).field_m = new int[16];
        ((ug) this).field_x = 1000000;
        ((ug) this).field_r = new lp[16][128];
        ((ug) this).field_V = new int[16];
        ((ug) this).field_J = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_N = new int[16];
        ((ug) this).field_B = new int[16];
        ((ug) this).field_s = new int[16];
        ((ug) this).field_P = new int[16];
        ((ug) this).field_n = new int[16];
        ((ug) this).field_G = new int[16];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_A = new vm();
        ((ug) this).field_R = new hg((ug) this);
        try {
          L0: {
            ((ug) this).field_W = param0.field_W;
            ((ug) this).a(256, -1, (byte) -63);
            int discarded$1 = 16;
            this.d(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ug.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = 64;
        field_E = rb.b(0, 0);
        field_w = new fd(2);
        field_M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};
    }
}
