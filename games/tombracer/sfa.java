/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfa extends ha {
    private int field_j;
    private ija field_T;
    private int field_m;
    private int field_O;
    private boolean field_E;
    private java.awt.Canvas field_t;
    private ji field_G;
    private boolean field_z;
    private boolean field_e;
    int field_g;
    private bf field_D;
    int field_d;
    int field_p;
    private int field_s;
    int field_l;
    int field_w;
    int field_S;
    private int field_B;
    int field_K;
    private float[] field_H;
    int[] field_r;
    int field_k;
    private dd field_F;
    int field_u;
    private int field_y;
    pna field_A;
    int field_Q;
    int field_o;
    int field_I;
    int field_f;
    private int field_i;
    int field_C;
    int field_U;
    int field_J;
    int field_x;
    private tw[] field_Y;
    int field_L;
    int field_P;
    int field_V;
    int field_M;
    int field_W;
    int field_q;
    private int field_h;
    float[] field_n;
    private dd field_X;
    private int field_v;
    private nh field_R;

    final tw a(Runnable param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 < ((sfa) this).field_u) {
            if (((sfa) this).field_Y[var2].field_b != param0) {
              var2++;
              continue L0;
            } else {
              return ((sfa) this).field_Y[var2];
            }
          } else {
            return null;
          }
        }
    }

    final boolean d(int param0) {
        return ((sfa) this).field_c.a((byte) -56, param0).field_b || ((sfa) this).field_c.a((byte) 125, param0).field_n;
    }

    final void ya() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (((sfa) this).field_J != 0) {
            break L0;
          } else {
            if (((sfa) this).field_W != ((sfa) this).field_K) {
              break L0;
            } else {
              if (((sfa) this).field_d != 0) {
                break L0;
              } else {
                if (((sfa) this).field_P != ((sfa) this).field_h) {
                  break L0;
                } else {
                  var1 = ((sfa) this).field_n.length;
                  var2 = var1 - (var1 & 7);
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= var2) {
                      L2: while (true) {
                        if (var3 >= var1) {
                          return;
                        } else {
                          var3++;
                          ((sfa) this).field_n[var3] = 2147483648.0f;
                          continue L2;
                        }
                      }
                    } else {
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      var3++;
                      ((sfa) this).field_n[var3] = 2147483648.0f;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        var1 = ((sfa) this).field_W - ((sfa) this).field_J;
        var2 = ((sfa) this).field_P - ((sfa) this).field_d;
        var3 = ((sfa) this).field_K - var1;
        var4 = ((sfa) this).field_J + ((sfa) this).field_d * ((sfa) this).field_K;
        var5 = var1 >> 3;
        var6 = var1 & 7;
        var1 = var4 - 1;
        var8 = -var2;
        L3: while (true) {
          if (var8 >= 0) {
            return;
          } else {
            L4: {
              if (var5 <= 0) {
                break L4;
              } else {
                var7 = var5;
                L5: while (true) {
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var7--;
                  if (var7 > 0) {
                    continue L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L6: {
              if (var6 <= 0) {
                break L6;
              } else {
                var7 = var6;
                L7: while (true) {
                  var1++;
                  ((sfa) this).field_n[var1] = 2147483648.0f;
                  var7--;
                  if (var7 > 0) {
                    continue L7;
                  } else {
                    break L6;
                  }
                }
              }
            }
            var1 = var1 + var3;
            var8++;
            continue L3;
          }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        ((sfa) this).field_u = param0;
        ((sfa) this).field_Y = new tw[((sfa) this).field_u];
        for (var2 = 0; var2 < ((sfa) this).field_u; var2++) {
            ((sfa) this).field_Y[var2] = new tw((sfa) this);
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        float var5 = 0.0f;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        L0: {
          var5 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param0 + ((sfa) this).field_A.field_o * (float)param1 + ((sfa) this).field_A.field_f * (float)param2);
          if (var5 < (float)((sfa) this).field_g) {
            break L0;
          } else {
            if (var5 <= (float)((sfa) this).field_U) {
              L1: {
                L2: {
                  var6 = (int)((float)((sfa) this).field_Q * (((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param0 + ((sfa) this).field_A.field_i * (float)param1 + ((sfa) this).field_A.field_n * (float)param2)) / var5);
                  var7 = (int)((float)((sfa) this).field_C * (((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param0 + ((sfa) this).field_A.field_s * (float)param1 + ((sfa) this).field_A.field_j * (float)param2)) / var5);
                  if (var6 < ((sfa) this).field_p) {
                    break L2;
                  } else {
                    if (var6 > ((sfa) this).field_l) {
                      break L2;
                    } else {
                      if (var7 < ((sfa) this).field_k) {
                        break L2;
                      } else {
                        if (var7 > ((sfa) this).field_o) {
                          break L2;
                        } else {
                          param3[0] = var6 - ((sfa) this).field_p;
                          param3[1] = var7 - ((sfa) this).field_k;
                          param3[2] = (int)var5;
                          break L1;
                        }
                      }
                    }
                  }
                }
                var8 = param3;
                var9 = param3;
                param3[2] = -1;
                var9[1] = -1;
                var8[0] = -1;
                break L1;
              }
              return;
            } else {
              break L0;
            }
          }
        }
        var6_ref_int__ = param3;
        var7_ref_int__ = param3;
        param3[2] = -1;
        var7_ref_int__[1] = -1;
        var6_ref_int__[0] = -1;
    }

    final void f(int param0, int param1) {
        tw var3 = ((sfa) this).a((Runnable) (Object) Thread.currentThread());
        ((sfa) this).field_g = param0;
        ((sfa) this).field_U = param1;
        var3.field_B = ((sfa) this).field_U - 255;
    }

    final void c(int param0) {
        qq var4 = null;
        int var5 = 0;
        dw var6 = null;
        int var2 = param0 - ((sfa) this).field_j;
        Object var3 = ((sfa) this).field_F.b((byte) 85);
        while (var3 != null) {
            var4 = (qq) var3;
            if (var4.field_g) {
                var4.field_j = var4.field_j + var2;
                var5 = var4.field_j / 20;
                if (var5 > 0) {
                    var6 = ((sfa) this).field_c.a((byte) -53, var4.field_f);
                    var4.a(var6.field_s * var2 * 50 / 1000, var6.field_o * var2 * 50 / 1000);
                    var4.field_j = var4.field_j - var5 * 20;
                }
                var4.field_g = false;
            }
            var3 = ((sfa) this).field_F.a((byte) 60);
        }
        ((sfa) this).field_j = param0;
        ((sfa) this).field_X.b(72, 5);
        ((sfa) this).field_F.b(119, 5);
    }

    final void GA(int param0) {
        ((sfa) this).aa(0, 0, ((sfa) this).field_K, ((sfa) this).field_h, param0, 0);
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((sfa) this).U(param0, param1, param2, param4, param5);
        ((sfa) this).U(param0, param1 + param3 - 1, param2, param4, param5);
        this.c(param0, param1 + 1, param3 - 2, param4, param5);
        this.c(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        ija var7 = null;
        java.awt.Dimension var5 = null;
        ija var6 = (ija) (Object) ((sfa) this).field_G.a((byte) -112, (long)((Object) (Object) param0).hashCode());
        if (var6 != null) {
            var6.p(30);
            var7 = tfa.a(param2, param1, param0, 0);
            ((sfa) this).field_G.a((long)((Object) (Object) param0).hashCode(), 116, (vg) (Object) var7);
            if (((sfa) this).field_t == param0) {
                if (((sfa) this).field_D == null) {
                    var5 = param0.getSize();
                    ((sfa) this).field_m = var5.width;
                    ((sfa) this).field_O = var5.height;
                    ((sfa) this).field_T = var7;
                    ((sfa) this).field_r = var7.field_g;
                    ((sfa) this).field_K = var7.field_h;
                    ((sfa) this).field_h = var7.field_f;
                    if (((sfa) this).field_K == ((sfa) this).field_y) {
                        // if_icmpeq L217
                    }
                    ((sfa) this).field_y = ((sfa) this).field_K;
                    ((sfa) this).field_i = ((sfa) this).field_K;
                    ((sfa) this).field_s = ((sfa) this).field_h;
                    ((sfa) this).field_B = ((sfa) this).field_h;
                    ((sfa) this).field_n = new float[((sfa) this).field_y * ((sfa) this).field_s];
                    ((sfa) this).field_H = new float[((sfa) this).field_y * ((sfa) this).field_s];
                    this.m();
                }
            }
            return;
        }
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 < ((sfa) this).field_J) {
            break L0;
          } else {
            if (param0 < ((sfa) this).field_W) {
              L1: {
                if (param1 >= ((sfa) this).field_d) {
                  break L1;
                } else {
                  param2 = param2 - (((sfa) this).field_d - param1);
                  param1 = ((sfa) this).field_d;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= ((sfa) this).field_P) {
                  break L2;
                } else {
                  param2 = ((sfa) this).field_P - param1;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * ((sfa) this).field_K;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = var6 + var8 * ((sfa) this).field_K;
                            var10 = ((sfa) this).field_r[var9];
                            var11 = param3 + var10;
                            var12 = (param3 & 16711935) + (var10 & 16711935);
                            var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                            ((sfa) this).field_r[var9] = var11 - var10 | var10 - (var10 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = var6 + var9 * ((sfa) this).field_K;
                          var11 = ((sfa) this).field_r[var10];
                          var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                          ((sfa) this).field_r[var10] = param3 + var11;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  ((sfa) this).field_r[var6 + var8 * ((sfa) this).field_K] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    private final void g(int param0) {
        ((sfa) this).field_Y[param0].a((Runnable) (Object) Thread.currentThread(), (byte) 100);
    }

    final void a(gda param0) {
        ((sfa) this).field_A = (pna) (Object) param0;
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        L0: {
          var9 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param0 + ((sfa) this).field_A.field_o * (float)param1 + ((sfa) this).field_A.field_f * (float)param2);
          var10 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param3 + ((sfa) this).field_A.field_o * (float)param4 + ((sfa) this).field_A.field_f * (float)param5);
          if (var9 >= (float)((sfa) this).field_g) {
            break L0;
          } else {
            if (var10 >= (float)((sfa) this).field_g) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var11 = ((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param0 + ((sfa) this).field_A.field_i * (float)param1 + ((sfa) this).field_A.field_n * (float)param2);
          var12 = ((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param0 + ((sfa) this).field_A.field_s * (float)param1 + ((sfa) this).field_A.field_j * (float)param2);
          var13 = ((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param3 + ((sfa) this).field_A.field_i * (float)param4 + ((sfa) this).field_A.field_n * (float)param5);
          var14 = ((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param3 + ((sfa) this).field_A.field_s * (float)param4 + ((sfa) this).field_A.field_j * (float)param5);
          if (var9 >= (float)((sfa) this).field_g) {
            break L1;
          } else {
            var15 = ((float)((sfa) this).field_g - var10) / (var9 - var10);
            var11 = var13 + (var11 - var13) * var15;
            var12 = var14 + (var12 - var14) * var15;
            var9 = (float)((sfa) this).field_g;
            break L1;
          }
        }
        L2: {
          if (var10 >= (float)((sfa) this).field_g) {
            break L2;
          } else {
            var15 = ((float)((sfa) this).field_g - var9) / (var10 - var9);
            var13 = var11 + (var13 - var11) * var15;
            var14 = var12 + (var14 - var12) * var15;
            var10 = (float)((sfa) this).field_g;
            break L2;
          }
        }
        ((sfa) this).a(((sfa) this).field_L + (int)((float)((sfa) this).field_Q * var11 / var9), ((sfa) this).field_w + (int)((float)((sfa) this).field_C * var12 / var9), ((sfa) this).field_L + (int)((float)((sfa) this).field_Q * var13 / var10), ((sfa) this).field_w + (int)((float)((sfa) this).field_C * var14 / var10), param6, param7);
    }

    final void a(za param0) {
    }

    final boolean j(int param0) {
        if (((sfa) this).field_e) {
          return true;
        } else {
          if (!((sfa) this).field_c.a((byte) -17, param0).field_g) {
            return false;
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1) throws qva {
        Exception exception = null;
        java.awt.Graphics var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (((sfa) this).field_t == null) {
            break L0;
          } else {
            if (((sfa) this).field_T != null) {
              try {
                var3 = ((sfa) this).field_t.getGraphics();
                ((sfa) this).field_T.a(((sfa) this).field_O, 0, param0, 108, param1, 0, var3, ((sfa) this).field_m);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              exception = (Exception) (Object) decompiledCaughtException;
              ((sfa) this).field_t.repaint();
            } else {
              break L0;
            }
          }
        }
        throw new IllegalStateException("off");
    }

    final boolean f() {
        return false;
    }

    final void a(float param0, float param1, float param2) {
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((sfa) this).field_L = param0;
        ((sfa) this).field_w = param1;
        ((sfa) this).field_Q = param2;
        ((sfa) this).field_C = param3;
        this.g();
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final int[] h(int param0) {
        qq var2 = null;
        qq var2_ref = null;
        Object var3 = null;
        dw var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Object stackIn_4_0 = null;
        int stackIn_10_0 = 0;
        qq stackIn_11_0 = null;
        qq stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[] stackIn_11_4 = null;
        qq stackIn_12_0 = null;
        qq stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int[] stackIn_12_4 = null;
        qq stackIn_13_0 = null;
        qq stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int[] stackIn_13_4 = null;
        int stackIn_13_5 = 0;
        Object stackOut_3_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        qq stackOut_10_0 = null;
        qq stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_10_4 = null;
        qq stackOut_11_0 = null;
        qq stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int[] stackOut_11_4 = null;
        int stackOut_11_5 = 0;
        qq stackOut_12_0 = null;
        qq stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int[] stackOut_12_4 = null;
        int stackOut_12_5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((sfa) this).field_F;
                    // monitorenter ((sfa) this).field_F
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (qq) ((sfa) this).field_F.a((byte) 92, (long)param0 | -9223372036854775808L);
                        if (var2 != null) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((sfa) this).field_c.a(param0, (byte) 41)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var3
                        stackOut_3_0 = null;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (int[]) (Object) stackIn_4_0;
                }
                case 5: {
                    try {
                        var4 = ((sfa) this).field_c.a((byte) -124, param0);
                        if (var4.field_g) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!((sfa) this).field_e) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 64;
                        stackIn_10_0 = stackOut_8_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = ((sfa) this).field_I;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = stackIn_10_0;
                        stackOut_10_0 = null;
                        stackOut_10_1 = null;
                        stackOut_10_2 = param0;
                        stackOut_10_3 = var5;
                        stackOut_10_4 = ((sfa) this).field_c.a((byte) 40, var5, 0.699999988079071f, param0, true, var5);
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        stackIn_11_4 = stackOut_10_4;
                        if (var4.field_d == 1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = null;
                        stackOut_11_1 = null;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = (int[]) (Object) stackIn_11_4;
                        stackOut_11_5 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = null;
                        stackOut_12_1 = null;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = (int[]) (Object) stackIn_12_4;
                        stackOut_12_5 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        stackIn_13_5 = stackOut_12_5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        new qq(stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5 != 0);
                        var2_ref = stackIn_13_0;
                        ((sfa) this).field_F.a(29166, (Object) (Object) var2_ref, (long)param0 | -9223372036854775808L);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        // monitorexit var3
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = caughtException;
                        // monitorexit var3
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var6;
                }
                case 18: {
                    var2_ref.field_g = true;
                    return var2_ref.b();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > ((sfa) this).field_K) {
            param2 = ((sfa) this).field_K;
        }
        if (param3 > ((sfa) this).field_h) {
            param3 = ((sfa) this).field_h;
        }
        ((sfa) this).field_J = param0;
        ((sfa) this).field_W = param2;
        ((sfa) this).field_d = param1;
        ((sfa) this).field_P = param3;
        this.g();
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        return (ka) (Object) new ww((sfa) this, param0, param1, param3, param4, param2);
    }

    final boolean n() {
        return ((sfa) this).field_z;
    }

    final boolean j() {
        return false;
    }

    final gda e() {
        tw var1 = ((sfa) this).a((Runnable) (Object) Thread.currentThread());
        return (gda) (Object) var1.field_u;
    }

    final void d() {
        if (((sfa) this).field_t != null) {
            ((sfa) this).field_r = ((sfa) this).field_T.field_g;
            ((sfa) this).field_K = ((sfa) this).field_T.field_h;
            ((sfa) this).field_h = ((sfa) this).field_T.field_f;
            ((sfa) this).field_n = ((sfa) this).field_H;
            ((sfa) this).field_y = ((sfa) this).field_i;
            ((sfa) this).field_s = ((sfa) this).field_B;
        } else {
            ((sfa) this).field_K = 1;
            ((sfa) this).field_h = 1;
            ((sfa) this).field_r = null;
            ((sfa) this).field_y = 1;
            ((sfa) this).field_s = 1;
            ((sfa) this).field_n = null;
        }
        ((sfa) this).field_D = null;
        this.m();
    }

    final void k() {
        if (((sfa) this).field_E) {
            rpa.a(false, true, true);
            ((sfa) this).field_E = false;
        }
        ((sfa) this).field_T = null;
        ((sfa) this).field_t = null;
        ((sfa) this).field_m = 0;
        ((sfa) this).field_O = 0;
        ((sfa) this).field_G = null;
        ((sfa) this).field_z = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            L1: {
              if (param2 <= param3) {
                L2: {
                  param0 = param0 << 16;
                  param0 = param0 + 32768;
                  param2 = param2 << 16;
                  var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                  param3 = param3 + param1;
                  if (param1 >= ((sfa) this).field_d) {
                    break L2;
                  } else {
                    param0 = param0 + var7 * (((sfa) this).field_d - param1);
                    param1 = ((sfa) this).field_d;
                    break L2;
                  }
                }
                L3: {
                  if (param3 < ((sfa) this).field_P) {
                    break L3;
                  } else {
                    param3 = ((sfa) this).field_P - 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (param5 != 1) {
                        break L5;
                      } else {
                        if (var8 != 255) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L6: while (true) {
                          if (param1 > param3) {
                            break L1;
                          } else {
                            L7: {
                              var9 = param0 >> 16;
                              if (var9 < ((sfa) this).field_J) {
                                break L7;
                              } else {
                                if (var9 >= ((sfa) this).field_W) {
                                  break L7;
                                } else {
                                  var10 = var9 + param1 * ((sfa) this).field_K;
                                  var11 = ((sfa) this).field_r[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  ((sfa) this).field_r[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L7;
                                }
                              }
                            }
                            param0 = param0 + var7;
                            param1++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L8: while (true) {
                        if (param1 > param3) {
                          break L1;
                        } else {
                          L9: {
                            var10 = param0 >> 16;
                            if (var10 < ((sfa) this).field_J) {
                              break L9;
                            } else {
                              if (var10 >= ((sfa) this).field_W) {
                                break L9;
                              } else {
                                var11 = var10 + param1 * ((sfa) this).field_K;
                                var12 = ((sfa) this).field_r[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                ((sfa) this).field_r[var10 + param1 * ((sfa) this).field_K] = param4 + var12;
                                break L9;
                              }
                            }
                          }
                          param0 = param0 + var7;
                          param1++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L10: while (true) {
                  if (param1 > param3) {
                    break L1;
                  } else {
                    L11: {
                      var9 = param0 >> 16;
                      if (var9 < ((sfa) this).field_J) {
                        break L11;
                      } else {
                        if (var9 >= ((sfa) this).field_W) {
                          break L11;
                        } else {
                          ((sfa) this).field_r[var9 + param1 * ((sfa) this).field_K] = param4;
                          break L11;
                        }
                      }
                    }
                    param0 = param0 + var7;
                    param1++;
                    continue L10;
                  }
                }
              } else {
                L12: {
                  param1 = param1 << 16;
                  param1 = param1 + 32768;
                  param3 = param3 << 16;
                  var7 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                  param2 = param2 + param0;
                  if (param0 >= ((sfa) this).field_J) {
                    break L12;
                  } else {
                    param1 = param1 + var7 * (((sfa) this).field_J - param0);
                    param0 = ((sfa) this).field_J;
                    break L12;
                  }
                }
                L13: {
                  if (param2 < ((sfa) this).field_W) {
                    break L13;
                  } else {
                    param2 = ((sfa) this).field_W - 1;
                    break L13;
                  }
                }
                L14: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L14;
                  } else {
                    L15: {
                      if (param5 != 1) {
                        break L15;
                      } else {
                        if (var8 != 255) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L16: while (true) {
                          if (param0 > param2) {
                            break L1;
                          } else {
                            L17: {
                              var9 = param1 >> 16;
                              if (var9 < ((sfa) this).field_d) {
                                break L17;
                              } else {
                                if (var9 >= ((sfa) this).field_P) {
                                  break L17;
                                } else {
                                  var10 = param0 + var9 * ((sfa) this).field_K;
                                  var11 = ((sfa) this).field_r[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  ((sfa) this).field_r[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L17;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L18: while (true) {
                        if (param0 > param2) {
                          break L1;
                        } else {
                          L19: {
                            var10 = param1 >> 16;
                            if (var10 < ((sfa) this).field_d) {
                              break L19;
                            } else {
                              if (var10 >= ((sfa) this).field_P) {
                                break L19;
                              } else {
                                var11 = param0 + var10 * ((sfa) this).field_K;
                                var12 = ((sfa) this).field_r[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                ((sfa) this).field_r[var11] = param4 + var12;
                                break L19;
                              }
                            }
                          }
                          param1 = param1 + var7;
                          param0++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L21: {
                      var9 = param1 >> 16;
                      if (var9 < ((sfa) this).field_d) {
                        break L21;
                      } else {
                        if (var9 >= ((sfa) this).field_P) {
                          break L21;
                        } else {
                          ((sfa) this).field_r[param0 + var9 * ((sfa) this).field_K] = param4;
                          break L21;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L20;
                  }
                }
              }
            }
            return;
          } else {
            L22: {
              if (param3 < 0) {
                this.c(param0, param1 + param3, -param3 + 1, param4, param5);
                break L22;
              } else {
                this.c(param0, param1, param3 + 1, param4, param5);
                break L22;
              }
            }
            return;
          }
        } else {
          L23: {
            if (param2 < 0) {
              ((sfa) this).U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L23;
            } else {
              ((sfa) this).U(param0, param1, param2 + 1, param4, param5);
              break L23;
            }
          }
          return;
        }
    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        float var6 = 0.0f;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        L0: {
          var6 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param0 + ((sfa) this).field_A.field_o * (float)param1 + ((sfa) this).field_A.field_f * (float)param2);
          if (var6 < (float)((sfa) this).field_g) {
            break L0;
          } else {
            if (var6 <= (float)((sfa) this).field_U) {
              L1: {
                L2: {
                  var7 = (int)((float)((sfa) this).field_Q * (((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param0 + ((sfa) this).field_A.field_i * (float)param1 + ((sfa) this).field_A.field_n * (float)param2)) / (float)param3);
                  var8 = (int)((float)((sfa) this).field_C * (((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param0 + ((sfa) this).field_A.field_s * (float)param1 + ((sfa) this).field_A.field_j * (float)param2)) / (float)param3);
                  if (var7 < ((sfa) this).field_p) {
                    break L2;
                  } else {
                    if (var7 > ((sfa) this).field_l) {
                      break L2;
                    } else {
                      if (var8 < ((sfa) this).field_k) {
                        break L2;
                      } else {
                        if (var8 > ((sfa) this).field_o) {
                          break L2;
                        } else {
                          param4[0] = var7 - ((sfa) this).field_p;
                          param4[1] = var8 - ((sfa) this).field_k;
                          param4[2] = (int)var6;
                          break L1;
                        }
                      }
                    }
                  }
                }
                var9 = param4;
                var10 = param4;
                param4[2] = -1;
                var10[1] = -1;
                var9[0] = -1;
                break L1;
              }
              return;
            } else {
              break L0;
            }
          }
        }
        var7_ref_int__ = param4;
        var8_ref_int__ = param4;
        param4[2] = -1;
        var8_ref_int__[1] = -1;
        var7_ref_int__[0] = -1;
    }

    private final void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        L0: {
          if (param3 >= 0) {
            break L0;
          } else {
            param3 = -param3;
            break L0;
          }
        }
        L1: {
          var7 = param1 - param3;
          if (var7 >= ((sfa) this).field_d) {
            break L1;
          } else {
            var7 = ((sfa) this).field_d;
            break L1;
          }
        }
        L2: {
          var8 = param1 + param3 + 1;
          if (var8 <= ((sfa) this).field_P) {
            break L2;
          } else {
            var8 = ((sfa) this).field_P;
            break L2;
          }
        }
        L3: {
          var9 = var7;
          var10 = param3 * param3;
          var11 = 0;
          var12 = param1 - var9;
          var13 = var12 * var12;
          var14 = var13 - var12;
          if (param1 <= var8) {
            break L3;
          } else {
            param1 = var8;
            break L3;
          }
        }
        L4: {
          var15 = param4 >>> 24;
          if (param5 == 0) {
            break L4;
          } else {
            L5: {
              if (param5 != 1) {
                break L5;
              } else {
                if (var15 != 255) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (param5 != 1) {
                if (param5 != 2) {
                  throw new IllegalArgumentException();
                } else {
                  L7: while (true) {
                    if (var9 >= param1) {
                      var11 = param3;
                      var12 = -var12;
                      var14 = var12 * var12 + var10;
                      var13 = var14 - var11;
                      var14 = var14 - var12;
                      L8: while (true) {
                        if (var9 >= var8) {
                          break L6;
                        } else {
                          L9: while (true) {
                            L10: {
                              if (var14 <= var10) {
                                break L10;
                              } else {
                                if (var13 <= var10) {
                                  break L10;
                                } else {
                                  var11--;
                                  var14 = var14 - (var11 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var16 = param0 - var11;
                              if (var16 >= ((sfa) this).field_J) {
                                break L11;
                              } else {
                                var16 = ((sfa) this).field_J;
                                break L11;
                              }
                            }
                            L12: {
                              var17 = param0 + var11;
                              if (var17 <= ((sfa) this).field_W - 1) {
                                break L12;
                              } else {
                                var17 = ((sfa) this).field_W - 1;
                                break L12;
                              }
                            }
                            var18 = var16 + var9 * ((sfa) this).field_K;
                            var19 = var16;
                            L13: while (true) {
                              if (var19 > var17) {
                                var9++;
                                var14 = var14 + (var12 + var12);
                                var12++;
                                var13 = var13 + (var12 + var12);
                                continue L8;
                              } else {
                                if ((float)param2 < ((sfa) this).field_n[var18]) {
                                  var20 = ((sfa) this).field_r[var18];
                                  var21 = param4 + var20;
                                  var22 = (param4 & 16711935) + (var20 & 16711935);
                                  var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                  ((sfa) this).field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
                                  var18++;
                                  var19++;
                                  continue L13;
                                } else {
                                  var18++;
                                  var19++;
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L14: while (true) {
                        L15: {
                          if (var14 <= var10) {
                            break L15;
                          } else {
                            if (var13 > var10) {
                              L16: {
                                var16 = param0 - var11 + 1;
                                if (var16 >= ((sfa) this).field_J) {
                                  break L16;
                                } else {
                                  var16 = ((sfa) this).field_J;
                                  break L16;
                                }
                              }
                              L17: {
                                var17 = param0 + var11;
                                if (var17 <= ((sfa) this).field_W) {
                                  break L17;
                                } else {
                                  var17 = ((sfa) this).field_W;
                                  break L17;
                                }
                              }
                              var18 = var16 + var9 * ((sfa) this).field_K;
                              var19 = var16;
                              L18: while (true) {
                                if (var19 >= var17) {
                                  var9++;
                                  var12--;
                                  var13 = var13 - (var12 + var12);
                                  var14 = var14 - (var12 + var12);
                                  continue L7;
                                } else {
                                  if ((float)param2 < ((sfa) this).field_n[var18]) {
                                    var20 = ((sfa) this).field_r[var18];
                                    var21 = param4 + var20;
                                    var22 = (param4 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    ((sfa) this).field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
                                    var18++;
                                    var19++;
                                    continue L18;
                                  } else {
                                    var18++;
                                    var19++;
                                    continue L18;
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var13 = var13 + (var11 + var11);
                        var11++;
                        var14 = var14 + (var11 + var11);
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                param4 = ((param4 & 16711935) * var15 >> 8 & 16711935) + ((param4 & 65280) * var15 >> 8 & 65280) + (var15 << 24);
                var16 = 256 - var15;
                L19: while (true) {
                  if (var9 >= param1) {
                    var11 = param3;
                    var12 = -var12;
                    var14 = var12 * var12 + var10;
                    var13 = var14 - var11;
                    var14 = var14 - var12;
                    L20: while (true) {
                      if (var9 >= var8) {
                        break L6;
                      } else {
                        L21: while (true) {
                          L22: {
                            if (var14 <= var10) {
                              break L22;
                            } else {
                              if (var13 <= var10) {
                                break L22;
                              } else {
                                var11--;
                                var14 = var14 - (var11 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L21;
                              }
                            }
                          }
                          L23: {
                            var17 = param0 - var11;
                            if (var17 >= ((sfa) this).field_J) {
                              break L23;
                            } else {
                              var17 = ((sfa) this).field_J;
                              break L23;
                            }
                          }
                          L24: {
                            var18 = param0 + var11;
                            if (var18 <= ((sfa) this).field_W - 1) {
                              break L24;
                            } else {
                              var18 = ((sfa) this).field_W - 1;
                              break L24;
                            }
                          }
                          var19 = var17 + var9 * ((sfa) this).field_K;
                          var20 = var17;
                          L25: while (true) {
                            if (var20 > var18) {
                              var9++;
                              var14 = var14 + (var12 + var12);
                              var12++;
                              var13 = var13 + (var12 + var12);
                              continue L20;
                            } else {
                              if ((float)param2 < ((sfa) this).field_n[var19]) {
                                var21 = ((sfa) this).field_r[var19];
                                var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                                ((sfa) this).field_r[var19] = param4 + var21;
                                var19++;
                                var20++;
                                continue L25;
                              } else {
                                var19++;
                                var20++;
                                continue L25;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L26: while (true) {
                      L27: {
                        if (var14 <= var10) {
                          break L27;
                        } else {
                          if (var13 > var10) {
                            L28: {
                              var17 = param0 - var11 + 1;
                              if (var17 >= ((sfa) this).field_J) {
                                break L28;
                              } else {
                                var17 = ((sfa) this).field_J;
                                break L28;
                              }
                            }
                            L29: {
                              var18 = param0 + var11;
                              if (var18 <= ((sfa) this).field_W) {
                                break L29;
                              } else {
                                var18 = ((sfa) this).field_W;
                                break L29;
                              }
                            }
                            var19 = var17 + var9 * ((sfa) this).field_K;
                            var20 = var17;
                            L30: while (true) {
                              if (var20 >= var18) {
                                var9++;
                                var12--;
                                var13 = var13 - (var12 + var12);
                                var14 = var14 - (var12 + var12);
                                continue L19;
                              } else {
                                if ((float)param2 < ((sfa) this).field_n[var19]) {
                                  var21 = ((sfa) this).field_r[var19];
                                  var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                                  ((sfa) this).field_r[var19] = param4 + var21;
                                  var19++;
                                  var20++;
                                  continue L30;
                                } else {
                                  var19++;
                                  var20++;
                                  continue L30;
                                }
                              }
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      var13 = var13 + (var11 + var11);
                      var11++;
                      var14 = var14 + (var11 + var11);
                      continue L26;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L31: while (true) {
          if (var9 >= param1) {
            var11 = param3;
            var12 = var9 - param1;
            var14 = var12 * var12 + var10;
            var13 = var14 - var11;
            var14 = var14 - var12;
            L32: while (true) {
              if (var9 >= var8) {
                return;
              } else {
                L33: while (true) {
                  L34: {
                    if (var14 <= var10) {
                      break L34;
                    } else {
                      if (var13 <= var10) {
                        break L34;
                      } else {
                        var11--;
                        var14 = var14 - (var11 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L33;
                      }
                    }
                  }
                  L35: {
                    var16 = param0 - var11;
                    if (var16 >= ((sfa) this).field_J) {
                      break L35;
                    } else {
                      var16 = ((sfa) this).field_J;
                      break L35;
                    }
                  }
                  L36: {
                    var17 = param0 + var11;
                    if (var17 <= ((sfa) this).field_W - 1) {
                      break L36;
                    } else {
                      var17 = ((sfa) this).field_W - 1;
                      break L36;
                    }
                  }
                  var18 = var16 + var9 * ((sfa) this).field_K;
                  var19 = var16;
                  L37: while (true) {
                    if (var19 > var17) {
                      var9++;
                      var14 = var14 + (var12 + var12);
                      var12++;
                      var13 = var13 + (var12 + var12);
                      continue L32;
                    } else {
                      if ((float)param2 < ((sfa) this).field_n[var18]) {
                        ((sfa) this).field_r[var18] = param4;
                        var18++;
                        var19++;
                        continue L37;
                      } else {
                        var18++;
                        var19++;
                        continue L37;
                      }
                    }
                  }
                }
              }
            }
          } else {
            L38: while (true) {
              L39: {
                if (var14 <= var10) {
                  break L39;
                } else {
                  if (var13 > var10) {
                    L40: {
                      var16 = param0 - var11 + 1;
                      if (var16 >= ((sfa) this).field_J) {
                        break L40;
                      } else {
                        var16 = ((sfa) this).field_J;
                        break L40;
                      }
                    }
                    L41: {
                      var17 = param0 + var11;
                      if (var17 <= ((sfa) this).field_W) {
                        break L41;
                      } else {
                        var17 = ((sfa) this).field_W;
                        break L41;
                      }
                    }
                    var18 = var16 + var9 * ((sfa) this).field_K;
                    var19 = var16;
                    L42: while (true) {
                      if (var19 >= var17) {
                        var9++;
                        var12--;
                        var13 = var13 - (var12 + var12);
                        var14 = var14 - (var12 + var12);
                        continue L31;
                      } else {
                        if ((float)param2 < ((sfa) this).field_n[var18]) {
                          ((sfa) this).field_r[var18] = param4;
                          var18++;
                          var19++;
                          continue L42;
                        } else {
                          var18++;
                          var19++;
                          continue L42;
                        }
                      }
                    }
                  } else {
                    break L39;
                  }
                }
              }
              var13 = var13 + (var11 + var11);
              var11++;
              var14 = var14 + (var11 + var11);
              continue L38;
            }
          }
        }
    }

    final jca a(nha param0, mw param1) {
        return (jca) (Object) new bf((sfa) this, (nh) (Object) param0, (ita) (Object) param1);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11 = null;
        int[] var18 = null;
        int[] var17 = null;
        int[] var16 = null;
        int[] var14 = null;
        int[] var12 = null;
        int var13 = 0;
        nh var15 = null;
        nh var11_ref = null;
        if (param3 != 0) {
            if (param4 == 0) {
                return;
            }
            if (param6 != 65535) {
                // ifne L204
                if (((sfa) this).field_v != param6) {
                    var11 = (nh) ((sfa) this).field_X.a((byte) 75, (long)param6);
                    if (var11 == null) {
                        var18 = ((sfa) this).h(param6);
                        var17 = var18;
                        var16 = var17;
                        var14 = var16;
                        var12 = var14;
                        if (var12 == null) {
                            return;
                        }
                        var13 = ((sfa) this).j(param6) ? 64 : ((sfa) this).field_I;
                        var15 = ((sfa) this).a(var18, var13, 79, var13, var13, 0);
                        var11_ref = var15;
                        ((sfa) this).field_X.a(29166, (Object) (Object) var15, (long)param6);
                    }
                    ((sfa) this).field_v = param6;
                    ((sfa) this).field_R = var11_ref;
                }
                ((pf) (Object) ((sfa) this).field_R).b(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
            } else {
                this.e(param0, param1, param2, param3, param7, param9);
            }
            return;
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11 = null;
        int[] var18 = null;
        int[] var17 = null;
        int[] var16 = null;
        int[] var14 = null;
        int[] var12 = null;
        int var13 = 0;
        nh var15 = null;
        nh var11_ref = null;
        if (param3 != 0) {
            if (param4 == 0) {
                return;
            }
            if (param6 != 65535) {
                // ifne L203
                if (((sfa) this).field_v != param6) {
                    var11 = (nh) ((sfa) this).field_X.a((byte) 55, (long)param6);
                    if (var11 == null) {
                        var18 = ((sfa) this).h(param6);
                        var17 = var18;
                        var16 = var17;
                        var14 = var16;
                        var12 = var14;
                        if (var12 == null) {
                            return;
                        }
                        var13 = ((sfa) this).j(param6) ? 64 : ((sfa) this).field_I;
                        var15 = ((sfa) this).a(var18, var13, 80, var13, var13, 0);
                        var11_ref = var15;
                        ((sfa) this).field_X.a(29166, (Object) (Object) var15, (long)param6);
                    }
                    ((sfa) this).field_v = param6;
                    ((sfa) this).field_R = var11_ref;
                }
                ((pf) (Object) ((sfa) this).field_R).a(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
            } else {
                this.e(param0, param1, param2, param3, param7, param9);
            }
            return;
        }
    }

    final mw b(int param0, int param1) {
        return (mw) (Object) new ita(param0, param1);
    }

    final void la() {
        ((sfa) this).field_J = 0;
        ((sfa) this).field_d = 0;
        ((sfa) this).field_W = ((sfa) this).field_K;
        ((sfa) this).field_P = ((sfa) this).field_h;
        this.g();
    }

    final gda b() {
        return (gda) (Object) new pna();
    }

    final void xa(float param0) {
        ((sfa) this).field_f = (int)(param0 * 65535.0f);
    }

    final int i() {
        return ((sfa) this).field_g;
    }

    final void a(jca param0) {
        bf var2 = (bf) (Object) param0;
        ((sfa) this).field_K = var2.field_c;
        ((sfa) this).field_h = var2.field_d;
        ((sfa) this).field_r = var2.field_g;
        ((sfa) this).field_D = var2;
        ((sfa) this).field_y = var2.field_c;
        ((sfa) this).field_s = var2.field_d;
        ((sfa) this).field_n = var2.field_e;
        this.m();
    }

    final void L(int param0, int param1, int param2) {
        int var4 = 0;
        tw var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((sfa) this).field_Y.length) {
            return;
          } else {
            L1: {
              var5 = ((sfa) this).field_Y[var4];
              var5.field_D = param0 & 16777215;
              var6 = var5.field_D >>> 16 & 255;
              if (var6 >= 2) {
                break L1;
              } else {
                var6 = 2;
                break L1;
              }
            }
            L2: {
              var7 = var5.field_D >> 8 & 255;
              if (var7 >= 2) {
                break L2;
              } else {
                var7 = 2;
                break L2;
              }
            }
            L3: {
              var8 = var5.field_D & 255;
              if (var8 >= 2) {
                break L3;
              } else {
                var8 = 2;
                break L3;
              }
            }
            var5.field_D = var6 << 16 | var7 << 8 | var8;
            if (param1 >= 0) {
              var5.field_J = true;
              var4++;
              continue L0;
            } else {
              var5.field_J = false;
              var4++;
              continue L0;
            }
          }
        }
    }

    final za a(int param0) {
        return null;
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return null;
    }

    private final void m() {
        int var1 = 0;
        for (var1 = 0; var1 < ((sfa) this).field_u; var1++) {
            ((sfa) this).field_Y[var1].a(-39);
        }
        ((sfa) this).la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (((sfa) this).field_J < param0) {
            ((sfa) this).field_J = param0;
        }
        if (((sfa) this).field_d < param1) {
            ((sfa) this).field_d = param1;
        }
        if (((sfa) this).field_W > param2) {
            ((sfa) this).field_W = param2;
        }
        if (((sfa) this).field_P > param3) {
            ((sfa) this).field_P = param3;
        }
        this.g();
    }

    sfa(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
            this.a(param0, param2, param3);
            this.a(param0);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            ((sfa) this).a(true);
            throw new RuntimeException("");
        }
    }

    final void c() {
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        ija var4_ref = null;
        ija var4 = (ija) (Object) ((sfa) this).field_G.a((byte) -104, (long)((Object) (Object) param0).hashCode());
        if (var4 == null) {
            var4_ref = tfa.a(param2, param1, param0, 0);
            ((sfa) this).field_G.a((long)((Object) (Object) param0).hashCode(), 125, (vg) (Object) var4_ref);
        } else {
            if (var4_ref.field_h == param1) {
                // if_icmpeq L90
            }
            this.b(param0, param1, param2);
        }
        return;
    }

    final void a(int param0, ob[] param1) {
    }

    final nh a(jpa param0, boolean param1) {
        int[] var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        raa var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          L1: {
            var28 = param0.field_g;
            var24 = var28;
            var20 = var24;
            var16 = var20;
            var3 = var16;
            var4 = param0.field_f;
            var5 = param0.field_i;
            var6 = param0.field_a;
            if (!param1) {
              break L1;
            } else {
              if (param0.field_h != null) {
                break L1;
              } else {
                var30 = new int[var28.length];
                var26 = var30;
                var22 = var26;
                var18 = var22;
                var8 = var18;
                var29 = new byte[var5 * var6];
                var25 = var29;
                var21 = var25;
                var17 = var21;
                var14 = var17;
                var9 = var14;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var6) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var28.length) {
                        var7 = (raa) (Object) new kf((sfa) this, var29, var30, var5, var6);
                        break L0;
                      } else {
                        var8[var10] = var28[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var11 = var10 * var5;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var5) {
                        var10++;
                        continue L2;
                      } else {
                        var14[var11 + var12] = var4[var11 + var12];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          var31 = new int[var5 * var6];
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var15 = var19;
          var9 = param0.field_h;
          if (var9 == null) {
            var10 = 0;
            L5: while (true) {
              if (var10 >= var6) {
                var7 = new raa((sfa) this, var31, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L5;
                  } else {
                    L7: {
                      var13 = var3[var4[var11 + var12] & 255];
                      stackOut_24_0 = (int[]) var15;
                      stackOut_24_1 = var11 + var12;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var13 == 0) {
                        stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        break L7;
                      } else {
                        stackOut_25_0 = (int[]) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -16777216 | var13;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      }
                    }
                    stackIn_27_0[stackIn_27_1] = stackIn_27_2;
                    var12++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var10 = 0;
            L8: while (true) {
              if (var10 >= var6) {
                var7 = (raa) (Object) new vqa((sfa) this, var31, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L8;
                  } else {
                    var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
        ((nh) (Object) var7).b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
        return (nh) (Object) var7;
    }

    private sfa(d param0) {
        super(param0);
        ((sfa) this).field_E = false;
        ((sfa) this).field_z = false;
        ((sfa) this).field_G = new ji(4);
        ((sfa) this).field_g = 50;
        ((sfa) this).field_f = 75518;
        ((sfa) this).field_Q = 512;
        ((sfa) this).field_d = 0;
        ((sfa) this).field_I = 128;
        ((sfa) this).field_J = 0;
        ((sfa) this).field_M = 78642;
        ((sfa) this).field_W = 0;
        ((sfa) this).field_q = 45823;
        ((sfa) this).field_P = 0;
        ((sfa) this).field_e = false;
        ((sfa) this).field_U = 3500;
        ((sfa) this).field_C = 512;
        ((sfa) this).field_X = new dd(16);
        ((sfa) this).field_v = -1;
        try {
            ((sfa) this).field_F = new dd(256);
            ((sfa) this).field_A = new pna();
            this.i(1);
            this.g(0);
            ija.a(true, (byte) 100, true);
            ((sfa) this).field_E = true;
            ((sfa) this).field_j = (int)bva.b((byte) -107);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            ((sfa) this).a(true);
            throw new RuntimeException("");
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        L0: {
          var10 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param0 + ((sfa) this).field_A.field_o * (float)param1 + ((sfa) this).field_A.field_f * (float)param2);
          var11 = ((sfa) this).field_A.field_m + (((sfa) this).field_A.field_r * (float)param3 + ((sfa) this).field_A.field_o * (float)param4 + ((sfa) this).field_A.field_f * (float)param5);
          if (var10 >= (float)((sfa) this).field_g) {
            break L0;
          } else {
            if (var11 >= (float)((sfa) this).field_g) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var12 = ((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param0 + ((sfa) this).field_A.field_i * (float)param1 + ((sfa) this).field_A.field_n * (float)param2);
          var13 = ((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param0 + ((sfa) this).field_A.field_s * (float)param1 + ((sfa) this).field_A.field_j * (float)param2);
          var14 = ((sfa) this).field_A.field_l + (((sfa) this).field_A.field_g * (float)param3 + ((sfa) this).field_A.field_i * (float)param4 + ((sfa) this).field_A.field_n * (float)param5);
          var15 = ((sfa) this).field_A.field_e + (((sfa) this).field_A.field_h * (float)param3 + ((sfa) this).field_A.field_s * (float)param4 + ((sfa) this).field_A.field_j * (float)param5);
          if (var10 >= (float)((sfa) this).field_g) {
            break L1;
          } else {
            var16 = ((float)((sfa) this).field_g - var11) / (var10 - var11);
            var12 = var14 + (var12 - var14) * var16;
            var13 = var15 + (var13 - var15) * var16;
            var10 = (float)((sfa) this).field_g;
            break L1;
          }
        }
        L2: {
          if (var11 >= (float)((sfa) this).field_g) {
            break L2;
          } else {
            var16 = ((float)((sfa) this).field_g - var10) / (var11 - var10);
            var14 = var12 + (var14 - var12) * var16;
            var15 = var13 + (var15 - var13) * var16;
            var11 = (float)((sfa) this).field_g;
            break L2;
          }
        }
        ((sfa) this).a(((sfa) this).field_L + (int)((float)((sfa) this).field_Q * var12 / (float)param6), ((sfa) this).field_w + (int)((float)((sfa) this).field_C * var13 / (float)param6), ((sfa) this).field_L + (int)((float)((sfa) this).field_Q * var14 / (float)param6), ((sfa) this).field_w + (int)((float)((sfa) this).field_C * var15 / (float)param6), param7, param8);
    }

    final int[] Y() {
        return new int[]{((sfa) this).field_L, ((sfa) this).field_w, ((sfa) this).field_Q, ((sfa) this).field_C};
    }

    final void K(int[] param0) {
        param0[0] = ((sfa) this).field_J;
        param0[1] = ((sfa) this).field_d;
        param0[2] = ((sfa) this).field_W;
        param0[3] = ((sfa) this).field_P;
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        ((sfa) this).field_q = (int)(param1 * 65535.0f);
        ((sfa) this).field_M = (int)(param2 * 65535.0f);
        float var7 = (float)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        ((sfa) this).field_x = (int)(param3 * 65535.0f / var7);
        ((sfa) this).field_V = (int)(param4 * 65535.0f / var7);
        ((sfa) this).field_S = (int)(param5 * 65535.0f / var7);
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          if (param1 < ((sfa) this).field_d) {
            break L0;
          } else {
            if (param1 < ((sfa) this).field_P) {
              L1: {
                if (param0 >= ((sfa) this).field_J) {
                  break L1;
                } else {
                  param2 = param2 - (((sfa) this).field_J - param0);
                  param0 = ((sfa) this).field_J;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= ((sfa) this).field_W) {
                  break L2;
                } else {
                  param2 = ((sfa) this).field_W - param0;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * ((sfa) this).field_K;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = ((sfa) this).field_r[var6 + var8];
                            var10 = param3 + var9;
                            var11 = (param3 & 16711935) + (var9 & 16711935);
                            var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                            ((sfa) this).field_r[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = ((sfa) this).field_r[var6 + var9];
                          var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                          ((sfa) this).field_r[var6 + var9] = param3 + var10;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  ((sfa) this).field_r[var6 + var8] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final int XA() {
        return ((sfa) this).field_U;
    }

    private final void g() {
        int var1 = 0;
        iua var2_ref = null;
        int var2 = 0;
        int var3 = 0;
        ((sfa) this).field_p = ((sfa) this).field_J - ((sfa) this).field_L;
        ((sfa) this).field_l = ((sfa) this).field_W - ((sfa) this).field_L;
        ((sfa) this).field_k = ((sfa) this).field_d - ((sfa) this).field_w;
        ((sfa) this).field_o = ((sfa) this).field_P - ((sfa) this).field_w;
        for (var1 = 0; var1 < ((sfa) this).field_u; var1++) {
            var2_ref = ((sfa) this).field_Y[var1].field_v;
            var2_ref.field_e = ((sfa) this).field_L - ((sfa) this).field_J;
            var2_ref.field_n = ((sfa) this).field_w - ((sfa) this).field_d;
            var2_ref.field_h = ((sfa) this).field_W - ((sfa) this).field_J;
            var2_ref.field_v = ((sfa) this).field_P - ((sfa) this).field_d;
        }
        var1 = ((sfa) this).field_d * ((sfa) this).field_K + ((sfa) this).field_J;
        for (var2 = ((sfa) this).field_d; var2 < ((sfa) this).field_P; var2++) {
            for (var3 = 0; var3 < ((sfa) this).field_u; var3++) {
                ((sfa) this).field_Y[var3].field_v.field_p[var2 - ((sfa) this).field_d] = var1;
            }
            var1 = var1 + ((sfa) this).field_K;
        }
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) (Object) new sn((sfa) this, param0, param1, var4, var5);
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new le((sfa) this, param0, param1, var4, var5);
              } else {
                return (da) (Object) new nu((sfa) this, param0, param1, var4, var5);
              }
            }
          } else {
            var4[var7] = param1[var7].field_i;
            var5[var7] = param1[var7].field_a;
            if (param1[var7].field_h != null) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * ((sfa) this).field_K + param0;
            for (var10 = 0; var10 < param2; var10++) {
                param5++;
                ((sfa) this).field_r[var9 + var10] = param4[param5];
            }
            param5 = param5 + param6;
        }
    }

    final void a() {
    }

    private final void a(java.awt.Canvas param0) {
        java.awt.Dimension var3 = null;
        ija var2 = null;
        if (param0 != null) {
            var2 = (ija) (Object) ((sfa) this).field_G.a((byte) -116, (long)((Object) (Object) param0).hashCode());
            // ifnull L233
            ((sfa) this).field_t = param0;
            var3 = param0.getSize();
            ((sfa) this).field_m = var3.width;
            ((sfa) this).field_O = var3.height;
            ((sfa) this).field_T = var2;
            // ifnonnull L233
            ((sfa) this).field_r = var2.field_g;
            ((sfa) this).field_K = var2.field_h;
            ((sfa) this).field_h = var2.field_f;
            if (((sfa) this).field_K == ((sfa) this).field_y) {
                // if_icmpeq L177
            }
            ((sfa) this).field_y = ((sfa) this).field_K;
            ((sfa) this).field_i = ((sfa) this).field_K;
            ((sfa) this).field_s = ((sfa) this).field_h;
            ((sfa) this).field_B = ((sfa) this).field_h;
            ((sfa) this).field_n = new float[((sfa) this).field_y * ((sfa) this).field_s];
            ((sfa) this).field_H = new float[((sfa) this).field_y * ((sfa) this).field_s];
            this.m();
        } else {
            ((sfa) this).field_t = null;
            ((sfa) this).field_T = null;
            if (((sfa) this).field_D == null) {
                ((sfa) this).field_r = null;
                ((sfa) this).field_h = 1;
                ((sfa) this).field_K = 1;
                ((sfa) this).field_s = 1;
                ((sfa) this).field_y = 1;
                this.m();
            }
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            if (((sfa) this).field_W <= ((sfa) this).field_J) {
              break L1;
            } else {
              if (((sfa) this).field_P > ((sfa) this).field_d) {
                if (param0 + param2 < ((sfa) this).field_J) {
                  break L1;
                } else {
                  L2: {
                    if (param0 - param2 >= ((sfa) this).field_W) {
                      break L2;
                    } else {
                      if (param1 + param2 < ((sfa) this).field_d) {
                        break L2;
                      } else {
                        if (param1 - param2 < ((sfa) this).field_P) {
                          L3: {
                            L4: {
                              var6 = param0 + param1 * ((sfa) this).field_K;
                              var7 = var6;
                              var8 = var6 - param2 * ((sfa) this).field_K;
                              var9 = var6 + param2 * ((sfa) this).field_K;
                              var10 = param2;
                              var11 = 0;
                              param2 = param2 * param2;
                              var12 = param2 - var10;
                              var13 = param3 >>> 24;
                              if (param4 == 0) {
                                break L4;
                              } else {
                                L5: {
                                  if (param4 != 1) {
                                    break L5;
                                  } else {
                                    if (var13 != 255) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                if (param4 != 1) {
                                  if (param4 != 2) {
                                    return;
                                  } else {
                                    L6: {
                                      if (param0 - var10 < ((sfa) this).field_J) {
                                        break L6;
                                      } else {
                                        if (param0 + var10 >= ((sfa) this).field_W) {
                                          break L6;
                                        } else {
                                          if (param1 - var10 < ((sfa) this).field_d) {
                                            break L6;
                                          } else {
                                            if (param1 + var10 < ((sfa) this).field_P) {
                                              var14 = var6 - var10;
                                              var15 = param3;
                                              var16 = ((sfa) this).field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var6 + var10;
                                              var15 = param3;
                                              var16 = ((sfa) this).field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var8;
                                              var15 = param3;
                                              var16 = ((sfa) this).field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var9;
                                              var15 = param3;
                                              var16 = ((sfa) this).field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              L7: while (true) {
                                                L8: {
                                                  var11++;
                                                  var12 = var12 + (var11 + var11);
                                                  var6 = var6 - ((sfa) this).field_K;
                                                  var7 = var7 + ((sfa) this).field_K;
                                                  if (var12 <= param2) {
                                                    break L8;
                                                  } else {
                                                    var10--;
                                                    var12 = var12 - (var10 + var10);
                                                    var8 = var8 + ((sfa) this).field_K;
                                                    var9 = var9 - ((sfa) this).field_K;
                                                    break L8;
                                                  }
                                                }
                                                if (var10 >= var11) {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 + var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  continue L7;
                                                } else {
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (param0 - var10 < ((sfa) this).field_J) {
                                        break L9;
                                      } else {
                                        if (param1 < ((sfa) this).field_d) {
                                          break L9;
                                        } else {
                                          if (param1 >= ((sfa) this).field_P) {
                                            break L9;
                                          } else {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = ((sfa) this).field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (param0 + var10 >= ((sfa) this).field_W) {
                                        break L10;
                                      } else {
                                        if (param1 < ((sfa) this).field_d) {
                                          break L10;
                                        } else {
                                          if (param1 >= ((sfa) this).field_P) {
                                            break L10;
                                          } else {
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = ((sfa) this).field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (param1 - var10 < ((sfa) this).field_d) {
                                        break L11;
                                      } else {
                                        if (param0 < ((sfa) this).field_J) {
                                          break L11;
                                        } else {
                                          if (param0 >= ((sfa) this).field_W) {
                                            break L11;
                                          } else {
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = ((sfa) this).field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    L12: {
                                      if (param1 + var10 >= ((sfa) this).field_P) {
                                        break L12;
                                      } else {
                                        if (param0 < ((sfa) this).field_J) {
                                          break L12;
                                        } else {
                                          if (param0 >= ((sfa) this).field_W) {
                                            break L12;
                                          } else {
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = ((sfa) this).field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L13: while (true) {
                                      L14: {
                                        var11++;
                                        var12 = var12 + (var11 + var11);
                                        var6 = var6 - ((sfa) this).field_K;
                                        var7 = var7 + ((sfa) this).field_K;
                                        if (var12 <= param2) {
                                          break L14;
                                        } else {
                                          var10--;
                                          var12 = var12 - (var10 + var10);
                                          var8 = var8 + ((sfa) this).field_K;
                                          var9 = var9 - ((sfa) this).field_K;
                                          break L14;
                                        }
                                      }
                                      if (var10 >= var11) {
                                        L15: {
                                          if (param1 - var10 < ((sfa) this).field_d) {
                                            break L15;
                                          } else {
                                            if (param1 - var10 >= ((sfa) this).field_P) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if (param0 - var11 < ((sfa) this).field_J) {
                                                  break L16;
                                                } else {
                                                  if (param0 - var11 >= ((sfa) this).field_W) {
                                                    break L16;
                                                  } else {
                                                    var14 = var8 - var11;
                                                    var15 = param3;
                                                    var16 = ((sfa) this).field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (param0 + var11 < ((sfa) this).field_J) {
                                                break L15;
                                              } else {
                                                if (param0 + var11 >= ((sfa) this).field_W) {
                                                  break L15;
                                                } else {
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L17: {
                                          if (param1 - var11 < ((sfa) this).field_d) {
                                            break L17;
                                          } else {
                                            if (param1 - var11 >= ((sfa) this).field_P) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (param0 - var10 < ((sfa) this).field_J) {
                                                  break L18;
                                                } else {
                                                  if (param0 - var10 >= ((sfa) this).field_W) {
                                                    break L18;
                                                  } else {
                                                    var14 = var6 - var10;
                                                    var15 = param3;
                                                    var16 = ((sfa) this).field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L18;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < ((sfa) this).field_J) {
                                                break L17;
                                              } else {
                                                if (param0 + var10 >= ((sfa) this).field_W) {
                                                  break L17;
                                                } else {
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          if (param1 + var11 < ((sfa) this).field_d) {
                                            break L19;
                                          } else {
                                            if (param1 + var11 >= ((sfa) this).field_P) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (param0 - var10 < ((sfa) this).field_J) {
                                                  break L20;
                                                } else {
                                                  if (param0 - var10 >= ((sfa) this).field_W) {
                                                    break L20;
                                                  } else {
                                                    var14 = var7 - var10;
                                                    var15 = param3;
                                                    var16 = ((sfa) this).field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L20;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < ((sfa) this).field_J) {
                                                break L19;
                                              } else {
                                                if (param0 + var10 >= ((sfa) this).field_W) {
                                                  break L19;
                                                } else {
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (param1 + var10 < ((sfa) this).field_d) {
                                          continue L13;
                                        } else {
                                          if (param1 + var10 >= ((sfa) this).field_P) {
                                            continue L13;
                                          } else {
                                            L21: {
                                              if (param0 - var11 < ((sfa) this).field_J) {
                                                break L21;
                                              } else {
                                                if (param0 - var11 >= ((sfa) this).field_W) {
                                                  break L21;
                                                } else {
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = ((sfa) this).field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < ((sfa) this).field_J) {
                                              continue L13;
                                            } else {
                                              if (param0 + var11 >= ((sfa) this).field_W) {
                                                continue L13;
                                              } else {
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = ((sfa) this).field_r[var14];
                                                var17 = var15 + var16;
                                                var18 = (var15 & 16711935) + (var16 & 16711935);
                                                var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                ((sfa) this).field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  L22: {
                                    if (param0 - var10 < ((sfa) this).field_J) {
                                      break L22;
                                    } else {
                                      if (param0 + var10 >= ((sfa) this).field_W) {
                                        break L22;
                                      } else {
                                        if (param1 - var10 < ((sfa) this).field_d) {
                                          break L22;
                                        } else {
                                          if (param1 + var10 < ((sfa) this).field_P) {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((sfa) this).field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((sfa) this).field_r[var14] = var15 + var18;
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((sfa) this).field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((sfa) this).field_r[var14] = var15 + var18;
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((sfa) this).field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((sfa) this).field_r[var14] = var15 + var18;
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((sfa) this).field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((sfa) this).field_r[var14] = var15 + var18;
                                            L23: while (true) {
                                              L24: {
                                                var11++;
                                                var12 = var12 + (var11 + var11);
                                                var6 = var6 - ((sfa) this).field_K;
                                                var7 = var7 + ((sfa) this).field_K;
                                                if (var12 <= param2) {
                                                  break L24;
                                                } else {
                                                  var10--;
                                                  var12 = var12 - (var10 + var10);
                                                  var8 = var8 + ((sfa) this).field_K;
                                                  var9 = var9 - ((sfa) this).field_K;
                                                  break L24;
                                                }
                                              }
                                              if (var10 >= var11) {
                                                var14 = var8 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var6 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var7 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                continue L23;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L25: {
                                    if (param0 - var10 < ((sfa) this).field_J) {
                                      break L25;
                                    } else {
                                      if (param1 < ((sfa) this).field_d) {
                                        break L25;
                                      } else {
                                        if (param1 >= ((sfa) this).field_P) {
                                          break L25;
                                        } else {
                                          var14 = var6 - var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((sfa) this).field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((sfa) this).field_r[var14] = var15 + var18;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (param0 + var10 >= ((sfa) this).field_W) {
                                      break L26;
                                    } else {
                                      if (param1 < ((sfa) this).field_d) {
                                        break L26;
                                      } else {
                                        if (param1 >= ((sfa) this).field_P) {
                                          break L26;
                                        } else {
                                          var14 = var6 + var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((sfa) this).field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((sfa) this).field_r[var14] = var15 + var18;
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L27: {
                                    if (param1 - var10 < ((sfa) this).field_d) {
                                      break L27;
                                    } else {
                                      if (param0 < ((sfa) this).field_J) {
                                        break L27;
                                      } else {
                                        if (param0 >= ((sfa) this).field_W) {
                                          break L27;
                                        } else {
                                          var14 = var8;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((sfa) this).field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((sfa) this).field_r[var14] = var15 + var18;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (param1 + var10 >= ((sfa) this).field_P) {
                                      break L28;
                                    } else {
                                      if (param0 < ((sfa) this).field_J) {
                                        break L28;
                                      } else {
                                        if (param0 >= ((sfa) this).field_W) {
                                          break L28;
                                        } else {
                                          var14 = var9;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((sfa) this).field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((sfa) this).field_r[var14] = var15 + var18;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  L29: while (true) {
                                    L30: {
                                      var11++;
                                      var12 = var12 + (var11 + var11);
                                      var6 = var6 - ((sfa) this).field_K;
                                      var7 = var7 + ((sfa) this).field_K;
                                      if (var12 <= param2) {
                                        break L30;
                                      } else {
                                        var10--;
                                        var12 = var12 - (var10 + var10);
                                        var8 = var8 + ((sfa) this).field_K;
                                        var9 = var9 - ((sfa) this).field_K;
                                        break L30;
                                      }
                                    }
                                    if (var10 >= var11) {
                                      L31: {
                                        if (param1 - var10 < ((sfa) this).field_d) {
                                          break L31;
                                        } else {
                                          if (param1 - var10 >= ((sfa) this).field_P) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (param0 - var11 < ((sfa) this).field_J) {
                                                break L32;
                                              } else {
                                                if (param0 - var11 >= ((sfa) this).field_W) {
                                                  break L32;
                                                } else {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((sfa) this).field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((sfa) this).field_r[var14] = var15 + var18;
                                                  break L32;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < ((sfa) this).field_J) {
                                              break L31;
                                            } else {
                                              if (param0 + var11 >= ((sfa) this).field_W) {
                                                break L31;
                                              } else {
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L33: {
                                        if (param1 - var11 < ((sfa) this).field_d) {
                                          break L33;
                                        } else {
                                          if (param1 - var11 >= ((sfa) this).field_P) {
                                            break L33;
                                          } else {
                                            L34: {
                                              if (param0 - var10 < ((sfa) this).field_J) {
                                                break L34;
                                              } else {
                                                if (param0 - var10 >= ((sfa) this).field_W) {
                                                  break L34;
                                                } else {
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((sfa) this).field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((sfa) this).field_r[var14] = var15 + var18;
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < ((sfa) this).field_J) {
                                              break L33;
                                            } else {
                                              if (param0 + var10 >= ((sfa) this).field_W) {
                                                break L33;
                                              } else {
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L35: {
                                        if (param1 + var11 < ((sfa) this).field_d) {
                                          break L35;
                                        } else {
                                          if (param1 + var11 >= ((sfa) this).field_P) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (param0 - var10 < ((sfa) this).field_J) {
                                                break L36;
                                              } else {
                                                if (param0 - var10 >= ((sfa) this).field_W) {
                                                  break L36;
                                                } else {
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((sfa) this).field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((sfa) this).field_r[var14] = var15 + var18;
                                                  break L36;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < ((sfa) this).field_J) {
                                              break L35;
                                            } else {
                                              if (param0 + var10 >= ((sfa) this).field_W) {
                                                break L35;
                                              } else {
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (param1 + var10 < ((sfa) this).field_d) {
                                        continue L29;
                                      } else {
                                        if (param1 + var10 >= ((sfa) this).field_P) {
                                          continue L29;
                                        } else {
                                          L37: {
                                            if (param0 - var11 < ((sfa) this).field_J) {
                                              break L37;
                                            } else {
                                              if (param0 - var11 >= ((sfa) this).field_W) {
                                                break L37;
                                              } else {
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((sfa) this).field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((sfa) this).field_r[var14] = var15 + var18;
                                                break L37;
                                              }
                                            }
                                          }
                                          if (param0 + var11 < ((sfa) this).field_J) {
                                            continue L29;
                                          } else {
                                            if (param0 + var11 >= ((sfa) this).field_W) {
                                              continue L29;
                                            } else {
                                              var14 = var9 + var11;
                                              var15 = param3;
                                              var16 = var13;
                                              var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                              var17 = 256 - var16;
                                              var18 = ((sfa) this).field_r[var14];
                                              var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                              ((sfa) this).field_r[var14] = var15 + var18;
                                              continue L29;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                            L38: {
                              if (param0 - var10 >= ((sfa) this).field_J) {
                                if (param0 - var10 >= ((sfa) this).field_J) {
                                  if (param1 < ((sfa) this).field_d) {
                                    break L38;
                                  } else {
                                    if (param1 >= ((sfa) this).field_P) {
                                      break L38;
                                    } else {
                                      ((sfa) this).field_r[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < ((sfa) this).field_J) {
                                    break L38;
                                  } else {
                                    if (param1 < ((sfa) this).field_d) {
                                      break L38;
                                    } else {
                                      if (param1 >= ((sfa) this).field_P) {
                                        break L38;
                                      } else {
                                        ((sfa) this).field_r[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 - var10 >= ((sfa) this).field_J) {
                                  if (param1 < ((sfa) this).field_d) {
                                    break L38;
                                  } else {
                                    if (param1 >= ((sfa) this).field_P) {
                                      break L38;
                                    } else {
                                      ((sfa) this).field_r[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < ((sfa) this).field_J) {
                                    break L38;
                                  } else {
                                    if (param1 < ((sfa) this).field_d) {
                                      break L38;
                                    } else {
                                      if (param1 >= ((sfa) this).field_P) {
                                        break L38;
                                      } else {
                                        ((sfa) this).field_r[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L39: {
                              if (param0 + var10 < ((sfa) this).field_W) {
                                if (param1 >= ((sfa) this).field_d) {
                                  if (param1 < ((sfa) this).field_P) {
                                    ((sfa) this).field_r[var6 + var10] = param3;
                                    if (param1 - var10 < ((sfa) this).field_d) {
                                      break L39;
                                    } else {
                                      if (param0 < ((sfa) this).field_J) {
                                        break L39;
                                      } else {
                                        if (param0 >= ((sfa) this).field_W) {
                                          break L39;
                                        } else {
                                          ((sfa) this).field_r[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1 - var10 < ((sfa) this).field_d) {
                                      break L39;
                                    } else {
                                      if (param0 < ((sfa) this).field_J) {
                                        break L39;
                                      } else {
                                        if (param0 >= ((sfa) this).field_W) {
                                          break L39;
                                        } else {
                                          ((sfa) this).field_r[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param1 - var10 < ((sfa) this).field_d) {
                                    break L39;
                                  } else {
                                    if (param0 < ((sfa) this).field_J) {
                                      break L39;
                                    } else {
                                      if (param0 >= ((sfa) this).field_W) {
                                        break L39;
                                      } else {
                                        ((sfa) this).field_r[var8] = param3;
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param1 - var10 < ((sfa) this).field_d) {
                                  break L39;
                                } else {
                                  if (param0 < ((sfa) this).field_J) {
                                    break L39;
                                  } else {
                                    if (param0 >= ((sfa) this).field_W) {
                                      break L39;
                                    } else {
                                      ((sfa) this).field_r[var8] = param3;
                                      break L39;
                                    }
                                  }
                                }
                              }
                            }
                            L40: {
                              if (param1 + var10 >= ((sfa) this).field_P) {
                                break L40;
                              } else {
                                if (param0 < ((sfa) this).field_J) {
                                  break L40;
                                } else {
                                  if (param0 >= ((sfa) this).field_W) {
                                    break L40;
                                  } else {
                                    ((sfa) this).field_r[var9] = param3;
                                    break L40;
                                  }
                                }
                              }
                            }
                            L41: while (true) {
                              L42: {
                                var11++;
                                var12 = var12 + (var11 + var11);
                                var6 = var6 - ((sfa) this).field_K;
                                var7 = var7 + ((sfa) this).field_K;
                                if (var12 <= param2) {
                                  break L42;
                                } else {
                                  var10--;
                                  var12 = var12 - (var10 + var10);
                                  var8 = var8 + ((sfa) this).field_K;
                                  var9 = var9 - ((sfa) this).field_K;
                                  break L42;
                                }
                              }
                              if (var10 >= var11) {
                                L43: {
                                  if (param1 - var10 < ((sfa) this).field_d) {
                                    break L43;
                                  } else {
                                    if (param1 - var10 >= ((sfa) this).field_P) {
                                      break L43;
                                    } else {
                                      if (param0 - var11 < ((sfa) this).field_J) {
                                        if (param0 + var11 >= ((sfa) this).field_J) {
                                          if (param0 + var11 >= ((sfa) this).field_W) {
                                            break L43;
                                          } else {
                                            ((sfa) this).field_r[var8 + var11] = param3;
                                            break L43;
                                          }
                                        } else {
                                          if (param0 + var11 < ((sfa) this).field_J) {
                                            break L43;
                                          } else {
                                            if (param0 + var11 >= ((sfa) this).field_W) {
                                              break L43;
                                            } else {
                                              ((sfa) this).field_r[var8 + var11] = param3;
                                              break L43;
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 + var11 < ((sfa) this).field_J) {
                                          break L43;
                                        } else {
                                          if (param0 + var11 >= ((sfa) this).field_W) {
                                            break L43;
                                          } else {
                                            ((sfa) this).field_r[var8 + var11] = param3;
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L44: {
                                  if (param1 - var11 < ((sfa) this).field_d) {
                                    break L44;
                                  } else {
                                    if (param1 - var11 >= ((sfa) this).field_P) {
                                      break L44;
                                    } else {
                                      L45: {
                                        if (param0 - var10 < ((sfa) this).field_J) {
                                          break L45;
                                        } else {
                                          if (param0 - var10 >= ((sfa) this).field_W) {
                                            break L45;
                                          } else {
                                            ((sfa) this).field_r[var6 - var10] = param3;
                                            break L45;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < ((sfa) this).field_J) {
                                        break L44;
                                      } else {
                                        if (param0 + var10 >= ((sfa) this).field_W) {
                                          break L44;
                                        } else {
                                          ((sfa) this).field_r[var6 + var10] = param3;
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 + var11 < ((sfa) this).field_d) {
                                    break L46;
                                  } else {
                                    if (param1 + var11 >= ((sfa) this).field_P) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (param0 - var10 < ((sfa) this).field_J) {
                                          break L47;
                                        } else {
                                          if (param0 - var10 >= ((sfa) this).field_W) {
                                            break L47;
                                          } else {
                                            ((sfa) this).field_r[var7 - var10] = param3;
                                            break L47;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < ((sfa) this).field_J) {
                                        break L46;
                                      } else {
                                        if (param0 + var10 >= ((sfa) this).field_W) {
                                          break L46;
                                        } else {
                                          ((sfa) this).field_r[var7 + var10] = param3;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var10 < ((sfa) this).field_d) {
                                  continue L41;
                                } else {
                                  if (param1 + var10 >= ((sfa) this).field_P) {
                                    continue L41;
                                  } else {
                                    L48: {
                                      if (param0 - var11 < ((sfa) this).field_J) {
                                        break L48;
                                      } else {
                                        if (param0 - var11 >= ((sfa) this).field_W) {
                                          break L48;
                                        } else {
                                          ((sfa) this).field_r[var9 - var11] = param3;
                                          break L48;
                                        }
                                      }
                                    }
                                    if (param0 + var11 < ((sfa) this).field_J) {
                                      continue L41;
                                    } else {
                                      if (param0 + var11 >= ((sfa) this).field_W) {
                                        continue L41;
                                      } else {
                                        ((sfa) this).field_r[var9 + var11] = param3;
                                        continue L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L49: {
            if (param0 < ((sfa) this).field_J) {
              break L49;
            } else {
              L50: {
                if (param1 < ((sfa) this).field_d) {
                  break L50;
                } else {
                  if (param0 >= ((sfa) this).field_W) {
                    break L50;
                  } else {
                    if (param1 < ((sfa) this).field_P) {
                      L51: {
                        L52: {
                          var6 = param3 >>> 24;
                          var7 = param0 + param1 * ((sfa) this).field_K;
                          if (param4 == 0) {
                            break L52;
                          } else {
                            L53: {
                              if (param4 != 1) {
                                break L53;
                              } else {
                                if (var6 != 255) {
                                  break L53;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            if (param4 != 1) {
                              if (param4 != 2) {
                                break L49;
                              } else {
                                var8 = var7;
                                var9 = param3;
                                var10 = ((sfa) this).field_r[var8];
                                var11 = var9 + var10;
                                var12 = (var9 & 16711935) + (var10 & 16711935);
                                var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                                ((sfa) this).field_r[var8] = var11 - var10 | var10 - (var10 >>> 8);
                                break L51;
                              }
                            } else {
                              var8 = var7;
                              var9 = param3;
                              var10 = var6;
                              var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                              var11 = 256 - var10;
                              var12 = ((sfa) this).field_r[var8];
                              var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                              ((sfa) this).field_r[var8] = var9 + var12;
                              break L51;
                            }
                          }
                        }
                        ((sfa) this).field_r[var7] = param3;
                        break L51;
                      }
                      return;
                    } else {
                      break L50;
                    }
                  }
                }
              }
              return;
            }
          }
          return;
        }
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          if (param2 >= 0) {
            break L0;
          } else {
            param2 = -param2;
            break L0;
          }
        }
        L1: {
          var6 = param1 - param2;
          if (var6 >= ((sfa) this).field_d) {
            break L1;
          } else {
            var6 = ((sfa) this).field_d;
            break L1;
          }
        }
        L2: {
          var7 = param1 + param2 + 1;
          if (var7 <= ((sfa) this).field_P) {
            break L2;
          } else {
            var7 = ((sfa) this).field_P;
            break L2;
          }
        }
        L3: {
          var8 = var6;
          var9 = param2 * param2;
          var10 = 0;
          var11 = param1 - var8;
          var12 = var11 * var11;
          var13 = var12 - var11;
          if (param1 <= var7) {
            break L3;
          } else {
            param1 = var7;
            break L3;
          }
        }
        L4: {
          var14 = param3 >>> 24;
          if (param4 == 0) {
            break L4;
          } else {
            L5: {
              if (param4 != 1) {
                break L5;
              } else {
                if (var14 != 255) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (param4 != 1) {
                if (param4 != 2) {
                  throw new IllegalArgumentException();
                } else {
                  L7: while (true) {
                    if (var8 >= param1) {
                      var10 = param2;
                      var11 = -var11;
                      var13 = var11 * var11 + var9;
                      var12 = var13 - var10;
                      var13 = var13 - var11;
                      L8: while (true) {
                        if (var8 >= var7) {
                          break L6;
                        } else {
                          L9: while (true) {
                            L10: {
                              if (var13 <= var9) {
                                break L10;
                              } else {
                                if (var12 <= var9) {
                                  break L10;
                                } else {
                                  var10--;
                                  var13 = var13 - (var10 + var10);
                                  var12 = var12 - (var10 + var10);
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var15 = param0 - var10;
                              if (var15 >= ((sfa) this).field_J) {
                                break L11;
                              } else {
                                var15 = ((sfa) this).field_J;
                                break L11;
                              }
                            }
                            L12: {
                              var16 = param0 + var10;
                              if (var16 <= ((sfa) this).field_W - 1) {
                                break L12;
                              } else {
                                var16 = ((sfa) this).field_W - 1;
                                break L12;
                              }
                            }
                            var17 = var15 + var8 * ((sfa) this).field_K;
                            var18 = var15;
                            L13: while (true) {
                              if (var18 > var16) {
                                var8++;
                                var13 = var13 + (var11 + var11);
                                var11++;
                                var12 = var12 + (var11 + var11);
                                continue L8;
                              } else {
                                var19 = ((sfa) this).field_r[var17];
                                var20 = param3 + var19;
                                var21 = (param3 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var17++;
                                ((sfa) this).field_r[var17] = var20 - var19 | var19 - (var19 >>> 8);
                                var18++;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L14: while (true) {
                        L15: {
                          if (var13 <= var9) {
                            break L15;
                          } else {
                            if (var12 > var9) {
                              L16: {
                                var15 = param0 - var10 + 1;
                                if (var15 >= ((sfa) this).field_J) {
                                  break L16;
                                } else {
                                  var15 = ((sfa) this).field_J;
                                  break L16;
                                }
                              }
                              L17: {
                                var16 = param0 + var10;
                                if (var16 <= ((sfa) this).field_W) {
                                  break L17;
                                } else {
                                  var16 = ((sfa) this).field_W;
                                  break L17;
                                }
                              }
                              var17 = var15 + var8 * ((sfa) this).field_K;
                              var18 = var15;
                              L18: while (true) {
                                if (var18 >= var16) {
                                  var8++;
                                  var11--;
                                  var12 = var12 - (var11 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L7;
                                } else {
                                  var19 = ((sfa) this).field_r[var17];
                                  var20 = param3 + var19;
                                  var21 = (param3 & 16711935) + (var19 & 16711935);
                                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                  var17++;
                                  ((sfa) this).field_r[var17] = var20 - var19 | var19 - (var19 >>> 8);
                                  var18++;
                                  continue L18;
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var12 = var12 + (var10 + var10);
                        var10++;
                        var13 = var13 + (var10 + var10);
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                param3 = ((param3 & 16711935) * var14 >> 8 & 16711935) + ((param3 & 65280) * var14 >> 8 & 65280) + (var14 << 24);
                var15 = 256 - var14;
                L19: while (true) {
                  if (var8 >= param1) {
                    var10 = param2;
                    var11 = -var11;
                    var13 = var11 * var11 + var9;
                    var12 = var13 - var10;
                    var13 = var13 - var11;
                    L20: while (true) {
                      if (var8 >= var7) {
                        break L6;
                      } else {
                        L21: while (true) {
                          L22: {
                            if (var13 <= var9) {
                              break L22;
                            } else {
                              if (var12 <= var9) {
                                break L22;
                              } else {
                                var10--;
                                var13 = var13 - (var10 + var10);
                                var12 = var12 - (var10 + var10);
                                continue L21;
                              }
                            }
                          }
                          L23: {
                            var16 = param0 - var10;
                            if (var16 >= ((sfa) this).field_J) {
                              break L23;
                            } else {
                              var16 = ((sfa) this).field_J;
                              break L23;
                            }
                          }
                          L24: {
                            var17 = param0 + var10;
                            if (var17 <= ((sfa) this).field_W - 1) {
                              break L24;
                            } else {
                              var17 = ((sfa) this).field_W - 1;
                              break L24;
                            }
                          }
                          var18 = var16 + var8 * ((sfa) this).field_K;
                          var19 = var16;
                          L25: while (true) {
                            if (var19 > var17) {
                              var8++;
                              var13 = var13 + (var11 + var11);
                              var11++;
                              var12 = var12 + (var11 + var11);
                              continue L20;
                            } else {
                              var20 = ((sfa) this).field_r[var18];
                              var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                              var18++;
                              ((sfa) this).field_r[var18] = param3 + var20;
                              var19++;
                              continue L25;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L26: while (true) {
                      L27: {
                        if (var13 <= var9) {
                          break L27;
                        } else {
                          if (var12 > var9) {
                            L28: {
                              var16 = param0 - var10 + 1;
                              if (var16 >= ((sfa) this).field_J) {
                                break L28;
                              } else {
                                var16 = ((sfa) this).field_J;
                                break L28;
                              }
                            }
                            L29: {
                              var17 = param0 + var10;
                              if (var17 <= ((sfa) this).field_W) {
                                break L29;
                              } else {
                                var17 = ((sfa) this).field_W;
                                break L29;
                              }
                            }
                            var18 = var16 + var8 * ((sfa) this).field_K;
                            var19 = var16;
                            L30: while (true) {
                              if (var19 >= var17) {
                                var8++;
                                var11--;
                                var12 = var12 - (var11 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L19;
                              } else {
                                var20 = ((sfa) this).field_r[var18];
                                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                                var18++;
                                ((sfa) this).field_r[var18] = param3 + var20;
                                var19++;
                                continue L30;
                              }
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      var12 = var12 + (var10 + var10);
                      var10++;
                      var13 = var13 + (var10 + var10);
                      continue L26;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L31: while (true) {
          if (var8 >= param1) {
            var10 = param2;
            var11 = var8 - param1;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            L32: while (true) {
              if (var8 >= var7) {
                return;
              } else {
                L33: while (true) {
                  L34: {
                    if (var13 <= var9) {
                      break L34;
                    } else {
                      if (var12 <= var9) {
                        break L34;
                      } else {
                        var10--;
                        var13 = var13 - (var10 + var10);
                        var12 = var12 - (var10 + var10);
                        continue L33;
                      }
                    }
                  }
                  L35: {
                    var15 = param0 - var10;
                    if (var15 >= ((sfa) this).field_J) {
                      break L35;
                    } else {
                      var15 = ((sfa) this).field_J;
                      break L35;
                    }
                  }
                  L36: {
                    var16 = param0 + var10;
                    if (var16 <= ((sfa) this).field_W - 1) {
                      break L36;
                    } else {
                      var16 = ((sfa) this).field_W - 1;
                      break L36;
                    }
                  }
                  var17 = var15 + var8 * ((sfa) this).field_K;
                  var18 = var15;
                  L37: while (true) {
                    if (var18 > var16) {
                      var8++;
                      var13 = var13 + (var11 + var11);
                      var11++;
                      var12 = var12 + (var11 + var11);
                      continue L32;
                    } else {
                      var17++;
                      ((sfa) this).field_r[var17] = param3;
                      var18++;
                      continue L37;
                    }
                  }
                }
              }
            }
          } else {
            L38: while (true) {
              L39: {
                if (var13 <= var9) {
                  break L39;
                } else {
                  if (var12 > var9) {
                    L40: {
                      var15 = param0 - var10 + 1;
                      if (var15 >= ((sfa) this).field_J) {
                        break L40;
                      } else {
                        var15 = ((sfa) this).field_J;
                        break L40;
                      }
                    }
                    L41: {
                      var16 = param0 + var10;
                      if (var16 <= ((sfa) this).field_W) {
                        break L41;
                      } else {
                        var16 = ((sfa) this).field_W;
                        break L41;
                      }
                    }
                    var17 = var15 + var8 * ((sfa) this).field_K;
                    var18 = var15;
                    L42: while (true) {
                      if (var18 >= var16) {
                        var8++;
                        var11--;
                        var12 = var12 - (var11 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L31;
                      } else {
                        var17++;
                        ((sfa) this).field_r[var17] = param3;
                        var18++;
                        continue L42;
                      }
                    }
                  } else {
                    break L39;
                  }
                }
              }
              var12 = var12 + (var10 + var10);
              var10++;
              var13 = var13 + (var10 + var10);
              continue L38;
            }
          }
        }
    }

    final void b(int param0) {
        ww.field_q = param0;
        ww.field_G = param0;
        if (((sfa) this).field_u > 1) {
            throw new IllegalStateException("No MT");
        }
        this.i(((sfa) this).field_u);
        this.g(0);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param0 >= ((sfa) this).field_J) {
            break L0;
          } else {
            param2 = param2 - (((sfa) this).field_J - param0);
            param0 = ((sfa) this).field_J;
            break L0;
          }
        }
        L1: {
          if (param1 >= ((sfa) this).field_d) {
            break L1;
          } else {
            param3 = param3 - (((sfa) this).field_d - param1);
            param1 = ((sfa) this).field_d;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= ((sfa) this).field_W) {
            break L2;
          } else {
            param2 = ((sfa) this).field_W - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ((sfa) this).field_P) {
            break L3;
          } else {
            param3 = ((sfa) this).field_P - param1;
            break L3;
          }
        }
        L4: {
          if (param2 <= 0) {
            break L4;
          } else {
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param0 > ((sfa) this).field_W) {
                  break L5;
                } else {
                  if (param1 <= ((sfa) this).field_P) {
                    L6: {
                      var7 = ((sfa) this).field_K - param2;
                      var8 = param0 + param1 * ((sfa) this).field_K;
                      var9 = param4 >>> 24;
                      if (param5 == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (param5 != 1) {
                            break L7;
                          } else {
                            if (var9 != 255) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param5 != 1) {
                            if (param5 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var10 = 0;
                              L9: while (true) {
                                if (var10 >= param3) {
                                  break L8;
                                } else {
                                  var11 = -param2;
                                  L10: while (true) {
                                    if (var11 >= 0) {
                                      var8 = var8 + var7;
                                      var10++;
                                      continue L9;
                                    } else {
                                      var12 = ((sfa) this).field_r[var8];
                                      var13 = param4 + var12;
                                      var14 = (param4 & 16711935) + (var12 & 16711935);
                                      var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                      var8++;
                                      ((sfa) this).field_r[var8] = var13 - var12 | var12 - (var12 >>> 8);
                                      var11++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                            var10 = 256 - var9;
                            var11 = 0;
                            L11: while (true) {
                              if (var11 >= param3) {
                                break L8;
                              } else {
                                var12 = -param2;
                                L12: while (true) {
                                  if (var12 >= 0) {
                                    var8 = var8 + var7;
                                    var11++;
                                    continue L11;
                                  } else {
                                    var13 = ((sfa) this).field_r[var8];
                                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                                    var8++;
                                    ((sfa) this).field_r[var8] = param4 + var13;
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    L13: while (true) {
                      if (var12 >= 0) {
                        break L4;
                      } else {
                        L14: {
                          if (var10 <= 0) {
                            break L14;
                          } else {
                            param0 = var10;
                            L15: while (true) {
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          if (var11 <= 0) {
                            break L16;
                          } else {
                            param0 = var11;
                            L17: while (true) {
                              param2++;
                              ((sfa) this).field_r[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        param2 = param2 + var7;
                        var12++;
                        continue L13;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final int f(int param0) {
        return ((sfa) this).field_c.a((byte) -5, param0).field_d;
    }

    final boolean h() {
        return false;
    }

    final int l() {
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        tw var11 = null;
        iua var12 = null;
        int var13 = 0;
        iua stackIn_1_0 = null;
        iua stackIn_2_0 = null;
        iua stackIn_3_0 = null;
        iua stackIn_4_0 = null;
        iua stackIn_5_0 = null;
        iua stackIn_6_0 = null;
        iua stackIn_7_0 = null;
        iua stackIn_8_0 = null;
        iua stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        iua stackOut_0_0 = null;
        iua stackOut_1_0 = null;
        iua stackOut_2_0 = null;
        iua stackOut_3_0 = null;
        iua stackOut_4_0 = null;
        iua stackOut_5_0 = null;
        iua stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        iua stackOut_6_0 = null;
        iua stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            var11 = ((sfa) this).a((Runnable) (Object) Thread.currentThread());
            var12 = var11.field_v;
            var12.field_j = false;
            param0 = param0 - ((sfa) this).field_p;
            param2 = param2 - ((sfa) this).field_p;
            param4 = param4 - ((sfa) this).field_p;
            param1 = param1 - ((sfa) this).field_k;
            param3 = param3 - ((sfa) this).field_k;
            param5 = param5 - ((sfa) this).field_k;
            stackOut_0_0 = (iua) var12;
            stackIn_7_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param0 < 0) {
              break L1;
            } else {
              stackOut_1_0 = (iua) (Object) stackIn_1_0;
              stackIn_7_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0 > var12.field_h) {
                break L1;
              } else {
                stackOut_2_0 = (iua) (Object) stackIn_2_0;
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param2 < 0) {
                  break L1;
                } else {
                  stackOut_3_0 = (iua) (Object) stackIn_3_0;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (param2 > var12.field_h) {
                    break L1;
                  } else {
                    stackOut_4_0 = (iua) (Object) stackIn_4_0;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param4 < 0) {
                      break L1;
                    } else {
                      stackOut_5_0 = (iua) (Object) stackIn_5_0;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (param4 <= var12.field_h) {
                        stackOut_8_0 = (iua) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L0;
                      } else {
                        stackOut_6_0 = (iua) (Object) stackIn_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = (iua) (Object) stackIn_7_0;
          stackOut_7_1 = 1;
          stackIn_9_0 = stackOut_7_0;
          stackIn_9_1 = stackOut_7_1;
          break L0;
        }
        L2: {
          L3: {
            stackIn_9_0.field_q = stackIn_9_1 != 0;
            var12.field_m = true;
            var13 = param6 >>> 24;
            if (param9 == 0) {
              break L3;
            } else {
              L4: {
                if (param9 != 1) {
                  break L4;
                } else {
                  if (var13 != 255) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              if (param9 != 1) {
                if (param9 != 2) {
                  throw new IllegalArgumentException();
                } else {
                  var12.field_b = 128;
                  var12.field_g = true;
                  var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
                  break L2;
                }
              } else {
                var12.field_b = 255 - var13;
                var12.field_g = false;
                var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
                break L2;
              }
            }
          }
          var12.field_b = 0;
          var12.field_g = false;
          var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          break L2;
        }
        var12.field_j = true;
        var12.field_m = false;
    }

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L0: while (true) {
          L1: {
            if (var9 >= param4) {
              break L1;
            } else {
              var10 = 0;
              L2: while (true) {
                if (var10 >= param3) {
                  var9++;
                  continue L0;
                } else {
                  var8++;
                  var11 = param0[var8] >>> 24;
                  if (var11 != 0) {
                    if (var11 != 255) {
                      var7 = 1;
                      break L1;
                    } else {
                      var10++;
                      continue L2;
                    }
                  } else {
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          if (var7 == 0) {
            return (nh) (Object) new raa((sfa) this, param0, param1, param2, param3, param4, param5);
          } else {
            return (nh) (Object) new vqa((sfa) this, param0, param1, param2, param3, param4, param5);
          }
        }
    }

    static {
    }
}
