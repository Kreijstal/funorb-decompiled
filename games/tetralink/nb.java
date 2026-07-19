/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb extends ld {
    static String field_W;
    static mh field_V;
    private int field_Q;
    private int field_P;
    private int field_S;
    private int field_O;
    private int field_R;
    private int field_U;
    static String field_T;

    void a(boolean param0) {
        if ((this.field_S ^ -1) >= -1) {
            return;
        }
        this.a(this.field_R, (byte) 48, this.field_Q);
        this.field_S = 0;
        this.m(-7718);
        if (!param0) {
            field_V = (mh) null;
        }
    }

    void m(int param0) {
        if (param0 != -7718) {
            this.a(false, -93, 109, -69);
        }
    }

    nb(pk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_P = 0;
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > (this.field_S ^ -1)) {
            var2 = this.field_R;
            var3 = this.field_Q;
            fieldTemp$0 = this.field_P + 1;
            this.field_P = this.field_P + 1;
            if (this.field_S <= fieldTemp$0) {
                this.field_S = 0;
                this.m(-7718);
            } else {
                var4 = this.field_P * (-this.field_P + 2 * this.field_S);
                var5 = this.field_S * this.field_S;
                var2 = (this.field_R - this.field_O) * var4 / var5 + this.field_O;
                var3 = var4 * (-this.field_U + this.field_Q) / var5 + this.field_U;
            }
            this.a(var2, (byte) 69, var3);
        }
        return super.l(-1);
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
        var16 = TetraLink.field_J;
        ra.b(param2 + 6, param0 + 35, -12 + this.field_F, this.field_u - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = param0 + 35;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  if (param1 > 66) {
                    break L2;
                  } else {
                    field_W = (String) null;
                    break L2;
                  }
                }
                ac.field_c.c(this.field_F + (param2 + -90), 10 + param0);
                gh.a(-10 + this.field_F, param2 + 5, param0 + 35, hn.field_O, -125);
                gh.a(this.field_F, param2, this.field_u + (param0 + -22), mc.field_i, -125);
                var4 = -79 + this.field_u;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param0 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (var6 + -var5) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -1814073592 | var9 << -908753040);
                    ra.g(param2, var8, 6, var9);
                    ra.g(-6 + (this.field_F + param2), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << -1985692688 | var9 << 178537256);
                ra.g(param2, var8, 6, var9);
                ra.g(-6 + (param2 - -this.field_F), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (ra.field_i <= var8) {
              if (var8 < ra.field_g) {
                L4: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_F;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (462 >= var12) {
                          if (-421 >= (var12 ^ -1)) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << 158917416 | var13 << 652390224);
                            ra.field_b[ra.field_f * var8 - (-param2 - var10)] = var13;
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
                  if (20 >= var7) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (-463 > (var14 ^ -1)) {
                            break L8;
                          } else {
                            if (420 > var14) {
                              var12 = var11 + 1;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << -959608624 | var15 << -1245365944);
                              ra.field_b[var11 + var8 * ra.field_f + param2] = var15;
                              var11++;
                              var13++;
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
                var9 = var9 | (var9 << 1934566160 | var9 << -371609336);
                ra.g(param2 + var10, var8, -var10 + var11, var9);
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

    public static void n(int param0) {
        field_V = null;
        field_W = null;
        if (param0 != -463) {
            field_V = (mh) null;
        }
        field_T = null;
    }

    boolean h(int param0) {
        boolean discarded$0 = false;
        this.a(true);
        if (param0 != 652390224) {
            discarded$0 = this.h(37);
        }
        return super.h(param0 + 0);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (-1 <= (param1 ^ -1)) {
            this.a(param2, (byte) 70, param3);
            return;
        }
        if (!param0) {
            this.a(false, -128, -93, -15);
        }
        this.field_R = param2;
        this.field_O = this.field_F;
        this.field_U = this.field_u;
        this.field_P = 0;
        this.field_Q = param3;
        this.field_S = param1;
    }

    final static void a(int param0, byte param1) {
        int var2 = 21 / ((-78 - param1) / 33);
        int var3 = (-640 + cf.field_n) / 2;
        int var4 = ma.field_f * ma.field_f;
        int var5 = -(param0 * param0) + var4;
        tl.field_P.a((byte) -110, 199, 90, -90 + ra.field_e + -124, var3 - var5 * 199 / var4);
        fk.field_V.a((byte) -107, 438, 0, -4 + (ra.field_e + -120), var5 * 438 / var4 + var3 + 202);
    }

    static {
        field_W = "Password is valid";
        field_T = "Back";
        field_V = new mh();
    }
}
