/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends in {
    private int[] field_R;
    static String field_D;
    static int field_F;
    private wn[][] field_u;
    private int[] field_q;
    private int[] field_G;
    static boolean field_w;
    static boolean field_H;
    private int[] field_N;
    private int[] field_r;
    private int[] field_J;
    private int[] field_M;
    int[] field_I;
    int[] field_S;
    static String field_v;
    private ln field_o;
    private int[] field_B;
    private int[] field_P;
    private qj field_O;
    private int[] field_E;
    private int[] field_k;
    private int field_T;
    private int field_l;
    private int[] field_p;
    int[] field_U;
    private int[] field_z;
    private wn[][] field_K;
    static int field_y;
    private long field_m;
    private int field_Q;
    private int field_x;
    private long field_C;
    private pa field_L;
    private boolean field_t;
    private boolean field_n;
    private int field_s;
    private sc field_A;

    private final int a(byte param0, wn param1) {
        int var3 = ((i) this).field_p[param1.field_h];
        if (param0 < 89) {
            return 10;
        }
        if (-8193 < (var3 ^ -1)) {
            return var3 * param1.field_g - -32 >> -1084572922;
        }
        return -(32 + (-param1.field_g + 128) * (16384 + -var3) >> -494583322) + 16384;
    }

    final synchronized in b() {
        return null;
    }

    final synchronized void e(int param0, int param1) {
        if (param0 != 2) {
            return;
        }
        ((i) this).field_T = param1;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        wn var5 = null;
        ml var6 = null;
        int var6_int = 0;
        wn var7 = null;
        wn var8 = null;
        int var9 = 0;
        rc var10 = null;
        rc var11 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var9 = Virogrid.field_F ? 1 : 0;
          this.a(param3, param0, (byte) 66, 64);
          if (0 != (((i) this).field_U[param3] & 2)) {
            var5 = (wn) (Object) ((i) this).field_L.field_k.b(false);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((var5.field_h ^ -1) != (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (var5.field_o < 0) {
                      ((i) this).field_K[param3][var5.field_l] = null;
                      ((i) this).field_K[param3][param0] = var5;
                      var6_int = (var5.field_w * var5.field_v >> 132815980) + var5.field_u;
                      var5.field_u = var5.field_u + (param0 + -var5.field_l << -1309643768);
                      var5.field_w = var6_int + -var5.field_u;
                      var5.field_v = 4096;
                      var5.field_l = param0;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (wn) (Object) ((i) this).field_L.field_k.e(9003);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (rc) (Object) ((i) this).field_o.a((long)((i) this).field_P[param3], -14905);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param0];
          if (var6 != null) {
            L3: {
              var7 = new wn();
              var7.field_q = var6;
              var7.field_E = var11;
              var7.field_h = param3;
              var7.field_t = var10.field_g[param0];
              var7.field_G = var10.field_j[param0];
              var7.field_l = param0;
              var7.field_A = var10.field_k[param0] * (var11.field_q * (param2 * param2)) + 1024 >> -2077376309;
              var7.field_g = var10.field_n[param0] & 255;
              var7.field_u = (param0 << -1268898840) + -(var10.field_p[param0] & 32767);
              var7.field_F = 0;
              var7.field_s = 0;
              var7.field_y = 0;
              var7.field_k = 0;
              var7.field_o = -1;
              if (((i) this).field_S[param3] != 0) {
                L4: {
                  var7.field_p = jh.b(var6, this.a(var7, param1 ^ 109), 0, this.a((byte) 106, var7));
                  stackOut_16_0 = this;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (0 <= var11.field_p[param0]) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L4;
                  }
                }
                ((i) this).a(stackIn_19_1 != 0, -16257, var7);
                break L3;
              } else {
                var7.field_p = jh.b(var6, this.a(var7, -123), this.a(param1 ^ 26253, var7), this.a((byte) 111, var7));
                break L3;
              }
            }
            L5: {
              if ((var11.field_p[param0] ^ -1) <= param1) {
                break L5;
              } else {
                var7.field_p.e(-1);
                break L5;
              }
            }
            L6: {
              if ((var7.field_G ^ -1) <= -1) {
                L7: {
                  var8 = ((i) this).field_u[param3][var7.field_G];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_o >= 0) {
                      break L7;
                    } else {
                      ((i) this).field_K[param3][var8.field_l] = null;
                      var8.field_o = 0;
                      break L7;
                    }
                  }
                }
                ((i) this).field_u[param3][var7.field_G] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((i) this).field_L.field_k.a((l) (Object) var7, (byte) -109);
            ((i) this).field_K[param3][param0] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, byte param1) {
        wn var3 = null;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (param1 == 2) {
            break L0;
          } else {
            this.c(46, (byte) -89);
            break L0;
          }
        }
        var3 = (wn) (Object) ((i) this).field_L.field_k.a((byte) -41);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) > -1) {
                  break L3;
                } else {
                  if ((param0 ^ -1) != (var3.field_h ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == var3.field_p) {
                  break L4;
                } else {
                  L5: {
                    var3.field_p.g(ua.field_p / 100);
                    if (var3.field_p.i()) {
                      ((i) this).field_L.field_n.a((in) (Object) var3.field_p);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.c(-11382);
                  break L4;
                }
              }
              L6: {
                if (-1 < (var3.field_o ^ -1)) {
                  ((i) this).field_K[var3.field_h][var3.field_l] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.a(false);
              break L2;
            }
            var3 = (wn) (Object) ((i) this).field_L.field_k.a(16213);
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1) {
        wn var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1 < 42) {
            return;
        }
        if (0 != (2 & ((i) this).field_U[param0])) {
            var3 = (wn) (Object) ((i) this).field_L.field_k.a((byte) -96);
            while (var3 != null) {
                if (var3.field_h == param0) {
                    if (((i) this).field_K[param0][var3.field_l] == null) {
                        if (!(var3.field_o >= 0)) {
                            var3.field_o = 0;
                        }
                    }
                }
                var3 = (wn) (Object) ((i) this).field_L.field_k.a(16213);
            }
        }
    }

    private final void a(int param0, int param1) {
        wn var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (0 != (((i) this).field_U[param0] & 4)) {
            var3 = (wn) (Object) ((i) this).field_L.field_k.a((byte) -78);
            while (var3 != null) {
                if (!((var3.field_h ^ -1) != (param0 ^ -1))) {
                    var3.field_B = 0;
                }
                var3 = (wn) (Object) ((i) this).field_L.field_k.a(16213);
            }
        }
        if (param1 >= -101) {
            this.b(67, -128, 74);
        }
    }

    final static dh a(int param0, int param1, int param2, int param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        dh var4 = (dh) (Object) bl.field_D.a((byte) -121);
        while (var4 != null) {
            if (!(var4.field_i != param0)) {
                return var4;
            }
            var4 = (dh) (Object) bl.field_D.a(16213);
        }
        if (param3 >= -11) {
            return null;
        }
        var4 = new dh();
        var4.field_i = param0;
        var4.field_g = param2;
        bl.field_D.a((l) (Object) var4, (byte) -108);
        gl.a(var4, (byte) 89, param1);
        return var4;
    }

    final synchronized boolean d(int param0) {
        if (param0 <= 110) {
            return false;
        }
        return ((i) this).field_O.c();
    }

    final synchronized void e(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        rc var2 = (rc) (Object) ((i) this).field_o.a((byte) 19);
        if (param0 != -1) {
            this.b(-51, (byte) -4);
        }
        while (var2 != null) {
            var2.a((byte) -90);
            var2 = (rc) (Object) ((i) this).field_o.a(param0 ^ -95);
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          var2 = ((i) this).field_Q;
          var3 = ((i) this).field_x;
          var4 = ((i) this).field_C;
          if (((i) this).field_A == null) {
            break L0;
          } else {
            if ((var3 ^ -1) == (((i) this).field_s ^ -1)) {
              this.a(((i) this).field_A, false, ((i) this).field_t, ((i) this).field_n);
              this.c(22228);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((i) this).field_x) {
            if (param0 == 22228) {
              L2: {
                ((i) this).field_Q = var2;
                ((i) this).field_x = var3;
                ((i) this).field_C = var4;
                if (((i) this).field_A == null) {
                  break L2;
                } else {
                  if (var3 <= ((i) this).field_s) {
                    break L2;
                  } else {
                    ((i) this).field_Q = -1;
                    ((i) this).field_x = ((i) this).field_s;
                    ((i) this).field_C = ((i) this).field_O.c(((i) this).field_x);
                    break L2;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L3: while (true) {
              L4: {
                if ((var3 ^ -1) != (((i) this).field_O.field_a[var2] ^ -1)) {
                  break L4;
                } else {
                  ((i) this).field_O.f(var2);
                  var6 = ((i) this).field_O.e(var2);
                  if (var6 == 1) {
                    ((i) this).field_O.e();
                    ((i) this).field_O.d(var2);
                    if (!((i) this).field_O.d()) {
                      break L4;
                    } else {
                      if (null != ((i) this).field_A) {
                        ((i) this).a(((i) this).field_t, 37, ((i) this).field_A);
                        this.c(22228);
                        return;
                      } else {
                        L5: {
                          if (!((i) this).field_t) {
                            break L5;
                          } else {
                            if (0 != var3) {
                              ((i) this).field_O.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a((byte) -22, true);
                        ((i) this).field_O.g();
                        return;
                      }
                    }
                  } else {
                    L6: {
                      if (-1 == (128 & var6 ^ -1)) {
                        break L6;
                      } else {
                        this.b(var6, (byte) -108);
                        break L6;
                      }
                    }
                    ((i) this).field_O.b(var2);
                    ((i) this).field_O.d(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((i) this).field_O.f();
              var3 = ((i) this).field_O.field_a[var2];
              var4 = ((i) this).field_O.c(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param1) {
          L0: {
            if ((param2 ^ -1) <= -1) {
              ((i) this).field_k[param2] = param0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -17) {
                  break L0;
                } else {
                  ((i) this).field_k[var4] = param0;
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

    private final synchronized void a(int param0, boolean param1) {
        if (param0 != -8193) {
            ((i) this).field_G = null;
        }
        ((i) this).field_O.g();
        ((i) this).field_A = null;
        this.a((byte) -22, param1);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          if (((i) this).field_O.c()) {
            var2 = ((i) this).field_O.field_c * ((i) this).field_l / ua.field_p;
            L1: while (true) {
              L2: {
                var3 = (long)var2 * (long)param0 + ((i) this).field_m;
                if ((((i) this).field_C + -var3 ^ -1L) > -1L) {
                  var5 = (int)((-1L + (long)var2 + (((i) this).field_C - ((i) this).field_m)) / (long)var2);
                  ((i) this).field_m = ((i) this).field_m + (long)var5 * (long)var2;
                  ((i) this).field_L.a(var5);
                  param0 = param0 - var5;
                  this.c(22228);
                  if (!((i) this).field_O.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((i) this).field_m = var3;
                  break L2;
                }
              }
              ((i) this).field_L.a(param0);
              break L0;
            }
          } else {
            ((i) this).field_L.a(param0);
            break L0;
          }
        }
    }

    private final int a(wn param0, int param1) {
        int var3 = 0;
        qd var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param1 <= -94) {
            break L0;
          } else {
            ((i) this).field_u = null;
            break L0;
          }
        }
        L1: {
          var3 = (param0.field_w * param0.field_v >> 1168587532) + param0.field_u;
          var3 = var3 + ((-8192 + ((i) this).field_r[param0.field_h]) * ((i) this).field_B[param0.field_h] >> 1908781068);
          var4 = param0.field_t;
          if (-1 <= (var4.field_h ^ -1)) {
            break L1;
          } else {
            L2: {
              if ((var4.field_j ^ -1) < -1) {
                break L2;
              } else {
                if (((i) this).field_R[param0.field_h] > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_j << -840280126;
              var6 = var4.field_b << -1713215775;
              if (var6 <= param0.field_x) {
                break L3;
              } else {
                var5 = var5 * param0.field_x / var6;
                break L3;
              }
            }
            var5 = var5 + (((i) this).field_R[param0.field_h] >> -363246265);
            var7 = Math.sin((double)(511 & param0.field_r) * 0.01227184630308513);
            var3 = var3 + (int)((double)var5 * var7);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(256 * param0.field_q.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)ua.field_p);
          if (var5 >= 1) {
            stackOut_11_0 = var5;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
    }

    private final void c(int param0, byte param1) {
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            ((i) this).field_G[param0] = 12800;
            if (param1 == 94) {
              break L0;
            } else {
              this.a(-89, (byte) -60, 95);
              break L0;
            }
          }
          ((i) this).field_p[param0] = 8192;
          ((i) this).field_q[param0] = 16383;
          ((i) this).field_r[param0] = 8192;
          ((i) this).field_R[param0] = 0;
          ((i) this).field_J[param0] = 8192;
          this.b(param0, 45);
          this.a(param0, -113);
          ((i) this).field_U[param0] = 0;
          ((i) this).field_N[param0] = 32767;
          ((i) this).field_B[param0] = 256;
          ((i) this).field_S[param0] = 0;
          this.b(param0, 2097152, 8192);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.c(param0, (byte) 94);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 18553) {
            field_D = null;
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1) {
        wn var3 = null;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (param1 == 1123) {
            break L0;
          } else {
            this.a(-12, (byte) -112, -115);
            break L0;
          }
        }
        var3 = (wn) (Object) ((i) this).field_L.field_k.a((byte) -62);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (-1 < (param0 ^ -1)) {
                  break L3;
                } else {
                  if (var3.field_h != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-1 < (var3.field_o ^ -1)) {
                ((i) this).field_K[var3.field_h][var3.field_l] = null;
                var3.field_o = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (wn) (Object) ((i) this).field_L.field_k.a(16213);
            continue L1;
          }
        }
    }

    private final synchronized void a(sc param0, boolean param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        this.a(-8193, param3);
        ((i) this).field_O.a(param0.field_g);
        ((i) this).field_m = 0L;
        ((i) this).field_t = param2 ? true : false;
        int var5 = ((i) this).field_O.a();
        for (var6 = 0; (var5 ^ -1) < (var6 ^ -1); var6++) {
            ((i) this).field_O.f(var6);
            ((i) this).field_O.b(var6);
            ((i) this).field_O.d(var6);
        }
        if (param1) {
            return;
        }
        ((i) this).field_Q = ((i) this).field_O.f();
        ((i) this).field_x = ((i) this).field_O.field_a[((i) this).field_Q];
        ((i) this).field_C = ((i) this).field_O.c(((i) this).field_x);
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        if (param2) {
            ((i) this).field_Q = 117;
        }
        this.c(127, param0, param1);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, wn param4) {
        int var6 = 0;
        qd var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          param4.field_D = ua.field_p / 100;
          if ((param4.field_o ^ -1) > -1) {
            break L0;
          } else {
            L1: {
              if (param4.field_p == null) {
                break L1;
              } else {
                if (!param4.field_p.j()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param4.c(-11382);
              param4.a(false);
              if (0 >= param4.field_G) {
                break L2;
              } else {
                if (((i) this).field_u[param4.field_h][param4.field_G] != param4) {
                  break L2;
                } else {
                  ((i) this).field_u[param4.field_h][param4.field_G] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param4.field_v;
          if ((var6 ^ -1) < -1) {
            L4: {
              var6 = var6 - (int)(0.5 + Math.pow(2.0, (double)((i) this).field_J[param4.field_h] * 0.0004921259842519685) * 16.0);
              if (var6 >= 0) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param4.field_v = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param4.field_p.c(this.a(param4, -119));
          var7 = param4.field_t;
          var8 = 0;
          if (param3 == 123) {
            break L5;
          } else {
            field_F = 51;
            break L5;
          }
        }
        L6: {
          param4.field_r = param4.field_r + var7.field_h;
          param4.field_x = param4.field_x + 1;
          var9 = 0.000005086263020833333 * (double)((param4.field_w * param4.field_v >> 1349155724) + (param4.field_l - 60 << 1530175464));
          if (0 >= var7.field_n) {
            break L6;
          } else {
            L7: {
              if ((var7.field_l ^ -1) >= -1) {
                param4.field_y = param4.field_y + 128;
                break L7;
              } else {
                param4.field_y = param4.field_y + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                break L7;
              }
            }
            if (-819201 >= (var7.field_n * param4.field_y ^ -1)) {
              var8 = 1;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L8: {
          if (null == var7.field_e) {
            break L8;
          } else {
            L9: {
              if (-1 > (var7.field_a ^ -1)) {
                param4.field_s = param4.field_s + (int)(0.5 + Math.pow(2.0, (double)var7.field_a * var9) * 128.0);
                break L9;
              } else {
                param4.field_s = param4.field_s + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (var7.field_e.length + -2 <= param4.field_F) {
                  break L11;
                } else {
                  if (((255 & var7.field_e[param4.field_F + 2]) << 1185130056 ^ -1) <= (param4.field_s ^ -1)) {
                    break L11;
                  } else {
                    param4.field_F = param4.field_F + 2;
                    continue L10;
                  }
                }
              }
              if (-2 + var7.field_e.length != param4.field_F) {
                break L8;
              } else {
                if (0 == var7.field_e[param4.field_F + 1]) {
                  var8 = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
        }
        L12: {
          if (0 > param4.field_o) {
            break L12;
          } else {
            if (null == var7.field_k) {
              break L12;
            } else {
              if (-1 == (((i) this).field_U[param4.field_h] & 1 ^ -1)) {
                L13: {
                  if (-1 < (param4.field_G ^ -1)) {
                    break L13;
                  } else {
                    if (((i) this).field_u[param4.field_h][param4.field_G] == param4) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (0 < var7.field_d) {
                    param4.field_o = param4.field_o + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
                    break L14;
                  } else {
                    param4.field_o = param4.field_o + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (param4.field_k >= var7.field_k.length + -2) {
                      break L16;
                    } else {
                      if ((var7.field_k[2 + param4.field_k] << 1765759560 & 65280 ^ -1) <= (param4.field_o ^ -1)) {
                        break L16;
                      } else {
                        param4.field_k = param4.field_k + 2;
                        continue L15;
                      }
                    }
                  }
                  if ((param4.field_k ^ -1) != (var7.field_k.length - 2 ^ -1)) {
                    break L12;
                  } else {
                    var8 = 1;
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
          }
        }
        if (var8 != 0) {
          L17: {
            param4.field_p.g(param4.field_D);
            if (param1 != null) {
              param4.field_p.b(param1, param0, param2);
              break L17;
            } else {
              param4.field_p.a(param2);
              break L17;
            }
          }
          L18: {
            if (!param4.field_p.i()) {
              break L18;
            } else {
              ((i) this).field_L.field_n.a((in) (Object) param4.field_p);
              break L18;
            }
          }
          L19: {
            param4.c(param3 + -11505);
            if (0 <= param4.field_o) {
              param4.a(false);
              if ((param4.field_G ^ -1) >= -1) {
                break L19;
              } else {
                if (((i) this).field_u[param4.field_h][param4.field_G] != param4) {
                  break L19;
                } else {
                  ((i) this).field_u[param4.field_h][param4.field_G] = null;
                  break L19;
                }
              }
            } else {
              break L19;
            }
          }
          return true;
        } else {
          param4.field_p.a(param4.field_D, this.a(-26254, param4), this.a((byte) 96, param4));
          return false;
        }
    }

    final synchronized boolean a(eh param0, int param1, jg param2, sc param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        sg var8 = null;
        int var9 = 0;
        int var11 = 0;
        rc var12 = null;
        rc var13 = null;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          param3.a();
          var6 = 1;
          var7 = null;
          if (param4 < param1) {
            var7 = (Object) (Object) new int[]{param1};
            break L0;
          } else {
            break L0;
          }
        }
        var8 = (sg) (Object) param3.field_h.a((byte) 19);
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
              var9 = (int)var8.field_d;
              var12 = (rc) (Object) ((i) this).field_o.a((long)var9, param4 ^ -14905);
              if (var12 == null) {
                var13 = vm.a(param0, (byte) 42, var9);
                if (var13 == null) {
                  var6 = 0;
                  break L3;
                } else {
                  ((i) this).field_o.a((l) (Object) var13, (byte) 16, (long)var9);
                  if (var13.a(param2, var8.field_h, (byte) 112, (int[]) var7)) {
                    break L3;
                  } else {
                    var6 = 0;
                    break L3;
                  }
                }
              } else {
                if (var12.a(param2, var8.field_h, (byte) 112, (int[]) var7)) {
                  break L3;
                } else {
                  var6 = 0;
                  var8 = (sg) (Object) param3.field_h.a(-117);
                  continue L1;
                }
              }
            }
            var8 = (sg) (Object) param3.field_h.a(-117);
            continue L1;
          }
        }
    }

    final synchronized void c(boolean param0) {
        if (param0) {
            return;
        }
        this.a(-8193, true);
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -128) {
            ((i) this).field_x = -112;
        }
        ((i) this).field_l = param1;
    }

    public static void a(byte param0) {
        field_v = null;
        field_D = null;
        if (param0 >= -69) {
            field_y = 18;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 > -113) {
            return;
        }
        ((i) this).field_r[param1] = param2;
    }

    private final void c(int param0, int param1, int param2) {
        ((i) this).field_M[param2] = param1;
        ((i) this).field_E[param2] = rb.a(param1, -128);
        if (param0 < 124) {
            Object var5 = null;
            int discarded$0 = this.a(107, (wn) null);
        }
        this.a(param2, (byte) -84, param1);
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != -2022) {
            Object var3 = null;
            boolean discarded$0 = i.a((byte) 27, (eh) null);
        }
        return nf.a(param1.length, (byte) -120, 0, param1);
    }

    final synchronized in c() {
        return (in) (Object) ((i) this).field_L;
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        wn var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param2 != 66) {
            return;
        }
        wn var8 = ((i) this).field_K[param0][param1];
        if (var8 == null) {
            return;
        }
        ((i) this).field_K[param0][param1] = null;
        if (0 == (((i) this).field_U[param0] & 2)) {
            var8.field_o = 0;
        } else {
            var6 = (wn) (Object) ((i) this).field_L.field_k.a((byte) -64);
            while (var6 != null) {
                if (var6.field_h == var8.field_h) {
                    if (var6.field_o < 0) {
                        if (!(var6 == var8)) {
                            var8.field_o = 0;
                            break;
                        }
                    }
                }
                var6 = (wn) (Object) ((i) this).field_L.field_k.a(16213);
            }
        }
    }

    final static boolean a(byte param0, eh param1) {
        if (param0 < 99) {
            Object var3 = null;
            boolean discarded$0 = i.a((byte) -25, (eh) null);
        }
        return param1.b(25867);
    }

    private final int a(int param0, wn param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!((((i) this).field_k[param1.field_h] ^ -1) != -1)) {
            return 0;
        }
        qd var9 = param1.field_t;
        qd var10 = var9;
        int var4 = 4096 + ((i) this).field_G[param1.field_h] * ((i) this).field_q[param1.field_h] >> -1164413107;
        if (param0 != -26254) {
            this.a(-12, (byte) 48, -58);
        }
        var4 = var4 * var4 + 16384 >> 1569071951;
        var4 = 16384 + param1.field_A * var4 >> 512633743;
        var4 = 128 + var4 * ((i) this).field_T >> 722707976;
        var4 = 128 + var4 * ((i) this).field_k[param1.field_h] >> 2095420360;
        if ((var10.field_n ^ -1) < -1) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_y * 0.00001953125 * (double)var10.field_n) * (double)var4);
        }
        if (var10.field_e != null) {
            var5 = param1.field_s;
            var6 = var10.field_e[param1.field_F - -1];
            if (!((var10.field_e.length + -2 ^ -1) >= (param1.field_F ^ -1))) {
                var7 = var9.field_e[param1.field_F] << -235240216 & 65280;
                var8 = var10.field_e[2 + param1.field_F] << 339136040 & 65280;
                var6 = var6 + (var5 + -var7) * (var10.field_e[param1.field_F - -3] + -var6) / (var8 + -var7);
            }
            var4 = var4 * var6 - -32 >> 1304293894;
        }
        if ((param1.field_o ^ -1) < -1) {
            if (null != var10.field_k) {
                var5 = param1.field_o;
                var6 = var10.field_k[param1.field_k + 1];
                if (!(var10.field_k.length - 2 <= param1.field_k)) {
                    var7 = (255 & var9.field_k[param1.field_k]) << 1520324680;
                    var8 = var10.field_k[param1.field_k + 2] << 1559020904 & 65280;
                    var6 = var6 + (var5 - var7) * (var10.field_k[3 + param1.field_k] - var6) / (var8 + -var7);
                }
                var4 = var6 * var4 - -32 >> 1715242886;
            }
        }
        return var4;
    }

    private final void b(int param0, int param1, int param2) {
        ((i) this).field_z[param0] = param2;
        ((i) this).field_I[param0] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * (double)param1);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param1 != 64) {
            ((i) this).field_k = null;
        }
    }

    final void a(boolean param0, int param1, wn param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param2.field_q.field_k.length;
            if (!param0) {
              break L1;
            } else {
              if (param2.field_q.field_i) {
                var6 = -param2.field_q.field_l + (var4 + var4);
                var4 = var4 << 8;
                var5 = (int)((long)((i) this).field_S[param2.field_h] * (long)var6 >> 804383046);
                if (var5 >= var4) {
                  param2.field_p.c(true);
                  var5 = -1 + var4 + (var4 - var5);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)((i) this).field_S[param2.field_h] * (long)var4 >> -1230453114);
          break L0;
        }
        L2: {
          param2.field_p.d(var5);
          if (param1 == -16257) {
            break L2;
          } else {
            field_y = -49;
            break L2;
          }
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) 2);
        } else {
            this.d(-1, param0 + 1145);
        }
        if (param0 != -22) {
            dh discarded$0 = i.a(39, -26, 106, -19);
        }
        this.c(-1, (byte) 94);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            ((i) this).field_P[var3] = ((i) this).field_M[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((i) this).field_E[var5] = rb.a(-128, ((i) this).field_M[var5]);
            var5++;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -84) {
            ((i) this).field_l = 17;
        }
        if ((param2 ^ -1) != (((i) this).field_P[param0] ^ -1)) {
            ((i) this).field_P[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((i) this).field_u[param0][var4] = null;
            }
        }
    }

    final synchronized void a(boolean param0, int param1, sc param2) {
        if (param1 != 37) {
            return;
        }
        this.a(param2, false, param0, true);
    }

    private final void b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var3 = param0 & 240;
        if (-129 == (var3 ^ -1)) {
          var4 = param0 & 15;
          var5 = param0 >> 1801181448 & 127;
          var6 = param0 >> -916200720 & 127;
          this.a(var4, var5, (byte) 66, var6);
          return;
        } else {
          if (-145 == (var3 ^ -1)) {
            var4 = 15 & param0;
            var5 = param0 >> -14189368 & 127;
            var6 = 127 & param0 >> -423448272;
            if (-1 <= (var6 ^ -1)) {
              this.a(var4, var5, (byte) 66, 64);
              return;
            } else {
              this.b(var5, -1, var6, var4);
              return;
            }
          } else {
            if (-161 != (var3 ^ -1)) {
              if (-177 == (var3 ^ -1)) {
                L0: {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> -65784;
                  var6 = (param0 & 8367969) >> 1233970768;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    ((i) this).field_E[var4] = (var6 << -396432594) + rb.a(((i) this).field_E[var4], -2080769);
                    break L0;
                  }
                }
                L1: {
                  if (-33 != (var5 ^ -1)) {
                    break L1;
                  } else {
                    ((i) this).field_E[var4] = rb.a(-16257, ((i) this).field_E[var4]) + (var6 << 2002139239);
                    break L1;
                  }
                }
                L2: {
                  if (-2 != (var5 ^ -1)) {
                    break L2;
                  } else {
                    ((i) this).field_R[var4] = rb.a(((i) this).field_R[var4], -16257) - -(var6 << -1154908121);
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 33) {
                    ((i) this).field_R[var4] = rb.a(-128, ((i) this).field_R[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((i) this).field_J[var4] = (var6 << 1493950791) + rb.a(-16257, ((i) this).field_J[var4]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    ((i) this).field_J[var4] = rb.a(((i) this).field_J[var4], -128) + var6;
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    ((i) this).field_G[var4] = (var6 << -355828793) + rb.a(((i) this).field_G[var4], -16257);
                    break L6;
                  }
                }
                L7: {
                  if (-40 != (var5 ^ -1)) {
                    break L7;
                  } else {
                    ((i) this).field_G[var4] = rb.a(((i) this).field_G[var4], -128) + var6;
                    break L7;
                  }
                }
                L8: {
                  if (var5 == 10) {
                    ((i) this).field_p[var4] = (var6 << 1429720455) + rb.a(-16257, ((i) this).field_p[var4]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) != -43) {
                    break L9;
                  } else {
                    ((i) this).field_p[var4] = var6 + rb.a(((i) this).field_p[var4], -128);
                    break L9;
                  }
                }
                L10: {
                  if ((var5 ^ -1) != -12) {
                    break L10;
                  } else {
                    ((i) this).field_q[var4] = (var6 << -627211001) + rb.a(-16257, ((i) this).field_q[var4]);
                    break L10;
                  }
                }
                L11: {
                  if ((var5 ^ -1) != -44) {
                    break L11;
                  } else {
                    ((i) this).field_q[var4] = var6 + rb.a(-128, ((i) this).field_q[var4]);
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 64) {
                    if (-65 >= (var6 ^ -1)) {
                      ((i) this).field_U[var4] = oh.a(((i) this).field_U[var4], 1);
                      break L12;
                    } else {
                      ((i) this).field_U[var4] = rb.a(((i) this).field_U[var4], -2);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (65 == var5) {
                    if (64 > var6) {
                      this.b(var4, 72);
                      ((i) this).field_U[var4] = rb.a(((i) this).field_U[var4], -3);
                      break L13;
                    } else {
                      ((i) this).field_U[var4] = oh.a(((i) this).field_U[var4], 2);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((var5 ^ -1) != -100) {
                    break L14;
                  } else {
                    ((i) this).field_N[var4] = rb.a(((i) this).field_N[var4], 127) - -(var6 << 1166765447);
                    break L14;
                  }
                }
                L15: {
                  if (-99 != (var5 ^ -1)) {
                    break L15;
                  } else {
                    ((i) this).field_N[var4] = var6 + rb.a(16256, ((i) this).field_N[var4]);
                    break L15;
                  }
                }
                L16: {
                  if (101 != var5) {
                    break L16;
                  } else {
                    ((i) this).field_N[var4] = (var6 << 609309095) + 16384 - -rb.a(((i) this).field_N[var4], 127);
                    break L16;
                  }
                }
                L17: {
                  if (-101 != (var5 ^ -1)) {
                    break L17;
                  } else {
                    ((i) this).field_N[var4] = var6 + 16384 - -rb.a(16256, ((i) this).field_N[var4]);
                    break L17;
                  }
                }
                L18: {
                  if ((var5 ^ -1) == -121) {
                    this.a(var4, (byte) 2);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-122 != (var5 ^ -1)) {
                    break L19;
                  } else {
                    this.c(var4, (byte) 94);
                    break L19;
                  }
                }
                L20: {
                  if (var5 != 123) {
                    break L20;
                  } else {
                    this.d(var4, 1123);
                    break L20;
                  }
                }
                L21: {
                  if (-7 == (var5 ^ -1)) {
                    var7 = ((i) this).field_N[var4];
                    if (16384 != var7) {
                      break L21;
                    } else {
                      ((i) this).field_B[var4] = rb.a(((i) this).field_B[var4], -16257) + (var6 << -1443119129);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-39 == (var5 ^ -1)) {
                    var7 = ((i) this).field_N[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L22;
                    } else {
                      ((i) this).field_B[var4] = var6 + rb.a(-128, ((i) this).field_B[var4]);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-17 != (var5 ^ -1)) {
                    break L23;
                  } else {
                    ((i) this).field_S[var4] = rb.a(-16257, ((i) this).field_S[var4]) + (var6 << -268871897);
                    break L23;
                  }
                }
                L24: {
                  if (48 == var5) {
                    ((i) this).field_S[var4] = var6 + rb.a(((i) this).field_S[var4], -128);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (-82 != (var5 ^ -1)) {
                    break L25;
                  } else {
                    if (var6 < 64) {
                      this.a(var4, -116);
                      ((i) this).field_U[var4] = rb.a(((i) this).field_U[var4], -5);
                      break L25;
                    } else {
                      ((i) this).field_U[var4] = oh.a(((i) this).field_U[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (-18 != (var5 ^ -1)) {
                    break L26;
                  } else {
                    this.b(var4, 2097152, (var6 << -90739001) + (((i) this).field_z[var4] & -16257));
                    break L26;
                  }
                }
                L27: {
                  if ((var5 ^ -1) == -50) {
                    this.b(var4, 2097152, var6 + (((i) this).field_z[var4] & -128));
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (-193 != (var3 ^ -1)) {
                  if (-209 == (var3 ^ -1)) {
                    var4 = 15 & param0;
                    var5 = (param0 & 32732) >> 888059272;
                    this.a(var5, var4, 18553);
                    return;
                  } else {
                    if (var3 != 224) {
                      var3 = param0 & 255;
                      var4 = -86 / ((-40 - param1) / 35);
                      if (-256 == (var3 ^ -1)) {
                        this.a((byte) -22, true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (param0 >> -709155448 & 127) + ((8323307 & param0) >> 874111433);
                      this.a((byte) -128, var4, var5);
                      return;
                    }
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = (32748 & param0) >> 997620488;
                  this.a(var4, (byte) -84, ((i) this).field_E[var4] + var5);
                  return;
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = (param0 & 32737) >> 245199144;
              var6 = (8381047 & param0) >> -514634192;
              this.c(var6, 64, var4, var5);
              return;
            }
          }
        }
    }

    final boolean b(int param0, wn param1) {
        if (!(null != param1.field_p)) {
            if (0 > param1.field_o) {
                return true;
            }
            param1.a(false);
            if ((param1.field_G ^ -1) < -1) {
                if (((i) this).field_u[param1.field_h][param1.field_G] == param1) {
                    ((i) this).field_u[param1.field_h][param1.field_G] = null;
                }
            }
            return true;
        }
        if (param0 >= -105) {
            return true;
        }
        return false;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Virogrid.field_F ? 1 : 0;
            if (((i) this).field_O.c()) {
              var4 = ((i) this).field_O.field_c * ((i) this).field_l / ua.field_p;
              L2: while (true) {
                var5 = ((i) this).field_m + (long)param2 * (long)var4;
                if (-1L < (((i) this).field_C + -var5 ^ -1L)) {
                  var7 = (int)((-1L + (long)var4 + ((i) this).field_C - ((i) this).field_m) / (long)var4);
                  ((i) this).field_m = ((i) this).field_m + (long)var7 * (long)var4;
                  ((i) this).field_L.b(param0, param1, var7);
                  this.c(22228);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (((i) this).field_O.c()) {
                    continue L2;
                  } else {
                    ((i) this).field_L.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((i) this).field_m = var5;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((i) this).field_L.b(param0, param1, param2);
          break L0;
        }
    }

    public i() {
        ((i) this).field_u = new wn[16][128];
        ((i) this).field_N = new int[16];
        ((i) this).field_P = new int[16];
        ((i) this).field_B = new int[16];
        ((i) this).field_G = new int[16];
        ((i) this).field_r = new int[16];
        ((i) this).field_R = new int[16];
        ((i) this).field_q = new int[16];
        ((i) this).field_E = new int[16];
        ((i) this).field_k = new int[16];
        ((i) this).field_S = new int[16];
        ((i) this).field_I = new int[16];
        ((i) this).field_M = new int[16];
        ((i) this).field_T = 256;
        ((i) this).field_l = 1000000;
        ((i) this).field_p = new int[16];
        ((i) this).field_J = new int[16];
        ((i) this).field_U = new int[16];
        ((i) this).field_K = new wn[16][128];
        ((i) this).field_z = new int[16];
        ((i) this).field_O = new qj();
        ((i) this).field_L = new pa((i) this);
        ((i) this).field_o = new ln(128);
        ((i) this).a(256, true, -1);
        this.a((byte) -22, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_D = "Accept invitation to <%0>'s game";
    }
}
