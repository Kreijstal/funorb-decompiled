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
        o var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 0) {
          var3 = (o) ((Object) this.field_G.field_l.b(param1 ^ 12623));
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if ((param0 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (param0 == var3.field_H) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (null != var3.field_n) {
                    L4: {
                      var3.field_n.d(lb.field_r / 100);
                      if (!var3.field_n.h()) {
                        break L4;
                      } else {
                        this.field_G.field_n.b(var3.field_n);
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
                  if (var3.field_y >= 0) {
                    break L5;
                  } else {
                    this.field_A[var3.field_H][var3.field_t] = null;
                    break L5;
                  }
                }
                var3.a(true);
                break L1;
              }
              var3 = (o) ((Object) this.field_G.field_l.a(0));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -66) {
            gh.d((byte) 98);
        }
        this.field_v = param0;
    }

    private final void e(int param0, int param1) {
        o var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 118 % ((40 - param1) / 57);
        if ((this.field_Q[param0] & 4) != 0) {
            var4 = (o) ((Object) this.field_G.field_l.b(12623));
            while (var4 != null) {
                if (!(var4.field_H != param0)) {
                    var4.field_l = 0;
                }
                var4 = (o) ((Object) this.field_G.field_l.a(0));
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
          var2 = this.field_U;
          var3 = this.field_K;
          var4 = this.field_t;
          if (this.field_C == null) {
            break L0;
          } else {
            if (var3 != this.field_w) {
              break L0;
            } else {
              this.a(-93, this.field_u, this.field_C, this.field_M);
              this.f((byte) 29);
              return;
            }
          }
        }
        L1: while (true) {
          if (this.field_K != var3) {
            L2: {
              this.field_K = var3;
              this.field_t = var4;
              this.field_U = var2;
              if (null == this.field_C) {
                break L2;
              } else {
                if (this.field_w < var3) {
                  this.field_U = -1;
                  this.field_K = this.field_w;
                  this.field_t = this.field_N.b(this.field_K);
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
                if (this.field_N.field_d[var2] != var3) {
                  break L4;
                } else {
                  this.field_N.f(var2);
                  var6 = this.field_N.d(var2);
                  if (var6 != 1) {
                    L5: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.b(27257, var6);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_N.a(var2);
                    this.field_N.c(var2);
                    continue L3;
                  } else {
                    this.field_N.g();
                    this.field_N.c(var2);
                    if (this.field_N.f()) {
                      if (null != this.field_C) {
                        this.a((byte) -96, this.field_u, this.field_C);
                        this.f((byte) 124);
                        return;
                      } else {
                        L6: {
                          if (!this.field_u) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              this.field_N.a(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a((byte) -120, true);
                        this.field_N.c();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = this.field_N.a();
              var3 = this.field_N.field_d[var2];
              var4 = this.field_N.b(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized boolean e(byte param0) {
        if (param0 != -8) {
            this.field_v = 62;
        }
        return this.field_N.e();
    }

    private final int b(int param0, o param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ba var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_2_0 = 0;
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
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = param1.field_I + (param1.field_i * param1.field_B >> -1439130804);
            if (param0 < -105) {
              L1: {
                var3_int = var3_int + ((this.field_x[param1.field_H] - 8192) * this.field_J[param1.field_H] >> 252564460);
                var4 = param1.field_x;
                if (var4.field_e <= 0) {
                  break L1;
                } else {
                  L2: {
                    if ((var4.field_j ^ -1) < -1) {
                      break L2;
                    } else {
                      if (this.field_I[param1.field_H] > 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_j << 92178594;
                    var6 = var4.field_d << -1568050975;
                    if (var6 <= param1.field_z) {
                      break L3;
                    } else {
                      var5 = param1.field_z * var5 / var6;
                      break L3;
                    }
                  }
                  var5 = var5 + (this.field_I[param1.field_H] >> -943231033);
                  var7 = Math.sin((double)(511 & param1.field_w) * 0.01227184630308513);
                  var3_int = var3_int + (int)(var7 * (double)var5);
                  break L1;
                }
              }
              L4: {
                var5 = (int)(0.5 + (double)(param1.field_m.field_l * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)lb.field_r);
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("gh.S(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_13_0;
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
            java.applet.Applet var6 = (java.applet.Applet) null;
            gh.a(3, (java.applet.Applet) null);
        }
    }

    final synchronized void c(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 119) {
            return;
        }
        fg var4 = (fg) ((Object) this.field_F.a(10));
        while (var4 != null) {
            var4.a(23257);
            var4 = (fg) ((Object) this.field_F.c(-64));
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        o var5 = null;
        wf var6 = null;
        int var6_int = 0;
        o var7 = null;
        o var8 = null;
        int var9 = 0;
        java.applet.Applet var10 = null;
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
          if (0 != (2 & this.field_Q[param0])) {
            var5 = (o) ((Object) this.field_G.field_l.a(true));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_H) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_y ^ -1)) {
                      this.field_A[param0][var5.field_t] = null;
                      this.field_A[param0][param2] = var5;
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
                var5 = (o) ((Object) this.field_G.field_l.b((byte) 48));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (fg) ((Object) this.field_F.a((long)this.field_q[param0], -74));
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
                var10 = (java.applet.Applet) null;
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
              if (this.field_H[param0] == 0) {
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
                this.a(stackIn_20_1, stackIn_20_2 != 0, var7);
                break L4;
              }
            }
            L6: {
              if (-1 >= (var11.field_m[param2] ^ -1)) {
                break L6;
              } else {
                var7.field_n.e(-1);
                break L6;
              }
            }
            L7: {
              if (-1 >= (var7.field_k ^ -1)) {
                L8: {
                  var8 = this.field_m[param0][var7.field_k];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (var8.field_y >= 0) {
                      break L8;
                    } else {
                      this.field_A[param0][var8.field_t] = null;
                      var8.field_y = 0;
                      break L8;
                    }
                  }
                }
                this.field_m[param0][var7.field_k] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            this.field_G.field_l.b(var7, -1);
            this.field_A[param0][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_N.e()) {
                  break L2;
                } else {
                  var4_int = this.field_N.field_h * this.field_r / lb.field_r;
                  L3: while (true) {
                    var5 = this.field_T + (long)param2 * (long)var4_int;
                    if (0L > this.field_t + -var5) {
                      var7 = (int)(((long)var4_int + (-this.field_T + this.field_t - 1L)) / (long)var4_int);
                      this.field_T = this.field_T + (long)var4_int * (long)var7;
                      this.field_G.a(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      this.f((byte) 45);
                      if (this.field_N.e()) {
                        continue L3;
                      } else {
                        this.field_G.a(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      this.field_T = var5;
                      break L2;
                    }
                  }
                }
              }
              this.field_G.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("gh.AA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(int param0, gi param1, eg param2, ha param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var8 = 0;
        vf var9 = null;
        int var10 = 0;
        fg var11 = null;
        int var12 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var8 = 73 % ((-55 - param4) / 50);
              var7 = null;
              if (-1 <= (param0 ^ -1)) {
                break L1;
              } else {
                var7 = new int[]{param0};
                break L1;
              }
            }
            var9 = (vf) ((Object) param3.field_h.a(10));
            L2: while (true) {
              if (var9 == null) {
                L3: {
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param3.b();
                    break L3;
                  }
                }
                stackOut_16_0 = var6_int;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L4: {
                  var10 = (int)var9.field_e;
                  var11 = (fg) ((Object) this.field_F.a((long)var10, -102));
                  if (var11 != null) {
                    break L4;
                  } else {
                    var11 = mo.a((byte) -127, param2, var10);
                    if (var11 != null) {
                      this.field_F.a(var11, true, (long)var10);
                      break L4;
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var11 == null) {
                    break L5;
                  } else {
                    if (!var11.a(-99, param1, (int[]) (var7), var9.field_t)) {
                      var6_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var9 = (vf) ((Object) param3.field_h.c(-62));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var6);
            stackOut_18_1 = new StringBuilder().append("gh.Q(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized sg b() {
        return null;
    }

    final synchronized void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ha var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if ((param0 ^ -1) <= -1) {
            this.field_B[param0] = param2;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                this.field_B[var4] = param2;
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
            var6 = (ha) null;
            this.a((byte) -63, false, (ha) null);
            break L2;
          }
        }
    }

    private final void d(int param0, int param1) {
        o var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == 27652) {
            break L0;
          } else {
            this.field_w = -18;
            break L0;
          }
        }
        var3 = (o) ((Object) this.field_G.field_l.b(param1 ^ 23883));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) > -1) {
                  break L3;
                } else {
                  if (param0 == var3.field_H) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (0 <= var3.field_y) {
                break L2;
              } else {
                this.field_A[var3.field_H][var3.field_t] = null;
                var3.field_y = 0;
                break L2;
              }
            }
            var3 = (o) ((Object) this.field_G.field_l.a(0));
            continue L1;
          }
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 != 96) {
            u var7 = (u) null;
            gh.a(107, (u) null);
        }
        int var3 = param2 >> 1923180400;
        int var4 = 65535 & param2;
        int var5 = param0 >> -1550394544;
        int var6 = 65535 & param0;
        return param0 * var3 + (var5 * var4 + (var4 * var6 >> -518949872));
    }

    final static void a(int param0, dj param1, int param2, dj param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, qb[] param12, int param13, int param14, byte param15, int param16, qb[] param17, int param18, qb[] param19, int param20) {
        RuntimeException var21 = null;
        java.applet.Applet var22 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              ug.a((byte) 100, param8, param2, param7, param3, param14, param18, param10, param13, param6, param9, new ec(param12), param20, param1, new ec(param17), param11, param4, param16, param5, new ec(param19), param0);
              if (param15 < -99) {
                break L1;
              } else {
                var22 = (java.applet.Applet) null;
                gh.a(125, (java.applet.Applet) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var21);
            stackOut_3_1 = new StringBuilder().append("gh.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param12 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param17 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param18).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param19 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param20 + ')');
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
            this.field_m = (o[][]) null;
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
                      this.field_n[var4] = dg.a(-2080769, this.field_n[var4]) + (var6 << -773859890);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((var5 ^ -1) == -33) {
                      this.field_n[var4] = (var6 << 398627335) + dg.a(-16257, this.field_n[var4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) == -2) {
                      this.field_I[var4] = dg.a(-16257, this.field_I[var4]) - -(var6 << 412502855);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 33) {
                      this.field_I[var4] = dg.a(-128, this.field_I[var4]) + var6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -6) {
                      this.field_P[var4] = dg.a(-16257, this.field_P[var4]) - -(var6 << -939950233);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 37) {
                      break L7;
                    } else {
                      this.field_P[var4] = dg.a(this.field_P[var4], -128) + var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (-8 == (var5 ^ -1)) {
                      this.field_y[var4] = (var6 << 1887323015) + dg.a(this.field_y[var4], -16257);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) != -40) {
                      break L9;
                    } else {
                      this.field_y[var4] = var6 + dg.a(this.field_y[var4], -128);
                      break L9;
                    }
                  }
                  L10: {
                    if (10 != var5) {
                      break L10;
                    } else {
                      this.field_S[var4] = dg.a(-16257, this.field_S[var4]) - -(var6 << 165362663);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 42) {
                      break L11;
                    } else {
                      this.field_S[var4] = var6 + dg.a(-128, this.field_S[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (-12 == (var5 ^ -1)) {
                      this.field_R[var4] = (var6 << 1213146375) + dg.a(-16257, this.field_R[var4]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-44 != (var5 ^ -1)) {
                      break L13;
                    } else {
                      this.field_R[var4] = var6 + dg.a(-128, this.field_R[var4]);
                      break L13;
                    }
                  }
                  L14: {
                    if (-65 == (var5 ^ -1)) {
                      if ((var6 ^ -1) > -65) {
                        this.field_Q[var4] = dg.a(this.field_Q[var4], -2);
                        break L14;
                      } else {
                        this.field_Q[var4] = fj.b(this.field_Q[var4], 1);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var5 ^ -1) == -66) {
                      if ((var6 ^ -1) <= -65) {
                        this.field_Q[var4] = fj.b(this.field_Q[var4], 2);
                        break L15;
                      } else {
                        this.a((byte) -62, var4);
                        this.field_Q[var4] = dg.a(this.field_Q[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (99 == var5) {
                      this.field_V[var4] = (var6 << 98973639) + dg.a(127, this.field_V[var4]);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 98) {
                      this.field_V[var4] = dg.a(16256, this.field_V[var4]) + var6;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) == -102) {
                      this.field_V[var4] = dg.a(this.field_V[var4], 127) + (16384 - -(var6 << -922001017));
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      this.field_V[var4] = var6 + (dg.a(16256, this.field_V[var4]) + 16384);
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
                    if ((var5 ^ -1) != -124) {
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
                      var7 = this.field_V[var4];
                      if (-16385 == (var7 ^ -1)) {
                        this.field_J[var4] = (var6 << 62225415) + dg.a(-16257, this.field_J[var4]);
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
                      var7 = this.field_V[var4];
                      if (16384 == var7) {
                        this.field_J[var4] = var6 + dg.a(-128, this.field_J[var4]);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (-17 == (var5 ^ -1)) {
                      this.field_H[var4] = (var6 << 666153415) + dg.a(-16257, this.field_H[var4]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (48 == var5) {
                      this.field_H[var4] = var6 + dg.a(-128, this.field_H[var4]);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if ((var5 ^ -1) == -82) {
                      if ((var6 ^ -1) > -65) {
                        this.e(var4, param0 + -27298);
                        this.field_Q[var4] = dg.a(this.field_Q[var4], -5);
                        break L27;
                      } else {
                        this.field_Q[var4] = fj.b(this.field_Q[var4], 4);
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
                      this.a(8387180, var4, (this.field_p[var4] & -16257) + (var6 << 151169191));
                      break L28;
                    }
                  }
                  if (49 != var5) {
                    break L1;
                  } else {
                    this.a(8387180, var4, var6 + (-128 & this.field_p[var4]));
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
                    this.d(122, var5 + this.field_n[var4], var4);
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
        int decompiledRegionSelector0 = 0;
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
            var4_int = param2.field_m.field_i.length;
            if (param0 == 11132) {
              L1: {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    if (!param2.field_m.field_k) {
                      break L2;
                    } else {
                      var6 = -param2.field_m.field_j + (var4_int + var4_int);
                      var4_int = var4_int << 8;
                      var5 = (int)((long)this.field_H[param2.field_H] * (long)var6 >> 1614611142);
                      if (var5 >= var4_int) {
                        var5 = -1 + var4_int + var4_int - var5;
                        param2.field_n.b(true);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var5 = (int)((long)this.field_H[param2.field_H] * (long)var4_int >> -40469370);
                break L1;
              }
              param2.field_n.f(var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("gh.O(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_N.c();
        this.field_C = null;
        this.a((byte) -125, param0);
        if (param1) {
            this.field_B = (int[]) null;
        }
    }

    private final void a(byte param0, int param1) {
        o var3_ref_o = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (!((this.field_Q[param1] & 2) == 0)) {
            var3_ref_o = (o) ((Object) this.field_G.field_l.b(12623));
            while (var3_ref_o != null) {
                if (var3_ref_o.field_H == param1) {
                    if (this.field_A[param1][var3_ref_o.field_t] == null) {
                        if ((var3_ref_o.field_y ^ -1) > -1) {
                            var3_ref_o.field_y = 0;
                        }
                    }
                }
                var3_ref_o = (o) ((Object) this.field_G.field_l.a(0));
            }
        }
        int var3 = -77 / ((param0 - 3) / 33);
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = -108 % ((param1 - -39) / 47);
        this.c(param0, param2, 1319989672);
    }

    private final void a(byte param0, boolean param1) {
        boolean discarded$0 = false;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1) {
            this.a(-1, 0);
        } else {
            this.d(-1, 27652);
        }
        this.c(268269032, -1);
        int var3 = 0;
        if (param0 >= -86) {
            o var5 = (o) null;
            discarded$0 = this.a(103, -78, 68, (int[]) null, (o) null);
        }
        while ((var3 ^ -1) > -17) {
            this.field_q[var3] = this.field_k[var3];
            var3++;
        }
        int var6 = 0;
        var3 = var6;
        while (var6 < 16) {
            this.field_n[var6] = dg.a(this.field_k[var6], -128);
            var6++;
        }
    }

    final synchronized void a(byte param0, boolean param1, ha param2) {
        if (param0 != -96) {
            return;
        }
        try {
            this.a(-61, param1, param2, true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_k[param1] = param0;
        if (param2 != 1319989672) {
            return;
        }
        this.field_n[param1] = dg.a(-128, param0);
        this.d(param2 + -1319989581, param0, param1);
    }

    final boolean a(int param0, int param1, int param2, int[] param3, o param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ba var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_C = lb.field_r / 100;
              if ((param4.field_y ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (null == param4.field_n) {
                    break L2;
                  } else {
                    if (!param4.field_n.k()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param4.b(true);
                  param4.a(true);
                  if (0 >= param4.field_k) {
                    break L3;
                  } else {
                    if (this.field_m[param4.field_H][param4.field_k] == param4) {
                      this.field_m[param4.field_H][param4.field_k] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param4.field_B;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_P[param4.field_H] * 0.0004921259842519685) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param4.field_B = var6_int;
                break L4;
              }
            }
            L6: {
              param4.field_n.g(this.b(param1 ^ -24574, param4));
              var7 = param4.field_x;
              var8 = 0;
              param4.field_z = param4.field_z + 1;
              param4.field_w = param4.field_w + var7.field_e;
              var9 = (double)((-60 + param4.field_t << 1723443208) + (param4.field_i * param4.field_B >> 1121115372)) * 0.000005086263020833333;
              if (0 >= var7.field_n) {
                break L6;
              } else {
                L7: {
                  if (var7.field_m <= 0) {
                    param4.field_j = param4.field_j + 128;
                    break L7;
                  } else {
                    param4.field_j = param4.field_j + (int)(128.0 * Math.pow(2.0, (double)var7.field_m * var9) + 0.5);
                    break L7;
                  }
                }
                if (-819201 < (param4.field_j * var7.field_n ^ -1)) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (null == var7.field_h) {
                break L8;
              } else {
                L9: {
                  if ((var7.field_g ^ -1) >= -1) {
                    param4.field_h = param4.field_h + 128;
                    break L9;
                  } else {
                    param4.field_h = param4.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (var7.field_h.length - 2 <= param4.field_v) {
                      break L11;
                    } else {
                      if (param4.field_h <= (65280 & var7.field_h[param4.field_v + 2] << -686969112)) {
                        break L11;
                      } else {
                        param4.field_v = param4.field_v + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param4.field_v != -2 + var7.field_h.length) {
                    break L8;
                  } else {
                    if (var7.field_h[1 + param4.field_v] == 0) {
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
              if (-1 < (param4.field_y ^ -1)) {
                break L12;
              } else {
                if (null == var7.field_l) {
                  break L12;
                } else {
                  if (-1 == (1 & this.field_Q[param4.field_H] ^ -1)) {
                    L13: {
                      if (-1 < (param4.field_k ^ -1)) {
                        break L13;
                      } else {
                        if (param4 == this.field_m[param4.field_H][param4.field_k]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (0 >= var7.field_i) {
                        param4.field_y = param4.field_y + 128;
                        break L14;
                      } else {
                        param4.field_y = param4.field_y + (int)(128.0 * Math.pow(2.0, (double)var7.field_i * var9) + 0.5);
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (var7.field_l.length - 2 <= param4.field_p) {
                          break L16;
                        } else {
                          if (param4.field_y <= (var7.field_l[2 + param4.field_p] & 255) << 239743176) {
                            break L16;
                          } else {
                            param4.field_p = param4.field_p + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param4.field_p == -2 + var7.field_l.length) {
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
            if (var8 != 0) {
              L17: {
                param4.field_n.d(param4.field_C);
                if (param3 == null) {
                  param4.field_n.a(param2);
                  break L17;
                } else {
                  param4.field_n.a(param3, param0, param2);
                  break L17;
                }
              }
              L18: {
                if (param4.field_n.h()) {
                  this.field_G.field_n.b(param4.field_n);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                param4.b(true);
                if (-1 >= (param4.field_y ^ -1)) {
                  param4.a(true);
                  if (0 >= param4.field_k) {
                    break L19;
                  } else {
                    if (param4 == this.field_m[param4.field_H][param4.field_k]) {
                      this.field_m[param4.field_H][param4.field_k] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
              stackOut_62_0 = 1;
              stackIn_63_0 = stackOut_62_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param4.field_n.a(param4.field_C, this.a((byte) -128, param4), this.a(param1 + -24592, param4));
              if (param1 == 24464) {
                stackOut_67_0 = 0;
                stackIn_68_0 = stackOut_67_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_65_0 = 0;
                stackIn_66_0 = stackOut_65_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var6);
            stackOut_69_1 = new StringBuilder().append("gh.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          L21: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_63_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_66_0 != 0;
            } else {
              return stackIn_68_0 != 0;
            }
          }
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_r = param0;
        if (param1 >= -84) {
            field_D = (oc) null;
        }
    }

    private final int a(byte param0, o param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ba var9 = null;
        ba var10 = null;
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
            if (0 == this.field_B[param1.field_H]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param1.field_x;
                var10 = var9;
                var4 = 4096 + this.field_y[param1.field_H] * this.field_R[param1.field_H] >> -1552832883;
                var4 = 16384 + var4 * var4 >> -127002513;
                var4 = 16384 + param1.field_u * var4 >> -273115665;
                var4 = 128 + this.field_v * var4 >> 1319989672;
                var4 = var4 * this.field_B[param1.field_H] - -128 >> -1709151672;
                if (0 >= var10.field_n) {
                  break L1;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_j * 0.00001953125 * (double)var10.field_n) * (double)var4);
                  break L1;
                }
              }
              L2: {
                if (var10.field_h != null) {
                  L3: {
                    var5 = param1.field_h;
                    var6 = var10.field_h[1 + param1.field_v];
                    if (-2 + var10.field_h.length <= param1.field_v) {
                      break L3;
                    } else {
                      var7 = (255 & var9.field_h[param1.field_v]) << -1243098424;
                      var8 = (var10.field_h[param1.field_v + 2] & 255) << -497942712;
                      var6 = var6 + (var5 + -var7) * (-var6 + var10.field_h[3 + param1.field_v]) / (var8 - var7);
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 739353638;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (-1 <= (param1.field_y ^ -1)) {
                  break L4;
                } else {
                  if (null != var10.field_l) {
                    L5: {
                      var5 = param1.field_y;
                      var6 = var10.field_l[param1.field_p + 1];
                      if (param1.field_p >= var10.field_l.length - 2) {
                        break L5;
                      } else {
                        var7 = (var9.field_l[param1.field_p] & 255) << 268269032;
                        var8 = (var10.field_l[param1.field_p - -2] & 255) << 301151048;
                        var6 = var6 + (-var6 + var10.field_l[param1.field_p - -3]) * (-var7 + var5) / (var8 - var7);
                        break L5;
                      }
                    }
                    var4 = 32 + var6 * var4 >> 1008124710;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (param0 <= -122) {
                  break L6;
                } else {
                  this.field_x = (int[]) null;
                  break L6;
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
            stackOut_21_1 = new StringBuilder().append("gh.G(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        o var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        o var8 = this.field_A[param1][param3];
        if (!(var8 != null)) {
            return;
        }
        this.field_A[param1][param3] = null;
        if (0 == (2 & this.field_Q[param1])) {
            var8.field_y = 0;
        } else {
            var6 = (o) ((Object) this.field_G.field_l.b(12623));
            while (var6 != null) {
                if (var8.field_H == var6.field_H) {
                    if ((var6.field_y ^ -1) > -1) {
                        if (!(var6 == var8)) {
                            var8.field_y = 0;
                            break;
                        }
                    }
                }
                var6 = (o) ((Object) this.field_G.field_l.a(0));
            }
        }
        if (param0) {
            this.field_F = (di) null;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          if (this.field_N.e()) {
            var2 = this.field_r * this.field_N.field_h / lb.field_r;
            L1: while (true) {
              L2: {
                var3 = this.field_T - -((long)var2 * (long)param0);
                if (0L <= -var3 + this.field_t) {
                  this.field_T = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + (-this.field_T + (this.field_t - -(long)var2))) / (long)var2);
                  this.field_T = this.field_T + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_G.a(var5);
                  this.f((byte) -126);
                  if (!this.field_N.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              this.field_G.a(param0);
              break L0;
            }
          } else {
            this.field_G.a(param0);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        this.field_x[param1] = param0;
        if (!param2) {
            this.field_I = (int[]) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 16) {
            return;
        }
        if (!(param1 == this.field_q[param2])) {
            this.field_q[param2] = param1;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                this.field_m[param2][var4] = null;
            }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 != 2) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                gh.a(87, (java.applet.Applet) null);
            }
            um.a("", param1, 13680);
            mc.a(param0 ^ 30451, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gh.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 < 49) {
            qb[] var2 = (qb[]) null;
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
        int var5_int = 0;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(param3, false);
        this.field_N.a(param2.field_g);
        if (param0 >= -49) {
            return;
        }
        try {
            this.field_u = param1 ? true : false;
            this.field_T = 0L;
            var5_int = this.field_N.d();
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_N.f(var6);
                this.field_N.a(var6);
                this.field_N.c(var6);
            }
            this.field_U = this.field_N.a();
            this.field_K = this.field_N.field_d[this.field_U];
            this.field_t = this.field_N.b(this.field_K);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gh.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_p[param1] = param2;
        this.field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 8387180) {
            this.a(-47, -57, false);
        }
    }

    final boolean a(boolean param0, o param1) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
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
            if (param1.field_n == null) {
              if (param1.field_y >= 0) {
                L1: {
                  param1.a(true);
                  if (0 >= param1.field_k) {
                    break L1;
                  } else {
                    if (param1 == this.field_m[param1.field_H][param1.field_k]) {
                      this.field_m[param1.field_H][param1.field_k] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            } else {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  discarded$2 = gh.a(-58, (byte) 89, 75);
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("gh.R(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 >= -4) {
            this.field_V = (int[]) null;
        }
    }

    private final int a(int param0, o param1) {
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
            if (param0 <= -126) {
              var3_int = this.field_S[param1.field_H];
              if (8192 <= var3_int) {
                stackOut_6_0 = -(32 + (16384 - var3_int) * (-param1.field_q + 128) >> -1783003482) + 16384;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 32 + var3_int * param1.field_q >> -2039237946;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -91;
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
            stackOut_8_1 = new StringBuilder().append("gh.TA(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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

    final synchronized sg a() {
        return (sg) ((Object) this.field_G);
    }

    final static void a(int param0, u param1) {
        try {
            int var2_int = 66 / ((param0 - -27) / 62);
            kh.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gh.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          L0: {
            this.field_y[param1] = 12800;
            this.field_S[param1] = 8192;
            this.field_R[param1] = 16383;
            this.field_x[param1] = 8192;
            this.field_I[param1] = 0;
            this.field_P[param1] = 8192;
            this.a((byte) 121, param1);
            this.e(param1, param0 ^ -268269053);
            if (param0 == 268269032) {
              break L0;
            } else {
              this.field_S = (int[]) null;
              break L0;
            }
          }
          this.field_Q[param1] = 0;
          this.field_V[param1] = 32767;
          this.field_J[param1] = 256;
          this.field_H[param1] = 0;
          this.a(8387180, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (-17 >= (param1 ^ -1)) {
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
        this.field_p = new int[16];
        this.field_k = new int[16];
        this.field_r = 1000000;
        this.field_A = new o[16][128];
        this.field_s = new int[16];
        this.field_v = 256;
        this.field_H = new int[16];
        this.field_x = new int[16];
        this.field_n = new int[16];
        this.field_J = new int[16];
        this.field_B = new int[16];
        this.field_V = new int[16];
        this.field_q = new int[16];
        this.field_m = new o[16][128];
        this.field_Q = new int[16];
        this.field_I = new int[16];
        this.field_R = new int[16];
        this.field_S = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_N = new en();
        this.field_G = new hk((gh) (this));
        this.field_F = new di(128);
        this.b(-1, (byte) 69, 256);
        this.a((byte) -93, true);
    }

    static {
        field_O = "Auto-respond to <%0>";
        field_D = new oc();
        field_l = new int[]{2, 20, 21, 6, 5, 9};
        field_z = "Reject <%0> from this game";
        field_L = new oc();
        field_o = "Now, clicking near yourself will cause an explosion of arcane energy. Try using it on the target. If you miss, move closer and try again.";
    }
}
