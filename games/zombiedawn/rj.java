/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends sp {
    int[] field_O;
    private int[] field_M;
    static int field_E;
    int[] field_r;
    private int field_o;
    int[] field_l;
    private int[] field_L;
    private int[] field_B;
    private int[] field_D;
    private int[] field_z;
    private int[] field_q;
    private lf[][] field_x;
    private int[] field_u;
    private int field_m;
    private jg field_w;
    private int[] field_H;
    private dl field_A;
    private int[] field_I;
    private int[] field_Q;
    private int[] field_p;
    private int[] field_n;
    private int[] field_F;
    private lf[][] field_G;
    private long field_K;
    private ip field_J;
    private long field_t;
    private int field_v;
    private int field_N;
    private boolean field_s;
    private wj field_y;
    private int field_P;
    private boolean field_C;

    final synchronized sp c() {
        return (sp) (Object) ((rj) this).field_J;
    }

    final synchronized void a(int param0, byte param1) {
        ((rj) this).field_o = param0;
        if (param1 >= -21) {
            ((rj) this).field_N = 53;
        }
    }

    private final int a(lf param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 != -111) {
            this.b(10, (byte) 5, 56);
        }
        if (!(((rj) this).field_z[param0.field_z] != 0)) {
            return 0;
        }
        nf var9 = param0.field_t;
        nf var10 = var9;
        int var4 = 4096 + ((rj) this).field_I[param0.field_z] * ((rj) this).field_B[param0.field_z] >> -444117235;
        var4 = 16384 + var4 * var4 >> -1575844529;
        var4 = 16384 + param0.field_v * var4 >> -2055127153;
        var4 = var4 * ((rj) this).field_o - -128 >> 867453352;
        var4 = ((rj) this).field_z[param0.field_z] * var4 + 128 >> 406367240;
        if (!(0 >= var10.field_j)) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param0.field_p * 0.00001953125 * (double)var10.field_j) * (double)var4);
        }
        if (var10.field_h != null) {
            var5 = param0.field_l;
            var6 = var10.field_h[1 + param0.field_y];
            if (-2 + var10.field_h.length > param0.field_y) {
                var7 = 65280 & var9.field_h[param0.field_y] << 439719592;
                var8 = (255 & var10.field_h[2 + param0.field_y]) << -574550328;
                var6 = var6 + (var10.field_h[param0.field_y - -3] + -var6) * (-var7 + var5) / (var8 - var7);
            }
            var4 = var4 * var6 - -32 >> -1805216122;
        }
        if ((param0.field_k ^ -1) < -1) {
            if (null != var10.field_b) {
                var5 = param0.field_k;
                var6 = var10.field_b[param0.field_q + 1];
                if (!(-2 + var10.field_b.length <= param0.field_q)) {
                    var7 = (var9.field_b[param0.field_q] & 255) << 442913736;
                    var8 = 65280 & var10.field_b[param0.field_q + 2] << -1233186616;
                    var6 = var6 + (-var7 + var5) * (var10.field_b[3 + param0.field_q] + -var6) / (var8 + -var7);
                }
                var4 = var6 * var4 + 32 >> -172926938;
            }
        }
        return var4;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 24) {
            ((rj) this).field_x = null;
        }
        ((rj) this).field_p[param0] = param1;
        ((rj) this).field_r[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final void a(int param0, int param1, int param2, int param3) {
        lf var5 = null;
        gi var6 = null;
        int var6_int = 0;
        lf var7 = null;
        lf var8 = null;
        int var9 = 0;
        ma var10 = null;
        ma var11 = null;
        Object stackIn_17_0 = null;
        lf stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        lf stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        lf stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        Object stackOut_16_0 = null;
        lf stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_18_0 = null;
        lf stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        Object stackOut_17_0 = null;
        lf stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          this.b(param3, 116, param2, 64);
          if ((((rj) this).field_l[param3] & 2) != 0) {
            var5 = (lf) (Object) ((rj) this).field_J.field_s.e(0);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_z) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_k ^ -1)) {
                      ((rj) this).field_G[param3][var5.field_i] = null;
                      ((rj) this).field_G[param3][param2] = var5;
                      var6_int = var5.field_C - -(var5.field_A * var5.field_j >> -266517716);
                      var5.field_C = var5.field_C + (-var5.field_i + param2 << -282778168);
                      var5.field_j = 4096;
                      var5.field_A = -var5.field_C + var6_int;
                      var5.field_i = param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (lf) (Object) ((rj) this).field_J.field_s.c(26853);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (ma) (Object) ((rj) this).field_A.a((long)((rj) this).field_D[param3], param1 + 50);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_o[param2];
          if (var6 != null) {
            L3: {
              var7 = new lf();
              var7.field_u = var11;
              var7.field_s = var6;
              var7.field_z = param3;
              var7.field_t = var10.field_s[param2];
              var7.field_B = var10.field_t[param2];
              var7.field_i = param2;
              var7.field_v = var10.field_m[param2] * param0 * (param0 * var11.field_u) + 1024 >> -1030617685;
              var7.field_x = var10.field_h[param2] & 255;
              var7.field_C = (param2 << -847555384) + -(32767 & var10.field_j[param2]);
              var7.field_y = 0;
              var7.field_q = 0;
              var7.field_k = -1;
              var7.field_l = 0;
              var7.field_p = 0;
              if (0 != ((rj) this).field_O[param3]) {
                L4: {
                  var7.field_E = fn.a(var6, this.a(-20165, var7), 0, this.a(var7, true));
                  stackOut_16_0 = this;
                  stackOut_16_1 = (lf) var7;
                  stackOut_16_2 = -124;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if ((var11.field_j[param2] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (lf) (Object) stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (lf) (Object) stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L4;
                  }
                }
                ((rj) this).a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                break L3;
              } else {
                var7.field_E = fn.a(var6, this.a(-20165, var7), this.a(var7, (byte) -111), this.a(var7, true));
                break L3;
              }
            }
            L5: {
              if ((var11.field_j[param2] ^ -1) <= -1) {
                break L5;
              } else {
                var7.field_E.e(-1);
                break L5;
              }
            }
            L6: {
              if (0 <= var7.field_B) {
                L7: {
                  var8 = ((rj) this).field_x[param3][var7.field_B];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_k < 0) {
                      ((rj) this).field_G[param3][var8.field_i] = null;
                      var8.field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((rj) this).field_x[param3][var7.field_B] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((rj) this).field_J.field_s.a(param1 ^ param1, (le) (Object) var7);
            ((rj) this).field_G[param3][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        this.b(param2, false, param0);
        if (param1 >= -115) {
            boolean discarded$0 = ((rj) this).c((byte) 118);
        }
    }

    private final void b(byte param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == -128) {
          var3 = (lf) (Object) ((rj) this).field_J.field_s.b((byte) 26);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (param1 == var3.field_z) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (null != var3.field_E) {
                    L4: {
                      var3.field_E.c(qf.field_p / 100);
                      if (!var3.field_E.f()) {
                        break L4;
                      } else {
                        ((rj) this).field_J.field_m.b((sp) (Object) var3.field_E);
                        break L4;
                      }
                    }
                    var3.c((byte) 125);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (0 > var3.field_k) {
                    ((rj) this).field_G[var3.field_z][var3.field_i] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3.b(-27598);
                break L1;
              }
              var3 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1) {
        lf var3 = null;
        int var4 = ZombieDawn.field_J;
        if (!(0 == (((rj) this).field_l[param1] & 4))) {
            var3 = (lf) (Object) ((rj) this).field_J.field_s.b((byte) 26);
            while (var3 != null) {
                if (!(var3.field_z != param1)) {
                    var3.field_D = 0;
                }
                var3 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
            }
        }
        if (param0 < 45) {
            ((rj) this).field_o = 124;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 > -126) {
            ((rj) this).field_P = 31;
        }
        ((rj) this).field_L[param0] = param2;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!param0) {
            this.d(0, -1);
        } else {
            this.b((byte) -128, -1);
        }
        this.b(-1, 8192);
        if (param1 != 256) {
            Object var5 = null;
            this.a((wj) null, (byte) 109, true, false);
        }
        for (var3 = 0; 16 > var3; var3++) {
            ((rj) this).field_D[var3] = ((rj) this).field_F[var3];
        }
        int var6 = 0;
        var3 = var6;
        while (-17 < (var6 ^ -1)) {
            ((rj) this).field_M[var6] = eg.a(-128, ((rj) this).field_F[var6]);
            var6++;
        }
    }

    final synchronized int a() {
        return 0;
    }

    final void a(lf param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param0.field_s.field_l.length;
            if (!param2) {
              break L1;
            } else {
              if (param0.field_s.field_j) {
                var6 = -param0.field_s.field_i + (var4 + var4);
                var5 = (int)((long)((rj) this).field_O[param0.field_z] * (long)var6 >> -379715962);
                var4 = var4 << 8;
                if (var4 <= var5) {
                  var5 = -1 + var4 - (-var4 - -var5);
                  param0.field_E.a(true);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((rj) this).field_O[param0.field_z] >> 1407356230);
          break L0;
        }
        param0.field_E.d(var5);
        var6 = -124 % ((param1 - -79) / 43);
    }

    final boolean b(int param0, lf param1) {
        if (null == param1.field_E) {
            if ((param1.field_k ^ -1) > -1) {
                return true;
            }
            param1.b(param0 + -57894);
            if (-1 > (param1.field_B ^ -1)) {
                if (!(param1 != ((rj) this).field_x[param1.field_z][param1.field_B])) {
                    ((rj) this).field_x[param1.field_z][param1.field_B] = null;
                }
            }
            return true;
        }
        if (param0 != 30296) {
            return false;
        }
        return false;
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param0 != 11664) {
            Object var6 = null;
            ((rj) this).a((lf) null, -31, true);
        }
    }

    final synchronized void c(int param0) {
        this.a(true, (byte) -71);
        if (param0 != 28013) {
            Object var3 = null;
            ((rj) this).a((int[]) null, 52, -103);
        }
    }

    final synchronized boolean c(byte param0) {
        if (param0 != -34) {
            ((rj) this).field_t = 28L;
        }
        return ((rj) this).field_w.a();
    }

    final synchronized sp d() {
        return null;
    }

    private final synchronized void a(wj param0, byte param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        this.a(param2, (byte) -71);
        ((rj) this).field_w.a(param0.field_i);
        ((rj) this).field_s = param3 ? true : false;
        ((rj) this).field_K = 0L;
        int var5 = ((rj) this).field_w.d();
        for (var6 = 0; var5 > var6; var6++) {
            ((rj) this).field_w.f(var6);
            ((rj) this).field_w.c(var6);
            ((rj) this).field_w.b(var6);
        }
        ((rj) this).field_N = ((rj) this).field_w.b();
        ((rj) this).field_v = ((rj) this).field_w.field_f[((rj) this).field_N];
        ((rj) this).field_t = ((rj) this).field_w.a(((rj) this).field_v);
        if (param1 >= -122) {
            Object var8 = null;
            boolean discarded$0 = ((rj) this).a((wj) null, (byte) -81, (dj) null, -58, (ka) null);
        }
    }

    final synchronized boolean a(wj param0, byte param1, dj param2, int param3, ka param4) {
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        bh var9 = null;
        int var10 = 0;
        ma var11 = null;
        int var12 = 0;
        L0: {
          var12 = ZombieDawn.field_J;
          param0.b();
          var8 = 121 / ((param1 - -78) / 32);
          var6 = 1;
          var7 = null;
          if ((param3 ^ -1) < -1) {
            var7 = (Object) (Object) new int[]{param3};
            break L0;
          } else {
            break L0;
          }
        }
        var9 = (bh) (Object) param0.field_h.a((byte) -113);
        L1: while (true) {
          if (var9 == null) {
            L2: {
              if (var6 != 0) {
                param0.a();
                break L2;
              } else {
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              L4: {
                var10 = (int)var9.field_f;
                var11 = (ma) (Object) ((rj) this).field_A.a((long)var10, 101);
                if (var11 == null) {
                  L5: {
                    var11 = vk.a(param2, var10, 0);
                    if (var11 != null) {
                      ((rj) this).field_A.a(-106, (long)var10, (le) (Object) var11);
                      break L5;
                    } else {
                      var6 = 0;
                      break L5;
                    }
                  }
                  if (var11 == null) {
                    break L3;
                  } else {
                    if (!var11.a(true, (int[]) var7, param4, var9.field_k)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  if (var11 == null) {
                    break L3;
                  } else {
                    if (!var11.a(true, (int[]) var7, param4, var9.field_k)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var6 = 0;
              break L3;
            }
            var9 = (bh) (Object) param0.field_h.b((byte) 99);
            continue L1;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          var2 = ((rj) this).field_N;
          if (!param0) {
            break L0;
          } else {
            ((rj) this).field_H = null;
            break L0;
          }
        }
        L1: {
          var3 = ((rj) this).field_v;
          var4 = ((rj) this).field_t;
          if (((rj) this).field_y == null) {
            break L1;
          } else {
            if (var3 == ((rj) this).field_P) {
              this.a(((rj) this).field_y, (byte) -125, ((rj) this).field_C, ((rj) this).field_s);
              this.a(false);
              return;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if (var3 != ((rj) this).field_v) {
            L3: {
              ((rj) this).field_t = var4;
              ((rj) this).field_N = var2;
              ((rj) this).field_v = var3;
              if (((rj) this).field_y == null) {
                break L3;
              } else {
                if (((rj) this).field_P < var3) {
                  ((rj) this).field_N = -1;
                  ((rj) this).field_v = ((rj) this).field_P;
                  ((rj) this).field_t = ((rj) this).field_w.a(((rj) this).field_v);
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
                if (var3 != ((rj) this).field_w.field_f[var2]) {
                  break L5;
                } else {
                  ((rj) this).field_w.f(var2);
                  var6 = ((rj) this).field_w.d(var2);
                  if (-2 == (var6 ^ -1)) {
                    ((rj) this).field_w.c();
                    ((rj) this).field_w.b(var2);
                    if (!((rj) this).field_w.f()) {
                      break L5;
                    } else {
                      if (((rj) this).field_y == null) {
                        L6: {
                          if (!((rj) this).field_s) {
                            break L6;
                          } else {
                            if (0 != var3) {
                              ((rj) this).field_w.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, 256);
                        ((rj) this).field_w.e();
                        return;
                      } else {
                        ((rj) this).a((byte) -22, ((rj) this).field_y, ((rj) this).field_s);
                        this.a(false);
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if (0 == (var6 & 128)) {
                        break L7;
                      } else {
                        this.a((byte) -80, var6);
                        break L7;
                      }
                    }
                    ((rj) this).field_w.c(var2);
                    ((rj) this).field_w.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((rj) this).field_w.b();
              var3 = ((rj) this).field_w.field_f[var2];
              var4 = ((rj) this).field_w.a(var3);
              continue L2;
            }
          }
        }
    }

    final static void d(int param0) {
        if (!(dl.a(false))) {
            return;
        }
        if (param0 > -101) {
            return;
        }
        ti.a(4, 90, false);
    }

    private final void d(int param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var3 = (lf) (Object) ((rj) this).field_J.field_s.b((byte) 26);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((rj) this).a(7, true);
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
                  if (param1 != var3.field_z) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-1 < (var3.field_k ^ -1)) {
                ((rj) this).field_G[var3.field_z][var3.field_i] = null;
                var3.field_k = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
            continue L0;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        lf var6 = null;
        int var7 = ZombieDawn.field_J;
        if (param1 < 108) {
            return;
        }
        lf var8 = ((rj) this).field_G[param0][param2];
        if (var8 == null) {
            return;
        }
        ((rj) this).field_G[param0][param2] = null;
        if ((2 & ((rj) this).field_l[param0]) == 0) {
            var8.field_k = 0;
        } else {
            var6 = (lf) (Object) ((rj) this).field_J.field_s.b((byte) 26);
            while (var6 != null) {
                if (var8.field_z == var6.field_z) {
                    if (0 > var6.field_k) {
                        if (var6 != var8) {
                            var8.field_k = 0;
                            break;
                        }
                    }
                }
                var6 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
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
            var8 = ZombieDawn.field_J;
            if (!((rj) this).field_w.a()) {
              break L1;
            } else {
              var4 = ((rj) this).field_w.field_b * ((rj) this).field_m / qf.field_p;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((rj) this).field_K;
                if (-1L >= (((rj) this).field_t - var5 ^ -1L)) {
                  ((rj) this).field_K = var5;
                  break L1;
                } else {
                  var7 = (int)((-1L + ((long)var4 + (-((rj) this).field_K + ((rj) this).field_t))) / (long)var4);
                  ((rj) this).field_K = ((rj) this).field_K + (long)var4 * (long)var7;
                  ((rj) this).field_J.a(param0, param1, var7);
                  param1 = param1 + var7;
                  this.a(false);
                  param2 = param2 - var7;
                  if (((rj) this).field_w.a()) {
                    continue L2;
                  } else {
                    ((rj) this).field_J.a(param0, param1, param2);
                    break L0;
                  }
                }
              }
            }
          }
          ((rj) this).field_J.a(param0, param1, param2);
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 >= -51) {
            ((rj) this).a(38, (byte) 112, 58);
        }
    }

    private final void b(int param0, boolean param1, int param2) {
        ((rj) this).field_F[param0] = param2;
        ((rj) this).field_M[param0] = eg.a(-128, param2);
        this.a(0, param0, param2);
        if (param1) {
            ((rj) this).field_F = null;
        }
    }

    private final int a(lf param0, boolean param1) {
        if (!param1) {
            return 28;
        }
        int var3 = ((rj) this).field_q[param0.field_z];
        if (8192 <= var3) {
            return 16384 + -((-param0.field_x + 128) * (16384 - var3) + 32 >> -152720954);
        }
        return var3 * param0.field_x - -32 >> -1840596762;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param1) {
            break L0;
          } else {
            ((rj) this).field_n = null;
            break L0;
          }
        }
        L1: {
          if (-1 >= (param2 ^ -1)) {
            ((rj) this).field_z[param2] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L1;
              } else {
                ((rj) this).field_z[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 == 0) {
            break L0;
          } else {
            this.b(122, 44, 94, 110);
            break L0;
          }
        }
        L1: {
          if ((2 & ((rj) this).field_l[param1]) == 0) {
            break L1;
          } else {
            var3 = (lf) (Object) ((rj) this).field_J.field_s.b((byte) 26);
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (var3.field_z != param1) {
                    break L3;
                  } else {
                    if (null == ((rj) this).field_G[param1][var3.field_i]) {
                      if (var3.field_k < 0) {
                        var3.field_k = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var3 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
                      continue L2;
                    }
                  }
                }
                var3 = (lf) (Object) ((rj) this).field_J.field_s.a(false);
                continue L2;
              }
            }
          }
        }
    }

    final synchronized void a(byte param0, wj param1, boolean param2) {
        this.a(param1, (byte) -126, true, param2);
        if (param0 != -22) {
            this.a((byte) -8, 95);
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var3 = param1 & 240;
        if ((var3 ^ -1) != -129) {
          if (-145 == (var3 ^ -1)) {
            var4 = param1 & 15;
            var5 = (param1 & 32553) >> -931388408;
            var6 = param1 >> 1306116976 & 127;
            if ((var6 ^ -1) < -1) {
              this.a(var6, 0, var5, var4);
              return;
            } else {
              this.b(var4, 110, var5, 64);
              return;
            }
          } else {
            if (var3 != 160) {
              if (var3 != 176) {
                if (192 != var3) {
                  if (208 == var3) {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> 559831912;
                    this.b(var4, var5, -124);
                    return;
                  } else {
                    if (224 != var3) {
                      var3 = param1 & 255;
                      if ((var3 ^ -1) != -256) {
                        var4 = 28 / ((58 - param0) / 50);
                        return;
                      } else {
                        this.a(true, 256);
                        return;
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = ((8323514 & param1) >> -503147191) - -(127 & param1 >> -927146392);
                      this.b(var4, (byte) -128, var5);
                      return;
                    }
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (32557 & param1) >> -891689528;
                  this.a(0, var4, var5 + ((rj) this).field_M[var4]);
                  return;
                }
              } else {
                L0: {
                  var4 = 15 & param1;
                  var5 = 127 & param1 >> -1813894776;
                  var6 = 127 & param1 >> -1564265648;
                  if (0 == var5) {
                    ((rj) this).field_M[var4] = eg.a(((rj) this).field_M[var4], -2080769) + (var6 << 1890319982);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (-33 == (var5 ^ -1)) {
                    ((rj) this).field_M[var4] = (var6 << 987693031) + eg.a(((rj) this).field_M[var4], -16257);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((var5 ^ -1) != -2) {
                    break L2;
                  } else {
                    ((rj) this).field_n[var4] = eg.a(-16257, ((rj) this).field_n[var4]) + (var6 << 1713452487);
                    break L2;
                  }
                }
                L3: {
                  if (var5 != 33) {
                    break L3;
                  } else {
                    ((rj) this).field_n[var4] = eg.a(-128, ((rj) this).field_n[var4]) + var6;
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((rj) this).field_H[var4] = (var6 << -1628296121) + eg.a(-16257, ((rj) this).field_H[var4]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-38 == (var5 ^ -1)) {
                    ((rj) this).field_H[var4] = eg.a(((rj) this).field_H[var4], -128) + var6;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-8 != (var5 ^ -1)) {
                    break L6;
                  } else {
                    ((rj) this).field_I[var4] = (var6 << -1131444121) + eg.a(-16257, ((rj) this).field_I[var4]);
                    break L6;
                  }
                }
                L7: {
                  if ((var5 ^ -1) != -40) {
                    break L7;
                  } else {
                    ((rj) this).field_I[var4] = eg.a(-128, ((rj) this).field_I[var4]) - -var6;
                    break L7;
                  }
                }
                L8: {
                  if (-11 != (var5 ^ -1)) {
                    break L8;
                  } else {
                    ((rj) this).field_q[var4] = (var6 << 1041329863) + eg.a(((rj) this).field_q[var4], -16257);
                    break L8;
                  }
                }
                L9: {
                  if (var5 == 42) {
                    ((rj) this).field_q[var4] = eg.a(((rj) this).field_q[var4], -128) - -var6;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if ((var5 ^ -1) != -12) {
                    break L10;
                  } else {
                    ((rj) this).field_B[var4] = eg.a(((rj) this).field_B[var4], -16257) + (var6 << -461645849);
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((rj) this).field_B[var4] = var6 + eg.a(-128, ((rj) this).field_B[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 != 64) {
                    break L12;
                  } else {
                    if (var6 < 64) {
                      ((rj) this).field_l[var4] = eg.a(((rj) this).field_l[var4], -2);
                      break L12;
                    } else {
                      ((rj) this).field_l[var4] = hi.a(((rj) this).field_l[var4], 1);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (-65 < (var6 ^ -1)) {
                      this.a(0, var4);
                      ((rj) this).field_l[var4] = eg.a(((rj) this).field_l[var4], -3);
                      break L13;
                    } else {
                      ((rj) this).field_l[var4] = hi.a(((rj) this).field_l[var4], 2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-100 != (var5 ^ -1)) {
                    break L14;
                  } else {
                    ((rj) this).field_u[var4] = eg.a(127, ((rj) this).field_u[var4]) - -(var6 << 463574023);
                    break L14;
                  }
                }
                L15: {
                  if (98 == var5) {
                    ((rj) this).field_u[var4] = eg.a(16256, ((rj) this).field_u[var4]) - -var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-102 != (var5 ^ -1)) {
                    break L16;
                  } else {
                    ((rj) this).field_u[var4] = 16384 - (-eg.a(((rj) this).field_u[var4], 127) + -(var6 << -1720646681));
                    break L16;
                  }
                }
                L17: {
                  if ((var5 ^ -1) == -101) {
                    ((rj) this).field_u[var4] = var6 + eg.a(((rj) this).field_u[var4], 16256) + 16384;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if ((var5 ^ -1) == -121) {
                    this.b((byte) -128, var4);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (121 == var5) {
                    this.b(var4, 8192);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((var5 ^ -1) != -124) {
                    break L20;
                  } else {
                    this.d(0, var4);
                    break L20;
                  }
                }
                L21: {
                  if ((var5 ^ -1) == -7) {
                    var7 = ((rj) this).field_u[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L21;
                    } else {
                      ((rj) this).field_Q[var4] = eg.a(-16257, ((rj) this).field_Q[var4]) - -(var6 << 1134049671);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-39 != (var5 ^ -1)) {
                    break L22;
                  } else {
                    var7 = ((rj) this).field_u[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((rj) this).field_Q[var4] = var6 + eg.a(((rj) this).field_Q[var4], -128);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 == 16) {
                    ((rj) this).field_O[var4] = (var6 << 1161470279) + eg.a(-16257, ((rj) this).field_O[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (48 != var5) {
                    break L24;
                  } else {
                    ((rj) this).field_O[var4] = eg.a(((rj) this).field_O[var4], -128) - -var6;
                    break L24;
                  }
                }
                L25: {
                  if (-82 != (var5 ^ -1)) {
                    break L25;
                  } else {
                    if (var6 < 64) {
                      this.c(95, var4);
                      ((rj) this).field_l[var4] = eg.a(((rj) this).field_l[var4], -5);
                      break L25;
                    } else {
                      ((rj) this).field_l[var4] = hi.a(((rj) this).field_l[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (var5 != 17) {
                    break L26;
                  } else {
                    this.a(var4, (((rj) this).field_p[var4] & -16257) + (var6 << -1789718681), (byte) 119);
                    break L26;
                  }
                }
                L27: {
                  if (-50 == (var5 ^ -1)) {
                    this.a(var4, var6 + (-128 & ((rj) this).field_p[var4]), (byte) 88);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            } else {
              var4 = 15 & param1;
              var5 = (32580 & param1) >> -1701763448;
              var6 = (param1 & 8354293) >> -144552976;
              this.c(11664, var4, var5, var6);
              return;
            }
          }
        } else {
          var4 = 15 & param1;
          var5 = (32713 & param1) >> 524025768;
          var6 = (8352632 & param1) >> 473847792;
          this.b(var4, 125, var5, var6);
          return;
        }
    }

    final boolean a(int param0, int param1, lf param2, int[] param3, int param4) {
        int var6 = 0;
        nf var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawn.field_J;
          param2.field_r = qf.field_p / 100;
          if (param0 == -32464) {
            break L0;
          } else {
            ((rj) this).field_G = null;
            break L0;
          }
        }
        L1: {
          if (-1 < (param2.field_k ^ -1)) {
            break L1;
          } else {
            L2: {
              if (param2.field_E == null) {
                break L2;
              } else {
                if (!param2.field_E.l()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              param2.c((byte) 125);
              param2.b(-27598);
              if (-1 <= (param2.field_B ^ -1)) {
                break L3;
              } else {
                if (((rj) this).field_x[param2.field_z][param2.field_B] == param2) {
                  ((rj) this).field_x[param2.field_z][param2.field_B] = null;
                  break L3;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        L4: {
          var6 = param2.field_j;
          if (-1 > (var6 ^ -1)) {
            L5: {
              var6 = var6 - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((rj) this).field_H[param2.field_z]) * 16.0 + 0.5);
              if (0 <= var6) {
                break L5;
              } else {
                var6 = 0;
                break L5;
              }
            }
            param2.field_j = var6;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          param2.field_E.f(this.a(param0 + 12299, param2));
          var7 = param2.field_t;
          param2.field_o = param2.field_o + 1;
          var8 = 0;
          param2.field_w = param2.field_w + var7.field_a;
          var9 = 0.000005086263020833333 * (double)((param2.field_i - 60 << -1413567736) - -(param2.field_A * param2.field_j >> -522595188));
          if (var7.field_j > 0) {
            L7: {
              if (0 < var7.field_c) {
                param2.field_p = param2.field_p + (int)(Math.pow(2.0, (double)var7.field_c * var9) * 128.0 + 0.5);
                break L7;
              } else {
                param2.field_p = param2.field_p + 128;
                break L7;
              }
            }
            if ((var7.field_j * param2.field_p ^ -1) > -819201) {
              break L6;
            } else {
              var8 = 1;
              break L6;
            }
          } else {
            break L6;
          }
        }
        L8: {
          if (null == var7.field_h) {
            break L8;
          } else {
            L9: {
              if (0 < var7.field_i) {
                param2.field_l = param2.field_l + (int)(Math.pow(2.0, var9 * (double)var7.field_i) * 128.0 + 0.5);
                break L9;
              } else {
                param2.field_l = param2.field_l + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (var7.field_h.length - 2 <= param2.field_y) {
                  break L11;
                } else {
                  if ((var7.field_h[param2.field_y - -2] & 255) << -737909368 >= param2.field_l) {
                    break L11;
                  } else {
                    param2.field_y = param2.field_y + 2;
                    continue L10;
                  }
                }
              }
              if (param2.field_y != var7.field_h.length - 2) {
                break L8;
              } else {
                if (var7.field_h[1 + param2.field_y] == 0) {
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
          if (param2.field_k < 0) {
            break L12;
          } else {
            if (null == var7.field_b) {
              break L12;
            } else {
              if ((((rj) this).field_l[param2.field_z] & 1) == 0) {
                L13: {
                  if ((param2.field_B ^ -1) > -1) {
                    break L13;
                  } else {
                    if (((rj) this).field_x[param2.field_z][param2.field_B] == param2) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-1 > (var7.field_e ^ -1)) {
                    param2.field_k = param2.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_e * var9));
                    break L14;
                  } else {
                    param2.field_k = param2.field_k + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (param2.field_q >= var7.field_b.length + -2) {
                      break L16;
                    } else {
                      if (param2.field_k <= (var7.field_b[param2.field_q - -2] << 1682596488 & 65280)) {
                        break L16;
                      } else {
                        param2.field_q = param2.field_q + 2;
                        continue L15;
                      }
                    }
                  }
                  if (-2 + var7.field_b.length == param2.field_q) {
                    var8 = 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
          }
        }
        if (var8 == 0) {
          param2.field_E.a(param2.field_r, this.a(param2, (byte) -111), this.a(param2, true));
          return false;
        } else {
          L17: {
            param2.field_E.c(param2.field_r);
            if (param3 != null) {
              param2.field_E.a(param3, param1, param4);
              break L17;
            } else {
              param2.field_E.a(param4);
              break L17;
            }
          }
          L18: {
            if (param2.field_E.f()) {
              ((rj) this).field_J.field_m.b((sp) (Object) param2.field_E);
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            param2.c((byte) 123);
            if (-1 < (param2.field_k ^ -1)) {
              break L19;
            } else {
              param2.b(-27598);
              if (param2.field_B <= 0) {
                break L19;
              } else {
                if (((rj) this).field_x[param2.field_z][param2.field_B] != param2) {
                  break L19;
                } else {
                  ((rj) this).field_x[param2.field_z][param2.field_B] = null;
                  break L19;
                }
              }
            }
          }
          return true;
        }
    }

    private final int a(int param0, lf param1) {
        int var3 = 0;
        nf var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = (param1.field_j * param1.field_A >> -1388421748) + param1.field_C;
        if (param0 == -20165) {
          L0: {
            var3 = var3 + ((((rj) this).field_L[param1.field_z] + -8192) * ((rj) this).field_Q[param1.field_z] >> -752114804);
            var4 = param1.field_t;
            if ((var4.field_a ^ -1) >= -1) {
              break L0;
            } else {
              L1: {
                if (-1 > (var4.field_f ^ -1)) {
                  break L1;
                } else {
                  if (((rj) this).field_n[param1.field_z] <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var5 = var4.field_f << -923059134;
                var6 = var4.field_g << -1153758751;
                if (var6 > param1.field_o) {
                  var5 = param1.field_o * var5 / var6;
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = var5 + (((rj) this).field_n[param1.field_z] >> -954782873);
              var7 = Math.sin(0.01227184630308513 * (double)(param1.field_w & 511));
              var3 = var3 + (int)(var7 * (double)var5);
              break L0;
            }
          }
          L3: {
            var5 = (int)(0.5 + (double)(256 * param1.field_s.field_m) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)qf.field_p);
            if (1 > var5) {
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
          return 76;
        }
    }

    final synchronized void a(int param0, boolean param1) {
        ((rj) this).field_m = param0;
        if (param1) {
            this.a(27, -63, 10);
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((rj) this).field_w.e();
        ((rj) this).field_y = null;
        if (param1 != -71) {
            ((rj) this).c(64);
        }
        this.a(param0, 256);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          if (!((rj) this).field_w.a()) {
            break L0;
          } else {
            var2 = ((rj) this).field_m * ((rj) this).field_w.field_b / qf.field_p;
            L1: while (true) {
              var3 = ((rj) this).field_K + (long)param0 * (long)var2;
              if (-1L >= (((rj) this).field_t - var3 ^ -1L)) {
                ((rj) this).field_K = var3;
                break L0;
              } else {
                var5 = (int)((-((rj) this).field_K + (((rj) this).field_t + ((long)var2 - 1L))) / (long)var2);
                ((rj) this).field_K = ((rj) this).field_K + (long)var2 * (long)var5;
                ((rj) this).field_J.a(var5);
                param0 = param0 - var5;
                this.a(false);
                if (!((rj) this).field_w.a()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((rj) this).field_J.a(param0);
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (-1 >= (param0 ^ -1)) {
          ((rj) this).field_I[param0] = 12800;
          ((rj) this).field_q[param0] = 8192;
          ((rj) this).field_B[param0] = 16383;
          ((rj) this).field_L[param0] = 8192;
          ((rj) this).field_n[param0] = 0;
          ((rj) this).field_H[param0] = param1;
          this.a(0, param0);
          this.c(param1 + -8116, param0);
          ((rj) this).field_l[param0] = 0;
          ((rj) this).field_u[param0] = 32767;
          ((rj) this).field_Q[param0] = 256;
          ((rj) this).field_O[param0] = 0;
          this.a(param0, 8192, (byte) 117);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.b(param0, param1 ^ 0);
              param0++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        if (param0 != 0) {
            this.d(59, 36);
        }
        if (!(((rj) this).field_D[param1] == param2)) {
            ((rj) this).field_D[param1] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((rj) this).field_x[param1][var4] = null;
            }
        }
    }

    public rj() {
        ((rj) this).field_B = new int[16];
        ((rj) this).field_L = new int[16];
        ((rj) this).field_O = new int[16];
        ((rj) this).field_x = new lf[16][128];
        ((rj) this).field_r = new int[16];
        ((rj) this).field_q = new int[16];
        ((rj) this).field_D = new int[16];
        ((rj) this).field_m = 1000000;
        ((rj) this).field_u = new int[16];
        ((rj) this).field_z = new int[16];
        ((rj) this).field_l = new int[16];
        ((rj) this).field_Q = new int[16];
        ((rj) this).field_p = new int[16];
        ((rj) this).field_H = new int[16];
        ((rj) this).field_F = new int[16];
        ((rj) this).field_o = 256;
        ((rj) this).field_I = new int[16];
        ((rj) this).field_n = new int[16];
        ((rj) this).field_G = new lf[16][128];
        ((rj) this).field_M = new int[16];
        ((rj) this).field_w = new jg();
        ((rj) this).field_J = new ip((rj) this);
        ((rj) this).field_A = new dl(128);
        ((rj) this).a(256, true, -1);
        this.a(true, 256);
    }

    static {
    }
}
