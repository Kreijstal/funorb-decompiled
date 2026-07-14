/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb extends ui {
    private int field_I;
    private int field_J;
    private int field_N;
    static int field_K;
    private int field_O;
    private int field_M;
    private int field_L;

    void b(int param0, int param1, int param2) {
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
        var16 = stellarshard.field_B;
        ti.c(param2 + 6, param1 + 35, -12 + ((tb) this).field_p, ((tb) this).field_t + -40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var4 <= var7) {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                am discarded$1 = tb.g((byte) 122);
                break L1;
              }
            }
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param1;
            L2: while (true) {
              if (var7 >= var4) {
                ul.field_B.e(-90 + (param2 - -((tb) this).field_p), 10 + param1);
                tf.a(-10 + ((tb) this).field_p, 2, qh.field_a, 5 + param2, param1 - -35);
                tf.a(((tb) this).field_p, 2, sa.field_g, param2, -22 + (param1 - -((tb) this).field_t));
                var4 = -79 + ((tb) this).field_t;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 + (-var5 + var6) * var7 / var4;
                    var9 = var9 | (var9 << -253570488 | var9 << -1673360912);
                    ti.g(param2, var8, 6, var9);
                    ti.g(((tb) this).field_p + param2 - 6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 818232040 | var9 << -1562946864);
                ti.g(param2, var8, 6, var9);
                ti.g(-6 + (param2 + ((tb) this).field_p), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (ti.field_f <= var8) {
              if (var8 < ti.field_l) {
                L4: {
                  var9 = var7 * (var6 + -var5) / var4 + var5;
                  var10 = 0;
                  var11 = ((tb) this).field_p;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L4;
                      } else {
                        var12 = (20 + -var10) * (-var10 + 20) + (20 - var7) * (-var7 + 20);
                        if (-463 <= (var12 ^ -1)) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (462 - var12) / 42;
                            var13 = var13 | (var13 << 939507240 | var13 << -1623490992);
                            ti.field_a[var10 + param2 + ti.field_i * var8] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var7 >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (-21 < var13) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                          if (-463 > (var14 ^ -1)) {
                            break L8;
                          } else {
                            if ((var14 ^ -1) <= -421) {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << 489443784 | var15 << 1030394128);
                              ti.field_a[var8 * ti.field_i - -param2 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 1097432520 | var9 << -1458085328);
                ti.g(var10 + param2, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    void j(int param0) {
        if (param0 != -21) {
            ((tb) this).field_I = 107;
            return;
        }
    }

    final static void f(byte param0) {
        ih.field_b = null;
        ak.field_c = null;
        if (param0 > -33) {
          field_K = 80;
          ih.field_d = null;
          gj.field_w = null;
          vi.field_c = null;
          vc.field_b = null;
          return;
        } else {
          ih.field_d = null;
          gj.field_w = null;
          vi.field_c = null;
          vc.field_b = null;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 < param0) {
          ((tb) this).field_O = 0;
          ((tb) this).field_M = ((tb) this).field_t;
          ((tb) this).field_J = param3;
          ((tb) this).field_L = param0;
          ((tb) this).field_I = ((tb) this).field_p;
          ((tb) this).field_N = param1;
          if (param2 != -97) {
            boolean discarded$2 = ((tb) this).d(true);
            return;
          } else {
            return;
          }
        } else {
          ((tb) this).a(param1, (byte) -91, param3);
          return;
        }
    }

    boolean h(int param0) {
        if (param0 <= 98) {
            return false;
        }
        ((tb) this).i(3642);
        return super.h(105);
    }

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (-1 <= (((tb) this).field_L ^ -1)) {
            break L0;
          } else {
            L1: {
              var2 = ((tb) this).field_N;
              var3 = ((tb) this).field_J;
              ((tb) this).field_O = ((tb) this).field_O + 1;
              if (((tb) this).field_O + 1 < ((tb) this).field_L) {
                var4 = (((tb) this).field_L * 2 + -((tb) this).field_O) * ((tb) this).field_O;
                var5 = ((tb) this).field_L * ((tb) this).field_L;
                var2 = ((tb) this).field_I + (((tb) this).field_N - ((tb) this).field_I) * var4 / var5;
                var3 = ((tb) this).field_M + (((tb) this).field_J - ((tb) this).field_M) * var4 / var5;
                break L1;
              } else {
                ((tb) this).field_L = 0;
                ((tb) this).j(-21);
                break L1;
              }
            }
            ((tb) this).a(var2, (byte) -13, var3);
            break L0;
          }
        }
        if (!param0) {
          ((tb) this).field_O = -55;
          return super.d(true);
        } else {
          return super.d(true);
        }
    }

    tb(ei param0, int param1, int param2) {
        super(param0, param1, param2);
        ((tb) this).field_O = 0;
        ((tb) this).field_L = 0;
    }

    void i(int param0) {
        if (0 >= ((tb) this).field_L) {
          return;
        } else {
          if (param0 != 3642) {
            ((tb) this).field_J = 125;
            ((tb) this).a(((tb) this).field_N, (byte) -27, ((tb) this).field_J);
            ((tb) this).field_L = 0;
            ((tb) this).j(-21);
            return;
          } else {
            ((tb) this).a(((tb) this).field_N, (byte) -27, ((tb) this).field_J);
            ((tb) this).field_L = 0;
            ((tb) this).j(-21);
            return;
          }
        }
    }

    final static am g(byte param0) {
        if (param0 != 118) {
          field_K = 94;
          return new am(rb.j(5), vj.b(18596));
        } else {
          return new am(rb.j(5), vj.b(18596));
        }
    }

    static {
    }
}
