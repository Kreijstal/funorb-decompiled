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
        if (0 >= this.field_J) {
            return;
        }
        if (!param0) {
            ql.g((byte) -79);
        }
        this.b(this.field_M, -120, this.field_N);
        this.field_J = 0;
        this.h((byte) 38);
    }

    void h(byte param0) {
        if (param0 != 38) {
            field_K = true;
        }
    }

    void a(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Lexicominos.field_L ? 1 : 0;
                    lf.a(6 + param2, 35 + param0, this.field_j - 12, this.field_v + -40, 2105376, 0);
                    var5 = 211;
                    var4 = 35;
                    var6 = 194;
                    var7 = 0;
                    var8 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 <= var7) {
                        statePc = 32;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_33_0 = lf.field_c;
                    stackIn_3_0 = stackIn_33_0;
                    stackIn_33_1 = var8;
                    stackIn_3_1 = stackIn_33_1;
                    if (var16 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                        statePc = 31;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (lf.field_h <= var8) {
                        statePc = 31;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var9 = var5 + (-var5 + var6) * var7 / var4;
                    var10 = 0;
                    var11 = this.field_j;
                    if (-21 > (var7 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (20 < var10) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var12 = (-var7 + 20) * (20 + -var7) + (-var10 + 20) * (20 + -var10);
                    stackIn_17_0 = 462;
                    stackIn_8_0 = stackIn_17_0;
                    stackIn_17_1 = var12;
                    stackIn_8_1 = stackIn_17_1;
                    if (var16 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= stackIn_8_1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var16 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((var12 ^ -1) <= -421) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var16 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var13 = (-var12 + 462) * var9 / 42;
                    var13 = var13 | (var13 << -533349328 | var13 << 618533128);
                    lf.field_b[param2 + (var8 * lf.field_f + var10)] = var13;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = var7 ^ -1;
                    stackIn_17_1 = -21;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 < stackIn_17_1) {
                        statePc = 29;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var13 > 20) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var14 = var13 * var13 + (-var7 + 20) * (-var7 + 20);
                    stackIn_30_0 = var14 ^ -1;
                    stackIn_21_0 = stackIn_30_0;
                    stackIn_30_1 = -463;
                    stackIn_21_1 = stackIn_30_1;
                    if (var16 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 >= stackIn_21_1) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var16 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var14 >= 420) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var12 = 1 + var11;
                    if (var16 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var15 = (462 + -var14) * var9 / 42;
                    var15 = var15 | (var15 << 359413232 | var15 << 204440040);
                    lf.field_b[var11 + lf.field_f * var8 + param2] = var15;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var11++;
                    var13++;
                    if (var16 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var11 = var12;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var9 = var9 | (var9 << -1670768976 | var9 << -60889016);
                    stackIn_30_0 = param2 + var10;
                    stackIn_30_1 = var8;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    lf.a(stackIn_30_0, stackIn_30_1, var11 - var10, var9);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var7++;
                    var8++;
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var4 = 22;
                    var5 = 194;
                    var6 = 169;
                    var7 = 0;
                    stackIn_33_0 = param0;
                    stackIn_33_1 = 35;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var8 = stackIn_33_0 + stackIn_33_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var4 <= var7) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var9 = (var6 - var5) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 1851432624 | var9 << -1106622520);
                    lf.a(param2, var8, 6, var9);
                    lf.a(this.field_j + (param2 + -6), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var16 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    Lexicominos.field_I.d(-90 + (this.field_j + param2), param0 - -10);
                    ac.a(true, param0 - -35, ti.field_I, param2 - -5, this.field_j - 10);
                    ac.a(true, -22 + param0 - -this.field_v, we.field_i, param2, this.field_j);
                    var6 = 127;
                    var5 = 169;
                    var4 = -79 + this.field_v;
                    var7 = -113 / ((-3 - param1) / 43);
                    var8 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var9 = 57 + param0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var8 ^ -1) <= (var4 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10 = var5 - -(var8 * (var6 + -var5) / var4);
                    var10 = var10 | (var10 << 1324391560 | var10 << -1545875632);
                    lf.a(param2, var9, 6, var10);
                    lf.a(this.field_j + param2 + -6, var9, 6, var10);
                    var8++;
                    var9++;
                    if (var16 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var16 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean f(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        if (param0 < -21) {
          L0: {
            if (this.field_J <= 0) {
              break L0;
            } else {
              L1: {
                L2: {
                  var2 = this.field_M;
                  var3 = this.field_N;
                  fieldTemp$1 = this.field_I + 1;
                  this.field_I = this.field_I + 1;
                  if (this.field_J > fieldTemp$1) {
                    break L2;
                  } else {
                    this.field_J = 0;
                    this.h((byte) 38);
                    if (!Lexicominos.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = (2 * this.field_J + -this.field_I) * this.field_I;
                var5 = this.field_J * this.field_J;
                var3 = this.field_L + var4 * (-this.field_L + this.field_N) / var5;
                var2 = var4 * (-this.field_P + this.field_M) / var5 + this.field_P;
                break L1;
              }
              this.b(var2, -111, var3);
              break L0;
            }
          }
          return super.f((byte) -65);
        } else {
          return true;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if ((param2 ^ -1) >= -1) {
            this.b(param0, -95, param3);
            return;
        }
        this.field_J = param2;
        this.field_L = this.field_v;
        this.field_M = param0;
        this.field_N = param3;
        this.field_P = this.field_j;
        this.field_I = 0;
        int var5 = -2 % ((10 - param1) / 59);
    }

    public static void g(byte param0) {
        field_Q = null;
        if (param0 != 42) {
            field_O = -54;
        }
    }

    final static jb e(boolean param0) {
        if (param0) {
            return (jb) null;
        }
        jb var1 = new jb(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], be.field_f[0], ci.field_b);
        gk.a(12428);
        return var1;
    }

    boolean a(byte param0) {
        if (param0 != 26) {
            this.field_M = 112;
        }
        this.f(true);
        return super.a((byte) 26);
    }

    ql(eg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_J = 0;
        this.field_I = 0;
    }

    static {
        field_O = 640;
        field_K = false;
    }
}
