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
            this.field_M = -100;
        }
    }

    public static void g(byte param0) {
        field_H = null;
        if (param0 != 38) {
            field_H = (String) null;
        }
    }

    final static void h(byte param0) {
        oh.a(param0 + 23, 4);
        if (param0 != -124) {
            field_G = -55;
        }
    }

    void i(byte param0) {
        if (this.field_M <= 0) {
            return;
        }
        this.c(-463076575, this.field_L, this.field_F);
        this.field_M = 0;
        this.l(-4993);
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
        L0: {
          var16 = Bounce.field_N;
          if (param1 < -6) {
            break L0;
          } else {
            this.field_K = -102;
            break L0;
          }
        }
        na.b(param2 + 6, param0 + 35, -12 + this.field_k, this.field_m + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L1: while (true) {
          if (var7 >= var4) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param0 - -35;
            L2: while (true) {
              if (var7 >= var4) {
                fd.field_m.a(this.field_k + (param2 + -90), 10 + param0);
                gk.a(param2 - -5, 1, ij.field_c, param0 - -35, -10 + this.field_k);
                gk.a(param2, 1, de.field_d, -22 + (param0 + this.field_m), this.field_k);
                var4 = this.field_m - 79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param0 - -57;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 55552080 | var9 << 1932263848);
                    na.a(param2, var8, 6, var9);
                    na.a(this.field_k + (param2 - 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + var7 * (var6 + -var5) / var4;
                var9 = var9 | (var9 << -1340157976 | var9 << -574208848);
                na.a(param2, var8, 6, var9);
                na.a(-6 + (param2 + this.field_k), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= na.field_i) {
              if (var8 < na.field_f) {
                L4: {
                  var9 = var7 * (var6 - var5) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_k;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (20 - var7) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (462 >= var12) {
                          if (420 <= var12) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << -1566923480 | var13 << 19501328);
                            na.field_d[var10 + (na.field_e * var8 + param2)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (var7 > 20) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                          if ((var14 ^ -1) >= -463) {
                            if (-421 >= (var14 ^ -1)) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << 955032712 | var15 << -580817584);
                              na.field_d[param2 + na.field_e * var8 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = 1 + var11;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -1057784816 | var9 << -1588613016);
                na.a(var10 + param2, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L1;
              } else {
                var7++;
                var8++;
                continue L1;
              }
            } else {
              var7++;
              var8++;
              continue L1;
            }
          }
        }
    }

    boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 21) {
            return true;
        }
        if (0 < this.field_M) {
            var2 = this.field_L;
            var3 = this.field_F;
            fieldTemp$0 = this.field_K + 1;
            this.field_K = this.field_K + 1;
            if (this.field_M > fieldTemp$0) {
                var4 = this.field_K * (this.field_M * 2 + -this.field_K);
                var5 = this.field_M * this.field_M;
                var3 = this.field_J - -((this.field_F + -this.field_J) * var4 / var5);
                var2 = (-this.field_I + this.field_L) * var4 / var5 + this.field_I;
            } else {
                this.field_M = 0;
                this.l(-4993);
            }
            this.c(-463076575, var2, var3);
        }
        return super.e((byte) 21);
    }

    boolean f(byte param0) {
        if (param0 != -33) {
            return false;
        }
        this.i((byte) 117);
        return super.f((byte) -33);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(0 < param1)) {
            this.c(-463076575, param3, param2);
            return;
        }
        this.field_L = param3;
        if (param0 != 126) {
            wk.g((byte) 74);
        }
        this.field_F = param2;
        this.field_I = this.field_k;
        this.field_J = this.field_m;
        this.field_K = 0;
        this.field_M = param1;
    }

    wk(pf param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_M = 0;
        this.field_K = 0;
    }

    static {
        field_H = "Player";
    }
}
