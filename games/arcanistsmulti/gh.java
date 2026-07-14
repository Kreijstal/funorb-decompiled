/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends sg {
    private int[] field_p;
    private int[] field_R;
    static oc field_D;
    private int[] field_J;
    private int[] field_k;
    private int[] field_q;
    private int[] field_B;
    private o[][] field_A;
    private int field_r;
    private o[][] field_m;
    int[] field_s;
    private int[] field_S;
    private di field_F;
    private en field_N;
    int[] field_Q;
    private int field_v;
    int[] field_H;
    private int[] field_V;
    private int[] field_x;
    private int[] field_n;
    static byte[] field_E;
    static String field_O;
    private int[] field_P;
    private int[] field_I;
    private int[] field_y;
    static oc field_L;
    static int[] field_l;
    static String field_z;
    static String field_o;
    private long field_T;
    private long field_t;
    private hk field_G;
    private int field_U;
    private int field_K;
    private boolean field_u;
    private ha field_C;
    private boolean field_M;
    private int field_w;

    private final void a(int param0, int param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 0) {
            return;
        }
        o var3 = (o) (Object) ((gh) this).field_G.field_l.b(param1 ^ 12623);
        while (var3 != null) {
            if ((param0 ^ -1) <= -1) {
                // if_icmpeq L54
            } else {
                if (!(null == var3.field_n)) {
                    var3.field_n.d(lb.field_r / 100);
                    if (var3.field_n.h()) {
                        ((gh) this).field_G.field_n.b((sg) (Object) var3.field_n);
                    }
                    var3.b(true);
                }
                if (var3.field_y < 0) {
                    ((gh) this).field_A[var3.field_H][var3.field_t] = null;
                }
                var3.a(true);
            }
            var3 = (o) (Object) ((gh) this).field_G.field_l.a(0);
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -66) {
            gh.d((byte) 98);
        }
        ((gh) this).field_v = param0;
    }

    private final void e(int param0, int param1) {
        o var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 118 % ((40 - param1) / 57);
        if ((((gh) this).field_Q[param0] & 4) != 0) {
            var4 = (o) (Object) ((gh) this).field_G.field_l.b(12623);
            while (var4 != null) {
                if (!(var4.field_H != param0)) {
                    var4.field_l = 0;
                }
                var4 = (o) (Object) ((gh) this).field_G.field_l.a(0);
            }
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = ((gh) this).field_U;
          var3 = ((gh) this).field_K;
          var4 = ((gh) this).field_t;
          if (((gh) this).field_C == null) {
            break L0;
          } else {
            if (var3 != ((gh) this).field_w) {
              break L0;
            } else {
              this.a(-93, ((gh) this).field_u, ((gh) this).field_C, ((gh) this).field_M);
              this.f((byte) 29);
              return;
            }
          }
        }
        L1: while (true) {
          if (((gh) this).field_K != var3) {
            L2: {
              ((gh) this).field_K = var3;
              ((gh) this).field_t = var4;
              ((gh) this).field_U = var2;
              if (null == ((gh) this).field_C) {
                break L2;
              } else {
                if (((gh) this).field_w < var3) {
                  ((gh) this).field_U = -1;
                  ((gh) this).field_K = ((gh) this).field_w;
                  ((gh) this).field_t = ((gh) this).field_N.b(((gh) this).field_K);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = 62 / ((-75 - param0) / 48);
            return;
          } else {
            L3: while (true) {
              L4: {
                if (((gh) this).field_N.field_d[var2] != var3) {
                  break L4;
                } else {
                  ((gh) this).field_N.f(var2);
                  var6 = ((gh) this).field_N.d(var2);
                  if (var6 != 1) {
                    L5: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.b(27257, var6);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((gh) this).field_N.a(var2);
                    ((gh) this).field_N.c(var2);
                    continue L3;
                  } else {
                    ((gh) this).field_N.g();
                    ((gh) this).field_N.c(var2);
                    if (((gh) this).field_N.f()) {
                      if (null != ((gh) this).field_C) {
                        ((gh) this).a((byte) -96, ((gh) this).field_u, ((gh) this).field_C);
                        this.f((byte) 124);
                        return;
                      } else {
                        L6: {
                          if (!((gh) this).field_u) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((gh) this).field_N.a(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a((byte) -120, true);
                        ((gh) this).field_N.c();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = ((gh) this).field_N.a();
              var3 = ((gh) this).field_N.field_d[var2];
              var4 = ((gh) this).field_N.b(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized boolean e(byte param0) {
        if (param0 != -8) {
            ((gh) this).field_v = 62;
        }
        return ((gh) this).field_N.e();
    }

    private final int b(int param0, o param1) {
        int var3 = 0;
        ba var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = param1.field_I + (param1.field_i * param1.field_B >> -1439130804);
        if (param0 < -105) {
          L0: {
            var3 = var3 + ((((gh) this).field_x[param1.field_H] - 8192) * ((gh) this).field_J[param1.field_H] >> 252564460);
            var4 = param1.field_x;
            if (var4.field_e <= 0) {
              break L0;
            } else {
              L1: {
                if ((var4.field_j ^ -1) < -1) {
                  break L1;
                } else {
                  if (((gh) this).field_I[param1.field_H] > 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                var5 = var4.field_j << 92178594;
                var6 = var4.field_d << -1568050975;
                if (var6 <= param1.field_z) {
                  break L2;
                } else {
                  var5 = param1.field_z * var5 / var6;
                  break L2;
                }
              }
              var5 = var5 + (((gh) this).field_I[param1.field_H] >> -943231033);
              var7 = Math.sin((double)(511 & param1.field_w) * 0.01227184630308513);
              var3 = var3 + (int)(var7 * (double)var5);
              break L0;
            }
          }
          L3: {
            var5 = (int)(0.5 + (double)(param1.field_m.field_l * 256) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)lb.field_r);
            if (-2 < (var5 ^ -1)) {
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
          return 0;
        }
    }

    final synchronized void a(byte param0) {
        if (param0 > -103) {
            return;
        }
        this.a(true, false);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            Object var6 = null;
            gh.a(3, (java.applet.Applet) null);
        }
    }

    final synchronized void c(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 119) {
            return;
        }
        fg var4 = (fg) (Object) ((gh) this).field_F.a(10);
        while (var4 != null) {
            var4.a(23257);
            var4 = (fg) (Object) ((gh) this).field_F.c(-64);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        o var5 = null;
        wf var6 = null;
        int var6_int = 0;
        o var7 = null;
        o var8 = null;
        int var9 = 0;
        Object var10 = null;
        fg var11 = null;
        fg var12 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          this.a(false, param0, 64, param2);
          if (0 != (2 & ((gh) this).field_Q[param0])) {
            var5 = (o) (Object) ((gh) this).field_G.field_l.a(true);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_H) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_y ^ -1)) {
                      ((gh) this).field_A[param0][var5.field_t] = null;
                      ((gh) this).field_A[param0][param2] = var5;
                      var6_int = var5.field_I - -(var5.field_i * var5.field_B >> 1971720044);
                      var5.field_I = var5.field_I + (param2 + -var5.field_t << 437931176);
                      var5.field_B = 4096;
                      var5.field_i = var6_int + -var5.field_I;
                      var5.field_t = param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (o) (Object) ((gh) this).field_G.field_l.b((byte) 48);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (fg) (Object) ((gh) this).field_F.a((long)((gh) this).field_q[param0], -74);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_p[param2];
          if (var6 != null) {
            L3: {
              var7 = new o();
              var7.field_H = param0;
              var7.field_D = var12;
              var7.field_m = var6;
              var7.field_x = var11.field_n[param2];
              var7.field_k = var11.field_l[param2];
              if (param3 > 120) {
                break L3;
              } else {
                var10 = null;
                gh.a(-26, (java.applet.Applet) null);
                break L3;
              }
            }
            L4: {
              var7.field_t = param2;
              var7.field_u = 1024 + param1 * (param1 * var12.field_r) * var11.field_h[param2] >> 1358972747;
              var7.field_q = var11.field_j[param2] & 255;
              var7.field_I = (param2 << 2104822568) + -(32767 & var11.field_m[param2]);
              var7.field_y = -1;
              var7.field_h = 0;
              var7.field_v = 0;
              var7.field_p = 0;
              var7.field_j = 0;
              if (((gh) this).field_H[param0] == 0) {
                var7.field_n = kd.a(var6, this.b(-122, var7), this.a((byte) -128, var7), this.a(-127, var7));
                break L4;
              } else {
                L5: {
                  var7.field_n = kd.a(var6, this.b(-127, var7), 0, this.a(-128, var7));
                  stackOut_17_0 = this;
                  stackOut_17_1 = 11132;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (var11.field_m[param2] >= 0) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L5;
                  }
                }
                ((gh) this).a(stackIn_20_1, stackIn_20_2 != 0, var7);
                break L4;
              }
            }
            L6: {
              if (-1 >= var11.field_m[param2]) {
                break L6;
              } else {
                var7.field_n.e(-1);
                break L6;
              }
            }
            L7: {
              if (-1 <= var7.field_k) {
                L8: {
                  var8 = ((gh) this).field_m[param0][var7.field_k];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (var8.field_y >= 0) {
                      break L8;
                    } else {
                      ((gh) this).field_A[param0][var8.field_t] = null;
                      var8.field_y = 0;
                      break L8;
                    }
                  }
                }
                ((gh) this).field_m[param0][var7.field_k] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            ((gh) this).field_G.field_l.b((pg) (Object) var7, -1);
            ((gh) this).field_A[param0][param2] = var7;
            return;
          } else {
            return;
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
            var8 = ArcanistsMulti.field_G ? 1 : 0;
            if (!((gh) this).field_N.e()) {
              break L1;
            } else {
              var4 = ((gh) this).field_N.field_h * ((gh) this).field_r / lb.field_r;
              L2: while (true) {
                var5 = ((gh) this).field_T + (long)param2 * (long)var4;
                if (0L > ((gh) this).field_t + -var5) {
                  var7 = (int)(((long)var4 + (-((gh) this).field_T + ((gh) this).field_t - 1L)) / (long)var4);
                  ((gh) this).field_T = ((gh) this).field_T + (long)var4 * (long)var7;
                  ((gh) this).field_G.a(param0, param1, var7);
                  param2 = param2 - var7;
                  param1 = param1 + var7;
                  this.f((byte) 45);
                  if (((gh) this).field_N.e()) {
                    continue L2;
                  } else {
                    ((gh) this).field_G.a(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((gh) this).field_T = var5;
                  break L1;
                }
              }
            }
          }
          ((gh) this).field_G.a(param0, param1, param2);
          break L0;
        }
    }

    final synchronized boolean a(int param0, gi param1, eg param2, ha param3, int param4) {
        int[] var7_array = null;
        int var10 = 0;
        fg var11 = null;
        fg var11_ref = null;
        int var12 = ArcanistsMulti.field_G ? 1 : 0;
        param3.a();
        int var6 = 1;
        int var8 = 73 % ((-55 - param4) / 50);
        Object var7 = null;
        if (-1 > (param0 ^ -1)) {
            var7_array = new int[]{param0};
        }
        vf var9 = (vf) (Object) param3.field_h.a(10);
        while (var9 != null) {
            var10 = (int)var9.field_e;
            var11 = (fg) (Object) ((gh) this).field_F.a((long)var10, -102);
            if (var11 != null) {
                // ifnull L199
                // ifeq L196
            } else {
                var11_ref = mo.a((byte) -127, param2, var10);
                if (var11_ref == null) {
                    var6 = 0;
                } else {
                    ((gh) this).field_F.a((pg) (Object) var11_ref, true, (long)var10);
                }
                if (var11_ref != null) {
                    if (!(var11_ref.a(-99, param1, var7_array, var9.field_t))) {
                        var6 = 0;
                    }
                }
            }
            var9 = (vf) (Object) param3.field_h.c(-62);
        }
        if (var6 != 0) {
            param3.b();
        }
        return var6 != 0;
    }

    final synchronized sg b() {
        return null;
    }

    final synchronized void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if ((param0 ^ -1) <= -1) {
            ((gh) this).field_B[param0] = param2;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                ((gh) this).field_B[var4] = param2;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1 == 69) {
            break L2;
          } else {
            var6 = null;
            ((gh) this).a((byte) -63, false, (ha) null);
            break L2;
          }
        }
    }

    private final void d(int param0, int param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 27652) {
            ((gh) this).field_w = -18;
        }
        o var3 = (o) (Object) ((gh) this).field_G.field_l.b(param1 ^ 23883);
        while (var3 != null) {
            if ((param0 ^ -1) <= -1) {
                // if_icmpeq L65
            } else {
                if (0 > var3.field_y) {
                    ((gh) this).field_A[var3.field_H][var3.field_t] = null;
                    var3.field_y = 0;
                }
            }
            var3 = (o) (Object) ((gh) this).field_G.field_l.a(0);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 != 96) {
            Object var7 = null;
            gh.a(107, (u) null);
        }
        int var3 = param2 >> 1923180400;
        int var4 = 65535 & param2;
        int var5 = param0 >> -1550394544;
        int var6 = 65535 & param0;
        return param0 * var3 + (var5 * var4 + (var4 * var6 >> -518949872));
    }

    final static void a(int param0, dj param1, int param2, dj param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, qb[] param12, int param13, int param14, byte param15, int param16, qb[] param17, int param18, qb[] param19, int param20) {
        ug.a((byte) 100, param8, param2, param7, param3, param14, param18, param10, param13, param6, param9, new ec(param12), param20, param1, new ec(param17), param11, param4, param16, param5, new ec(param19), param0);
        if (param15 >= -99) {
            Object var22 = null;
            gh.a(125, (java.applet.Applet) null);
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
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 27257) {
            break L0;
          } else {
            ((gh) this).field_m = null;
            break L0;
          }
        }
        var3 = param1 & 240;
        if (var3 != 128) {
          L1: {
            if (144 == var3) {
              var4 = 15 & param1;
              var5 = 127 & param1 >> -356046488;
              var6 = param1 >> 448246160 & 127;
              if ((var6 ^ -1) >= -1) {
                this.a(false, var4, 64, var5);
                return;
              } else {
                this.b(var4, var6, var5, param0 + -27131);
                break L1;
              }
            } else {
              if (-161 != (var3 ^ -1)) {
                if (-177 == (var3 ^ -1)) {
                  L2: {
                    var4 = 15 & param1;
                    var5 = param1 >> -1059378776 & 127;
                    var6 = (8387180 & param1) >> -1882020848;
                    if (0 == var5) {
                      ((gh) this).field_n[var4] = dg.a(-2080769, ((gh) this).field_n[var4]) + (var6 << -773859890);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((var5 ^ -1) == -33) {
                      ((gh) this).field_n[var4] = (var6 << 398627335) + dg.a(-16257, ((gh) this).field_n[var4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) == -2) {
                      ((gh) this).field_I[var4] = dg.a(-16257, ((gh) this).field_I[var4]) - -(var6 << 412502855);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 33) {
                      ((gh) this).field_I[var4] = dg.a(-128, ((gh) this).field_I[var4]) + var6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -6) {
                      ((gh) this).field_P[var4] = dg.a(-16257, ((gh) this).field_P[var4]) - -(var6 << -939950233);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 37) {
                      break L7;
                    } else {
                      ((gh) this).field_P[var4] = dg.a(((gh) this).field_P[var4], -128) + var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (-8 == (var5 ^ -1)) {
                      ((gh) this).field_y[var4] = (var6 << 1887323015) + dg.a(((gh) this).field_y[var4], -16257);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) != -40) {
                      break L9;
                    } else {
                      ((gh) this).field_y[var4] = var6 + dg.a(((gh) this).field_y[var4], -128);
                      break L9;
                    }
                  }
                  L10: {
                    if (10 != var5) {
                      break L10;
                    } else {
                      ((gh) this).field_S[var4] = dg.a(-16257, ((gh) this).field_S[var4]) - -(var6 << 165362663);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 42) {
                      break L11;
                    } else {
                      ((gh) this).field_S[var4] = var6 + dg.a(-128, ((gh) this).field_S[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (-12 == (var5 ^ -1)) {
                      ((gh) this).field_R[var4] = (var6 << 1213146375) + dg.a(-16257, ((gh) this).field_R[var4]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-44 != var5) {
                      break L13;
                    } else {
                      ((gh) this).field_R[var4] = var6 + dg.a(-128, ((gh) this).field_R[var4]);
                      break L13;
                    }
                  }
                  L14: {
                    if (-65 == var5) {
                      if ((var6 ^ -1) > -65) {
                        ((gh) this).field_Q[var4] = dg.a(((gh) this).field_Q[var4], -2);
                        break L14;
                      } else {
                        ((gh) this).field_Q[var4] = fj.b(((gh) this).field_Q[var4], 1);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var5 ^ -1) == -66) {
                      if ((var6 ^ -1) <= -65) {
                        ((gh) this).field_Q[var4] = fj.b(((gh) this).field_Q[var4], 2);
                        break L15;
                      } else {
                        this.a((byte) -62, var4);
                        ((gh) this).field_Q[var4] = dg.a(((gh) this).field_Q[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (99 == var5) {
                      ((gh) this).field_V[var4] = (var6 << 98973639) + dg.a(127, ((gh) this).field_V[var4]);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 98) {
                      ((gh) this).field_V[var4] = dg.a(16256, ((gh) this).field_V[var4]) + var6;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) == -102) {
                      ((gh) this).field_V[var4] = dg.a(((gh) this).field_V[var4], 127) + (16384 - -(var6 << -922001017));
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      ((gh) this).field_V[var4] = var6 + (dg.a(16256, ((gh) this).field_V[var4]) + 16384);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (120 == var5) {
                      this.a(var4, param0 ^ 27257);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-122 == (var5 ^ -1)) {
                      this.c(268269032, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != -124) {
                      break L22;
                    } else {
                      this.d(var4, 27652);
                      break L22;
                    }
                  }
                  L23: {
                    if (6 != var5) {
                      break L23;
                    } else {
                      var7 = ((gh) this).field_V[var4];
                      if (-16385 == var7) {
                        ((gh) this).field_J[var4] = (var6 << 62225415) + dg.a(-16257, ((gh) this).field_J[var4]);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-39 != (var5 ^ -1)) {
                      break L24;
                    } else {
                      var7 = ((gh) this).field_V[var4];
                      if (16384 == var7) {
                        ((gh) this).field_J[var4] = var6 + dg.a(-128, ((gh) this).field_J[var4]);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (-17 == (var5 ^ -1)) {
                      ((gh) this).field_H[var4] = (var6 << 666153415) + dg.a(-16257, ((gh) this).field_H[var4]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (48 == var5) {
                      ((gh) this).field_H[var4] = var6 + dg.a(-128, ((gh) this).field_H[var4]);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if ((var5 ^ -1) == -82) {
                      if ((var6 ^ -1) > -65) {
                        this.e(var4, param0 + -27298);
                        ((gh) this).field_Q[var4] = dg.a(((gh) this).field_Q[var4], -5);
                        break L27;
                      } else {
                        ((gh) this).field_Q[var4] = fj.b(((gh) this).field_Q[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if ((var5 ^ -1) != -18) {
                      break L28;
                    } else {
                      this.a(8387180, var4, (((gh) this).field_p[var4] & -16257) + (var6 << 151169191));
                      break L28;
                    }
                  }
                  if (49 != var5) {
                    break L1;
                  } else {
                    this.a(8387180, var4, var6 + (-128 & ((gh) this).field_p[var4]));
                    return;
                  }
                } else {
                  if (var3 != 192) {
                    if (var3 != 208) {
                      if (-225 == (var3 ^ -1)) {
                        var4 = 15 & param1;
                        var5 = ((8323387 & param1) >> 262710249) - -(param1 >> -787326744 & 127);
                        this.a(var5, var4, true);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a((byte) -103, true);
                          return;
                        }
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = param1 >> -1133905080 & 127;
                      this.a(var5, var4, (byte) -25);
                      return;
                    }
                  } else {
                    var4 = 15 & param1;
                    var5 = (32738 & param1) >> -625159000;
                    this.d(122, var5 + ((gh) this).field_n[var4], var4);
                    return;
                  }
                }
              } else {
                var4 = param1 & 15;
                var5 = param1 >> 1489296296 & 127;
                var6 = (8363658 & param1) >> 2005271728;
                this.a(var4, 0, var6, var5);
                return;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = 127 & param1 >> -380680440;
          var6 = (8361409 & param1) >> 384961904;
          this.a(false, var4, var6, var5);
          return;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final void a(int param0, boolean param1, o param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = param2.field_m.field_i.length;
        if (param0 == 11132) {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                if (!param2.field_m.field_k) {
                  break L1;
                } else {
                  var6 = -param2.field_m.field_j + (var4 + var4);
                  var4 = var4 << 8;
                  var5 = (int)((long)((gh) this).field_H[param2.field_H] * (long)var6 >> 1614611142);
                  if (var5 >= var4) {
                    var5 = -1 + var4 + var4 - var5;
                    param2.field_n.b(true);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            var5 = (int)((long)((gh) this).field_H[param2.field_H] * (long)var4 >> -40469370);
            break L0;
          }
          param2.field_n.f(var5);
          return;
        } else {
          return;
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((gh) this).field_N.c();
        ((gh) this).field_C = null;
        this.a((byte) -125, param0);
        if (param1) {
            ((gh) this).field_B = null;
        }
    }

    private final void a(byte param0, int param1) {
        o var3_ref_o = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (!((((gh) this).field_Q[param1] & 2) == 0)) {
            var3_ref_o = (o) (Object) ((gh) this).field_G.field_l.b(12623);
            while (var3_ref_o != null) {
                if (var3_ref_o.field_H == param1) {
                    if (((gh) this).field_A[param1][var3_ref_o.field_t] == null) {
                        if ((var3_ref_o.field_y ^ -1) > -1) {
                            var3_ref_o.field_y = 0;
                        }
                    }
                }
                var3_ref_o = (o) (Object) ((gh) this).field_G.field_l.a(0);
            }
        }
        int var3 = -77 / ((param0 - 3) / 33);
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = -108 % ((param1 - -39) / 47);
        this.c(param0, param2, 1319989672);
    }

    private final void a(byte param0, boolean param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1) {
            this.a(-1, 0);
        } else {
            this.d(-1, 27652);
        }
        this.c(268269032, -1);
        int var3 = 0;
        if (param0 >= -86) {
            Object var5 = null;
            boolean discarded$0 = ((gh) this).a(103, -78, 68, (int[]) null, (o) null);
        }
        while ((var3 ^ -1) > -17) {
            ((gh) this).field_q[var3] = ((gh) this).field_k[var3];
            var3++;
        }
        int var6 = 0;
        var3 = var6;
        while (var6 < 16) {
            ((gh) this).field_n[var6] = dg.a(((gh) this).field_k[var6], -128);
            var6++;
        }
    }

    final synchronized void a(byte param0, boolean param1, ha param2) {
        if (param0 != -96) {
            return;
        }
        this.a(-61, param1, param2, true);
    }

    private final void c(int param0, int param1, int param2) {
        ((gh) this).field_k[param1] = param0;
        if (param2 != 1319989672) {
            return;
        }
        ((gh) this).field_n[param1] = dg.a(-128, param0);
        this.d(param2 + -1319989581, param0, param1);
    }

    final boolean a(int param0, int param1, int param2, int[] param3, o param4) {
        int var6 = 0;
        ba var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          param4.field_C = lb.field_r / 100;
          if ((param4.field_y ^ -1) > -1) {
            break L0;
          } else {
            L1: {
              if (null == param4.field_n) {
                break L1;
              } else {
                if (!param4.field_n.k()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param4.b(true);
              param4.a(true);
              if (0 >= param4.field_k) {
                break L2;
              } else {
                if (((gh) this).field_m[param4.field_H][param4.field_k] == param4) {
                  ((gh) this).field_m[param4.field_H][param4.field_k] = null;
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
          var6 = param4.field_B;
          if (var6 <= 0) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, (double)((gh) this).field_P[param4.field_H] * 0.0004921259842519685) + 0.5);
              if (var6 >= 0) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param4.field_B = var6;
            break L3;
          }
        }
        L5: {
          param4.field_n.g(this.b(param1 ^ -24574, param4));
          var7 = param4.field_x;
          var8 = 0;
          param4.field_z = param4.field_z + 1;
          param4.field_w = param4.field_w + var7.field_e;
          var9 = (double)((-60 + param4.field_t << 1723443208) + (param4.field_i * param4.field_B >> 1121115372)) * 0.000005086263020833333;
          if (0 >= var7.field_n) {
            break L5;
          } else {
            L6: {
              if (var7.field_m <= 0) {
                param4.field_j = param4.field_j + 128;
                break L6;
              } else {
                param4.field_j = param4.field_j + (int)(128.0 * Math.pow(2.0, (double)var7.field_m * var9) + 0.5);
                break L6;
              }
            }
            if (-819201 < (param4.field_j * var7.field_n ^ -1)) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (null == var7.field_h) {
            break L7;
          } else {
            L8: {
              if ((var7.field_g ^ -1) >= -1) {
                param4.field_h = param4.field_h + 128;
                break L8;
              } else {
                param4.field_h = param4.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (var7.field_h.length - 2 <= param4.field_v) {
                  break L10;
                } else {
                  if (param4.field_h <= (65280 & var7.field_h[param4.field_v + 2] << -686969112)) {
                    break L10;
                  } else {
                    param4.field_v = param4.field_v + 2;
                    continue L9;
                  }
                }
              }
              if (param4.field_v != -2 + var7.field_h.length) {
                break L7;
              } else {
                if (var7.field_h[1 + param4.field_v] == 0) {
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
          if (-1 < param4.field_y) {
            break L11;
          } else {
            if (null == var7.field_l) {
              break L11;
            } else {
              if (-1 == (1 & ((gh) this).field_Q[param4.field_H])) {
                L12: {
                  if (-1 < (param4.field_k ^ -1)) {
                    break L12;
                  } else {
                    if (param4 == ((gh) this).field_m[param4.field_H][param4.field_k]) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 >= var7.field_i) {
                    param4.field_y = param4.field_y + 128;
                    break L13;
                  } else {
                    param4.field_y = param4.field_y + (int)(128.0 * Math.pow(2.0, (double)var7.field_i * var9) + 0.5);
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (var7.field_l.length - 2 <= param4.field_p) {
                      break L15;
                    } else {
                      if (param4.field_y <= (var7.field_l[2 + param4.field_p] & 255) << 239743176) {
                        break L15;
                      } else {
                        param4.field_p = param4.field_p + 2;
                        continue L14;
                      }
                    }
                  }
                  if (param4.field_p == -2 + var7.field_l.length) {
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
        if (var8 != 0) {
          L16: {
            param4.field_n.d(param4.field_C);
            if (param3 == null) {
              param4.field_n.a(param2);
              break L16;
            } else {
              param4.field_n.a(param3, param0, param2);
              break L16;
            }
          }
          L17: {
            if (param4.field_n.h()) {
              ((gh) this).field_G.field_n.b((sg) (Object) param4.field_n);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            param4.b(true);
            if (-1 >= (param4.field_y ^ -1)) {
              param4.a(true);
              if (0 >= param4.field_k) {
                break L18;
              } else {
                if (param4 == ((gh) this).field_m[param4.field_H][param4.field_k]) {
                  ((gh) this).field_m[param4.field_H][param4.field_k] = null;
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
          param4.field_n.a(param4.field_C, this.a((byte) -128, param4), this.a(param1 + -24592, param4));
          if (param1 == 24464) {
            return false;
          } else {
            return false;
          }
        }
    }

    final synchronized void b(int param0, byte param1) {
        ((gh) this).field_r = param0;
        if (param1 >= -84) {
            field_D = null;
        }
    }

    private final int a(byte param0, o param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(0 != ((gh) this).field_B[param1.field_H])) {
            return 0;
        }
        ba var9 = param1.field_x;
        ba var10 = var9;
        int var4 = 4096 + ((gh) this).field_y[param1.field_H] * ((gh) this).field_R[param1.field_H] >> -1552832883;
        var4 = 16384 + var4 * var4 >> -127002513;
        var4 = 16384 + param1.field_u * var4 >> -273115665;
        var4 = 128 + ((gh) this).field_v * var4 >> 1319989672;
        var4 = var4 * ((gh) this).field_B[param1.field_H] - -128 >> -1709151672;
        if (0 < var10.field_n) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_j * 0.00001953125 * (double)var10.field_n) * (double)var4);
        }
        if (!(var10.field_h == null)) {
            var5 = param1.field_h;
            var6 = var10.field_h[1 + param1.field_v];
            if (-2 + var10.field_h.length > param1.field_v) {
                var7 = (255 & var9.field_h[param1.field_v]) << -1243098424;
                var8 = (var10.field_h[param1.field_v + 2] & 255) << -497942712;
                var6 = var6 + (var5 + -var7) * (-var6 + var10.field_h[3 + param1.field_v]) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 739353638;
        }
        if (-1 > (param1.field_y ^ -1)) {
            if (!(null == var10.field_l)) {
                var5 = param1.field_y;
                var6 = var10.field_l[param1.field_p + 1];
                if (param1.field_p < var10.field_l.length - 2) {
                    var7 = (var9.field_l[param1.field_p] & 255) << 268269032;
                    var8 = (var10.field_l[param1.field_p - -2] & 255) << 301151048;
                    var6 = var6 + (-var6 + var10.field_l[param1.field_p - -3]) * (-var7 + var5) / (var8 - var7);
                }
                var4 = 32 + var6 * var4 >> 1008124710;
            }
        }
        if (param0 > -122) {
            ((gh) this).field_x = null;
        }
        return var4;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        o var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        o var8 = ((gh) this).field_A[param1][param3];
        if (!(var8 != null)) {
            return;
        }
        ((gh) this).field_A[param1][param3] = null;
        if (0 == (2 & ((gh) this).field_Q[param1])) {
            var8.field_y = 0;
        } else {
            var6 = (o) (Object) ((gh) this).field_G.field_l.b(12623);
            while (var6 != null) {
                if (var8.field_H == var6.field_H) {
                    if ((var6.field_y ^ -1) > -1) {
                        if (!(var6 == var8)) {
                            var8.field_y = 0;
                            break;
                        }
                    }
                }
                var6 = (o) (Object) ((gh) this).field_G.field_l.a(0);
            }
        }
        if (param0) {
            ((gh) this).field_F = null;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          if (((gh) this).field_N.e()) {
            var2 = ((gh) this).field_r * ((gh) this).field_N.field_h / lb.field_r;
            L1: while (true) {
              L2: {
                var3 = ((gh) this).field_T - -((long)var2 * (long)param0);
                if (0L <= -var3 + ((gh) this).field_t) {
                  ((gh) this).field_T = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + (-((gh) this).field_T + (((gh) this).field_t - -(long)var2))) / (long)var2);
                  ((gh) this).field_T = ((gh) this).field_T + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((gh) this).field_G.a(var5);
                  this.f((byte) -126);
                  if (!((gh) this).field_N.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((gh) this).field_G.a(param0);
              break L0;
            }
          } else {
            ((gh) this).field_G.a(param0);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        ((gh) this).field_x[param1] = param0;
        if (!param2) {
            ((gh) this).field_I = null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 16) {
            return;
        }
        if (!(param1 == ((gh) this).field_q[param2])) {
            ((gh) this).field_q[param2] = param1;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                ((gh) this).field_m[param2][var4] = null;
            }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 2) {
            Object var3 = null;
            gh.a(87, (java.applet.Applet) null);
        }
        um.a("", param1, 13680);
        mc.a(param0 ^ 30451, param1);
    }

    public static void d(byte param0) {
        if (param0 < 49) {
            Object var2 = null;
            gh.a(-77, (dj) null, 44, (dj) null, 50, -28, 27, 16, 26, 104, 12, -16, (qb[]) null, -80, -75, (byte) -94, -15, (qb[]) null, 47, (qb[]) null, 87);
        }
        field_z = null;
        field_o = null;
        field_L = null;
        field_l = null;
        field_D = null;
        field_O = null;
        field_E = null;
    }

    private final synchronized void a(int param0, boolean param1, ha param2, boolean param3) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(param3, false);
        ((gh) this).field_N.a(param2.field_g);
        if (param0 >= -49) {
            return;
        }
        ((gh) this).field_u = param1 ? true : false;
        ((gh) this).field_T = 0L;
        int var5 = ((gh) this).field_N.d();
        for (var6 = 0; var5 > var6; var6++) {
            ((gh) this).field_N.f(var6);
            ((gh) this).field_N.a(var6);
            ((gh) this).field_N.c(var6);
        }
        ((gh) this).field_U = ((gh) this).field_N.a();
        ((gh) this).field_K = ((gh) this).field_N.field_d[((gh) this).field_U];
        ((gh) this).field_t = ((gh) this).field_N.b(((gh) this).field_K);
    }

    private final void a(int param0, int param1, int param2) {
        ((gh) this).field_p[param1] = param2;
        ((gh) this).field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 8387180) {
            this.a(-47, -57, false);
        }
    }

    final boolean a(boolean param0, o param1) {
        if (!(param1.field_n != null)) {
            if (param1.field_y < 0) {
                return true;
            }
            param1.a(true);
            if (0 < param1.field_k) {
                if (!(param1 != ((gh) this).field_m[param1.field_H][param1.field_k])) {
                    ((gh) this).field_m[param1.field_H][param1.field_k] = null;
                }
            }
            return true;
        }
        if (!param0) {
            int discarded$0 = gh.a(-58, (byte) 89, 75);
        }
        return false;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 >= -4) {
            ((gh) this).field_V = null;
        }
    }

    private final int a(int param0, o param1) {
        if (param0 > -126) {
            return -91;
        }
        int var3 = ((gh) this).field_S[param1.field_H];
        if (8192 > var3) {
            return 32 + var3 * param1.field_q >> -2039237946;
        }
        return -(32 + (16384 - var3) * (-param1.field_q + 128) >> -1783003482) + 16384;
    }

    final synchronized sg a() {
        return (sg) (Object) ((gh) this).field_G;
    }

    final static void a(int param0, u param1) {
        int var2 = 66 / ((param0 - -27) / 62);
        kh.field_g = param1;
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 <= -1) {
          L0: {
            ((gh) this).field_y[param1] = 12800;
            ((gh) this).field_S[param1] = 8192;
            ((gh) this).field_R[param1] = 16383;
            ((gh) this).field_x[param1] = 8192;
            ((gh) this).field_I[param1] = 0;
            ((gh) this).field_P[param1] = 8192;
            this.a((byte) 121, param1);
            this.e(param1, param0 ^ -268269053);
            if (param0 == 268269032) {
              break L0;
            } else {
              ((gh) this).field_S = null;
              break L0;
            }
          }
          ((gh) this).field_Q[param1] = 0;
          ((gh) this).field_V[param1] = 32767;
          ((gh) this).field_J[param1] = 256;
          ((gh) this).field_H[param1] = 0;
          this.a(8387180, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (-17 <= param1) {
              return;
            } else {
              this.c(param0 ^ 0, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    public gh() {
        ((gh) this).field_p = new int[16];
        ((gh) this).field_k = new int[16];
        ((gh) this).field_r = 1000000;
        ((gh) this).field_A = new o[16][128];
        ((gh) this).field_s = new int[16];
        ((gh) this).field_v = 256;
        ((gh) this).field_H = new int[16];
        ((gh) this).field_x = new int[16];
        ((gh) this).field_n = new int[16];
        ((gh) this).field_J = new int[16];
        ((gh) this).field_B = new int[16];
        ((gh) this).field_V = new int[16];
        ((gh) this).field_q = new int[16];
        ((gh) this).field_m = new o[16][128];
        ((gh) this).field_Q = new int[16];
        ((gh) this).field_I = new int[16];
        ((gh) this).field_R = new int[16];
        ((gh) this).field_S = new int[16];
        ((gh) this).field_P = new int[16];
        ((gh) this).field_y = new int[16];
        ((gh) this).field_N = new en();
        ((gh) this).field_G = new hk((gh) this);
        ((gh) this).field_F = new di(128);
        ((gh) this).b(-1, (byte) 69, 256);
        this.a((byte) -93, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Auto-respond to <%0>";
        field_D = new oc();
        field_l = new int[]{2, 20, 21, 6, 5, 9};
        field_z = "Reject <%0> from this game";
        field_L = new oc();
        field_o = "Now, clicking near yourself will cause an explosion of arcane energy. Try using it on the target. If you miss, move closer and try again.";
    }
}
