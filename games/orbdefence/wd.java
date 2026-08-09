/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[] field_b;
    int[] field_f;
    short field_u;
    int[] field_I;
    int field_z;
    int field_v;
    byte[] field_t;
    static String field_k;
    int[] field_L;
    short[] field_Q;
    short field_c;
    short[] field_h;
    short[] field_x;
    short[] field_s;
    short[] field_H;
    int[] field_g;
    short[] field_n;
    short[] field_e;
    int[] field_A;
    static int[] field_D;
    int[] field_r;
    short[] field_l;
    short field_w;
    static String field_p;
    static hj[] field_C;
    short[] field_y;
    int field_F;
    short[] field_N;
    int field_d;
    short[] field_M;
    int field_J;
    short[] field_a;
    short[] field_B;
    short[] field_q;
    short[] field_G;
    int[] field_E;
    short[] field_i;
    short[] field_R;
    short[] field_K;
    int[] field_j;
    static int[] field_o;
    byte field_m;
    private boolean field_O;
    int field_P;

    final static int a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_70_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        tk.field_n = tk.field_n + 65536;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (tb.a(og.field_a, 723204176, tk.field_n) < 65536) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        le.field_c = le.field_c + 1;
                        stackIn_10_0 = tk.field_n - og.field_a;
                        stackIn_7_0 = stackIn_10_0;
                        if (var5 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        tk.field_n = stackIn_7_0;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = -1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = stackIn_10_0;
                        if (null == dm.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = dm.field_b.length;
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == il.field_e) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = il.field_e.length;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var2_int == -1) {
                            statePc = 36;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (h.field_A < og.field_o) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        h.field_A = h.field_A + 1;
                        if (h.field_A <= og.field_b) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null == dm.field_b) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (dm.field_b[kb.field_m] == null) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (og.field_o > h.field_A) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == dm.field_b[(1 + kb.field_m) % var2_int]) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        h.field_A = h.field_A - 1;
                        if (var5 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        h.field_A = h.field_A - 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (h.field_A < og.field_o) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        lj.field_u = kb.field_m;
                        if (!bh.field_b) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        kb.field_m = kb.field_m + 1;
                        if (kb.field_m < var2_int) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        kb.field_m = kb.field_m - var2_int;
                        if (var5 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        kb.field_m = kb.field_m - 1;
                        if (kb.field_m >= 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        kb.field_m = kb.field_m + var2_int;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        h.field_A = h.field_A - og.field_o;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (og.field_b >= h.field_A) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        bh.field_b = true;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null != fm.field_b) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3 = 357 + -(fm.field_b.field_t / 2);
                        var4 = 0;
                        if (gi.field_e == 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (bg.field_c <= var3) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (bg.field_c < fm.field_b.field_k + var3) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (269 + -fm.field_b.field_o >= ig.field_fb) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-270 >= (ig.field_fb ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        h.field_A = og.field_o;
                        bh.field_b = false;
                        var4 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (ig.field_fb <= 586) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (fm.field_b.field_o + 586 <= ig.field_fb) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        h.field_A = og.field_o;
                        bh.field_b = true;
                        var4 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var4 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (h.field_A <= og.field_b) {
                            statePc = 59;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (vl.field_d <= var3) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (fm.field_b.field_k + var3 <= vl.field_d) {
                            statePc = 59;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (ua.field_a <= 269 + -fm.field_b.field_o) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((ua.field_a ^ -1) > -270) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        h.field_A = og.field_b;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((ua.field_a ^ -1) >= -587) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (fm.field_b.field_o + 586 <= ua.field_a) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        h.field_A = og.field_b;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!param0) {
                            statePc = 85;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        wj.field_k.a(ka.a(24316, ig.field_fb, bg.field_c), -1, ka.a(24316, ua.field_a, vl.field_d));
                        if (wj.field_k.a((byte) -1)) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-1 != (wj.field_k.field_h ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = 3;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return stackIn_64_0;
                }
                case 65: {
                    try {
                        if (wj.field_k.field_h == 1) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = 2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0;
                }
                case 69: {
                    try {
                        if (!nf.e(32722)) {
                            statePc = 85;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        wj.field_k.b(27163, 0);
                        stackOut_70_0 = wj.field_k.a((byte) -1);
                        stackIn_86_0 = stackOut_70_0 ? 1 : 0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var5 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (-1 == (wj.field_k.field_h ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = 3;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return stackIn_76_0;
                }
                case 77: {
                    try {
                        if ((wj.field_k.field_h ^ -1) == -2) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return stackIn_80_0;
                }
                case 81: {
                    try {
                        if (13 == ob.field_K) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = 1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    return stackIn_84_0;
                }
                case 85: {
                    try {
                        stackIn_86_0 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return stackIn_86_0;
                }
                case 87: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "wd.E(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        this.field_O = false;
        if (param0 <= -41) {
            return;
        }
        this.field_F = 88;
    }

    final static ea a(int param0, byte param1, int param2, int param3, be param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ea var7 = null;
        be var8 = null;
        java.awt.Frame var9 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = m.a(param5, param2, param3, -1, param0, param4);
              var6 = var9;
              if (param1 > 34) {
                break L1;
              } else {
                var8 = (be) null;
                wd.a(23, (byte) -51, 117, 29, (be) null, -42);
                break L1;
              }
            }
            if (var9 != null) {
              var7 = new ea();
              var7.field_c = var9;
              var7.field_c.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param5, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (ea) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    var6 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var6 >= this.field_c) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_R[var6] = (short)(this.field_R[var6] * param1 / param4);
                    this.field_x[var6] = (short)(param2 * this.field_x[var6] / param4);
                    this.field_Q[var6] = (short)(param3 * this.field_Q[var6] / param4);
                    var6++;
                    if (var7 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a((byte) -77);
                    if (param0 == 3940) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_v = -12;
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.a((byte) -77);
                    if (param0 == 3940) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_v = -12;
                    return;
                }
                case 11: {
                    return;
                }
                case 13: {
                    if (param0 == 3940) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_v = -12;
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_c <= var5) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_R[var5] = (short)(this.field_R[var5] + param3);
                    this.field_x[var5] = (short)(this.field_x[var5] + param1);
                    this.field_Q[var5] = (short)(this.field_Q[var5] + param2);
                    var5++;
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 7) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_P = 39;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    this.a((byte) -64);
                    return;
                }
                case 8: {
                    this.a((byte) -64);
                    return;
                }
                case 9: {
                    if (param0 == 7) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_P = 39;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    this.a((byte) -64);
                    return;
                }
                case 12: {
                    this.a((byte) -64);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        if (param0 <= 63) {
            return;
        }
        field_k = null;
        field_D = null;
        field_C = null;
        field_o = null;
        field_p = null;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (!this.field_O) {
          this.field_O = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          if (param0 == 2) {
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              if (this.field_c > var8) {
                var9 = this.field_R[var8];
                var10 = this.field_x[var8];
                var11 = this.field_Q[var8];
                if (var12 == 0) {
                  L1: {
                    if (var5 < var9) {
                      var5 = var9;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var9 >= var2) {
                      break L2;
                    } else {
                      var2 = var9;
                      break L2;
                    }
                  }
                  L3: {
                    if (var10 >= var3) {
                      break L3;
                    } else {
                      var3 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    if (var10 > var6) {
                      var6 = var10;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var11 <= var7) {
                      break L5;
                    } else {
                      var7 = var11;
                      break L5;
                    }
                  }
                  L6: {
                    if (var11 < var4) {
                      var4 = var11;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8++;
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    this.field_v = var4;
                    this.field_z = var7;
                    this.field_F = var6;
                    this.field_P = var2;
                    this.field_J = var3;
                    this.field_d = var5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_v = var4;
                this.field_z = var7;
                this.field_F = var6;
                this.field_P = var2;
                this.field_J = var3;
                this.field_d = var5;
                return;
              }
            }
          } else {
            this.field_f = (int[]) null;
            var7 = -32768;
            var8 = 0;
            L7: while (true) {
              if (this.field_c > var8) {
                var9 = this.field_R[var8];
                var10 = this.field_x[var8];
                var11 = this.field_Q[var8];
                if (var12 == 0) {
                  L8: {
                    if (var5 < var9) {
                      var5 = var9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var9 >= var2) {
                      break L9;
                    } else {
                      var2 = var9;
                      break L9;
                    }
                  }
                  L10: {
                    if (var10 >= var3) {
                      break L10;
                    } else {
                      var3 = var10;
                      break L10;
                    }
                  }
                  L11: {
                    if (var10 > var6) {
                      var6 = var10;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var11 <= var7) {
                      break L12;
                    } else {
                      var7 = var11;
                      break L12;
                    }
                  }
                  L13: {
                    if (var11 < var4) {
                      var4 = var11;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var8++;
                  if (var12 == 0) {
                    continue L7;
                  } else {
                    this.field_v = var4;
                    this.field_z = var7;
                    this.field_F = var6;
                    this.field_P = var2;
                    this.field_J = var3;
                    this.field_d = var5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_v = var4;
                this.field_z = var7;
                this.field_F = var6;
                this.field_P = var2;
                this.field_J = var3;
                this.field_d = var5;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    wd() {
        this.field_m = (byte) 0;
        this.field_O = false;
    }

    static {
        field_k = "Username: ";
        field_D = new int[]{2, 1, 2, 5, 3, 3, 3, 5, 10, 1, 1, 2, 2, 1, 2, 5, 10, 1, 2, 2, 2, 5, 2, 1};
        field_o = new int[9];
    }
}
