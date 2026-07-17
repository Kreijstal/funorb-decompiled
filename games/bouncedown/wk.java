/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wk extends ri {
    private int field_K;
    private int field_J;
    static int field_G;
    static String field_H;
    private int field_F;
    private int field_I;
    private int field_M;
    private int field_L;

    void l(int param0) {
        if (param0 != -4993) {
            ((wk) this).field_M = -100;
        }
    }

    public static void g(byte param0) {
        field_H = null;
        if (param0 != 38) {
            field_H = null;
        }
    }

    final static void h(byte param0) {
        oh.a(-101, 4);
    }

    void i(byte param0) {
        if (((wk) this).field_M <= 0) {
            return;
        }
        ((wk) this).c(-463076575, ((wk) this).field_L, ((wk) this).field_F);
        ((wk) this).field_M = 0;
        ((wk) this).l(-4993);
        int var2 = -109 / ((param0 - 31) / 35);
    }

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
        var16 = Bounce.field_N;
        na.b(param2 + 6, param0 + 35, -12 + ((wk) this).field_k, ((wk) this).field_m + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (~var7 <= ~var4) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param0 - -35;
            L1: while (true) {
              if (~var7 <= ~var4) {
                fd.field_m.a(((wk) this).field_k + (param2 + -90), 10 + param0);
                gk.a(param2 - -5, 1, ij.field_c, param0 - -35, -10 + ((wk) this).field_k);
                gk.a(param2, 1, de.field_d, -22 + (param0 + ((wk) this).field_m), ((wk) this).field_k);
                var4 = ((wk) this).field_m - 79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param0 - -57;
                L2: while (true) {
                  if (~var4 >= ~var7) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    na.a(param2, var8, 6, var9);
                    na.a(((wk) this).field_k + (param2 - 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var5 + var7 * (var6 + -var5) / var4;
                var9 = var9 | (var9 << 8 | var9 << 16);
                na.a(param2, var8, 6, var9);
                na.a(-6 + (param2 + ((wk) this).field_k), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            L3: {
              if (~var8 > ~na.field_i) {
                break L3;
              } else {
                if (var8 < na.field_f) {
                  L4: {
                    var9 = var7 * (var6 - var5) / var4 + var5;
                    var10 = 0;
                    var11 = ((wk) this).field_k;
                    if (20 < var7) {
                      break L4;
                    } else {
                      L5: while (true) {
                        if (var10 > 20) {
                          break L4;
                        } else {
                          L6: {
                            var12 = (20 - var7) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                            if (462 < var12) {
                              break L6;
                            } else {
                              if (420 <= var12) {
                                var13 = (-var12 + 462) * var9 / 42;
                                var13 = var13 | (var13 << 8 | var13 << 16);
                                na.field_d[var10 + (na.field_e * var8 + param2)] = var13;
                                break L6;
                              } else {
                                break L4;
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
                    if (var7 > 20) {
                      break L7;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L8: while (true) {
                        L9: {
                          if (20 < var13) {
                            break L9;
                          } else {
                            var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                            if (var14 <= 462) {
                              L10: {
                                if (var14 >= 420) {
                                  var15 = (462 + -var14) * var9 / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  na.field_d[param2 + na.field_e * var8 - -var11] = var15;
                                  break L10;
                                } else {
                                  var12 = 1 + var11;
                                  break L10;
                                }
                              }
                              var13++;
                              var11++;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var11 = var12;
                        break L7;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  na.a(var10 + param2, var8, -var10 + var11, var9);
                  break L3;
                } else {
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

    boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (0 < ((wk) this).field_M) {
            var2 = ((wk) this).field_L;
            var3 = ((wk) this).field_F;
            int fieldTemp$0 = ((wk) this).field_K + 1;
            ((wk) this).field_K = ((wk) this).field_K + 1;
            if (((wk) this).field_M > fieldTemp$0) {
                var4 = ((wk) this).field_K * (((wk) this).field_M * 2 + -((wk) this).field_K);
                var5 = ((wk) this).field_M * ((wk) this).field_M;
                var3 = ((wk) this).field_J - -((((wk) this).field_F + -((wk) this).field_J) * var4 / var5);
                var2 = (-((wk) this).field_I + ((wk) this).field_L) * var4 / var5 + ((wk) this).field_I;
            } else {
                ((wk) this).field_M = 0;
                ((wk) this).l(-4993);
            }
            ((wk) this).c(-463076575, var2, var3);
        }
        return super.e((byte) 21);
    }

    boolean f(byte param0) {
        ((wk) this).i((byte) 117);
        return super.f((byte) -33);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(0 < param1)) {
            ((wk) this).c(-463076575, param3, param2);
            return;
        }
        ((wk) this).field_L = param3;
        if (param0 != 126) {
            wk.g((byte) 74);
        }
        ((wk) this).field_F = param2;
        ((wk) this).field_I = ((wk) this).field_k;
        ((wk) this).field_J = ((wk) this).field_m;
        ((wk) this).field_K = 0;
        ((wk) this).field_M = param1;
    }

    wk(pf param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wk) this).field_M = 0;
        ((wk) this).field_K = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Player";
    }
}
