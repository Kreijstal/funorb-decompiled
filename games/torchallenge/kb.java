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
        try {
            fl.a(-125, false, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kb.LA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 44 + ')');
        }
    }

    final synchronized void a(int param0, ej param1, boolean param2) {
        try {
            if (param0 != -8126) {
                ((kb) this).field_I = null;
            }
            this.a(true, param2, param1, 28050);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kb.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, dl param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                var7 = null;
                kb.a(-76, -111, (uj) null, true, (java.awt.Component) null, (kb) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param2.field_k.field_k.length;
                if (!param1) {
                  break L3;
                } else {
                  if (param2.field_k.field_m) {
                    var6 = -param2.field_k.field_n + (var4_int + var4_int);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)var6 * (long)((kb) this).field_y[param2.field_G] >> 6);
                    if (var5 >= var4_int) {
                      param2.field_K.b(true);
                      var5 = -1 + var4_int - (-var4_int - -var5);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)((kb) this).field_y[param2.field_G] * (long)var4_int >> 6);
              break L2;
            }
            param2.field_K.d(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("kb.O(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param2, (byte) 120);
        int var4 = -4 / ((-76 - param1) / 43);
    }

    private final void b(int param0, byte param1, int param2) {
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
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((kb) this).field_F[var5] = jh.a(-128, ((kb) this).field_q[var5]);
            var5++;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) te.field_b);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) te.field_b);
            if (param0 != -25) {
                field_O = null;
            }
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) te.field_b);
            jc.field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kb.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        this.a(-1863960953, param1);
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
        if (var3 != 128) {
          L0: {
            if (var3 != 144) {
              if (var3 != 160) {
                if (176 == var3) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = (32636 & param0) >> 8;
                    var6 = 127 & param0 >> 16;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((kb) this).field_F[var4] = jh.a(-2080769, ((kb) this).field_F[var4]) - -(var6 << 14);
                      break L1;
                    }
                  }
                  L2: {
                    if (32 == var5) {
                      ((kb) this).field_F[var4] = (var6 << 7) + jh.a(-16257, ((kb) this).field_F[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var5) {
                      ((kb) this).field_o[var4] = jh.a(-16257, ((kb) this).field_o[var4]) + (var6 << 7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == 33) {
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
                      ((kb) this).field_L[var4] = (var6 << 7) + jh.a(-16257, ((kb) this).field_L[var4]);
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
                    if (var5 != 7) {
                      break L7;
                    } else {
                      ((kb) this).field_E[var4] = jh.a(((kb) this).field_E[var4], -16257) - -(var6 << 7);
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
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
                      ((kb) this).field_R[var4] = (var6 << 7) + jh.a(((kb) this).field_R[var4], -16257);
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
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((kb) this).field_u[var4] = jh.a(-16257, ((kb) this).field_u[var4]) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
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
                      if (var6 >= 64) {
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
                    if (var5 != 99) {
                      break L15;
                    } else {
                      ((kb) this).field_D[var4] = (var6 << 7) + jh.a(((kb) this).field_D[var4], 127);
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
                      ((kb) this).field_D[var4] = (var6 << 7) + (jh.a(((kb) this).field_D[var4], 127) + 16384);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 100) {
                      ((kb) this).field_D[var4] = var6 + (jh.a(((kb) this).field_D[var4], 16256) + 16384);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.a(true, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
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
                    if (var5 == 6) {
                      var7 = ((kb) this).field_D[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((kb) this).field_p[var4] = jh.a(((kb) this).field_p[var4], -16257) + (var6 << 7);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 != 38) {
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
                      ((kb) this).field_y[var4] = jh.a(((kb) this).field_y[var4], -16257) - -(var6 << 7);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
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
                      this.c(11226, var4, (-16257 & ((kb) this).field_G[var4]) - -(var6 << 7));
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
                    var5 = (32658 & param0) >> 8;
                    this.a(((kb) this).field_F[var4] - -var5, (byte) 122, var4);
                    return;
                  } else {
                    if (208 != var3) {
                      if (var3 != 224) {
                        var3 = param0 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(-1863960953, true);
                          return;
                        }
                      } else {
                        var4 = param0 & 15;
                        var5 = ((param0 & 32732) >> 8) + (16256 & param0 >> 9);
                        this.b(var5, (byte) -81, var4);
                        return;
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (32585 & param0) >> 8;
                      this.c(var4, (byte) -15, var5);
                      return;
                    }
                  }
                }
              } else {
                var4 = param0 & 15;
                var5 = (param0 & 32695) >> 8;
                var6 = 127 & param0 >> 16;
                this.a(var4, (byte) -81, var6, var5);
                return;
              }
            } else {
              var4 = 15 & param0;
              var5 = param0 >> 8 & 127;
              var6 = (8346425 & param0) >> 16;
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
          var5 = (param0 & 32514) >> 8;
          var6 = 127 & param0 >> 16;
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
          ((kb) this).field_E[param1] = 12800;
          ((kb) this).field_R[param1] = 8192;
          ((kb) this).field_u[param1] = 16383;
          ((kb) this).field_n[param1] = 8192;
          ((kb) this).field_o[param1] = 0;
          ((kb) this).field_L[param1] = 8192;
          this.c(param1, -112);
          this.a(param1, -870);
          ((kb) this).field_J[param1] = 0;
          ((kb) this).field_D[param1] = 32767;
          ((kb) this).field_p[param1] = 256;
          ((kb) this).field_y[param1] = 0;
          this.c(11226, param1, 8192);
          return;
        } else {
          param1 = 0;
          L0: while (true) {
            if (param1 >= 16) {
              return;
            } else {
              this.a((byte) -97, param1);
              param1++;
              continue L0;
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
    }

    final static void a(int param0, int param1, uj param2, boolean param3, java.awt.Component param4, kb param5) {
        try {
            if (param1 != 16239) {
                Object var7 = null;
                kb.a((byte) 92, (java.awt.Component) null);
            }
            bg.a(param5, param0, 1024, param0, param4, param2, -118, param3);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kb.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = -11 / ((-58 - param0) / 47);
            var3_int = ((kb) this).field_R[param1.field_G];
            if (8192 <= var3_int) {
              stackOut_3_0 = 16384 + -((16384 + -var3_int) * (128 - param1.field_y) + 32 >> 6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = param1.field_y * var3_int + 32 >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kb.L(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized void a(boolean param0, boolean param1, ej param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        try {
            this.b(256, param0);
            ((kb) this).field_P.a(param2.field_i);
            ((kb) this).field_H = 0L;
            ((kb) this).field_B = param1 ? true : false;
            var5_int = ((kb) this).field_P.f();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((kb) this).field_P.e(var6);
                ((kb) this).field_P.c(var6);
                ((kb) this).field_P.f(var6);
            }
            ((kb) this).field_M = ((kb) this).field_P.c();
            ((kb) this).field_K = ((kb) this).field_P.field_f[((kb) this).field_M];
            ((kb) this).field_x = ((kb) this).field_P.b(((kb) this).field_K);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kb.SA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 28050 + ')');
        }
    }

    final synchronized void c(int param0, boolean param1) {
        if (param1) {
            return;
        }
        ((kb) this).field_m = param0;
    }

    private final void c(int param0, byte param1, int param2) {
    }

    private final void c(int param0, int param1, int param2) {
        ((kb) this).field_G[param1] = param2;
        ((kb) this).field_N[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
    }

    final synchronized boolean d(int param0) {
        if (param0 != 0) {
            ((kb) this).field_n = null;
        }
        return ((kb) this).field_P.d();
    }

    private final void a(boolean param0, int param1) {
        dl var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) -83);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (param1 != var3.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var3.field_K != null) {
                  L4: {
                    var3.field_K.g(kh.field_p / 100);
                    if (var3.field_K.l()) {
                      ((kb) this).field_I.field_u.a((qd) (Object) var3.field_K);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.a(1047574608);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_F < 0) {
                  ((kb) this).field_r[var3.field_G][var3.field_p] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.a(true);
              break L1;
            }
            var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
            continue L0;
          }
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
        L1: while (true) {
          if (((kb) this).field_K != var3) {
            L2: {
              ((kb) this).field_M = var2;
              ((kb) this).field_x = var4;
              ((kb) this).field_K = var3;
              if (null == ((kb) this).field_C) {
                break L2;
              } else {
                if (((kb) this).field_z < var3) {
                  ((kb) this).field_K = ((kb) this).field_z;
                  ((kb) this).field_M = -1;
                  ((kb) this).field_x = ((kb) this).field_P.b(((kb) this).field_K);
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
                if (var3 != ((kb) this).field_P.field_f[var2]) {
                  break L4;
                } else {
                  ((kb) this).field_P.e(var2);
                  var6 = ((kb) this).field_P.a(var2);
                  if (var6 == 1) {
                    ((kb) this).field_P.g();
                    ((kb) this).field_P.f(var2);
                    if (!((kb) this).field_P.a()) {
                      break L4;
                    } else {
                      if (((kb) this).field_C != null) {
                        ((kb) this).a(-8126, ((kb) this).field_C, ((kb) this).field_B);
                        this.c(true);
                        return;
                      } else {
                        L5: {
                          if (!((kb) this).field_B) {
                            break L5;
                          } else {
                            if (var3 != 0) {
                              ((kb) this).field_P.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(-1863960953, true);
                        ((kb) this).field_P.e();
                        return;
                      }
                    }
                  } else {
                    L6: {
                      if ((var6 & 128) == 0) {
                        break L6;
                      } else {
                        this.b(var6, 109);
                        break L6;
                      }
                    }
                    ((kb) this).field_P.c(var2);
                    ((kb) this).field_P.f(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((kb) this).field_P.c();
              var3 = ((kb) this).field_P.field_f[var2];
              var4 = ((kb) this).field_P.b(var3);
              continue L1;
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
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((kb) this).field_P.d()) {
                var4_int = ((kb) this).field_P.field_h * ((kb) this).field_s / kh.field_p;
                L2: while (true) {
                  L3: {
                    var5 = ((kb) this).field_H + (long)param2 * (long)var4_int;
                    if (0L > -var5 + ((kb) this).field_x) {
                      var7 = (int)((-1L + (long)var4_int + (-((kb) this).field_H + ((kb) this).field_x)) / (long)var4_int);
                      ((kb) this).field_H = ((kb) this).field_H + (long)var7 * (long)var4_int;
                      ((kb) this).field_I.b(param0, param1, var7);
                      this.c(true);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (!((kb) this).field_P.d()) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    } else {
                      ((kb) this).field_H = var5;
                      break L3;
                    }
                  }
                  ((kb) this).field_I.b(param0, param1, param2);
                  break L1;
                }
              } else {
                ((kb) this).field_I.b(param0, param1, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("kb.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(boolean param0, u param1, ej param2, lj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        s var8 = null;
        int var9 = 0;
        int var11 = 0;
        fb var12 = null;
        fb var13 = null;
        int stackIn_12_0 = 0;
        lj stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        lj stackIn_13_1 = null;
        int stackIn_14_0 = 0;
        lj stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_11_0 = 0;
        lj stackOut_11_1 = null;
        int stackOut_13_0 = 0;
        lj stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_12_0 = 0;
        lj stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.a();
              if (!param0) {
                break L1;
              } else {
                ((kb) this).field_I = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (param4 > 0) {
                var7 = (Object) (Object) new int[]{param4};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (s) (Object) param2.field_j.a((byte) -73);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param2.b();
                    break L4;
                  }
                }
                stackOut_22_0 = var6_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_d;
                  var12 = (fb) (Object) ((kb) this).field_A.a((byte) 92, (long)var9);
                  if (var12 == null) {
                    L6: {
                      stackOut_11_0 = var9;
                      stackOut_11_1 = (lj) param3;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (param0) {
                        stackOut_13_0 = stackIn_13_0;
                        stackOut_13_1 = (lj) (Object) stackIn_13_1;
                        stackOut_13_2 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L6;
                      } else {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = (lj) (Object) stackIn_12_1;
                        stackOut_12_2 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L6;
                      }
                    }
                    var13 = dh.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 != 0);
                    if (var13 == null) {
                      var6_int = 0;
                      break L5;
                    } else {
                      ((kb) this).field_A.a(-104, (da) (Object) var13, (long)var9);
                      if (var13.a(param1, (int[]) var7, (byte) 94, var8.field_o)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    }
                  } else {
                    if (var12.a(param1, (int[]) var7, (byte) 94, var8.field_o)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (s) (Object) param2.field_j.a(-27377);
                      continue L3;
                    }
                  }
                }
                var8 = (s) (Object) param2.field_j.a(-27377);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("kb.KA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final int a(byte param0, dl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ab var4 = null;
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
            var3_int = param1.field_u + (param1.field_m * param1.field_o >> 12);
            var3_int = var3_int + (((kb) this).field_p[param1.field_G] * (-8192 + ((kb) this).field_n[param1.field_G]) >> 12);
            var4 = param1.field_I;
            L1: {
              if (var4.field_j <= 0) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_a) {
                    break L2;
                  } else {
                    if (((kb) this).field_o[param1.field_G] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_a << 2;
                  var6 = var4.field_l << 1;
                  if (param1.field_A >= var6) {
                    break L3;
                  } else {
                    var5 = var5 * param1.field_A / var6;
                    break L3;
                  }
                }
                var5 = var5 + (((kb) this).field_o[param1.field_G] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_w));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(param1.field_k.field_j * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)kh.field_p);
              if (var5 < 1) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = var5;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kb.AA(").append(35).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void a(int param0, int param1, byte param2) {
        ((kb) this).field_q[param1] = param0;
        ((kb) this).field_F[param1] = jh.a(param0, -128);
        this.a(param0, (byte) 122, param1);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
    }

    final boolean a(int param0, byte param1, int[] param2, int param3, dl param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ab var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_z = kh.field_p / 100;
              if (param4.field_F < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param4.field_K) {
                    break L2;
                  } else {
                    if (!param4.field_K.j()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param4.a(1047574608);
                  param4.a(true);
                  if (param4.field_i <= 0) {
                    break L3;
                  } else {
                    if (param4 != ((kb) this).field_v[param4.field_G][param4.field_i]) {
                      break L3;
                    } else {
                      ((kb) this).field_v[param4.field_G][param4.field_i] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            }
            L4: {
              var6_int = param4.field_m;
              var7 = 81 / ((-32 - param1) / 38);
              if (0 >= var6_int) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((kb) this).field_L[param4.field_G]));
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param4.field_m = var6_int;
                break L4;
              }
            }
            L6: {
              param4.field_K.c(this.a((byte) 35, param4));
              var8 = param4.field_I;
              param4.field_A = param4.field_A + 1;
              param4.field_w = param4.field_w + var8.field_j;
              var9 = 0;
              var10 = (double)((param4.field_m * param4.field_o >> 12) + (-60 + param4.field_p << 8)) * 0.000005086263020833333;
              if (var8.field_i > 0) {
                L7: {
                  if (var8.field_h <= 0) {
                    param4.field_D = param4.field_D + 128;
                    break L7;
                  } else {
                    param4.field_D = param4.field_D + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_h) * 128.0);
                    break L7;
                  }
                }
                if (var8.field_i * param4.field_D >= 819200) {
                  var9 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var8.field_k != null) {
                L9: {
                  if (0 < var8.field_c) {
                    param4.field_v = param4.field_v + (int)(128.0 * Math.pow(2.0, (double)var8.field_c * var10) + 0.5);
                    break L9;
                  } else {
                    param4.field_v = param4.field_v + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (~(-2 + var8.field_k.length) >= ~param4.field_J) {
                      break L11;
                    } else {
                      if ((255 & var8.field_k[param4.field_J - -2]) << 8 >= param4.field_v) {
                        break L11;
                      } else {
                        param4.field_J = param4.field_J + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var8.field_k.length + -2 != param4.field_J) {
                    break L8;
                  } else {
                    if (var8.field_k[param4.field_J - -1] == 0) {
                      var9 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (param4.field_F < 0) {
                break L12;
              } else {
                if (var8.field_b == null) {
                  break L12;
                } else {
                  if (0 != (1 & ((kb) this).field_J[param4.field_G])) {
                    break L12;
                  } else {
                    L13: {
                      if (param4.field_i < 0) {
                        break L13;
                      } else {
                        if (param4 != ((kb) this).field_v[param4.field_G][param4.field_i]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (var8.field_f > 0) {
                        param4.field_F = param4.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_f * var10));
                        break L14;
                      } else {
                        param4.field_F = param4.field_F + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param4.field_B >= -2 + var8.field_b.length) {
                          break L16;
                        } else {
                          if (~param4.field_F >= ~(65280 & var8.field_b[param4.field_B + 2] << 8)) {
                            break L16;
                          } else {
                            param4.field_B = param4.field_B + 2;
                            continue L15;
                          }
                        }
                      }
                      if (~(var8.field_b.length - 2) != ~param4.field_B) {
                        break L12;
                      } else {
                        var9 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var9 != 0) {
              L17: {
                param4.field_K.g(param4.field_z);
                if (param2 != null) {
                  param4.field_K.b(param2, param0, param3);
                  break L17;
                } else {
                  param4.field_K.a(param3);
                  break L17;
                }
              }
              L18: {
                if (param4.field_K.l()) {
                  ((kb) this).field_I.field_u.a((qd) (Object) param4.field_K);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                param4.a(1047574608);
                if (0 > param4.field_F) {
                  break L19;
                } else {
                  param4.a(true);
                  if (param4.field_i <= 0) {
                    break L19;
                  } else {
                    if (((kb) this).field_v[param4.field_G][param4.field_i] != param4) {
                      break L19;
                    } else {
                      ((kb) this).field_v[param4.field_G][param4.field_i] = null;
                      break L19;
                    }
                  }
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            } else {
              param4.field_K.a(param4.field_z, this.a(param4, true), this.a(80, param4));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("kb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param3).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
        return stackIn_64_0 != 0;
    }

    private final int a(dl param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        ab var10 = null;
        ab var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
            if (0 != ((kb) this).field_w[param0.field_G]) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  var9 = null;
                  kb.a(-89, -61, (uj) null, false, (java.awt.Component) null, (kb) null);
                  break L1;
                }
              }
              L2: {
                var10 = param0.field_I;
                var11 = var10;
                var4 = 4096 + ((kb) this).field_E[param0.field_G] * ((kb) this).field_u[param0.field_G] >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + var4 * param0.field_t >> 15;
                var4 = 128 + var4 * ((kb) this).field_m >> 8;
                var4 = ((kb) this).field_w[param0.field_G] * var4 - -128 >> 8;
                if (var11.field_i <= 0) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_D * 0.00001953125 * (double)var11.field_i));
                  break L2;
                }
              }
              L3: {
                if (null != var11.field_k) {
                  L4: {
                    var5 = param0.field_v;
                    var6 = var11.field_k[param0.field_J + 1];
                    if (param0.field_J < var11.field_k.length + -2) {
                      var7 = (var10.field_k[param0.field_J] & 255) << 8;
                      var8 = 65280 & var11.field_k[2 + param0.field_J] << 8;
                      var6 = var6 + (var5 - var7) * (var11.field_k[param0.field_J - -3] - var6) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 32 + var4 * var6 >> 6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (0 >= param0.field_F) {
                  break L5;
                } else {
                  if (var11.field_b == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_F;
                      var6 = var11.field_b[param0.field_B - -1];
                      if (-2 + var11.field_b.length <= param0.field_B) {
                        break L6;
                      } else {
                        var7 = var10.field_b[param0.field_B] << 8 & 65280;
                        var8 = var11.field_b[2 + param0.field_B] << 8 & 65280;
                        var6 = var6 + (var11.field_b[param0.field_B - -3] - var6) * (-var7 + var5) / (-var7 + var8);
                        break L6;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L5;
                  }
                }
              }
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("kb.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(int param0, byte param1) {
        dl var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 > 84) {
          var3 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) 120);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (param0 != var3.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3.field_F >= 0) {
                  break L1;
                } else {
                  ((kb) this).field_r[var3.field_G][var3.field_p] = null;
                  var3.field_F = 0;
                  break L1;
                }
              }
              var3 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
              continue L0;
            }
          }
        } else {
          return;
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
        fb var10 = null;
        fb var11 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
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
                    if (var5.field_F >= 0) {
                      break L2;
                    } else {
                      ((kb) this).field_r[param2][var5.field_p] = null;
                      ((kb) this).field_r[param2][param3] = var5;
                      var6_int = var5.field_u - -(var5.field_m * var5.field_o >> 12);
                      var5.field_u = var5.field_u + (-var5.field_p + param3 << 8);
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
        var10 = (fb) (Object) ((kb) this).field_A.a((byte) 100, (long)((kb) this).field_t[param2]);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_k[param3];
          if (var6 != null) {
            L3: {
              var7 = new dl();
              var7.field_G = param2;
              var7.field_k = var6;
              var7.field_q = var10;
              var7.field_I = var10.field_o[param3];
              var7.field_i = var10.field_q[param3];
              var7.field_p = param3;
              var7.field_t = param0 * param0 * (var10.field_p * var10.field_l[param3]) - -1024 >> 11;
              var7.field_y = var10.field_n[param3] & 255;
              var7.field_u = (param3 << 8) - (var10.field_j[param3] & 32767);
              var7.field_B = 0;
              var7.field_v = 0;
              var7.field_J = 0;
              var7.field_F = -1;
              var7.field_D = 0;
              if (((kb) this).field_y[param2] != 0) {
                L4: {
                  var7.field_K = nc.b(var6, this.a((byte) 35, var7), 0, this.a(96, var7));
                  stackOut_13_0 = this;
                  stackOut_13_1 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (var11.field_j[param3] >= 0) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    break L4;
                  }
                }
                ((kb) this).a(stackIn_16_1, stackIn_16_2 != 0, var7);
                break L3;
              } else {
                var7.field_K = nc.b(var6, this.a((byte) 35, var7), this.a(var7, true), this.a(-112, var7));
                break L3;
              }
            }
            L5: {
              if (var11.field_j[param3] < 0) {
                var7.field_K.e(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_i >= 0) {
                L7: {
                  var8 = ((kb) this).field_v[param2][var7.field_i];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_F >= 0) {
                      break L7;
                    } else {
                      ((kb) this).field_r[param2][var8.field_p] = null;
                      var8.field_F = 0;
                      break L7;
                    }
                  }
                }
                ((kb) this).field_v[param2][var7.field_i] = var7;
                break L6;
              } else {
                break L6;
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
        dl var5 = ((kb) this).field_r[param0][param2];
        if (!(var5 != null)) {
            return;
        }
        ((kb) this).field_r[param0][param2] = null;
        if (0 == (((kb) this).field_J[param0] & 2)) {
            var5.field_F = 0;
        } else {
            var6 = (dl) (Object) ((kb) this).field_I.field_o.c((byte) 110);
            while (var6 != null) {
                if (var5.field_G == var6.field_G) {
                    if (var6.field_F < 0) {
                        if (var5 != var6) {
                            var5.field_F = 0;
                            break;
                        }
                    }
                }
                var6 = (dl) (Object) ((kb) this).field_I.field_o.c(-270);
            }
        }
    }

    public static void c(int param0) {
        field_O = null;
    }

    final boolean a(dl param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
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
            if (null == param0.field_K) {
              if (0 <= param0.field_F) {
                L1: {
                  param0.a(true);
                  if (param0.field_i <= 0) {
                    break L1;
                  } else {
                    if (param0 != ((kb) this).field_v[param0.field_G][param0.field_i]) {
                      break L1;
                    } else {
                      ((kb) this).field_v[param0.field_G][param0.field_i] = null;
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                return true;
              }
            } else {
              L2: {
                if (param1 == 22) {
                  break L2;
                } else {
                  ((kb) this).field_z = -13;
                  break L2;
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kb.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
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
