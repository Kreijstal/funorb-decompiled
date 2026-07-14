/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends sn {
    private int[] field_v;
    int[] field_B;
    private int field_z;
    private int[] field_W;
    private pe[][] field_u;
    private int[] field_E;
    private int[] field_O;
    private int[] field_C;
    private int[] field_w;
    static boolean field_S;
    private jl field_G;
    private int[] field_F;
    private int[] field_y;
    private int[] field_Q;
    static cr field_t;
    private int[] field_R;
    private int[] field_T;
    private qd field_I;
    private pe[][] field_L;
    private int[] field_U;
    int[] field_N;
    private int field_A;
    int[] field_H;
    private int[] field_X;
    private long field_r;
    private rq field_P;
    private int field_J;
    private int field_s;
    private long field_D;
    private boolean field_V;
    private si field_x;
    private boolean field_K;
    private int field_M;

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 4294) {
            this.b(69, -54);
        }
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 != -128) {
            ((db) this).a(81, -81, (byte) 98);
        }
        if (param0) {
            this.c(false, -1);
        } else {
            this.b((byte) 5, -1);
        }
        this.e((byte) 19, -1);
        for (var3 = 0; 16 > var3; var3++) {
            ((db) this).field_O[var3] = ((db) this).field_R[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            ((db) this).field_C[var5] = b.a(-128, ((db) this).field_R[var5]);
            var5++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != -12) {
            ((db) this).field_y = null;
        }
    }

    private final synchronized void a(boolean param0, si param1, boolean param2, int param3) {
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        this.b(param0, 8192);
        ((db) this).field_I.a(param1.field_n);
        ((db) this).field_V = param2 ? true : false;
        ((db) this).field_r = 0L;
        int var5 = ((db) this).field_I.c();
        if (param3 > -54) {
            ((db) this).field_A = -73;
        }
        for (var6 = 0; var5 > var6; var6++) {
            ((db) this).field_I.a(var6);
            ((db) this).field_I.e(var6);
            ((db) this).field_I.d(var6);
        }
        ((db) this).field_s = ((db) this).field_I.a();
        ((db) this).field_J = ((db) this).field_I.field_b[((db) this).field_s];
        ((db) this).field_D = ((db) this).field_I.b(((db) this).field_J);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!(((db) this).field_O[param2] == param1)) {
            ((db) this).field_O[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((db) this).field_L[param2][var4] = null;
            }
        }
        var4 = 38 / ((param0 - 39) / 58);
    }

    private final int a(pe param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(((db) this).field_T[param0.field_q] != 0)) {
            return 0;
        }
        gl var9 = param0.field_p;
        gl var10 = var9;
        int var4 = ((db) this).field_v[param0.field_q] * ((db) this).field_F[param0.field_q] + 4096 >> 903374221;
        var4 = var4 * var4 - -16384 >> 1905415311;
        var4 = 16384 + var4 * param0.field_F >> 1119340047;
        var4 = ((db) this).field_z * var4 + 128 >> 2137175752;
        var4 = ((db) this).field_T[param0.field_q] * var4 + 128 >> -1104759800;
        if (!(0 >= var10.field_n)) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var10.field_n * ((double)param0.field_v * 0.00001953125)));
        }
        if (var10.field_e != null) {
            var5 = param0.field_G;
            var6 = var10.field_e[param0.field_x + 1];
            if (!(-2 + var10.field_e.length <= param0.field_x)) {
                var7 = (255 & var9.field_e[param0.field_x]) << 1109045608;
                var8 = var10.field_e[param0.field_x + 2] << -366173304 & 65280;
                var6 = var6 + (var10.field_e[3 + param0.field_x] + -var6) * (-var7 + var5) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> -75362170;
        }
        if (param0.field_E > 0) {
            if (var10.field_g != null) {
                var5 = param0.field_E;
                var6 = var10.field_g[1 + param0.field_D];
                if (param0.field_D < var10.field_g.length - 2) {
                    var7 = (var9.field_g[param0.field_D] & 255) << 169761352;
                    var8 = (255 & var10.field_g[param0.field_D - -2]) << -1437194072;
                    var6 = var6 + (var5 + -var7) * (var10.field_g[3 + param0.field_D] + -var6) / (-var7 + var8);
                }
                var4 = var4 * var6 + 32 >> 1734733862;
            }
        }
        if (param1 != 93) {
            this.b(-26, 26, 17, 93);
        }
        return var4;
    }

    private final void c(boolean param0, int param1) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
            return;
        }
        pe var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
        while (var3 != null) {
            if ((param1 ^ -1) <= -1) {
                // if_icmpne L161
            }
            if (!(var3.field_J == null)) {
                var3.field_J.h(dd.field_u / 100);
                if (!(!var3.field_J.l())) {
                    ((db) this).field_P.field_z.a((sn) (Object) var3.field_J);
                }
                var3.a(-117);
            }
            if ((var3.field_E ^ -1) > -1) {
                ((db) this).field_u[var3.field_q][var3.field_B] = null;
            }
            var3.c(2);
            var3 = (pe) (Object) ((db) this).field_P.field_w.b(29);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        er var5 = new er(param2, param1);
        int[] var6 = bi.field_l;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        var5.d();
        bi.f(param3, 0, param2, param1, 12, 5921370);
        bi.f(4, 4, param2 - 8, -8 + param1, 8, 0);
        bi.a(var6, var7, var8);
        var5.e(param0, param4);
    }

    final static void a(boolean param0, int param1, byte param2, si param3, boolean param4, int param5) {
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = (Object) (Object) ri.field_r;
                    // monitorenter ri.field_r
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = 50 / ((param2 - -61) / 62);
                        if (fo.field_e == param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var6
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        fo.field_e = param3;
                        if (fo.field_e != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qc.field_v.a(param5, param1, true, param4, param0, fo.field_e);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var6
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var8;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(byte param0, int param1) {
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          L0: {
            ((db) this).field_F[param1] = 12800;
            ((db) this).field_Q[param1] = 8192;
            ((db) this).field_v[param1] = 16383;
            ((db) this).field_W[param1] = 8192;
            ((db) this).field_X[param1] = 0;
            ((db) this).field_U[param1] = 8192;
            this.b(param1, 2);
            this.d((byte) 70, param1);
            ((db) this).field_N[param1] = 0;
            if (param0 >= 4) {
              break L0;
            } else {
              ((db) this).field_C = null;
              break L0;
            }
          }
          ((db) this).field_y[param1] = 32767;
          ((db) this).field_w[param1] = 256;
          ((db) this).field_H[param1] = 0;
          this.b(param1, 8192, 2097152);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.e((byte) 40, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    final synchronized void a(int param0, si param1, boolean param2) {
        this.a(true, param1, param2, -90);
        if (param0 > -13) {
            ((db) this).field_P = null;
        }
    }

    public static void f(int param0) {
        field_t = null;
        int var1 = 79 / ((-81 - param0) / 38);
    }

    final boolean a(int param0, pe param1, int param2, int[] param3, byte param4) {
        int var6 = 0;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          param1.field_H = dd.field_u / 100;
          if (0 > param1.field_E) {
            break L0;
          } else {
            L1: {
              if (null == param1.field_J) {
                break L1;
              } else {
                if (param1.field_J.j()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param1.a(-110);
              param1.c(2);
              if ((param1.field_I ^ -1) >= -1) {
                break L2;
              } else {
                if (param1 == ((db) this).field_L[param1.field_q][param1.field_I]) {
                  ((db) this).field_L[param1.field_q][param1.field_I] = null;
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
          var6 = param1.field_w;
          if (-1 <= (var6 ^ -1)) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((db) this).field_U[param1.field_q]) * 16.0 + 0.5);
              if (var6 < 0) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param1.field_w = var6;
            break L3;
          }
        }
        L5: {
          param1.field_J.e(this.a((byte) -84, param1));
          var7 = param1.field_p;
          param1.field_s = param1.field_s + 1;
          param1.field_n = param1.field_n + var7.field_b;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param1.field_B << -817174328) - -(param1.field_y * param1.field_w >> 67088524));
          if (-1 > (var7.field_n ^ -1)) {
            L6: {
              if (var7.field_f <= 0) {
                param1.field_v = param1.field_v + 128;
                break L6;
              } else {
                param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_f));
                break L6;
              }
            }
            if (-819201 < param1.field_v * var7.field_n) {
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
          if (var7.field_e == null) {
            break L7;
          } else {
            L8: {
              if (-1 >= var7.field_h) {
                param1.field_G = param1.field_G + 128;
                break L8;
              } else {
                param1.field_G = param1.field_G + (int)(Math.pow(2.0, (double)var7.field_h * var9) * 128.0 + 0.5);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (var7.field_e.length - 2 <= param1.field_x) {
                  break L10;
                } else {
                  if ((65280 & var7.field_e[2 + param1.field_x] << -1987970392) >= param1.field_G) {
                    break L10;
                  } else {
                    param1.field_x = param1.field_x + 2;
                    continue L9;
                  }
                }
              }
              if (var7.field_e.length + -2 != param1.field_x) {
                break L7;
              } else {
                if (0 == var7.field_e[1 + param1.field_x]) {
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
          if (-1 < param1.field_E) {
            break L11;
          } else {
            if (var7.field_g == null) {
              break L11;
            } else {
              if (-1 != (1 & ((db) this).field_N[param1.field_q])) {
                break L11;
              } else {
                L12: {
                  if (0 > param1.field_I) {
                    break L12;
                  } else {
                    if (param1 == ((db) this).field_L[param1.field_q][param1.field_I]) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 >= var7.field_j) {
                    param1.field_E = param1.field_E + 128;
                    break L13;
                  } else {
                    param1.field_E = param1.field_E + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param1.field_D >= var7.field_g.length - 2) {
                      break L15;
                    } else {
                      if (param1.field_E <= (255 & var7.field_g[2 + param1.field_D]) << 1811139464) {
                        break L15;
                      } else {
                        param1.field_D = param1.field_D + 2;
                        continue L14;
                      }
                    }
                  }
                  if (var7.field_g.length - 2 == param1.field_D) {
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
        if (var8 == 0) {
          L16: {
            param1.field_J.a(param1.field_H, this.a(param1, (byte) 93), this.a(param1, 32));
            if (param4 >= 104) {
              break L16;
            } else {
              ((db) this).c((byte) 78, -39);
              break L16;
            }
          }
          return false;
        } else {
          L17: {
            param1.field_J.h(param1.field_H);
            if (param3 == null) {
              param1.field_J.a(param2);
              break L17;
            } else {
              param1.field_J.b(param3, param0, param2);
              break L17;
            }
          }
          L18: {
            if (param1.field_J.l()) {
              ((db) this).field_P.field_z.a((sn) (Object) param1.field_J);
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            param1.a(-117);
            if (0 <= param1.field_E) {
              param1.c(2);
              if (param1.field_I <= 0) {
                break L19;
              } else {
                if (param1 != ((db) this).field_L[param1.field_q][param1.field_I]) {
                  break L19;
                } else {
                  ((db) this).field_L[param1.field_q][param1.field_I] = null;
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

    final synchronized void a(int param0, boolean param1, int param2) {
        this.c(-128, param2, param0);
        if (!param1) {
            db.f(-103);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param2 == -61) {
            break L0;
          } else {
            var6 = null;
            ((db) this).a((pe) null, (byte) -35, true);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            ((db) this).field_T[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (16 <= var4) {
                break L1;
              } else {
                ((db) this).field_T[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final static String h(int param0) {
        if (!(qc.field_A >= param0)) {
            return ap.field_g;
        }
        if (null != qc.field_B) {
            if (!(qc.field_B.b(0))) {
                return eb.field_a;
            }
            return bq.field_A;
        }
        if (!(ke.field_b.b(0))) {
            return ib.field_b;
        }
        if (!(ke.field_b.c("commonui", 0))) {
            return me.field_b + " - " + ke.field_b.a("commonui", 0) + "%";
        }
        if (!(la.field_e.b(0))) {
            return vc.field_a;
        }
        if (!la.field_e.c("commonui", param0 + -2)) {
            return vd.field_c + " - " + la.field_e.a("commonui", 0) + "%";
        }
        if (!kb.field_b.b(0)) {
            return vj.field_a;
        }
        if (!kb.field_b.a((byte) -112)) {
            return dk.field_n + " - " + kb.field_b.d(-1) + "%";
        }
        return b.field_f;
    }

    private final void b(int param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!((param1 & ((db) this).field_N[param0]) == 0)) {
            var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var3 != null) {
                if (param0 == var3.field_q) {
                    if (((db) this).field_u[param0][var3.field_B] == null) {
                        if (var3.field_E < 0) {
                            var3.field_E = 0;
                        }
                    }
                }
                var3 = (pe) (Object) ((db) this).field_P.field_w.b(77);
            }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          if (!((db) this).field_I.f()) {
            break L0;
          } else {
            var2 = ((db) this).field_I.field_c * ((db) this).field_A / dd.field_u;
            L1: while (true) {
              var3 = (long)var2 * (long)param0 + ((db) this).field_r;
              if (0L > -var3 + ((db) this).field_D) {
                var5 = (int)(((long)var2 + (((db) this).field_D + (-((db) this).field_r - 1L))) / (long)var2);
                ((db) this).field_r = ((db) this).field_r + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((db) this).field_P.a(var5);
                this.e(-29482);
                if (!((db) this).field_I.f()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((db) this).field_r = var3;
                break L0;
              }
            }
          }
        }
        ((db) this).field_P.a(param0);
    }

    final boolean a(int param0, pe param1) {
        if (param0 != -1) {
            ((db) this).field_R = null;
        }
        if (null != param1.field_J) {
            return false;
        }
        if (!(param1.field_E < 0)) {
            param1.c(2);
            if ((param1.field_I ^ -1) < -1) {
                if (((db) this).field_L[param1.field_q][param1.field_I] == param1) {
                    ((db) this).field_L[param1.field_q][param1.field_I] = null;
                }
            }
        }
        return true;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = param1 & 240;
        if (-129 != (var3 ^ -1)) {
          L0: {
            if (144 == var3) {
              var4 = param1 & 15;
              var5 = param1 >> -1410985784 & 127;
              var6 = (param1 & 8379569) >> 728607696;
              if (0 >= var6) {
                this.a(var5, false, 64, var4);
                return;
              } else {
                this.b(var4, 31423, var6, var5);
                break L0;
              }
            } else {
              L1: {
                if (param0 <= -98) {
                  break L1;
                } else {
                  var9 = null;
                  ((db) this).a((pe) null, (byte) 100, true);
                  break L1;
                }
              }
              if (160 != var3) {
                if (176 != var3) {
                  if (192 == var3) {
                    var4 = 15 & param1;
                    var5 = param1 >> -418192536 & 127;
                    this.a((byte) -29, ((db) this).field_C[var4] + var5, var4);
                    return;
                  } else {
                    if ((var3 ^ -1) != -209) {
                      if (224 == var3) {
                        var4 = 15 & param1;
                        var5 = (127 & param1 >> -826850232) + ((param1 & 8323400) >> 1146828201);
                        this.d(var5, -127, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.d(true, -128);
                          return;
                        }
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = param1 >> 782887144 & 127;
                      this.a(-12, var5, var4);
                      return;
                    }
                  }
                } else {
                  L2: {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> 1505051624;
                    var6 = 127 & param1 >> 357230320;
                    if (-1 == (var5 ^ -1)) {
                      ((db) this).field_C[var4] = (var6 << -1867702578) + b.a(-2080769, ((db) this).field_C[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 == var5) {
                      ((db) this).field_C[var4] = (var6 << -368451833) + b.a(((db) this).field_C[var4], -16257);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -2) {
                      break L4;
                    } else {
                      ((db) this).field_X[var4] = (var6 << 173956615) + b.a(((db) this).field_X[var4], -16257);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) != -34) {
                      break L5;
                    } else {
                      ((db) this).field_X[var4] = b.a(((db) this).field_X[var4], -128) + var6;
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -6) {
                      break L6;
                    } else {
                      ((db) this).field_U[var4] = b.a(((db) this).field_U[var4], -16257) - -(var6 << 92728103);
                      break L6;
                    }
                  }
                  L7: {
                    if (37 == var5) {
                      ((db) this).field_U[var4] = var6 + b.a(-128, ((db) this).field_U[var4]);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 7) {
                      break L8;
                    } else {
                      ((db) this).field_F[var4] = b.a(((db) this).field_F[var4], -16257) - -(var6 << -1764335321);
                      break L8;
                    }
                  }
                  L9: {
                    if (39 == var5) {
                      ((db) this).field_F[var4] = var6 + b.a(((db) this).field_F[var4], -128);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) == -11) {
                      ((db) this).field_Q[var4] = (var6 << -1267203257) + b.a(((db) this).field_Q[var4], -16257);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 == (var5 ^ -1)) {
                      ((db) this).field_Q[var4] = b.a(((db) this).field_Q[var4], -128) - -var6;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) != -12) {
                      break L12;
                    } else {
                      ((db) this).field_v[var4] = b.a(((db) this).field_v[var4], -16257) + (var6 << -728638169);
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 43) {
                      ((db) this).field_v[var4] = b.a(((db) this).field_v[var4], -128) - -var6;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-65 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      if ((var6 ^ -1) > -65) {
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -2);
                        break L14;
                      } else {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 1);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 65) {
                      if (-65 >= (var6 ^ -1)) {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 2);
                        break L15;
                      } else {
                        this.b(var4, 2);
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 == 99) {
                      ((db) this).field_y[var4] = b.a(127, ((db) this).field_y[var4]) - -(var6 << 1436060423);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) != -99) {
                      break L17;
                    } else {
                      ((db) this).field_y[var4] = b.a(16256, ((db) this).field_y[var4]) - -var6;
                      break L17;
                    }
                  }
                  L18: {
                    if (101 != var5) {
                      break L18;
                    } else {
                      ((db) this).field_y[var4] = (var6 << 2039220775) + 16384 - -b.a(127, ((db) this).field_y[var4]);
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      ((db) this).field_y[var4] = var6 + b.a(((db) this).field_y[var4], 16256) + 16384;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 120) {
                      break L20;
                    } else {
                      this.c(false, var4);
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 121) {
                      this.e((byte) 58, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 123) {
                      break L22;
                    } else {
                      this.b((byte) -117, var4);
                      break L22;
                    }
                  }
                  L23: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = ((db) this).field_y[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        ((db) this).field_w[var4] = b.a(-16257, ((db) this).field_w[var4]) + (var6 << 1184442439);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if ((var5 ^ -1) == -39) {
                      var7 = ((db) this).field_y[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L24;
                      } else {
                        ((db) this).field_w[var4] = b.a(-128, ((db) this).field_w[var4]) + var6;
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (16 != var5) {
                      break L25;
                    } else {
                      ((db) this).field_H[var4] = (var6 << -1408391705) + b.a(-16257, ((db) this).field_H[var4]);
                      break L25;
                    }
                  }
                  L26: {
                    if (-49 != var5) {
                      break L26;
                    } else {
                      ((db) this).field_H[var4] = b.a(((db) this).field_H[var4], -128) - -var6;
                      break L26;
                    }
                  }
                  L27: {
                    if (-82 == var5) {
                      if (var6 < 64) {
                        this.d((byte) 70, var4);
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -5);
                        break L27;
                      } else {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (var5 == 17) {
                      this.b(var4, (var6 << 1359580359) + (-16257 & ((db) this).field_E[var4]), 2097152);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.b(var4, (-128 & ((db) this).field_E[var4]) - -var6, 2097152);
                    return;
                  }
                }
              } else {
                var4 = 15 & param1;
                var5 = param1 >> 2042846632 & 127;
                var6 = (8382070 & param1) >> 79087344;
                this.a(var5, 4294, var6, var4);
                return;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = (32626 & param1) >> 1827788008;
          var6 = param1 >> -1791129744 & 127;
          this.a(var5, false, var6, var4);
          return;
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        ((db) this).field_I.b();
        ((db) this).field_x = null;
        this.d(param0, -128);
        if (param1 != 8192) {
            ((db) this).field_W = null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pe var5 = null;
        int var6_int = 0;
        ae var6 = null;
        pe var7 = null;
        pe var8 = null;
        int var9 = 0;
        al var10 = null;
        al var11 = null;
        Object stackIn_18_0 = null;
        pe stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        pe stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackIn_20_0 = null;
        pe stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        Object stackOut_17_0 = null;
        pe stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_19_0 = null;
        pe stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        Object stackOut_18_0 = null;
        pe stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          this.a(param3, false, 64, param0);
          if ((((db) this).field_N[param0] & 2) != 0) {
            var5 = (pe) (Object) ((db) this).field_P.field_w.c((byte) -65);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_q) {
                    break L2;
                  } else {
                    if ((var5.field_E ^ -1) <= -1) {
                      break L2;
                    } else {
                      ((db) this).field_u[param0][var5.field_B] = null;
                      ((db) this).field_u[param0][param3] = var5;
                      var6_int = (var5.field_w * var5.field_y >> 1826122316) + var5.field_A;
                      var5.field_A = var5.field_A + (param3 + -var5.field_B << 1848715176);
                      var5.field_y = var6_int - var5.field_A;
                      var5.field_w = 4096;
                      var5.field_B = param3;
                      return;
                    }
                  }
                }
                var5 = (pe) (Object) ((db) this).field_P.field_w.b(false);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (al) (Object) ((db) this).field_G.a((long)((db) this).field_O[param0], (byte) 64);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          L3: {
            if (param1 == 31423) {
              break L3;
            } else {
              ((db) this).field_y = null;
              break L3;
            }
          }
          var6 = var10.field_r[param3];
          if (var6 != null) {
            L4: {
              var7 = new pe();
              var7.field_z = var6;
              var7.field_K = var11;
              var7.field_q = param0;
              var7.field_p = var10.field_v[param3];
              var7.field_I = var10.field_q[param3];
              var7.field_B = param3;
              var7.field_F = 1024 + var11.field_w * (param2 * param2 * var10.field_p[param3]) >> -1246310677;
              var7.field_C = 255 & var10.field_B[param3];
              var7.field_A = -(32767 & var10.field_n[param3]) + (param3 << 1385588104);
              var7.field_G = 0;
              var7.field_E = -1;
              var7.field_x = 0;
              var7.field_v = 0;
              var7.field_D = 0;
              if (0 != ((db) this).field_H[param0]) {
                L5: {
                  var7.field_J = ra.a(var6, this.a((byte) -81, var7), 0, this.a(var7, 32));
                  stackOut_17_0 = this;
                  stackOut_17_1 = (pe) var7;
                  stackOut_17_2 = 124;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  if ((var11.field_n[param3] ^ -1) <= -1) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = (pe) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (pe) (Object) stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    break L5;
                  }
                }
                ((db) this).a(stackIn_20_1, (byte) stackIn_20_2, stackIn_20_3 != 0);
                break L4;
              } else {
                var7.field_J = ra.a(var6, this.a((byte) -127, var7), this.a(var7, (byte) 93), this.a(var7, param1 ^ 31391));
                break L4;
              }
            }
            L6: {
              if (0 <= var11.field_n[param3]) {
                break L6;
              } else {
                var7.field_J.i(-1);
                break L6;
              }
            }
            L7: {
              if ((var7.field_I ^ -1) <= -1) {
                L8: {
                  var8 = ((db) this).field_L[param0][var7.field_I];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (var8.field_E < 0) {
                      ((db) this).field_u[param0][var8.field_B] = null;
                      var8.field_E = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                ((db) this).field_L[param0][var7.field_I] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            ((db) this).field_P.field_w.a((li) (Object) var7, false);
            ((db) this).field_u[param0][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pe var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        pe var8 = ((db) this).field_u[param3][param0];
        if (var8 == null) {
            return;
        }
        ((db) this).field_u[param3][param0] = null;
        if ((2 & ((db) this).field_N[param3]) == 0) {
            var8.field_E = 0;
        } else {
            var6 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var6 != null) {
                if (var8.field_q == var6.field_q) {
                    if ((var6.field_E ^ -1) > -1) {
                        if (var8 != var6) {
                            var8.field_E = 0;
                            break;
                        }
                    }
                }
                var6 = (pe) (Object) ((db) this).field_P.field_w.b(76);
            }
        }
        if (param1) {
            ((db) this).field_v = null;
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((db) this).field_E[param0] = param1;
        ((db) this).field_B[param0] = (int)(0.5 + (double)param2 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final int a(byte param0, pe param1) {
        int var3 = 0;
        gl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param1.field_A - -(param1.field_w * param1.field_y >> 1218723436);
          var3 = var3 + ((((db) this).field_W[param1.field_q] + -8192) * ((db) this).field_w[param1.field_q] >> -920461684);
          var4 = param1.field_p;
          if (param0 <= -44) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          if (var4.field_b <= 0) {
            break L1;
          } else {
            L2: {
              if (var4.field_c > 0) {
                break L2;
              } else {
                if (((db) this).field_X[param1.field_q] <= 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = var4.field_c << 1325910018;
              var6 = var4.field_d << -427942175;
              if (param1.field_s < var6) {
                var5 = param1.field_s * var5 / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((db) this).field_X[param1.field_q] >> 2083043047);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_n & 511));
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(param1.field_z.field_r * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)dd.field_u);
          if (-2 < (var5 ^ -1)) {
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

    final synchronized int d() {
        return 0;
    }

    private final int a(pe param0, int param1) {
        if (param1 != 32) {
            this.b((byte) 25, -27);
        }
        int var3 = ((db) this).field_Q[param0.field_q];
        if (-8193 < (var3 ^ -1)) {
            return 32 + var3 * param0.field_C >> -276241786;
        }
        return 16384 - ((128 - param0.field_C) * (16384 + -var3) + 32 >> 1229925606);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (((db) this).field_I.f()) {
            var4 = ((db) this).field_I.field_c * ((db) this).field_A / dd.field_u;
            L1: while (true) {
              L2: {
                var5 = ((db) this).field_r - -((long)var4 * (long)param2);
                if (-1L >= (((db) this).field_D + -var5 ^ -1L)) {
                  ((db) this).field_r = var5;
                  break L2;
                } else {
                  var7 = (int)((-1L + ((db) this).field_D - ((db) this).field_r - -(long)var4) / (long)var4);
                  ((db) this).field_r = ((db) this).field_r + (long)var4 * (long)var7;
                  ((db) this).field_P.b(param0, param1, var7);
                  this.e(-29482);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (!((db) this).field_I.f()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((db) this).field_P.b(param0, param1, param2);
              break L0;
            }
          } else {
            ((db) this).field_P.b(param0, param1, param2);
            break L0;
          }
        }
    }

    final synchronized sn c() {
        return (sn) (Object) ((db) this).field_P;
    }

    private final synchronized void a(int param0, int param1, boolean param2, boolean param3, boolean param4, si param5) {
        if (!param2) {
            Object var9 = null;
            boolean discarded$0 = ((db) this).a(42, (pe) null);
        }
        if (!(((db) this).field_I.f())) {
            ((db) this).a(-124, param5, param3);
            return;
        }
        ((db) this).field_K = param4 ? true : false;
        ((db) this).field_V = param3 ? true : false;
        ((db) this).field_x = param5;
        int var7 = ((db) this).field_I.a(((db) this).field_r) * param0;
        int var8 = param1 * ((db) this).field_I.field_c;
        var7 = var8 * ((-1 + var7 + var8) / var8);
        ((db) this).field_M = (var7 - -(param0 >> 592637057)) / param0;
    }

    private final void d(int param0, int param1, int param2) {
        ((db) this).field_W[param2] = param0;
        if (param1 > -125) {
            ((db) this).field_L = null;
        }
    }

    final synchronized sn a() {
        return null;
    }

    private final void b(byte param0, int param1) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        pe var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
        int var4 = -81 % ((-66 - param0) / 48);
        while (var3 != null) {
            if (0 <= param1) {
                // if_icmpeq L56
            } else {
                if (!((var3.field_E ^ -1) <= -1)) {
                    ((db) this).field_u[var3.field_q][var3.field_B] = null;
                    var3.field_E = 0;
                }
            }
            var3 = (pe) (Object) ((db) this).field_P.field_w.b(92);
        }
    }

    private final void d(byte param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!((4 & ((db) this).field_N[param1]) == 0)) {
            var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var3 != null) {
                if (!(param1 != var3.field_q)) {
                    var3.field_o = 0;
                }
                var3 = (pe) (Object) ((db) this).field_P.field_w.b(86);
            }
        }
        if (param0 != 70) {
            Object var5 = null;
            ((db) this).b((int[]) null, -84, -49);
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -82) {
            Object var4 = null;
            ((db) this).a(-7, (si) null, false);
        }
        ((db) this).field_z = param1;
    }

    final void a(pe param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param1 >= 55) {
            break L0;
          } else {
            ((db) this).field_V = false;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param0.field_z.field_s.length;
            if (!param2) {
              break L2;
            } else {
              if (!param0.field_z.field_p) {
                break L2;
              } else {
                var6 = var4 + (var4 + -param0.field_z.field_o);
                var4 = var4 << 8;
                var5 = (int)((long)((db) this).field_H[param0.field_q] * (long)var6 >> -383867514);
                if (var4 <= var5) {
                  param0.field_J.a(true);
                  var5 = -var5 + (var4 - -var4 - 1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)var4 * (long)((db) this).field_H[param0.field_q] >> -2145891514);
          break L1;
        }
        param0.field_J.f(var5);
    }

    final synchronized void c(byte param0, int param1) {
        if (param0 < 43) {
            this.b((byte) 77, -41);
        }
        ((db) this).field_A = param1;
    }

    final synchronized boolean g(int param0) {
        if (param0 != -26083) {
            ((db) this).field_w = null;
        }
        return ((db) this).field_I.f();
    }

    private final void c(int param0, int param1, int param2) {
        ((db) this).field_R[param2] = param1;
        ((db) this).field_C[param2] = b.a(param1, param0);
        this.a((byte) -47, param1, param2);
    }

    final synchronized void a(boolean param0) {
        this.b(param0, 8192);
    }

    final synchronized boolean a(int param0, id param1, si param2, r param3, byte param4) {
        int[] var7_array = null;
        int var10 = 0;
        al var13 = null;
        al var14 = null;
        int var12 = Vertigo2.field_L ? 1 : 0;
        param2.b();
        int var6 = 1;
        Object var7 = null;
        int var8 = -4 % ((-2 - param4) / 50);
        if (!(param0 <= 0)) {
            var7_array = new int[]{param0};
        }
        ph var9 = (ph) (Object) param2.field_o.b(0);
        while (var9 != null) {
            var10 = (int)var9.field_k;
            var13 = (al) (Object) ((db) this).field_G.a((long)var10, (byte) 64);
            if (var13 != null) {
                // ifeq L179
            } else {
                var14 = ap.a(var10, param3, -125);
                if (var14 == null) {
                    var6 = 0;
                } else {
                    ((db) this).field_G.a((li) (Object) var14, (long)var10, false);
                    if (!(var14.a(0, var9.field_n, param1, var7_array))) {
                        var6 = 0;
                    }
                }
            }
            var9 = (ph) (Object) param2.field_o.c(-28);
        }
        if (var6 != 0) {
            param2.a();
        }
        return var6 != 0;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -29482) {
          L0: {
            var2 = ((db) this).field_s;
            var3 = ((db) this).field_J;
            var4 = ((db) this).field_D;
            if (((db) this).field_x == null) {
              break L0;
            } else {
              if (((db) this).field_M == var3) {
                this.a(((db) this).field_K, ((db) this).field_x, ((db) this).field_V, -126);
                this.e(-29482);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: while (true) {
            if (var3 != ((db) this).field_J) {
              L2: {
                ((db) this).field_J = var3;
                ((db) this).field_D = var4;
                ((db) this).field_s = var2;
                if (((db) this).field_x == null) {
                  break L2;
                } else {
                  if (((db) this).field_M >= var3) {
                    break L2;
                  } else {
                    ((db) this).field_J = ((db) this).field_M;
                    ((db) this).field_s = -1;
                    ((db) this).field_D = ((db) this).field_I.b(((db) this).field_J);
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if (((db) this).field_I.field_b[var2] != var3) {
                    break L4;
                  } else {
                    ((db) this).field_I.a(var2);
                    var6 = ((db) this).field_I.c(var2);
                    if (-2 == (var6 ^ -1)) {
                      ((db) this).field_I.d();
                      ((db) this).field_I.d(var2);
                      if (!((db) this).field_I.e()) {
                        break L4;
                      } else {
                        if (null == ((db) this).field_x) {
                          L5: {
                            if (!((db) this).field_V) {
                              break L5;
                            } else {
                              if (0 != var3) {
                                ((db) this).field_I.b(var4);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.d(true, -128);
                          ((db) this).field_I.b();
                          return;
                        } else {
                          ((db) this).a(-69, ((db) this).field_x, ((db) this).field_V);
                          this.e(param0 + 0);
                          return;
                        }
                      }
                    } else {
                      L6: {
                        if (-1 == (var6 & 128 ^ -1)) {
                          break L6;
                        } else {
                          this.a((byte) -101, var6);
                          break L6;
                        }
                      }
                      ((db) this).field_I.e(var2);
                      ((db) this).field_I.d(var2);
                      continue L3;
                    }
                  }
                }
                var2 = ((db) this).field_I.a();
                var3 = ((db) this).field_I.field_b[var2];
                var4 = ((db) this).field_I.b(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public db() {
        ((db) this).field_z = 256;
        ((db) this).field_u = new pe[16][128];
        ((db) this).field_O = new int[16];
        ((db) this).field_E = new int[16];
        ((db) this).field_v = new int[16];
        ((db) this).field_W = new int[16];
        ((db) this).field_F = new int[16];
        ((db) this).field_R = new int[16];
        ((db) this).field_y = new int[16];
        ((db) this).field_B = new int[16];
        ((db) this).field_C = new int[16];
        ((db) this).field_A = 1000000;
        ((db) this).field_w = new int[16];
        ((db) this).field_T = new int[16];
        ((db) this).field_U = new int[16];
        ((db) this).field_X = new int[16];
        ((db) this).field_N = new int[16];
        ((db) this).field_Q = new int[16];
        ((db) this).field_L = new pe[16][128];
        ((db) this).field_H = new int[16];
        ((db) this).field_I = new qd();
        ((db) this).field_P = new rq((db) this);
        ((db) this).field_G = new jl(128);
        ((db) this).a(256, -1, (byte) -61);
        this.d(true, -128);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = true;
    }
}
