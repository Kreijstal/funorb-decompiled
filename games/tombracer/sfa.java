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
        int var2;
        var2 = 0;
        L0: while (true) {
          if (var2 < this.field_u) {
            if (this.field_Y[var2].field_b != param0) {
              var2++;
              continue L0;
            } else {
              return this.field_Y[var2];
            }
          } else {
            return null;
          }
        }
    }

    final boolean d(int param0) {
        return this.field_c.a((byte) -56, param0).field_b || this.field_c.a((byte) 125, param0).field_n;
    }

    final void ya() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int statePc = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (this.field_J != 0) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_W != this.field_K) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_d != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_P != this.field_h) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var1 = this.field_n.length;
                    var2 = var1 - (var1 & 7);
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 >= var2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    incrementValue$0 = var3;
                    var3++;
                    this.field_n[incrementValue$0] = 2147483648.0f;
                    incrementValue$1 = var3;
                    var3++;
                    this.field_n[incrementValue$1] = 2147483648.0f;
                    incrementValue$2 = var3;
                    var3++;
                    this.field_n[incrementValue$2] = 2147483648.0f;
                    incrementValue$3 = var3;
                    var3++;
                    this.field_n[incrementValue$3] = 2147483648.0f;
                    incrementValue$4 = var3;
                    var3++;
                    this.field_n[incrementValue$4] = 2147483648.0f;
                    incrementValue$5 = var3;
                    var3++;
                    this.field_n[incrementValue$5] = 2147483648.0f;
                    incrementValue$6 = var3;
                    var3++;
                    this.field_n[incrementValue$6] = 2147483648.0f;
                    incrementValue$7 = var3;
                    var3++;
                    this.field_n[incrementValue$7] = 2147483648.0f;
                    statePc = 5;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 >= var1) {
                        statePc = 19;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    incrementValue$8 = var3;
                    var3++;
                    this.field_n[incrementValue$8] = 2147483648.0f;
                    statePc = 7;
                    continue stateLoop;
                }
                case 9: {
                    var1 = this.field_W - this.field_J;
                    var2 = this.field_P - this.field_d;
                    var3 = this.field_K - var1;
                    var4 = this.field_J + this.field_d * this.field_K;
                    var5 = var1 >> 3;
                    var6 = var1 & 7;
                    var1 = var4 - 1;
                    var8 = -var2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 >= 0) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 <= 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = var5;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var7--;
                    if (var7 > 0) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var6 <= 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = var6;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var1++;
                    this.field_n[var1] = 2147483648.0f;
                    var7--;
                    if (var7 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var1 = var1 + var3;
                    var8++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        this.field_u = param0;
        this.field_Y = new tw[this.field_u];
        for (var2 = 0; var2 < this.field_u; var2++) {
            this.field_Y[var2] = new tw((sfa) (this));
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        float var5;
        int[] var6_ref_int__;
        int var6;
        int[] var7_ref_int__;
        int var7;
        int[] var8;
        int[] var9;
        L0: {
          var5 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
          if (var5 < (float)this.field_g) {
            break L0;
          } else {
            if (var5 <= (float)this.field_U) {
              L1: {
                L2: {
                  var6 = (int)((float)this.field_Q * (this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2)) / var5);
                  var7 = (int)((float)this.field_C * (this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2)) / var5);
                  if (var6 < this.field_p) {
                    break L2;
                  } else {
                    if (var6 > this.field_l) {
                      break L2;
                    } else {
                      if (var7 < this.field_k) {
                        break L2;
                      } else {
                        if (var7 > this.field_o) {
                          break L2;
                        } else {
                          param3[0] = var6 - this.field_p;
                          param3[1] = var7 - this.field_k;
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
        tw var3 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_g = param0;
        this.field_U = param1;
        var3.field_B = this.field_U - 255;
    }

    final void c(int param0) {
        qq var4 = null;
        int var5 = 0;
        dw var6 = null;
        int var2 = param0 - this.field_j;
        Object var3 = this.field_F.b((byte) 85);
        while (var3 != null) {
            var4 = (qq) (var3);
            if (var4.field_g) {
                var4.field_j = var4.field_j + var2;
                var5 = var4.field_j / 20;
                if (var5 > 0) {
                    var6 = this.field_c.a((byte) -53, var4.field_f);
                    var4.a(var6.field_s * var2 * 50 / 1000, var6.field_o * var2 * 50 / 1000);
                    var4.field_j = var4.field_j - var5 * 20;
                }
                var4.field_g = false;
            }
            var3 = this.field_F.a((byte) 60);
        }
        this.field_j = param0;
        this.field_X.b(72, 5);
        this.field_F.b(119, 5);
    }

    final void GA(int param0) {
        this.aa(0, 0, this.field_K, this.field_h, param0, 0);
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.U(param0, param1, param2, param4, param5);
        this.U(param0, param1 + param3 - 1, param2, param4, param5);
        this.c(param0, param1 + 1, param3 - 2, param4, param5);
        this.c(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        ija var7 = null;
        java.awt.Dimension var5 = null;
        float[] array$0 = null;
        ija var6 = (ija) ((Object) this.field_G.a((byte) -112, (long)param0.hashCode()));
        if (var6 != null) {
            var6.p(30);
            var7 = tfa.a(param2, param1, param0, 0);
            this.field_G.a((long)param0.hashCode(), 116, var7);
            if (this.field_t == param0 && this.field_D == null) {
                var5 = param0.getSize();
                this.field_m = var5.width;
                this.field_O = var5.height;
                this.field_T = var7;
                this.field_r = var7.field_g;
                this.field_K = var7.field_h;
                this.field_h = var7.field_f;
                if (this.field_K != this.field_y || this.field_h != this.field_s) {
                    this.field_y = this.field_K;
                    this.field_i = this.field_K;
                    this.field_s = this.field_h;
                    this.field_B = this.field_h;
                    array$0 = new float[this.field_y * this.field_s];
                    this.field_n = array$0;
                    this.field_H = array$0;
                }
                this.m();
            }
            return;
        }
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          if (param0 < this.field_J) {
            break L0;
          } else {
            if (param0 < this.field_W) {
              L1: {
                if (param1 >= this.field_d) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_d - param1);
                  param1 = this.field_d;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= this.field_P) {
                  break L2;
                } else {
                  param2 = this.field_P - param1;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_K;
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
                            var9 = var6 + var8 * this.field_K;
                            var10 = this.field_r[var9];
                            var11 = param3 + var10;
                            var12 = (param3 & 16711935) + (var10 & 16711935);
                            var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                            this.field_r[var9] = var11 - var10 | var10 - (var10 >>> 8);
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
                          var10 = var6 + var9 * this.field_K;
                          var11 = this.field_r[var10];
                          var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                          this.field_r[var10] = param3 + var11;
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
                  this.field_r[var6 + var8 * this.field_K] = param3;
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
        this.field_Y[param0].a((Runnable) ((Object) Thread.currentThread()), (byte) 100);
    }

    final void a(gda param0) {
        this.field_A = (pna) ((Object) param0);
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var15 = 0.0f;
        float var9 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        float var10 = this.field_A.field_m + (this.field_A.field_r * (float)param3 + this.field_A.field_o * (float)param4 + this.field_A.field_f * (float)param5);
        if (var9 < (float)this.field_g && var10 < (float)this.field_g) {
            return;
        }
        float var11 = this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2);
        float var12 = this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2);
        float var13 = this.field_A.field_l + (this.field_A.field_g * (float)param3 + this.field_A.field_i * (float)param4 + this.field_A.field_n * (float)param5);
        float var14 = this.field_A.field_e + (this.field_A.field_h * (float)param3 + this.field_A.field_s * (float)param4 + this.field_A.field_j * (float)param5);
        if (var9 < (float)this.field_g) {
            var15 = ((float)this.field_g - var10) / (var9 - var10);
            var11 = var13 + (var11 - var13) * var15;
            var12 = var14 + (var12 - var14) * var15;
            var9 = (float)this.field_g;
        }
        if (var10 < (float)this.field_g) {
            var15 = ((float)this.field_g - var9) / (var10 - var9);
            var13 = var11 + (var13 - var11) * var15;
            var14 = var12 + (var14 - var12) * var15;
            var10 = (float)this.field_g;
        }
        this.a(this.field_L + (int)((float)this.field_Q * var11 / var9), this.field_w + (int)((float)this.field_C * var12 / var9), this.field_L + (int)((float)this.field_Q * var13 / var10), this.field_w + (int)((float)this.field_C * var14 / var10), param6, param7);
    }

    final void a(za param0) {
    }

    final boolean j(int param0) {
        if (this.field_e || this.field_c.a((byte) -17, param0).field_g) {
            return true;
        }
        return false;
    }

    final void a(int param0, int param1) throws qva {
        java.awt.Graphics var3 = null;
        if (this.field_t == null || this.field_T == null) {
            throw new IllegalStateException("off");
        }
        try {
            var3 = this.field_t.getGraphics();
            this.field_T.a(this.field_O, 0, param0, 108, param1, 0, var3, this.field_m);
        } catch (Exception exception) {
            this.field_t.repaint();
        }
    }

    final boolean f() {
        return false;
    }

    final void a(float param0, float param1, float param2) {
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_L = param0;
        this.field_w = param1;
        this.field_Q = param2;
        this.field_C = param3;
        this.g();
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final int[] h(int param0) {
        qq var2 = null;
        Object var3 = null;
        dw var4 = null;
        Object stackIn_4_0 = null;
        int stackIn_10_0 = 0;
        qq stackIn_12_0;
        qq stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        int[] stackIn_12_4;
        qq stackIn_13_0;
        qq stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        int[] stackIn_13_4;
        int stackIn_13_5;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        var3 = this.field_F;
        synchronized (var3) {
          L0: {
            L1: {
              var2 = (qq) (this.field_F.a((byte) 92, (long)param0 | -9223372036854775808L));
              if (var2 != null) {
                break L1;
              } else {
                if (this.field_c.a(param0, (byte) 41)) {
                  L2: {
                    L3: {
                      var4 = this.field_c.a((byte) -124, param0);
                      if (var4.field_g) {
                        break L3;
                      } else {
                        if (!this.field_e) {
                          stackIn_10_0 = this.field_I;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_10_0 = 64;
                    break L2;
                  }
                  L4: {
                    var5 = stackIn_10_0;
                    stackIn_12_0 = null;

                    stackIn_12_1 = null;

                    stackIn_12_2 = param0;

                    stackIn_12_3 = var5;

                    stackIn_12_4 = this.field_c.a((byte) 40, var5, 0.699999988079071f, param0, true, var5);

                    if (var4.field_d == 1) {
                      stackIn_13_0 = null;
                      stackIn_13_1 = null;
                      stackIn_13_2 = stackIn_12_2;
                      stackIn_13_3 = stackIn_12_3;
                      stackIn_13_4 = (int[]) ((Object) stackIn_12_4);
                      stackIn_13_5 = 0;
                      break L4;
                    } else {
                      stackIn_13_0 = null;
                      stackIn_13_1 = null;
                      stackIn_13_2 = stackIn_12_2;
                      stackIn_13_3 = stackIn_12_3;
                      stackIn_13_4 = (int[]) ((Object) stackIn_12_4);
                      stackIn_13_5 = 1;
                      break L4;
                    }
                  }
                  var2 = new qq(stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5 != 0);
                  this.field_F.a(29166, var2, (long)param0 | -9223372036854775808L);
                  break L1;
                } else {
                  stackIn_4_0 = null;
                  return (int[]) ((Object) stackIn_4_0);
                }
              }
            }
            break L0;
          }
        }
        var2.field_g = true;
        return var2.b();
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > this.field_K) {
            param2 = this.field_K;
        }
        if (param3 > this.field_h) {
            param3 = this.field_h;
        }
        this.field_J = param0;
        this.field_W = param2;
        this.field_d = param1;
        this.field_P = param3;
        this.g();
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        return (ka) ((Object) new ww((sfa) (this), param0, param1, param3, param4, param2));
    }

    final boolean n() {
        return this.field_z;
    }

    final boolean j() {
        return false;
    }

    final gda e() {
        tw var1 = this.a((Runnable) ((Object) Thread.currentThread()));
        return (gda) ((Object) var1.field_u);
    }

    final void d() {
        if (this.field_t != null) {
            this.field_r = this.field_T.field_g;
            this.field_K = this.field_T.field_h;
            this.field_h = this.field_T.field_f;
            this.field_n = this.field_H;
            this.field_y = this.field_i;
            this.field_s = this.field_B;
        } else {
            this.field_K = 1;
            this.field_h = 1;
            this.field_r = null;
            this.field_y = 1;
            this.field_s = 1;
            this.field_n = null;
        }
        this.field_D = null;
        this.m();
    }

    final void k() {
        if (this.field_E) {
            rpa.a(false, true, true);
            this.field_E = false;
        }
        this.field_T = null;
        this.field_t = null;
        this.field_m = 0;
        this.field_O = 0;
        this.field_G = null;
        this.field_z = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
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
                  if (param1 >= this.field_d) {
                    break L2;
                  } else {
                    param0 = param0 + var7 * (this.field_d - param1);
                    param1 = this.field_d;
                    break L2;
                  }
                }
                L3: {
                  if (param3 < this.field_P) {
                    break L3;
                  } else {
                    param3 = this.field_P - 1;
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
                              if (var9 < this.field_J) {
                                break L7;
                              } else {
                                if (var9 >= this.field_W) {
                                  break L7;
                                } else {
                                  var10 = var9 + param1 * this.field_K;
                                  var11 = this.field_r[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  this.field_r[var10] = var12 - var11 | var11 - (var11 >>> 8);
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
                            if (var10 < this.field_J) {
                              break L9;
                            } else {
                              if (var10 >= this.field_W) {
                                break L9;
                              } else {
                                var11 = var10 + param1 * this.field_K;
                                var12 = this.field_r[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                this.field_r[var10 + param1 * this.field_K] = param4 + var12;
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
                      if (var9 < this.field_J) {
                        break L11;
                      } else {
                        if (var9 >= this.field_W) {
                          break L11;
                        } else {
                          this.field_r[var9 + param1 * this.field_K] = param4;
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
                  if (param0 >= this.field_J) {
                    break L12;
                  } else {
                    param1 = param1 + var7 * (this.field_J - param0);
                    param0 = this.field_J;
                    break L12;
                  }
                }
                L13: {
                  if (param2 < this.field_W) {
                    break L13;
                  } else {
                    param2 = this.field_W - 1;
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
                    L16: {
                      if (param5 != 1) {
                        if (param5 != 2) {
                          throw new IllegalArgumentException();
                        } else {
                          L17: while (true) {
                            if (param0 > param2) {
                              break L16;
                            } else {
                              L18: {
                                var9 = param1 >> 16;
                                if (var9 < this.field_d) {
                                  break L18;
                                } else {
                                  if (var9 >= this.field_P) {
                                    break L18;
                                  } else {
                                    var10 = param0 + var9 * this.field_K;
                                    var11 = this.field_r[var10];
                                    var12 = param4 + var11;
                                    var13 = (param4 & 16711935) + (var11 & 16711935);
                                    var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                    this.field_r[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                    break L18;
                                  }
                                }
                              }
                              param1 = param1 + var7;
                              param0++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                        var9 = 256 - var8;
                        L19: while (true) {
                          if (param0 > param2) {
                            break L16;
                          } else {
                            L20: {
                              var10 = param1 >> 16;
                              if (var10 < this.field_d) {
                                break L20;
                              } else {
                                if (var10 >= this.field_P) {
                                  break L20;
                                } else {
                                  var11 = param0 + var10 * this.field_K;
                                  var12 = this.field_r[var11];
                                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                  this.field_r[var11] = param4 + var12;
                                  break L20;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L19;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L21: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L22: {
                      var9 = param1 >> 16;
                      if (var9 < this.field_d) {
                        break L22;
                      } else {
                        if (var9 >= this.field_P) {
                          break L22;
                        } else {
                          this.field_r[param0 + var9 * this.field_K] = param4;
                          break L22;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L21;
                  }
                }
              }
            }
            return;
          } else {
            L23: {
              if (param3 < 0) {
                this.c(param0, param1 + param3, -param3 + 1, param4, param5);
                break L23;
              } else {
                this.c(param0, param1, param3 + 1, param4, param5);
                break L23;
              }
            }
            return;
          }
        } else {
          L24: {
            if (param2 < 0) {
              this.U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L24;
            } else {
              this.U(param0, param1, param2 + 1, param4, param5);
              break L24;
            }
          }
          return;
        }
    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        float var6;
        int[] var7_ref_int__;
        int var7;
        int[] var8_ref_int__;
        int var8;
        int[] var9;
        int[] var10;
        L0: {
          var6 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
          if (var6 < (float)this.field_g) {
            break L0;
          } else {
            if (var6 <= (float)this.field_U) {
              L1: {
                L2: {
                  var7 = (int)((float)this.field_Q * (this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2)) / (float)param3);
                  var8 = (int)((float)this.field_C * (this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2)) / (float)param3);
                  if (var7 < this.field_p) {
                    break L2;
                  } else {
                    if (var7 > this.field_l) {
                      break L2;
                    } else {
                      if (var8 < this.field_k) {
                        break L2;
                      } else {
                        if (var8 > this.field_o) {
                          break L2;
                        } else {
                          param4[0] = var7 - this.field_p;
                          param4[1] = var8 - this.field_k;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
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
          if (var7 >= this.field_d) {
            break L1;
          } else {
            var7 = this.field_d;
            break L1;
          }
        }
        L2: {
          var8 = param1 + param3 + 1;
          if (var8 <= this.field_P) {
            break L2;
          } else {
            var8 = this.field_P;
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
                                  incrementValue$0 = var11;
                                  var11--;
                                  var14 = var14 - (incrementValue$0 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var16 = param0 - var11;
                              if (var16 >= this.field_J) {
                                break L11;
                              } else {
                                var16 = this.field_J;
                                break L11;
                              }
                            }
                            L12: {
                              var17 = param0 + var11;
                              if (var17 <= this.field_W - 1) {
                                break L12;
                              } else {
                                var17 = this.field_W - 1;
                                break L12;
                              }
                            }
                            var18 = var16 + var9 * this.field_K;
                            var19 = var16;
                            L13: while (true) {
                              if (var19 > var17) {
                                var9++;
                                var14 = var14 + (var12 + var12);
                                incrementValue$1 = var12;
                                var12++;
                                var13 = var13 + (incrementValue$1 + var12);
                                continue L8;
                              } else {
                                if ((float)param2 < this.field_n[var18]) {
                                  var20 = this.field_r[var18];
                                  var21 = param4 + var20;
                                  var22 = (param4 & 16711935) + (var20 & 16711935);
                                  var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                  this.field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
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
                                if (var16 >= this.field_J) {
                                  break L16;
                                } else {
                                  var16 = this.field_J;
                                  break L16;
                                }
                              }
                              L17: {
                                var17 = param0 + var11;
                                if (var17 <= this.field_W) {
                                  break L17;
                                } else {
                                  var17 = this.field_W;
                                  break L17;
                                }
                              }
                              var18 = var16 + var9 * this.field_K;
                              var19 = var16;
                              L18: while (true) {
                                if (var19 >= var17) {
                                  var9++;
                                  incrementValue$2 = var12;
                                  var12--;
                                  var13 = var13 - (incrementValue$2 + var12);
                                  var14 = var14 - (var12 + var12);
                                  continue L7;
                                } else {
                                  if ((float)param2 < this.field_n[var18]) {
                                    var20 = this.field_r[var18];
                                    var21 = param4 + var20;
                                    var22 = (param4 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    this.field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
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
                        incrementValue$3 = var11;
                        var11++;
                        var14 = var14 + (incrementValue$3 + var11);
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
                                incrementValue$4 = var11;
                                var11--;
                                var14 = var14 - (incrementValue$4 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L21;
                              }
                            }
                          }
                          L23: {
                            var17 = param0 - var11;
                            if (var17 >= this.field_J) {
                              break L23;
                            } else {
                              var17 = this.field_J;
                              break L23;
                            }
                          }
                          L24: {
                            var18 = param0 + var11;
                            if (var18 <= this.field_W - 1) {
                              break L24;
                            } else {
                              var18 = this.field_W - 1;
                              break L24;
                            }
                          }
                          var19 = var17 + var9 * this.field_K;
                          var20 = var17;
                          L25: while (true) {
                            if (var20 > var18) {
                              var9++;
                              var14 = var14 + (var12 + var12);
                              incrementValue$5 = var12;
                              var12++;
                              var13 = var13 + (incrementValue$5 + var12);
                              continue L20;
                            } else {
                              if ((float)param2 < this.field_n[var19]) {
                                var21 = this.field_r[var19];
                                var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                                this.field_r[var19] = param4 + var21;
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
                              if (var17 >= this.field_J) {
                                break L28;
                              } else {
                                var17 = this.field_J;
                                break L28;
                              }
                            }
                            L29: {
                              var18 = param0 + var11;
                              if (var18 <= this.field_W) {
                                break L29;
                              } else {
                                var18 = this.field_W;
                                break L29;
                              }
                            }
                            var19 = var17 + var9 * this.field_K;
                            var20 = var17;
                            L30: while (true) {
                              if (var20 >= var18) {
                                var9++;
                                incrementValue$6 = var12;
                                var12--;
                                var13 = var13 - (incrementValue$6 + var12);
                                var14 = var14 - (var12 + var12);
                                continue L19;
                              } else {
                                if ((float)param2 < this.field_n[var19]) {
                                  var21 = this.field_r[var19];
                                  var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                                  this.field_r[var19] = param4 + var21;
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
                      incrementValue$7 = var11;
                      var11++;
                      var14 = var14 + (incrementValue$7 + var11);
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
                        incrementValue$8 = var11;
                        var11--;
                        var14 = var14 - (incrementValue$8 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L33;
                      }
                    }
                  }
                  L35: {
                    var16 = param0 - var11;
                    if (var16 >= this.field_J) {
                      break L35;
                    } else {
                      var16 = this.field_J;
                      break L35;
                    }
                  }
                  L36: {
                    var17 = param0 + var11;
                    if (var17 <= this.field_W - 1) {
                      break L36;
                    } else {
                      var17 = this.field_W - 1;
                      break L36;
                    }
                  }
                  var18 = var16 + var9 * this.field_K;
                  var19 = var16;
                  L37: while (true) {
                    if (var19 > var17) {
                      var9++;
                      var14 = var14 + (var12 + var12);
                      incrementValue$9 = var12;
                      var12++;
                      var13 = var13 + (incrementValue$9 + var12);
                      continue L32;
                    } else {
                      if ((float)param2 < this.field_n[var18]) {
                        this.field_r[var18] = param4;
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
                      if (var16 >= this.field_J) {
                        break L40;
                      } else {
                        var16 = this.field_J;
                        break L40;
                      }
                    }
                    L41: {
                      var17 = param0 + var11;
                      if (var17 <= this.field_W) {
                        break L41;
                      } else {
                        var17 = this.field_W;
                        break L41;
                      }
                    }
                    var18 = var16 + var9 * this.field_K;
                    var19 = var16;
                    L42: while (true) {
                      if (var19 >= var17) {
                        var9++;
                        incrementValue$10 = var12;
                        var12--;
                        var13 = var13 - (incrementValue$10 + var12);
                        var14 = var14 - (var12 + var12);
                        continue L31;
                      } else {
                        if ((float)param2 < this.field_n[var18]) {
                          this.field_r[var18] = param4;
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
              incrementValue$11 = var11;
              var11++;
              var14 = var14 + (incrementValue$11 + var11);
              continue L38;
            }
          }
        }
    }

    final jca a(nha param0, mw param1) {
        return (jca) ((Object) new bf((sfa) (this), (nh) ((Object) param0), (ita) ((Object) param1)));
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11;
        int[] var12;
        int var13;
        int[] var14;
        nh var15;
        int[] var16;
        int stackIn_12_0 = 0;
        if (param3 == 0) {
          return;
        } else {
          if (param4 != 0) {
            L0: {
              L1: {
                if (param6 == 65535) {
                  break L1;
                } else {
                  if (this.field_c.a((byte) -7, param6).field_p) {
                    break L1;
                  } else {
                    L2: {
                      if (this.field_v == param6) {
                        break L2;
                      } else {
                        L3: {
                          var11 = (nh) (this.field_X.a((byte) 75, (long)param6));
                          if (var11 != null) {
                            break L3;
                          } else {
                            var16 = this.h(param6);
                            var14 = var16;
                            var12 = var14;
                            if (var12 != null) {
                              L4: {
                                if (!this.j(param6)) {
                                  stackIn_12_0 = this.field_I;
                                  break L4;
                                } else {
                                  stackIn_12_0 = 64;
                                  break L4;
                                }
                              }
                              var13 = stackIn_12_0;
                              var15 = this.a(var16, var13, 79, var13, var13, 0);
                              var11 = var15;
                              this.field_X.a(29166, var15, (long)param6);
                              break L3;
                            } else {
                              return;
                            }
                          }
                        }
                        this.field_v = param6;
                        this.field_R = var11;
                        break L2;
                      }
                    }
                    ((pf) ((Object) this.field_R)).b(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
                    break L0;
                  }
                }
              }
              this.e(param0, param1, param2, param3, param7, param9);
              break L0;
            }
            return;
          } else {
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11;
        int[] var12;
        int var13;
        int[] var14;
        nh var15;
        int[] var16;
        int stackIn_12_0 = 0;
        if (param3 == 0) {
          return;
        } else {
          if (param4 != 0) {
            L0: {
              L1: {
                if (param6 == 65535) {
                  break L1;
                } else {
                  if (this.field_c.a((byte) 5, param6).field_p) {
                    break L1;
                  } else {
                    L2: {
                      if (this.field_v == param6) {
                        break L2;
                      } else {
                        L3: {
                          var11 = (nh) (this.field_X.a((byte) 55, (long)param6));
                          if (var11 != null) {
                            break L3;
                          } else {
                            var16 = this.h(param6);
                            var14 = var16;
                            var12 = var14;
                            if (var12 != null) {
                              L4: {
                                if (!this.j(param6)) {
                                  stackIn_12_0 = this.field_I;
                                  break L4;
                                } else {
                                  stackIn_12_0 = 64;
                                  break L4;
                                }
                              }
                              var13 = stackIn_12_0;
                              var15 = this.a(var16, var13, 80, var13, var13, 0);
                              var11 = var15;
                              this.field_X.a(29166, var15, (long)param6);
                              break L3;
                            } else {
                              return;
                            }
                          }
                        }
                        this.field_v = param6;
                        this.field_R = var11;
                        break L2;
                      }
                    }
                    ((pf) ((Object) this.field_R)).a(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
                    break L0;
                  }
                }
              }
              this.e(param0, param1, param2, param3, param7, param9);
              break L0;
            }
            return;
          } else {
            return;
          }
        }
    }

    final mw b(int param0, int param1) {
        return (mw) ((Object) new ita(param0, param1));
    }

    final void la() {
        this.field_J = 0;
        this.field_d = 0;
        this.field_W = this.field_K;
        this.field_P = this.field_h;
        this.g();
    }

    final gda b() {
        return (gda) ((Object) new pna());
    }

    final void xa(float param0) {
        this.field_f = (int)(param0 * 65535.0f);
    }

    final int i() {
        return this.field_g;
    }

    final void a(jca param0) {
        bf var2 = (bf) ((Object) param0);
        this.field_K = var2.field_c;
        this.field_h = var2.field_d;
        this.field_r = var2.field_g;
        this.field_D = var2;
        this.field_y = var2.field_c;
        this.field_s = var2.field_d;
        this.field_n = var2.field_e;
        this.m();
    }

    final void L(int param0, int param1, int param2) {
        int var4;
        tw var5;
        int var6;
        int var7;
        int var8;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_Y.length) {
            return;
          } else {
            L1: {
              var5 = this.field_Y[var4];
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
        for (var1 = 0; var1 < this.field_u; var1++) {
            this.field_Y[var1].a(-39);
        }
        this.la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_J < param0) {
            this.field_J = param0;
        }
        if (this.field_d < param1) {
            this.field_d = param1;
        }
        if (this.field_W > param2) {
            this.field_W = param2;
        }
        if (this.field_P > param3) {
            this.field_P = param3;
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
            this.a(true);
            throw new RuntimeException("");
        }
    }

    final void c() {
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        ija var4;
        L0: {
          var4 = (ija) ((Object) this.field_G.a((byte) -104, (long)param0.hashCode()));
          if (var4 != null) {
            L1: {
              if (var4.field_h != param1) {
                break L1;
              } else {
                if (var4.field_f == param2) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            this.b(param0, param1, param2);
            break L0;
          } else {
            var4 = tfa.a(param2, param1, param0, 0);
            this.field_G.a((long)param0.hashCode(), 125, var4);
            break L0;
          }
        }
    }

    final void a(int param0, ob[] param1) {
    }

    final nh a(jpa param0, boolean param1) {
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
        L0: {
          L1: {
            var20 = param0.field_g;
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
                var22 = new int[var20.length];
                var18 = var22;
                var8 = var18;
                var21 = new byte[var5 * var6];
                var17 = var21;
                var14 = var17;
                var9 = var14;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var6) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var20.length) {
                        var7 = new kf((sfa) (this), var21, var22, var5, var6);
                        break L0;
                      } else {
                        var8[var10] = var20[var10];
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
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_h;
          if (var9 == null) {
            var10 = 0;
            L5: while (true) {
              if (var10 >= var6) {
                var7 = new raa((sfa) (this), var23, var5, var6);
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
                      stackIn_26_0 = (int[]) (var15);

                      stackIn_26_1 = var11 + var12;

                      if (var13 == 0) {
                        stackIn_27_0 = (int[]) ((Object) stackIn_26_0);
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = 0;
                        break L7;
                      } else {
                        stackIn_27_0 = (int[]) ((Object) stackIn_26_0);
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = -16777216 | var13;
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
                var7 = new vqa((sfa) (this), var23, var5, var6);
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
        ((nh) (var7)).b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
        return (nh) (var7);
    }

    private sfa(d param0) {
        super(param0);
        this.field_E = false;
        this.field_z = false;
        this.field_G = new ji(4);
        this.field_g = 50;
        this.field_f = 75518;
        this.field_Q = 512;
        this.field_d = 0;
        this.field_I = 128;
        this.field_J = 0;
        this.field_M = 78642;
        this.field_W = 0;
        this.field_q = 45823;
        this.field_P = 0;
        this.field_e = false;
        this.field_U = 3500;
        this.field_C = 512;
        this.field_X = new dd(16);
        this.field_v = -1;
        try {
            this.field_F = new dd(256);
            this.field_A = new pna();
            this.i(1);
            this.g(0);
            ija.a(true, (byte) 100, true);
            this.field_E = true;
            this.field_j = (int)bva.b((byte) -107);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.a(true);
            throw new RuntimeException("");
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        float var16 = 0.0f;
        float var10 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        float var11 = this.field_A.field_m + (this.field_A.field_r * (float)param3 + this.field_A.field_o * (float)param4 + this.field_A.field_f * (float)param5);
        if (var10 < (float)this.field_g && var11 < (float)this.field_g) {
            return;
        }
        float var12 = this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2);
        float var13 = this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2);
        float var14 = this.field_A.field_l + (this.field_A.field_g * (float)param3 + this.field_A.field_i * (float)param4 + this.field_A.field_n * (float)param5);
        float var15 = this.field_A.field_e + (this.field_A.field_h * (float)param3 + this.field_A.field_s * (float)param4 + this.field_A.field_j * (float)param5);
        if (var10 < (float)this.field_g) {
            var16 = ((float)this.field_g - var11) / (var10 - var11);
            var12 = var14 + (var12 - var14) * var16;
            var13 = var15 + (var13 - var15) * var16;
            var10 = (float)this.field_g;
        }
        if (var11 < (float)this.field_g) {
            var16 = ((float)this.field_g - var10) / (var11 - var10);
            var14 = var12 + (var14 - var12) * var16;
            var15 = var13 + (var15 - var13) * var16;
            var11 = (float)this.field_g;
        }
        this.a(this.field_L + (int)((float)this.field_Q * var12 / (float)param6), this.field_w + (int)((float)this.field_C * var13 / (float)param6), this.field_L + (int)((float)this.field_Q * var14 / (float)param6), this.field_w + (int)((float)this.field_C * var15 / (float)param6), param7, param8);
    }

    final int[] Y() {
        return new int[]{this.field_L, this.field_w, this.field_Q, this.field_C};
    }

    final void K(int[] param0) {
        param0[0] = this.field_J;
        param0[1] = this.field_d;
        param0[2] = this.field_W;
        param0[3] = this.field_P;
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        this.field_q = (int)(param1 * 65535.0f);
        this.field_M = (int)(param2 * 65535.0f);
        float var7 = (float)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        this.field_x = (int)(param3 * 65535.0f / var7);
        this.field_V = (int)(param4 * 65535.0f / var7);
        this.field_S = (int)(param5 * 65535.0f / var7);
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          if (param1 < this.field_d) {
            break L0;
          } else {
            if (param1 < this.field_P) {
              L1: {
                if (param0 >= this.field_J) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_J - param0);
                  param0 = this.field_J;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= this.field_W) {
                  break L2;
                } else {
                  param2 = this.field_W - param0;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_K;
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
                            var9 = this.field_r[var6 + var8];
                            var10 = param3 + var9;
                            var11 = (param3 & 16711935) + (var9 & 16711935);
                            var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                            this.field_r[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
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
                          var10 = this.field_r[var6 + var9];
                          var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                          this.field_r[var6 + var9] = param3 + var10;
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
                  this.field_r[var6 + var8] = param3;
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
        return this.field_U;
    }

    private final void g() {
        iua var2_ref_iua = null;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        this.field_p = this.field_J - this.field_L;
        this.field_l = this.field_W - this.field_L;
        this.field_k = this.field_d - this.field_w;
        this.field_o = this.field_P - this.field_w;
        for (var1 = 0; var1 < this.field_u; var1++) {
            var2_ref_iua = this.field_Y[var1].field_v;
            var2_ref_iua.field_e = this.field_L - this.field_J;
            var2_ref_iua.field_n = this.field_w - this.field_d;
            var2_ref_iua.field_h = this.field_W - this.field_J;
            var2_ref_iua.field_v = this.field_P - this.field_d;
        }
        var1 = this.field_d * this.field_K + this.field_J;
        for (var2 = this.field_d; var2 < this.field_P; var2++) {
            for (var3 = 0; var3 < this.field_u; var3++) {
                this.field_Y[var3].field_v.field_p[var2 - this.field_d] = var1;
            }
            var1 = var1 + this.field_K;
        }
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        int[] var4;
        int[] var5;
        int var6;
        int var7;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) ((Object) new sn((sfa) (this), param0, param1, var4, var5));
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              if (var6 == 0) {
                return (da) ((Object) new le((sfa) (this), param0, param1, var4, var5));
              } else {
                return (da) ((Object) new nu((sfa) (this), param0, param1, var4, var5));
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
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * this.field_K + param0;
            for (var10 = 0; var10 < param2; var10++) {
                incrementValue$0 = param5;
                param5++;
                this.field_r[var9 + var10] = param4[incrementValue$0];
            }
            param5 = param5 + param6;
        }
    }

    final void a() {
    }

    private final void a(java.awt.Canvas param0) {
        float[] array$1 = null;
        ija var2;
        java.awt.Dimension var3;
        L0: {
          if (param0 == null) {
            this.field_t = null;
            this.field_T = null;
            if (this.field_D != null) {
              break L0;
            } else {
              this.field_r = null;
              this.field_h = 1;
              this.field_K = 1;
              this.field_s = 1;
              this.field_y = 1;
              this.m();
              break L0;
            }
          } else {
            var2 = (ija) ((Object) this.field_G.a((byte) -116, (long)param0.hashCode()));
            if (var2 == null) {
              break L0;
            } else {
              L1: {
                this.field_t = param0;
                var3 = param0.getSize();
                this.field_m = var3.width;
                this.field_O = var3.height;
                this.field_T = var2;
                if (this.field_D != null) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_r = var2.field_g;
                      this.field_K = var2.field_h;
                      this.field_h = var2.field_f;
                      if (this.field_K != this.field_y) {
                        break L3;
                      } else {
                        if (this.field_h == this.field_s) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_y = this.field_K;
                    this.field_i = this.field_K;
                    this.field_s = this.field_h;
                    this.field_B = this.field_h;
                    array$1 = new float[this.field_y * this.field_s];
                    this.field_n = array$1;
                    this.field_H = array$1;
                    break L2;
                  }
                  this.m();
                  break L1;
                }
              }
              break L0;
            }
          }
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
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
            if (this.field_W <= this.field_J) {
              break L1;
            } else {
              if (this.field_P > this.field_d) {
                if (param0 + param2 < this.field_J) {
                  break L1;
                } else {
                  L2: {
                    if (param0 - param2 >= this.field_W) {
                      break L2;
                    } else {
                      if (param1 + param2 < this.field_d) {
                        break L2;
                      } else {
                        if (param1 - param2 < this.field_P) {
                          L3: {
                            L4: {
                              var6 = param0 + param1 * this.field_K;
                              var7 = var6;
                              var8 = var6 - param2 * this.field_K;
                              var9 = var6 + param2 * this.field_K;
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
                                      if (param0 - var10 < this.field_J) {
                                        break L6;
                                      } else {
                                        if (param0 + var10 >= this.field_W) {
                                          break L6;
                                        } else {
                                          if (param1 - var10 < this.field_d) {
                                            break L6;
                                          } else {
                                            if (param1 + var10 < this.field_P) {
                                              var14 = var6 - var10;
                                              var15 = param3;
                                              var16 = this.field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var6 + var10;
                                              var15 = param3;
                                              var16 = this.field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var8;
                                              var15 = param3;
                                              var16 = this.field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var9;
                                              var15 = param3;
                                              var16 = this.field_r[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              L7: while (true) {
                                                L8: {
                                                  incrementValue$0 = var11;
                                                  var11++;
                                                  var12 = var12 + (incrementValue$0 + var11);
                                                  var6 = var6 - this.field_K;
                                                  var7 = var7 + this.field_K;
                                                  if (var12 <= param2) {
                                                    break L8;
                                                  } else {
                                                    var10--;
                                                    var12 = var12 - (var10 + var10);
                                                    var8 = var8 + this.field_K;
                                                    var9 = var9 - this.field_K;
                                                    break L8;
                                                  }
                                                }
                                                if (var10 >= var11) {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
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
                                      if (param0 - var10 < this.field_J) {
                                        break L9;
                                      } else {
                                        if (param1 < this.field_d) {
                                          break L9;
                                        } else {
                                          if (param1 >= this.field_P) {
                                            break L9;
                                          } else {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = this.field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (param0 + var10 >= this.field_W) {
                                        break L10;
                                      } else {
                                        if (param1 < this.field_d) {
                                          break L10;
                                        } else {
                                          if (param1 >= this.field_P) {
                                            break L10;
                                          } else {
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = this.field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (param1 - var10 < this.field_d) {
                                        break L11;
                                      } else {
                                        if (param0 < this.field_J) {
                                          break L11;
                                        } else {
                                          if (param0 >= this.field_W) {
                                            break L11;
                                          } else {
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = this.field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    L12: {
                                      if (param1 + var10 >= this.field_P) {
                                        break L12;
                                      } else {
                                        if (param0 < this.field_J) {
                                          break L12;
                                        } else {
                                          if (param0 >= this.field_W) {
                                            break L12;
                                          } else {
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = this.field_r[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L13: while (true) {
                                      L14: {
                                        incrementValue$1 = var11;
                                        var11++;
                                        var12 = var12 + (incrementValue$1 + var11);
                                        var6 = var6 - this.field_K;
                                        var7 = var7 + this.field_K;
                                        if (var12 <= param2) {
                                          break L14;
                                        } else {
                                          var10--;
                                          var12 = var12 - (var10 + var10);
                                          var8 = var8 + this.field_K;
                                          var9 = var9 - this.field_K;
                                          break L14;
                                        }
                                      }
                                      if (var10 >= var11) {
                                        L15: {
                                          if (param1 - var10 < this.field_d) {
                                            break L15;
                                          } else {
                                            if (param1 - var10 >= this.field_P) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if (param0 - var11 < this.field_J) {
                                                  break L16;
                                                } else {
                                                  if (param0 - var11 >= this.field_W) {
                                                    break L16;
                                                  } else {
                                                    var14 = var8 - var11;
                                                    var15 = param3;
                                                    var16 = this.field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (param0 + var11 < this.field_J) {
                                                break L15;
                                              } else {
                                                if (param0 + var11 >= this.field_W) {
                                                  break L15;
                                                } else {
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L17: {
                                          if (param1 - var11 < this.field_d) {
                                            break L17;
                                          } else {
                                            if (param1 - var11 >= this.field_P) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (param0 - var10 < this.field_J) {
                                                  break L18;
                                                } else {
                                                  if (param0 - var10 >= this.field_W) {
                                                    break L18;
                                                  } else {
                                                    var14 = var6 - var10;
                                                    var15 = param3;
                                                    var16 = this.field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L18;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < this.field_J) {
                                                break L17;
                                              } else {
                                                if (param0 + var10 >= this.field_W) {
                                                  break L17;
                                                } else {
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          if (param1 + var11 < this.field_d) {
                                            break L19;
                                          } else {
                                            if (param1 + var11 >= this.field_P) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (param0 - var10 < this.field_J) {
                                                  break L20;
                                                } else {
                                                  if (param0 - var10 >= this.field_W) {
                                                    break L20;
                                                  } else {
                                                    var14 = var7 - var10;
                                                    var15 = param3;
                                                    var16 = this.field_r[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L20;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < this.field_J) {
                                                break L19;
                                              } else {
                                                if (param0 + var10 >= this.field_W) {
                                                  break L19;
                                                } else {
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (param1 + var10 < this.field_d) {
                                          continue L13;
                                        } else {
                                          if (param1 + var10 >= this.field_P) {
                                            continue L13;
                                          } else {
                                            L21: {
                                              if (param0 - var11 < this.field_J) {
                                                break L21;
                                              } else {
                                                if (param0 - var11 >= this.field_W) {
                                                  break L21;
                                                } else {
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_r[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < this.field_J) {
                                              continue L13;
                                            } else {
                                              if (param0 + var11 >= this.field_W) {
                                                continue L13;
                                              } else {
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = this.field_r[var14];
                                                var17 = var15 + var16;
                                                var18 = (var15 & 16711935) + (var16 & 16711935);
                                                var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                this.field_r[var14] = var17 - var16 | var16 - (var16 >>> 8);
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
                                    if (param0 - var10 < this.field_J) {
                                      break L22;
                                    } else {
                                      if (param0 + var10 >= this.field_W) {
                                        break L22;
                                      } else {
                                        if (param1 - var10 < this.field_d) {
                                          break L22;
                                        } else {
                                          if (param1 + var10 < this.field_P) {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_r[var14] = var15 + var18;
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_r[var14] = var15 + var18;
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_r[var14] = var15 + var18;
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_r[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_r[var14] = var15 + var18;
                                            L23: while (true) {
                                              L24: {
                                                incrementValue$2 = var11;
                                                var11++;
                                                var12 = var12 + (incrementValue$2 + var11);
                                                var6 = var6 - this.field_K;
                                                var7 = var7 + this.field_K;
                                                if (var12 <= param2) {
                                                  break L24;
                                                } else {
                                                  var10--;
                                                  var12 = var12 - (var10 + var10);
                                                  var8 = var8 + this.field_K;
                                                  var9 = var9 - this.field_K;
                                                  break L24;
                                                }
                                              }
                                              if (var10 >= var11) {
                                                var14 = var8 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var6 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var7 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
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
                                    if (param0 - var10 < this.field_J) {
                                      break L25;
                                    } else {
                                      if (param1 < this.field_d) {
                                        break L25;
                                      } else {
                                        if (param1 >= this.field_P) {
                                          break L25;
                                        } else {
                                          var14 = var6 - var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_r[var14] = var15 + var18;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (param0 + var10 >= this.field_W) {
                                      break L26;
                                    } else {
                                      if (param1 < this.field_d) {
                                        break L26;
                                      } else {
                                        if (param1 >= this.field_P) {
                                          break L26;
                                        } else {
                                          var14 = var6 + var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_r[var14] = var15 + var18;
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L27: {
                                    if (param1 - var10 < this.field_d) {
                                      break L27;
                                    } else {
                                      if (param0 < this.field_J) {
                                        break L27;
                                      } else {
                                        if (param0 >= this.field_W) {
                                          break L27;
                                        } else {
                                          var14 = var8;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_r[var14] = var15 + var18;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (param1 + var10 >= this.field_P) {
                                      break L28;
                                    } else {
                                      if (param0 < this.field_J) {
                                        break L28;
                                      } else {
                                        if (param0 >= this.field_W) {
                                          break L28;
                                        } else {
                                          var14 = var9;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_r[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_r[var14] = var15 + var18;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  L29: while (true) {
                                    L30: {
                                      incrementValue$3 = var11;
                                      var11++;
                                      var12 = var12 + (incrementValue$3 + var11);
                                      var6 = var6 - this.field_K;
                                      var7 = var7 + this.field_K;
                                      if (var12 <= param2) {
                                        break L30;
                                      } else {
                                        var10--;
                                        var12 = var12 - (var10 + var10);
                                        var8 = var8 + this.field_K;
                                        var9 = var9 - this.field_K;
                                        break L30;
                                      }
                                    }
                                    if (var10 >= var11) {
                                      L31: {
                                        if (param1 - var10 < this.field_d) {
                                          break L31;
                                        } else {
                                          if (param1 - var10 >= this.field_P) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (param0 - var11 < this.field_J) {
                                                break L32;
                                              } else {
                                                if (param0 - var11 >= this.field_W) {
                                                  break L32;
                                                } else {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_r[var14] = var15 + var18;
                                                  break L32;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < this.field_J) {
                                              break L31;
                                            } else {
                                              if (param0 + var11 >= this.field_W) {
                                                break L31;
                                              } else {
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L33: {
                                        if (param1 - var11 < this.field_d) {
                                          break L33;
                                        } else {
                                          if (param1 - var11 >= this.field_P) {
                                            break L33;
                                          } else {
                                            L34: {
                                              if (param0 - var10 < this.field_J) {
                                                break L34;
                                              } else {
                                                if (param0 - var10 >= this.field_W) {
                                                  break L34;
                                                } else {
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_r[var14] = var15 + var18;
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < this.field_J) {
                                              break L33;
                                            } else {
                                              if (param0 + var10 >= this.field_W) {
                                                break L33;
                                              } else {
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L35: {
                                        if (param1 + var11 < this.field_d) {
                                          break L35;
                                        } else {
                                          if (param1 + var11 >= this.field_P) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (param0 - var10 < this.field_J) {
                                                break L36;
                                              } else {
                                                if (param0 - var10 >= this.field_W) {
                                                  break L36;
                                                } else {
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_r[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_r[var14] = var15 + var18;
                                                  break L36;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < this.field_J) {
                                              break L35;
                                            } else {
                                              if (param0 + var10 >= this.field_W) {
                                                break L35;
                                              } else {
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (param1 + var10 < this.field_d) {
                                        continue L29;
                                      } else {
                                        if (param1 + var10 >= this.field_P) {
                                          continue L29;
                                        } else {
                                          L37: {
                                            if (param0 - var11 < this.field_J) {
                                              break L37;
                                            } else {
                                              if (param0 - var11 >= this.field_W) {
                                                break L37;
                                              } else {
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_r[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_r[var14] = var15 + var18;
                                                break L37;
                                              }
                                            }
                                          }
                                          if (param0 + var11 < this.field_J) {
                                            continue L29;
                                          } else {
                                            if (param0 + var11 >= this.field_W) {
                                              continue L29;
                                            } else {
                                              var14 = var9 + var11;
                                              var15 = param3;
                                              var16 = var13;
                                              var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                              var17 = 256 - var16;
                                              var18 = this.field_r[var14];
                                              var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                              this.field_r[var14] = var15 + var18;
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
                              if (param0 - var10 >= this.field_J) {
                                if (param0 + var10 < this.field_W) {
                                  if (param1 - var10 >= this.field_d) {
                                    if (param1 + var10 < this.field_P) {
                                      this.field_r[var6 - var10] = param3;
                                      this.field_r[var6 + var10] = param3;
                                      this.field_r[var8] = param3;
                                      this.field_r[var9] = param3;
                                      L39: while (true) {
                                        L40: {
                                          incrementValue$4 = var11;
                                          var11++;
                                          var12 = var12 + (incrementValue$4 + var11);
                                          var6 = var6 - this.field_K;
                                          var7 = var7 + this.field_K;
                                          if (var12 <= param2) {
                                            break L40;
                                          } else {
                                            var10--;
                                            var12 = var12 - (var10 + var10);
                                            var8 = var8 + this.field_K;
                                            var9 = var9 - this.field_K;
                                            break L40;
                                          }
                                        }
                                        if (var10 >= var11) {
                                          this.field_r[var8 - var11] = param3;
                                          this.field_r[var8 + var11] = param3;
                                          this.field_r[var6 - var10] = param3;
                                          this.field_r[var6 + var10] = param3;
                                          this.field_r[var7 - var10] = param3;
                                          this.field_r[var7 + var10] = param3;
                                          this.field_r[var9 - var11] = param3;
                                          this.field_r[var9 + var11] = param3;
                                          continue L39;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    } else {
                                      if (param0 - var10 < this.field_J) {
                                        break L38;
                                      } else {
                                        if (param1 < this.field_d) {
                                          break L38;
                                        } else {
                                          if (param1 >= this.field_P) {
                                            break L38;
                                          } else {
                                            this.field_r[var6 - var10] = param3;
                                            break L38;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (param0 - var10 < this.field_J) {
                                      break L38;
                                    } else {
                                      if (param1 < this.field_d) {
                                        break L38;
                                      } else {
                                        if (param1 >= this.field_P) {
                                          break L38;
                                        } else {
                                          this.field_r[var6 - var10] = param3;
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < this.field_J) {
                                    break L38;
                                  } else {
                                    if (param1 < this.field_d) {
                                      break L38;
                                    } else {
                                      if (param1 >= this.field_P) {
                                        break L38;
                                      } else {
                                        this.field_r[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 - var10 < this.field_J) {
                                  break L38;
                                } else {
                                  if (param1 < this.field_d) {
                                    break L38;
                                  } else {
                                    if (param1 >= this.field_P) {
                                      break L38;
                                    } else {
                                      this.field_r[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                }
                              }
                            }
                            L41: {
                              if (param0 + var10 < this.field_W) {
                                if (param1 >= this.field_d) {
                                  if (param1 < this.field_P) {
                                    this.field_r[var6 + var10] = param3;
                                    if (param1 - var10 < this.field_d) {
                                      break L41;
                                    } else {
                                      if (param0 < this.field_J) {
                                        break L41;
                                      } else {
                                        if (param0 >= this.field_W) {
                                          break L41;
                                        } else {
                                          this.field_r[var8] = param3;
                                          break L41;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1 - var10 < this.field_d) {
                                      break L41;
                                    } else {
                                      if (param0 < this.field_J) {
                                        break L41;
                                      } else {
                                        if (param0 >= this.field_W) {
                                          break L41;
                                        } else {
                                          this.field_r[var8] = param3;
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param1 - var10 < this.field_d) {
                                    break L41;
                                  } else {
                                    if (param0 < this.field_J) {
                                      break L41;
                                    } else {
                                      if (param0 >= this.field_W) {
                                        break L41;
                                      } else {
                                        this.field_r[var8] = param3;
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param1 - var10 < this.field_d) {
                                  break L41;
                                } else {
                                  if (param0 < this.field_J) {
                                    break L41;
                                  } else {
                                    if (param0 >= this.field_W) {
                                      break L41;
                                    } else {
                                      this.field_r[var8] = param3;
                                      break L41;
                                    }
                                  }
                                }
                              }
                            }
                            L42: {
                              if (param1 + var10 >= this.field_P) {
                                break L42;
                              } else {
                                if (param0 < this.field_J) {
                                  break L42;
                                } else {
                                  if (param0 >= this.field_W) {
                                    break L42;
                                  } else {
                                    this.field_r[var9] = param3;
                                    break L42;
                                  }
                                }
                              }
                            }
                            L43: while (true) {
                              L44: {
                                incrementValue$5 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$5 + var11);
                                var6 = var6 - this.field_K;
                                var7 = var7 + this.field_K;
                                if (var12 <= param2) {
                                  break L44;
                                } else {
                                  var10--;
                                  var12 = var12 - (var10 + var10);
                                  var8 = var8 + this.field_K;
                                  var9 = var9 - this.field_K;
                                  break L44;
                                }
                              }
                              if (var10 >= var11) {
                                L45: {
                                  if (param1 - var10 < this.field_d) {
                                    break L45;
                                  } else {
                                    if (param1 - var10 >= this.field_P) {
                                      break L45;
                                    } else {
                                      if (param0 - var11 >= this.field_J) {
                                        if (param0 - var11 < this.field_W) {
                                          this.field_r[var8 - var11] = param3;
                                          if (param0 + var11 < this.field_J) {
                                            break L45;
                                          } else {
                                            if (param0 + var11 >= this.field_W) {
                                              break L45;
                                            } else {
                                              this.field_r[var8 + var11] = param3;
                                              break L45;
                                            }
                                          }
                                        } else {
                                          if (param0 + var11 < this.field_J) {
                                            break L45;
                                          } else {
                                            if (param0 + var11 >= this.field_W) {
                                              break L45;
                                            } else {
                                              this.field_r[var8 + var11] = param3;
                                              break L45;
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 + var11 < this.field_J) {
                                          break L45;
                                        } else {
                                          if (param0 + var11 >= this.field_W) {
                                            break L45;
                                          } else {
                                            this.field_r[var8 + var11] = param3;
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 - var11 < this.field_d) {
                                    break L46;
                                  } else {
                                    if (param1 - var11 >= this.field_P) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (param0 - var10 < this.field_J) {
                                          break L47;
                                        } else {
                                          if (param0 - var10 >= this.field_W) {
                                            break L47;
                                          } else {
                                            this.field_r[var6 - var10] = param3;
                                            break L47;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < this.field_J) {
                                        break L46;
                                      } else {
                                        if (param0 + var10 >= this.field_W) {
                                          break L46;
                                        } else {
                                          this.field_r[var6 + var10] = param3;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                L48: {
                                  if (param1 + var11 < this.field_d) {
                                    break L48;
                                  } else {
                                    if (param1 + var11 >= this.field_P) {
                                      break L48;
                                    } else {
                                      L49: {
                                        if (param0 - var10 < this.field_J) {
                                          break L49;
                                        } else {
                                          if (param0 - var10 >= this.field_W) {
                                            break L49;
                                          } else {
                                            this.field_r[var7 - var10] = param3;
                                            break L49;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < this.field_J) {
                                        break L48;
                                      } else {
                                        if (param0 + var10 >= this.field_W) {
                                          break L48;
                                        } else {
                                          this.field_r[var7 + var10] = param3;
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var10 < this.field_d) {
                                  continue L43;
                                } else {
                                  if (param1 + var10 >= this.field_P) {
                                    continue L43;
                                  } else {
                                    L50: {
                                      if (param0 - var11 < this.field_J) {
                                        break L50;
                                      } else {
                                        if (param0 - var11 >= this.field_W) {
                                          break L50;
                                        } else {
                                          this.field_r[var9 - var11] = param3;
                                          break L50;
                                        }
                                      }
                                    }
                                    if (param0 + var11 < this.field_J) {
                                      continue L43;
                                    } else {
                                      if (param0 + var11 >= this.field_W) {
                                        continue L43;
                                      } else {
                                        this.field_r[var9 + var11] = param3;
                                        continue L43;
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
          L51: {
            if (param0 < this.field_J) {
              break L51;
            } else {
              L52: {
                if (param1 < this.field_d) {
                  break L52;
                } else {
                  if (param0 >= this.field_W) {
                    break L52;
                  } else {
                    if (param1 < this.field_P) {
                      L53: {
                        L54: {
                          var6 = param3 >>> 24;
                          var7 = param0 + param1 * this.field_K;
                          if (param4 == 0) {
                            break L54;
                          } else {
                            L55: {
                              if (param4 != 1) {
                                break L55;
                              } else {
                                if (var6 != 255) {
                                  break L55;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            if (param4 != 1) {
                              if (param4 != 2) {
                                break L51;
                              } else {
                                var8 = var7;
                                var9 = param3;
                                var10 = this.field_r[var8];
                                var11 = var9 + var10;
                                var12 = (var9 & 16711935) + (var10 & 16711935);
                                var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                                this.field_r[var8] = var11 - var10 | var10 - (var10 >>> 8);
                                break L53;
                              }
                            } else {
                              var8 = var7;
                              var9 = param3;
                              var10 = var6;
                              var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                              var11 = 256 - var10;
                              var12 = this.field_r[var8];
                              var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                              this.field_r[var8] = var9 + var12;
                              break L53;
                            }
                          }
                        }
                        this.field_r[var7] = param3;
                        break L53;
                      }
                      return;
                    } else {
                      break L52;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
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
          if (var6 >= this.field_d) {
            break L1;
          } else {
            var6 = this.field_d;
            break L1;
          }
        }
        L2: {
          var7 = param1 + param2 + 1;
          if (var7 <= this.field_P) {
            break L2;
          } else {
            var7 = this.field_P;
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
                                  incrementValue$0 = var10;
                                  var10--;
                                  var13 = var13 - (incrementValue$0 + var10);
                                  var12 = var12 - (var10 + var10);
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var15 = param0 - var10;
                              if (var15 >= this.field_J) {
                                break L11;
                              } else {
                                var15 = this.field_J;
                                break L11;
                              }
                            }
                            L12: {
                              var16 = param0 + var10;
                              if (var16 <= this.field_W - 1) {
                                break L12;
                              } else {
                                var16 = this.field_W - 1;
                                break L12;
                              }
                            }
                            var17 = var15 + var8 * this.field_K;
                            var18 = var15;
                            L13: while (true) {
                              if (var18 > var16) {
                                var8++;
                                var13 = var13 + (var11 + var11);
                                incrementValue$1 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$1 + var11);
                                continue L8;
                              } else {
                                var19 = this.field_r[var17];
                                var20 = param3 + var19;
                                var21 = (param3 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                incrementValue$2 = var17;
                                var17++;
                                this.field_r[incrementValue$2] = var20 - var19 | var19 - (var19 >>> 8);
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
                                if (var15 >= this.field_J) {
                                  break L16;
                                } else {
                                  var15 = this.field_J;
                                  break L16;
                                }
                              }
                              L17: {
                                var16 = param0 + var10;
                                if (var16 <= this.field_W) {
                                  break L17;
                                } else {
                                  var16 = this.field_W;
                                  break L17;
                                }
                              }
                              var17 = var15 + var8 * this.field_K;
                              var18 = var15;
                              L18: while (true) {
                                if (var18 >= var16) {
                                  var8++;
                                  incrementValue$3 = var11;
                                  var11--;
                                  var12 = var12 - (incrementValue$3 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L7;
                                } else {
                                  var19 = this.field_r[var17];
                                  var20 = param3 + var19;
                                  var21 = (param3 & 16711935) + (var19 & 16711935);
                                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                  incrementValue$4 = var17;
                                  var17++;
                                  this.field_r[incrementValue$4] = var20 - var19 | var19 - (var19 >>> 8);
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
                        incrementValue$5 = var10;
                        var10++;
                        var13 = var13 + (incrementValue$5 + var10);
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
                                incrementValue$6 = var10;
                                var10--;
                                var13 = var13 - (incrementValue$6 + var10);
                                var12 = var12 - (var10 + var10);
                                continue L21;
                              }
                            }
                          }
                          L23: {
                            var16 = param0 - var10;
                            if (var16 >= this.field_J) {
                              break L23;
                            } else {
                              var16 = this.field_J;
                              break L23;
                            }
                          }
                          L24: {
                            var17 = param0 + var10;
                            if (var17 <= this.field_W - 1) {
                              break L24;
                            } else {
                              var17 = this.field_W - 1;
                              break L24;
                            }
                          }
                          var18 = var16 + var8 * this.field_K;
                          var19 = var16;
                          L25: while (true) {
                            if (var19 > var17) {
                              var8++;
                              var13 = var13 + (var11 + var11);
                              incrementValue$7 = var11;
                              var11++;
                              var12 = var12 + (incrementValue$7 + var11);
                              continue L20;
                            } else {
                              var20 = this.field_r[var18];
                              var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                              incrementValue$8 = var18;
                              var18++;
                              this.field_r[incrementValue$8] = param3 + var20;
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
                              if (var16 >= this.field_J) {
                                break L28;
                              } else {
                                var16 = this.field_J;
                                break L28;
                              }
                            }
                            L29: {
                              var17 = param0 + var10;
                              if (var17 <= this.field_W) {
                                break L29;
                              } else {
                                var17 = this.field_W;
                                break L29;
                              }
                            }
                            var18 = var16 + var8 * this.field_K;
                            var19 = var16;
                            L30: while (true) {
                              if (var19 >= var17) {
                                var8++;
                                incrementValue$9 = var11;
                                var11--;
                                var12 = var12 - (incrementValue$9 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L19;
                              } else {
                                var20 = this.field_r[var18];
                                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                                incrementValue$10 = var18;
                                var18++;
                                this.field_r[incrementValue$10] = param3 + var20;
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
                      incrementValue$11 = var10;
                      var10++;
                      var13 = var13 + (incrementValue$11 + var10);
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
                        incrementValue$12 = var10;
                        var10--;
                        var13 = var13 - (incrementValue$12 + var10);
                        var12 = var12 - (var10 + var10);
                        continue L33;
                      }
                    }
                  }
                  L35: {
                    var15 = param0 - var10;
                    if (var15 >= this.field_J) {
                      break L35;
                    } else {
                      var15 = this.field_J;
                      break L35;
                    }
                  }
                  L36: {
                    var16 = param0 + var10;
                    if (var16 <= this.field_W - 1) {
                      break L36;
                    } else {
                      var16 = this.field_W - 1;
                      break L36;
                    }
                  }
                  var17 = var15 + var8 * this.field_K;
                  var18 = var15;
                  L37: while (true) {
                    if (var18 > var16) {
                      var8++;
                      var13 = var13 + (var11 + var11);
                      incrementValue$13 = var11;
                      var11++;
                      var12 = var12 + (incrementValue$13 + var11);
                      continue L32;
                    } else {
                      incrementValue$14 = var17;
                      var17++;
                      this.field_r[incrementValue$14] = param3;
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
                      if (var15 >= this.field_J) {
                        break L40;
                      } else {
                        var15 = this.field_J;
                        break L40;
                      }
                    }
                    L41: {
                      var16 = param0 + var10;
                      if (var16 <= this.field_W) {
                        break L41;
                      } else {
                        var16 = this.field_W;
                        break L41;
                      }
                    }
                    var17 = var15 + var8 * this.field_K;
                    var18 = var15;
                    L42: while (true) {
                      if (var18 >= var16) {
                        var8++;
                        incrementValue$15 = var11;
                        var11--;
                        var12 = var12 - (incrementValue$15 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L31;
                      } else {
                        incrementValue$16 = var17;
                        var17++;
                        this.field_r[incrementValue$16] = param3;
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
              incrementValue$17 = var10;
              var10++;
              var13 = var13 + (incrementValue$17 + var10);
              continue L38;
            }
          }
        }
    }

    final void b(int param0) {
        ww.field_q = param0;
        ww.field_G = param0;
        if (this.field_u > 1) {
            throw new IllegalStateException("No MT");
        }
        this.i(this.field_u);
        this.g(0);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int statePc = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= this.field_J) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    param2 = param2 - (this.field_J - param0);
                    param0 = this.field_J;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param1 >= this.field_d) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param3 = param3 - (this.field_d - param1);
                    param1 = this.field_d;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param0 + param2 <= this.field_W) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    param2 = this.field_W - param0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 + param3 <= this.field_P) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    param3 = this.field_P - param1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param2 <= 0) {
                        statePc = 43;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param3 <= 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param0 > this.field_W) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param1 <= this.field_P) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var7 = this.field_K - param2;
                    var8 = param0 + param1 * this.field_K;
                    var9 = param4 >>> 24;
                    if (param5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (param5 != 1) {
                        statePc = 27;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var9 != 255) {
                        statePc = 27;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var12 >= 0) {
                        statePc = 43;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var10 <= 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param0 = var10;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param2++;
                    this.field_r[param2] = param4;
                    param0--;
                    if (param0 > 0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var11 <= 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    param0 = var11;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    param2++;
                    this.field_r[param2] = param4;
                    param0--;
                    if (param0 > 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    param2 = param2 + var7;
                    var12++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 27: {
                    if (param5 != 1) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                    var10 = 256 - var9;
                    var11 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var11 >= param3) {
                        statePc = 42;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var12 = -param2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var12 >= 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var13 = this.field_r[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$0 = var8;
                    var8++;
                    this.field_r[incrementValue$0] = param4 + var13;
                    var12++;
                    statePc = 31;
                    continue stateLoop;
                }
                case 33: {
                    var8 = var8 + var7;
                    var11++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 34: {
                    if (param5 != 2) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var10 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var10 >= param3) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var11 = -param2;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var11 >= 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var12 = this.field_r[var8];
                    var13 = param4 + var12;
                    var14 = (param4 & 16711935) + (var12 & 16711935);
                    var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                    incrementValue$1 = var8;
                    var8++;
                    this.field_r[incrementValue$1] = var13 - var12 | var12 - (var12 >>> 8);
                    var11++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    var8 = var8 + var7;
                    var10++;
                    statePc = 36;
                    continue stateLoop;
                }
                case 41: {
                    throw new IllegalArgumentException();
                }
                case 42: {
                    return;
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int f(int param0) {
        return this.field_c.a((byte) -5, param0).field_d;
    }

    final boolean h() {
        return false;
    }

    final int l() {
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        iua stackIn_7_0 = null;
        iua stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        tw var11;
        iua var12;
        int var13;
        L0: {
          L1: {
            var11 = this.a((Runnable) ((Object) Thread.currentThread()));
            var12 = var11.field_v;
            var12.field_j = false;
            param0 = param0 - this.field_p;
            param2 = param2 - this.field_p;
            param4 = param4 - this.field_p;
            param1 = param1 - this.field_k;
            param3 = param3 - this.field_k;
            param5 = param5 - this.field_k;
            stackIn_7_0 = (iua) (var12);

            if (param0 < 0) {
              break L1;
            } else {
              stackIn_7_0 = (iua) ((Object) stackIn_7_0);

              if (param0 > var12.field_h) {
                break L1;
              } else {
                stackIn_7_0 = (iua) ((Object) stackIn_7_0);

                if (param2 < 0) {
                  break L1;
                } else {
                  stackIn_7_0 = (iua) ((Object) stackIn_7_0);

                  if (param2 > var12.field_h) {
                    break L1;
                  } else {
                    stackIn_7_0 = (iua) ((Object) stackIn_7_0);

                    if (param4 < 0) {
                      break L1;
                    } else {


                      if (param4 <= var12.field_h) {
                        stackIn_9_0 = (iua) ((Object) stackIn_7_0);
                        stackIn_9_1 = 0;
                        break L0;
                      } else {
                        stackIn_7_0 = (iua) ((Object) stackIn_7_0);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_9_0 = (iua) ((Object) stackIn_7_0);
          stackIn_9_1 = 1;
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
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
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
                  incrementValue$4 = var8;
                  var8++;
                  var11 = param0[incrementValue$4] >>> 24;
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
            return (nh) ((Object) new raa((sfa) (this), param0, param1, param2, param3, param4, param5));
          } else {
            return (nh) ((Object) new vqa((sfa) (this), param0, param1, param2, param3, param4, param5));
          }
        }
    }

    static {
    }
}
