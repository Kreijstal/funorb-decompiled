/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends mk {
    static volatile boolean field_M;
    private int field_N;
    private int field_F;
    static int field_J;
    private int field_K;
    static int field_L;
    private int field_I;
    static String field_O;
    private int field_H;
    private int field_G;

    void p(int param0) {
        if (!(-1 > (this.field_G ^ -1))) {
            return;
        }
        this.a(this.field_H, this.field_N, false);
        this.field_G = 0;
        if (param0 != 27830) {
            return;
        }
        this.d((byte) -2);
    }

    boolean m(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (param0 < this.field_G) {
            L1: {
              L2: {
                var2 = this.field_H;
                var3 = this.field_N;
                fieldTemp$1 = this.field_F + 1;
                this.field_F = this.field_F + 1;
                if (fieldTemp$1 < this.field_G) {
                  break L2;
                } else {
                  this.field_G = 0;
                  this.d((byte) -2);
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = this.field_F * (this.field_G * 2 - this.field_F);
              var5 = this.field_G * this.field_G;
              var3 = this.field_I - -((this.field_N + -this.field_I) * var4 / var5);
              var2 = var4 * (this.field_H - this.field_K) / var5 + this.field_K;
              break L1;
            }
            this.a(var2, var3, false);
            break L0;
          } else {
            break L0;
          }
        }
        return super.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 > param0)) {
            this.a(param1, param2, false);
            return;
        }
        this.field_I = this.field_h;
        this.field_K = this.field_l;
        this.field_G = param3;
        this.field_H = param1;
        this.field_F = 0;
        this.field_N = param2;
    }

    void a(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
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
                    var16 = Transmogrify.field_A ? 1 : 0;
                    sb.d(param2 - -6, 35 + param0, -12 + this.field_l, this.field_h + -40, 2105376, 0);
                    var4 = 35;
                    var5 = 211;
                    var6 = 194;
                    var7 = 0;
                    var8 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var7 ^ -1) <= (var4 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_30_0 = var8;
                    stackIn_3_0 = stackIn_30_0;
                    stackIn_30_1 = sb.field_e;
                    stackIn_3_1 = stackIn_30_1;
                    if (var16 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 < stackIn_3_1) {
                        statePc = 28;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((sb.field_f ^ -1) >= (var8 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var9 = var5 + var7 * (var6 - var5) / var4;
                    var10 = 0;
                    var11 = this.field_l;
                    if (20 < var7) {
                        statePc = 12;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var10 > 20) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var12 = (-var7 + 20) * (-var7 + 20) + (20 + -var10) * (20 + -var10);
                    stackIn_13_0 = -463;
                    stackIn_8_0 = stackIn_13_0;
                    stackIn_13_1 = var12 ^ -1;
                    stackIn_8_1 = stackIn_13_1;
                    if (var16 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > stackIn_8_1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-421 < (var12 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var13 = var9 * (-var12 + 462) / 42;
                    var13 = var13 | (var13 << 2145939208 | var13 << -2105867760);
                    sb.field_h[var8 * sb.field_c - -param2 - -var10] = var13;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = -21;
                    stackIn_13_1 = var7 ^ -1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 <= stackIn_13_1) {
                        statePc = 15;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var13 > 20) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                    stackIn_27_0 = 462;
                    stackIn_18_0 = stackIn_27_0;
                    stackIn_27_1 = var14;
                    stackIn_18_1 = stackIn_27_1;
                    if (var16 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var16 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var14 ^ -1) <= -421) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var12 = var11 - -1;
                    if (var16 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << -960466776 | var15 << 1073714256);
                    sb.field_h[var11 + sb.field_c * var8 + param2] = var15;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11++;
                    var13++;
                    if (var16 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var11 = var12;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var9 = var9 | (var9 << 753738320 | var9 << -411919416);
                    stackIn_27_0 = var10 - -param2;
                    stackIn_27_1 = var8;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    sb.d(stackIn_27_0, stackIn_27_1, -var10 + var11, var9);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var8++;
                    var7++;
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = 22;
                    var6 = 169;
                    var5 = 194;
                    var7 = 0;
                    stackIn_30_0 = 35;
                    stackIn_30_1 = param0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var8 = stackIn_30_0 + stackIn_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var4 ^ -1) >= (var7 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << 1785724232 | var9 << -986326480);
                    sb.d(param2, var8, 6, var9);
                    sb.d(this.field_l + (param2 - 6), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var16 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    vf.field_a.c(-90 + (this.field_l + param2), 10 + param0);
                    k.a(35 + param0, true, 5 + param2, ua.field_f, -10 + this.field_l);
                    k.a(-22 + (this.field_h + param0), true, param2, rh.field_l, this.field_l);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (param1 <= -79) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.a(64, -46, 111, -124);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var5 = 169;
                    var6 = 127;
                    var4 = -79 + this.field_h;
                    var7 = 0;
                    var8 = param0 - -57;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var7 >= var4) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = var5 + (var6 - var5) * var7 / var4;
                    var9 = var9 | (var9 << 1556442024 | var9 << 1666535120);
                    sb.d(param2, var8, 6, var9);
                    sb.d(-6 + this.field_l + param2, var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var16 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bi(da param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_F = 0;
        this.field_G = 0;
    }

    void d(byte param0) {
        if (param0 != -2) {
            bi.o(-106);
        }
    }

    boolean a(byte param0) {
        this.p(27830);
        if (param0 != -97) {
            this.field_G = 107;
        }
        return super.a((byte) -97);
    }

    public static void o(int param0) {
        field_O = null;
        int var1 = 38 % ((29 - param0) / 45);
    }

    static {
        field_M = true;
        field_O = "Player Name: ";
    }
}
