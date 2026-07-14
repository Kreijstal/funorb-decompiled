/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends qd {
    int[] field_J;
    private int[] field_n;
    private int field_m;
    private int[] field_q;
    private int field_s;
    private int[] field_F;
    private int[] field_E;
    private dl[][] field_r;
    private int[] field_w;
    private int[] field_G;
    private int[] field_t;
    private int[] field_p;
    int[] field_y;
    private pc field_P;
    static fg field_O;
    private int[] field_L;
    private int[] field_D;
    private ha field_A;
    int[] field_N;
    private dl[][] field_v;
    private int[] field_u;
    private int[] field_R;
    private int[] field_o;
    private pg field_I;
    private boolean field_B;
    private long field_H;
    private int field_K;
    private long field_x;
    private int field_M;
    private ej field_C;
    private boolean field_Q;
    private int field_z;

    final static void a(String param0, String param1, byte param2) {
        if (param2 < 11) {
            return;
        }
        fl.a(-125, false, param0, param1);
    }

    final synchronized void a(int param0, ej param1, boolean param2) {
        if (param0 != -8126) {
            ((kb) this).field_I = null;
        }
        this.a(true, param2, param1, 28050);
    }

    final void a(int param0, boolean param1, dl param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          if (param0 == 256) {
            break L0;
          } else {
            var7 = null;
            kb.a(-76, -111, (uj) null, true, (java.awt.Component) null, (kb) null);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param2.field_k.field_k.length;
            if (!param1) {
              break L2;
            } else {
              if (param2.field_k.field_m) {
                var6 = -param2.field_k.field_n + (var4 + var4);
                var4 = var4 << 8;
                var5 = (int)((long)var6 * (long)((kb) this).field_y[param2.field_G] >> -1225065530);
                if (var5 >= var4) {
                  param2.field_K.b(true);
                  var5 = -1 + var4 - (-var4 - -var5);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          var5 = (int)((long)((kb) this).field_y[param2.field_G] * (long)var4 >> -1148094074);
          break L1;
        }
        param2.field_K.d(var5);
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param2, (byte) 120);
        int var4 = -4 / ((-76 - param1) / 43);
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 != -81) {
            ((kb) this).field_L = null;
        }
        ((kb) this).field_n[param2] = param0;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1) {
            this.a(true, -1);
        } else {
            this.a(-1, (byte) 105);
        }
        this.a((byte) -97, -1);
        for (var3 = 0; 16 > var3; var3++) {
            ((kb) this).field_t[var3] = ((kb) this).field_q[var3];
        }
        if (param0 != -1863960953) {
            qd discarded$0 = ((kb) this).b();
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((kb) this).field_F[var5] = jh.a(-128, ((kb) this).field_q[var5]);
            var5++;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) te.field_b);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) te.field_b);
        if (param0 != -25) {
            field_O = null;
        }
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) te.field_b);
        jc.field_h = 0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        if (0 <= param2) {
            ((kb) this).field_w[param2] = param1;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((kb) this).field_w[var4] = param1;
            }
        }
        if (param0 != -3262) {
            Object var6 = null;
            ((kb) this).a(-32, true, (dl) null);
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        ((kb) this).field_P.e();
        ((kb) this).field_C = null;
        this.a(param0 + -1863961209, param1);
        if (param0 != 256) {
            ((kb) this).field_q = null;
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        var3 = 240 & param0;
        if (-129 != (var3 ^ -1)) {
          L0: {
            if (var3 != 144) {
              if (-161 != (var3 ^ -1)) {
                if (176 == var3) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = (32636 & param0) >> -1525366648;
                    var6 = 127 & param0 >> 1066553360;
                    if (-1 != (var5 ^ -1)) {
                      break L1;
                    } else {
                      ((kb) this).field_F[var4] = jh.a(-2080769, ((kb) this).field_F[var4]) - -(var6 << 1636155374);
                      break L1;
                    }
                  }
                  L2: {
                    if (32 == var5) {
                      ((kb) this).field_F[var4] = (var6 << 182838695) + jh.a(-16257, ((kb) this).field_F[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var5) {
                      ((kb) this).field_o[var4] = jh.a(-16257, ((kb) this).field_o[var4]) + (var6 << 1377359079);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) == -34) {
                      ((kb) this).field_o[var4] = jh.a(-128, ((kb) this).field_o[var4]) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (5 != var5) {
                      break L5;
                    } else {
                      ((kb) this).field_L[var4] = (var6 << -390577145) + jh.a(-16257, ((kb) this).field_L[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 == var5) {
                      ((kb) this).field_L[var4] = jh.a(-128, ((kb) this).field_L[var4]) + var6;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) != -8) {
                      break L7;
                    } else {
                      ((kb) this).field_E[var4] = jh.a(((kb) this).field_E[var4], -16257) - -(var6 << -49526905);
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) != -40) {
                      break L8;
                    } else {
                      ((kb) this).field_E[var4] = jh.a(((kb) this).field_E[var4], -128) - -var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 != 10) {
                      break L9;
                    } else {
                      ((kb) this).field_R[var4] = (var6 << 243727655) + jh.a(((kb) this).field_R[var4], -16257);
                      break L9;
                    }
                  }
                  L10: {
                    if (42 != var5) {
                      break L10;
                    } else {
                      ((kb) this).field_R[var4] = jh.a(((kb) this).field_R[var4], -128) - -var6;
                      break L10;
                    }
                  }
                  L11: {
                    if (-12 != (var5 ^ -1)) {
                      break L11;
                    } else {
                      ((kb) this).field_u[var4] = jh.a(-16257, ((kb) this).field_u[var4]) + (var6 << 1180165351);
                      break L11;
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) == -44) {
                      ((kb) this).field_u[var4] = jh.a(-128, ((kb) this).field_u[var4]) - -var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if ((var6 ^ -1) <= -65) {
                        ((kb) this).field_J[var4] = p.a(((kb) this).field_J[var4], 1);
                        break L13;
                      } else {
                        ((kb) this).field_J[var4] = jh.a(((kb) this).field_J[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (var6 < 64) {
                        this.c(var4, -101);
                        ((kb) this).field_J[var4] = jh.a(((kb) this).field_J[var4], -3);
                        break L14;
                      } else {
                        ((kb) this).field_J[var4] = p.a(((kb) this).field_J[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-100 != (var5 ^ -1)) {
                      break L15;
                    } else {
                      ((kb) this).field_D[var4] = (var6 << 801473639) + jh.a(((kb) this).field_D[var4], 127);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 != var5) {
                      break L16;
                    } else {
                      ((kb) this).field_D[var4] = var6 + jh.a(((kb) this).field_D[var4], 16256);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 101) {
                      break L17;
                    } else {
                      ((kb) this).field_D[var4] = (var6 << -1741944153) + (jh.a(((kb) this).field_D[var4], 127) + 16384);
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 == (var5 ^ -1)) {
                      ((kb) this).field_D[var4] = var6 + (jh.a(((kb) this).field_D[var4], 16256) + 16384);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-121 == (var5 ^ -1)) {
                      this.a(true, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((var5 ^ -1) != -122) {
                      break L20;
                    } else {
                      this.a((byte) -97, var4);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.a(var4, (byte) 125);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if ((var5 ^ -1) == -7) {
                      var7 = ((kb) this).field_D[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((kb) this).field_p[var4] = jh.a(((kb) this).field_p[var4], -16257) + (var6 << 147126759);
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
                      var7 = ((kb) this).field_D[var4];
                      if (16384 != var7) {
                        break L23;
                      } else {
                        ((kb) this).field_p[var4] = var6 + jh.a(-128, ((kb) this).field_p[var4]);
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (16 != var5) {
                      break L24;
                    } else {
                      ((kb) this).field_y[var4] = jh.a(((kb) this).field_y[var4], -16257) - -(var6 << -954638969);
                      break L24;
                    }
                  }
                  L25: {
                    if ((var5 ^ -1) == -49) {
                      ((kb) this).field_y[var4] = jh.a(-128, ((kb) this).field_y[var4]) + var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (64 <= var6) {
                        ((kb) this).field_J[var4] = p.a(((kb) this).field_J[var4], 4);
                        break L26;
                      } else {
                        this.a(var4, -870);
                        ((kb) this).field_J[var4] = jh.a(((kb) this).field_J[var4], -5);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 != 17) {
                      break L27;
                    } else {
                      this.c(11226, var4, (-16257 & ((kb) this).field_G[var4]) - -(var6 << -1863960953));
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.c(11226, var4, (-128 & ((kb) this).field_G[var4]) - -var6);
                    return;
                  }
                } else {
                  if (192 == var3) {
                    var4 = param0 & 15;
                    var5 = (32658 & param0) >> -2072686616;
                    this.a(((kb) this).field_F[var4] - -var5, (byte) 122, var4);
                    return;
                  } else {
                    L28: {
                      if (param1 >= 16) {
                        break L28;
                      } else {
                        ((kb) this).a(-60, -64, -102);
                        break L28;
                      }
                    }
                    if (208 != var3) {
                      if ((var3 ^ -1) != -225) {
                        var3 = param0 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.a(-1863960953, true);
                          return;
                        }
                      } else {
                        var4 = param0 & 15;
                        var5 = ((param0 & 32732) >> 514510920) + (16256 & param0 >> -543711031);
                        this.b(var5, (byte) -81, var4);
                        return;
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (32585 & param0) >> -728391384;
                      this.c(var4, (byte) -15, var5);
                      return;
                    }
                  }
                }
              } else {
                var4 = param0 & 15;
                var5 = (param0 & 32695) >> 318753384;
                var6 = 127 & param0 >> -1203290992;
                this.a(var4, (byte) -81, var6, var5);
                return;
              }
            } else {
              var4 = 15 & param0;
              var5 = param0 >> -1859793784 & 127;
              var6 = (8346425 & param0) >> -109769360;
              if (0 >= var6) {
                this.a(var4, 64, var5, 9208);
                return;
              } else {
                this.b(var6, -10825, var4, var5);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param0;
          var5 = (param0 & 32514) >> -1627624728;
          var6 = 127 & param0 >> -723358992;
          this.a(var4, var6, var5, 9208);
          return;
        }
    }

    final synchronized void b(byte param0, int param1) {
        int var3 = 103 / ((param0 - -9) / 38);
        ((kb) this).field_s = param1;
    }

    final synchronized int a() {
        return 0;
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 >= 0) {
          L0: {
            ((kb) this).field_E[param1] = 12800;
            ((kb) this).field_R[param1] = 8192;
            ((kb) this).field_u[param1] = 16383;
            ((kb) this).field_n[param1] = 8192;
            ((kb) this).field_o[param1] = 0;
            if (param0 == -97) {
              break L0;
            } else {
              this.a(-16, (byte) -76);
              break L0;
            }
          }
          ((kb) this).field_L[param1] = 8192;
          this.c(param1, param0 ^ 15);
          this.a(param1, -870);
          ((kb) this).field_J[param1] = 0;
          ((kb) this).field_D[param1] = 32767;
          ((kb) this).field_p[param1] = 256;
          ((kb) this).field_y[param1] = 0;
          this.c(param0 + 11323, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (-17 >= (param1 ^ -1)) {
              return;
            } else {
              this.a((byte) -97, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        dl var3 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (0 != (4 & ((kb) this).field_J[param0])) {
            var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) -22);
            while (var3 != null) {
                if (!(var3.field_G != param0)) {
                    var3.field_x = 0;
                }
                var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
            }
        }
        if (param1 != -870) {
            Object var5 = null;
            this.a(true, false, (ej) null, 51);
        }
    }

    final static void a(int param0, int param1, uj param2, boolean param3, java.awt.Component param4, kb param5) {
        if (param1 != 16239) {
            Object var7 = null;
            kb.a((byte) 92, (java.awt.Component) null);
        }
        bg.a(param5, param0, 1024, param0, param4, param2, -118, param3);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          if (!((kb) this).field_P.d()) {
            break L0;
          } else {
            var2 = ((kb) this).field_s * ((kb) this).field_P.field_h / kh.field_p;
            L1: while (true) {
              var3 = ((kb) this).field_H - -((long)var2 * (long)param0);
              if (((kb) this).field_x - var3 >= 0L) {
                ((kb) this).field_H = var3;
                break L0;
              } else {
                var5 = (int)((-1L + (((kb) this).field_x - ((kb) this).field_H - -(long)var2)) / (long)var2);
                ((kb) this).field_H = ((kb) this).field_H + (long)var5 * (long)var2;
                ((kb) this).field_I.a(var5);
                param0 = param0 - var5;
                this.c(true);
                if (!((kb) this).field_P.d()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((kb) this).field_I.a(param0);
    }

    private final int a(int param0, dl param1) {
        int var4 = -11 / ((-58 - param0) / 47);
        int var3 = ((kb) this).field_R[param1.field_G];
        if (8192 > var3) {
            return param1.field_y * var3 + 32 >> 1056996550;
        }
        return 16384 + -((16384 + -var3) * (128 - param1.field_y) + 32 >> -1893961114);
    }

    private final synchronized void a(boolean param0, boolean param1, ej param2, int param3) {
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        this.b(256, param0);
        ((kb) this).field_P.a(param2.field_i);
        ((kb) this).field_H = 0L;
        ((kb) this).field_B = param1 ? true : false;
        if (param3 != 28050) {
            this.a(true, 42);
        }
        int var5 = ((kb) this).field_P.f();
        for (var6 = 0; var6 < var5; var6++) {
            ((kb) this).field_P.e(var6);
            ((kb) this).field_P.c(var6);
            ((kb) this).field_P.f(var6);
        }
        ((kb) this).field_M = ((kb) this).field_P.c();
        ((kb) this).field_K = ((kb) this).field_P.field_f[((kb) this).field_M];
        ((kb) this).field_x = ((kb) this).field_P.b(((kb) this).field_K);
    }

    final synchronized void c(int param0, boolean param1) {
        if (param1) {
            return;
        }
        ((kb) this).field_m = param0;
    }

    private final void c(int param0, byte param1, int param2) {
        if (param1 != -15) {
            ((kb) this).field_x = -108L;
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((kb) this).field_G[param1] = param2;
        if (param0 != 11226) {
            ((kb) this).a(76, 50, -70);
        }
        ((kb) this).field_N[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
    }

    final synchronized boolean d(int param0) {
        if (param0 != 0) {
            ((kb) this).field_n = null;
        }
        return ((kb) this).field_P.d();
    }

    private final void a(boolean param0, int param1) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        dl var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) -83);
        if (!param0) {
            Object var5 = null;
            ((kb) this).a(-128, (ej) null, true);
        }
        while (var3 != null) {
            if (-1 >= (param1 ^ -1)) {
                // if_icmpne L176
            }
            if (!(var3.field_K == null)) {
                var3.field_K.g(kh.field_p / 100);
                if (!(!var3.field_K.l())) {
                    ((kb) this).field_I.field_u.a((qd) (Object) var3.field_K);
                }
                var3.a(1047574608);
            }
            if (!(var3.field_F >= 0)) {
                ((kb) this).field_r[var3.field_G][var3.field_p] = null;
            }
            var3.a(true);
            var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          var2 = ((kb) this).field_M;
          var3 = ((kb) this).field_K;
          var4 = ((kb) this).field_x;
          if (((kb) this).field_C == null) {
            break L0;
          } else {
            if (var3 != ((kb) this).field_z) {
              break L0;
            } else {
              this.a(((kb) this).field_Q, ((kb) this).field_B, ((kb) this).field_C, 28050);
              this.c(true);
              return;
            }
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            ((kb) this).field_J = null;
            break L1;
          }
        }
        L2: while (true) {
          if (((kb) this).field_K != var3) {
            L3: {
              ((kb) this).field_M = var2;
              ((kb) this).field_x = var4;
              ((kb) this).field_K = var3;
              if (null == ((kb) this).field_C) {
                break L3;
              } else {
                if (((kb) this).field_z < var3) {
                  ((kb) this).field_K = ((kb) this).field_z;
                  ((kb) this).field_M = -1;
                  ((kb) this).field_x = ((kb) this).field_P.b(((kb) this).field_K);
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
                if (var3 != ((kb) this).field_P.field_f[var2]) {
                  break L5;
                } else {
                  ((kb) this).field_P.e(var2);
                  var6 = ((kb) this).field_P.a(var2);
                  if (var6 == 1) {
                    ((kb) this).field_P.g();
                    ((kb) this).field_P.f(var2);
                    if (!((kb) this).field_P.a()) {
                      break L5;
                    } else {
                      if (((kb) this).field_C != null) {
                        ((kb) this).a(-8126, ((kb) this).field_C, ((kb) this).field_B);
                        this.c(true);
                        return;
                      } else {
                        L6: {
                          if (!((kb) this).field_B) {
                            break L6;
                          } else {
                            if (-1 != (var3 ^ -1)) {
                              ((kb) this).field_P.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(-1863960953, true);
                        ((kb) this).field_P.e();
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if ((var6 & 128) == 0) {
                        break L7;
                      } else {
                        this.b(var6, 109);
                        break L7;
                      }
                    }
                    ((kb) this).field_P.c(var2);
                    ((kb) this).field_P.f(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((kb) this).field_P.c();
              var3 = ((kb) this).field_P.field_f[var2];
              var4 = ((kb) this).field_P.b(var3);
              continue L2;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        if (((kb) this).field_t[param2] != param0) {
            ((kb) this).field_t[param2] = param0;
            for (var4 = 0; 128 > var4; var4++) {
                ((kb) this).field_v[param2][var4] = null;
            }
        }
        if (param1 != 122) {
            Object var6 = null;
            ((kb) this).b((int[]) null, -5, 97);
        }
    }

    private final void c(int param0, int param1) {
        dl var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param1 < -95) {
            break L0;
          } else {
            var5 = null;
            ((kb) this).b((int[]) null, -23, -98);
            break L0;
          }
        }
        L1: {
          if ((2 & ((kb) this).field_J[param0]) != 0) {
            var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) 113);
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (param0 != var3.field_G) {
                    break L3;
                  } else {
                    if (((kb) this).field_r[param0][var3.field_p] == null) {
                      if (var3.field_F >= 0) {
                        break L3;
                      } else {
                        var3.field_F = 0;
                        break L3;
                      }
                    } else {
                      var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
                      continue L2;
                    }
                  }
                }
                var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
    }

    final synchronized void b(byte param0) {
        this.b(256, true);
        if (param0 != 31) {
            Object var3 = null;
            int discarded$0 = this.a((dl) null, false);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (((kb) this).field_P.d()) {
            var4 = ((kb) this).field_P.field_h * ((kb) this).field_s / kh.field_p;
            L1: while (true) {
              L2: {
                var5 = ((kb) this).field_H + (long)param2 * (long)var4;
                if (0L > -var5 + ((kb) this).field_x) {
                  var7 = (int)((-1L + (long)var4 + (-((kb) this).field_H + ((kb) this).field_x)) / (long)var4);
                  ((kb) this).field_H = ((kb) this).field_H + (long)var7 * (long)var4;
                  ((kb) this).field_I.b(param0, param1, var7);
                  this.c(true);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (!((kb) this).field_P.d()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((kb) this).field_H = var5;
                  break L2;
                }
              }
              ((kb) this).field_I.b(param0, param1, param2);
              break L0;
            }
          } else {
            ((kb) this).field_I.b(param0, param1, param2);
            break L0;
          }
        }
    }

    final synchronized boolean a(boolean param0, u param1, ej param2, lj param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        s var8 = null;
        int var9 = 0;
        int var11 = 0;
        fb var12 = null;
        fb var13 = null;
        int stackIn_11_0 = 0;
        lj stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        lj stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        lj stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackOut_10_0 = 0;
        lj stackOut_10_1 = null;
        int stackOut_12_0 = 0;
        lj stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        lj stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          param2.a();
          if (!param0) {
            break L0;
          } else {
            ((kb) this).field_I = null;
            break L0;
          }
        }
        L1: {
          var6 = 1;
          var7 = null;
          if (-1 > (param4 ^ -1)) {
            var7_array = new int[]{param4};
            break L1;
          } else {
            break L1;
          }
        }
        var8 = (s) (Object) param2.field_j.a((byte) -73);
        L2: while (true) {
          if (var8 == null) {
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                param2.b();
                break L3;
              }
            }
            return var6 != 0;
          } else {
            L4: {
              var9 = (int)var8.field_d;
              var12 = (fb) (Object) ((kb) this).field_A.a((byte) 92, (long)var9);
              if (var12 == null) {
                L5: {
                  stackOut_10_0 = var9;
                  stackOut_10_1 = (lj) param3;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param0) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = (lj) (Object) stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L5;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = (lj) (Object) stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L5;
                  }
                }
                var13 = dh.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0);
                if (var13 == null) {
                  var6 = 0;
                  break L4;
                } else {
                  ((kb) this).field_A.a(-104, (da) (Object) var13, (long)var9);
                  if (var13.a(param1, var7_array, (byte) 94, var8.field_o)) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
              } else {
                if (var12.a(param1, var7_array, (byte) 94, var8.field_o)) {
                  break L4;
                } else {
                  var6 = 0;
                  var8 = (s) (Object) param2.field_j.a(-27377);
                  continue L2;
                }
              }
            }
            var8 = (s) (Object) param2.field_j.a(-27377);
            continue L2;
          }
        }
    }

    private final int a(byte param0, dl param1) {
        int var3 = 0;
        ab var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = param1.field_u + (param1.field_m * param1.field_o >> 28075756);
        var3 = var3 + (((kb) this).field_p[param1.field_G] * (-8192 + ((kb) this).field_n[param1.field_G]) >> -592538452);
        var4 = param1.field_I;
        if (param0 == 35) {
          L0: {
            if (var4.field_j <= 0) {
              break L0;
            } else {
              L1: {
                if (0 < var4.field_a) {
                  break L1;
                } else {
                  if ((((kb) this).field_o[param1.field_G] ^ -1) < -1) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                var5 = var4.field_a << 1636363810;
                var6 = var4.field_l << 1274253089;
                if (param1.field_A >= var6) {
                  break L2;
                } else {
                  var5 = var5 * param1.field_A / var6;
                  break L2;
                }
              }
              var5 = var5 + (((kb) this).field_o[param1.field_G] >> -1297786009);
              var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_w));
              var3 = var3 + (int)(var7 * (double)var5);
              break L0;
            }
          }
          L3: {
            var5 = (int)(0.5 + (double)(param1.field_k.field_j * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)kh.field_p);
            if (var5 < 1) {
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
          return -46;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 10) {
            ((kb) this).field_p = null;
        }
        ((kb) this).field_q[param1] = param0;
        ((kb) this).field_F[param1] = jh.a(param0, -128);
        this.a(param0, (byte) 122, param1);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 109 % ((param1 - -2) / 52);
    }

    final boolean a(int param0, byte param1, int[] param2, int param3, dl param4) {
        int var6 = 0;
        int var7 = 0;
        ab var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        L0: {
          var12 = TorChallenge.field_F ? 1 : 0;
          param4.field_z = kh.field_p / 100;
          if (param4.field_F < 0) {
            break L0;
          } else {
            L1: {
              if (null == param4.field_K) {
                break L1;
              } else {
                if (!param4.field_K.j()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param4.a(1047574608);
              param4.a(true);
              if ((param4.field_i ^ -1) >= -1) {
                break L2;
              } else {
                if (param4 != ((kb) this).field_v[param4.field_G][param4.field_i]) {
                  break L2;
                } else {
                  ((kb) this).field_v[param4.field_G][param4.field_i] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param4.field_m;
          var7 = 81 / ((-32 - param1) / 38);
          if (0 >= var6) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((kb) this).field_L[param4.field_G]));
              if (-1 < (var6 ^ -1)) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param4.field_m = var6;
            break L3;
          }
        }
        L5: {
          param4.field_K.c(this.a((byte) 35, param4));
          var8 = param4.field_I;
          param4.field_A = param4.field_A + 1;
          param4.field_w = param4.field_w + var8.field_j;
          var9 = 0;
          var10 = (double)((param4.field_m * param4.field_o >> -146703540) + (-60 + param4.field_p << 197240264)) * 0.000005086263020833333;
          if (var8.field_i < -1) {
            L6: {
              if (-1 >= var8.field_h) {
                param4.field_D = param4.field_D + 128;
                break L6;
              } else {
                param4.field_D = param4.field_D + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_h) * 128.0);
                break L6;
              }
            }
            if (-819201 >= (var8.field_i * param4.field_D ^ -1)) {
              var9 = 1;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L7: {
          if (var8.field_k != null) {
            L8: {
              if (0 < var8.field_c) {
                param4.field_v = param4.field_v + (int)(128.0 * Math.pow(2.0, (double)var8.field_c * var10) + 0.5);
                break L8;
              } else {
                param4.field_v = param4.field_v + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (-2 + var8.field_k.length <= param4.field_J) {
                  break L10;
                } else {
                  if ((255 & var8.field_k[param4.field_J - -2]) << 115353512 >= param4.field_v) {
                    break L10;
                  } else {
                    param4.field_J = param4.field_J + 2;
                    continue L9;
                  }
                }
              }
              if (var8.field_k.length + -2 != param4.field_J) {
                break L7;
              } else {
                if (var8.field_k[param4.field_J - -1] == 0) {
                  var9 = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          } else {
            break L7;
          }
        }
        L11: {
          if (param4.field_F < 0) {
            break L11;
          } else {
            if (var8.field_b == null) {
              break L11;
            } else {
              if (0 != (1 & ((kb) this).field_J[param4.field_G])) {
                break L11;
              } else {
                L12: {
                  if ((param4.field_i ^ -1) > -1) {
                    break L12;
                  } else {
                    if (param4 != ((kb) this).field_v[param4.field_G][param4.field_i]) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (var8.field_f > 0) {
                    param4.field_F = param4.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_f * var10));
                    break L13;
                  } else {
                    param4.field_F = param4.field_F + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param4.field_B >= -2 + var8.field_b.length) {
                      break L15;
                    } else {
                      if (param4.field_F <= (65280 & var8.field_b[param4.field_B + 2] << 421575688)) {
                        break L15;
                      } else {
                        param4.field_B = param4.field_B + 2;
                        continue L14;
                      }
                    }
                  }
                  if (var8.field_b.length - 2 != param4.field_B) {
                    break L11;
                  } else {
                    var9 = 1;
                    break L11;
                  }
                }
              }
            }
          }
        }
        if (var9 != 0) {
          L16: {
            param4.field_K.g(param4.field_z);
            if (param2 != null) {
              param4.field_K.b(param2, param0, param3);
              break L16;
            } else {
              param4.field_K.a(param3);
              break L16;
            }
          }
          L17: {
            if (param4.field_K.l()) {
              ((kb) this).field_I.field_u.a((qd) (Object) param4.field_K);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            param4.a(1047574608);
            if (0 > param4.field_F) {
              break L18;
            } else {
              param4.a(true);
              if ((param4.field_i ^ -1) >= -1) {
                break L18;
              } else {
                if (((kb) this).field_v[param4.field_G][param4.field_i] != param4) {
                  break L18;
                } else {
                  ((kb) this).field_v[param4.field_G][param4.field_i] = null;
                  break L18;
                }
              }
            }
          }
          return true;
        } else {
          param4.field_K.a(param4.field_z, this.a(param4, true), this.a(80, param4));
          return false;
        }
    }

    private final int a(dl param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (0 == ((kb) this).field_w[param0.field_G]) {
            return 0;
        }
        if (!param1) {
            Object var9 = null;
            kb.a(-89, -61, (uj) null, false, (java.awt.Component) null, (kb) null);
        }
        ab var10 = param0.field_I;
        ab var11 = var10;
        int var4 = 4096 + ((kb) this).field_E[param0.field_G] * ((kb) this).field_u[param0.field_G] >> 854760653;
        var4 = 16384 + var4 * var4 >> -445070417;
        var4 = 16384 + var4 * param0.field_t >> -1321405137;
        var4 = 128 + var4 * ((kb) this).field_m >> -460287352;
        var4 = ((kb) this).field_w[param0.field_G] * var4 - -128 >> 1386001288;
        if (var11.field_i > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_D * 0.00001953125 * (double)var11.field_i));
        }
        if (!(null == var11.field_k)) {
            var5 = param0.field_v;
            var6 = var11.field_k[param0.field_J + 1];
            if (!(param0.field_J >= var11.field_k.length + -2)) {
                var7 = (var10.field_k[param0.field_J] & 255) << -583065688;
                var8 = 65280 & var11.field_k[2 + param0.field_J] << -1698604632;
                var6 = var6 + (var5 - var7) * (var11.field_k[param0.field_J - -3] - var6) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> 1277547942;
        }
        if (0 < param0.field_F) {
            if (var11.field_b != null) {
                var5 = param0.field_F;
                var6 = var11.field_b[param0.field_B - -1];
                if (-2 + var11.field_b.length > param0.field_B) {
                    var7 = var10.field_b[param0.field_B] << -385656536 & 65280;
                    var8 = var11.field_b[2 + param0.field_B] << -501238872 & 65280;
                    var6 = var6 + (var11.field_b[param0.field_B - -3] - var6) * (-var7 + var5) / (-var7 + var8);
                }
                var4 = var4 * var6 + 32 >> 1944907110;
            }
        }
        return var4;
    }

    private final void a(int param0, byte param1) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 <= 84) {
            return;
        }
        dl var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) 120);
        while (var3 != null) {
            if (0 <= param0) {
                // if_icmpne L90
            }
            if (var3.field_F < 0) {
                ((kb) this).field_r[var3.field_G][var3.field_p] = null;
                var3.field_F = 0;
            }
            var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
        }
    }

    final synchronized qd b() {
        return null;
    }

    final synchronized qd c() {
        return (qd) (Object) ((kb) this).field_I;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        dl var5 = null;
        fe var6 = null;
        int var6_int = 0;
        dl var7 = null;
        dl var8 = null;
        int var9 = 0;
        Object var10 = null;
        fb var11 = null;
        fb var12 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          this.a(param2, 64, param3, 9208);
          if (0 == (((kb) this).field_J[param2] & 2)) {
            break L0;
          } else {
            var5 = (dl) (Object) ((kb) this).field_I.field_o.b((byte) 65);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param2 != var5.field_G) {
                    break L2;
                  } else {
                    if (-1 >= (var5.field_F ^ -1)) {
                      break L2;
                    } else {
                      ((kb) this).field_r[param2][var5.field_p] = null;
                      ((kb) this).field_r[param2][param3] = var5;
                      var6_int = var5.field_u - -(var5.field_m * var5.field_o >> -1568913652);
                      var5.field_u = var5.field_u + (-var5.field_p + param3 << 1421681960);
                      var5.field_p = param3;
                      var5.field_m = 4096;
                      var5.field_o = var6_int - var5.field_u;
                      return;
                    }
                  }
                }
                var5 = (dl) (Object) ((kb) this).field_I.field_o.e((byte) -112);
                continue L1;
              }
            }
          }
        }
        var11 = (fb) (Object) ((kb) this).field_A.a((byte) 100, (long)((kb) this).field_t[param2]);
        var12 = var11;
        if (var12 != null) {
          var6 = var11.field_k[param3];
          if (var6 != null) {
            L3: {
              var7 = new dl();
              var7.field_G = param2;
              if (param1 == -10825) {
                break L3;
              } else {
                var10 = null;
                int discarded$1 = this.a((byte) 114, (dl) null);
                break L3;
              }
            }
            L4: {
              var7.field_k = var6;
              var7.field_q = var11;
              var7.field_I = var11.field_o[param3];
              var7.field_i = var11.field_q[param3];
              var7.field_p = param3;
              var7.field_t = param0 * param0 * (var11.field_p * var11.field_l[param3]) - -1024 >> 1079284747;
              var7.field_y = var11.field_n[param3] & 255;
              var7.field_u = (param3 << 2142791400) - (var11.field_j[param3] & 32767);
              var7.field_B = 0;
              var7.field_v = 0;
              var7.field_J = 0;
              var7.field_F = -1;
              var7.field_D = 0;
              if (-1 != (((kb) this).field_y[param2] ^ -1)) {
                L5: {
                  var7.field_K = nc.b(var6, this.a((byte) 35, var7), 0, this.a(96, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = 256;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (-1 >= (var12.field_j[param3] ^ -1)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L5;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L5;
                  }
                }
                ((kb) this).a(stackIn_18_1, stackIn_18_2 != 0, var7);
                break L4;
              } else {
                var7.field_K = nc.b(var6, this.a((byte) 35, var7), this.a(var7, true), this.a(param1 + 10713, var7));
                break L4;
              }
            }
            L6: {
              if (var12.field_j[param3] < 0) {
                var7.field_K.e(-1);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 >= (var7.field_i ^ -1)) {
                L8: {
                  var8 = ((kb) this).field_v[param2][var7.field_i];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if ((var8.field_F ^ -1) <= -1) {
                      break L8;
                    } else {
                      ((kb) this).field_r[param2][var8.field_p] = null;
                      var8.field_F = 0;
                      break L8;
                    }
                  }
                }
                ((kb) this).field_v[param2][var7.field_i] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            ((kb) this).field_I.field_o.a((da) (Object) var7, -53);
            ((kb) this).field_r[param2][param3] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
            ((kb) this).field_r = null;
        }
        fb var4 = (fb) (Object) ((kb) this).field_A.a((byte) -73);
        while (var4 != null) {
            var4.b((byte) -127);
            var4 = (fb) (Object) ((kb) this).field_A.a(-27377);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        dl var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (param3 != 9208) {
            ((kb) this).field_x = 71L;
        }
        dl var8 = ((kb) this).field_r[param0][param2];
        if (!(var8 != null)) {
            return;
        }
        ((kb) this).field_r[param0][param2] = null;
        if (0 == (((kb) this).field_J[param0] & 2)) {
            var8.field_F = 0;
        } else {
            var6 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) 110);
            while (var6 != null) {
                if (var8.field_G == var6.field_G) {
                    if (var6.field_F < 0) {
                        if (var8 != var6) {
                            var8.field_F = 0;
                            break;
                        }
                    }
                }
                var6 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
            }
        }
    }

    public static void c(int param0) {
        if (param0 != 128) {
            Object var2 = null;
            kb.a(116, 24, (uj) null, true, (java.awt.Component) null, (kb) null);
        }
        field_O = null;
    }

    final boolean a(dl param0, byte param1) {
        if (!(null != param0.field_K)) {
            if (0 > param0.field_F) {
                return true;
            }
            param0.a(true);
            if ((param0.field_i ^ -1) < -1) {
                if (param0 == ((kb) this).field_v[param0.field_G][param0.field_i]) {
                    ((kb) this).field_v[param0.field_G][param0.field_i] = null;
                }
            }
            return true;
        }
        if (param1 != 22) {
            ((kb) this).field_z = -13;
        }
        return false;
    }

    public kb() {
        ((kb) this).field_J = new int[16];
        ((kb) this).field_F = new int[16];
        ((kb) this).field_q = new int[16];
        ((kb) this).field_E = new int[16];
        ((kb) this).field_r = new dl[16][128];
        ((kb) this).field_y = new int[16];
        ((kb) this).field_t = new int[16];
        ((kb) this).field_L = new int[16];
        ((kb) this).field_s = 1000000;
        ((kb) this).field_m = 256;
        ((kb) this).field_p = new int[16];
        ((kb) this).field_G = new int[16];
        ((kb) this).field_D = new int[16];
        ((kb) this).field_n = new int[16];
        ((kb) this).field_N = new int[16];
        ((kb) this).field_w = new int[16];
        ((kb) this).field_v = new dl[16][128];
        ((kb) this).field_u = new int[16];
        ((kb) this).field_R = new int[16];
        ((kb) this).field_o = new int[16];
        ((kb) this).field_P = new pc();
        ((kb) this).field_I = new pg((kb) this);
        ((kb) this).field_A = new ha(128);
        ((kb) this).a(-3262, 256, -1);
        this.a(-1863960953, true);
    }

    static {
    }
}
