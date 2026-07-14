/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        ((ug) this).field_Q[param2] = (int)(0.5 + 2097152.0 * Math.pow((double)param0, 0.00054931640625 * (double)param1));
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        lp var6 = null;
        int var7 = 0;
        Object var8 = null;
        lp var9 = null;
        var7 = DungeonAssault.field_K;
        var9 = ((ug) this).field_u[param2][param1];
        if (var9 == null) {
          return;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              var8 = null;
              ((ug) this).b((int[]) null, -89, 102);
              break L0;
            }
          }
          L1: {
            ((ug) this).field_u[param2][param1] = null;
            if ((((ug) this).field_G[param2] & 2) == 0) {
              var9.field_r = 0;
              break L1;
            } else {
              var6 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var6.field_p != var9.field_p) {
                      break L3;
                    } else {
                      if ((var6.field_r ^ -1) <= -1) {
                        break L3;
                      } else {
                        if (var6 == var9) {
                          break L3;
                        } else {
                          var9.field_r = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    final synchronized void a(vh param0, int param1, boolean param2) {
        this.a(true, -16257, param0, param2);
        if (param1 != 20938) {
            Object var5 = null;
            String discarded$0 = ug.a(false, 34, (CharSequence) null);
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
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                ((ug) this).field_r[param2][var4] = null;
            }
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = DungeonAssault.field_K;
        if (param1) {
            ((ug) this).field_Q = null;
        }
        lp var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
        while (var3 != null) {
            if (-1 >= (param0 ^ -1)) {
                // if_icmpeq L62
            } else {
                if (!(null == var3.field_v)) {
                    var3.field_v.f(vn.field_t / 100);
                    if (var3.field_v.e()) {
                        ((ug) this).field_R.field_o.b((qb) (Object) var3.field_v);
                    }
                    var3.b(!param1 ? true : false);
                }
                if (-1 < (var3.field_r ^ -1)) {
                    ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                }
                var3.a(param1);
            }
            var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
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
        if (param0 >= -54) {
            ((ug) this).field_N = null;
        }
        this.a((byte) 114, param1, param2);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 62) {
            this.f(-63, 116);
        }
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

    private final void d(boolean param0, int param1) {
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
        if (param1 != 16) {
            Object var5 = null;
            boolean discarded$0 = ((ug) this).a((lp) null, 42);
        }
        int var6 = 0;
        var3 = var6;
        while (var6 < 16) {
            ((ug) this).field_K[var6] = nb.a(((ug) this).field_J[var6], -128);
            var6++;
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
          var5 = 109 / ((57 - param1) / 44);
          if (0 == (2 & ((ug) this).field_G[param3])) {
            break L0;
          } else {
            var6 = (lp) (Object) ((ug) this).field_R.field_q.d(-14205);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if ((var6.field_p ^ -1) != (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (var6.field_r >= 0) {
                      break L2;
                    } else {
                      ((ug) this).field_u[param3][var6.field_y] = null;
                      ((ug) this).field_u[param3][param2] = var6;
                      var7_int = var6.field_s - -(var6.field_w * var6.field_J >> -2049184180);
                      var6.field_s = var6.field_s + (param2 - var6.field_y << 87126856);
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
              var8.field_t = 1024 + var11.field_m[param2] * var12.field_j * (param0 * param0) >> 437537835;
              var8.field_i = var11.field_p[param2] & 255;
              var8.field_s = (param2 << 1510794408) + -(32767 & var11.field_r[param2]);
              var8.field_r = -1;
              var8.field_j = 0;
              var8.field_u = 0;
              var8.field_k = 0;
              var8.field_l = 0;
              if (0 == ((ug) this).field_o[param3]) {
                var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8, 0), this.a(var8, false));
                break L3;
              } else {
                L4: {
                  var8.field_v = ni.a(var7, this.a((byte) 46, var8), 0, this.a(var8, false));
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
              if (-1 >= (var11.field_r[param2] ^ -1)) {
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
                    if (-1 >= (var9.field_r ^ -1)) {
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
        if (!((((ug) this).field_G[param0] & 4 ^ -1) == -1)) {
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
        if (!(param0.field_v != null)) {
            if (0 <= param0.field_r) {
                param0.a(false);
                if (param0.field_D > 0) {
                    if (param0 == ((ug) this).field_r[param0.field_p][param0.field_D]) {
                        ((ug) this).field_r[param0.field_p][param0.field_D] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        if (param1 != -16257) {
            ((ug) this).field_r = null;
        }
        return false;
    }

    private final void a(boolean param0, int param1, int param2) {
        ((ug) this).field_B[param2] = param1;
        if (param0) {
            int discarded$0 = ug.a(false, 29);
        }
    }

    private final synchronized void c(boolean param0, int param1) {
        ((ug) this).field_A.c();
        if (param1 <= 27) {
            return;
        }
        ((ug) this).field_S = null;
        this.d(param0, 16);
    }

    private final int a(byte param0, lp param1) {
        int var3 = 0;
        of var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        Object var9 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (param1.field_J * param1.field_w >> 1304504076) + param1.field_s;
          var3 = var3 + ((-8192 + ((ug) this).field_B[param1.field_p]) * ((ug) this).field_I[param1.field_p] >> -393744788);
          if (param0 > 2) {
            break L0;
          } else {
            var9 = null;
            ((ug) this).b((int[]) null, 108, -85);
            break L0;
          }
        }
        L1: {
          var4 = param1.field_A;
          if ((var4.field_i ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              if (var4.field_h > 0) {
                break L2;
              } else {
                if (-1 <= (((ug) this).field_U[param1.field_p] ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = var4.field_h << -1402346078;
              var6 = var4.field_a << 1930747233;
              if ((param1.field_G ^ -1) > (var6 ^ -1)) {
                var5 = param1.field_G * var5 / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((ug) this).field_U[param1.field_p] >> -480773785);
            var7 = Math.sin((double)(param1.field_E & 511) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)((double)(256 * param1.field_I.field_n) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)vn.field_t + 0.5);
          if ((var5 ^ -1) > -2) {
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = var5;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        return stackIn_13_0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param1 >= 0) {
            ((ug) this).field_V[param1] = param0;
        } else {
            for (var4 = 0; -17 < (var4 ^ -1); var4++) {
                ((ug) this).field_V[var4] = param0;
            }
        }
        var4 = 54 / ((-2 - param2) / 60);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (!((ug) this).field_A.g()) {
            break L0;
          } else {
            var4 = ((ug) this).field_A.field_c * ((ug) this).field_x / vn.field_t;
            L1: while (true) {
              var5 = ((ug) this).field_z - -((long)param2 * (long)var4);
              if (((ug) this).field_F - var5 >= 0L) {
                ((ug) this).field_z = var5;
                break L0;
              } else {
                var7 = (int)(((long)var4 + ((ug) this).field_F - ((ug) this).field_z + -1L) / (long)var4);
                ((ug) this).field_z = ((ug) this).field_z + (long)var4 * (long)var7;
                ((ug) this).field_R.b(param0, param1, var7);
                this.a((byte) -24);
                param1 = param1 + var7;
                param2 = param2 - var7;
                if (!((ug) this).field_A.g()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((ug) this).field_R.b(param0, param1, param2);
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
              this.e(param0, param1 + 0);
              param0++;
              continue L0;
            }
          }
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        String var3 = cm.a(param0, -125, param2);
        if (var3 != null) {
            return var3;
        }
        for (var4 = 0; var4 < param2.length(); var4++) {
            if (!(rp.a(param2.charAt(var4), (byte) -120))) {
                return me.field_a;
            }
        }
        if (param1 <= -39) {
            return null;
        }
        return null;
    }

    final synchronized qb d() {
        return (qb) (Object) ((ug) this).field_R;
    }

    final synchronized void c(byte param0, int param1, int param2) {
        this.b((byte) -87, param1, param2);
        int var4 = -56 % ((param0 - -57) / 43);
    }

    private final synchronized void a(boolean param0, int param1, vh param2, boolean param3) {
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        this.c(param0, param1 + 16353);
        ((ug) this).field_A.a(param2.field_i);
        ((ug) this).field_z = 0L;
        if (param1 != -16257) {
            Object var8 = null;
            ((ug) this).a((vh) null, -111, false);
        }
        ((ug) this).field_T = param3 ? true : false;
        int var5 = ((ug) this).field_A.a();
        for (var6 = 0; var5 > var6; var6++) {
            ((ug) this).field_A.d(var6);
            ((ug) this).field_A.b(var6);
            ((ug) this).field_A.a(var6);
        }
        ((ug) this).field_p = ((ug) this).field_A.b();
        ((ug) this).field_t = ((ug) this).field_A.field_d[((ug) this).field_p];
        ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
    }

    final synchronized qb c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        int var4 = DungeonAssault.field_K;
        lp var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
        while (var3 != null) {
            if (-1 >= (param1 ^ -1)) {
                // if_icmpeq L51
            } else {
                if (-1 < (var3.field_r ^ -1)) {
                    ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                    var3.field_r = 0;
                }
            }
            var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
        }
        if (!param0) {
            ((ug) this).field_x = 27;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 != 24509) {
            return;
        }
        ((ug) this).field_L = param0;
    }

    public static void e(int param0) {
        field_E = null;
        field_y = null;
        field_M = null;
        if (param0 != 0) {
            int discarded$0 = ug.a(true, -75);
        }
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
          if (param0 == -24) {
            break L0;
          } else {
            ((ug) this).field_V = null;
            break L0;
          }
        }
        L1: {
          var2 = ((ug) this).field_p;
          var3 = ((ug) this).field_t;
          var4 = ((ug) this).field_F;
          if (((ug) this).field_S == null) {
            break L1;
          } else {
            if (((ug) this).field_v != var3) {
              break L1;
            } else {
              this.a(((ug) this).field_D, -16257, ((ug) this).field_S, ((ug) this).field_T);
              this.a((byte) -24);
              return;
            }
          }
        }
        L2: while (true) {
          if ((((ug) this).field_t ^ -1) != (var3 ^ -1)) {
            L3: {
              ((ug) this).field_t = var3;
              ((ug) this).field_F = var4;
              ((ug) this).field_p = var2;
              if (null == ((ug) this).field_S) {
                break L3;
              } else {
                if (var3 <= ((ug) this).field_v) {
                  break L3;
                } else {
                  ((ug) this).field_p = -1;
                  ((ug) this).field_t = ((ug) this).field_v;
                  ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (((ug) this).field_A.field_d[var2] != var3) {
                  break L5;
                } else {
                  ((ug) this).field_A.d(var2);
                  var6 = ((ug) this).field_A.c(var2);
                  if (1 != var6) {
                    L6: {
                      if (-1 != (128 & var6 ^ -1)) {
                        this.a(var6, 16384);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((ug) this).field_A.b(var2);
                    ((ug) this).field_A.a(var2);
                    continue L4;
                  } else {
                    ((ug) this).field_A.e();
                    ((ug) this).field_A.a(var2);
                    if (!((ug) this).field_A.f()) {
                      break L5;
                    } else {
                      if (null == ((ug) this).field_S) {
                        L7: {
                          if (!((ug) this).field_T) {
                            break L7;
                          } else {
                            if (0 != var3) {
                              ((ug) this).field_A.a(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.d(true, 16);
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
              continue L2;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, lp param3, int[] param4) {
        int var6 = 0;
        of var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = DungeonAssault.field_K;
          param3.field_H = vn.field_t / 100;
          if (-1 < (param3.field_r ^ -1)) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_v) {
                break L1;
              } else {
                if (param3.field_v.f()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.b(true);
              param3.a(false);
              if (-1 <= (param3.field_D ^ -1)) {
                break L2;
              } else {
                if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                  ((ug) this).field_r[param3.field_p][param3.field_D] = null;
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
          var6 = param3.field_w;
          if (0 < var6) {
            L4: {
              var6 = var6 - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((ug) this).field_s[param3.field_p]) * 16.0 + 0.5);
              if (-1 >= (var6 ^ -1)) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param3.field_w = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param3.field_v.g(this.a((byte) 119, param3));
          var7 = param3.field_A;
          param3.field_E = param3.field_E + var7.field_i;
          var8 = 0;
          param3.field_G = param3.field_G + 1;
          var9 = (double)((param3.field_J * param3.field_w >> -74208788) + (-60 + param3.field_y << -1507399608)) * 0.000005086263020833333;
          if (0 >= var7.field_c) {
            break L5;
          } else {
            L6: {
              if (0 < var7.field_b) {
                param3.field_k = param3.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                break L6;
              } else {
                param3.field_k = param3.field_k + 128;
                break L6;
              }
            }
            if (819200 > param3.field_k * var7.field_c) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (var7.field_n == null) {
            break L7;
          } else {
            L8: {
              if (var7.field_e > 0) {
                param3.field_u = param3.field_u + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
                break L8;
              } else {
                param3.field_u = param3.field_u + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (param3.field_l >= var7.field_n.length - 2) {
                  break L10;
                } else {
                  if ((param3.field_u ^ -1) >= ((var7.field_n[param3.field_l - -2] & 255) << -1048706744 ^ -1)) {
                    break L10;
                  } else {
                    param3.field_l = param3.field_l + 2;
                    continue L9;
                  }
                }
              }
              if (var7.field_n.length - 2 != param3.field_l) {
                break L7;
              } else {
                if (var7.field_n[1 + param3.field_l] != 0) {
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
          if (-1 < (param3.field_r ^ -1)) {
            break L11;
          } else {
            if (null == var7.field_o) {
              break L11;
            } else {
              if ((1 & ((ug) this).field_G[param3.field_p]) != 0) {
                break L11;
              } else {
                L12: {
                  if ((param3.field_D ^ -1) > -1) {
                    break L12;
                  } else {
                    if (((ug) this).field_r[param3.field_p][param3.field_D] != param3) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (0 < var7.field_m) {
                    param3.field_r = param3.field_r + (int)(Math.pow(2.0, var9 * (double)var7.field_m) * 128.0 + 0.5);
                    break L13;
                  } else {
                    param3.field_r = param3.field_r + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if ((var7.field_o.length - 2 ^ -1) >= (param3.field_j ^ -1)) {
                      break L15;
                    } else {
                      if (((var7.field_o[param3.field_j - -2] & 255) << -1263441464 ^ -1) <= (param3.field_r ^ -1)) {
                        break L15;
                      } else {
                        param3.field_j = param3.field_j + 2;
                        continue L14;
                      }
                    }
                  }
                  if ((param3.field_j ^ -1) == (var7.field_o.length + -2 ^ -1)) {
                    var8 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
          }
        }
        var11 = -89 % ((param0 - -80) / 44);
        if (var8 != 0) {
          L16: {
            param3.field_v.f(param3.field_H);
            if (param4 == null) {
              param3.field_v.a(param2);
              break L16;
            } else {
              param3.field_v.b(param4, param1, param2);
              break L16;
            }
          }
          L17: {
            if (!param3.field_v.e()) {
              break L17;
            } else {
              ((ug) this).field_R.field_o.b((qb) (Object) param3.field_v);
              break L17;
            }
          }
          L18: {
            param3.b(true);
            if (param3.field_r < 0) {
              break L18;
            } else {
              param3.a(false);
              if (0 >= param3.field_D) {
                break L18;
              } else {
                if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                  ((ug) this).field_r[param3.field_p][param3.field_D] = null;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
          }
          return true;
        } else {
          param3.field_v.a(param3.field_H, this.b(param3, 0), this.a(param3, false));
          return false;
        }
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
        if ((var3 ^ -1) != -129) {
          if ((var3 ^ -1) != -145) {
            if (-161 == (var3 ^ -1)) {
              var4 = param0 & 15;
              var5 = (param0 & 32616) >> -441246840;
              var6 = param0 >> -934978256 & 127;
              this.a(var5, var6, var4, 73);
              return;
            } else {
              if (176 == var3) {
                L0: {
                  var4 = 15 & param0;
                  var5 = param0 >> 920555240 & 127;
                  var6 = (param0 & 8364021) >> 1906167408;
                  if (0 == var5) {
                    ((ug) this).field_K[var4] = (var6 << 837209358) + nb.a(((ug) this).field_K[var4], -2080769);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (32 != var5) {
                    break L1;
                  } else {
                    ((ug) this).field_K[var4] = (var6 << -400930393) + nb.a(((ug) this).field_K[var4], -16257);
                    break L1;
                  }
                }
                L2: {
                  if (1 != var5) {
                    break L2;
                  } else {
                    ((ug) this).field_U[var4] = (var6 << 1889208487) + nb.a(((ug) this).field_U[var4], -16257);
                    break L2;
                  }
                }
                L3: {
                  if (-34 == (var5 ^ -1)) {
                    ((ug) this).field_U[var4] = nb.a(-128, ((ug) this).field_U[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var5 ^ -1) != -6) {
                    break L4;
                  } else {
                    ((ug) this).field_s[var4] = (var6 << -1005307801) + nb.a(((ug) this).field_s[var4], -16257);
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
                  if ((var5 ^ -1) == -8) {
                    ((ug) this).field_q[var4] = (var6 << -701083449) + nb.a(((ug) this).field_q[var4], -16257);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-40 == (var5 ^ -1)) {
                    ((ug) this).field_q[var4] = nb.a(-128, ((ug) this).field_q[var4]) - -var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-11 == (var5 ^ -1)) {
                    ((ug) this).field_n[var4] = (var6 << -503820953) + nb.a(((ug) this).field_n[var4], -16257);
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
                    ((ug) this).field_m[var4] = (var6 << -960643065) + nb.a(((ug) this).field_m[var4], -16257);
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
                    if (-65 < (var6 ^ -1)) {
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
                    ((ug) this).field_N[var4] = (var6 << -983617305) + nb.a(127, ((ug) this).field_N[var4]);
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
                  if (-102 == (var5 ^ -1)) {
                    ((ug) this).field_N[var4] = (var6 << -1451847545) + 16384 - -nb.a(((ug) this).field_N[var4], 127);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (-101 != (var5 ^ -1)) {
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
                    if (-16385 != (var7 ^ -1)) {
                      break L21;
                    } else {
                      ((ug) this).field_I[var4] = nb.a(-16257, ((ug) this).field_I[var4]) + (var6 << 1439700103);
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
                  if (-17 == (var5 ^ -1)) {
                    ((ug) this).field_o[var4] = nb.a(-16257, ((ug) this).field_o[var4]) + (var6 << 23190535);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-49 == (var5 ^ -1)) {
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
                      this.f(var4, param1 ^ 16418);
                      ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -5);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((var5 ^ -1) == -18) {
                    this.a(2, (-16257 & ((ug) this).field_O[var4]) + (var6 << 1133207975), var4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (-50 == (var5 ^ -1)) {
                    this.a(2, var6 + (((ug) this).field_O[var4] & -128), var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if ((var3 ^ -1) == -193) {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 527765672;
                  this.a((byte) 106, ((ug) this).field_K[var4] + var5, var4);
                  return;
                } else {
                  L28: {
                    if (param1 == 16384) {
                      break L28;
                    } else {
                      ((ug) this).field_m = null;
                      break L28;
                    }
                  }
                  if ((var3 ^ -1) != -209) {
                    if (224 == var3) {
                      var4 = param0 & 15;
                      var5 = (param0 >> 427745577 & 16256) + ((32761 & param0) >> 1532984104);
                      this.a(false, var5, var4);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 == 255) {
                        this.d(true, 16);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 295606440;
                    this.a(var5, (byte) 78, var4);
                    return;
                  }
                }
              }
            }
          } else {
            var4 = param0 & 15;
            var5 = param0 >> 194301640 & 127;
            var6 = (param0 & 8385741) >> 1207982832;
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
          var5 = (32667 & param0) >> -895345400;
          var6 = (8372321 & param0) >> -458272624;
          this.a(true, var5, var4, var6);
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          if (65536L > (long)param1) {
            if (256L <= (long)param1) {
              if ((long)param1 < 4096L) {
                if ((long)param1 < 1024L) {
                  return lc.field_h[param1 >> 302826466] >> -1126087221;
                } else {
                  return lc.field_h[param1 >> 1041245092] >> 1926292682;
                }
              } else {
                if ((long)param1 >= 16384L) {
                  return lc.field_h[param1 >> 960380328] >> 1977364200;
                } else {
                  return lc.field_h[param1 >> 195908710] >> -961943799;
                }
              }
            } else {
              if ((param1 ^ -1) > -1) {
                return -1;
              } else {
                return lc.field_h[param1] >> 1033422348;
              }
            }
          } else {
            if (((long)param1 ^ -1L) > -16777217L) {
              if (-1048577L < ((long)param1 ^ -1L)) {
                if (((long)param1 ^ -1L) > -262145L) {
                  return lc.field_h[param1 >> -1339337302] >> -930371193;
                } else {
                  return lc.field_h[param1 >> -1816909716] >> 1703478534;
                }
              } else {
                if ((long)param1 < 4194304L) {
                  return lc.field_h[param1 >> 826135758] >> 1320719301;
                } else {
                  return lc.field_h[param1 >> 1798204208] >> 2105270884;
                }
              }
            } else {
              if (-268435457L < ((long)param1 ^ -1L)) {
                if (-67108865L >= ((long)param1 ^ -1L)) {
                  return lc.field_h[param1 >> 513142900] >> -1241490750;
                } else {
                  return lc.field_h[param1 >> -1509973038] >> -1348626845;
                }
              } else {
                if (-1073741825L < ((long)param1 ^ -1L)) {
                  return lc.field_h[param1 >> -1278419722] >> -1576437087;
                } else {
                  return lc.field_h[param1 >> 759036184];
                }
              }
            }
          }
        } else {
          return 34;
        }
    }

    private final int a(lp param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            int discarded$0 = this.b((lp) null, 45);
        }
        int var3 = ((ug) this).field_n[param0.field_p];
        if (-8193 < (var3 ^ -1)) {
            return 32 + var3 * param0.field_i >> -1763752794;
        }
        return -((-param0.field_i + 128) * (-var3 + 16384) + 32 >> -310870714) + 16384;
    }

    private final void d(int param0, int param1) {
        lp var3 = null;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param1 != (((ug) this).field_G[param0] & 2 ^ -1)) {
            var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if ((param0 ^ -1) != (var3.field_p ^ -1)) {
                    break L2;
                  } else {
                    if (((ug) this).field_u[param0][var3.field_y] == null) {
                      if (-1 >= (var3.field_r ^ -1)) {
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
                if ((((ug) this).field_F + -var3 ^ -1L) <= -1L) {
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
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        mk var8 = null;
        int var9 = 0;
        kk var10 = null;
        kk var10_ref = null;
        int var11 = 0;
        L0: {
          var11 = DungeonAssault.field_K;
          param4.a();
          if (!param0) {
            break L0;
          } else {
            ((ug) this).field_u = null;
            break L0;
          }
        }
        L1: {
          var6 = 1;
          var7 = null;
          if ((param3 ^ -1) < -1) {
            var7_array = new int[]{param3};
            break L1;
          } else {
            break L1;
          }
        }
        var8 = (mk) (Object) param4.field_j.a(true);
        L2: while (true) {
          if (var8 == null) {
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                param4.b();
                break L3;
              }
            }
            return var6 != 0;
          } else {
            L4: {
              L5: {
                var9 = (int)var8.field_h;
                var10 = (kk) (Object) ((ug) this).field_W.a((long)var9, 8);
                if (var10 != null) {
                  break L5;
                } else {
                  var10_ref = dl.a((byte) 110, var9, param2);
                  if (var10_ref == null) {
                    var6 = 0;
                    break L4;
                  } else {
                    ((ug) this).field_W.a((ne) (Object) var10_ref, 12460, (long)var9);
                    break L5;
                  }
                }
              }
              if (!var10_ref.a((byte) 45, param1, var7_array, var8.field_k)) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            var8 = (mk) (Object) param4.field_j.a(4318);
            continue L2;
          }
        }
    }

    private final int b(lp param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!((((ug) this).field_V[param0.field_p] ^ -1) != -1)) {
            return 0;
        }
        of var9 = param0.field_A;
        of var10 = var9;
        int var4 = 4096 + ((ug) this).field_q[param0.field_p] * ((ug) this).field_m[param0.field_p] >> 943240237;
        var4 = var4 * var4 + 16384 >> -2050112401;
        var4 = 16384 + var4 * param0.field_t >> 1701060655;
        var4 = var4 * ((ug) this).field_L - -128 >> -1912563480;
        var4 = ((ug) this).field_V[param0.field_p] * var4 + 128 >> 1121079720;
        if (var10.field_c > 0) {
            var4 = (int)(Math.pow(0.5, (double)param0.field_k * 0.00001953125 * (double)var10.field_c) * (double)var4 + 0.5);
        }
        if (null != var10.field_n) {
            var5 = param0.field_u;
            var6 = var10.field_n[param0.field_l + 1];
            if (!(param0.field_l >= var10.field_n.length + -2)) {
                var7 = 65280 & var9.field_n[param0.field_l] << 622465704;
                var8 = (255 & var10.field_n[2 + param0.field_l]) << 1593804776;
                var6 = var6 + (-var6 + var10.field_n[3 + param0.field_l]) * (-var7 + var5) / (var8 + -var7);
            }
            var4 = var6 * var4 + 32 >> 1069653030;
        }
        if (param1 < param0.field_r) {
            if (null != var10.field_o) {
                var5 = param0.field_r;
                var6 = var10.field_o[1 + param0.field_j];
                if ((param0.field_j ^ -1) > (-2 + var10.field_o.length ^ -1)) {
                    var7 = (255 & var9.field_o[param0.field_j]) << -169855512;
                    var8 = (var10.field_o[param0.field_j - -2] & 255) << -1547970168;
                    var6 = var6 + (-var7 + var5) * (-var6 + var10.field_o[param0.field_j - -3]) / (var8 + -var7);
                }
                var4 = var4 * var6 + 32 >> 1613877446;
            }
        }
        return var4;
    }

    final void a(lp param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          L1: {
            var4 = param0.field_I.field_k.length;
            if (!param2) {
              break L1;
            } else {
              if (!param0.field_I.field_j) {
                break L1;
              } else {
                var6 = -param0.field_I.field_l + var4 + var4;
                var5 = (int)((long)var6 * (long)((ug) this).field_o[param0.field_p] >> -1917788474);
                var4 = var4 << 8;
                if (var5 >= var4) {
                  param0.field_v.b(true);
                  var5 = var4 + var4 + -1 + -var5;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)var4 * (long)((ug) this).field_o[param0.field_p] >> -846751738);
          break L0;
        }
        L2: {
          param0.field_v.i(var5);
          if (param1 == 4917) {
            break L2;
          } else {
            var7 = null;
            boolean discarded$1 = ((ug) this).a(false, (lc) null, (nh) null, 98, (vh) null);
            break L2;
          }
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
        this.d(true, 16);
    }

    ug(ug param0) {
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
        ((ug) this).field_W = param0.field_W;
        ((ug) this).a(256, -1, (byte) -63);
        this.d(true, 16);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = rb.b(0, 0, 64);
        field_w = new fd(2);
        field_M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};
    }
}
