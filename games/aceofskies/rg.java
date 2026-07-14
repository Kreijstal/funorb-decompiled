/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg extends gm {
    private int field_B;
    private int field_H;
    private int field_I;
    static nf field_A;
    private int field_E;
    static String field_C;
    private int field_G;
    private int field_D;
    static ll[] field_F;

    void a(boolean param0, int param1, int param2) {
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
        var16 = AceOfSkies.field_G ? 1 : 0;
        vp.c(param1 - -6, param2 - -35, -12 + ((rg) this).field_q, ((rg) this).field_n + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (!param0) {
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var4 <= var7) {
              var5 = 194;
              var6 = 169;
              var4 = 22;
              var7 = 0;
              var8 = 35 + param2;
              L1: while (true) {
                if (var7 >= var4) {
                  eo.field_b.b(-90 + (param1 - -((rg) this).field_q), param2 - -10);
                  cf.a(ip.field_c, param1 + 5, (byte) -121, 35 + param2, ((rg) this).field_q + -10);
                  cf.a(uc.field_k, param1, (byte) -114, ((rg) this).field_n + param2 + -22, ((rg) this).field_q);
                  var4 = ((rg) this).field_n - 79;
                  var6 = 127;
                  var5 = 169;
                  var7 = 0;
                  var8 = param2 - -57;
                  L2: while (true) {
                    if (var4 <= var7) {
                      return;
                    } else {
                      var9 = var7 * (var6 + -var5) / var4 + var5;
                      var9 = var9 | (var9 << -1846936440 | var9 << 1346034512);
                      vp.b(param1, var8, 6, var9);
                      vp.b(-6 + ((rg) this).field_q + param1, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = (var6 - var5) * var7 / var4 + var5;
                  var9 = var9 | (var9 << -202932056 | var9 << -369721552);
                  vp.b(param1, var8, 6, var9);
                  vp.b(((rg) this).field_q + param1 + -6, var8, 6, var9);
                  var8++;
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (vp.field_f <= var8) {
                if (var8 < vp.field_d) {
                  L3: {
                    var9 = var5 + (var6 + -var5) * var7 / var4;
                    var10 = 0;
                    var11 = ((rg) this).field_q;
                    if (var7 > 20) {
                      break L3;
                    } else {
                      L4: while (true) {
                        if ((var10 ^ -1) < -21) {
                          break L3;
                        } else {
                          var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                          if (-463 <= var12) {
                            if (-421 <= var12) {
                              var13 = (462 + -var12) * var9 / 42;
                              var13 = var13 | (var13 << 433267976 | var13 << 1369207728);
                              vp.field_j[var10 + param1 + var8 * vp.field_i] = var13;
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
                    }
                  }
                  L5: {
                    if (var7 >= -21) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (-21 < var13) {
                            break L7;
                          } else {
                            var14 = var13 * var13 + (20 + -var7) * (20 + -var7);
                            if (var14 > 462) {
                              break L7;
                            } else {
                              if ((var14 ^ -1) > -421) {
                                var12 = 1 + var11;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var15 = (462 - var14) * var9 / 42;
                                var15 = var15 | (var15 << -1076661264 | var15 << -769494744);
                                vp.field_j[var8 * vp.field_i + param1 - -var11] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              }
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
                  var9 = var9 | (var9 << 435855880 | var9 << 1448663056);
                  vp.b(param1 + var10, var8, -var10 + var11, var9);
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
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!((param3 ^ -1) < -1)) {
            ((rg) this).a(param2, (byte) 29, param1);
            return;
        }
        ((rg) this).field_G = ((rg) this).field_n;
        ((rg) this).field_H = param1;
        ((rg) this).field_D = 0;
        ((rg) this).field_E = ((rg) this).field_q;
        int var5 = 28 / ((param0 - 21) / 32);
        ((rg) this).field_I = param3;
        ((rg) this).field_B = param2;
    }

    void e(byte param0) {
        if (!(((rg) this).field_I > 0)) {
            return;
        }
        ((rg) this).a(((rg) this).field_B, (byte) 29, ((rg) this).field_H);
        ((rg) this).field_I = 0;
        ((rg) this).f((byte) -89);
        if (param0 < 26) {
            ((rg) this).e((byte) 41);
        }
    }

    boolean i(int param0) {
        int var2 = -13 % ((param0 - 20) / 62);
        ((rg) this).e((byte) 36);
        return this.i(112);
    }

    final static void a(int param0, boolean param1, rh param2, int param3) {
        if (!(param2 != null)) {
            return;
        }
        param2.b(-2580, param0);
        param2.a(-128, param3);
        if (param1) {
            rh var5 = (rh) null;
            rg.a(53, false, (rh) null, -102);
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_A = (nf) null;
        }
        field_F = null;
        field_A = null;
        field_C = null;
    }

    void f(byte param0) {
        if (param0 > -28) {
            rg.d(true);
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 11) {
            ((rg) this).a(1, 39, 77, -45);
        }
        if ((((rg) this).field_I ^ -1) >= -1) {
        } else {
            var2 = ((rg) this).field_B;
            var3 = ((rg) this).field_H;
            ((rg) this).field_D = ((rg) this).field_D + 1;
            if (((rg) this).field_D + 1 >= ((rg) this).field_I) {
                ((rg) this).field_I = 0;
                ((rg) this).f((byte) -85);
            } else {
                var4 = (2 * ((rg) this).field_I + -((rg) this).field_D) * ((rg) this).field_D;
                var5 = ((rg) this).field_I * ((rg) this).field_I;
                var2 = var4 * (-((rg) this).field_E + ((rg) this).field_B) / var5 + ((rg) this).field_E;
                var3 = (-((rg) this).field_G + ((rg) this).field_H) * var4 / var5 + ((rg) this).field_G;
            }
            ((rg) this).a(var2, (byte) 29, var3);
        }
        return this.h(param0 + 0);
    }

    rg(lt param0, int param1, int param2) {
        super(param0, param1, param2);
        ((rg) this).field_I = 0;
        ((rg) this).field_D = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "menu_select";
        field_A = new nf();
    }
}
