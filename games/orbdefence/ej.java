/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej extends sg {
    private int field_G;
    static String[] field_J;
    private int field_M;
    private int field_I;
    private int field_L;
    private int field_K;
    private int field_H;

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((ej) this).field_G <= 0) {
        } else {
            var2 = ((ej) this).field_H;
            var3 = ((ej) this).field_L;
            int fieldTemp$0 = ((ej) this).field_K + 1;
            ((ej) this).field_K = ((ej) this).field_K + 1;
            if (((ej) this).field_G > fieldTemp$0) {
                var4 = ((ej) this).field_K * (((ej) this).field_G * 2 + -((ej) this).field_K);
                var5 = ((ej) this).field_G * ((ej) this).field_G;
                var3 = var4 * (((ej) this).field_L + -((ej) this).field_M) / var5 + ((ej) this).field_M;
                var2 = (-((ej) this).field_I + ((ej) this).field_H) * var4 / var5 + ((ej) this).field_I;
            } else {
                ((ej) this).field_G = 0;
                ((ej) this).n(6630);
            }
            ((ej) this).a(var3, (byte) -81, var2);
        }
        return super.d(false);
    }

    boolean l(int param0) {
        ((ej) this).m(0);
        return super.l(194);
    }

    void m(int param0) {
        if (!(((ej) this).field_G > 0)) {
            return;
        }
        ((ej) this).a(((ej) this).field_L, (byte) -81, ((ej) this).field_H);
        ((ej) this).field_G = param0;
        ((ej) this).n(6630);
    }

    void n(int param0) {
        if (param0 != 6630) {
            ((ej) this).m(63);
        }
    }

    ej(sk param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ej) this).field_G = 0;
        ((ej) this).field_K = 0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
            ((ej) this).a(param2, (byte) -81, param1);
            return;
        }
        ((ej) this).field_L = param2;
        if (param3 != 114) {
            return;
        }
        ((ej) this).field_G = param0;
        ((ej) this).field_M = ((ej) this).field_r;
        ((ej) this).field_K = 0;
        ((ej) this).field_I = ((ej) this).field_m;
        ((ej) this).field_H = param1;
    }

    public static void o() {
        field_J = null;
    }

    void a(int param0, int param1, int param2) {
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
        var16 = OrbDefence.field_D ? 1 : 0;
        ul.a(6 + param0, 35 + param1, -12 + ((ej) this).field_m, -40 + ((ej) this).field_r, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = param1 + 35;
            L1: while (true) {
              if (var7 >= var4) {
                qe.field_c.c(-90 + param0 + ((ej) this).field_m, param1 - -10);
                sa.a(param2 ^ param2, sd.field_f, param0 - -5, ((ej) this).field_m - 10, 35 + param1);
                sa.a(param2 ^ -9111, he.field_y, param0, ((ej) this).field_m, -22 + (param1 + ((ej) this).field_r));
                var6 = 127;
                var4 = -79 + ((ej) this).field_r;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param1;
                L2: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + (-var5 + var6) * var7 / var4;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    ul.d(param0, var8, 6, var9);
                    ul.d(param0 - (-((ej) this).field_m + 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << 8 | var9 << 16);
                ul.d(param0, var8, 6, var9);
                ul.d(-6 + param0 - -((ej) this).field_m, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= ul.field_d) {
              if (var8 < ul.field_a) {
                L3: {
                  var9 = var5 + (var6 - var5) * var7 / var4;
                  var10 = 0;
                  var11 = ((ej) this).field_m;
                  if (var7 <= 20) {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (20 + -var7) + (-var10 + 20) * (-var10 + 20);
                        if (462 >= var12) {
                          if (420 <= var12) {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << 16 | var13 << 8);
                            ul.field_b[ul.field_f * var8 + (param0 + var10)] = var13;
                            var10++;
                            continue L4;
                          } else {
                            break L3;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (-var7 + 20);
                          if (var14 <= 462) {
                            if (var14 < 420) {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              ul.field_b[ul.field_f * var8 + param0 - -var11] = var15;
                              var11++;
                              var13++;
                              continue L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var12;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var9 = var9 | (var9 << 8 | var9 << 16);
                ul.d(var10 + param0, var8, var11 - var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
