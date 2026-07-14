/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends pm {
    private int[] field_K;
    private int field_N;
    private int[] field_P;
    private int[] field_U;
    static String field_H;
    double[] field_I;
    static oc[] field_R;
    static vd field_G;
    double[] field_T;
    private int[] field_L;
    double[] field_S;
    double[] field_Q;
    double[] field_M;
    private int[] field_F;
    double[] field_O;
    gk field_J;

    final void a(int param0, hf param1) {
        if (param0 > -29) {
            boolean discarded$0 = ((kl) this).c(-49);
        }
    }

    final void a(kh param0, int param1) {
        if (param1 <= 122) {
            field_G = null;
        }
    }

    final void a(int param0, ah param1) {
        int var3 = -96 / ((param0 - 14) / 53);
    }

    public static void k(int param0) {
        if (param0 != -16420) {
            kl.k(119);
        }
        field_G = null;
        field_R = null;
        field_H = null;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        Object var38 = null;
        L0: {
          var37 = Confined.field_J ? 1 : 0;
          this.c(false);
          if (param2 <= -5) {
            break L0;
          } else {
            var38 = null;
            ((kl) this).a(5, (hf) null);
            break L0;
          }
        }
        L1: {
          var7 = ((kl) this).field_E - param3.field_T;
          var9 = -param3.field_L + ((kl) this).field_t;
          var11 = -param3.field_O + ((kl) this).field_D;
          var13 = param3.field_R * var7 + param3.field_ab * var9 + var11 * param3.field_M;
          var15 = var7 * param3.field_V + var9 * param3.field_U + var11 * param3.field_F;
          var17 = param3.field_P * var7 + param3.field_H * var9 + var11 * param3.field_N;
          if (0.15 <= var17) {
            var19 = 640.0 * (var13 / var17) + 320.0;
            var21 = 188.0 + var15 / var17 * 640.0;
            var23 = 640.0 * (((kl) this).field_C / var17);
            var25 = 2.0 * (1.0 - var11 / param1);
            var25 = qn.field_v.a(var25, 0, ((kl) this).field_D);
            if (0.0 >= var25) {
              break L1;
            } else {
              L2: {
                if (var25 <= 1.0) {
                  break L2;
                } else {
                  var25 = 1.0;
                  break L2;
                }
              }
              var27 = ((kl) this).field_Q.length;
              var28 = 0;
              L3: while (true) {
                if (var27 <= var28) {
                  break L1;
                } else {
                  if (((kl) this).field_P[var28] > 0) {
                    L4: {
                      var29 = (int)((((kl) this).field_Q[var28] * var23 + var19) * 16.0);
                      var30 = (int)(16.0 * (var23 * ((kl) this).field_T[var28] + var21));
                      var31 = 16.0 * (0.02 / var17 * 640.0);
                      var33 = var25 * (double)((kl) this).field_P[var28];
                      if (16.0 <= var31) {
                        var36 = (int)var33;
                        var35 = (int)var31;
                        break L4;
                      } else {
                        var35 = 16;
                        var36 = (int)(var33 * var31 * var31) >> -500812696;
                        break L4;
                      }
                    }
                    fn.a(var29, var30, var35, var36, ((kl) this).field_U);
                    var28++;
                    continue L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    final void a(int param0, mb param1) {
        if (param0 != -23154) {
            ((kl) this).field_O = null;
        }
    }

    final void a(boolean param0, ee param1) {
        if (!param0) {
            ((kl) this).field_K = null;
        }
    }

    final void a(boolean param0, il param1) {
        if (param0) {
            ((kl) this).field_Q = null;
        }
    }

    final boolean i(int param0) {
        if (param0 != 8) {
            return false;
        }
        return false;
    }

    private final double c(int param0, int param1) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        int var3 = 0;
        for (var4 = param0; (var4 ^ -1) > -10; var4++) {
            var3 = var3 + ti.field_j[2047 & ((kl) this).field_L[9 * param1 - -var4]] * bh.field_b[var4];
            var3 = var3 + ti.field_m[2047 & ((kl) this).field_L[param1 * 9 - -var4]] * bh.field_b[var4 + 9];
        }
        return (double)var3 * kd.field_r;
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        Object var19 = null;
        int var20 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var18 = Confined.field_J ? 1 : 0;
        var2 = ((kl) this).field_N;
        if (var2 == 0) {
          return;
        } else {
          ((kl) this).field_N = 0;
          var3 = 1;
          var4 = ((kl) this).field_Q.length;
          kd.field_r = (double)var2 * 9.313225746154785e-13;
          var5 = (double)var2 * 0.5;
          var7 = Math.pow(0.5, (double)var2);
          var9 = 0;
          L0: while (true) {
            L1: {
              if (var4 <= var9) {
                break L1;
              } else {
                if (((kl) this).field_P[var9] > 0) {
                  L2: {
                    ck.a(-1942300510, ((kl) this).field_Q[var9], ((kl) this).field_T[var9], ((kl) this).field_S[var9]);
                    var10 = ((kl) this).field_O[var9];
                    var12 = ((kl) this).field_I[var9];
                    var14 = ((kl) this).field_M[var9];
                    var10 = var10 + this.c(0, 0);
                    var12 = var12 + this.c(0, 1);
                    var14 = var14 + this.c(0, 2);
                    var16 = 1.0 - var5 * Math.sqrt(var14 * var14 + (var10 * var10 + var12 * var12));
                    if (var7 > var16) {
                      var16 = var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var12 = var12 * var16;
                  var10 = var10 * var16;
                  var14 = var14 * var16;
                  ((kl) this).field_O[var9] = var10;
                  ((kl) this).field_I[var9] = var12;
                  ((kl) this).field_M[var9] = var14;
                  ((kl) this).field_Q[var9] = ((kl) this).field_Q[var9] + (double)var2 * var10;
                  ((kl) this).field_T[var9] = ((kl) this).field_T[var9] + (double)var2 * var12;
                  ((kl) this).field_S[var9] = ((kl) this).field_S[var9] + (double)var2 * var14;
                  ((kl) this).field_P[var9] = ((kl) this).field_P[var9] - var2 * ((kl) this).field_K[var9];
                  if (-1 > (((kl) this).field_P[var9] ^ -1)) {
                    var3 = 0;
                    var9++;
                    continue L0;
                  } else {
                    ((kl) this).field_P[var9] = 0;
                    var9++;
                    continue L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var3 == 0) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L3;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L3;
              }
            }
            L4: {
              ((kl) this).field_z = stackIn_16_1 != 0;
              var20 = 0;
              var9 = var20;
              if (!param0) {
                break L4;
              } else {
                var19 = null;
                boolean discarded$1 = ((kl) this).a(true, (pm) null);
                break L4;
              }
            }
            L5: while (true) {
              if (var20 >= 9) {
                return;
              } else {
                ((kl) this).field_L[var20] = ((kl) this).field_L[var20] + ((kl) this).field_F[var20] * var2;
                var20++;
                continue L5;
              }
            }
          }
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            return true;
        }
        return false;
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            ((kl) this).field_Q = null;
        }
    }

    final boolean f(int param0) {
        if (param0 > -54) {
            boolean discarded$0 = ((kl) this).f(96);
            return false;
        }
        return false;
    }

    final void a(cl param0, byte param1) {
        int var3 = -60 % ((param1 - -35) / 60);
    }

    final boolean g(byte param0) {
        if (param0 < 64) {
            Object var3 = null;
            ((kl) this).a((cl) null, (byte) -112);
        }
        return false;
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            field_R = null;
            return false;
        }
        return false;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return false;
    }

    kl(hn param0, double param1, double param2, double param3, double param4, int param5, int[] param6, boolean param7) {
        super(param0, param1, param2, param3, param4);
        int var13 = 0;
        int var14 = 0;
        ((kl) this).field_N = 0;
        ((kl) this).field_L = new int[27];
        ((kl) this).field_F = new int[27];
        ((kl) this).field_M = new double[param5];
        ((kl) this).field_K = new int[param5];
        ((kl) this).field_U = param6;
        ((kl) this).field_P = new int[param5];
        ((kl) this).field_T = new double[param5];
        ((kl) this).field_O = new double[param5];
        ((kl) this).field_I = new double[param5];
        ((kl) this).field_Q = new double[param5];
        ((kl) this).field_S = new double[param5];
        for (var13 = 0; var13 < param5; var13++) {
            ((kl) this).field_P[var13] = 255;
            var14 = (int)Math.pow(4.0, (double)var13 / (double)param5 + 1.0);
            ((kl) this).field_K[var13] = var14;
        }
        for (var13 = 0; 27 > var13; var13++) {
            ((kl) this).field_L[var13] = (int)(2048.0 * Math.random());
            ((kl) this).field_F[var13] = (int)(64.99 * Math.random()) - 32;
        }
        if (param7) {
            param0.field_a = (kl) this;
        }
    }

    final void a(pm param0, int param1) {
        if (param1 >= -81) {
            ((kl) this).field_O = null;
        }
    }

    final void a(hm param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            ((kl) this).a((pm) null, 92);
        }
    }

    final void a(int param0, vg param1) {
        if (param0 != -1) {
            ((kl) this).field_T = null;
        }
    }

    final void a(int param0, int param1) {
        if (((kl) this).field_z) {
            ((kl) this).field_J.field_t = null;
        }
        if (param0 != 11878) {
            Object var4 = null;
            ((kl) this).a((pm) null, 28);
        }
        ((kl) this).field_N = ((kl) this).field_N + 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Service unavailable";
    }
}
