/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

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
        var8 = ((lj) this).field_I[param3][param1];
        if (var8 != null) {
          ((lj) this).field_I[param3][param1] = null;
          if (param2 == -16257) {
            L0: {
              if (-1 == (((lj) this).field_o[param3] & 2 ^ -1)) {
                var8.field_n = 0;
                break L0;
              } else {
                var6 = (he) (Object) ((lj) this).field_O.field_k.b((byte) -75);
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
                    var6 = (he) (Object) ((lj) this).field_O.field_k.d(853);
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
            if (0 == (((lj) this).field_o[param1] & 2)) {
              break L0;
            } else {
              var3 = (he) (Object) ((lj) this).field_O.field_k.b((byte) 121);
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var3.field_F != param1) {
                      break L2;
                    } else {
                      if (null == ((lj) this).field_I[param1][var3.field_h]) {
                        if ((var3.field_n ^ -1) > -1) {
                          var3.field_n = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var3 = (he) (Object) ((lj) this).field_O.field_k.d(853);
                        continue L1;
                      }
                    }
                  }
                  var3 = (he) (Object) ((lj) this).field_O.field_k.d(853);
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
            ((lj) this).field_F[var3] = ((lj) this).field_J[var3];
        }
        if (param0 != 28034) {
            ((lj) this).field_o = null;
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((lj) this).field_H[var5] = vi.a(-128, ((lj) this).field_J[var5]);
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
            var2 = ((lj) this).field_q;
            var3 = ((lj) this).field_s;
            var4 = ((lj) this).field_R;
            if (((lj) this).field_M == null) {
              break L0;
            } else {
              if (((lj) this).field_P == var3) {
                this.a(((lj) this).field_z, -112, ((lj) this).field_r, ((lj) this).field_M);
                this.a((byte) -90);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: while (true) {
            if (var3 != ((lj) this).field_s) {
              L2: {
                ((lj) this).field_s = var3;
                ((lj) this).field_q = var2;
                ((lj) this).field_R = var4;
                if (((lj) this).field_M == null) {
                  break L2;
                } else {
                  if (((lj) this).field_P < var3) {
                    ((lj) this).field_s = ((lj) this).field_P;
                    ((lj) this).field_q = -1;
                    ((lj) this).field_R = ((lj) this).field_S.f(((lj) this).field_s);
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
                  if (((lj) this).field_S.field_i[var2] != var3) {
                    break L4;
                  } else {
                    ((lj) this).field_S.c(var2);
                    var6 = ((lj) this).field_S.b(var2);
                    if (var6 == 1) {
                      ((lj) this).field_S.g();
                      ((lj) this).field_S.a(var2);
                      if (!((lj) this).field_S.c()) {
                        break L4;
                      } else {
                        if (null == ((lj) this).field_M) {
                          L5: {
                            if (!((lj) this).field_z) {
                              break L5;
                            } else {
                              if (0 != var3) {
                                ((lj) this).field_S.b(var4);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.a(28034, true);
                          ((lj) this).field_S.e();
                          return;
                        } else {
                          this.a(-23335, ((lj) this).field_z, ((lj) this).field_M);
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
                      ((lj) this).field_S.d(var2);
                      ((lj) this).field_S.a(var2);
                      continue L3;
                    }
                  }
                }
                var2 = ((lj) this).field_S.d();
                var3 = ((lj) this).field_S.field_i[var2];
                var4 = ((lj) this).field_S.f(var3);
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
        if (!(param0 == ((lj) this).field_F[param2])) {
            ((lj) this).field_F[param2] = param0;
            for (var4 = 0; (var4 ^ -1) > -129; var4++) {
                ((lj) this).field_t[param2][var4] = null;
            }
        }
        if (param1 != -129) {
            di discarded$0 = ((lj) this).a();
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = OrbDefence.field_D ? 1 : 0;
            if (!((lj) this).field_S.b()) {
              break L1;
            } else {
              var4 = ((lj) this).field_K * ((lj) this).field_S.field_f / la.field_c;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((lj) this).field_l;
                if (0L <= -var5 + ((lj) this).field_R) {
                  ((lj) this).field_l = var5;
                  break L1;
                } else {
                  var7 = (int)((-1L + ((long)var4 + -((lj) this).field_l) + ((lj) this).field_R) / (long)var4);
                  ((lj) this).field_l = ((lj) this).field_l + (long)var7 * (long)var4;
                  ((lj) this).field_O.b(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.a((byte) -58);
                  if (((lj) this).field_S.b()) {
                    continue L2;
                  } else {
                    ((lj) this).field_O.b(param0, param1, param2);
                    break L0;
                  }
                }
              }
            }
          }
          ((lj) this).field_O.b(param0, param1, param2);
          break L0;
        }
    }

    private final void a(int param0, int param1) {
        he var3 = null;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (!((((lj) this).field_o[param1] & 4) == 0)) {
            var3 = (he) (Object) ((lj) this).field_O.field_k.b((byte) 115);
            while (var3 != null) {
                if (!(param1 != var3.field_F)) {
                    var3.field_i = 0;
                }
                var3 = (he) (Object) ((lj) this).field_O.field_k.d(853);
            }
        }
        if (param0 < 103) {
            ((lj) this).field_L = null;
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param1 < 103) {
            Object var4 = null;
            boolean discarded$0 = ((lj) this).a((ki) null, (vd) null, (byte) -88, (fj) null, 47);
        }
        ((lj) this).field_k = param0;
    }

    final void a(he param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param0.field_D.field_g.length;
            if (!param1) {
              break L1;
            } else {
              if (!param0.field_D.field_k) {
                break L1;
              } else {
                var6 = var4 + var4 + -param0.field_D.field_i;
                var5 = (int)((long)((lj) this).field_D[param0.field_F] * (long)var6 >> -148469050);
                var4 = var4 << 8;
                if (var4 <= var5) {
                  var5 = -var5 + (-1 + var4 + var4);
                  param0.field_l.c(true);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)((lj) this).field_D[param0.field_F] * (long)var4 >> 2139755206);
          break L0;
        }
        L2: {
          if (param2 == 9929) {
            break L2;
          } else {
            ((lj) this).field_j = null;
            break L2;
          }
        }
        param0.field_l.e(var5);
    }

    final synchronized di d() {
        return null;
    }

    final synchronized di a() {
        return (di) (Object) ((lj) this).field_O;
    }

    private final int a(byte param0, he param1) {
        int var3 = 0;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param1.field_k + (param1.field_z * param1.field_A >> 1810153324);
          var3 = var3 + (((lj) this).field_v[param1.field_F] * (-8192 + ((lj) this).field_Q[param1.field_F]) >> -949024628);
          var4 = param1.field_x;
          if (var4.field_h >= -1) {
            break L0;
          } else {
            L1: {
              if (0 < var4.field_j) {
                break L1;
              } else {
                if (-1 >= ((lj) this).field_n[param1.field_F]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = var4.field_j << -90533342;
              var6 = var4.field_b << -1174035199;
              if (var6 > param1.field_v) {
                var5 = var5 * param1.field_v / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((lj) this).field_n[param1.field_F] >> -2055881561);
            var7 = Math.sin((double)(511 & param1.field_E) * 0.01227184630308513);
            var3 = var3 + (int)((double)var5 * var7);
            break L0;
          }
        }
        L3: {
          var5 = (int)((double)(param1.field_D.field_h * 256) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)la.field_c + 0.5);
          if (param0 == 54) {
            break L3;
          } else {
            ((lj) this).field_p = null;
            break L3;
          }
        }
        L4: {
          if (1 > var5) {
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

    private final synchronized void a(boolean param0, int param1, boolean param2, fj param3) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        this.a(param2, 8841);
        ((lj) this).field_S.a(param3.field_f);
        ((lj) this).field_l = 0L;
        ((lj) this).field_z = param0 ? true : false;
        if (param1 >= -56) {
            Object var8 = null;
            ((lj) this).a((he) null, false, -61);
        }
        int var5 = ((lj) this).field_S.f();
        for (var6 = 0; var5 > var6; var6++) {
            ((lj) this).field_S.c(var6);
            ((lj) this).field_S.d(var6);
            ((lj) this).field_S.a(var6);
        }
        ((lj) this).field_q = ((lj) this).field_S.d();
        ((lj) this).field_s = ((lj) this).field_S.field_i[((lj) this).field_q];
        ((lj) this).field_R = ((lj) this).field_S.f(((lj) this).field_s);
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
              if (-161 == var3) {
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
                      ((lj) this).field_H[var4] = vi.a(-2080769, ((lj) this).field_H[var4]) + (var6 << -57508402);
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      ((lj) this).field_H[var4] = (var6 << -1954408409) + vi.a(((lj) this).field_H[var4], -16257);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      ((lj) this).field_n[var4] = vi.a(((lj) this).field_n[var4], -16257) + (var6 << 1524853639);
                      break L3;
                    }
                  }
                  L4: {
                    if (33 == var5) {
                      ((lj) this).field_n[var4] = var6 + vi.a(((lj) this).field_n[var4], -128);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 5) {
                      ((lj) this).field_G[var4] = (var6 << -532957881) + vi.a(((lj) this).field_G[var4], -16257);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var5) {
                      break L6;
                    } else {
                      ((lj) this).field_G[var4] = vi.a(-128, ((lj) this).field_G[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 7) {
                      ((lj) this).field_w[var4] = vi.a(((lj) this).field_w[var4], -16257) - -(var6 << 314425255);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-40 == (var5 ^ -1)) {
                      ((lj) this).field_w[var4] = vi.a(-128, ((lj) this).field_w[var4]) + var6;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) == -11) {
                      ((lj) this).field_y[var4] = (var6 << -2064978777) + vi.a(-16257, ((lj) this).field_y[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 42) {
                      break L10;
                    } else {
                      ((lj) this).field_y[var4] = vi.a(-128, ((lj) this).field_y[var4]) - -var6;
                      break L10;
                    }
                  }
                  L11: {
                    if (11 != var5) {
                      break L11;
                    } else {
                      ((lj) this).field_x[var4] = (var6 << -1396129401) + vi.a(((lj) this).field_x[var4], -16257);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((lj) this).field_x[var4] = var6 + vi.a(((lj) this).field_x[var4], -128);
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
                        ((lj) this).field_o[var4] = vi.a(((lj) this).field_o[var4], -2);
                        break L13;
                      } else {
                        ((lj) this).field_o[var4] = ge.a(((lj) this).field_o[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (-65 < (var6 ^ -1)) {
                        this.a((byte) -66, var4);
                        ((lj) this).field_o[var4] = vi.a(((lj) this).field_o[var4], -3);
                        break L14;
                      } else {
                        ((lj) this).field_o[var4] = ge.a(((lj) this).field_o[var4], 2);
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
                      ((lj) this).field_p[var4] = (var6 << 281002279) + vi.a(((lj) this).field_p[var4], 127);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 != var5) {
                      break L16;
                    } else {
                      ((lj) this).field_p[var4] = var6 + vi.a(16256, ((lj) this).field_p[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 101) {
                      break L17;
                    } else {
                      ((lj) this).field_p[var4] = (var6 << -2017738873) + 16384 - -vi.a(127, ((lj) this).field_p[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 != (var5 ^ -1)) {
                      break L18;
                    } else {
                      ((lj) this).field_p[var4] = vi.a(16256, ((lj) this).field_p[var4]) + (16384 + var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != -121) {
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
                    if (-124 != var5) {
                      break L21;
                    } else {
                      this.b((byte) -12, var4);
                      break L21;
                    }
                  }
                  L22: {
                    if (6 == var5) {
                      var7 = ((lj) this).field_p[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((lj) this).field_v[var4] = (var6 << 1085406439) + vi.a(-16257, ((lj) this).field_v[var4]);
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
                      var7 = ((lj) this).field_p[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        ((lj) this).field_v[var4] = vi.a(-128, ((lj) this).field_v[var4]) - -var6;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-17 == (var5 ^ -1)) {
                      ((lj) this).field_D[var4] = vi.a(((lj) this).field_D[var4], -16257) + (var6 << 534312935);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (-49 != var5) {
                      break L25;
                    } else {
                      ((lj) this).field_D[var4] = var6 + vi.a(-128, ((lj) this).field_D[var4]);
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 != var5) {
                      break L26;
                    } else {
                      if (64 <= var6) {
                        ((lj) this).field_o[var4] = ge.a(((lj) this).field_o[var4], 4);
                        break L26;
                      } else {
                        this.a(120, var4);
                        ((lj) this).field_o[var4] = vi.a(((lj) this).field_o[var4], -5);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (-18 != (var5 ^ -1)) {
                      break L27;
                    } else {
                      this.b(var4, (var6 << -478453177) + (-16257 & ((lj) this).field_C[var4]), param1 + -166);
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.b(var4, (-128 & ((lj) this).field_C[var4]) - -var6, param1 + -208);
                    return;
                  }
                } else {
                  if ((var3 ^ -1) != -193) {
                    L28: {
                      if (param1 == 93) {
                        break L28;
                      } else {
                        ((lj) this).field_M = null;
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
                    this.c(var5 + ((lj) this).field_H[var4], -129, var4);
                    return;
                  }
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = (param0 & 32722) >> -783510200;
              var6 = 127 & param0 >> 6961392;
              if (-1 > var6) {
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
            ((lj) this).field_A[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                ((lj) this).field_A[var4] = param0;
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
            Object var5 = null;
            this.a(13, false, (fj) null);
        }
    }

    final synchronized void a(boolean param0, fj param1, int param2, boolean param3, int param4, int param5) {
        if (!(((lj) this).field_S.b())) {
            this.a(-23335, param3, param1);
            return;
        }
        ((lj) this).field_z = param3 ? true : false;
        ((lj) this).field_M = param1;
        if (param5 > -103) {
            Object var9 = null;
            this.a(true, -73, true, (fj) null);
        }
        ((lj) this).field_r = param0 ? true : false;
        int var7 = ((lj) this).field_S.a(((lj) this).field_l) * param4;
        int var8 = ((lj) this).field_S.field_f * param2;
        var7 = (-1 + (var7 - -var8)) / var8 * var8;
        ((lj) this).field_P = ((param4 >> 91120961) + var7) / param4;
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
          if (-1 != (2 & ((lj) this).field_o[param0] ^ -1)) {
            var5 = (he) (Object) ((lj) this).field_O.field_k.d((byte) -122);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_F) {
                    break L2;
                  } else {
                    if (var5.field_n < 0) {
                      ((lj) this).field_I[param0][var5.field_h] = null;
                      ((lj) this).field_I[param0][param1] = var5;
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
                var5 = (he) (Object) ((lj) this).field_O.field_k.b(10708);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (ik) (Object) ((lj) this).field_j.a((long)((lj) this).field_F[param0], -1);
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
              if (((lj) this).field_D[param0] != 0) {
                L4: {
                  var7.field_l = bb.a(var6, this.a((byte) 54, var7), 0, this.b(2, var7));
                  stackOut_16_0 = this;
                  stackOut_16_1 = (he) var7;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if ((var12.field_m[param1] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (he) (Object) stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (he) (Object) stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                ((lj) this).a(stackIn_19_1, stackIn_19_2 != 0, 9929);
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
                  var9 = ((lj) this).field_t[param0][var7.field_f];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 >= (var9.field_n ^ -1)) {
                      break L7;
                    } else {
                      ((lj) this).field_I[param0][var9.field_h] = null;
                      var9.field_n = 0;
                      break L7;
                    }
                  }
                }
                ((lj) this).field_t[param0][var7.field_f] = var7;
                break L6;
              }
            }
            ((lj) this).field_O.field_k.a(-73, (ca) (Object) var7);
            ((lj) this).field_I[param0][param1] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void b(byte param0) {
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= 24) {
            ((lj) this).field_t = null;
        }
        ik var4 = (ik) (Object) ((lj) this).field_j.a((byte) 125);
        while (var4 != null) {
            var4.c(false);
            var4 = (ik) (Object) ((lj) this).field_j.c((byte) -87);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((lj) this).field_A = null;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized boolean f(int param0) {
        if (param0 >= -20) {
            field_N = null;
        }
        return ((lj) this).field_S.b();
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8841) {
            ((lj) this).field_A = null;
        }
        ((lj) this).field_S.e();
        ((lj) this).field_M = null;
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
            if (!((lj) this).field_S.b()) {
              break L1;
            } else {
              var2 = ((lj) this).field_K * ((lj) this).field_S.field_f / la.field_c;
              L2: while (true) {
                var3 = (long)param0 * (long)var2 + ((lj) this).field_l;
                if (-1L < (((lj) this).field_R + -var3 ^ -1L)) {
                  var5 = (int)((-1L + -((lj) this).field_l + (((lj) this).field_R - -(long)var2)) / (long)var2);
                  ((lj) this).field_l = ((lj) this).field_l + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((lj) this).field_O.c(var5);
                  this.a((byte) -105);
                  if (((lj) this).field_S.b()) {
                    continue L2;
                  } else {
                    ((lj) this).field_O.c(param0);
                    break L0;
                  }
                } else {
                  ((lj) this).field_l = var3;
                  break L1;
                }
              }
            }
          }
          ((lj) this).field_O.c(param0);
          break L0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 <= 49) {
            return;
        }
        ((lj) this).field_Q[param0] = param2;
    }

    private final void a(int param0, byte param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 >= -66) {
            return;
        }
        he var3 = (he) (Object) ((lj) this).field_O.field_k.b((byte) 114);
        while (var3 != null) {
            if (-1 >= (param0 ^ -1)) {
                // if_icmpne L159
            }
            if (null != var3.field_l) {
                var3.field_l.f(la.field_c / 100);
                if (var3.field_l.e()) {
                    ((lj) this).field_O.field_m.a((di) (Object) var3.field_l);
                }
                var3.d(5);
            }
            if (!(0 <= var3.field_n)) {
                ((lj) this).field_I[var3.field_F][var3.field_h] = null;
            }
            var3.b(57);
            var3 = (he) (Object) ((lj) this).field_O.field_k.d(853);
        }
    }

    final boolean a(int param0, he param1, int param2, int param3, int[] param4) {
        int var6 = 0;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          param1.field_w = la.field_c / 100;
          if (-1 < (param1.field_n ^ -1)) {
            break L0;
          } else {
            L1: {
              if (null == param1.field_l) {
                break L1;
              } else {
                if (!param1.field_l.k()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param1.d(param0 ^ 4165);
              param1.b(57);
              if ((param1.field_f ^ -1) >= -1) {
                break L2;
              } else {
                if (((lj) this).field_t[param1.field_F][param1.field_f] == param1) {
                  ((lj) this).field_t[param1.field_F][param1.field_f] = null;
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
          var6 = param1.field_A;
          if (-1 <= (var6 ^ -1)) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)((lj) this).field_G[param1.field_F]) * 16.0);
              if (0 <= var6) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param1.field_A = var6;
            break L3;
          }
        }
        L5: {
          param1.field_l.h(this.a((byte) 54, param1));
          if (param0 == 4160) {
            break L5;
          } else {
            this.a((byte) 116);
            break L5;
          }
        }
        L6: {
          var7 = param1.field_x;
          param1.field_E = param1.field_E + var7.field_h;
          param1.field_v = param1.field_v + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param1.field_A * param1.field_z >> -1896471252) + (param1.field_h + -60 << -777429176));
          if (-1 > (var7.field_c ^ -1)) {
            L7: {
              if (0 < var7.field_k) {
                param1.field_s = param1.field_s + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
                break L7;
              } else {
                param1.field_s = param1.field_s + 128;
                break L7;
              }
            }
            if (819200 > param1.field_s * var7.field_c) {
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
          if (null == var7.field_l) {
            break L8;
          } else {
            L9: {
              if (0 < var7.field_g) {
                param1.field_B = param1.field_B + (int)(0.5 + Math.pow(2.0, (double)var7.field_g * var9) * 128.0);
                break L9;
              } else {
                param1.field_B = param1.field_B + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (var7.field_l.length - 2 <= param1.field_m) {
                  break L11;
                } else {
                  if ((var7.field_l[param1.field_m + 2] << 1232257544 & 65280) >= param1.field_B) {
                    break L11;
                  } else {
                    param1.field_m = param1.field_m + 2;
                    continue L10;
                  }
                }
              }
              if (-2 + var7.field_l.length != param1.field_m) {
                break L8;
              } else {
                if (var7.field_l[1 + param1.field_m] == 0) {
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
          if (param1.field_n < 0) {
            break L12;
          } else {
            if (null == var7.field_e) {
              break L12;
            } else {
              if (0 == (((lj) this).field_o[param1.field_F] & 1)) {
                L13: {
                  if (param1.field_f < 0) {
                    break L13;
                  } else {
                    if (param1 != ((lj) this).field_t[param1.field_F][param1.field_f]) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if ((var7.field_f ^ -1) < -1) {
                    param1.field_n = param1.field_n + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
                    break L14;
                  } else {
                    param1.field_n = param1.field_n + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (param1.field_j >= var7.field_e.length + -2) {
                      break L16;
                    } else {
                      if ((var7.field_e[param1.field_j + 2] & 255) << 1710955272 >= param1.field_n) {
                        break L16;
                      } else {
                        param1.field_j = param1.field_j + 2;
                        continue L15;
                      }
                    }
                  }
                  if (-2 + var7.field_e.length != param1.field_j) {
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
            param1.field_l.f(param1.field_w);
            if (param4 == null) {
              param1.field_l.c(param3);
              break L17;
            } else {
              param1.field_l.b(param4, param2, param3);
              break L17;
            }
          }
          L18: {
            if (param1.field_l.e()) {
              ((lj) this).field_O.field_m.a((di) (Object) param1.field_l);
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            param1.d(5);
            if (0 <= param1.field_n) {
              param1.b(param0 + -4103);
              if (-1 <= (param1.field_f ^ -1)) {
                break L19;
              } else {
                if (param1 != ((lj) this).field_t[param1.field_F][param1.field_f]) {
                  break L19;
                } else {
                  ((lj) this).field_t[param1.field_F][param1.field_f] = null;
                  break L19;
                }
              }
            } else {
              break L19;
            }
          }
          return true;
        } else {
          param1.field_l.a(param1.field_w, this.a(-24531, param1), this.b(2, param1));
          return false;
        }
    }

    final static void c(boolean param0) {
        hf var1 = null;
        int var2 = OrbDefence.field_D ? 1 : 0;
        cd.field_w.a();
        wf.field_b.a();
        kg.field_f = kg.field_f - 1;
        if (-1 == (kg.field_f ^ -1)) {
            kg.field_f = 200;
            var1 = (hf) (Object) ba.field_b.b((byte) -28);
            while (var1 != null) {
                if (!(var1.field_f.b(true))) {
                    var1.b(57);
                }
                var1 = (hf) (Object) ba.field_b.d(853);
            }
            if (bg.field_a != null) {
                var1 = (hf) (Object) bg.field_a.b((byte) 126);
                while (var1 != null) {
                    if (!var1.field_f.b(true)) {
                        var1.b(57);
                    }
                    var1 = (hf) (Object) bg.field_a.d(853);
                }
            }
        }
        if (ml.field_c != null) {
            if (!(ml.field_c.f(-114))) {
                ll.field_a = null;
            }
        }
        if (param0) {
            field_N = null;
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, int param2, String param3, byte param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = OrbDefence.field_D ? 1 : 0;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if ((var7_int ^ -1) <= -1) {
                    if (0 > param2) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int < 0) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 > var7_int) {
                  break L4;
                } else {
                  if (param3 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if ((param2 ^ -1) < -1) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param2));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param4 == 72) {
                  break L7;
                } else {
                  field_E = 10;
                  break L7;
                }
              }
              L8: {
                if (param0 == null) {
                  break L8;
                } else {
                  if (0 < param0.length()) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param3 == null) {
                  break L9;
                } else {
                  if (0 < param3.length()) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param3);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (var5.length() <= var6) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L10;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L10;
                }
              }
              try {
                stackOut_41_0 = new java.net.URL(param1, var7.toString());
                stackIn_42_0 = stackOut_41_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_42_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1, byte param2) {
        ((lj) this).field_J[param0] = param1;
        if (param2 >= -79) {
            ((lj) this).field_s = 6;
        }
        ((lj) this).field_H[param0] = vi.a(param1, -128);
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
            Object var3 = null;
            ((lj) this).a((he) null, false, -3);
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if ((param0 ^ -1) <= -1) {
          L0: {
            ((lj) this).field_w[param0] = 12800;
            ((lj) this).field_y[param0] = 8192;
            ((lj) this).field_x[param0] = 16383;
            ((lj) this).field_Q[param0] = 8192;
            ((lj) this).field_n[param0] = 0;
            ((lj) this).field_G[param0] = 8192;
            this.a((byte) -75, param0);
            this.a(126, param0);
            ((lj) this).field_o[param0] = 0;
            ((lj) this).field_p[param0] = 32767;
            ((lj) this).field_v[param0] = 256;
            if (param1 > 77) {
              break L0;
            } else {
              ((lj) this).field_Q = null;
              break L0;
            }
          }
          ((lj) this).field_D[param0] = 0;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((lj) this).field_A[param1.field_F] == 0) {
            return 0;
        }
        rc var9 = param1.field_x;
        rc var10 = var9;
        int var4 = ((lj) this).field_w[param1.field_F] * ((lj) this).field_x[param1.field_F] + 4096 >> -867148019;
        var4 = var4 * var4 + 16384 >> -1228228305;
        var4 = 16384 + var4 * param1.field_t >> 1451847983;
        var4 = ((lj) this).field_k * var4 + 128 >> 1974627688;
        var4 = 128 + ((lj) this).field_A[param1.field_F] * var4 >> -1741030936;
        if (!(var10.field_c <= 0)) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param1.field_s * 0.00001953125 * (double)var10.field_c));
        }
        if (null != var10.field_l) {
            var5 = param1.field_B;
            var6 = var10.field_l[param1.field_m - -1];
            if (param1.field_m < -2 + var10.field_l.length) {
                var7 = var9.field_l[param1.field_m] << -545955128 & 65280;
                var8 = var10.field_l[2 + param1.field_m] << 1609611976 & 65280;
                var6 = var6 + (var10.field_l[param1.field_m - -3] - var6) * (var5 + -var7) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 479893030;
        }
        if ((param1.field_n ^ -1) < -1) {
            if (null != var10.field_e) {
                var5 = param1.field_n;
                var6 = var10.field_e[1 + param1.field_j];
                if (!(param1.field_j >= -2 + var10.field_e.length)) {
                    var7 = var9.field_e[param1.field_j] << 2075454792 & 65280;
                    var8 = (var10.field_e[param1.field_j + 2] & 255) << -1771317272;
                    var6 = var6 + (var10.field_e[3 + param1.field_j] + -var6) * (-var7 + var5) / (-var7 + var8);
                }
                var4 = var4 * var6 - -32 >> 320100838;
            }
        }
        if (param0 != -24531) {
            ((lj) this).field_s = 60;
        }
        return var4;
    }

    final boolean a(he param0, byte param1) {
        if (param1 < 64) {
            this.b(-32, -64, (byte) -45);
        }
        if (null == param0.field_l) {
            if (param0.field_n < 0) {
                return true;
            }
            param0.b(57);
            if (0 < param0.field_f) {
                if (((lj) this).field_t[param0.field_F][param0.field_f] == param0) {
                    ((lj) this).field_t[param0.field_F][param0.field_f] = null;
                }
            }
            return true;
        }
        return false;
    }

    private final int b(int param0, he param1) {
        int var3 = ((lj) this).field_y[param1.field_F];
        if (param0 != 2) {
            field_N = null;
        }
        if (var3 < 8192) {
            return param1.field_q * var3 - -32 >> -1400667898;
        }
        return 16384 + -((16384 + -var3) * (128 + -param1.field_q) + 32 >> -12563194);
    }

    private final void b(int param0, int param1, int param2) {
        ((lj) this).field_C[param0] = param1;
        ((lj) this).field_L[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0);
        if (param2 > -58) {
            ((lj) this).field_G = null;
        }
    }

    final synchronized boolean a(ki param0, vd param1, byte param2, fj param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        mc var8 = null;
        int var9 = 0;
        int var11 = 0;
        ik var12 = null;
        ik var13 = null;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          param3.b();
          var6 = 1;
          var7 = null;
          if (-1 > (param4 ^ -1)) {
            var7_array = new int[]{param4};
            break L0;
          } else {
            break L0;
          }
        }
        var8 = (mc) (Object) param3.field_g.a((byte) 122);
        if (param2 == 31) {
          L1: while (true) {
            if (var8 == null) {
              L2: {
                if (var6 != 0) {
                  param3.a();
                  break L2;
                } else {
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              L3: {
                var9 = (int)var8.field_d;
                var12 = (ik) (Object) ((lj) this).field_j.a((long)var9, -1);
                if (var12 == null) {
                  var13 = le.a(var9, param0, 10);
                  if (var13 == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((lj) this).field_j.a((long)var9, (byte) -104, (ca) (Object) var13);
                    if (var13.a(-78, param1, var7_array, var8.field_h)) {
                      break L3;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  }
                } else {
                  if (var12.a(-78, param1, var7_array, var8.field_h)) {
                    break L3;
                  } else {
                    var6 = 0;
                    var8 = (mc) (Object) param3.field_g.c((byte) -94);
                    continue L1;
                  }
                }
              }
              var8 = (mc) (Object) param3.field_g.c((byte) -94);
              continue L1;
            }
          }
        } else {
          return false;
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -12) {
            return;
        }
        he var3 = (he) (Object) ((lj) this).field_O.field_k.b((byte) 126);
        while (var3 != null) {
            if (-1 >= param1) {
                // if_icmpne L91
            }
            if (-1 > var3.field_n) {
                ((lj) this).field_I[var3.field_F][var3.field_h] = null;
                var3.field_n = 0;
            }
            var3 = (he) (Object) ((lj) this).field_O.field_k.d(853);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -17615) {
            ((lj) this).field_Q = null;
        }
    }

    private final synchronized void a(int param0, boolean param1, fj param2) {
        this.a(param1, -122, true, param2);
        if (param0 != -23335) {
            ((lj) this).field_x = null;
        }
    }

    public lj() {
        ((lj) this).field_p = new int[16];
        ((lj) this).field_o = new int[16];
        ((lj) this).field_C = new int[16];
        ((lj) this).field_y = new int[16];
        ((lj) this).field_L = new int[16];
        ((lj) this).field_A = new int[16];
        ((lj) this).field_w = new int[16];
        ((lj) this).field_G = new int[16];
        ((lj) this).field_Q = new int[16];
        ((lj) this).field_x = new int[16];
        ((lj) this).field_J = new int[16];
        ((lj) this).field_n = new int[16];
        ((lj) this).field_v = new int[16];
        ((lj) this).field_D = new int[16];
        ((lj) this).field_k = 256;
        ((lj) this).field_t = new he[16][128];
        ((lj) this).field_I = new he[16][128];
        ((lj) this).field_F = new int[16];
        ((lj) this).field_H = new int[16];
        ((lj) this).field_K = 1000000;
        ((lj) this).field_S = new qi();
        ((lj) this).field_O = new jg((lj) this);
        ((lj) this).field_j = new mh(128);
        this.b(256, false, -1);
        this.a(28034, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "SOLAR BLAST";
        field_E = 0;
    }
}
