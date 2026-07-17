/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class im extends bb {
    private int field_F;
    private int field_I;
    private int field_H;
    static gq field_J;
    private int field_G;
    private int field_M;
    private int field_K;
    static vg field_L;
    static int field_E;

    void b(int param0, int param1, byte param2) {
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
        var16 = Torquing.field_u;
        ph.a(param1 + 6, 35 + param0, ((im) this).field_p - 12, ((im) this).field_o - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var4 <= var7) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = 35 + param0;
            L1: while (true) {
              if (var4 <= var7) {
                rp.field_h.d(param1 + ((im) this).field_p - 90, 10 + param0);
                hg.a(false, param1 - -5, ((im) this).field_p - 10, 35 + param0, hh.field_b);
                hg.a(false, param1, ((im) this).field_p, -22 + (param0 + ((im) this).field_o), vf.field_i);
                var5 = 169;
                var4 = ((im) this).field_o + -79;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param0;
                L2: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + var7 * (var6 - var5) / var4;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    ph.b(param1, var8, 6, var9);
                    ph.b(param1 + ((im) this).field_p + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
                ph.b(param1, var8, 6, var9);
                ph.b(param1 + ((im) this).field_p + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            L3: {
              if (var8 < ph.field_c) {
                break L3;
              } else {
                if (~ph.field_h >= ~var8) {
                  break L3;
                } else {
                  L4: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = ((im) this).field_p;
                    if (var7 > 20) {
                      break L4;
                    } else {
                      L5: while (true) {
                        if (var10 > 20) {
                          break L4;
                        } else {
                          L6: {
                            var12 = (-var7 + 20) * (-var7 + 20) + (20 + -var10) * (20 + -var10);
                            if (var12 > 462) {
                              break L6;
                            } else {
                              if (var12 < 420) {
                                break L4;
                              } else {
                                var13 = (462 + -var12) * var9 / 42;
                                var13 = var13 | (var13 << 8 | var13 << 16);
                                ph.field_e[var10 + (param1 + var8 * ph.field_j)] = var13;
                                break L6;
                              }
                            }
                          }
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                  L7: {
                    if (var7 <= 20) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L8: while (true) {
                        L9: {
                          if (var13 > 20) {
                            break L9;
                          } else {
                            var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                            if (var14 <= 462) {
                              L10: {
                                if (420 <= var14) {
                                  var15 = (462 - var14) * var9 / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  ph.field_e[param1 + (var8 * ph.field_j - -var11)] = var15;
                                  break L10;
                                } else {
                                  var12 = 1 + var11;
                                  break L10;
                                }
                              }
                              var11++;
                              var13++;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var11 = var12;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  ph.b(var10 + param1, var8, -var10 + var11, var9);
                  break L3;
                }
              }
            }
            var7++;
            var8++;
            continue L0;
          }
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        if (!(0 < param2)) {
            ((im) this).a(param3, (byte) -25, param0);
            return;
        }
        ((im) this).field_H = param0;
        ((im) this).field_M = ((im) this).field_o;
        if (param1 != -15) {
            boolean discarded$0 = im.l(59);
        }
        ((im) this).field_I = ((im) this).field_p;
        ((im) this).field_G = param3;
        ((im) this).field_K = param2;
        ((im) this).field_F = 0;
    }

    boolean a(byte param0) {
        ((im) this).j(0);
        return super.a((byte) 122);
    }

    final static boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 169) {
          L0: {
            L1: {
              if (w.field_G == null) {
                break L1;
              } else {
                if (null == w.field_G.a(0)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    void j(int param0) {
        if (!(((im) this).field_K > 0)) {
            return;
        }
        ((im) this).a(((im) this).field_G, (byte) -25, ((im) this).field_H);
        ((im) this).field_K = param0;
        ((im) this).g((byte) 126);
    }

    void g(byte param0) {
        if (param0 < 122) {
            ((im) this).field_I = -51;
        }
    }

    im(ln param0, int param1, int param2) {
        super(param0, param1, param2);
        ((im) this).field_F = 0;
        ((im) this).field_K = 0;
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 < ((im) this).field_K) {
            var2 = ((im) this).field_G;
            var3 = ((im) this).field_H;
            int fieldTemp$0 = ((im) this).field_F + 1;
            ((im) this).field_F = ((im) this).field_F + 1;
            if (((im) this).field_K <= fieldTemp$0) {
                ((im) this).field_K = 0;
                ((im) this).g((byte) 124);
            } else {
                var4 = ((im) this).field_F * (2 * ((im) this).field_K + -((im) this).field_F);
                var5 = ((im) this).field_K * ((im) this).field_K;
                var2 = (((im) this).field_G + -((im) this).field_I) * var4 / var5 + ((im) this).field_I;
                var3 = ((im) this).field_M + (((im) this).field_H + -((im) this).field_M) * var4 / var5;
            }
            ((im) this).a(var2, (byte) -25, var3);
        }
        return super.h(-7);
    }

    public static void k() {
        field_J = null;
        field_L = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new gq(3);
        field_L = new vg();
        field_E = -1;
    }
}
