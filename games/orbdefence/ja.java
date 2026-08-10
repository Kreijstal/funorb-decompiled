/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    private ml field_f;
    private int field_c;
    private int field_g;
    static String field_d;
    static String field_b;
    private int field_a;
    private int field_i;
    private int field_j;
    static boolean field_e;
    private int field_h;

    private final boolean e(int param0, int param1) {
        int var3 = -15 % ((param1 - 65) / 58);
        if ((this.field_a ^ -1) == -4) {
            if ((param0 ^ -1) == -1) {
                if (!(-1 != (na.field_a ^ -1))) {
                    return false;
                }
            }
            if (-3 == (param0 ^ -1)) {
                if (oa.field_i.length + -1 != na.field_a) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private final void c(byte param0) {
        int statePc = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = OrbDefence.field_D ? 1 : 0;
                    if ((ob.field_K ^ -1) == -42) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    cj.a(110);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((this.field_a ^ -1) != -3) {
                        statePc = 34;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!n.b((byte) -98)) {
                        statePc = 6;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (ob.field_K != 96) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 >= this.field_f.field_h) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-4 != (this.field_f.field_h ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_f.a(0, this.field_f.field_h + -1);
                    if (var3 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_f.a(0, 2);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (97 == ob.field_K) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (-3 < (this.field_f.field_h ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-3 == (this.field_f.field_h ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_f.a(0, 0);
                    if (var3 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_f.a(0, this.field_f.field_h + 1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((ob.field_K ^ -1) == -100) {
                        statePc = 21;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((this.field_f.field_h ^ -1) > -1) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if ((this.field_f.field_h ^ -1) >= -3) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_f.a(0, dm.field_e);
                    if (var3 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_f.a(0, 3);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-99 == (ob.field_K ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_f.field_h != 3) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_f.a(0, dm.field_e);
                    if (var3 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_f.a(0, 3);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.field_f.d(0);
                    return;
                }
                case 34: {
                    if (param0 >= 94) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                case 36: {
                    if ((this.field_a ^ -1) != -4) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_f.d((byte) 101);
                    if (ob.field_K == 96) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (97 != ob.field_K) {
                        statePc = 54;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (this.e(this.field_f.field_h, -58)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_f.d((byte) -123);
                    if (var3 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    if ((this.field_a ^ -1) != -8) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_f.d((byte) -114);
                    return;
                }
                case 45: {
                    this.field_f.e((byte) -74);
                    if ((ob.field_K ^ -1) == -99) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (ob.field_K == 99) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (this.e(this.field_f.field_h, -30)) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_f.e((byte) -74);
                    if (var3 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var3 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        hj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        hj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        hj stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        hj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        hj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        hj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        hj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        hj stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        hj stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        hj stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        hj stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        hj stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        hj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        hj stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        hj stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        hj stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        hj stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        hj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        hj stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = OrbDefence.field_D ? 1 : 0;
                    var2 = this.a((byte) -12);
                    var3 = 123;
                    var4 = 123;
                    var5 = 394;
                    var6 = 284;
                    var7 = 0;
                    ul.d(var3 - -var7, var7 + var4, -(var7 * 2) + var5, -(2 * var7) + var6, var2);
                    var7++;
                    ul.d(var3 - -var7, var4 + var7, var5 - var7 * 2, -(2 * var7) + var6, var2);
                    var7++;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b(false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    ul.d(var7 + var3, var4 - -var7, var5 + -(var7 * 2), var6 + -(var7 * 2), 0);
                    var7++;
                    var8 = var7 + var4;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((-var7 + (var4 + var6) ^ -1) >= (var8 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ul.a(var7 + var3, var8, var5 + -(var7 * 2), 2232627);
                    ul.f(var7 + var3, var8, var5 + -(var7 * 2), 0, 128);
                    var8++;
                    if (var11 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.a(-29253, lc.field_u);
                    var8 = 100;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var9 = 60;
                    var8 = var8 + (-20 + var9 * 3 / 2);
                    if (this.field_f.field_h == 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    hi.field_g[0].e(340, var8, 255);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var10 = qb.b((byte) 123) ? 1 : 0;
                    if (-2 == (this.field_f.field_h ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = hi.field_g[1];
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = 340;
                    stackIn_14_1 = stackIn_15_1;
                    stackIn_15_2 = var8;
                    stackIn_14_2 = stackIn_15_2;
                    if (var10 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (hj) ((Object) stackIn_14_0);
                    stackIn_16_1 = stackIn_14_1;
                    stackIn_16_2 = stackIn_14_2;
                    stackIn_16_3 = 64;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (hj) ((Object) stackIn_15_0);
                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = 255;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ((hj) (Object) stackIn_16_0).e(stackIn_16_1, stackIn_16_2, stackIn_16_3);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_f.field_h == 2) {
                        statePc = 19;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = hi.field_g[2];
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = 340;
                    stackIn_20_1 = stackIn_21_1;
                    stackIn_21_2 = var8;
                    stackIn_20_2 = stackIn_21_2;
                    if (var10 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (hj) ((Object) stackIn_20_0);
                    stackIn_22_1 = stackIn_20_1;
                    stackIn_22_2 = stackIn_20_2;
                    stackIn_22_3 = 64;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (hj) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = 255;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    ((hj) (Object) stackIn_22_0).e(stackIn_22_1, stackIn_22_2, stackIn_22_3);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (-4 != (this.field_f.field_h ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = hi.field_g[3];
                    stackIn_25_0 = stackIn_27_0;
                    stackIn_27_1 = 340;
                    stackIn_25_1 = stackIn_27_1;
                    stackIn_27_2 = var8;
                    stackIn_25_2 = stackIn_27_2;
                    if ((8 & lb.field_g ^ -1) == -1) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = (hj) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = stackIn_25_1;
                    stackIn_26_1 = stackIn_28_1;
                    stackIn_28_2 = stackIn_25_2;
                    stackIn_26_2 = stackIn_28_2;
                    if (var10 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (hj) ((Object) stackIn_26_0);
                    stackIn_27_1 = stackIn_26_1;
                    stackIn_27_2 = stackIn_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (hj) ((Object) stackIn_27_0);
                    stackIn_29_1 = stackIn_27_1;
                    stackIn_29_2 = stackIn_27_2;
                    stackIn_29_3 = 64;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (hj) ((Object) stackIn_28_0);
                    stackIn_29_1 = stackIn_28_1;
                    stackIn_29_2 = stackIn_28_2;
                    stackIn_29_3 = 255;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ((hj) (Object) stackIn_29_0).e(stackIn_29_1, stackIn_29_2, stackIn_29_3);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-5 != (this.field_f.field_h ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_34_0 = hi.field_g[4];
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = 340;
                    stackIn_32_1 = stackIn_34_1;
                    stackIn_34_2 = var8;
                    stackIn_32_2 = stackIn_34_2;
                    if (0 == (4194304 & lb.field_g)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (hj) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = stackIn_32_1;
                    stackIn_33_1 = stackIn_34_1;
                    stackIn_34_2 = stackIn_32_2;
                    stackIn_33_2 = stackIn_34_2;
                    if (var10 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (hj) ((Object) stackIn_33_0);
                    stackIn_35_1 = stackIn_33_1;
                    stackIn_35_2 = stackIn_33_2;
                    stackIn_35_3 = 255;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (hj) ((Object) stackIn_34_0);
                    stackIn_35_1 = stackIn_34_1;
                    stackIn_35_2 = stackIn_34_2;
                    stackIn_35_3 = 64;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    ((hj) (Object) stackIn_35_0).e(stackIn_35_1, stackIn_35_2, stackIn_35_3);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (-6 != (this.field_f.field_h ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_40_0 = hi.field_g[5];
                    stackIn_38_0 = stackIn_40_0;
                    stackIn_40_1 = 340;
                    stackIn_38_1 = stackIn_40_1;
                    stackIn_40_2 = var8;
                    stackIn_38_2 = stackIn_40_2;
                    if (0 == (4194304 & lb.field_g)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (hj) ((Object) stackIn_38_0);
                    stackIn_39_0 = stackIn_40_0;
                    stackIn_40_1 = stackIn_38_1;
                    stackIn_39_1 = stackIn_40_1;
                    stackIn_40_2 = stackIn_38_2;
                    stackIn_39_2 = stackIn_40_2;
                    if (var10 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (hj) ((Object) stackIn_39_0);
                    stackIn_41_1 = stackIn_39_1;
                    stackIn_41_2 = stackIn_39_2;
                    stackIn_41_3 = 255;
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (hj) ((Object) stackIn_40_0);
                    stackIn_41_1 = stackIn_40_1;
                    stackIn_41_2 = stackIn_40_2;
                    stackIn_41_3 = 64;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    ((hj) (Object) stackIn_41_0).e(stackIn_41_1, stackIn_41_2, stackIn_41_3);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0, byte param1) {
        L0: {
          if (this.field_a != 2) {
            break L0;
          } else {
            if (n.b((byte) -120)) {
              break L0;
            } else {
              if (param0 < 3) {
                return -6 + wd.field_o[this.field_a];
              } else {
                return -6 + (wd.field_o[this.field_a] + ek.field_e[this.field_a]);
              }
            }
          }
        }
        L1: {
          if (2 != this.field_a) {
            break L1;
          } else {
            if (!n.b((byte) 108)) {
              break L1;
            } else {
              return -6 + (ek.field_e[this.field_a] * param0 + wd.field_o[this.field_a]);
            }
          }
        }
        if (this.field_a != 3) {
          L2: {
            if (4 == this.field_a) {
              break L2;
            } else {
              if (this.field_a == 5) {
                break L2;
              } else {
                L3: {
                  if (param1 >= 12) {
                    break L3;
                  } else {
                    field_e = false;
                    break L3;
                  }
                }
                L4: {
                  if (this.field_a != 8) {
                    break L4;
                  } else {
                    if (-1 == (param0 ^ -1)) {
                      return 140;
                    } else {
                      if (param0 == 1) {
                        return 178;
                      } else {
                        if (param0 != 2) {
                          if ((param0 ^ -1) == -4) {
                            return 254;
                          } else {
                            if (4 != param0) {
                              if ((param0 ^ -1) != -6) {
                                if ((param0 ^ -1) != -7) {
                                  if (-6 != (vh.field_q[this.field_a][param0] ^ -1)) {
                                    break L4;
                                  } else {
                                    return 415;
                                  }
                                } else {
                                  return 368;
                                }
                              } else {
                                return 330;
                              }
                            } else {
                              return 292;
                            }
                          }
                        } else {
                          return 216;
                        }
                      }
                    }
                  }
                }
                return wd.field_o[this.field_a] + param0 * ek.field_e[this.field_a];
              }
            }
          }
          if (-2 <= (vh.field_q[this.field_a].length ^ -1)) {
            return -4 + (ek.field_e[this.field_a] * param0 + 430);
          } else {
            return 382 - (-((ek.field_e[this.field_a] + 12) * param0) - -4);
          }
        } else {
          return wd.field_o[this.field_a] + -32;
        }
    }

    private final int a(int param0, byte param1) {
        if (param1 < 105) {
            field_e = false;
        }
        return 30;
    }

    final void a(byte param0, int param1, boolean param2) {
        if (!((this.field_f.field_h ^ -1) == 0)) {
            param1 = this.field_f.field_h;
        }
        this.field_f.a(param1, this.a(vl.field_d, -21016, ua.field_a), 0, param2);
        int var4 = 14 % ((param0 - -59) / 40);
    }

    public static void c(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 95 / ((param0 - -25) / 33);
    }

    final void b(boolean param0) {
        int stackIn_13_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var2;
        int var3;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          mj.c(-21108);
          if (!param0) {
            break L0;
          } else {
            field_e = false;
            break L0;
          }
        }
        L1: {
          if ((this.field_j ^ -1) < -1) {
            this.field_j = this.field_j - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (100 > lc.field_o) {
            lc.field_o = lc.field_o + 1;
            break L2;
          } else {
            break L2;
          }
        }
        if ((this.field_a ^ -1) == -8) {
          L3: {
            if (ki.d(-116)) {
              stackIn_13_0 = 0;
              break L3;
            } else {
              stackIn_13_0 = 1;
              break L3;
            }
          }
          L4: {
            var2 = wd.a(stackIn_13_0 != 0, false);
            if (-4 == (var2 ^ -1)) {
              L5: {
                if (mg.field_k == null) {
                  break L5;
                } else {
                  lb.a(true);
                  break L5;
                }
              }
              tl.a((byte) -102, uj.b((byte) -120));
              break L4;
            } else {
              break L4;
            }
          }
          L6: {
            if (1 == var2) {
              rh.a((byte) 119, 0, false);
              break L6;
            } else {
              break L6;
            }
          }
          if (-3 != (var2 ^ -1)) {
            return;
          } else {
            rh.a((byte) -117, 0, true);
            return;
          }
        } else {
          L7: while (true) {
            L8: {
              L9: {
                if (!nf.e(32722)) {
                  break L9;
                } else {
                  stackIn_37_0 = -14;

                  stackIn_37_1 = ob.field_K ^ -1;

                  if (var3 != 0) {
                    break L8;
                  } else {
                    L10: {
                      if (stackIn_37_0 != stackIn_37_1) {
                        break L10;
                      } else {
                        L11: {
                          if (this.field_a == 1) {
                            break L11;
                          } else {
                            if (-7 == (this.field_a ^ -1)) {
                              continue L7;
                            } else {
                              rh.a((byte) 111, bk.field_e, false);
                              if (var3 == 0) {
                                continue L7;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          rh.a((byte) -74, -1, false);
                          gk.a(mh.field_a[44], (byte) -11);
                          if (-1 > (tc.field_b ^ -1)) {
                            stackIn_32_0 = 0;
                            break L12;
                          } else {
                            stackIn_32_0 = 7;
                            break L12;
                          }
                        }
                        bk.field_e = stackIn_32_0;
                        if (var3 == 0) {
                          continue L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                    this.c((byte) 126);
                    if (this.field_f.field_h != -1) {
                      this.a(this.field_f.field_h, false, false);
                      if (var3 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    } else {
                      continue L7;
                    }
                  }
                }
              }
              this.field_f.a(this.a(bg.field_c, -21016, ig.field_fb), -1, this.a(vl.field_d, -21016, ua.field_a));
              stackIn_37_0 = this.field_f.field_h;
              stackIn_37_1 = -1;
              break L8;
            }
            L13: {
              if (stackIn_37_0 != stackIn_37_1) {
                this.a(this.field_f.field_h, param0, true);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (0 == gi.field_e) {
                break L14;
              } else {
                this.field_i = ig.field_fb;
                this.field_c = bg.field_c;
                break L14;
              }
            }
            return;
          }
        }
    }

    private final int c(int param0, int param1) {
        if (-3 == (this.field_a ^ -1)) {
            if (!(n.b((byte) -95))) {
                if (3 > param1) {
                    return im.field_a[this.field_a] + 200 * param1;
                }
                return 200 + im.field_a[this.field_a];
            }
        }
        if ((this.field_a ^ -1) == -3) {
            if (!(!n.b((byte) 47))) {
                return im.field_a[this.field_a] + -100;
            }
        }
        if (-4 == (this.field_a ^ -1)) {
            return 200 * param1 + 20;
        }
        if ((this.field_a ^ -1) == -5 || 5 == this.field_a) {
            return 120;
        }
        if (!((this.field_a ^ -1) != -9)) {
            if ((param1 ^ -1) >= -4) {
                return im.field_a[this.field_a] + -100;
            }
        }
        if (param0 != -29187) {
            return -35;
        }
        return im.field_a[this.field_a];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            java.applet.Applet var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      param1.getAppletContext().showDocument(f.a(param1, var2, -114), "_top");
                      if (param0 <= -96) {
                        break L2;
                      } else {
                        var3 = (java.applet.Applet) null;
                        ja.a(106, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("ja.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L4;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L4;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4;
        int var5;
        int var6;
        boolean stackIn_14_0 = false;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          if (param1 == -21016) {
            break L0;
          } else {
            discarded$1 = this.c(-111, -21);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if ((var4 ^ -1) <= (vh.field_q[this.field_a].length ^ -1)) {
              break L2;
            } else {
              var5 = this.b(var4, (byte) 53);
              stackIn_14_0 = this.e(var4, 126);

              if (var6 != 0) {
                return stackIn_14_0 ? 1 : 0;
              } else {
                L3: {
                  if (!stackIn_14_0) {
                    break L3;
                  } else {
                    if (this.c(-29187, var4) > param2) {
                      break L3;
                    } else {
                      if ((param2 ^ -1) <= (this.d(param1 ^ 21067, var4) ^ -1)) {
                        break L3;
                      } else {
                        if ((param0 ^ -1) > (var5 ^ -1)) {
                          break L3;
                        } else {
                          if (param0 < this.a(var4, (byte) 117) + var5) {
                            return var4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return -1;
        }
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_221_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          L1: {
            var9 = OrbDefence.field_D ? 1 : 0;
            var4 = vh.field_q[this.field_a][param0];
            if (!this.field_f.a((byte) -1)) {
              break L1;
            } else {
              gk.a(mh.field_a[0], (byte) -11);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if ((this.field_g ^ -1) != (var4 ^ -1)) {
            this.field_g = var4;
            gk.a(mh.field_a[30], (byte) -11);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    L24: {
                                                      var6 = var4;
                                                      if (-1 == (var6 ^ -1)) {
                                                        break L24;
                                                      } else {
                                                        L25: {
                                                          if (-20 != (var6 ^ -1)) {
                                                            break L25;
                                                          } else {
                                                            if (var9 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        if (20 == var6) {
                                                          break L23;
                                                        } else {
                                                          if (-22 == (var6 ^ -1)) {
                                                            break L23;
                                                          } else {
                                                            if (var6 == 22) {
                                                              break L23;
                                                            } else {
                                                              if (-24 == (var6 ^ -1)) {
                                                                break L23;
                                                              } else {
                                                                L26: {
                                                                  if (24 != var6) {
                                                                    break L26;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      break L23;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                                if (var6 == 26) {
                                                                  break L22;
                                                                } else {
                                                                  L27: {
                                                                    if (var6 != 25) {
                                                                      break L27;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L21;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (-2 == (var6 ^ -1)) {
                                                                    break L20;
                                                                  } else {
                                                                    L28: {
                                                                      if (5 != var6) {
                                                                        break L28;
                                                                      } else {
                                                                        if (var9 == 0) {
                                                                          break L19;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    if ((var6 ^ -1) == -17) {
                                                                      break L18;
                                                                    } else {
                                                                      L29: {
                                                                        if ((var6 ^ -1) != -15) {
                                                                          break L29;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      L30: {
                                                                        if (-4 != (var6 ^ -1)) {
                                                                          break L30;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L16;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        if (var6 != 6) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L15;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      L32: {
                                                                        if (2 != var6) {
                                                                          break L32;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L14;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      if ((var6 ^ -1) == -13) {
                                                                        break L13;
                                                                      } else {
                                                                        if (-14 == (var6 ^ -1)) {
                                                                          break L12;
                                                                        } else {
                                                                          if ((var6 ^ -1) == -5) {
                                                                            break L11;
                                                                          } else {
                                                                            if (7 == var6) {
                                                                              break L10;
                                                                            } else {
                                                                              L33: {
                                                                                if ((var6 ^ -1) != -9) {
                                                                                  break L33;
                                                                                } else {
                                                                                  if (var9 == 0) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (var6 == 9) {
                                                                                break L8;
                                                                              } else {
                                                                                if (var6 == 10) {
                                                                                  break L7;
                                                                                } else {
                                                                                  if (15 == var6) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if ((var6 ^ -1) == -18) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      L34: {
                                                                                        if ((var6 ^ -1) != -19) {
                                                                                          break L34;
                                                                                        } else {
                                                                                          if (var9 == 0) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            break L34;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (-12 != (var6 ^ -1)) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        if (var9 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L24;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (!this.field_f.a((byte) -1)) {
                                                      break L2;
                                                    } else {
                                                      rh.a((byte) -115, 8, param2);
                                                      bk.field_e = this.field_a;
                                                      if (var9 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  if (!this.field_f.a((byte) -1)) {
                                                    break L2;
                                                  } else {
                                                    L35: {
                                                      L36: {
                                                        if (-23 != (var4 ^ -1)) {
                                                          break L36;
                                                        } else {
                                                          if (0 != (lb.field_g & 8)) {
                                                            break L35;
                                                          } else {
                                                            if (var9 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L36;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L37: {
                                                        if (23 == var4) {
                                                          break L37;
                                                        } else {
                                                          if (var4 != 24) {
                                                            break L35;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      if (0 == (lb.field_g & 4194304)) {
                                                        break L2;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                    L38: {
                                                      if (var4 >= 20) {
                                                        if (0 < tc.field_b) {
                                                          break L38;
                                                        } else {
                                                          if (var9 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    L39: {
                                                      gk.a(mh.field_a[44], (byte) -11);
                                                      kj.field_x = null;
                                                      mm.field_A = null;
                                                      il.field_f = new nk(-19 + var4);
                                                      rh.a((byte) -79, -1, param2);
                                                      if (0 < tc.field_b) {
                                                        stackIn_76_0 = 0;
                                                        break L39;
                                                      } else {
                                                        stackIn_76_0 = 7;
                                                        break L39;
                                                      }
                                                    }
                                                    bk.field_e = stackIn_76_0;
                                                    if (var9 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                if (!this.field_f.a((byte) -1)) {
                                                  break L2;
                                                } else {
                                                  L40: {
                                                    gk.a(mh.field_a[44], (byte) -11);
                                                    kj.field_x = null;
                                                    mm.field_A = null;
                                                    il.field_f = new nk(0);
                                                    rh.a((byte) 117, -1, param2);
                                                    if (tc.field_b > 0) {
                                                      stackIn_81_0 = 0;
                                                      break L40;
                                                    } else {
                                                      stackIn_81_0 = 7;
                                                      break L40;
                                                    }
                                                  }
                                                  bk.field_e = stackIn_81_0;
                                                  if (var9 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              if (!this.field_f.a((byte) -1)) {
                                                break L2;
                                              } else {
                                                L41: {
                                                  if (df.field_f) {
                                                    stackIn_86_0 = 0;
                                                    break L41;
                                                  } else {
                                                    stackIn_86_0 = 1;
                                                    break L41;
                                                  }
                                                }
                                                df.field_f = stackIn_86_0 != 0;
                                                if (var9 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (!this.field_f.a((byte) -1)) {
                                              break L2;
                                            } else {
                                              L42: {
                                                gk.a(mh.field_a[44], (byte) -11);
                                                rh.a((byte) -24, -1, param2);
                                                if (-1 <= (tc.field_b ^ -1)) {
                                                  stackIn_91_0 = 7;
                                                  break L42;
                                                } else {
                                                  stackIn_91_0 = 0;
                                                  break L42;
                                                }
                                              }
                                              bk.field_e = stackIn_91_0;
                                              if (var9 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L43: {
                                            var5 = 12;
                                            if ((var5 ^ -1) == (bl.field_p ^ -1)) {
                                              break L43;
                                            } else {
                                              hi.a(ee.field_b[var5], 2, false, 1, true, 2);
                                              break L43;
                                            }
                                          }
                                          bl.field_p = var5;
                                          if (!this.field_f.a((byte) -1)) {
                                            break L2;
                                          } else {
                                            L44: {
                                              if (bk.field_e == 7) {
                                                break L44;
                                              } else {
                                                rh.a((byte) -128, 0, param2);
                                                if (var9 == 0) {
                                                  break L2;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                            rh.a((byte) 118, 7, param2);
                                            if (var9 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if (!this.field_f.a((byte) -1)) {
                                          break L2;
                                        } else {
                                          rh.a((byte) 114, 7, param2);
                                          dm.field_f = 0;
                                          lb.field_g = 0;
                                          pe.field_b.a(false);
                                          if (var9 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      if (this.field_f.a((byte) -1)) {
                                        rh.a((byte) 110, 4, param2);
                                        bk.field_e = this.field_a;
                                        if (var9 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                    if (!this.field_f.a((byte) -1)) {
                                      break L2;
                                    } else {
                                      na.field_a = 0;
                                      rh.a((byte) 127, 3, param2);
                                      bk.field_e = this.field_a;
                                      if (var9 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  if (!this.field_f.a((byte) -1)) {
                                    break L2;
                                  } else {
                                    rh.a((byte) -80, bk.field_e, param2);
                                    if (var9 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (this.field_f.a((byte) -1)) {
                                  rh.a((byte) -45, 2, param2);
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              L45: {
                                if (!this.field_f.c(-119)) {
                                  break L45;
                                } else {
                                  ce.a(0, (byte) -127);
                                  gk.a(mh.field_a[0], (byte) -11);
                                  break L45;
                                }
                              }
                              L46: {
                                if (!this.field_f.b(false)) {
                                  break L46;
                                } else {
                                  ce.a(256, (byte) -119);
                                  gk.a(mh.field_a[0], (byte) -11);
                                  break L46;
                                }
                              }
                              L47: {
                                if (!this.field_f.e(106)) {
                                  break L47;
                                } else {
                                  id.a(74);
                                  gk.a(mh.field_a[0], (byte) -11);
                                  break L47;
                                }
                              }
                              L48: {
                                if (!this.field_f.b((byte) 127)) {
                                  break L48;
                                } else {
                                  L49: {
                                    if (param1) {
                                      stackIn_125_0 = 0;
                                      break L49;
                                    } else {
                                      stackIn_125_0 = 1;
                                      break L49;
                                    }
                                  }
                                  ph.b(stackIn_125_0 != 0);
                                  gk.a(mh.field_a[0], (byte) -11);
                                  break L48;
                                }
                              }
                              if (this.field_f.c((byte) 126)) {
                                L50: {
                                  L51: {
                                    var6 = aa.field_c + 128 - -9;
                                    var7 = (-var6 + this.c(-29187, param0) - -this.d(-118, param0) >> 468737409) + (aa.field_c - -8);
                                    var8 = ua.field_a + -var7 << -2044743999;
                                    if (var8 > 0) {
                                      break L51;
                                    } else {
                                      ce.a(0, (byte) -118);
                                      if (var9 == 0) {
                                        break L50;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (-257 < (var8 ^ -1)) {
                                      break L52;
                                    } else {
                                      ce.a(256, (byte) -127);
                                      if (var9 == 0) {
                                        break L50;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  ce.a(var8, (byte) -118);
                                  break L50;
                                }
                                L53: {
                                  if (0 < this.field_j) {
                                    break L53;
                                  } else {
                                    gk.a(mh.field_a[0], (byte) -11);
                                    this.field_j = 25;
                                    break L53;
                                  }
                                }
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L2;
                              }
                            }
                            L54: {
                              if (!this.field_f.c(-121)) {
                                break L54;
                              } else {
                                ia.b(0, -23235);
                                break L54;
                              }
                            }
                            L55: {
                              if (this.field_f.b(param1)) {
                                ia.b(256, -23235);
                                break L55;
                              } else {
                                break L55;
                              }
                            }
                            L56: {
                              if (this.field_f.e(100)) {
                                kj.i(117);
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                            L57: {
                              if (this.field_f.b((byte) 125)) {
                                gk.b(2);
                                break L57;
                              } else {
                                break L57;
                              }
                            }
                            if (!this.field_f.c((byte) -21)) {
                              break L2;
                            } else {
                              L58: {
                                L59: {
                                  var6 = 9 + (aa.field_c - -128);
                                  var7 = 8 + (-var6 + (this.c(-29187, param0) + this.d(-95, param0)) >> 883338561) - -aa.field_c;
                                  var8 = ua.field_a - var7 << -313481247;
                                  if ((var8 ^ -1) >= -1) {
                                    break L59;
                                  } else {
                                    L60: {
                                      if ((var8 ^ -1) <= -257) {
                                        break L60;
                                      } else {
                                        ia.b(var8, -23235);
                                        if (var9 == 0) {
                                          break L58;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    ia.b(256, -23235);
                                    if (var9 == 0) {
                                      break L58;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                ia.b(0, -23235);
                                break L58;
                              }
                              if (var9 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (this.field_f.a((byte) -1)) {
                            L61: {
                              if (null != mg.field_k) {
                                break L61;
                              } else {
                                var6 = param2 ? 1 : 0;
                                ud.a(8, bk.field_d, var6 != 0, ob.field_I.field_B + ob.field_I.field_E, 6, 6, ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            lb.a(true);
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          } else {
                            break L2;
                          }
                        }
                        L62: {
                          if (-13 != (bl.field_p ^ -1)) {
                            hi.a(ee.field_b[12], 2, false, 1, true, 2);
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        bl.field_p = 12;
                        if (this.field_f.a((byte) -1)) {
                          L63: {
                            L64: {
                              gk.a(mh.field_a[45], (byte) -11);
                              if (n.b((byte) 73)) {
                                break L64;
                              } else {
                                L65: {
                                  il.field_f.c(-1);
                                  kj.field_x = null;
                                  if (dm.field_f != 0) {
                                    break L65;
                                  } else {
                                    rh.a((byte) -7, 2, param2);
                                    if (var9 == 0) {
                                      break L63;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                                rh.a((byte) 125, 5, param2);
                                if (var9 == 0) {
                                  break L63;
                                } else {
                                  break L64;
                                }
                              }
                            }
                            L66: {
                              if ((wf.field_c.field_e[0].field_d ^ -1) >= -1) {
                                break L66;
                              } else {
                                rh.a((byte) 38, 6, param2);
                                if (var9 == 0) {
                                  break L63;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            rh.a((byte) -25, 0, param2);
                            break L63;
                          }
                          L67: {
                            if (tc.field_b > 0) {
                              stackIn_182_0 = 0;
                              break L67;
                            } else {
                              stackIn_182_0 = 7;
                              break L67;
                            }
                          }
                          bk.field_e = stackIn_182_0;
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (!this.field_f.a((byte) -1)) {
                        break L2;
                      } else {
                        dm.field_e = 0;
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (!this.field_f.a((byte) -1)) {
                      break L2;
                    } else {
                      dm.field_e = 1;
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (this.field_f.a((byte) -1)) {
                    dm.field_e = 2;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    break L2;
                  }
                }
                if (this.field_f.a((byte) -1)) {
                  L68: {
                    L69: {
                      if (-5 == (this.field_a ^ -1)) {
                        break L69;
                      } else {
                        if (2 == this.field_a) {
                          break L69;
                        } else {
                          if ((this.field_a ^ -1) != -9) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                      }
                    }
                    pi.a(this.field_a, 19741, this.field_a);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L68;
                    }
                  }
                  if (6 != this.field_a) {
                    break L2;
                  } else {
                    L70: {
                      if (-1 == (dm.field_f ^ -1)) {
                        stackIn_204_0 = 2;
                        break L70;
                      } else {
                        stackIn_204_0 = 5;
                        break L70;
                      }
                    }
                    pi.a(stackIn_204_0, 19741, 6);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_f.a((byte) -1)) {
                break L2;
              } else {
                if (!this.e(param0, -114)) {
                  break L2;
                } else {
                  na.field_a = na.field_a - 1;
                  if (this.e(param0, -44)) {
                    break L2;
                  } else {
                    this.field_f.field_h = 2;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            if (!this.field_f.a((byte) -1)) {
              break L2;
            } else {
              if (!this.e(param0, 126)) {
                break L2;
              } else {
                na.field_a = na.field_a + 1;
                if (!this.e(param0, 125)) {
                  this.field_f.field_h = 0;
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          if (this.field_f.a((byte) -1)) {
            L71: {
              if (mg.field_k == null) {
                break L71;
              } else {
                L72: {
                  if (param1) {
                    stackIn_221_0 = 0;
                    break L72;
                  } else {
                    stackIn_221_0 = 1;
                    break L72;
                  }
                }
                lb.a(stackIn_221_0 != 0);
                break L71;
              }
            }
            ja.a(-99, uj.b((byte) -120));
            break L2;
          } else {
            break L2;
          }
        }
        L73: {
          if (!param1) {
            break L73;
          } else {
            this.field_j = 123;
            break L73;
          }
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 <= 8) {
            this.field_f = (ml) null;
        }
        if (!(7 != this.field_a)) {
            var3 = -1;
        }
        if (-1 == (this.field_a ^ -1) && (this.field_f.field_h ^ -1) != 0) {
            var3 = this.field_f.field_h;
        }
        if (-2 == (this.field_a ^ -1) && 0 != (this.field_f.field_h ^ -1) && kf.field_c != -1) {
            var3 = this.field_f.field_h;
        }
        if (!(3 != this.field_a)) {
            var3 = 2;
        }
        this.field_f.a(var3, this.a(vl.field_d, -21016, ua.field_a), 0, param0);
        this.field_h = -1;
        if (!(this.field_a != 7)) {
            vk.a(0, param0);
        }
    }

    private final void a(int param0) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        String stackIn_96_0 = null;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        sc var10_ref_sc = null;
        int var11_int = 0;
        gj var11 = null;
        String[] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int[] var32 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = OrbDefence.field_D ? 1 : 0;
                    var3 = this.a((byte) -12);
                    var4 = 123;
                    var5 = 108;
                    var6 = 394;
                    if (wj.field_m != 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 += 20;
                    var4 -= 10;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var7 = 280;
                    if ((wj.field_m ^ -1) != -4) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 -= 10;
                    var6 += 20;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    if (param0 > 34) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_i = -11;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    ul.d(var2 + var4, var2 + var5, -(var2 * 2) + var6, -(var2 * 2) + var7, var3);
                    var2++;
                    ul.d(var4 + var2, var2 + var5, -(var2 * 2) + var6, var7 + -(var2 * 2), var3);
                    var2++;
                    ul.d(var4 - -var2, var2 + var5, -(2 * var2) + var6, -(2 * var2) + var7, 0);
                    var2++;
                    var8_int = var2 + var5;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var5 - (-var7 - -var2) <= var8_int) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ul.f(var2 + var4, var8_int, var6 - 2 * var2, 0, 128);
                    var8_int++;
                    if (var28 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8 = df.field_a;
                    if ((dm.field_e ^ -1) == -2) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8 = hh.field_e;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (2 == dm.field_e) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = bk.field_c;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    this.a(-29253, var8);
                    if (n.b((byte) 67)) {
                        statePc = 48;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9_int >= 6) {
                        statePc = 48;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = 0;
                    var11_int = 0;
                    stackIn_51_0 = -1;
                    stackIn_19_0 = stackIn_51_0;
                    stackIn_51_1 = var9_int ^ -1;
                    stackIn_19_1 = stackIn_51_1;
                    if (var28 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 != stackIn_19_1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var11_int = 160;
                    var10 = 75;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var9_int == 1) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var11_int = 240;
                    var10 = 75;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-3 != (var9_int ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var11_int = 320;
                    var10 = 75;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((var9_int ^ -1) == -4) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var11_int = 160;
                    var10 = 565;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var9_int ^ -1) != -5) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var11_int = 240;
                    var10 = 565;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (5 != var9_int) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11_int = 320;
                    var10 = 565;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var11_int -= 30;
                    var10 -= 40;
                    if (n.b((byte) 74)) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (-1 <= (tc.field_b ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((var9_int ^ -1) >= -1) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    me.field_n.d(var10 - -8, var11_int);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((n.field_a ^ -1) == (var9_int ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
                    if ((var10 ^ -1) < (ua.field_a ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (vl.field_d < var11_int) {
                        statePc = 47;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((ua.field_a ^ -1) <= (var10 + 80 ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((60 + var11_int ^ -1) >= (vl.field_d ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((of.field_G ^ -1) != -2) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    kj.field_x = null;
                    n.field_a = var9_int;
                    if (var28 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    hg.field_ab.e(var10, var11_int + -5, 192);
                    hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    ob.field_I.c(gb.field_g[var9_int], 40 + var10, var11_int + 70, 16777215, 0);
                    var9_int++;
                    if (var28 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (n.b((byte) -99)) {
                        statePc = 91;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (kj.field_x != null) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = 1;
                    stackIn_51_1 = 3;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    kj.field_x = fh.a(stackIn_51_0, stackIn_51_1, n.field_a, 10, (byte) -38);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var10_ref_sc = ob.field_I;
                    var11 = kj.field_x;
                    if (var11.field_h) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var9 = ql.field_f;
                    if (var28 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (null != var11.field_i) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var9 = pg.field_b;
                    if (var28 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var9 = oa.field_a;
                    var12 = var11.field_i[dm.field_e];
                    var32 = var11.field_l[dm.field_e];
                    var14 = oc.a(dm.field_e, -1, mm.field_A, var11);
                    var10_ref_sc.a("10. ");
                    var15 = jd.field_c.field_H + 140;
                    var16 = 310;
                    var17 = 320;
                    var15 -= 20;
                    var18 = 128;
                    var19 = 512;
                    var20 = 28900 + -((jd.field_c.field_H / 2 + (240 - var15)) * (240 + (-var15 + jd.field_c.field_H / 2)));
                    var21 = 128;
                    if (var20 > 0) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var21 = (int)Math.sqrt((double)var20);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var18 = -var21 + var17;
                    var19 = 320 - -var21;
                    var22 = 16777215;
                    if ((var2 ^ -1) != (var14 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var22 = 16759807;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var10_ref_sc.b(bg.field_d, var18, var15, var22, -1);
                    var10_ref_sc.c(nh.field_e, var16 + (var19 + -320) / 4, var15, var22, -1);
                    var10_ref_sc.a(we.field_F, var19, var15, var22, -1);
                    var15 += 20;
                    var2 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-11 >= (var2 ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var18 = 128;
                    var19 = 512;
                    var20 = 28900 + -((-var15 + 240 - -(jd.field_c.field_H / 2)) * (jd.field_c.field_H / 2 + (-var15 + 240)));
                    var21 = 128;
                    stackIn_93_0 = -1;
                    stackIn_64_0 = stackIn_93_0;
                    stackIn_93_1 = var20 ^ -1;
                    stackIn_64_1 = stackIn_93_1;
                    if (var28 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 > stackIn_64_1) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var21 = (int)Math.sqrt((double)var20);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var18 = var17 + -var21;
                    var19 = 320 - -var21;
                    if (null != var12[var2]) {
                        statePc = 69;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var22 = 16777215;
                    var23 = var32[var2];
                    var24 = var12[var2];
                    if (var2 == var14) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    ul.a(var18 - 30, -12 + var15, -var18 + (60 + var19), 16, 6, 16759807, 64);
                    var22 = 16759807;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    jd.field_c.a(1 + var2 + ". ", var18 + -1, var15, 0, 0);
                    jd.field_c.b(var24, var18 + -1, var15, 0, 0);
                    jd.field_c.a(1 + var2 + ". ", var18, -1 + var15, 0, 0);
                    jd.field_c.b(var24, var18, var15 + -1, 0, 0);
                    jd.field_c.a(var2 - -1 + ". ", var18, var15, var22, -1);
                    jd.field_c.b(var24, var18, var15, var22, -1);
                    var25 = var23 % 105;
                    if (var25 < 100) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var26 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((var25 + -99 ^ -1) >= (var26 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    hg.field_ab.a(-11 + var16 + ((var19 - 320) / 4 + (8 * (100 - (var25 - 2 * var26)) + (int)(Math.sin((double)var2 + 0.005 * (double)ji.b(-78)) * 8.0))), var15 + -14);
                    var26++;
                    if (var28 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var28 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    jd.field_c.c(this.b(var25, -70), (-320 + var19) / 4 + var16, var15 + -1, 0, 0);
                    jd.field_c.c(this.b(var25, -86), var16 + ((var19 + -320) / 4 + -1), var15, 0, 0);
                    jd.field_c.c(this.b(var25, -75), (var19 - 320) / 4 + var16, var15, var22, -1);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var28 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (-101 >= (var25 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (0 >= var25) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var26 = 11 + (-1 + var25) / 11 * 11;
                    var27 = jc.field_f[n.field_a][-1 + var26];
                    ab.field_g[12 * var27].a(-11 + (var19 + -320) / 4 - (-var16 - (int)(8.0 * Math.sin(0.005 * (double)ji.b(122) + (double)var2))), var15 + -16);
                    jd.field_c.c(this.b(var25, -114), var16 + (var19 - 320) / 4, var15 - 1, 0, 0);
                    jd.field_c.c(this.b(var25, -124), -1 + var16 + (-320 + var19) / 4, var15, 0, 0);
                    jd.field_c.c(this.b(var25, -81), var16 + (-320 + var19) / 4, var15, var22, -1);
                    if (var28 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    jd.field_c.c(this.b(var25, -126), -1 + (var16 + (-320 + var19) / 4), var15, 0, 0);
                    jd.field_c.c(this.b(var25, -80), (-320 + var19) / 4 + var16, -1 + var15, 0, 0);
                    jd.field_c.c(this.b(var25, -75), var16 + (-320 + var19) / 4, var15, var22, -1);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    jd.field_c.a(this.a(var23 / 105, -1001), var19 + -1, var15, 0, 0);
                    jd.field_c.a(this.a(var23 / 105, -1001), var19, var15 + -1, 0, 0);
                    jd.field_c.a(this.a(var23 / 105, -1001), var19, var15, var22, -1);
                    var9 = "";
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var15 += 20;
                    var2++;
                    if (var28 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (il.field_f == null) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if ((var14 ^ -1) != 0) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if ((n.field_a ^ -1) != (il.field_f.field_b ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ul.a(148, var15 + -12, 344, 16, 6, 16759807, 64);
                    jd.field_c.b(gb.field_h, 168, var15, 16759807, -1);
                    jd.field_c.c(this.b(wf.field_c.field_x, -88), 348, var15, 16759807, -1);
                    jd.field_c.a(this.a(wf.field_c.field_e[0].field_d, -1001), 462, var15, 16759807, -1);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (var28 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var9 = oa.field_a;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = ob.field_I.field_H;
                    stackIn_93_1 = 240;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var10 = stackIn_93_0 + stackIn_93_1;
                    ob.field_I.c(var9, 320, var10, 16777215, -1);
                    if (!n.b((byte) -92)) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_96_0 = qk.field_a;
                    statePc = 96;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_96_0 = h.field_L;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var9 = stackIn_96_0;
                    jd.field_c.c(var9, 320, 220 + ob.field_I.field_H + 140, 16777215, -1);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_102_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = OrbDefence.field_D ? 1 : 0;
                    if (param0 == 16) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(true, (byte) 123);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = this.b(param2, (byte) 24);
                    var5 = this.c(param0 ^ -29203, param2);
                    var6 = this.d(-97, param2);
                    var7 = vh.field_q[this.field_a][param2];
                    var8 = jg.field_n[var7];
                    if (var8 == null) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var8 = "ERROR: missing text";
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var9 = -var5 + this.d(param0 + -128, param2);
                    var10 = this.a(param2, (byte) 123);
                    if (param1) {
                        statePc = 6;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (-9 < (var7 ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (10 < var7) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (dm.field_e != param2) {
                        statePc = 10;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = 16777215;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 16759807;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var11 = stackIn_13_0;
                    var12 = ob.field_I;
                    var13 = -var12.field_B + (-bk.field_d[0].field_t + (var10 - bk.field_d[6].field_t)) - var12.field_H;
                    var13 = -16;
                    if ((var7 ^ -1) == -13) {
                        statePc = 79;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var7 == 13) {
                        statePc = 79;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var14 = 1;
                    if (var7 != 20) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (tc.field_b <= 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (n.b((byte) 120)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var14 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((var7 ^ -1) != -22) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((tc.field_b ^ -1) >= -1) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (!n.b((byte) 49)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var14 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (22 != var7) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (0 == (lb.field_g & 8)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (-1 <= (tc.field_b ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (n.b((byte) 118)) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var14 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (23 != var7) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-1 == (4194304 & lb.field_g ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (tc.field_b <= 0) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!n.b((byte) 59)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var7 != 24) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((lb.field_g & 4194304 ^ -1) == -1) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (tc.field_b <= 0) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!n.b((byte) 43)) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var14 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var15 = 32;
                    if ((var7 ^ -1) > -20) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var7 ^ -1) >= -25) {
                        statePc = 54;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (16777215 != var11) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    cb.field_a.a(param0 + -56);
                    cc.field_t.c(var8.toLowerCase(), (var9 >> -1530116191) + var5, bk.field_d[0].field_t + (var4 + (cc.field_t.field_H + (var13 >> -1260199039))), 0, -1);
                    vj.field_b.d();
                    if (var19 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    cc.field_t.c(var8.toLowerCase(), (var9 >> 1782696033) + var5, (var13 >> -1278988287) + (bk.field_d[0].field_t + (cc.field_t.field_H + var4)), 1, -1);
                    if (-16777216 != (var11 ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ul.e(2, 2, 10 + var5, var4 - 1, var6 + (-var5 - 20), var15);
                    if (var19 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ul.e(10, 2, var5 + 10, var4 + -1, -20 + -var5 + var6, var15);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    cb.field_a.a(param0 + -56);
                    cc.field_t.c(var8.toLowerCase(), (var9 >> -381262527) + var5, bk.field_d[0].field_t + (var4 + (cc.field_t.field_H - -(var13 >> 1576298497))), 0, -1);
                    vj.field_b.d();
                    if (var19 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var5 = 150;
                    if ((var11 ^ -1) != -16777216) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    cb.field_a.a(param0 ^ -56);
                    cc.field_t.b(var8.toLowerCase(), var5, (var13 >> -845978207) + bk.field_d[0].field_t + (var4 + cc.field_t.field_H), 0, -1);
                    vj.field_b.d();
                    if (var19 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    cc.field_t.b(var8.toLowerCase(), var5, (var13 >> 1711431265) + (cc.field_t.field_H + (var4 - -bk.field_d[0].field_t)), 1, -1);
                    if (16777215 == var11) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ul.e(10, 2, -10 + var5, -1 + var4, -20 + (var6 + -var5), var15);
                    if (var19 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    ul.e(2, 2, -10 + var5, var4 + -1, -20 + (-var5 + var6), var15);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    cb.field_a.a(-40);
                    cc.field_t.b(var8.toLowerCase(), var5, var4 + cc.field_t.field_H - (-bk.field_d[0].field_t - (var13 >> -1537742111)), 0, -1);
                    vj.field_b.d();
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var14 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (tc.field_b <= 0) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (!n.b((byte) -117)) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    me.field_n.a(8 + cc.field_t.a(var8.toLowerCase()) + var5, -4 + var4);
                    if (-16759808 == (var11 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 68: {
                    jd.field_c.a(of.field_I, 340, 210, 160, 80, 16711680, 0, 1, 1, 18);
                    if (var19 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    al.field_d.a(var5 + (cc.field_t.a(var8.toLowerCase()) + 8), var4 - 4);
                    if (var11 == 16759807) {
                        statePc = 71;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var16 = 2;
                    if (-23 != (var7 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var16 = 3;
                    if (var19 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var7 == 23) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (24 == var7) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var16 = 22;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    jd.field_c.a(t.a(-415993727, new String[]{gj.field_j[var16]}, wl.field_b), 340, 210, 160, 80, 16711680, -1, 1, 1, 18);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var19 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var5 -= 8;
                    var14 = 128 + aa.field_c + 9;
                    var15 = var5 - -(-var14 + var9 >> 1551441057);
                    var16 = 32;
                    if (-16777216 == (var11 ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    cc.field_t.a(var8.toLowerCase(), var5 + (var9 >> 150387329), (var13 >> 1012044801) + (var4 + cc.field_t.field_H - -bk.field_d[0].field_t), 1, -1);
                    if (var11 != 16777215) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    ul.e(2, 2, var5 - -10, -1 + var4, var6 + (-var5 + -20), var16);
                    if (var19 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    ul.e(10, 2, 10 + var5, -1 + var4, -20 + var6 + -var5, var16);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    cb.field_a.a(-40);
                    cc.field_t.a(var8.toLowerCase(), (var9 >> 145931553) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4 + (var13 >> -2038612383)), 0, -1);
                    vj.field_b.d();
                    if (var19 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    cb.field_a.a(param0 ^ -56);
                    cc.field_t.a(var8.toLowerCase(), (var9 >> 596471969) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4 + (var13 >> 997790561)), 0, -1);
                    vj.field_b.d();
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var15 = var15 + (aa.field_c - -16);
                    var17 = 0;
                    var18 = var15;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if ((var18 ^ -1) <= (128 + var15 ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_99_0 = 0;
                    stackIn_89_0 = stackIn_99_0;
                    stackIn_99_1 = var17;
                    stackIn_89_1 = stackIn_99_1;
                    if (var19 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 != stackIn_89_1) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    ul.h(-2 + var18, -var17 + -2 + -1 + (var4 - -(var10 / 2)), 12, var17 * 2 + 6, 3351108);
                    if (var19 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    ul.h(var18, -1 + var4 - -(var10 / 2) - 2 + -var17, 10, 6 - -(var17 * 2), 3351108);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (-4 != (var17 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ul.h(var18 + 22, -var17 + -3 + (var4 - -(var10 / 2)), 12, 2 * var17 + 6, 3351108);
                    if (var19 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    ul.h(var18 + 22, -var17 + -2 + (-1 + var10 / 2 + var4), 10, var17 * 2 + 6, 3351108);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    ul.h(var18, -var17 + var10 / 2 + (var4 - 1), 8, 2 + var17 * 2, var11);
                    ul.h(var18 - -24, -var17 + (-1 + var4 - -(var10 / 2)), 8, var17 * 2 + 2, var11);
                    ul.h(var18 - -12, -2 + (-1 + var10 / 2 + var4), 8, 6, 3351108);
                    ul.h(var18 - -14, var4 + var10 / 2 - 1, 4, 2, var11);
                    var17++;
                    var18 += 32;
                    if (var19 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = var7;
                    stackIn_99_1 = 12;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (stackIn_99_0 != stackIn_99_1) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_102_0 = ck.field_f;
                    statePc = 102;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = ij.field_g;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var18 = stackIn_102_0;
                    ul.h(-2 + (var15 + (var18 >> 345332193)) - 2, 3 + (var4 - 2), 8, 4 + (-6 + var10), 3351108);
                    ul.h(var15 - (-(var18 >> -1480308543) - -2), 3 + var4, 4, -6 + var10, var11);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    var3 = "";
                    var6 = var3;
                    var3 = var6;
                    var6 = var3;
                    var3 = var6;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((param0 ^ -1) > -1001) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4 = param0 % 1000;
                    var6 = var4 + var3;
                    var3 = var6;
                    var3 = var6;
                    var3 = var6;
                    param0 = param0 / 1000;
                    stackIn_10_0 = 10;
                    stackIn_3_0 = stackIn_10_0;
                    stackIn_10_1 = var4;
                    stackIn_3_1 = stackIn_10_1;
                    if (var5 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = ck.field_k + "00" + var6;
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (100 <= var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = ck.field_k + "0" + var3;
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = ck.field_k + var3;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = param1;
                    stackIn_10_1 = -1001;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 == stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_j = 107;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return param0 + var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int d(int param0, int param1) {
        L0: {
          if (param0 < -92) {
            break L0;
          } else {
            ja.c(-40);
            break L0;
          }
        }
        L1: {
          if ((this.field_a ^ -1) != -3) {
            break L1;
          } else {
            if (n.b((byte) 68)) {
              break L1;
            } else {
              return this.c(-29187, param1) + 180;
            }
          }
        }
        L2: {
          if ((this.field_a ^ -1) != -3) {
            break L2;
          } else {
            if (!n.b((byte) 68)) {
              break L2;
            } else {
              return vb.field_g[this.field_a] + 100;
            }
          }
        }
        if ((this.field_a ^ -1) != -4) {
          L3: {
            if (-5 == (this.field_a ^ -1)) {
              break L3;
            } else {
              if (-6 == (this.field_a ^ -1)) {
                break L3;
              } else {
                return vb.field_g[this.field_a];
              }
            }
          }
          return 400 + this.c(-29187, param1);
        } else {
          return this.c(-29187, param1) - -200;
        }
    }

    private final int a(byte param0) {
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
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
        int var15_int = 0;
        long var15 = 0L;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = OrbDefence.field_D ? 1 : 0;
                    var2 = 2228258;
                    if (1 == this.field_a) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ul.h(0, 240, 640, 240, 4456516);
                    var3 = 5;
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-641 >= (var4 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ul.b(var4, 240, 240, var2);
                    var4 = var4 + var3;
                    if (var20 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var20 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = 240;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-481 >= (var4 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ul.a(0, var4, 640, var2);
                    var4 = var4 + var3;
                    if (var20 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var20 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 = 240;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((var4 ^ -1) <= -481) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ul.f(0, var4, 640, 0, (480 + -var4) * 256 / 240);
                    var4++;
                    if (var20 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var20 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4 = 0;
                    ul.d(var4, var4, -(var4 * 2) + 640, -(2 * var4) + 480, 9737364);
                    var4++;
                    ul.d(var4, var4, 640 - 2 * var4, -(2 * var4) + 480, 9737364);
                    var4++;
                    ul.d(var4, var4, -(var4 * 2) + 640, -(var4 * 2) + 480, 9737364);
                    var4++;
                    ul.d(var4, var4, -(var4 * 2) + 640, 480 - 2 * var4, 0);
                    var4++;
                    ul.d(var4, var4, -(2 * var4) + 640, -(2 * var4) + 480, 5789784);
                    var4++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    ul.d(var4, var4, -(2 * var4) + 640, 480 - 2 * var4, 0);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var3 = 4000;
                    var3 = (4000 * lc.field_o + 3695 * (-lc.field_o + 100)) / 100;
                    ul.f(320, 240, var3 * 215 / 4000, 0);
                    ul.b(5112, 3832, var3, 256, ql.field_b);
                    var4 = 300 * lc.field_o / 100 + 3200;
                    if (param0 == -12) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_i = -86;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = 320;
                    var6 = 240;
                    var7 = 120 * var4 / 3200;
                    var8 = var4 * 100 / 3200;
                    var9 = var4 * 3 / 4;
                    var10 = var7 * var7;
                    var11 = var8 * var8;
                    var12 = var9 * var9 >>> 1691518056;
                    var14 = 0;
                    var15_int = -var7;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if ((var15_int ^ -1) <= -1) {
                        statePc = 30;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var13 = var14;
                    stackIn_31_0 = var12 * (var10 - (1 + var15_int) * (1 + var15_int));
                    stackIn_25_0 = stackIn_31_0;
                    if (var20 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var16 = stackIn_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((var10 * var14 * var14 ^ -1) <= (var16 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var14++;
                    if (var20 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var20 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var17 = var15_int + (var7 + (10 + (var6 + -(var4 >> 732766884))));
                    var18 = -52 * (var7 + var15_int) / (var7 + var8) + 60;
                    ul.f(-var13 + var5, var17, 2 * var13, 16777215, var18);
                    km.a(var18, 121, 16777215, var17, -var14 + var5, 0, var14 - var13);
                    km.a(0, 80, 16777215, var17, var5 + var13, var18, -var13 + var14);
                    var15_int++;
                    if (var20 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var15_int = stackIn_31_0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if ((var15_int ^ -1) <= (var8 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var13 = var14;
                    stackIn_40_0 = (var11 + -((1 + var15_int) * (1 + var15_int))) * var12;
                    stackIn_34_0 = stackIn_40_0;
                    if (var20 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var16 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var14 * (var14 * var11) <= var16) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14--;
                    if (var20 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var20 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var17 = var15_int + 10 + (var6 + -(var4 >> 898305828) - -var7);
                    var18 = (var7 + var15_int) * -52 / (var7 + var8) + 60;
                    ul.f(-var14 + var5, var17, var14 * 2, 16777215, var18);
                    km.a(var18, 125, 16777215, var17, -var13 + var5, 0, var13 - var14);
                    km.a(0, param0 + 90, 16777215, var17, var14 + var5, var18, var13 + -var14);
                    var15_int++;
                    if (var20 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = -2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 == (this.field_a ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var15 = ji.b(121);
                    ul.e(6, 6, 634, 474);
                    var17 = 10;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if ((var17 ^ -1) <= -541) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_51_0 = var17;
                    stackIn_44_0 = stackIn_51_0;
                    if (var20 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 < 120) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var17 ^ -1) < -441) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var5 = (int)((double)var17 + Math.cos(0.0001 * (double)var15 + (double)var17) * 32.0);
                    var6 = (int)(80.0 * Math.sin((double)var17 + 0.0003 * (double)var15));
                    var6 += 480;
                    var18 = 0;
                    var19 = (int)(((double)var15 * 0.01 + (double)var17) % (double)wh.field_a[var18]);
                    ab.field_g[var19 + var18 * 12].c(var5, var6);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var17 += 64;
                    if (var20 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ul.c();
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return var2;
                }
                case 51: {
                    return stackIn_51_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        sc stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        sc stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        sc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_60_0 = false;
        int stackIn_67_0 = 0;
        boolean stackOut_17_0;
        boolean stackOut_59_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var12_double = 0.0;
        long var12_long = 0L;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = OrbDefence.field_D ? 1 : 0;
                    var3 = this.a((byte) -12);
                    var4 = 53;
                    var5 = 108;
                    var6 = 534;
                    var7 = 284;
                    var2 = 0;
                    ul.d(var2 + var4, var2 + var5, -(2 * var2) + var6, -(2 * var2) + var7, var3);
                    var2++;
                    ul.d(var2 + var4, var5 + var2, var6 + -(var2 * 2), -(var2 * 2) + var7, var3);
                    var2++;
                    ul.d(var2 + var4, var2 + var5, -(var2 * 2) + var6, var7 + -(var2 * 2), 0);
                    var2++;
                    var8 = var2 + var5;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var8 ^ -1) <= (-var2 + var7 + var5 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ul.f(var2 + var4, var8, var6 + -(var2 * 2), 0, 128);
                    var8++;
                    if (var20 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var20 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(-29253, hi.field_l);
                    var8 = 18;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (2 > na.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = 20;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var9 = new String[50];
                    var22 = new int[50];
                    var21 = var22;
                    var10 = var21;
                    var11 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-51 >= (var11 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var10[var11] = var6 + -24;
                    stackIn_15_0 = 5;
                    stackIn_11_0 = stackIn_15_0;
                    if (var20 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != na.field_a) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var10[var11] = var10[var11] - 64;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var11++;
                    if (var20 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var11 = jd.field_c.a(t.a(-415993727, new String[]{"          "}, oa.field_i[na.field_a]), var22, var9);
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var12 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var11 <= var12) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = var9[var12].startsWith("<b>");
                    stackIn_26_0 = stackOut_17_0 ? 1 : 0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var20 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = jd.field_c;
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = var9[var12];
                    stackIn_20_1 = stackIn_21_1;
                    stackIn_21_2 = 12 + var4;
                    stackIn_20_2 = stackIn_21_2;
                    if (-6 == (na.field_a ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (sc) ((Object) stackIn_20_0);
                    stackIn_22_1 = (String) ((Object) stackIn_20_1);
                    stackIn_22_2 = stackIn_20_2;
                    stackIn_22_3 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (sc) ((Object) stackIn_21_0);
                    stackIn_22_1 = (String) ((Object) stackIn_21_1);
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = 64;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    ((sc) (Object) stackIn_22_0).b(stackIn_22_1, stackIn_22_2 - -stackIn_22_3, var8 * (-(var11 / 2) + var12) + var7 / 2 + var5, 16777215, 0);
                    if (var20 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ob.field_I.b(var9[var12], var4 - -12, (var12 - var11 / 2) * var8 + (var5 + var7 / 2), 16777215, 0);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var12++;
                    if (var20 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = param0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 <= -74) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    field_d = (String) null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    ob.field_I.c(oa.a(oa.field_i.length, (byte) -2, na.field_a - -1), 555, 380, 16777215, -1);
                    if (-1 != (na.field_a ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((na.field_a ^ -1) != -2) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var12_double = (double)ji.b(-128) * 0.0025;
                    hg.field_ab.e((int)(88.0 * Math.cos(var12_double)) + 370, 114 - -(int)(Math.sin(1.9 * var12_double) * 4.0), 10);
                    var12_double = var12_double + 0.15;
                    hg.field_ab.e(370 - -(int)(Math.cos(var12_double) * 98.0), (int)(Math.sin(1.9 * var12_double) * 4.0) + 114, 30);
                    var12_double = var12_double + 0.15;
                    hg.field_ab.e(370 - -(int)(108.0 * Math.cos(var12_double)), 114 - -(int)(4.0 * Math.sin(1.9 * var12_double)), 50);
                    var12_double = var12_double + 0.15;
                    hg.field_ab.e((int)(118.0 * Math.cos(var12_double)) + 370, 114 + (int)(Math.sin(1.9 * var12_double) * 4.0), 70);
                    var12_double = var12_double + 0.15;
                    hg.field_ab.c((int)(128.0 * Math.cos(var12_double)) + 370, (int)(Math.sin(var12_double * 1.9) * 4.0) + 114);
                    statePc = 114;
                    continue stateLoop;
                }
                case 32: {
                    if (-3 != (na.field_a ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var12 = 80;
                    var13 = 165;
                    var2 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var2 >= 5) {
                        statePc = 51;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var20 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((var2 ^ -1) >= -5) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (n.b((byte) -75)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (tc.field_b > 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var13 = var13 + var8 * 2;
                    me.field_n.a(var12, -40 + var13);
                    if (var20 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    hf.field_g[0 - -(7 * var2)].d(var12, var13);
                    hf.field_g[2 - -(7 * var2)].a(-92, var12 - -20, 12 + var13, 10000, 2048);
                    var14 = var13;
                    if ((var2 ^ -1) != -3) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var13 -= 4;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((var2 ^ -1) == -4) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var13 -= 6;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (4 == var2) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var13 -= 8;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    hf.field_g[var2 * 7 + 1].d(var12, var13);
                    var13 = var14 + 2 * var8;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var2++;
                    if (var20 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var20 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((na.field_a ^ -1) == -4) {
                        statePc = 103;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (-5 == (na.field_a ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (na.field_a == 5) {
                        statePc = 90;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (-7 == (na.field_a ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var12 = 20 + var4;
                    var13 = 155;
                    var2 = 9;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (10 < var2) {
                        statePc = 66;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = n.b((byte) 42);
                    stackIn_67_0 = stackOut_59_0 ? 1 : 0;
                    stackIn_60_0 = stackOut_59_0;
                    if (var20 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 < tc.field_b) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var13 = var13 + var8 * 2;
                    me.field_n.a(var12, -40 + var13);
                    if (var20 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ab.field_g[var2 * 12].d(var12 + -8, var13);
                    var13 = var13 + var8 * 2;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var2++;
                    if (var20 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var13 = 295;
                    stackIn_67_0 = 5;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var2 = stackIn_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (6 < var2) {
                        statePc = 89;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var20 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (n.b((byte) -96)) {
                        statePc = 87;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (tc.field_b <= 0) {
                        statePc = 87;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((var2 ^ -1) == -7) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    hf.field_g[0 + 7 * var2].d(var12, var13);
                    if (var20 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    hf.field_g[0 + 7 * var2].d(16 + var12, var13);
                    hf.field_g[0 - -(var2 * 7)].d(var12 + -16, var13);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    hf.field_g[2 - -(7 * var2)].a(-89, var12 + 20, var13 - -12, 38000, 2048);
                    var14 = var13;
                    if (2 != var2) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var13 -= 4;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var2 != 3) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var13 -= 6;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if ((var2 ^ -1) == -5) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var13 -= 8;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (-7 != (var2 ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var15 = 200;
                    var16 = var12;
                    var17 = 6 + var13;
                    var18 = 32 + var12;
                    var19 = var13 + 6;
                    ul.f(-1 + var16, var17, var18 + -1, var19, 11176191, var15);
                    ul.f(var16 + 1, var17, 1 + var18, var19, 11176191, var15);
                    ul.f(var16, var17 + -1, var18, -1 + var19, 11176191, var15);
                    ul.f(var16, 1 + var17, var18, var19 + 1, 11176191, var15);
                    ul.f(var16, var17, var18, var19, 16777215, var15);
                    hf.field_g[1 + var2 * 7].d(16 + var12, var13);
                    hf.field_g[var2 * 7 + 1].d(-16 + var12, var13);
                    if (var20 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    hf.field_g[1 + 7 * var2].d(var12, var13);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var13 = var14 + 2 * var8;
                    if (var20 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var13 = var13 + 2 * var8;
                    me.field_n.a(var12, var13 - 40);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var2++;
                    if (var20 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var20 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var12_long = ji.b(-65);
                    var14 = 95;
                    var15 = 190;
                    var16_double = -Math.abs(Math.sin(0.005 * (double)var12_long + (double)var2));
                    ul.i(var14, (int)((double)var15 + var16_double * 5.0), 16, 16742399, 64);
                    ul.i(var14, (int)((double)var15 + var16_double * 4.0), 15, 16751103, 96);
                    ul.i(var14, (int)((double)var15 + var16_double * 3.0), 14, 16759807, 128);
                    ul.i(var14, (int)((double)var15 + 2.0 * var16_double), 13, 16768511, 192);
                    ul.f(var14, var15, 12, 16777215);
                    ul.f(var14, (int)((double)var15 + var16_double * 2.0), 6, 16768511);
                    ul.f(var14, (int)(3.0 * var16_double + (double)var15), 5, 16759807);
                    ul.f(var14, (int)(4.0 * var16_double + (double)var15), 4, 16751103);
                    ul.f(var14, (int)(5.0 * var16_double + (double)var15), 3, 16742399);
                    var14 = 80;
                    var15 = 240;
                    hf.field_g[0].d(var14, var15);
                    hf.field_g[2].a(-89, 20 + var14, 12 + var15, 10000, 2048);
                    hf.field_g[1].d(var14, var15);
                    var16 = (int)(Math.sin((double)var12_long * 0.01) * 48.0) + 64;
                    ul.a(15 + var14 << -1730949212, 2 + var15 << 1004656164, var16, 255, ki.field_f);
                    var14 = 85 + (int)(Math.sin(0.003 * (double)var12_long) * 8.0);
                    var15 = 312 + -Math.abs((int)(4.0 * Math.sin(0.0065 * (double)var12_long)));
                    ab.field_g[0].a(var14, var15);
                    statePc = 114;
                    continue stateLoop;
                }
                case 91: {
                    var12 = var4 - -10;
                    var13 = 170;
                    var2 = 4;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (8 <= var2) {
                        statePc = 101;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var20 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (n.b((byte) 93)) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (tc.field_b <= 0) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    ab.field_g[12 * var2].d(var12, var13);
                    var13 = var13 + var8 * 2;
                    if (var20 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var13 = var13 + 2 * var8;
                    me.field_n.a(var12 + 9, -36 + var13);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var2++;
                    if (var20 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var20 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var12 = 10 + var4;
                    var13 = 170;
                    var2 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if ((var2 ^ -1) <= -5) {
                        statePc = 114;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    ab.field_g[var2 * 12].d(var12, var13);
                    var13 = var13 + var8 * 2;
                    var2++;
                    if (var20 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var20 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var12 = 10 + var4;
                    var13 = 170;
                    var2 = 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if ((var2 ^ -1) <= -5) {
                        statePc = 114;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ab.field_g[var2 * 12].d(var12, var13);
                    var13 = var13 + var8 * 2;
                    var2++;
                    if (var20 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var20 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String b(int param0, int param1) {
        int discarded$0 = 0;
        if (-101 == (param0 ^ -1)) {
            return bi.field_d;
        }
        if (!(-102 != (param0 ^ -1))) {
            return oe.field_q;
        }
        if (-103 == (param0 ^ -1)) {
            return cc.field_r;
        }
        if (param1 > -65) {
            discarded$0 = this.d(-118, -13);
        }
        if ((param0 ^ -1) == -104) {
            return nb.field_o;
        }
        if (-105 == (param0 ^ -1)) {
            return mg.field_h;
        }
        return Integer.toString(param0);
    }

    final void b(byte param0) {
        int discarded$0 = 0;
        sc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        sc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        sc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        sc stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        sc stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        sc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        sc stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        sc stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        sc stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        sc stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        sc stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        sc stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        sc stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        sc stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        sc stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        sc stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        sc stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        sc stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        boolean stackIn_57_0 = false;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_64_0 = 0;
        boolean stackOut_56_0;
        int statePc = 0;
        int var2 = 0;
        hj var3_ref_hj = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    if ((this.field_a ^ -1) != -1) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-641 == (fk.field_b.field_o ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3_ref_hj = fk.field_b.f();
                    var3_ref_hj.e();
                    var3_ref_hj.d();
                    fk.field_b.b(0, 0, 16711935);
                    ul.e(5, 5, 0, 0, 640, 128);
                    fk.field_b.c(0, 0);
                    cb.field_a.a(-40);
                    fk.field_b = var3_ref_hj;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var3 = this.a((byte) -12);
                    var4 = im.field_a[this.field_a];
                    var5 = wd.field_o[this.field_a] - 24;
                    var6 = vb.field_g[this.field_a] + -im.field_a[this.field_a];
                    var7 = 48 + vh.field_q[this.field_a].length * ek.field_e[this.field_a] + -16;
                    var2 = 0;
                    var8 = lc.field_o * 255 / 100;
                    ul.g(var2 + var4, var2 + var5, -(var2 * 2) + var6, -(2 * var2) + var7, var3, var8);
                    var2++;
                    ul.g(var4 + var2, var2 + var5, -(2 * var2) + var6, var7 - var2 * 2, var3, var8);
                    var2++;
                    ul.g(var2 + var4, var5 - -var2, -(var2 * 2) + var6, -(2 * var2) + var7, 0, var8);
                    var2++;
                    var9 = var5 - -var2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((-var2 + (var7 + var5) ^ -1) >= (var9 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ul.c(var2 + var4, var9, -(2 * var2) + var6, 2232627, var8);
                    var9++;
                    if (var10 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var10 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    fk.field_b.e(10, lc.field_o + -65, 255 * lc.field_o / 100);
                    wj.b((byte) 124);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var10 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (1 != this.field_a) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = this.a((byte) -12);
                    im.field_a[this.field_a] = im.field_a[0];
                    vb.field_g[this.field_a] = vb.field_g[0];
                    var3 = im.field_a[this.field_a];
                    var4 = wd.field_o[this.field_a] + -24;
                    var5 = -im.field_a[this.field_a] + vb.field_g[this.field_a];
                    var6 = 48 + vh.field_q[this.field_a].length * ek.field_e[this.field_a];
                    var7 = 0;
                    var8 = lc.field_o * 255 / 100;
                    ul.g(var3 - -var7, var4 - -var7, -(var7 * 2) + var5, var6 + -(2 * var7), var2, var8);
                    var7++;
                    ul.g(var7 + var3, var4 - -var7, -(var7 * 2) + var5, -(2 * var7) + var6, var2, var8);
                    var7++;
                    ul.g(var3 + var7, var7 + var4, var5 - 2 * var7, -(var7 * 2) + var6, 0, var8);
                    var7++;
                    var9 = var7 + var4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-var7 + var6 + var4 <= var9) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ul.c(var3 - -var7, var9, var5 - var7 * 2, 2232627, var8);
                    var9++;
                    if (var10 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var10 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    fk.field_b.e(10, 35, 255);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    wj.b((byte) 124);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    vj.field_b.d();
                    ul.d();
                    cb.field_a.a(-40);
                    if ((this.field_a ^ -1) != -9) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(false);
                    if (var10 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((this.field_a ^ -1) != -3) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.a(120);
                    if (var10 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (3 != this.field_a) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.b(-95);
                    if (var10 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (4 == this.field_a) {
                        statePc = 53;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-6 != (this.field_a ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.a((byte) 127, true);
                    if (var10 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (6 == this.field_a) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((this.field_a ^ -1) != -8) {
                        statePc = 54;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    fm.a(241);
                    return;
                }
                case 34: {
                    discarded$0 = this.a((byte) -12);
                    wd.field_o[this.field_a] = 230;
                    il.field_f.field_i = wf.field_c.field_e[0].field_d;
                    var2 = ob.field_I.field_H + 160;
                    var3 = ob.field_I.field_B + (ob.field_I.field_E + 4);
                    ob.field_I.c(fh.field_b, 320, var2, 16777215, -1);
                    stackIn_36_0 = ob.field_I;
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = -113;
                    stackIn_35_1 = stackIn_36_1;
                    stackIn_36_2 = 0;
                    stackIn_35_2 = stackIn_36_2;
                    if (0 == il.field_f.field_i) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (sc) ((Object) stackIn_35_0);
                    stackIn_37_1 = stackIn_35_1;
                    stackIn_37_2 = stackIn_35_2;
                    stackIn_37_3 = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (sc) ((Object) stackIn_36_0);
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = stackIn_36_2;
                    stackIn_37_3 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (sc) ((Object) stackIn_37_0);
                    stackIn_38_0 = stackIn_39_0;
                    stackIn_39_1 = stackIn_37_1;
                    stackIn_38_1 = stackIn_39_1;
                    stackIn_39_2 = stackIn_37_2;
                    stackIn_38_2 = stackIn_39_2;
                    stackIn_39_3 = stackIn_37_3;
                    stackIn_38_3 = stackIn_39_3;
                    if ((dm.field_f ^ -1) == -1) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (sc) ((Object) stackIn_38_0);
                    stackIn_40_1 = stackIn_38_1;
                    stackIn_40_2 = stackIn_38_2;
                    stackIn_40_3 = stackIn_38_3;
                    stackIn_40_4 = 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = (sc) ((Object) stackIn_39_0);
                    stackIn_40_1 = stackIn_39_1;
                    stackIn_40_2 = stackIn_39_2;
                    stackIn_40_3 = stackIn_39_3;
                    stackIn_40_4 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    ((sc) (Object) stackIn_40_0).c(sa.a((byte) stackIn_40_1, stackIn_40_2 != 0, stackIn_40_3 != 0, stackIn_40_4 != 0), 320, var3 + var2, 16777215, -1);
                    stackIn_42_0 = ob.field_I;
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_42_1 = 0;
                    stackIn_41_1 = stackIn_42_1;
                    if (dm.field_f == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = (sc) ((Object) stackIn_41_0);
                    stackIn_43_1 = stackIn_41_1;
                    stackIn_43_2 = 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (sc) ((Object) stackIn_42_0);
                    stackIn_43_1 = stackIn_42_1;
                    stackIn_43_2 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = (sc) ((Object) stackIn_43_0);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = stackIn_43_1;
                    stackIn_44_1 = stackIn_45_1;
                    stackIn_45_2 = stackIn_43_2;
                    stackIn_44_2 = stackIn_45_2;
                    if (0 == il.field_f.field_i) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (sc) ((Object) stackIn_44_0);
                    stackIn_46_1 = stackIn_44_1;
                    stackIn_46_2 = stackIn_44_2;
                    stackIn_46_3 = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (sc) ((Object) stackIn_45_0);
                    stackIn_46_1 = stackIn_45_1;
                    stackIn_46_2 = stackIn_45_2;
                    stackIn_46_3 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    ((sc) (Object) stackIn_46_0).c(sd.a(stackIn_46_1 != 0, stackIn_46_2 != 0, stackIn_46_3 != 0, 30775), 320, var2 + 5 * var3 - -30, 16777215, -1);
                    stackIn_48_0 = ob.field_I;
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = -14189;
                    stackIn_47_1 = stackIn_48_1;
                    if ((il.field_f.field_i ^ -1) == -1) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (sc) ((Object) stackIn_47_0);
                    stackIn_49_1 = stackIn_47_1;
                    stackIn_49_2 = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (sc) ((Object) stackIn_48_0);
                    stackIn_49_1 = stackIn_48_1;
                    stackIn_49_2 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = (sc) ((Object) stackIn_49_0);
                    stackIn_50_0 = stackIn_51_0;
                    stackIn_51_1 = stackIn_49_1;
                    stackIn_50_1 = stackIn_51_1;
                    stackIn_51_2 = stackIn_49_2;
                    stackIn_50_2 = stackIn_51_2;
                    if (-1 == (dm.field_f ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = (sc) ((Object) stackIn_50_0);
                    stackIn_52_1 = stackIn_50_1;
                    stackIn_52_2 = stackIn_50_2;
                    stackIn_52_3 = 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = (sc) ((Object) stackIn_51_0);
                    stackIn_52_1 = stackIn_51_1;
                    stackIn_52_2 = stackIn_51_2;
                    stackIn_52_3 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    ((sc) (Object) stackIn_52_0).c(tj.a(stackIn_52_1, stackIn_52_2 != 0, stackIn_52_3 != 0, false), 320, 60 + 8 * var3 + var2, 16777215, -1);
                    if (var10 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.a((byte) 125, false);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    vj.field_b.d();
                    var2 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_f.field_i <= var2) {
                        statePc = 63;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = this.e(var2, 126);
                    stackIn_64_0 = stackOut_56_0 ? 1 : 0;
                    stackIn_57_0 = stackOut_56_0;
                    if (var10 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (!stackIn_57_0) {
                        statePc = 62;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = this;
                    stackIn_59_0 = stackIn_60_0;
                    stackIn_60_1 = 16;
                    stackIn_59_1 = stackIn_60_1;
                    if ((var2 ^ -1) != (this.field_f.field_h ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = this;
                    stackIn_61_1 = stackIn_59_1;
                    stackIn_61_2 = 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = this;
                    stackIn_61_1 = stackIn_60_1;
                    stackIn_61_2 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    this.a((byte) stackIn_61_1, stackIn_61_2 != 0, var2);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var2++;
                    if (var10 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    cb.field_a.a(-40);
                    stackIn_64_0 = -91 % ((-83 - param0) / 34);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var2 = stackIn_64_0;
                    vj.field_b.e(0, 0, 255 * lc.field_o / 100);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_82_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        boolean[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        Object var21_ref = null;
        hj var21_ref_hj = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = OrbDefence.field_D ? 1 : 0;
                    var4 = this.a((byte) -12);
                    var5 = 53;
                    var6 = 108;
                    var7 = 534;
                    var8 = 312;
                    var3 = 0;
                    ul.d(var5 + var3, var3 + var6, -(var3 * 2) + var7, -(2 * var3) + var8, var4);
                    var3++;
                    ul.d(var3 + var5, var3 + var6, -(2 * var3) + var7, -(2 * var3) + var8, var4);
                    var3++;
                    ul.d(var5 + var3, var6 + var3, var7 + -(var3 * 2), var8 + -(var3 * 2), 0);
                    var3++;
                    var9_int = var3 + var6;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var8 + (var6 + -var3) <= var9_int) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ul.f(var3 + var5, var9_int, -(var3 * 2) + var7, 0, 192);
                    var9_int++;
                    if (var24 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var9 = wc.field_b;
                    if (!param1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var9 = field_d;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    this.a(-29253, var9);
                    var10 = new boolean[]{false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, true, true, true, true, false};
                    var11 = new boolean[]{true, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
                    var12 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false};
                    var13 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
                    var5 = 102;
                    var14 = 120;
                    var15 = 0;
                    if (param1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_8_0 = lb.field_g;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = dm.field_f;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var16 = stackIn_8_0;
                    var17 = -1;
                    var18 = ok.a(0, false) ? 1 : 0;
                    var19 = 0;
                    if (param0 >= 115) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    field_e = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var20_int = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((var20_int ^ -1) <= (gj.field_j.length ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var21_ref = null;
                    stackIn_61_0 = -1;
                    stackIn_13_0 = stackIn_61_0;
                    stackIn_61_1 = var16 & 1 << var20_int ^ -1;
                    stackIn_13_1 = stackIn_61_1;
                    if (var24 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 != stackIn_13_1) {
                        statePc = 28;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (!param1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var24 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var12[var20_int]) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!var13[var20_int]) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var18 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var19++;
                    if (var24 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (tc.field_b > 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var10[var20_int]) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var21_ref_hj = al.field_d;
                    statePc = 29;
                    continue stateLoop;
                }
                case 27: {
                    var21_ref_hj = me.field_n;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    var21_ref_hj = bd.field_o[var20_int];
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var22 = var5;
                    var23 = var14;
                    if (var12[var20_int]) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!var13[var20_int]) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var18 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var23 = 120;
                    if (var19 <= 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var22 = 482;
                    if (var24 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var22 = 64;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var19++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var22 > ua.field_a) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((var22 - -32 ^ -1) > (ua.field_a ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((vl.field_d ^ -1) > (var23 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((vl.field_d ^ -1) < (32 + var23 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ul.a(var22 - -16 << 1198079524, 16 + var23 << 64463620, 384, 255, ki.field_f);
                    var17 = var20_int;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var21_ref_hj.a(var22, var23);
                    if ((var22 ^ -1) < (this.field_i ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_i ^ -1) < (32 + var22 ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((this.field_c ^ -1) > (var23 ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var23 - -32 >= this.field_c) {
                        statePc = 47;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (this.field_h == var20_int) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_h = var20_int;
                    if (var24 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_h = -1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.field_i = -1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_h != var20_int) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ul.a(16 + var22 << 1138898500, 16 + var23 << 131698436, 384, 255, ki.field_f);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (!var12[var20_int]) {
                        statePc = 56;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var5 += 38;
                    if (522 < var5) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var15 += 32;
                    var5 = 83;
                    var14 = 120 + var15;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var20_int++;
                    if (var24 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = 0;
                    stackIn_61_1 = this.field_h;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 > stackIn_61_1) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var17 = this.field_h;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (var17 != -1) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ob.field_I.c(kd.field_f, 320, 264, 16777215, -1);
                    if (!n.b((byte) 62)) {
                        statePc = 99;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ob.field_I.c(qk.field_a, 320, 32 + (3 * ob.field_I.field_H + 232), 16777215, -1);
                    if (var24 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var14 = 220;
                    var5 = 470;
                    ob.field_I.c(dj.field_e, var5 + -1, var14, 0, 0);
                    ob.field_I.c(dj.field_e, var5, -1 + var14, 0, 0);
                    ob.field_I.c(dj.field_e, var5, var14, 11154431, -1);
                    var14 += 24;
                    var20 = Integer.toString(100 * wd.field_D[var17]);
                    if (!var11[var17]) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var16 & 1 << var17) != 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var20 = OrbDefence.field_E;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    ob.field_I.c(var20, -1 + var5, var14, 0, 0);
                    ob.field_I.c(var20, var5, -1 + var14, 0, 0);
                    ob.field_I.c(var20, var5, var14, 16777215, -1);
                    var5 = 470;
                    var14 = 280;
                    ob.field_I.c(nf.field_n, -1 + var5, var14, 0, 0);
                    ob.field_I.c(nf.field_n, var5, -1 + var14, 0, 0);
                    ob.field_I.c(nf.field_n, var5, var14, 11154431, -1);
                    if (!var11[var17]) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (0 != (var16 & 1 << var17)) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var14 += 32;
                    ob.field_I.c(var20, var5 + -1, var14, 0, 0);
                    ob.field_I.c(var20, var5, var14 - 1, 0, 0);
                    ob.field_I.c(var20, var5, var14, 16777215, -1);
                    if (var24 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var5 = var5 - (ba.field_e.field_o / 2 + (-1 + wd.field_D[var17]) * ba.field_e.field_o / 6);
                    var3 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if ((wd.field_D[var17] ^ -1) >= (var3 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ba.field_e.c(var5, 12 + var14);
                    var5 = var5 + ba.field_e.field_o / 3;
                    var3++;
                    if (var24 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var24 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((1 << var17 & var16 ^ -1) == -1) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = 1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var21 = stackIn_82_0;
                    var14 = 220;
                    var5 = 170;
                    if (var21 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    ob.field_I.c(cb.field_g, -1 + var5, var14, 0, 0);
                    ob.field_I.c(cb.field_g, var5, var14 - 1, 0, 0);
                    ob.field_I.c(cb.field_g, var5, var14, 2293572, -1);
                    if (var24 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ob.field_I.c(hc.field_k, var5 + -1, var14, 0, 0);
                    ob.field_I.c(hc.field_k, var5, -1 + var14, 0, 0);
                    ob.field_I.c(hc.field_k, var5, var14, 16720452, -1);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var22 = 160;
                    var20 = va.field_b[var17];
                    var14 += 10;
                    if (!var11[var17]) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if ((1 << var17 & var16 ^ -1) != -1) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var20 = od.field_h;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    ob.field_I.a(var20, -1 + var5 + -(var22 / 2), 8 + var14, var22, 480, 0, 0, 1, 0, ob.field_I.field_H);
                    ob.field_I.a(var20, var5 + -(var22 / 2), 8 + var14 + -1, var22, 480, 0, 0, 1, 0, ob.field_I.field_H);
                    ob.field_I.a(var20, var5 - var22 / 2, 8 + var14, var22, 480, 16777215, -1, 1, 0, ob.field_I.field_H);
                    var14 = 350;
                    var5 = 320;
                    ob.field_I.c(gj.field_j[var17], var5 + -1, var14, 0, 0);
                    ob.field_I.c(gj.field_j[var17], var5, -1 + var14, 0, 0);
                    ob.field_I.c(gj.field_j[var17], var5, var14, 16777215, -1);
                    var23 = 200;
                    if (var21 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    bd.field_o[var17].c(256, var23);
                    if (var24 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (tc.field_b > 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (!var10[var17]) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    me.field_n.c(256, var23);
                    if (var24 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    al.field_d.c(256, var23);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var23 = var23 + ob.field_I.field_H;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        vj.field_b.d();
        if (param0 != -29253) {
            return;
        }
        try {
            param1 = param1.toUpperCase();
            var3_int = cc.field_t.a(param1);
            cc.field_t.c(param1, 320, 96, 1, -1);
            ul.e(5, 5, -(var3_int / 2) + 315, 59, 10 + var3_int, 42);
            cc.field_t.c(param1, 320, 96, 0, -1);
            cb.field_a.a(-40);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ja.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ja(int param0) {
        this.field_i = -1;
        this.field_h = -1;
        this.field_a = param0;
        this.field_f = new ml(vh.field_q[param0].length);
        fe.a(true);
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = "ACHIEVEMENTS THIS GAME";
    }
}
