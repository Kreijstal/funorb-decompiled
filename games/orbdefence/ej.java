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
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (-1 <= (this.field_G ^ -1)) {
        } else {
            var2 = this.field_H;
            var3 = this.field_L;
            fieldTemp$0 = this.field_K + 1;
            this.field_K = this.field_K + 1;
            if (this.field_G > fieldTemp$0) {
                var4 = this.field_K * (this.field_G * 2 + -this.field_K);
                var5 = this.field_G * this.field_G;
                var3 = var4 * (this.field_L + -this.field_M) / var5 + this.field_M;
                var2 = (-this.field_I + this.field_H) * var4 / var5 + this.field_I;
            } else {
                this.field_G = 0;
                this.n(6630);
            }
            this.a(var3, (byte) -81, var2);
        }
        if (param0) {
            ej.o(121);
        }
        return super.d(false);
    }

    boolean l(int param0) {
        this.m(0);
        if (param0 != 194) {
            return true;
        }
        return super.l(param0 + 0);
    }

    void m(int param0) {
        if (!((this.field_G ^ -1) < -1)) {
            return;
        }
        this.a(this.field_L, (byte) -81, this.field_H);
        this.field_G = param0;
        this.n(6630);
    }

    void n(int param0) {
        if (param0 != 6630) {
            this.m(63);
        }
    }

    ej(sk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_K = 0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
            this.a(param2, (byte) -81, param1);
            return;
        }
        this.field_L = param2;
        if (param3 != 114) {
            return;
        }
        this.field_G = param0;
        this.field_M = this.field_r;
        this.field_K = 0;
        this.field_I = this.field_m;
        this.field_H = param1;
    }

    public static void o(int param0) {
        field_J = null;
        if (param0 != -15640) {
            field_J = (String[]) null;
        }
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
        ul.a(6 + param0, 35 + param1, -12 + this.field_m, -40 + this.field_r, 2105376, 0);
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
                qe.field_c.c(-90 + param0 + this.field_m, param1 - -10);
                sa.a(param2 ^ param2, sd.field_f, param0 - -5, this.field_m - 10, 35 + param1);
                sa.a(param2 ^ -9111, he.field_y, param0, this.field_m, -22 + (param1 + this.field_r));
                var6 = 127;
                var4 = -79 + this.field_r;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param1;
                L2: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + (-var5 + var6) * var7 / var4;
                    var9 = var9 | (var9 << -1237452048 | var9 << -2056350616);
                    ul.d(param0, var8, 6, var9);
                    ul.d(param0 - (-this.field_m + 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << -328650648 | var9 << -1575026096);
                ul.d(param0, var8, 6, var9);
                ul.d(-6 + param0 - -this.field_m, var8, 6, var9);
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
                  var11 = this.field_m;
                  if ((var7 ^ -1) >= -21) {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (20 + -var7) + (-var10 + 20) * (-var10 + 20);
                        if (462 >= var12) {
                          if (420 <= var12) {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << -1977607824 | var13 << -1136870744);
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
                        if (-21 > (var13 ^ -1)) {
                          break L7;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (-var7 + 20);
                          if (var14 <= 462) {
                            if (-421 < (var14 ^ -1)) {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 200909128 | var15 << 322289968);
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
                var9 = var9 | (var9 << -1131864792 | var9 << 193723600);
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
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
