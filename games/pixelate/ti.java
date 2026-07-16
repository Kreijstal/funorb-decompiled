/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends sj {
    int[] field_o;
    private int[] field_H;
    private int[] field_p;
    private nl field_F;
    private int[] field_L;
    private in[][] field_P;
    private int[] field_q;
    static ak field_E;
    private int[] field_M;
    private int[] field_Q;
    private int[] field_r;
    private int[] field_K;
    int[] field_x;
    private int field_v;
    private int[] field_y;
    static int field_t;
    private int[] field_S;
    int[] field_I;
    private int[] field_R;
    private in[][] field_G;
    private sg field_T;
    private int[] field_V;
    private int[] field_u;
    private int field_C;
    private boolean field_z;
    private int field_B;
    private long field_w;
    private int field_U;
    private long field_J;
    private km field_N;
    private boolean field_s;
    private int field_O;
    private ua field_D;

    private final void b(int param0, int param1, int param2) {
        if (param2 != 1000000) {
            ((ti) this).g(-41);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Pixelate.field_H ? 1 : 0;
            if (((ti) this).field_T.f()) {
              var4 = ((ti) this).field_T.field_i * ((ti) this).field_C / mm.field_h;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((ti) this).field_w;
                if (0L <= ((ti) this).field_J + -var5) {
                  ((ti) this).field_w = var5;
                  break L1;
                } else {
                  var7 = (int)(((long)var4 + (-((ti) this).field_w + ((ti) this).field_J + -1L)) / (long)var4);
                  ((ti) this).field_w = ((ti) this).field_w + (long)var4 * (long)var7;
                  ((ti) this).field_N.b(param0, param1, var7);
                  param1 = param1 + var7;
                  this.f(-111);
                  param2 = param2 - var7;
                  if (((ti) this).field_T.f()) {
                    continue L2;
                  } else {
                    ((ti) this).field_N.b(param0, param1, param2);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((ti) this).field_N.b(param0, param1, param2);
          break L0;
        }
    }

    final synchronized void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            sj discarded$2 = ((ti) this).b();
            break L0;
          }
        }
        L1: {
          if (param2 >= 0) {
            ((ti) this).field_S[param2] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (16 <= var4) {
                break L1;
              } else {
                ((ti) this).field_S[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final boolean c(in param0, byte param1) {
        if (param1 != 75) {
            return false;
        }
        if (null != param0.field_G) {
            return false;
        }
        if (!((param0.field_v ^ -1) > -1)) {
            param0.c(param1 ^ 2704);
            if (-1 > (param0.field_y ^ -1)) {
                if (!(param0 != ((ti) this).field_P[param0.field_I][param0.field_y])) {
                    ((ti) this).field_P[param0.field_I][param0.field_y] = null;
                }
            }
        }
        return true;
    }

    private final void a(byte param0, int param1) {
        in var3 = null;
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 > 66) {
            break L0;
          } else {
            ((ti) this).field_z = false;
            break L0;
          }
        }
        var3 = (in) (Object) ((ti) this).field_N.field_r.c(1504642273);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (0 > param1) {
                  break L3;
                } else {
                  if (param1 == var3.field_I) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (0 <= var3.field_v) {
                break L2;
              } else {
                ((ti) this).field_G[var3.field_I][var3.field_A] = null;
                var3.field_v = 0;
                break L2;
              }
            }
            var3 = (in) (Object) ((ti) this).field_N.field_r.f(1504642273);
            continue L1;
          }
        }
    }

    private final void a(int param0, int param1) {
        in var3 = null;
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            sj discarded$2 = ((ti) this).b();
            break L0;
          }
        }
        var3 = (in) (Object) ((ti) this).field_N.field_r.c(1504642273);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if ((var3.field_I ^ -1) != (param0 ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var3.field_G != null) {
                  L5: {
                    var3.field_G.e(mm.field_h / 100);
                    if (var3.field_G.k()) {
                      ((ti) this).field_N.field_o.a((sj) (Object) var3.field_G);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.a(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (-1 < (var3.field_v ^ -1)) {
                  ((ti) this).field_G[var3.field_I][var3.field_A] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.c(2779);
              break L2;
            }
            var3 = (in) (Object) ((ti) this).field_N.field_r.f(param1 + 1504642273);
            continue L1;
          }
        }
    }

    final synchronized boolean a(ua param0, po param1, fm param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        qn var8 = null;
        int var9 = 0;
        int var11 = 0;
        sn var12 = null;
        sn var13 = null;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          param0.a();
          var6 = 1;
          var7 = null;
          if (-1 <= (param4 ^ -1)) {
            break L0;
          } else {
            var7 = (Object) (Object) new int[]{param4};
            break L0;
          }
        }
        var8 = (qn) (Object) param0.field_l.a((byte) -109);
        L1: while (true) {
          if (var8 == null) {
            if (param3 > 52) {
              L2: {
                if (var6 == 0) {
                  break L2;
                } else {
                  param0.b();
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              return true;
            }
          } else {
            L3: {
              L4: {
                var9 = (int)var8.field_e;
                var12 = (sn) (Object) ((ti) this).field_F.a(-25484, (long)var9);
                if (var12 == null) {
                  var13 = od.a(param2, var9, -30805);
                  if (var13 != null) {
                    ((ti) this).field_F.a((long)var9, 124, (fa) (Object) var13);
                    if (!var13.a(param1, (int[]) var7, (byte) -52, var8.field_r)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  } else {
                    var6 = 0;
                    break L3;
                  }
                } else {
                  if (!var12.a(param1, (int[]) var7, (byte) -52, var8.field_r)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = 0;
              break L3;
            }
            var8 = (qn) (Object) param0.field_l.a(-119);
            continue L1;
          }
        }
    }

    private final int a(int param0, in param1) {
        int var3 = 0;
        un var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param1.field_r + (param1.field_k * param1.field_z >> -2003551188);
          if (param0 == -2003551188) {
            break L0;
          } else {
            ((ti) this).field_M = null;
            break L0;
          }
        }
        L1: {
          var3 = var3 + (((ti) this).field_L[param1.field_I] * (((ti) this).field_u[param1.field_I] - 8192) >> 2132397516);
          var4 = param1.field_q;
          if (0 >= var4.field_g) {
            break L1;
          } else {
            L2: {
              if ((var4.field_a ^ -1) < -1) {
                break L2;
              } else {
                if ((((ti) this).field_r[param1.field_I] ^ -1) < -1) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_a << -1298777374;
              var6 = var4.field_m << 1264194529;
              if ((var6 ^ -1) < (param1.field_H ^ -1)) {
                var5 = param1.field_H * var5 / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((ti) this).field_r[param1.field_I] >> -393157337);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_u));
            var3 = var3 + (int)((double)var5 * var7);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(param1.field_F.field_o * 256) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)mm.field_h);
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

    private final void d(int param0, int param1, int param2) {
        ((ti) this).field_u[param1] = param0;
        if (param2 != -102) {
            ((ti) this).field_u = null;
        }
    }

    final static void a(int param0, String param1, String param2, byte param3, int param4, String param5) {
        if (param3 > -18) {
            return;
        }
        aa var6 = new aa(param4, param2, param0, param1, param5);
        vd.a(false, var6);
    }

    private final void a(int param0, int param1, int param2) {
        ((ti) this).field_V[param2] = param0;
        if (param1 != 4200) {
            ((ti) this).field_q = null;
        }
        ((ti) this).field_K[param2] = cm.a(-128, param0);
        this.a(param0, false, param2);
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param1) {
            this.a(-1, 0);
        } else {
            this.a((byte) 110, -1);
        }
        this.b((byte) -67, -1);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            ((ti) this).field_y[var3] = ((ti) this).field_V[var3];
        }
        if (param0 <= 71) {
            Object var5 = null;
            boolean discarded$0 = ((ti) this).a((ua) null, (po) null, (fm) null, -121, -8);
        }
        int var6 = 0;
        var3 = var6;
        while (-17 < (var6 ^ -1)) {
            ((ti) this).field_K[var6] = cm.a(((ti) this).field_V[var6], -128);
            var6++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        in var5 = null;
        sp var6 = null;
        int var6_int = 0;
        in var7 = null;
        in var8 = null;
        int var9 = 0;
        Object var10 = null;
        sn var11 = null;
        sn var12 = null;
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
          var9 = Pixelate.field_H ? 1 : 0;
          this.a(param1, 64, param0, (byte) 114);
          if (-1 == (((ti) this).field_x[param0] & 2 ^ -1)) {
            break L0;
          } else {
            var5 = (in) (Object) ((ti) this).field_N.field_r.g(1504642273);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_I != param0) {
                    break L2;
                  } else {
                    if (0 <= var5.field_v) {
                      break L2;
                    } else {
                      ((ti) this).field_G[param0][var5.field_A] = null;
                      ((ti) this).field_G[param0][param1] = var5;
                      var6_int = (var5.field_z * var5.field_k >> 329579820) + var5.field_r;
                      var5.field_r = var5.field_r + (param1 - var5.field_A << 1562885864);
                      var5.field_z = 4096;
                      var5.field_k = var6_int + -var5.field_r;
                      var5.field_A = param1;
                      return;
                    }
                  }
                }
                var5 = (in) (Object) ((ti) this).field_N.field_r.j(0);
                continue L1;
              }
            }
          }
        }
        var11 = (sn) (Object) ((ti) this).field_F.a(-25484, (long)((ti) this).field_y[param0]);
        var12 = var11;
        if (var12 != null) {
          var6 = var11.field_n[param1];
          if (var6 != null) {
            L3: {
              var7 = new in();
              var7.field_F = var6;
              var7.field_x = var12;
              var7.field_I = param0;
              var7.field_q = var11.field_l[param1];
              var7.field_y = var11.field_p[param1];
              var7.field_A = param1;
              var7.field_D = 1024 + var11.field_t[param1] * (param3 * param3) * var12.field_v >> 1986845771;
              var7.field_C = 255 & var11.field_o[param1];
              var7.field_r = -(var11.field_u[param1] & 32767) + (param1 << -125759384);
              var7.field_w = 0;
              var7.field_o = 0;
              var7.field_v = -1;
              var7.field_l = 0;
              var7.field_m = 0;
              if ((((ti) this).field_o[param0] ^ -1) != -1) {
                L4: {
                  var7.field_G = pp.a(var6, this.a(-2003551188, var7), 0, this.b(var7, (byte) -109));
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if ((var12.field_u[param1] ^ -1) <= -1) {
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
                ((ti) this).a(stackIn_16_1 != 0, (byte) 118, var7);
                break L3;
              } else {
                var7.field_G = pp.a(var6, this.a(-2003551188, var7), this.a(var7, (byte) -123), this.b(var7, (byte) 96));
                break L3;
              }
            }
            L5: {
              if ((var12.field_u[param1] ^ -1) > -1) {
                var7.field_G.g(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 > var7.field_y) {
                break L6;
              } else {
                L7: {
                  var8 = ((ti) this).field_P[param0][var7.field_y];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (0 > var8.field_v) {
                      ((ti) this).field_G[param0][var8.field_A] = null;
                      var8.field_v = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((ti) this).field_P[param0][var7.field_y] = var7;
                break L6;
              }
            }
            L8: {
              ((ti) this).field_N.field_r.a(22125, (fa) (Object) var7);
              if (param2 < -21) {
                break L8;
              } else {
                var10 = null;
                boolean discarded$1 = ((ti) this).a((ua) null, (po) null, (fm) null, 79, -76);
                break L8;
              }
            }
            ((ti) this).field_G[param0][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 45) {
          L0: {
            L1: {
              if (param1 < 48) {
                break L1;
              } else {
                if (param1 > 57) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final synchronized sj b() {
        return (sj) (Object) ((ti) this).field_N;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (!(param0 == ((ti) this).field_y[param2])) {
            ((ti) this).field_y[param2] = param0;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                ((ti) this).field_P[param2][var4] = null;
            }
        }
        if (param1) {
            this.a(79, 96);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= 106) {
            ((ti) this).field_G = null;
        }
    }

    final void a(boolean param0, byte param1, in param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 118) {
          L0: {
            L1: {
              var4 = param2.field_F.field_n.length;
              if (!param0) {
                break L1;
              } else {
                if (param2.field_F.field_m) {
                  var6 = var4 - -var4 - param2.field_F.field_l;
                  var5 = (int)((long)var6 * (long)((ti) this).field_o[param2.field_I] >> -1140832954);
                  var4 = var4 << 8;
                  if (var5 >= var4) {
                    param2.field_G.a(true);
                    var5 = -var5 + -1 + (var4 + var4);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            var5 = (int)((long)((ti) this).field_o[param2.field_I] * (long)var4 >> -364898426);
            break L0;
          }
          param2.field_G.f(var5);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        jd var1 = (jd) (Object) vc.field_O.b(-88);
        if (!(var1 != null)) {
            var1 = new jd();
        }
        if (param0) {
            boolean discarded$0 = ti.a(-80, 'ￆ');
        }
        var1.a(t.field_k, t.field_a, t.field_d, t.field_e, (byte) -102, t.field_h, t.field_f, t.field_j);
        oj.field_P.a(22125, (fa) (Object) var1);
    }

    final boolean a(int param0, in param1, int param2, boolean param3, int[] param4) {
        int var6 = 0;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          param1.field_E = mm.field_h / 100;
          if (param1.field_v < 0) {
            break L0;
          } else {
            L1: {
              if (null == param1.field_G) {
                break L1;
              } else {
                if (!param1.field_G.h()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param1.a(param3);
              param1.c(2779);
              if ((param1.field_y ^ -1) >= -1) {
                break L2;
              } else {
                if (((ti) this).field_P[param1.field_I][param1.field_y] != param1) {
                  break L2;
                } else {
                  ((ti) this).field_P[param1.field_I][param1.field_y] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param1.field_z;
          if ((var6 ^ -1) < -1) {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((ti) this).field_p[param1.field_I] * 0.0004921259842519685));
              if (var6 < 0) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param1.field_z = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param1.field_G.i(this.a(-2003551188, param1));
          var7 = param1.field_q;
          param1.field_u = param1.field_u + var7.field_g;
          param1.field_H = param1.field_H + 1;
          var8 = param3 ? 1 : 0;
          var9 = (double)((-60 + param1.field_A << -960339576) - -(param1.field_z * param1.field_k >> 841808396)) * 0.000005086263020833333;
          if (0 >= var7.field_e) {
            break L5;
          } else {
            L6: {
              if (var7.field_i <= 0) {
                param1.field_l = param1.field_l + 128;
                break L6;
              } else {
                param1.field_l = param1.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_i * var9) * 128.0);
                break L6;
              }
            }
            if ((param1.field_l * var7.field_e ^ -1) > -819201) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (null == var7.field_b) {
            break L7;
          } else {
            L8: {
              if (0 >= var7.field_f) {
                param1.field_o = param1.field_o + 128;
                break L8;
              } else {
                param1.field_o = param1.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (var7.field_b.length - 2 <= param1.field_w) {
                  break L10;
                } else {
                  if ((param1.field_o ^ -1) >= (65280 & var7.field_b[param1.field_w + 2] << -1128819960 ^ -1)) {
                    break L10;
                  } else {
                    param1.field_w = param1.field_w + 2;
                    continue L9;
                  }
                }
              }
              if ((param1.field_w ^ -1) != (var7.field_b.length - 2 ^ -1)) {
                break L7;
              } else {
                if ((var7.field_b[1 + param1.field_w] ^ -1) == -1) {
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
          if (-1 < (param1.field_v ^ -1)) {
            break L11;
          } else {
            if (null == var7.field_h) {
              break L11;
            } else {
              if (-1 == (1 & ((ti) this).field_x[param1.field_I] ^ -1)) {
                L12: {
                  if (param1.field_y < 0) {
                    break L12;
                  } else {
                    if (((ti) this).field_P[param1.field_I][param1.field_y] != param1) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (var7.field_d > 0) {
                    param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
                    break L13;
                  } else {
                    param1.field_v = param1.field_v + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (var7.field_h.length + -2 <= param1.field_m) {
                      break L15;
                    } else {
                      if ((255 & var7.field_h[param1.field_m - -2]) << 391195688 >= param1.field_v) {
                        break L15;
                      } else {
                        param1.field_m = param1.field_m + 2;
                        continue L14;
                      }
                    }
                  }
                  if (-2 + var7.field_h.length != param1.field_m) {
                    break L11;
                  } else {
                    var8 = 1;
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
        }
        if (var8 != 0) {
          L16: {
            param1.field_G.e(param1.field_E);
            if (param4 == null) {
              param1.field_G.a(param0);
              break L16;
            } else {
              param1.field_G.b(param4, param2, param0);
              break L16;
            }
          }
          L17: {
            if (param1.field_G.k()) {
              ((ti) this).field_N.field_o.a((sj) (Object) param1.field_G);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            param1.a(param3);
            if (param1.field_v >= 0) {
              param1.c(2779);
              if (-1 <= (param1.field_y ^ -1)) {
                break L18;
              } else {
                if (((ti) this).field_P[param1.field_I][param1.field_y] != param1) {
                  break L18;
                } else {
                  ((ti) this).field_P[param1.field_I][param1.field_y] = null;
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          return true;
        } else {
          param1.field_G.a(param1.field_E, this.a(param1, (byte) -113), this.b(param1, (byte) 89));
          return false;
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (-1 < (param1 ^ -1)) {
          param1 = 0;
          L0: while (true) {
            if (-17 >= (param1 ^ -1)) {
              return;
            } else {
              this.b((byte) -112, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          L1: {
            ((ti) this).field_q[param1] = 12800;
            ((ti) this).field_R[param1] = 8192;
            ((ti) this).field_H[param1] = 16383;
            ((ti) this).field_u[param1] = 8192;
            ((ti) this).field_r[param1] = 0;
            ((ti) this).field_p[param1] = 8192;
            if (param0 <= -45) {
              break L1;
            } else {
              this.d(-56, -113);
              break L1;
            }
          }
          this.b(param1, 16383);
          this.a(true, param1);
          ((ti) this).field_x[param1] = 0;
          ((ti) this).field_M[param1] = 32767;
          ((ti) this).field_L[param1] = 256;
          ((ti) this).field_o[param1] = 0;
          this.c(103, 8192, param1);
          return;
        }
    }

    public static void h(int param0) {
        int var1 = -106 % ((34 - param0) / 60);
        field_E = null;
    }

    final synchronized int a() {
        return 0;
    }

    final synchronized void a(ua param0, int param1, boolean param2) {
        this.a(param2, param0, true, 0);
        if (param1 != -39) {
            ((ti) this).e(54);
        }
    }

    final synchronized void c(int param0, int param1) {
        ((ti) this).field_C = param0;
        if (param1 != 274191016) {
            Object var4 = null;
            boolean discarded$0 = ((ti) this).a((ua) null, (po) null, (fm) null, -68, 6);
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        in var6 = null;
        int var7 = 0;
        in var8 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        var8 = ((ti) this).field_G[param2][param0];
        if (var8 == null) {
          return;
        } else {
          ((ti) this).field_G[param2][param0] = null;
          if (param3 > 113) {
            L0: {
              if (0 == (2 & ((ti) this).field_x[param2])) {
                var8.field_v = 0;
                break L0;
              } else {
                var6 = (in) (Object) ((ti) this).field_N.field_r.c(1504642273);
                L1: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    L2: {
                      if (var6.field_I != var8.field_I) {
                        break L2;
                      } else {
                        if (0 <= var6.field_v) {
                          break L2;
                        } else {
                          if (var6 == var8) {
                            break L2;
                          } else {
                            var8.field_v = 0;
                            break L0;
                          }
                        }
                      }
                    }
                    var6 = (in) (Object) ((ti) this).field_N.field_r.f(1504642273);
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
    }

    private final int a(in param0, byte param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (0 == ((ti) this).field_S[param0.field_I]) {
            return 0;
        }
        un var10 = param0.field_q;
        un var11 = var10;
        int var4 = 4096 + ((ti) this).field_H[param0.field_I] * ((ti) this).field_q[param0.field_I] >> 1585190765;
        var4 = var4 * var4 + 16384 >> -254165873;
        var4 = 16384 + var4 * param0.field_D >> -2045598801;
        var4 = 128 + ((ti) this).field_v * var4 >> 1823622248;
        var4 = 128 + var4 * ((ti) this).field_S[param0.field_I] >> -112020056;
        int var5 = 78 % ((-76 - param1) / 35);
        if ((var11.field_e ^ -1) < -1) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_e * ((double)param0.field_l * 0.00001953125)) + 0.5);
        }
        if (!(var11.field_b == null)) {
            var6 = param0.field_o;
            var7 = var11.field_b[param0.field_w - -1];
            if (!(param0.field_w >= -2 + var11.field_b.length)) {
                var8 = var10.field_b[param0.field_w] << -518381464 & 65280;
                var9 = (var11.field_b[param0.field_w - -2] & 255) << 274191016;
                var7 = var7 + (var6 - var8) * (var11.field_b[param0.field_w - -3] + -var7) / (var9 + -var8);
            }
            var4 = 32 + var7 * var4 >> 1244025574;
        }
        if (0 < param0.field_v) {
            if (null != var11.field_h) {
                var6 = param0.field_v;
                var7 = var11.field_h[1 + param0.field_m];
                if ((var11.field_h.length - 2 ^ -1) < (param0.field_m ^ -1)) {
                    var8 = 65280 & var10.field_h[param0.field_m] << 1012719208;
                    var9 = 65280 & var11.field_h[param0.field_m - -2] << 45782568;
                    var7 = var7 + (var6 + -var8) * (var11.field_h[3 + param0.field_m] - var7) / (var9 - var8);
                }
                var4 = var7 * var4 + 32 >> 1060836294;
            }
        }
        return var4;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = ((ti) this).field_U;
          if (param0 <= -105) {
            break L0;
          } else {
            this.b(100, -34);
            break L0;
          }
        }
        L1: {
          var3 = ((ti) this).field_B;
          var4 = ((ti) this).field_J;
          if (null == ((ti) this).field_D) {
            break L1;
          } else {
            if ((((ti) this).field_O ^ -1) == (var3 ^ -1)) {
              this.a(((ti) this).field_z, ((ti) this).field_D, ((ti) this).field_s, 0);
              this.f(-113);
              return;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if ((((ti) this).field_B ^ -1) != (var3 ^ -1)) {
            L3: {
              ((ti) this).field_B = var3;
              ((ti) this).field_U = var2;
              ((ti) this).field_J = var4;
              if (((ti) this).field_D == null) {
                break L3;
              } else {
                if ((((ti) this).field_O ^ -1) <= (var3 ^ -1)) {
                  break L3;
                } else {
                  ((ti) this).field_B = ((ti) this).field_O;
                  ((ti) this).field_U = -1;
                  ((ti) this).field_J = ((ti) this).field_T.f(((ti) this).field_B);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if ((((ti) this).field_T.field_g[var2] ^ -1) != (var3 ^ -1)) {
                  break L5;
                } else {
                  ((ti) this).field_T.c(var2);
                  var6 = ((ti) this).field_T.a(var2);
                  if (1 == var6) {
                    ((ti) this).field_T.e();
                    ((ti) this).field_T.d(var2);
                    if (!((ti) this).field_T.c()) {
                      break L5;
                    } else {
                      if (null == ((ti) this).field_D) {
                        L6: {
                          if (!((ti) this).field_z) {
                            break L6;
                          } else {
                            if (var3 == 0) {
                              break L6;
                            } else {
                              ((ti) this).field_T.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a((byte) 99, true);
                        ((ti) this).field_T.b();
                        return;
                      } else {
                        ((ti) this).a(((ti) this).field_D, -39, ((ti) this).field_z);
                        this.f(-106);
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if ((var6 & 128 ^ -1) == -1) {
                        break L7;
                      } else {
                        this.d(var6, -24232);
                        break L7;
                      }
                    }
                    ((ti) this).field_T.b(var2);
                    ((ti) this).field_T.d(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((ti) this).field_T.a();
              var3 = ((ti) this).field_T.field_g[var2];
              var4 = ((ti) this).field_T.f(var3);
              continue L2;
            }
          }
        }
    }

    private final int b(in param0, byte param1) {
        int var3 = ((ti) this).field_R[param0.field_I];
        int var4 = -18 / ((param1 - -23) / 55);
        if (-8193 >= (var3 ^ -1)) {
            return 16384 - ((16384 - var3) * (-param0.field_C + 128) - -32 >> 1184903046);
        }
        return var3 * param0.field_C - -32 >> 1756136614;
    }

    final synchronized sj d() {
        return null;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          if (!((ti) this).field_T.f()) {
            break L0;
          } else {
            var2 = ((ti) this).field_C * ((ti) this).field_T.field_i / mm.field_h;
            L1: while (true) {
              var3 = (long)var2 * (long)param0 + ((ti) this).field_w;
              if (-var3 + ((ti) this).field_J < 0L) {
                var5 = (int)((-1L + (((ti) this).field_J + -((ti) this).field_w + (long)var2)) / (long)var2);
                ((ti) this).field_w = ((ti) this).field_w + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((ti) this).field_N.a(var5);
                this.f(-123);
                if (!((ti) this).field_T.f()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((ti) this).field_w = var3;
                break L0;
              }
            }
          }
        }
        ((ti) this).field_N.a(param0);
    }

    private final void b(int param0, int param1) {
        in var3 = null;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 == 16383) {
          L0: {
            if (-1 != (2 & ((ti) this).field_x[param0] ^ -1)) {
              var3 = (in) (Object) ((ti) this).field_N.field_r.c(param1 + 1504625890);
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var3.field_I != param0) {
                      break L2;
                    } else {
                      if (((ti) this).field_G[param0][var3.field_A] == null) {
                        if (0 <= var3.field_v) {
                          break L2;
                        } else {
                          var3.field_v = 0;
                          break L2;
                        }
                      } else {
                        var3 = (in) (Object) ((ti) this).field_N.field_r.f(1504642273);
                        continue L1;
                      }
                    }
                  }
                  var3 = (in) (Object) ((ti) this).field_N.field_r.f(1504642273);
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void g(int param0) {
        this.a(125, true);
        int var2 = 127 / ((param0 - 78) / 45);
    }

    private final synchronized void a(boolean param0, ua param1, boolean param2, int param3) {
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        this.a(param3 + 66, param2);
        ((ti) this).field_T.a(param1.field_k);
        ((ti) this).field_w = (long)param3;
        ((ti) this).field_z = param0 ? true : false;
        int var5 = ((ti) this).field_T.d();
        for (var6 = 0; (var6 ^ -1) > (var5 ^ -1); var6++) {
            ((ti) this).field_T.c(var6);
            ((ti) this).field_T.b(var6);
            ((ti) this).field_T.d(var6);
        }
        ((ti) this).field_U = ((ti) this).field_T.a();
        ((ti) this).field_B = ((ti) this).field_T.field_g[((ti) this).field_U];
        ((ti) this).field_J = ((ti) this).field_T.f(((ti) this).field_B);
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        var3 = 240 & param0;
        if ((var3 ^ -1) != -129) {
          if (-145 == (var3 ^ -1)) {
            var4 = param0 & 15;
            var5 = (param0 & 32584) >> 1316617096;
            var6 = (param0 & 8388537) >> -1302578736;
            if (0 >= var6) {
              this.a(var5, 64, var4, (byte) 115);
              return;
            } else {
              this.a(var4, var5, -83, var6);
              return;
            }
          } else {
            if (-161 != (var3 ^ -1)) {
              if ((var3 ^ -1) == -177) {
                L0: {
                  var4 = param0 & 15;
                  var5 = (param0 & 32655) >> 846812872;
                  var6 = (8347431 & param0) >> -1554876208;
                  if (-1 != (var5 ^ -1)) {
                    break L0;
                  } else {
                    ((ti) this).field_K[var4] = cm.a(-2080769, ((ti) this).field_K[var4]) - -(var6 << -1777271378);
                    break L0;
                  }
                }
                L1: {
                  if (var5 != 32) {
                    break L1;
                  } else {
                    ((ti) this).field_K[var4] = cm.a(((ti) this).field_K[var4], -16257) - -(var6 << 580340391);
                    break L1;
                  }
                }
                L2: {
                  if (1 == var5) {
                    ((ti) this).field_r[var4] = cm.a(((ti) this).field_r[var4], -16257) - -(var6 << 622290055);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 33) {
                    ((ti) this).field_r[var4] = var6 + cm.a(-128, ((ti) this).field_r[var4]);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-6 != (var5 ^ -1)) {
                    break L4;
                  } else {
                    ((ti) this).field_p[var4] = cm.a(((ti) this).field_p[var4], -16257) + (var6 << -1382807673);
                    break L4;
                  }
                }
                L5: {
                  if (-38 != (var5 ^ -1)) {
                    break L5;
                  } else {
                    ((ti) this).field_p[var4] = var6 + cm.a(-128, ((ti) this).field_p[var4]);
                    break L5;
                  }
                }
                L6: {
                  if ((var5 ^ -1) == -8) {
                    ((ti) this).field_q[var4] = cm.a(((ti) this).field_q[var4], -16257) + (var6 << 2076048103);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (39 == var5) {
                    ((ti) this).field_q[var4] = var6 + cm.a(-128, ((ti) this).field_q[var4]);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-11 != (var5 ^ -1)) {
                    break L8;
                  } else {
                    ((ti) this).field_R[var4] = (var6 << 1767996071) + cm.a(-16257, ((ti) this).field_R[var4]);
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) == -43) {
                    ((ti) this).field_R[var4] = var6 + cm.a(((ti) this).field_R[var4], -128);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (11 != var5) {
                    break L10;
                  } else {
                    ((ti) this).field_H[var4] = cm.a(((ti) this).field_H[var4], -16257) + (var6 << 9364135);
                    break L10;
                  }
                }
                L11: {
                  if (43 != var5) {
                    break L11;
                  } else {
                    ((ti) this).field_H[var4] = var6 + cm.a(-128, ((ti) this).field_H[var4]);
                    break L11;
                  }
                }
                L12: {
                  if (-65 != (var5 ^ -1)) {
                    break L12;
                  } else {
                    if (64 > var6) {
                      ((ti) this).field_x[var4] = cm.a(((ti) this).field_x[var4], -2);
                      break L12;
                    } else {
                      ((ti) this).field_x[var4] = bq.a(((ti) this).field_x[var4], 1);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (65 != var5) {
                    break L13;
                  } else {
                    if (var6 < 64) {
                      this.b(var4, 16383);
                      ((ti) this).field_x[var4] = cm.a(((ti) this).field_x[var4], -3);
                      break L13;
                    } else {
                      ((ti) this).field_x[var4] = bq.a(((ti) this).field_x[var4], 2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (99 == var5) {
                    ((ti) this).field_M[var4] = (var6 << -977657817) + cm.a(127, ((ti) this).field_M[var4]);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (98 != var5) {
                    break L15;
                  } else {
                    ((ti) this).field_M[var4] = cm.a(16256, ((ti) this).field_M[var4]) + var6;
                    break L15;
                  }
                }
                L16: {
                  if (-102 != (var5 ^ -1)) {
                    break L16;
                  } else {
                    ((ti) this).field_M[var4] = (var6 << 1455856071) + 16384 - -cm.a(((ti) this).field_M[var4], 127);
                    break L16;
                  }
                }
                L17: {
                  if (-101 == (var5 ^ -1)) {
                    ((ti) this).field_M[var4] = var6 + cm.a(16256, ((ti) this).field_M[var4]) + 16384;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if ((var5 ^ -1) != -121) {
                    break L18;
                  } else {
                    this.a(var4, 0);
                    break L18;
                  }
                }
                L19: {
                  if (var5 != 121) {
                    break L19;
                  } else {
                    this.b((byte) -90, var4);
                    break L19;
                  }
                }
                L20: {
                  if (123 != var5) {
                    break L20;
                  } else {
                    this.a((byte) 87, var4);
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 6) {
                    break L21;
                  } else {
                    var7 = ((ti) this).field_M[var4];
                    if ((var7 ^ -1) == -16385) {
                      ((ti) this).field_L[var4] = (var6 << 224228679) + cm.a(((ti) this).field_L[var4], -16257);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if ((var5 ^ -1) != -39) {
                    break L22;
                  } else {
                    var7 = ((ti) this).field_M[var4];
                    if ((var7 ^ -1) == -16385) {
                      ((ti) this).field_L[var4] = var6 + cm.a(((ti) this).field_L[var4], -128);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (16 == var5) {
                    ((ti) this).field_o[var4] = (var6 << 1274133895) + cm.a(-16257, ((ti) this).field_o[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-49 != (var5 ^ -1)) {
                    break L24;
                  } else {
                    ((ti) this).field_o[var4] = var6 + cm.a(-128, ((ti) this).field_o[var4]);
                    break L24;
                  }
                }
                L25: {
                  if (-82 != (var5 ^ -1)) {
                    break L25;
                  } else {
                    if (64 > var6) {
                      this.a(true, var4);
                      ((ti) this).field_x[var4] = cm.a(((ti) this).field_x[var4], -5);
                      break L25;
                    } else {
                      ((ti) this).field_x[var4] = bq.a(((ti) this).field_x[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if ((var5 ^ -1) != -18) {
                    break L26;
                  } else {
                    this.c(124, (((ti) this).field_Q[var4] & -16257) + (var6 << 1676291559), var4);
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.c(72, (-128 & ((ti) this).field_Q[var4]) - -var6, var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if ((var3 ^ -1) == -193) {
                  var4 = 15 & param0;
                  var5 = param0 >> -97668504 & 127;
                  this.a(((ti) this).field_K[var4] + var5, false, var4);
                  return;
                } else {
                  if (-209 == (var3 ^ -1)) {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> -1173246104;
                    this.b(var5, var4, 1000000);
                    return;
                  } else {
                    if (-225 != (var3 ^ -1)) {
                      if (param1 == -24232) {
                        var3 = param0 & 255;
                        if ((var3 ^ -1) == -256) {
                          this.a((byte) 119, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (127 & param0 >> 1172186632) + (16256 & param0 >> -1500697367);
                      this.d(var5, var4, -102);
                      return;
                    }
                  }
                }
              }
            } else {
              var4 = param0 & 15;
              var5 = param0 >> -1842846648 & 127;
              var6 = param0 >> 221268496 & 127;
              this.a((byte) 119, var5, var4, var6);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> 274846856 & 127;
          var6 = 127 & param0 >> 661353200;
          this.a(var5, var6, var4, (byte) 120);
          return;
        }
    }

    final synchronized void a(boolean param0, int param1, int param2) {
        this.a(param2, 4200, param1);
        if (!param0) {
            this.a((byte) 53, 52);
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = -72 % ((param0 - 20) / 61);
        return ((ti) this).field_T.f();
    }

    final synchronized void e(int param0) {
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != -38) {
            ((ti) this).field_x = null;
        }
        sn var4 = (sn) (Object) ((ti) this).field_F.a((byte) -121);
        while (var4 != null) {
            var4.a(false);
            var4 = (sn) (Object) ((ti) this).field_F.a(113);
        }
    }

    private final void a(boolean param0, int param1) {
        in var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (!(0 == (4 & ((ti) this).field_x[param1]))) {
            var3 = (in) (Object) ((ti) this).field_N.field_r.c(1504642273);
            while (var3 != null) {
                if (param1 == var3.field_I) {
                    var3.field_n = 0;
                }
                var3 = (in) (Object) ((ti) this).field_N.field_r.f(1504642273);
            }
        }
        if (!param0) {
            ((ti) this).field_L = null;
        }
    }

    final synchronized void c(byte param0, int param1) {
        ((ti) this).field_v = param1;
        int var3 = -66 / ((-71 - param0) / 55);
    }

    private final synchronized void a(int param0, boolean param1) {
        ((ti) this).field_T.b();
        ((ti) this).field_D = null;
        this.a((byte) 92, param1);
        if (param0 <= 36) {
            this.b((byte) 56, 43);
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((ti) this).field_Q[param2] = param1;
        if (param0 <= 19) {
            return;
        }
        ((ti) this).field_I[param2] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
    }

    public ti() {
        ((ti) this).field_H = new int[16];
        ((ti) this).field_q = new int[16];
        ((ti) this).field_M = new int[16];
        ((ti) this).field_L = new int[16];
        ((ti) this).field_Q = new int[16];
        ((ti) this).field_p = new int[16];
        ((ti) this).field_o = new int[16];
        ((ti) this).field_P = new in[16][128];
        ((ti) this).field_K = new int[16];
        ((ti) this).field_y = new int[16];
        ((ti) this).field_x = new int[16];
        ((ti) this).field_S = new int[16];
        ((ti) this).field_r = new int[16];
        ((ti) this).field_R = new int[16];
        ((ti) this).field_v = 256;
        ((ti) this).field_G = new in[16][128];
        ((ti) this).field_I = new int[16];
        ((ti) this).field_u = new int[16];
        ((ti) this).field_C = 1000000;
        ((ti) this).field_V = new int[16];
        ((ti) this).field_T = new sg();
        ((ti) this).field_N = new km((ti) this);
        ((ti) this).field_F = new nl(128);
        ((ti) this).b(256, false, -1);
        this.a((byte) 126, true);
    }

    ti(ti param0) {
        ((ti) this).field_H = new int[16];
        ((ti) this).field_q = new int[16];
        ((ti) this).field_M = new int[16];
        ((ti) this).field_L = new int[16];
        ((ti) this).field_Q = new int[16];
        ((ti) this).field_p = new int[16];
        ((ti) this).field_o = new int[16];
        ((ti) this).field_P = new in[16][128];
        ((ti) this).field_K = new int[16];
        ((ti) this).field_y = new int[16];
        ((ti) this).field_x = new int[16];
        ((ti) this).field_S = new int[16];
        ((ti) this).field_r = new int[16];
        ((ti) this).field_R = new int[16];
        ((ti) this).field_v = 256;
        ((ti) this).field_G = new in[16][128];
        ((ti) this).field_I = new int[16];
        ((ti) this).field_u = new int[16];
        ((ti) this).field_C = 1000000;
        ((ti) this).field_V = new int[16];
        ((ti) this).field_T = new sg();
        ((ti) this).field_N = new km((ti) this);
        ((ti) this).field_F = param0.field_F;
        ((ti) this).b(256, false, -1);
        this.a((byte) 106, true);
    }

    static {
    }
}
