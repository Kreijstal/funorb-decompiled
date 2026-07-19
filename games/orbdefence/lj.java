/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends di {
    private int[] field_p;
    static int field_u;
    private int[] field_x;
    int[] field_o;
    private int[] field_n;
    private int[] field_y;
    private mh field_j;
    int[] field_L;
    private int[] field_C;
    private int[] field_F;
    int[] field_D;
    private int[] field_A;
    private int[] field_Q;
    private int[] field_v;
    private int[] field_w;
    private int[] field_G;
    private he[][] field_t;
    static int field_E;
    private int field_k;
    static String field_B;
    private int[] field_J;
    static hj field_N;
    private int[] field_H;
    static kc field_m;
    private he[][] field_I;
    private qi field_S;
    private int field_K;
    private long field_R;
    private jg field_O;
    private boolean field_z;
    private int field_s;
    private int field_q;
    private long field_l;
    private fj field_M;
    private boolean field_r;
    private int field_P;

    private final void b(int param0, int param1, int param2, int param3) {
        he var6 = null;
        int var7 = 0;
        he var8 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        var8 = this.field_I[param3][param1];
        if (var8 != null) {
          this.field_I[param3][param1] = null;
          if (param2 == -16257) {
            L0: {
              if (-1 == (this.field_o[param3] & 2 ^ -1)) {
                var8.field_n = 0;
                break L0;
              } else {
                var6 = (he) ((Object) this.field_O.field_k.b((byte) -75));
                L1: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    L2: {
                      if (var8.field_F != var6.field_F) {
                        break L2;
                      } else {
                        if ((var6.field_n ^ -1) <= -1) {
                          break L2;
                        } else {
                          if (var8 != var6) {
                            var8.field_n = 0;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var6 = (he) ((Object) this.field_O.field_k.d(853));
                    continue L1;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        he var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -40) {
          L0: {
            if (0 == (this.field_o[param1] & 2)) {
              break L0;
            } else {
              var3 = (he) ((Object) this.field_O.field_k.b((byte) 121));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var3.field_F != param1) {
                      break L2;
                    } else {
                      if (null == this.field_I[param1][var3.field_h]) {
                        if ((var3.field_n ^ -1) > -1) {
                          var3.field_n = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var3 = (he) ((Object) this.field_O.field_k.d(853));
                        continue L1;
                      }
                    }
                  }
                  var3 = (he) ((Object) this.field_O.field_k.d(853));
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

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) -109);
        } else {
            this.b((byte) -12, -1);
        }
        this.b(-1, (byte) 102);
        for (var3 = 0; 16 > var3; var3++) {
            this.field_F[var3] = this.field_J[var3];
        }
        if (param0 != 28034) {
            this.field_o = (int[]) null;
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            this.field_H[var5] = vi.a(-128, this.field_J[var5]);
            var5++;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -50) {
          L0: {
            var2 = this.field_q;
            var3 = this.field_s;
            var4 = this.field_R;
            if (this.field_M == null) {
              break L0;
            } else {
              if (this.field_P == var3) {
                this.a(this.field_z, -112, this.field_r, this.field_M);
                this.a((byte) -90);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: while (true) {
            if (var3 != this.field_s) {
              L2: {
                this.field_s = var3;
                this.field_q = var2;
                this.field_R = var4;
                if (this.field_M == null) {
                  break L2;
                } else {
                  if (this.field_P < var3) {
                    this.field_s = this.field_P;
                    this.field_q = -1;
                    this.field_R = this.field_S.f(this.field_s);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if (this.field_S.field_i[var2] != var3) {
                    break L4;
                  } else {
                    this.field_S.c(var2);
                    var6 = this.field_S.b(var2);
                    if (var6 == 1) {
                      this.field_S.g();
                      this.field_S.a(var2);
                      if (!this.field_S.c()) {
                        break L4;
                      } else {
                        if (null == this.field_M) {
                          L5: {
                            if (!this.field_z) {
                              break L5;
                            } else {
                              if (0 != var3) {
                                this.field_S.b(var4);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.a(28034, true);
                          this.field_S.e();
                          return;
                        } else {
                          this.a(-23335, this.field_z, this.field_M);
                          this.a((byte) -115);
                          return;
                        }
                      }
                    } else {
                      L6: {
                        if ((128 & var6) == 0) {
                          break L6;
                        } else {
                          this.c(var6, (byte) 93);
                          break L6;
                        }
                      }
                      this.field_S.d(var2);
                      this.field_S.a(var2);
                      continue L3;
                    }
                  }
                }
                var2 = this.field_S.d();
                var3 = this.field_S.field_i[var2];
                var4 = this.field_S.f(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        di discarded$0 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (!(param0 == this.field_F[param2])) {
            this.field_F[param2] = param0;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                this.field_t[param2][var4] = null;
            }
        }
        if (param1 != -129) {
            discarded$0 = this.a();
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_S.b()) {
                  break L2;
                } else {
                  var4_int = this.field_K * this.field_S.field_f / la.field_c;
                  L3: while (true) {
                    var5 = (long)param2 * (long)var4_int + this.field_l;
                    if (0L <= -var5 + this.field_R) {
                      this.field_l = var5;
                      break L2;
                    } else {
                      var7 = (int)((-1L + ((long)var4_int + -this.field_l) + this.field_R) / (long)var4_int);
                      this.field_l = this.field_l + (long)var7 * (long)var4_int;
                      this.field_O.b(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.a((byte) -58);
                      if (this.field_S.b()) {
                        continue L3;
                      } else {
                        this.field_O.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_O.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("lj.B(");
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
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        he var3 = null;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (!((this.field_o[param1] & 4) == 0)) {
            var3 = (he) ((Object) this.field_O.field_k.b((byte) 115));
            while (var3 != null) {
                if (!(param1 != var3.field_F)) {
                    var3.field_i = 0;
                }
                var3 = (he) ((Object) this.field_O.field_k.d(853));
            }
        }
        if (param0 < 103) {
            this.field_L = (int[]) null;
        }
    }

    final synchronized void b(int param0, int param1) {
        boolean discarded$0 = false;
        if (param1 < 103) {
            discarded$0 = this.a((ki) null, (vd) null, (byte) -88, (fj) null, 47);
        }
        this.field_k = param0;
    }

    final void a(he param0, boolean param1, int param2) {
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
                var4_int = param0.field_D.field_g.length;
                if (!param1) {
                  break L2;
                } else {
                  if (!param0.field_D.field_k) {
                    break L2;
                  } else {
                    var6 = var4_int + var4_int + -param0.field_D.field_i;
                    var5 = (int)((long)this.field_D[param0.field_F] * (long)var6 >> -148469050);
                    var4_int = var4_int << 8;
                    if (var4_int <= var5) {
                      var5 = -var5 + (-1 + var4_int + var4_int);
                      param0.field_l.c(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_D[param0.field_F] * (long)var4_int >> 2139755206);
              break L1;
            }
            L3: {
              if (param2 == 9929) {
                break L3;
              } else {
                this.field_j = (mh) null;
                break L3;
              }
            }
            param0.field_l.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("lj.Q(");
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
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized di d() {
        return null;
    }

    final synchronized di a() {
        return (di) ((Object) this.field_O);
    }

    private final int a(byte param0, he param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
              var3_int = param1.field_k + (param1.field_z * param1.field_A >> 1810153324);
              var3_int = var3_int + (this.field_v[param1.field_F] * (-8192 + this.field_Q[param1.field_F]) >> -949024628);
              var4 = param1.field_x;
              if ((var4.field_h ^ -1) >= -1) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_j) {
                    break L2;
                  } else {
                    if (-1 <= (this.field_n[param1.field_F] ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_j << -90533342;
                  var6 = var4.field_b << -1174035199;
                  if (var6 > param1.field_v) {
                    var5 = var5 * param1.field_v / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (this.field_n[param1.field_F] >> -2055881561);
                var7 = Math.sin((double)(511 & param1.field_E) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)((double)(param1.field_D.field_h * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)la.field_c + 0.5);
              if (param0 == 54) {
                break L4;
              } else {
                this.field_p = (int[]) null;
                break L4;
              }
            }
            L5: {
              if (1 > var5) {
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
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("lj.EA(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final synchronized void a(boolean param0, int param1, boolean param2, fj param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        try {
            this.a(param2, 8841);
            this.field_S.a(param3.field_f);
            this.field_l = 0L;
            this.field_z = param0 ? true : false;
            if (param1 >= -56) {
                this.a((he) null, false, -61);
            }
            var5_int = this.field_S.f();
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_S.c(var6);
                this.field_S.d(var6);
                this.field_S.a(var6);
            }
            this.field_q = this.field_S.d();
            this.field_s = this.field_S.field_i[this.field_q];
            this.field_R = this.field_S.f(this.field_s);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "lj.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 1091087304;
          var6 = param0 >> -683882256 & 127;
          this.b(var6, var5, -16257, var4);
          return;
        } else {
          L0: {
            if (var3 != 144) {
              if (-161 == (var3 ^ -1)) {
                var4 = param0 & 15;
                var5 = 127 & param0 >> -1055426072;
                var6 = (param0 & 8384371) >> -797783024;
                this.a(var4, -17615, var6, var5);
                return;
              } else {
                if (-177 == (var3 ^ -1)) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = param0 >> 343683336 & 127;
                    var6 = (8354193 & param0) >> -63109648;
                    if (-1 != (var5 ^ -1)) {
                      break L1;
                    } else {
                      this.field_H[var4] = vi.a(-2080769, this.field_H[var4]) + (var6 << -57508402);
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      this.field_H[var4] = (var6 << -1954408409) + vi.a(this.field_H[var4], -16257);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      this.field_n[var4] = vi.a(this.field_n[var4], -16257) + (var6 << 1524853639);
                      break L3;
                    }
                  }
                  L4: {
                    if (33 == var5) {
                      this.field_n[var4] = var6 + vi.a(this.field_n[var4], -128);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 5) {
                      this.field_G[var4] = (var6 << -532957881) + vi.a(this.field_G[var4], -16257);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var5) {
                      break L6;
                    } else {
                      this.field_G[var4] = vi.a(-128, this.field_G[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 7) {
                      this.field_w[var4] = vi.a(this.field_w[var4], -16257) - -(var6 << 314425255);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-40 == (var5 ^ -1)) {
                      this.field_w[var4] = vi.a(-128, this.field_w[var4]) + var6;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) == -11) {
                      this.field_y[var4] = (var6 << -2064978777) + vi.a(-16257, this.field_y[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 42) {
                      break L10;
                    } else {
                      this.field_y[var4] = vi.a(-128, this.field_y[var4]) - -var6;
                      break L10;
                    }
                  }
                  L11: {
                    if (11 != var5) {
                      break L11;
                    } else {
                      this.field_x[var4] = (var6 << -1396129401) + vi.a(this.field_x[var4], -16257);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      this.field_x[var4] = var6 + vi.a(this.field_x[var4], -128);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-65 != (var5 ^ -1)) {
                      break L13;
                    } else {
                      if (64 > var6) {
                        this.field_o[var4] = vi.a(this.field_o[var4], -2);
                        break L13;
                      } else {
                        this.field_o[var4] = ge.a(this.field_o[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (-65 < (var6 ^ -1)) {
                        this.a((byte) -66, var4);
                        this.field_o[var4] = vi.a(this.field_o[var4], -3);
                        break L14;
                      } else {
                        this.field_o[var4] = ge.a(this.field_o[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 != 99) {
                      break L15;
                    } else {
                      this.field_p[var4] = (var6 << 281002279) + vi.a(this.field_p[var4], 127);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 != var5) {
                      break L16;
                    } else {
                      this.field_p[var4] = var6 + vi.a(16256, this.field_p[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 101) {
                      break L17;
                    } else {
                      this.field_p[var4] = (var6 << -2017738873) + 16384 - -vi.a(127, this.field_p[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 != (var5 ^ -1)) {
                      break L18;
                    } else {
                      this.field_p[var4] = vi.a(16256, this.field_p[var4]) + (16384 + var6);
                      break L18;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) != -121) {
                      break L19;
                    } else {
                      this.a(var4, (byte) -82);
                      break L19;
                    }
                  }
                  L20: {
                    if (121 == var5) {
                      this.b(var4, (byte) 121);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-124 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      this.b((byte) -12, var4);
                      break L21;
                    }
                  }
                  L22: {
                    if (6 == var5) {
                      var7 = this.field_p[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        this.field_v[var4] = (var6 << 1085406439) + vi.a(-16257, this.field_v[var4]);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (-39 != (var5 ^ -1)) {
                      break L23;
                    } else {
                      var7 = this.field_p[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        this.field_v[var4] = vi.a(-128, this.field_v[var4]) - -var6;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-17 == (var5 ^ -1)) {
                      this.field_D[var4] = vi.a(this.field_D[var4], -16257) + (var6 << 534312935);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (-49 != (var5 ^ -1)) {
                      break L25;
                    } else {
                      this.field_D[var4] = var6 + vi.a(-128, this.field_D[var4]);
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      if (64 <= var6) {
                        this.field_o[var4] = ge.a(this.field_o[var4], 4);
                        break L26;
                      } else {
                        this.a(120, var4);
                        this.field_o[var4] = vi.a(this.field_o[var4], -5);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (-18 != (var5 ^ -1)) {
                      break L27;
                    } else {
                      this.b(var4, (var6 << -478453177) + (-16257 & this.field_C[var4]), param1 + -166);
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.b(var4, (-128 & this.field_C[var4]) - -var6, param1 + -208);
                    return;
                  }
                } else {
                  if ((var3 ^ -1) != -193) {
                    L28: {
                      if (param1 == 93) {
                        break L28;
                      } else {
                        this.field_M = (fj) null;
                        break L28;
                      }
                    }
                    if (208 != var3) {
                      if (var3 != 224) {
                        var3 = param0 & 255;
                        if (-256 != (var3 ^ -1)) {
                          return;
                        } else {
                          this.a(28034, true);
                          return;
                        }
                      } else {
                        var4 = 15 & param0;
                        var5 = (16256 & param0 >> -679715959) - -(127 & param0 >> -245851416);
                        this.a(var4, 78, var5);
                        return;
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = param0 >> 1973486248 & 127;
                      this.a(var4, true, var5);
                      return;
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = param0 >> -860817912 & 127;
                    this.c(var5 + this.field_H[var4], -129, var4);
                    return;
                  }
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = (param0 & 32722) >> -783510200;
              var6 = 127 & param0 >> 6961392;
              if (-1 > (var6 ^ -1)) {
                this.a(var4, var5, (byte) 96, var6);
                return;
              } else {
                this.b(64, var5, -16257, var4);
                break L0;
              }
            }
          }
          return;
        }
    }

    private final synchronized void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if ((param2 ^ -1) <= -1) {
            this.field_A[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                this.field_A[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            this.a((byte) 102, -79);
            break L2;
          }
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        this.b(param1, param0, (byte) -114);
        if (param2 <= 63) {
            this.a(13, false, (fj) null);
        }
    }

    final synchronized void a(boolean param0, fj param1, int param2, boolean param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!(this.field_S.b())) {
            this.a(-23335, param3, param1);
            return;
        }
        try {
            this.field_z = param3 ? true : false;
            this.field_M = param1;
            if (param5 > -103) {
                this.a(true, -73, true, (fj) null);
            }
            this.field_r = param0 ? true : false;
            var7_int = this.field_S.a(this.field_l) * param4;
            var8 = this.field_S.field_f * param2;
            var7_int = (-1 + (var7_int - -var8)) / var8 * var8;
            this.field_P = ((param4 >> 91120961) + var7_int) / param4;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "lj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        he var5 = null;
        dl var6 = null;
        int var6_int = 0;
        he var7 = null;
        int var8 = 0;
        he var9 = null;
        int var10 = 0;
        ik var11 = null;
        ik var12 = null;
        Object stackIn_17_0 = null;
        he stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        he stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        he stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackOut_16_0 = null;
        he stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        he stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        he stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          this.b(64, param1, -16257, param0);
          if (-1 != (2 & this.field_o[param0] ^ -1)) {
            var5 = (he) ((Object) this.field_O.field_k.d((byte) -122));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_F) {
                    break L2;
                  } else {
                    if (var5.field_n < 0) {
                      this.field_I[param0][var5.field_h] = null;
                      this.field_I[param0][param1] = var5;
                      var6_int = var5.field_k + (var5.field_z * var5.field_A >> -1650025172);
                      var5.field_k = var5.field_k + (param1 + -var5.field_h << -1158303608);
                      var5.field_A = 4096;
                      var5.field_z = -var5.field_k + var6_int;
                      var5.field_h = param1;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (he) ((Object) this.field_O.field_k.b(10708));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (ik) ((Object) this.field_j.a((long)this.field_F[param0], -1));
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_g[param1];
          if (var6 != null) {
            L3: {
              var7 = new he();
              var7.field_D = var6;
              var7.field_F = param0;
              var7.field_g = var11;
              var7.field_x = var11.field_f[param1];
              var7.field_f = var11.field_h[param1];
              var7.field_h = param1;
              var8 = 14 / ((-10 - param2) / 43);
              var7.field_t = var11.field_j[param1] * (var12.field_l * param3 * param3) - -1024 >> 1651003371;
              var7.field_q = 255 & var11.field_k[param1];
              var7.field_k = -(32767 & var11.field_m[param1]) + (param1 << -790528344);
              var7.field_m = 0;
              var7.field_B = 0;
              var7.field_j = 0;
              var7.field_n = -1;
              var7.field_s = 0;
              if (this.field_D[param0] != 0) {
                L4: {
                  var7.field_l = bb.a(var6, this.a((byte) 54, var7), 0, this.b(2, var7));
                  stackOut_16_0 = this;
                  stackOut_16_1 = (he) (var7);
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if ((var12.field_m[param1] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (he) ((Object) stackIn_18_1);
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (he) ((Object) stackIn_17_1);
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                this.a(stackIn_19_1, stackIn_19_2 != 0, 9929);
                break L3;
              } else {
                var7.field_l = bb.a(var6, this.a((byte) 54, var7), this.a(-24531, var7), this.b(2, var7));
                break L3;
              }
            }
            L5: {
              if ((var12.field_m[param1] ^ -1) > -1) {
                var7.field_l.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_f < 0) {
                break L6;
              } else {
                L7: {
                  var9 = this.field_t[param0][var7.field_f];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 >= (var9.field_n ^ -1)) {
                      break L7;
                    } else {
                      this.field_I[param0][var9.field_h] = null;
                      var9.field_n = 0;
                      break L7;
                    }
                  }
                }
                this.field_t[param0][var7.field_f] = var7;
                break L6;
              }
            }
            this.field_O.field_k.a(-73, var7);
            this.field_I[param0][param1] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void b(byte param0) {
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= 24) {
            this.field_t = (he[][]) null;
        }
        ik var4 = (ik) ((Object) this.field_j.a((byte) 125));
        while (var4 != null) {
            var4.c(false);
            var4 = (ik) ((Object) this.field_j.c((byte) -87));
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_A = (int[]) null;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized boolean f(int param0) {
        if (param0 >= -20) {
            field_N = (hj) null;
        }
        return this.field_S.b();
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8841) {
            this.field_A = (int[]) null;
        }
        this.field_S.e();
        this.field_M = null;
        this.a(param1 ^ 20235, param0);
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = OrbDefence.field_D ? 1 : 0;
            if (!this.field_S.b()) {
              break L1;
            } else {
              var2 = this.field_K * this.field_S.field_f / la.field_c;
              L2: while (true) {
                var3 = (long)param0 * (long)var2 + this.field_l;
                if (-1L < (this.field_R + -var3 ^ -1L)) {
                  var5 = (int)((-1L + -this.field_l + (this.field_R - -(long)var2)) / (long)var2);
                  this.field_l = this.field_l + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_O.c(var5);
                  this.a((byte) -105);
                  if (this.field_S.b()) {
                    continue L2;
                  } else {
                    this.field_O.c(param0);
                    break L0;
                  }
                } else {
                  this.field_l = var3;
                  break L1;
                }
              }
            }
          }
          this.field_O.c(param0);
          break L0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 <= 49) {
            return;
        }
        this.field_Q[param0] = param2;
    }

    private final void a(int param0, byte param1) {
        he var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 < -66) {
          var3 = (he) ((Object) this.field_O.field_k.b((byte) 114));
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (-1 < (param0 ^ -1)) {
                    break L2;
                  } else {
                    if (param0 != var3.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (null == var3.field_l) {
                    break L3;
                  } else {
                    L4: {
                      var3.field_l.f(la.field_c / 100);
                      if (!var3.field_l.e()) {
                        break L4;
                      } else {
                        this.field_O.field_m.a(var3.field_l);
                        break L4;
                      }
                    }
                    var3.d(5);
                    break L3;
                  }
                }
                L5: {
                  if (0 > var3.field_n) {
                    this.field_I[var3.field_F][var3.field_h] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3.b(57);
                break L1;
              }
              var3 = (he) ((Object) this.field_O.field_k.d(853));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, he param1, int param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.field_w = la.field_c / 100;
              if (-1 < (param1.field_n ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (null == param1.field_l) {
                    break L2;
                  } else {
                    if (!param1.field_l.k()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param1.d(param0 ^ 4165);
                  param1.b(57);
                  if ((param1.field_f ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (this.field_t[param1.field_F][param1.field_f] == param1) {
                      this.field_t[param1.field_F][param1.field_f] = null;
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
              var6_int = param1.field_A;
              if (-1 <= (var6_int ^ -1)) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)this.field_G[param1.field_F]) * 16.0);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param1.field_A = var6_int;
                break L4;
              }
            }
            L6: {
              param1.field_l.h(this.a((byte) 54, param1));
              if (param0 == 4160) {
                break L6;
              } else {
                this.a((byte) 116);
                break L6;
              }
            }
            L7: {
              var7 = param1.field_x;
              param1.field_E = param1.field_E + var7.field_h;
              param1.field_v = param1.field_v + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param1.field_A * param1.field_z >> -1896471252) + (param1.field_h + -60 << -777429176));
              if (-1 > (var7.field_c ^ -1)) {
                L8: {
                  if (0 < var7.field_k) {
                    param1.field_s = param1.field_s + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
                    break L8;
                  } else {
                    param1.field_s = param1.field_s + 128;
                    break L8;
                  }
                }
                if (819200 > param1.field_s * var7.field_c) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (null == var7.field_l) {
                break L9;
              } else {
                L10: {
                  if (0 < var7.field_g) {
                    param1.field_B = param1.field_B + (int)(0.5 + Math.pow(2.0, (double)var7.field_g * var9) * 128.0);
                    break L10;
                  } else {
                    param1.field_B = param1.field_B + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_l.length - 2 <= param1.field_m) {
                      break L12;
                    } else {
                      if ((var7.field_l[param1.field_m + 2] << 1232257544 & 65280) >= param1.field_B) {
                        break L12;
                      } else {
                        param1.field_m = param1.field_m + 2;
                        continue L11;
                      }
                    }
                  }
                  if (-2 + var7.field_l.length != param1.field_m) {
                    break L9;
                  } else {
                    if (var7.field_l[1 + param1.field_m] == 0) {
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
              if (param1.field_n < 0) {
                break L13;
              } else {
                if (null == var7.field_e) {
                  break L13;
                } else {
                  if (0 == (this.field_o[param1.field_F] & 1)) {
                    L14: {
                      if (param1.field_f < 0) {
                        break L14;
                      } else {
                        if (param1 != this.field_t[param1.field_F][param1.field_f]) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if ((var7.field_f ^ -1) < -1) {
                        param1.field_n = param1.field_n + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
                        break L15;
                      } else {
                        param1.field_n = param1.field_n + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param1.field_j >= var7.field_e.length + -2) {
                          break L17;
                        } else {
                          if ((var7.field_e[param1.field_j + 2] & 255) << 1710955272 >= param1.field_n) {
                            break L17;
                          } else {
                            param1.field_j = param1.field_j + 2;
                            continue L16;
                          }
                        }
                      }
                      if (-2 + var7.field_e.length != param1.field_j) {
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
                param1.field_l.f(param1.field_w);
                if (param4 == null) {
                  param1.field_l.c(param3);
                  break L18;
                } else {
                  param1.field_l.b(param4, param2, param3);
                  break L18;
                }
              }
              L19: {
                if (param1.field_l.e()) {
                  this.field_O.field_m.a(param1.field_l);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param1.d(5);
                if (0 <= param1.field_n) {
                  param1.b(param0 + -4103);
                  if (-1 <= (param1.field_f ^ -1)) {
                    break L20;
                  } else {
                    if (param1 != this.field_t[param1.field_F][param1.field_f]) {
                      break L20;
                    } else {
                      this.field_t[param1.field_F][param1.field_f] = null;
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_63_0 = 1;
              stackIn_64_0 = stackOut_63_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.field_l.a(param1.field_w, this.a(-24531, param1), this.b(2, param1));
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var6);
            stackOut_67_1 = new StringBuilder().append("lj.W(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_64_0 != 0;
          } else {
            return stackIn_66_0 != 0;
          }
        }
    }

    final static void c(boolean param0) {
        hf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              cd.field_w.a();
              wf.field_b.a();
              kg.field_f = kg.field_f - 1;
              if (-1 != (kg.field_f ^ -1)) {
                break L1;
              } else {
                kg.field_f = 200;
                var1 = (hf) ((Object) ba.field_b.b((byte) -28));
                L2: while (true) {
                  if (var1 == null) {
                    if (bg.field_a == null) {
                      break L1;
                    } else {
                      var1 = (hf) ((Object) bg.field_a.b((byte) 126));
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var1.field_f.b(true)) {
                              break L4;
                            } else {
                              var1.b(57);
                              break L4;
                            }
                          }
                          var1 = (hf) ((Object) bg.field_a.d(853));
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (!var1.field_f.b(true)) {
                        var1.b(57);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (hf) ((Object) ba.field_b.d(853));
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (ml.field_c == null) {
                break L6;
              } else {
                if (!ml.field_c.f(-114)) {
                  ll.field_a = null;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_N = (hj) null;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "lj.OA(" + param0 + ')');
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, int param2, String param3, byte param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var5_ref = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if ((var7_int ^ -1) <= -1) {
                          if (0 > param2) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (var7_int < 0) {
                          break L4;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          if (param0 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        if (param3 == null) {
                          break L2;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if ((param2 ^ -1) < -1) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param2));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param4 == 72) {
                        break L9;
                      } else {
                        field_E = 10;
                        break L9;
                      }
                    }
                    L10: {
                      if (param0 == null) {
                        break L10;
                      } else {
                        if (0 < param0.length()) {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param3 == null) {
                        break L11;
                      } else {
                        if (0 < param3.length()) {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param3);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5_ref.length() <= var6) {
                        discarded$16 = var7.append('/');
                        break L12;
                      } else {
                        discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackOut_41_0 = new java.net.URL(param1, var7.toString());
                        stackIn_42_0 = stackOut_41_0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_43_0 = (java.net.URL) (param1);
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) (var5);
                stackOut_45_1 = new StringBuilder().append("lj.TA(");
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param0 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L14;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L14;
                }
              }
              L15: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param1 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L15;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L15;
                }
              }
              L16: {
                stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param2).append(',');
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param3 == null) {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L16;
                } else {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L16;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param4 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1, byte param2) {
        this.field_J[param0] = param1;
        if (param2 >= -79) {
            this.field_s = 6;
        }
        this.field_H[param0] = vi.a(param1, -128);
        this.c(param1, -129, param0);
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 <= 109) {
            field_u = 113;
        }
        field_N = null;
        field_B = null;
    }

    final synchronized void e(int param0) {
        this.a(true, 8841);
        if (param0 <= 61) {
            this.a((he) null, false, -3);
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if ((param0 ^ -1) <= -1) {
          L0: {
            this.field_w[param0] = 12800;
            this.field_y[param0] = 8192;
            this.field_x[param0] = 16383;
            this.field_Q[param0] = 8192;
            this.field_n[param0] = 0;
            this.field_G[param0] = 8192;
            this.a((byte) -75, param0);
            this.a(126, param0);
            this.field_o[param0] = 0;
            this.field_p[param0] = 32767;
            this.field_v[param0] = 256;
            if (param1 > 77) {
              break L0;
            } else {
              this.field_Q = (int[]) null;
              break L0;
            }
          }
          this.field_D[param0] = 0;
          this.b(param0, 8192, -93);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.b(param0, (byte) 86);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final int a(int param0, he param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rc var9 = null;
        rc var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (this.field_A[param1.field_F] != 0) {
              L1: {
                var9 = param1.field_x;
                var10 = var9;
                var4 = this.field_w[param1.field_F] * this.field_x[param1.field_F] + 4096 >> -867148019;
                var4 = var4 * var4 + 16384 >> -1228228305;
                var4 = 16384 + var4 * param1.field_t >> 1451847983;
                var4 = this.field_k * var4 + 128 >> 1974627688;
                var4 = 128 + this.field_A[param1.field_F] * var4 >> -1741030936;
                if (var10.field_c > 0) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param1.field_s * 0.00001953125 * (double)var10.field_c));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_l) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_B;
                    var6 = var10.field_l[param1.field_m - -1];
                    if (param1.field_m >= -2 + var10.field_l.length) {
                      break L3;
                    } else {
                      var7 = var9.field_l[param1.field_m] << -545955128 & 65280;
                      var8 = var10.field_l[2 + param1.field_m] << 1609611976 & 65280;
                      var6 = var6 + (var10.field_l[param1.field_m - -3] - var6) * (var5 + -var7) / (var8 - var7);
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 479893030;
                  break L2;
                }
              }
              L4: {
                if ((param1.field_n ^ -1) >= -1) {
                  break L4;
                } else {
                  if (null == var10.field_e) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param1.field_n;
                      var6 = var10.field_e[1 + param1.field_j];
                      if (param1.field_j < -2 + var10.field_e.length) {
                        var7 = var9.field_e[param1.field_j] << 2075454792 & 65280;
                        var8 = (var10.field_e[param1.field_j + 2] & 255) << -1771317272;
                        var6 = var6 + (var10.field_e[3 + param1.field_j] + -var6) * (-var7 + var5) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var4 * var6 - -32 >> 320100838;
                    break L4;
                  }
                }
              }
              L6: {
                if (param0 == -24531) {
                  break L6;
                } else {
                  this.field_s = 60;
                  break L6;
                }
              }
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
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
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("lj.HA(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_19_0;
        }
    }

    final boolean a(he param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
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
            L1: {
              if (param1 >= 64) {
                break L1;
              } else {
                this.b(-32, -64, (byte) -45);
                break L1;
              }
            }
            if (null != param0.field_l) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param0.field_n >= 0) {
                L2: {
                  param0.b(57);
                  if (0 >= param0.field_f) {
                    break L2;
                  } else {
                    if (this.field_t[param0.field_F][param0.field_f] != param0) {
                      break L2;
                    } else {
                      this.field_t[param0.field_F][param0.field_f] = null;
                      break L2;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("lj.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final int b(int param0, he param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = this.field_y[param1.field_F];
              if (param0 == 2) {
                break L1;
              } else {
                field_N = (hj) null;
                break L1;
              }
            }
            if (var3_int >= 8192) {
              stackOut_5_0 = 16384 + -((16384 + -var3_int) * (128 + -param1.field_q) + 32 >> -12563194);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = param1.field_q * var3_int - -32 >> -1400667898;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("lj.BA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_C[param0] = param1;
        this.field_L[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0);
        if (param2 > -58) {
            this.field_G = (int[]) null;
        }
    }

    final synchronized boolean a(ki param0, vd param1, byte param2, fj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        mc var8 = null;
        int var9 = 0;
        int var11 = 0;
        ik var12 = null;
        ik var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if (-1 > (param4 ^ -1)) {
                var7 = new int[]{param4};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (mc) ((Object) param3.field_g.a((byte) 122));
            if (param2 == 31) {
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param3.a();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_20_0 = var6_int;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var9 = (int)var8.field_d;
                    var12 = (ik) ((Object) this.field_j.a((long)var9, -1));
                    if (var12 == null) {
                      var13 = le.a(var9, param0, 10);
                      if (var13 == null) {
                        var6_int = 0;
                        break L4;
                      } else {
                        this.field_j.a((long)var9, (byte) -104, var13);
                        if (var13.a(-78, param1, (int[]) (var7), var8.field_h)) {
                          break L4;
                        } else {
                          var6_int = 0;
                          break L4;
                        }
                      }
                    } else {
                      if (var12.a(-78, param1, (int[]) (var7), var8.field_h)) {
                        break L4;
                      } else {
                        var6_int = 0;
                        var8 = (mc) ((Object) param3.field_g.c((byte) -94));
                        continue L2;
                      }
                    }
                  }
                  var8 = (mc) ((Object) param3.field_g.c((byte) -94));
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("lj.CA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    private final void b(byte param0, int param1) {
        he var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 == -12) {
          var3 = (he) ((Object) this.field_O.field_k.b((byte) 126));
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (-1 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (param1 != var3.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 >= (var3.field_n ^ -1)) {
                  break L1;
                } else {
                  this.field_I[var3.field_F][var3.field_h] = null;
                  var3.field_n = 0;
                  break L1;
                }
              }
              var3 = (he) ((Object) this.field_O.field_k.d(853));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -17615) {
            this.field_Q = (int[]) null;
        }
    }

    private final synchronized void a(int param0, boolean param1, fj param2) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              this.a(param1, -122, true, param2);
              if (param0 == -23335) {
                break L1;
              } else {
                this.field_x = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("lj.M(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public lj() {
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_C = new int[16];
        this.field_y = new int[16];
        this.field_L = new int[16];
        this.field_A = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_Q = new int[16];
        this.field_x = new int[16];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_D = new int[16];
        this.field_k = 256;
        this.field_t = new he[16][128];
        this.field_I = new he[16][128];
        this.field_F = new int[16];
        this.field_H = new int[16];
        this.field_K = 1000000;
        this.field_S = new qi();
        this.field_O = new jg((lj) (this));
        this.field_j = new mh(128);
        this.b(256, false, -1);
        this.a(28034, true);
    }

    static {
        field_B = "SOLAR BLAST";
        field_E = 0;
    }
}
