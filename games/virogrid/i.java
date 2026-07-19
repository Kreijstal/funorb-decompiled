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
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_int = this.field_p[param1.field_h];
            if (param0 >= 89) {
              if (-8193 >= (var3_int ^ -1)) {
                stackOut_6_0 = -(32 + (-param1.field_g + 128) * (16384 + -var3_int) >> -494583322) + 16384;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = var3_int * param1.field_g - -32 >> -1084572922;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 10;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("i.TA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized in b() {
        return null;
    }

    final synchronized void e(int param0, int param1) {
        if (param0 != 2) {
            return;
        }
        this.field_T = param1;
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
          if (0 != (this.field_U[param3] & 2)) {
            var5 = (wn) ((Object) this.field_L.field_k.b(false));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_h != param3) {
                    break L2;
                  } else {
                    if (var5.field_o < 0) {
                      this.field_K[param3][var5.field_l] = null;
                      this.field_K[param3][param0] = var5;
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
                var5 = (wn) ((Object) this.field_L.field_k.e(9003));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (rc) ((Object) this.field_o.a((long)this.field_P[param3], -14905));
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
              if (this.field_S[param3] != 0) {
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
                this.a(stackIn_19_1 != 0, -16257, var7);
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
                  var8 = this.field_u[param3][var7.field_G];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_o >= 0) {
                      break L7;
                    } else {
                      this.field_K[param3][var8.field_l] = null;
                      var8.field_o = 0;
                      break L7;
                    }
                  }
                }
                this.field_u[param3][var7.field_G] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_L.field_k.a(var7, (byte) -109);
            this.field_K[param3][param0] = var7;
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
        var3 = (wn) ((Object) this.field_L.field_k.a((byte) -41));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) > -1) {
                  break L3;
                } else {
                  if (param0 != var3.field_h) {
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
                      this.field_L.field_n.a(var3.field_p);
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
                  this.field_K[var3.field_h][var3.field_l] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.a(false);
              break L2;
            }
            var3 = (wn) ((Object) this.field_L.field_k.a(16213));
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
        if (0 != (2 & this.field_U[param0])) {
            var3 = (wn) ((Object) this.field_L.field_k.a((byte) -96));
            while (var3 != null) {
                if (var3.field_h == param0) {
                    if (this.field_K[param0][var3.field_l] == null) {
                        if (!(var3.field_o >= 0)) {
                            var3.field_o = 0;
                        }
                    }
                }
                var3 = (wn) ((Object) this.field_L.field_k.a(16213));
            }
        }
    }

    private final void a(int param0, int param1) {
        wn var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (0 != (this.field_U[param0] & 4)) {
            var3 = (wn) ((Object) this.field_L.field_k.a((byte) -78));
            while (var3 != null) {
                if (!(var3.field_h != param0)) {
                    var3.field_B = 0;
                }
                var3 = (wn) ((Object) this.field_L.field_k.a(16213));
            }
        }
        if (param1 >= -101) {
            this.b(67, -128, 74);
        }
    }

    final static dh a(int param0, int param1, int param2, int param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        dh var4 = (dh) ((Object) bl.field_D.a((byte) -121));
        while (var4 != null) {
            if (!(var4.field_i != param0)) {
                return var4;
            }
            var4 = (dh) ((Object) bl.field_D.a(16213));
        }
        if (param3 >= -11) {
            return (dh) null;
        }
        var4 = new dh();
        var4.field_i = param0;
        var4.field_g = param2;
        bl.field_D.a(var4, (byte) -108);
        gl.a(var4, (byte) 89, param1);
        return var4;
    }

    final synchronized boolean d(int param0) {
        if (param0 <= 110) {
            return false;
        }
        return this.field_O.c();
    }

    final synchronized void e(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        rc var2 = (rc) ((Object) this.field_o.a((byte) 19));
        if (param0 != -1) {
            this.b(-51, (byte) -4);
        }
        while (var2 != null) {
            var2.a((byte) -90);
            var2 = (rc) ((Object) this.field_o.a(param0 ^ -95));
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
          var2 = this.field_Q;
          var3 = this.field_x;
          var4 = this.field_C;
          if (this.field_A == null) {
            break L0;
          } else {
            if (var3 == this.field_s) {
              this.a(this.field_A, false, this.field_t, this.field_n);
              this.c(22228);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (var3 != this.field_x) {
            if (param0 == 22228) {
              L2: {
                this.field_Q = var2;
                this.field_x = var3;
                this.field_C = var4;
                if (this.field_A == null) {
                  break L2;
                } else {
                  if (var3 <= this.field_s) {
                    break L2;
                  } else {
                    this.field_Q = -1;
                    this.field_x = this.field_s;
                    this.field_C = this.field_O.c(this.field_x);
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
                if (var3 != this.field_O.field_a[var2]) {
                  break L4;
                } else {
                  this.field_O.f(var2);
                  var6 = this.field_O.e(var2);
                  if (var6 == 1) {
                    this.field_O.e();
                    this.field_O.d(var2);
                    if (!this.field_O.d()) {
                      break L4;
                    } else {
                      if (null != this.field_A) {
                        this.a(this.field_t, 37, this.field_A);
                        this.c(22228);
                        return;
                      } else {
                        L5: {
                          if (!this.field_t) {
                            break L5;
                          } else {
                            if (0 != var3) {
                              this.field_O.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a((byte) -22, true);
                        this.field_O.g();
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
                    this.field_O.b(var2);
                    this.field_O.d(var2);
                    continue L3;
                  }
                }
              }
              var2 = this.field_O.f();
              var3 = this.field_O.field_a[var2];
              var4 = this.field_O.c(var3);
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
              this.field_k[param2] = param0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -17) {
                  break L0;
                } else {
                  this.field_k[var4] = param0;
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
            this.field_G = (int[]) null;
        }
        this.field_O.g();
        this.field_A = null;
        this.a((byte) -22, param1);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          if (this.field_O.c()) {
            var2 = this.field_O.field_c * this.field_l / ua.field_p;
            L1: while (true) {
              L2: {
                var3 = (long)var2 * (long)param0 + this.field_m;
                if ((this.field_C + -var3 ^ -1L) > -1L) {
                  var5 = (int)((-1L + (long)var2 + (this.field_C - this.field_m)) / (long)var2);
                  this.field_m = this.field_m + (long)var5 * (long)var2;
                  this.field_L.a(var5);
                  param0 = param0 - var5;
                  this.c(22228);
                  if (!this.field_O.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  this.field_m = var3;
                  break L2;
                }
              }
              this.field_L.a(param0);
              break L0;
            }
          } else {
            this.field_L.a(param0);
            break L0;
          }
        }
    }

    private final int a(wn param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        qd var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -94) {
                break L1;
              } else {
                this.field_u = (wn[][]) null;
                break L1;
              }
            }
            L2: {
              var3_int = (param0.field_w * param0.field_v >> 1168587532) + param0.field_u;
              var3_int = var3_int + ((-8192 + this.field_r[param0.field_h]) * this.field_B[param0.field_h] >> 1908781068);
              var4 = param0.field_t;
              if (-1 <= (var4.field_h ^ -1)) {
                break L2;
              } else {
                L3: {
                  if ((var4.field_j ^ -1) < -1) {
                    break L3;
                  } else {
                    if (this.field_R[param0.field_h] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_j << -840280126;
                  var6 = var4.field_b << -1713215775;
                  if (var6 <= param0.field_x) {
                    break L4;
                  } else {
                    var5 = var5 * param0.field_x / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_R[param0.field_h] >> -363246265);
                var7 = Math.sin((double)(511 & param0.field_r) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var5 * var7);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(256 * param0.field_q.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ua.field_p);
              if (var5 >= 1) {
                stackOut_11_0 = var5;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("i.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    private final void c(int param0, byte param1) {
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            this.field_G[param0] = 12800;
            if (param1 == 94) {
              break L0;
            } else {
              this.a(-89, (byte) -60, 95);
              break L0;
            }
          }
          this.field_p[param0] = 8192;
          this.field_q[param0] = 16383;
          this.field_r[param0] = 8192;
          this.field_R[param0] = 0;
          this.field_J[param0] = 8192;
          this.b(param0, 45);
          this.a(param0, -113);
          this.field_U[param0] = 0;
          this.field_N[param0] = 32767;
          this.field_B[param0] = 256;
          this.field_S[param0] = 0;
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
            field_D = (String) null;
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
        var3 = (wn) ((Object) this.field_L.field_k.a((byte) -62));
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
                this.field_K[var3.field_h][var3.field_l] = null;
                var3.field_o = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (wn) ((Object) this.field_L.field_k.a(16213));
            continue L1;
          }
        }
    }

    private final synchronized void a(sc param0, boolean param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        this.a(-8193, param3);
        this.field_O.a(param0.field_g);
        this.field_m = 0L;
        this.field_t = param2 ? true : false;
        int var5_int = this.field_O.a();
        for (var6 = 0; var5_int > var6; var6++) {
            this.field_O.f(var6);
            this.field_O.b(var6);
            this.field_O.d(var6);
        }
        if (param1) {
            return;
        }
        try {
            this.field_Q = this.field_O.f();
            this.field_x = this.field_O.field_a[this.field_Q];
            this.field_C = this.field_O.c(this.field_x);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "i.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        if (param2) {
            this.field_Q = 117;
        }
        this.c(127, param0, param1);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, wn param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        qd var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_D = ua.field_p / 100;
              if ((param4.field_o ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (param4.field_p == null) {
                    break L2;
                  } else {
                    if (!param4.field_p.j()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param4.c(-11382);
                  param4.a(false);
                  if (0 >= param4.field_G) {
                    break L3;
                  } else {
                    if (this.field_u[param4.field_h][param4.field_G] != param4) {
                      break L3;
                    } else {
                      this.field_u[param4.field_h][param4.field_G] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param4.field_v;
              if ((var6_int ^ -1) < -1) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_J[param4.field_h] * 0.0004921259842519685) * 16.0);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param4.field_v = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param4.field_p.c(this.a(param4, -119));
              var7 = param4.field_t;
              var8 = 0;
              if (param3 == 123) {
                break L6;
              } else {
                field_F = 51;
                break L6;
              }
            }
            L7: {
              param4.field_r = param4.field_r + var7.field_h;
              param4.field_x = param4.field_x + 1;
              var9 = 0.000005086263020833333 * (double)((param4.field_w * param4.field_v >> 1349155724) + (param4.field_l - 60 << 1530175464));
              if (0 >= var7.field_n) {
                break L7;
              } else {
                L8: {
                  if ((var7.field_l ^ -1) >= -1) {
                    param4.field_y = param4.field_y + 128;
                    break L8;
                  } else {
                    param4.field_y = param4.field_y + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                    break L8;
                  }
                }
                if (-819201 >= (var7.field_n * param4.field_y ^ -1)) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (null == var7.field_e) {
                break L9;
              } else {
                L10: {
                  if (-1 > (var7.field_a ^ -1)) {
                    param4.field_s = param4.field_s + (int)(0.5 + Math.pow(2.0, (double)var7.field_a * var9) * 128.0);
                    break L10;
                  } else {
                    param4.field_s = param4.field_s + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_e.length + -2 <= param4.field_F) {
                      break L12;
                    } else {
                      if ((255 & var7.field_e[param4.field_F + 2]) << 1185130056 >= param4.field_s) {
                        break L12;
                      } else {
                        param4.field_F = param4.field_F + 2;
                        continue L11;
                      }
                    }
                  }
                  if (-2 + var7.field_e.length != param4.field_F) {
                    break L9;
                  } else {
                    if (0 == var7.field_e[param4.field_F + 1]) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L13: {
              if (0 > param4.field_o) {
                break L13;
              } else {
                if (null == var7.field_k) {
                  break L13;
                } else {
                  if (-1 == (this.field_U[param4.field_h] & 1 ^ -1)) {
                    L14: {
                      if (-1 < (param4.field_G ^ -1)) {
                        break L14;
                      } else {
                        if (this.field_u[param4.field_h][param4.field_G] == param4) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (0 < var7.field_d) {
                        param4.field_o = param4.field_o + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
                        break L15;
                      } else {
                        param4.field_o = param4.field_o + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param4.field_k >= var7.field_k.length + -2) {
                          break L17;
                        } else {
                          if ((var7.field_k[2 + param4.field_k] << 1765759560 & 65280) >= param4.field_o) {
                            break L17;
                          } else {
                            param4.field_k = param4.field_k + 2;
                            continue L16;
                          }
                        }
                      }
                      if (param4.field_k != var7.field_k.length - 2) {
                        break L13;
                      } else {
                        var8 = 1;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param4.field_p.g(param4.field_D);
                if (param1 != null) {
                  param4.field_p.b(param1, param0, param2);
                  break L18;
                } else {
                  param4.field_p.a(param2);
                  break L18;
                }
              }
              L19: {
                if (!param4.field_p.i()) {
                  break L19;
                } else {
                  this.field_L.field_n.a(param4.field_p);
                  break L19;
                }
              }
              L20: {
                param4.c(param3 + -11505);
                if (0 <= param4.field_o) {
                  param4.a(false);
                  if ((param4.field_G ^ -1) >= -1) {
                    break L20;
                  } else {
                    if (this.field_u[param4.field_h][param4.field_G] != param4) {
                      break L20;
                    } else {
                      this.field_u[param4.field_h][param4.field_G] = null;
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_62_0 = 1;
              stackIn_63_0 = stackOut_62_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param4.field_p.a(param4.field_D, this.a(-26254, param4), this.a((byte) 96, param4));
              stackOut_64_0 = 0;
              stackIn_65_0 = stackOut_64_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var6);
            stackOut_66_1 = new StringBuilder().append("i.AB(").append(param0).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L21;
            }
          }
          L22: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L22;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L22;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_63_0 != 0;
          } else {
            return stackIn_65_0 != 0;
          }
        }
    }

    final synchronized boolean a(eh param0, int param1, jg param2, sc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        sg var8 = null;
        int var9 = 0;
        int var11 = 0;
        rc var12 = null;
        rc var13 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (param4 < param1) {
                var7 = new int[]{param1};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (sg) ((Object) param3.field_h.a((byte) 19));
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (var6_int != 0) {
                    param3.b();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  var9 = (int)var8.field_d;
                  var12 = (rc) ((Object) this.field_o.a((long)var9, param4 ^ -14905));
                  if (var12 == null) {
                    var13 = vm.a(param0, (byte) 42, var9);
                    if (var13 == null) {
                      var6_int = 0;
                      break L4;
                    } else {
                      this.field_o.a(var13, (byte) 16, (long)var9);
                      if (var13.a(param2, var8.field_h, (byte) 112, (int[]) (var7))) {
                        break L4;
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    }
                  } else {
                    if (var12.a(param2, var8.field_h, (byte) 112, (int[]) (var7))) {
                      break L4;
                    } else {
                      var6_int = 0;
                      var8 = (sg) ((Object) param3.field_h.a(-117));
                      continue L2;
                    }
                  }
                }
                var8 = (sg) ((Object) param3.field_h.a(-117));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("i.Q(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized void c(boolean param0) {
        if (param0) {
            return;
        }
        this.a(-8193, true);
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -128) {
            this.field_x = -112;
        }
        this.field_l = param1;
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
        this.field_r[param1] = param2;
    }

    private final void c(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_M[param2] = param1;
        this.field_E[param2] = rb.a(param1, -128);
        if (param0 < 124) {
            wn var5 = (wn) null;
            discarded$0 = this.a(107, (wn) null);
        }
        this.a(param2, (byte) -84, param1);
    }

    final static String a(int param0, byte[] param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        eh var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2022) {
                break L1;
              } else {
                var3 = (eh) null;
                discarded$2 = i.a((byte) 27, (eh) null);
                break L1;
              }
            }
            stackOut_2_0 = nf.a(param1.length, (byte) -120, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("i.P(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized in c() {
        return (in) ((Object) this.field_L);
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        wn var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param2 != 66) {
            return;
        }
        wn var8 = this.field_K[param0][param1];
        if (var8 == null) {
            return;
        }
        this.field_K[param0][param1] = null;
        if (0 == (this.field_U[param0] & 2)) {
            var8.field_o = 0;
        } else {
            var6 = (wn) ((Object) this.field_L.field_k.a((byte) -64));
            while (var6 != null) {
                if (var6.field_h == var8.field_h) {
                    if (var6.field_o < 0) {
                        if (!(var6 == var8)) {
                            var8.field_o = 0;
                            break;
                        }
                    }
                }
                var6 = (wn) ((Object) this.field_L.field_k.a(16213));
            }
        }
    }

    final static boolean a(byte param0, eh param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        eh var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 99) {
                break L1;
              } else {
                var3 = (eh) null;
                discarded$2 = i.a((byte) -25, (eh) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.b(25867);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("i.KA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, wn param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qd var9 = null;
        qd var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (this.field_k[param1.field_h] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param1.field_t;
                var10 = var9;
                var4 = 4096 + this.field_G[param1.field_h] * this.field_q[param1.field_h] >> -1164413107;
                if (param0 == -26254) {
                  break L1;
                } else {
                  this.a(-12, (byte) 48, -58);
                  break L1;
                }
              }
              L2: {
                var4 = var4 * var4 + 16384 >> 1569071951;
                var4 = 16384 + param1.field_A * var4 >> 512633743;
                var4 = 128 + var4 * this.field_T >> 722707976;
                var4 = 128 + var4 * this.field_k[param1.field_h] >> 2095420360;
                if ((var10.field_n ^ -1) >= -1) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_y * 0.00001953125 * (double)var10.field_n) * (double)var4);
                  break L2;
                }
              }
              L3: {
                if (var10.field_e == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_s;
                    var6 = var10.field_e[param1.field_F - -1];
                    if (var10.field_e.length + -2 > param1.field_F) {
                      var7 = var9.field_e[param1.field_F] << -235240216 & 65280;
                      var8 = var10.field_e[2 + param1.field_F] << 339136040 & 65280;
                      var6 = var6 + (var5 + -var7) * (var10.field_e[param1.field_F - -3] + -var6) / (var8 + -var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = var4 * var6 - -32 >> 1304293894;
                  break L3;
                }
              }
              L5: {
                if ((param1.field_o ^ -1) >= -1) {
                  break L5;
                } else {
                  if (null == var10.field_k) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param1.field_o;
                      var6 = var10.field_k[param1.field_k + 1];
                      if (var10.field_k.length - 2 > param1.field_k) {
                        var7 = (255 & var9.field_k[param1.field_k]) << 1520324680;
                        var8 = var10.field_k[param1.field_k + 2] << 1559020904 & 65280;
                        var6 = var6 + (var5 - var7) * (var10.field_k[3 + param1.field_k] - var6) / (var8 + -var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 1715242886;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("i.FA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_z[param0] = param2;
        this.field_I[param0] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * (double)param1);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param1 != 64) {
            this.field_k = (int[]) null;
        }
    }

    final void a(boolean param0, int param1, wn param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param2.field_q.field_k.length;
                if (!param0) {
                  break L2;
                } else {
                  if (param2.field_q.field_i) {
                    var6 = -param2.field_q.field_l + (var4_int + var4_int);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)this.field_S[param2.field_h] * (long)var6 >> 804383046);
                    if (var5 >= var4_int) {
                      param2.field_p.c(true);
                      var5 = -1 + var4_int + (var4_int - var5);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)this.field_S[param2.field_h] * (long)var4_int >> -1230453114);
              break L1;
            }
            L3: {
              param2.field_p.d(var5);
              if (param1 == -16257) {
                break L3;
              } else {
                field_y = -49;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("i.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        dh discarded$0 = null;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) 2);
        } else {
            this.d(-1, param0 + 1145);
        }
        if (param0 != -22) {
            discarded$0 = i.a(39, -26, 106, -19);
        }
        this.c(-1, (byte) 94);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            this.field_P[var3] = this.field_M[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            this.field_E[var5] = rb.a(-128, this.field_M[var5]);
            var5++;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -84) {
            this.field_l = 17;
        }
        if (param2 != this.field_P[param0]) {
            this.field_P[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                this.field_u[param0][var4] = null;
            }
        }
    }

    final synchronized void a(boolean param0, int param1, sc param2) {
        if (param1 != 37) {
            return;
        }
        try {
            this.a(param2, false, param0, true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "i.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
                    this.field_E[var4] = (var6 << -396432594) + rb.a(this.field_E[var4], -2080769);
                    break L0;
                  }
                }
                L1: {
                  if (-33 != (var5 ^ -1)) {
                    break L1;
                  } else {
                    this.field_E[var4] = rb.a(-16257, this.field_E[var4]) + (var6 << 2002139239);
                    break L1;
                  }
                }
                L2: {
                  if (-2 != (var5 ^ -1)) {
                    break L2;
                  } else {
                    this.field_R[var4] = rb.a(this.field_R[var4], -16257) - -(var6 << -1154908121);
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 33) {
                    this.field_R[var4] = rb.a(-128, this.field_R[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    this.field_J[var4] = (var6 << 1493950791) + rb.a(-16257, this.field_J[var4]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    this.field_J[var4] = rb.a(this.field_J[var4], -128) + var6;
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    this.field_G[var4] = (var6 << -355828793) + rb.a(this.field_G[var4], -16257);
                    break L6;
                  }
                }
                L7: {
                  if (-40 != (var5 ^ -1)) {
                    break L7;
                  } else {
                    this.field_G[var4] = rb.a(this.field_G[var4], -128) + var6;
                    break L7;
                  }
                }
                L8: {
                  if (var5 == 10) {
                    this.field_p[var4] = (var6 << 1429720455) + rb.a(-16257, this.field_p[var4]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) != -43) {
                    break L9;
                  } else {
                    this.field_p[var4] = var6 + rb.a(this.field_p[var4], -128);
                    break L9;
                  }
                }
                L10: {
                  if ((var5 ^ -1) != -12) {
                    break L10;
                  } else {
                    this.field_q[var4] = (var6 << -627211001) + rb.a(-16257, this.field_q[var4]);
                    break L10;
                  }
                }
                L11: {
                  if ((var5 ^ -1) != -44) {
                    break L11;
                  } else {
                    this.field_q[var4] = var6 + rb.a(-128, this.field_q[var4]);
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 64) {
                    if (-65 >= (var6 ^ -1)) {
                      this.field_U[var4] = oh.a(this.field_U[var4], 1);
                      break L12;
                    } else {
                      this.field_U[var4] = rb.a(this.field_U[var4], -2);
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
                      this.field_U[var4] = rb.a(this.field_U[var4], -3);
                      break L13;
                    } else {
                      this.field_U[var4] = oh.a(this.field_U[var4], 2);
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
                    this.field_N[var4] = rb.a(this.field_N[var4], 127) - -(var6 << 1166765447);
                    break L14;
                  }
                }
                L15: {
                  if (-99 != (var5 ^ -1)) {
                    break L15;
                  } else {
                    this.field_N[var4] = var6 + rb.a(16256, this.field_N[var4]);
                    break L15;
                  }
                }
                L16: {
                  if (101 != var5) {
                    break L16;
                  } else {
                    this.field_N[var4] = (var6 << 609309095) + 16384 - -rb.a(this.field_N[var4], 127);
                    break L16;
                  }
                }
                L17: {
                  if (-101 != (var5 ^ -1)) {
                    break L17;
                  } else {
                    this.field_N[var4] = var6 + 16384 - -rb.a(16256, this.field_N[var4]);
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
                    var7 = this.field_N[var4];
                    if (16384 != var7) {
                      break L21;
                    } else {
                      this.field_B[var4] = rb.a(this.field_B[var4], -16257) + (var6 << -1443119129);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-39 == (var5 ^ -1)) {
                    var7 = this.field_N[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L22;
                    } else {
                      this.field_B[var4] = var6 + rb.a(-128, this.field_B[var4]);
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
                    this.field_S[var4] = rb.a(-16257, this.field_S[var4]) + (var6 << -268871897);
                    break L23;
                  }
                }
                L24: {
                  if (48 == var5) {
                    this.field_S[var4] = var6 + rb.a(this.field_S[var4], -128);
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
                      this.field_U[var4] = rb.a(this.field_U[var4], -5);
                      break L25;
                    } else {
                      this.field_U[var4] = oh.a(this.field_U[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (-18 != (var5 ^ -1)) {
                    break L26;
                  } else {
                    this.b(var4, 2097152, (var6 << -90739001) + (this.field_z[var4] & -16257));
                    break L26;
                  }
                }
                L27: {
                  if ((var5 ^ -1) == -50) {
                    this.b(var4, 2097152, var6 + (this.field_z[var4] & -128));
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
                  this.a(var4, (byte) -84, this.field_E[var4] + var5);
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
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
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
            if (null == param1.field_p) {
              if (0 <= param1.field_o) {
                L1: {
                  param1.a(false);
                  if ((param1.field_G ^ -1) >= -1) {
                    break L1;
                  } else {
                    if (this.field_u[param1.field_h][param1.field_G] != param1) {
                      break L1;
                    } else {
                      this.field_u[param1.field_h][param1.field_G] = null;
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (param0 < -105) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("i.R(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
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
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_O.c()) {
                  var4_int = this.field_O.field_c * this.field_l / ua.field_p;
                  L3: while (true) {
                    var5 = this.field_m + (long)param2 * (long)var4_int;
                    if (-1L < (this.field_C + -var5 ^ -1L)) {
                      var7 = (int)((-1L + (long)var4_int + this.field_C - this.field_m) / (long)var4_int);
                      this.field_m = this.field_m + (long)var7 * (long)var4_int;
                      this.field_L.b(param0, param1, var7);
                      this.c(22228);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (this.field_O.c()) {
                        continue L3;
                      } else {
                        this.field_L.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      this.field_m = var5;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.field_L.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("i.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public i() {
        this.field_u = new wn[16][128];
        this.field_N = new int[16];
        this.field_P = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_r = new int[16];
        this.field_R = new int[16];
        this.field_q = new int[16];
        this.field_E = new int[16];
        this.field_k = new int[16];
        this.field_S = new int[16];
        this.field_I = new int[16];
        this.field_M = new int[16];
        this.field_T = 256;
        this.field_l = 1000000;
        this.field_p = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_K = new wn[16][128];
        this.field_z = new int[16];
        this.field_O = new qj();
        this.field_L = new pa((i) (this));
        this.field_o = new ln(128);
        this.a(256, true, -1);
        this.a((byte) -22, true);
    }

    static {
        field_v = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_D = "Accept invitation to <%0>'s game";
    }
}
