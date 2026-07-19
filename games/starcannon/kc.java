/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc extends qd {
    static int field_Q;
    static wd field_P;
    private int field_R;
    static int field_S;
    private int field_K;
    static int field_M;
    private int field_J;
    static String field_U;
    static String[] field_N;
    private int field_I;
    private int field_L;
    static byte[][][] field_O;
    private int field_T;

    boolean i(int param0) {
        this.j(-126);
        if (param0 >= -121) {
            return false;
        }
        return super.i(-125);
    }

    void j(int param0) {
        if (param0 > -104) {
            return;
        }
        if (!(0 < this.field_K)) {
            return;
        }
        this.b(this.field_J, (byte) 57, this.field_L);
        this.field_K = 0;
        this.k(-108);
    }

    kc(tc param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_I = 0;
    }

    public static void a(boolean param0) {
        if (param0) {
            kc.a(false);
        }
        field_P = null;
        field_U = null;
        field_N = null;
        field_O = (byte[][][]) null;
    }

    void c(int param0, byte param1, int param2) {
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
        var16 = StarCannon.field_A;
        ki.e(param0 + 6, 35 + param2, -12 + this.field_i, this.field_f - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var7 >= var4) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var8 = 77 / ((-57 - param1) / 53);
            var7 = 0;
            var9 = param2 + 35;
            L1: while (true) {
              if (var4 <= var7) {
                jk.field_g.e(this.field_i + param0 + -90, 10 + param2);
                wj.a(112, ed.field_o, param0 - -5, 35 + param2, this.field_i - 10);
                wj.a(121, ti.field_e, param0, this.field_f + (param2 - 22), this.field_i);
                var5 = 169;
                var4 = this.field_f + -79;
                var6 = 127;
                var7 = 0;
                var8 = param2 + 57;
                L2: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << 772155696 | var9 << -435085080);
                    ki.b(param0, var8, 6, var9);
                    ki.b(this.field_i + param0 - 6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var10 = var5 + (-var5 + var6) * var7 / var4;
                var10 = var10 | (var10 << 630877840 | var10 << -921811256);
                ki.b(param0, var9, 6, var10);
                ki.b(this.field_i + param0 + -6, var9, 6, var10);
                var9++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (ki.field_e <= var8) {
              if (var8 < ki.field_i) {
                L3: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_i;
                  if (var7 > 20) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (20 + -var7) - -((20 - var10) * (-var10 + 20));
                        if (var12 <= 462) {
                          if (-421 >= (var12 ^ -1)) {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << -1118282736 | var13 << -191605208);
                            ki.field_a[param0 + (ki.field_j * var8 - -var10)] = var13;
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
                  if ((var7 ^ -1) >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                          if (var14 > 462) {
                            break L7;
                          } else {
                            if (-421 >= (var14 ^ -1)) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << 1303633616 | var15 << -1979388888);
                              ki.field_a[var11 + param0 + var8 * ki.field_j] = var15;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var12 = 1 + var11;
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
                var9 = var9 | (var9 << 218242128 | var9 << -1795774296);
                ki.b(var10 + param0, var8, -var10 + var11, var9);
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

    final void b(int param0, int param1, byte param2, int param3) {
        if ((param3 ^ -1) >= -1) {
            this.b(param0, (byte) 57, param1);
            return;
        }
        this.field_R = this.field_f;
        if (param2 != 120) {
            kc.a(false);
        }
        this.field_L = param1;
        this.field_I = 0;
        this.field_T = this.field_i;
        this.field_K = param3;
        this.field_J = param0;
    }

    void k(int param0) {
        if (param0 > -74) {
            this.b(46, -67, (byte) -11, -33);
        }
    }

    boolean g(byte param0) {
        boolean discarded$0 = false;
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$1 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -124) {
            discarded$0 = this.g((byte) -68);
        }
        if (-1 > (this.field_K ^ -1)) {
            var2 = this.field_J;
            var3 = this.field_L;
            fieldTemp$1 = this.field_I + 1;
            this.field_I = this.field_I + 1;
            if (this.field_K <= fieldTemp$1) {
                this.field_K = 0;
                this.k(-101);
            } else {
                var4 = (2 * this.field_K + -this.field_I) * this.field_I;
                var5 = this.field_K * this.field_K;
                var2 = var4 * (-this.field_T + this.field_J) / var5 + this.field_T;
                var3 = var4 * (this.field_L + -this.field_R) / var5 + this.field_R;
            }
            this.b(var2, (byte) 57, var3);
        }
        return super.g((byte) -124);
    }

    static {
        field_Q = 0;
        field_N = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_U = "Waiting for music";
    }
}
