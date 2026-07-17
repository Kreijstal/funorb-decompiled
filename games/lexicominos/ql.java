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
        if (0 >= ((ql) this).field_J) {
            return;
        }
        if (!param0) {
            ql.g((byte) -79);
        }
        ((ql) this).b(((ql) this).field_M, -120, ((ql) this).field_N);
        ((ql) this).field_J = 0;
        ((ql) this).h((byte) 38);
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
        var16 = Lexicominos.field_L ? 1 : 0;
        lf.a(6 + param2, 35 + param0, ((ql) this).field_j - 12, ((ql) this).field_v + -40, 2105376, 0);
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
            var8 = param0 + 35;
            L1: while (true) {
              if (var4 <= var7) {
                Lexicominos.field_I.d(-90 + (((ql) this).field_j + param2), param0 - -10);
                ac.a(true, param0 - -35, ti.field_I, param2 - -5, ((ql) this).field_j - 10);
                ac.a(true, -22 + param0 - -((ql) this).field_v, we.field_i, param2, ((ql) this).field_j);
                var6 = 127;
                var5 = 169;
                var4 = -79 + ((ql) this).field_v;
                var7 = -113 / ((-3 - param1) / 43);
                var8 = 0;
                var9 = 57 + param0;
                L2: while (true) {
                  if (var8 >= var4) {
                    return;
                  } else {
                    var10 = var5 - -(var8 * (var6 + -var5) / var4);
                    var10 = var10 | (var10 << 8 | var10 << 16);
                    lf.a(param2, var9, 6, var10);
                    lf.a(((ql) this).field_j + param2 + -6, var9, 6, var10);
                    var8++;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var9 = (var6 - var5) * var7 / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
                lf.a(param2, var8, 6, var9);
                lf.a(((ql) this).field_j + (param2 + -6), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (lf.field_c <= var8) {
              if (lf.field_h > var8) {
                L3: {
                  var9 = var5 + (-var5 + var6) * var7 / var4;
                  var10 = 0;
                  var11 = ((ql) this).field_j;
                  if (var7 > 20) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (20 < var10) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (20 + -var7) + (-var10 + 20) * (20 + -var10);
                        if (462 >= var12) {
                          if (var12 >= 420) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << 16 | var13 << 8);
                            lf.field_b[param2 + (var8 * lf.field_f + var10)] = var13;
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
                  if (var7 > 20) {
                    break L5;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (-var7 + 20);
                          if (var14 <= 462) {
                            if (var14 >= 420) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              lf.field_b[var11 + lf.field_f * var8 + param2] = var15;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var12 = 1 + var11;
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
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                lf.a(param2 + var10, var8, var11 - var10, var9);
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

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((ql) this).field_J > 0) {
            var2 = ((ql) this).field_M;
            var3 = ((ql) this).field_N;
            int fieldTemp$0 = ((ql) this).field_I + 1;
            ((ql) this).field_I = ((ql) this).field_I + 1;
            if (((ql) this).field_J <= fieldTemp$0) {
                ((ql) this).field_J = 0;
                ((ql) this).h((byte) 38);
            } else {
                var4 = (2 * ((ql) this).field_J + -((ql) this).field_I) * ((ql) this).field_I;
                var5 = ((ql) this).field_J * ((ql) this).field_J;
                var3 = ((ql) this).field_L + var4 * (-((ql) this).field_L + ((ql) this).field_N) / var5;
                var2 = var4 * (-((ql) this).field_P + ((ql) this).field_M) / var5 + ((ql) this).field_P;
            }
            ((ql) this).b(var2, -111, var3);
        }
        return super.f((byte) -65);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param2 <= 0) {
            ((ql) this).b(param0, -95, param3);
            return;
        }
        ((ql) this).field_J = param2;
        ((ql) this).field_L = ((ql) this).field_v;
        ((ql) this).field_M = param0;
        ((ql) this).field_N = param3;
        ((ql) this).field_P = ((ql) this).field_j;
        ((ql) this).field_I = 0;
        int var5 = -2 % ((10 - param1) / 59);
    }

    public static void g(byte param0) {
        field_Q = null;
        if (param0 != 42) {
            field_O = -54;
        }
    }

    final static jb e(boolean param0) {
        jb var1 = new jb(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], be.field_f[0], ci.field_b);
        gk.a(12428);
        return var1;
    }

    boolean a(byte param0) {
        ((ql) this).f(true);
        return super.a((byte) 26);
    }

    ql(eg param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ql) this).field_J = 0;
        ((ql) this).field_I = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = 640;
        field_K = false;
    }
}
