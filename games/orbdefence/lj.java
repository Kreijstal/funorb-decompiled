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
        he var6;
        int var7;
        he var8;
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
        he var3;
        int var4;
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
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
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
                  stackIn_24_0 = this.field_P;
                  stackIn_24_1 = var3;
                  if (stackIn_24_0 < stackIn_24_1) {
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
                  if ((this.field_S.field_i[var2] ^ -1) != (var3 ^ -1)) {
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
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (!(param0 == this.field_F[param2])) {
            this.field_F[param2] = param0;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                this.field_t[param2][var4] = null;
            }
        }
        if (param1 != -129) {
            this.a();
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("lj.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        if (param1 < 103) {
            fj var4 = (fj) null;
            this.a((ki) null, (vd) null, (byte) -88, (fj) null, 47);
        }
        this.field_k = param0;
    }

    final void a(he param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("lj.Q(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
                stackIn_13_0 = 1;
                break L5;
              } else {
                stackIn_13_0 = var5;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("lj.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
                he var8 = (he) null;
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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        int var4;
        int var5;
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
            fj var5 = (fj) null;
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
                fj var9 = (fj) null;
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
        Object stackIn_18_0 = null;
        he stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        he stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        he var5;
        int var6_int;
        dl var6;
        he var7;
        int var8;
        he var9;
        int var10;
        ik var11;
        ik var12;
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
                  stackIn_18_0 = this;

                  stackIn_18_1 = (he) (var7);

                  if ((var12.field_m[param1] ^ -1) <= -1) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = (he) ((Object) stackIn_18_1);
                    stackIn_19_2 = 0;
                    break L4;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = (he) ((Object) stackIn_18_1);
                    stackIn_19_2 = 1;
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
        int var2;
        long var3;
        int var5;
        int var6;
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
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 >= -66) {
            return;
        }
        he var3 = (he) ((Object) this.field_O.field_k.b((byte) 114));
        while (var3 != null) {
            if (-1 < (param0 ^ -1) || param0 == var3.field_F) {
                if (null != var3.field_l) {
                    var3.field_l.f(la.field_c / 100);
                    if (var3.field_l.e()) {
                        this.field_O.field_m.a(var3.field_l);
                    }
                    var3.d(5);
                }
                if (!(0 <= var3.field_n)) {
                    this.field_I[var3.field_F][var3.field_h] = null;
                }
                var3.b(57);
            }
            var3 = (he) ((Object) this.field_O.field_k.d(853));
        }
    }

    final boolean a(int param0, he param1, int param2, int param3, int[] param4) {
        int stackIn_10_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
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
                stackIn_10_0 = 1;
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
                      if ((var7.field_l[param1.field_m + 2] << 1232257544 & 65280 ^ -1) <= (param1.field_B ^ -1)) {
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
                          if (((var7.field_e[param1.field_j + 2] & 255) << 1710955272 ^ -1) <= (param1.field_n ^ -1)) {
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
              stackIn_64_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.field_l.a(param1.field_w, this.a(-24531, param1), this.b(2, param1));
              stackIn_66_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var6);

            stackIn_69_1 = new StringBuilder().append("lj.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L22;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L22;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ')');
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
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var5 = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if ((var7_int ^ -1) <= -1) {
                          if (0 > param2) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
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
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          if (param0 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        if (param3 == null) {
                          break L2;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if ((param2 ^ -1) < -1) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param2));
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
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param0);
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
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param3);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5.length() <= var6) {
                        discarded$7 = var7.append('/');
                        break L12;
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_42_0 = new java.net.URL(param1, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param1);
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
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("lj.TA(");

                if (param0 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

                if (param1 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L16;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L16;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ',' + param4 + ')');
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
            he var3 = (he) null;
            this.a((he) null, false, -3);
        }
    }

    private final void b(int param0, byte param1) {
        int var4;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_19_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("lj.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_11_0 = 0;
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
                stackIn_9_0 = 1;
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
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lj.P(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = 16384 + -((16384 + -var3_int) * (128 + -param1.field_q) + 32 >> -12563194);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = param1.field_q * var3_int - -32 >> -1400667898;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lj.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        mc var8 = null;
        int var9 = 0;
        int var11 = 0;
        ik var12 = null;
        ik var13 = null;
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
                  stackIn_21_0 = var6_int;
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
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6);

            stackIn_24_1 = new StringBuilder().append("lj.CA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -12) {
            return;
        }
        he var3 = (he) ((Object) this.field_O.field_k.b((byte) 126));
        while (var3 != null) {
            if (-1 < (param1 ^ -1) || param1 == var3.field_F) {
                if (-1 < (var3.field_n ^ -1)) {
                    this.field_I[var3.field_F][var3.field_h] = null;
                    var3.field_n = 0;
                }
            }
            var3 = (he) ((Object) this.field_O.field_k.d(853));
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -17615) {
            this.field_Q = (int[]) null;
        }
    }

    private final synchronized void a(int param0, boolean param1, fj param2) {
        try {
            this.a(param1, -122, true, param2);
            if (param0 != -23335) {
                this.field_x = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "lj.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
