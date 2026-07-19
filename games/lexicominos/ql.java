/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ql extends al {
    static le field_Q;
    private int field_L;
    private int field_J;
    static int field_O;
    static volatile boolean field_K;
    private int field_I;
    private int field_P;
    private int field_M;
    private int field_N;

    void f(boolean param0) {
        if (0 >= this.field_J) {
            return;
        }
        if (!param0) {
            ql.g((byte) -79);
        }
        this.b(this.field_M, -120, this.field_N);
        this.field_J = 0;
        this.h((byte) 38);
    }

    void h(byte param0) {
        if (param0 != 38) {
            field_K = true;
        }
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        var16 = Lexicominos.field_L ? 1 : 0;
        lf.a(6 + param2, 35 + param0, this.field_j - 12, this.field_v + -40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 <= var7) {
                break L2;
              } else {
                stackOut_2_0 = lf.field_c;
                stackOut_2_1 = var8;
                stackIn_33_0 = stackOut_2_0;
                stackIn_33_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var16 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                      break L3;
                    } else {
                      if (lf.field_h <= var8) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var9 = var5 + (-var5 + var6) * var7 / var4;
                            var10 = 0;
                            var11 = this.field_j;
                            if (-21 > (var7 ^ -1)) {
                              break L5;
                            } else {
                              L6: while (true) {
                                if (20 < var10) {
                                  break L5;
                                } else {
                                  var12 = (-var7 + 20) * (20 + -var7) + (-var10 + 20) * (20 + -var10);
                                  stackOut_7_0 = 462;
                                  stackOut_7_1 = var12;
                                  stackIn_17_0 = stackOut_7_0;
                                  stackIn_17_1 = stackOut_7_1;
                                  stackIn_8_0 = stackOut_7_0;
                                  stackIn_8_1 = stackOut_7_1;
                                  if (var16 != 0) {
                                    break L4;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_8_0 >= stackIn_8_1) {
                                          break L8;
                                        } else {
                                          if (var16 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if ((var12 ^ -1) <= -421) {
                                          break L9;
                                        } else {
                                          if (var16 == 0) {
                                            break L5;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var13 = (-var12 + 462) * var9 / 42;
                                      var13 = var13 | (var13 << -533349328 | var13 << 618533128);
                                      lf.field_b[param2 + (var8 * lf.field_f + var10)] = var13;
                                      break L7;
                                    }
                                    var10++;
                                    if (var16 == 0) {
                                      continue L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_16_0 = var7 ^ -1;
                          stackOut_16_1 = -21;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L4;
                        }
                        L10: {
                          L11: {
                            if (stackIn_17_0 < stackIn_17_1) {
                              break L11;
                            } else {
                              var12 = var11;
                              var11 -= 21;
                              var13 = 0;
                              L12: while (true) {
                                L13: {
                                  if (var13 > 20) {
                                    break L13;
                                  } else {
                                    var14 = var13 * var13 + (-var7 + 20) * (-var7 + 20);
                                    stackOut_20_0 = var14 ^ -1;
                                    stackOut_20_1 = -463;
                                    stackIn_30_0 = stackOut_20_0;
                                    stackIn_30_1 = stackOut_20_1;
                                    stackIn_21_0 = stackOut_20_0;
                                    stackIn_21_1 = stackOut_20_1;
                                    if (var16 != 0) {
                                      break L10;
                                    } else {
                                      L14: {
                                        if (stackIn_21_0 >= stackIn_21_1) {
                                          break L14;
                                        } else {
                                          if (var16 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        L16: {
                                          if (var14 >= 420) {
                                            break L16;
                                          } else {
                                            var12 = 1 + var11;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var15 = (462 + -var14) * var9 / 42;
                                        var15 = var15 | (var15 << 359413232 | var15 << 204440040);
                                        lf.field_b[var11 + lf.field_f * var8 + param2] = var15;
                                        break L15;
                                      }
                                      var11++;
                                      var13++;
                                      if (var16 == 0) {
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                var11 = var12;
                                break L11;
                              }
                            }
                          }
                          var9 = var9 | (var9 << -1670768976 | var9 << -60889016);
                          stackOut_29_0 = param2 + var10;
                          stackOut_29_1 = var8;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          break L10;
                        }
                        lf.a(stackIn_30_0, stackIn_30_1, var11 - var10, var9);
                        break L3;
                      }
                    }
                  }
                  var7++;
                  var8++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            stackOut_32_0 = param0;
            stackOut_32_1 = 35;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            break L1;
          }
          var8 = stackIn_33_0 + stackIn_33_1;
          L17: while (true) {
            L18: {
              L19: {
                if (var4 <= var7) {
                  break L19;
                } else {
                  var9 = (var6 - var5) * var7 / var4 + var5;
                  var9 = var9 | (var9 << 1851432624 | var9 << -1106622520);
                  lf.a(param2, var8, 6, var9);
                  lf.a(this.field_j + (param2 + -6), var8, 6, var9);
                  var8++;
                  var7++;
                  if (var16 != 0) {
                    break L18;
                  } else {
                    if (var16 == 0) {
                      continue L17;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              Lexicominos.field_I.d(-90 + (this.field_j + param2), param0 - -10);
              ac.a(true, param0 - -35, ti.field_I, param2 - -5, this.field_j - 10);
              ac.a(true, -22 + param0 - -this.field_v, we.field_i, param2, this.field_j);
              var6 = 127;
              var5 = 169;
              var4 = -79 + this.field_v;
              var7 = -113 / ((-3 - param1) / 43);
              var8 = 0;
              break L18;
            }
            var9 = 57 + param0;
            L20: while (true) {
              L21: {
                if ((var8 ^ -1) <= (var4 ^ -1)) {
                  break L21;
                } else {
                  var10 = var5 - -(var8 * (var6 + -var5) / var4);
                  var10 = var10 | (var10 << 1324391560 | var10 << -1545875632);
                  lf.a(param2, var9, 6, var10);
                  lf.a(this.field_j + param2 + -6, var9, 6, var10);
                  var8++;
                  var9++;
                  if (var16 != 0) {
                    break L21;
                  } else {
                    if (var16 == 0) {
                      continue L20;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    boolean f(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 < -21) {
          L0: {
            if (this.field_J <= 0) {
              break L0;
            } else {
              L1: {
                L2: {
                  var2 = this.field_M;
                  var3 = this.field_N;
                  fieldTemp$2 = this.field_I + 1;
                  this.field_I = this.field_I + 1;
                  if (this.field_J > fieldTemp$2) {
                    break L2;
                  } else {
                    this.field_J = 0;
                    this.h((byte) 38);
                    if (!Lexicominos.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = (2 * this.field_J + -this.field_I) * this.field_I;
                var5 = this.field_J * this.field_J;
                var3 = this.field_L + var4 * (-this.field_L + this.field_N) / var5;
                var2 = var4 * (-this.field_P + this.field_M) / var5 + this.field_P;
                break L1;
              }
              this.b(var2, -111, var3);
              break L0;
            }
          }
          return super.f((byte) -65);
        } else {
          return true;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if ((param2 ^ -1) >= -1) {
            this.b(param0, -95, param3);
            return;
        }
        this.field_J = param2;
        this.field_L = this.field_v;
        this.field_M = param0;
        this.field_N = param3;
        this.field_P = this.field_j;
        this.field_I = 0;
        int var5 = -2 % ((10 - param1) / 59);
    }

    public static void g(byte param0) {
        field_Q = null;
        if (param0 != 42) {
            field_O = -54;
        }
    }

    final static jb e(boolean param0) {
        if (param0) {
            return (jb) null;
        }
        jb var1 = new jb(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], be.field_f[0], ci.field_b);
        gk.a(12428);
        return var1;
    }

    boolean a(byte param0) {
        if (param0 != 26) {
            this.field_M = 112;
        }
        this.f(true);
        return super.a((byte) 26);
    }

    ql(eg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_J = 0;
        this.field_I = 0;
    }

    static {
        field_O = 640;
        field_K = false;
    }
}
