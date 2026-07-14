/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends ca {
    private int field_A;
    private pd field_E;
    int field_C;
    private int field_t;
    private int[] field_i;
    private int field_j;
    int field_F;
    int field_l;
    private int field_B;
    private double field_u;
    private ok[] field_r;
    static int field_m;
    int field_g;
    private int field_n;
    private int field_x;
    private boolean field_z;
    kb field_s;
    private int field_D;
    lb field_p;
    private int field_q;
    private int field_v;
    private int field_o;
    private int field_k;
    private f field_f;
    int field_w;
    int field_h;
    private int field_y;

    final void b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_75_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_74_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((kb) this).field_g = param2;
                        ((kb) this).field_h = param1;
                        var4_int = 10;
                        var5 = 2;
                        if (-2 != (((kb) this).field_C ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = 8 + 2 * ((kb) this).field_F;
                        var5 = 2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((kb) this).field_C != 4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 30;
                        var5 = 5;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((kb) this).field_C != 2) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = 20;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((kb) this).field_F ^ -1) == -4) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = 25;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (4 != ((kb) this).field_F) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = 30;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = 5;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-4 == (((kb) this).field_C ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_int = 6;
                        var5 = 2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((((kb) this).field_C ^ -1) == -6) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5 = 2;
                        var4_int = 6;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((kb) this).field_i = new int[(1 + 2 * var4_int) * (2 * var4_int - -1) - (var5 * 2 + -1) * ((var5 + -1) * 2 - -1)];
                        ((kb) this).field_l = var4_int;
                        ((kb) this).field_D = param0;
                        if (((kb) this).field_C == 0) {
                            statePc = 68;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 3;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 == ((kb) this).field_C) {
                            statePc = 68;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-2 == (((kb) this).field_C ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 2;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == ((kb) this).field_C) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-6 != (((kb) this).field_C ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6_int = ((kb) this).field_g;
                        var7 = ((kb) this).field_h;
                        ((kb) this).field_g = var6_int;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = ((kb) this).field_g;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= var6_int + 1) {
                            statePc = 55;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = this;
                        stackOut_40_1 = var7;
                        stackIn_56_0 = stackOut_40_0;
                        stackIn_56_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var9 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((kb) this).field_h = stackIn_41_1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((kb) this).field_h >= var7 - -1) {
                            statePc = 54;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = -var4_int;
                        stackIn_39_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (var9 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8 = stackIn_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var8 >= var4_int) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, var8 + ((kb) this).field_h);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var8 + ((kb) this).field_g, var4_int + ((kb) this).field_h);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var4_int + ((kb) this).field_g, ((kb) this).field_h - var8);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g + -var8, ((kb) this).field_h + -var4_int);
                        var8++;
                        if (var9 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((kb) this).field_h = ((kb) this).field_h + 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((kb) this).field_g = ((kb) this).field_g + 1;
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((kb) this).field_g = var6_int;
                        stackOut_55_0 = this;
                        stackOut_55_1 = var7;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((kb) this).field_h = stackIn_56_1;
                        if (var9 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-5 != (((kb) this).field_C ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ((kb) this).field_g = ((kb) this).field_g + 1;
                        var4_int++;
                        ((kb) this).field_h = ((kb) this).field_h + 1;
                        var6_int = -var4_int;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var4_int <= var6_int) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, var6_int + ((kb) this).field_h);
                        ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, var6_int + ((kb) this).field_g, ((kb) this).field_h + var4_int);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var4_int + ((kb) this).field_g, -var6_int + ((kb) this).field_h);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, -var6_int + ((kb) this).field_g, -var4_int + ((kb) this).field_h);
                        var6_int++;
                        if (var9 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var9 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ((kb) this).field_h = ((kb) this).field_h - 1;
                        var4_int--;
                        ((kb) this).field_g = ((kb) this).field_g - 1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var9 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6_int = -var4_int;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var6_int >= var4_int) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, ((kb) this).field_h + var6_int);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - -var6_int, var4_int + ((kb) this).field_h);
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - -var4_int, ((kb) this).field_h - var6_int);
                        stackOut_70_0 = this;
                        stackIn_75_0 = stackOut_70_0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var9 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - var6_int, -var4_int + ((kb) this).field_h);
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = this;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var6 = ((kb) this).field_i;
                        ((kb) this).field_i = new int[((kb) this).field_D];
                        var7 = 0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var7 >= ((kb) this).field_D) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((kb) this).field_i[var7] = var6[var7];
                        var7++;
                        if (var9 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var9 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ((kb) this).field_w = ((kb) this).field_g - -(((kb) this).field_f.field_f.field_c * ((kb) this).field_h);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (5 == ((kb) this).field_C) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((kb) this).field_y = 0;
                        ((kb) this).field_k = 0;
                        ((kb) this).field_B = 0;
                        ((kb) this).field_r = new ok[(1 + ((kb) this).field_F) * 25 + 1];
                        var7 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var7 ^ -1) <= (((kb) this).field_r.length ^ -1)) {
                            statePc = 93;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        ((kb) this).field_r[var7] = new ok();
                        var7++;
                        if (var9 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var9 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var4, "kb.C(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 93: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 27) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = -2;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (((kb) this).field_k != ((kb) this).field_B) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if ((((kb) this).field_k ^ -1) > (((kb) this).field_B ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((kb) this).field_B + -((kb) this).field_k + ((kb) this).field_r.length;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackOut_9_0 = ((kb) this).field_B + -((kb) this).field_k;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "kb.A(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, float param1, int param2, int param3, float param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          var7 = -102 % ((-37 - param2) / 56);
          var6_int = (((kb) this).field_B - -1) % ((kb) this).field_r.length;
          if ((((kb) this).field_k ^ -1) != (var6_int ^ -1)) {
            return stackIn_2_0 != 0;
          } else {
            stackOut_1_0 = 0;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((kb) this).field_r[((kb) this).field_B].field_e = param1;
          ((kb) this).field_r[((kb) this).field_B].field_d = param4;
          ((kb) this).field_r[((kb) this).field_B].field_b = param0;
          ((kb) this).field_r[((kb) this).field_B].field_g = param3;
          ((kb) this).field_r[((kb) this).field_B].field_c = ((kb) this).field_y - -60;
          ((kb) this).field_B = var6_int;
          stackOut_3_0 = 1;
          stackIn_4_0 = stackOut_3_0;
        }
        return false;
    }

    final static void a(mg param0, boolean param1) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_10_0 = 0;
            int stackIn_10_1 = 0;
            int stackIn_20_0 = 0;
            int stackIn_20_1 = 0;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            int stackOut_9_0 = 0;
            int stackOut_9_1 = 0;
            int stackOut_19_0 = 0;
            int stackOut_19_1 = 0;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = new byte[24];
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!param1) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 5 : 32);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            field_m = -86;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 5 : 32);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (null == s.field_y) {
                                statePc = 30;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            s.field_y.a(0L, -1);
                            s.field_y.a(var2, 4);
                            var3_int = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 19;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -1;
                            stackOut_9_1 = var2[var3_int] ^ -1;
                            stackIn_20_0 = stackOut_9_0;
                            stackIn_20_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                                statePc = 20;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 12 : 32);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (stackIn_10_0 == stackIn_10_1) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 12 : 32);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var5 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = -25;
                            stackOut_19_1 = var3_int ^ -1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (stackIn_20_0 < stackIn_20_1) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 22 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 22 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            exception = (Exception) (Object) caughtException;
                            var4 = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var2[var4] = (byte) -1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 38;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof Exception ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var5 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof Exception ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            param0.a(0, 24, (byte) -11, var2);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = (RuntimeException) runtimeException;
                            stackOut_33_1 = new StringBuilder().append("kb.D(");
                            stackIn_36_0 = stackOut_33_0;
                            stackIn_36_1 = stackOut_33_1;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            if (param0 == null) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                            stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                            stackOut_34_2 = "{...}";
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            stackIn_37_2 = stackOut_34_2;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 36: {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                        stackOut_36_2 = "null";
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        throw dd.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 41);
                    }
                    case 38: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            ld.field_e = param2;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var3 = param0.getParameter("cookieprefix");
                            var4 = param0.getParameter("cookiehost");
                            if (!param1) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                            if ((param2.length() ^ -1) == -1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var5 = var5 + "; Expires=" + dh.a(-15591, ji.b(-78) + 94608000000L) + "; Max-Age=" + 94608000L;
                            if (!OrbDefence.field_D) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            g.a(1, param0);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (RuntimeException) var3_ref2;
                            stackOut_12_1 = new StringBuilder().append("kb.B(");
                            stackIn_15_0 = stackOut_12_0;
                            stackIn_15_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (param0 == null) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                            stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                            stackOut_13_2 = "{...}";
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_16_1 = stackOut_13_1;
                            stackIn_16_2 = stackOut_13_2;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "null";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (param2 == null) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                            stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                            stackOut_17_2 = "{...}";
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_20_1 = stackOut_17_1;
                            stackIn_20_2 = stackOut_17_2;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw dd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
                    }
                    case 21: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, pd param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
        pd stackIn_82_0 = null;
        int stackIn_98_0 = 0;
        int stackIn_103_0 = 0;
        Object stackIn_105_0 = null;
        int stackIn_109_0 = 0;
        Object stackIn_113_0 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        pd stackOut_81_0 = null;
        int stackOut_97_0 = 0;
        int stackOut_102_0 = 0;
        Object stackOut_104_0 = null;
        int stackOut_108_0 = 0;
        Object stackOut_112_0 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 <= (-param1.field_h + param1.field_o ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((kb) this).field_f.field_h.a(-74, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 1));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null == ((kb) this).field_p) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        nh.field_b = nh.field_b + param0;
                        ((kb) this).field_p.field_d = ((kb) this).field_p.field_d + param0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param1.field_h = param1.field_h + param0;
                        var4_int = 79 % ((param2 - -47) / 56);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == param1.field_p) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = ((kb) this).field_g - param1.field_u;
                        var6 = -param1.field_z + ((kb) this).field_h;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var6 * var6 + var5 * var5 ^ -1) > -101) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param1.field_B = 0;
                        param1.field_p = (kb) this;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-param1.field_h + param1.field_o > 0) {
                            statePc = 129;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!param1.field_n) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        hf discarded$2 = ea.a(53, mh.field_a[54], (int)(96.0 * param1.field_v));
                        if (var10 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        hf discarded$3 = ea.a(11, mh.field_a[(int)(Math.random() * 5.0) + 49], (int)(96.0 * param1.field_v));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param1.field_h = param1.field_h - param1.field_o;
                        param1.field_o = 0;
                        if ((((kb) this).field_F ^ -1) == -5) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1 == (((kb) this).field_C ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((kb) this).field_f.field_t = ((kb) this).field_f.field_t + 1;
                        if (((kb) this).field_f.field_t != 99) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        f.a(9, 246, (byte) -25);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (((kb) this).field_C == 1) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((kb) this).field_f.field_l = ((kb) this).field_f.field_l + 1;
                        if (((kb) this).field_f.field_l != 99) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        f.a(10, 245, (byte) -25);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((((kb) this).field_C ^ -1) == -3) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((kb) this).field_f.field_u = ((kb) this).field_f.field_u + 1;
                        if ((((kb) this).field_f.field_u ^ -1) == -100) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        f.a(11, 244, (byte) -25);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((((kb) this).field_C ^ -1) == -5) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((kb) this).field_f.field_p = ((kb) this).field_f.field_p + 1;
                        if ((((kb) this).field_f.field_p ^ -1) != -100) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        f.a(12, 243, (byte) -25);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == ((kb) this).field_p) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((kb) this).field_p.field_d = ((kb) this).field_p.field_d + he.field_p[param1.field_y];
                        nh.field_b = nh.field_b + he.field_p[param1.field_y];
                        var5 = he.field_p[param1.field_y];
                        if (!param1.field_n) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var5 = var5 + he.field_p[param1.field_y] * 99;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var6 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var6 ^ -1) <= (var5 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ((kb) this).field_f.field_b.a(-91, (ca) (Object) new oj(param1.field_u, param1.field_z, ((kb) this).field_p, var6));
                        var6++;
                        if (var10 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var10 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ((kb) this).field_f.field_h.a(-99, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 1));
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (-12 > (((kb) this).field_f.field_x ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((((kb) this).field_f.field_m ^ -1) > -5) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ((kb) this).field_f.field_f.field_g[param1.field_u + ((kb) this).field_f.field_f.field_c * param1.field_z] = ((kb) this).field_f.field_f.field_g[param1.field_u + ((kb) this).field_f.field_f.field_c * param1.field_z] + 5;
                        var5 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((((kb) this).field_D ^ -1) >= (var5 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ((kb) this).field_f.field_f.field_v[((kb) this).field_i[var5]] = ((kb) this).field_f.field_f.field_v[((kb) this).field_i[var5]] + 1;
                        var5++;
                        if (var10 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var10 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-6 == (param1.field_y ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = (pd) param1;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (stackIn_82_0.field_n) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var5 = 3;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (param1.field_n) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var5 = 5;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (5 == param1.field_y) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var5 = 10;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var6 = param1.field_u - var5;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = param1.field_u + var5;
                        stackIn_98_0 = stackOut_97_0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (stackIn_98_0 < var6) {
                            statePc = 129;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var10 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var7 = param1.field_z + -var5;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((var7 ^ -1) < (var5 + param1.field_z ^ -1)) {
                            statePc = 121;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = var6;
                        stackIn_98_0 = stackOut_102_0;
                        stackIn_103_0 = stackOut_102_0;
                        if (var10 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (stackIn_103_0 < 0) {
                            statePc = 120;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = this;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((((kb) this).field_f.field_f.field_c ^ -1) >= (var6 ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = 0;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0 > var7) {
                            statePc = 120;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = this;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if ((((kb) this).field_f.field_f.field_t ^ -1) < (var7 ^ -1)) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        ((kb) this).field_f.field_h.a(-107, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 0.05 * (double)(var6 + -param1.field_u), 0.05 * (double)(-param1.field_z + var7), 1));
                        var8 = ((kb) this).field_f.field_f.field_c * var7 + var6;
                        if (-8 != (((kb) this).field_f.field_f.field_o[var8] ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var9 = ((kb) this).field_f.a(var8, -66);
                        var9.d(9);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var6++;
                        if (var10 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 123: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    try {
                        stackOut_124_0 = (RuntimeException) var4;
                        stackOut_124_1 = new StringBuilder().append("kb.E(").append(param0).append(44);
                        stackIn_127_0 = stackOut_124_0;
                        stackIn_127_1 = stackOut_124_1;
                        stackIn_125_0 = stackOut_124_0;
                        stackIn_125_1 = stackOut_124_1;
                        if (param1 == null) {
                            statePc = 127;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
                        stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
                        stackOut_125_2 = "{...}";
                        stackIn_128_0 = stackOut_125_0;
                        stackIn_128_1 = stackOut_125_1;
                        stackIn_128_2 = stackOut_125_2;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 126: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 127: {
                    stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
                    stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
                    stackOut_127_2 = "null";
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    stackIn_128_2 = stackOut_127_2;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    throw dd.a((Throwable) (Object) stackIn_128_0, stackIn_128_2 + 44 + param2 + 41);
                }
                case 129: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 <= -36) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((kb) this).d(-12);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = -param0 - -320;
                        var5 = -param2 - -240;
                        var6 = ((kb) this).field_k;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((kb) this).field_B == var6) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = var4_int + (int)((float)ol.field_e * ((kb) this).field_r[var6].field_e);
                        var8 = (int)(((kb) this).field_r[var6].field_d * (float)ol.field_e) + var5;
                        var9 = var4_int + ((kb) this).field_r[var6].field_b * ol.field_e;
                        var10 = var5 + ol.field_e * ((kb) this).field_r[var6].field_g;
                        var11 = (-((kb) this).field_y + ((kb) this).field_r[var6].field_c) * 4;
                        ul.f(var7 - 1, var8, -1 + var9, var10, 11176191, var11);
                        ul.f(var7 + 1, var8, 1 + var9, var10, 11176191, var11);
                        ul.f(var7, -1 + var8, var9, -1 + var10, 11176191, var11);
                        ul.f(var7, 1 + var8, var9, 1 + var10, 11176191, var11);
                        ul.f(var7, var8, var9, var10, 16777215, var11);
                        var6 = (1 + var6) % ((kb) this).field_r.length;
                        stackOut_7_0 = var12;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var4, "kb.K(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        pd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_6_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 12) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((kb) this).field_y = ((kb) this).field_y + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((kb) this).field_B == ((kb) this).field_k) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = ((kb) this).field_y ^ -1;
                        stackOut_6_1 = ((kb) this).field_r[((kb) this).field_k].field_c ^ -1;
                        stackIn_14_0 = stackOut_6_0;
                        stackIn_14_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((kb) this).field_k = (((kb) this).field_k - -1) % ((kb) this).field_r.length;
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = ((kb) this).field_k ^ -1;
                        stackOut_13_1 = ((kb) this).field_B ^ -1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == stackIn_14_1) {
                            statePc = 68;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = ((kb) this).field_y + 59;
                        var3 = ((kb) this).field_B;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3--;
                        if (0 <= var3) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = -1 + ((kb) this).field_r.length;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((((kb) this).field_r[var3].field_c ^ -1) != (var2_int ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 117);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == var4) {
                            statePc = 64;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = -1;
                        stackOut_21_1 = var4.field_f ^ -1;
                        stackIn_65_0 = stackOut_21_0;
                        stackIn_65_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (var8 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 63;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var4.field_m > 0) {
                            statePc = 63;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5 = ((kb) this).field_r[var3].field_b + -var4.field_u;
                        var6 = ((kb) this).field_r[var3].field_g + -var4.field_z;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (Math.abs(var5) >= 4) {
                            statePc = 63;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = -5;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 < (Math.abs(var6) ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!this.a(var4.field_u, (float)((kb) this).field_r[var3].field_b, 71, var4.field_z, (float)((kb) this).field_r[var3].field_g)) {
                            statePc = 63;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4.field_f = 60;
                        if ((var4.field_y ^ -1) == -8) {
                            statePc = 60;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7 = 5;
                        if (((kb) this).field_F != 1) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = 10;
                        stackOut_41_0 = var8;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((((kb) this).field_F ^ -1) != -3) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = 20;
                        stackOut_46_0 = var8;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (3 != ((kb) this).field_F) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var7 = 40;
                        stackOut_51_0 = var8;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (((kb) this).field_F == 4) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var7 = 80;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.a(var7, var4, 44);
                        if (var8 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4.field_f = 120;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var4 = (pd) (Object) ((kb) this).field_f.field_r.d(param0 ^ 857);
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = ((kb) this).field_k ^ -1;
                        stackOut_64_1 = var3 ^ -1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 != stackIn_65_1) {
                            statePc = 16;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "kb.G(" + param0 + 41);
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_85_0 = 0;
        Object stackIn_91_0 = null;
        int stackOut_24_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_84_0 = 0;
        Object stackOut_90_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -((kb) this).field_o + ((kb) this).field_q;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (32768 < var2_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = var2_int - 65536;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-32768 <= var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = var2_int + 65536;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((kb) this).field_C != 5) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_o + (-(5 * ((kb) this).field_t) + 2500);
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_o + var2_int / 10;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((kb) this).field_o ^ -1) >= -32769) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_o - 65536;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-32768 <= ((kb) this).field_o) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_o + 65536;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((kb) this).field_C == 1) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = 2;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == ((kb) this).field_C) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = this;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((kb) this).field_C != 4) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_q;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param0 > 120) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        if (!((kb) this).field_z) {
                            statePc = 109;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-1 == (((kb) this).field_C ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((kb) this).field_A = ((kb) this).field_E.field_z;
                        ((kb) this).field_x = ((kb) this).field_E.field_u;
                        if ((((kb) this).field_t ^ -1) >= -6) {
                            statePc = 57;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((kb) this).field_t ^ -1) <= -26) {
                            statePc = 57;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = Math.abs(-((kb) this).field_x + ((kb) this).field_g) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h);
                        if ((var3 ^ -1) >= -21) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3 = 20;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var3 ^ -1) > -2) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (((kb) this).field_t >= 5 + var3) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((kb) this).field_f.field_h.a(-114, (ca) (Object) new me((double)((kb) this).field_x + (-5.0 + (double)((kb) this).field_t) * (double)(((kb) this).field_g - ((kb) this).field_x) / (double)var3, (double)(-((kb) this).field_A + ((kb) this).field_h) * ((double)((kb) this).field_t - 5.0) / (double)var3 + (double)((kb) this).field_A, 6));
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-4 == (((kb) this).field_C ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (((kb) this).field_t <= -45 + ((kb) this).field_n) {
                            statePc = 78;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = this;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((((kb) this).field_n ^ -1) < (((kb) this).field_t ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var3 = Math.abs(((kb) this).field_g - ((kb) this).field_x) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var3 > 40) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var3 = 40;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-2 >= (var3 ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3 = 1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-45 + (((kb) this).field_n - -var3) > ((kb) this).field_t) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((kb) this).field_f.field_h.a(-90, (ca) (Object) new me((double)((kb) this).field_x + (double)(-((kb) this).field_x + ((kb) this).field_g) * ((double)((kb) this).field_t - ((double)((kb) this).field_n - 45.0)) / (double)var3, (double)((kb) this).field_A + (double)(-((kb) this).field_A + ((kb) this).field_h) * (45.0 - (double)((kb) this).field_n + (double)((kb) this).field_t) / (double)var3, 8));
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (2 != ((kb) this).field_C) {
                            statePc = 109;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (((kb) this).field_t != 50) {
                            statePc = 89;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3_double = 0.0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (6.283185307179586 <= var3_double) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ((kb) this).field_f.field_h.a(-82, (ca) (Object) new me((double)((kb) this).field_x + Math.random() - 0.5, (double)((kb) this).field_A + Math.random() - 0.5, 0.05 * Math.sin(var3_double), Math.cos(var3_double) * 0.05, 1));
                        var3_double = var3_double + 0.8;
                        stackOut_84_0 = var7;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 != 0) {
                            statePc = 109;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var7 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (((kb) this).field_t <= 50) {
                            statePc = 109;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = this;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((kb) this).field_t < 100) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var3 = (Math.abs(-((kb) this).field_x + ((kb) this).field_g) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h)) * 5;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-51 > (var3 ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var3 = 50;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (-2 < (var3 ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var3 = 1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((((kb) this).field_t ^ -1) <= (var3 + 50 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var4 = var3 / 2;
                        var5 = ((kb) this).field_t - (var4 + 50);
                        var6 = (int)(0.5 * Math.sqrt((double)(-(var5 * var5) + var4 * var4)));
                        ((kb) this).field_f.field_h.a(-119, (ca) (Object) new me((double)((kb) this).field_x + (double)(-((kb) this).field_x + ((kb) this).field_g) * ((double)((kb) this).field_t - 50.0) / (double)var3, (double)(-var6) + ((double)(-((kb) this).field_A + ((kb) this).field_h) * ((double)((kb) this).field_t - 50.0) / (double)var3 + (double)((kb) this).field_A), 4));
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 108: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "kb.H(" + param0 + 41);
                }
                case 109: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var7_ref_hj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = OrbDefence.field_D ? 1 : 0;
        if (-1 == ((kb) this).field_C) {
          return;
        } else {
          L0: {
            if (param2 == -8) {
              break L0;
            } else {
              this.b((byte) -4);
              break L0;
            }
          }
          L1: {
            var4_int = 320 + -param0 + ((kb) this).field_g * ol.field_e;
            var5 = 240 + (-param1 + ((kb) this).field_h * ol.field_e);
            ((kb) this).field_u = 320.0 / (double)(320 + Math.abs(-320 + var4_int));
            if (!((kb) this).field_z) {
              break L1;
            } else {
              L2: {
                L3: {
                  var6 = 320 + (ol.field_e * ((kb) this).field_x + -param0);
                  var7 = 240 + -param1 + ol.field_e * ((kb) this).field_A;
                  var10 = ((kb) this).field_C;
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    if (var15 == 0) {
                      if ((((kb) this).field_t ^ -1) < (((kb) this).field_n - 20 ^ -1)) {
                        var10 = ol.field_e / 2 + var4_int;
                        var11 = -8 + (var5 + ol.field_e / 2);
                        ul.f(var6 + -1, var7, -1 + var10, var11, 11176191, -(10 * (((kb) this).field_n - ((kb) this).field_t)) + 200);
                        ul.f(var6 - -1, var7, 1 + var10, var11, 11176191, -(10 * (-((kb) this).field_t + ((kb) this).field_n)) + 200);
                        ul.f(var6, -1 + var7, var10, var11 + -1, 11176191, 200 + -((-((kb) this).field_t + ((kb) this).field_n) * 10));
                        ul.f(var6, 1 + var7, var10, 1 + var11, 11176191, 200 + -(10 * (-((kb) this).field_t + ((kb) this).field_n)));
                        ul.f(var6, var7, var10, var11, 16777215, 200 - 10 * (((kb) this).field_n + -((kb) this).field_t));
                        if (var15 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (var10 == 4) {
                  break L2;
                } else {
                  break L1;
                }
              }
              L4: {
                var9 = -12 + (ol.field_e + var5);
                var8 = var4_int - -ol.field_e;
                if (5 < ((kb) this).field_t) {
                  break L4;
                } else {
                  if (((kb) this).field_E == null) {
                    break L4;
                  } else {
                    if (-1 <= (-((kb) this).field_E.field_h + ((kb) this).field_E.field_o ^ -1)) {
                      break L4;
                    } else {
                      ul.f(var6 + -1, var7, var8 - 1, var9, 16776960, 200 - (-((kb) this).field_t + ((kb) this).field_n) * 10);
                      ul.f(1 + var6, var7, var8 + 1, var9, 16776960, -((-((kb) this).field_t + ((kb) this).field_n) * 10) + 200);
                      ul.f(var6, -1 + var7, var8, -1 + var9, 16776960, 200 - (((kb) this).field_n - ((kb) this).field_t) * 10);
                      ul.f(var6, var7 - -1, var8, 1 + var9, 16776960, 200 + -((((kb) this).field_n - ((kb) this).field_t) * 10));
                      ul.f(var6, var7, var8, var9, 16777215, 200 - (-((kb) this).field_t + ((kb) this).field_n) * 10);
                      if (var15 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              if (50 < ((kb) this).field_t) {
                break L1;
              } else {
                if (((kb) this).field_E == null) {
                  break L1;
                } else {
                  if (((kb) this).field_E.field_o - ((kb) this).field_E.field_h > 0) {
                    ((kb) this).field_x = ((kb) this).field_E.field_u;
                    ((kb) this).field_A = ((kb) this).field_E.field_z;
                    ul.f(-1 + var6, var7, -1 + var8, var9, 16776960, 250 + -(5 * ((kb) this).field_t));
                    ul.f(var6 + 1, var7, 1 + var8, var9, 16776960, 250 + -(((kb) this).field_t * 5));
                    ul.f(var6, var7 - 1, var8, var9 - 1, 16776960, 5 * (-((kb) this).field_t + 50));
                    ul.f(var6, 1 + var7, var8, var9 - -1, 16776960, (-((kb) this).field_t + 50) * 5);
                    ul.f(var6, var7, var8, var9, 16777215, 5 * (50 - ((kb) this).field_t));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L5: {
            L6: {
              if ((((kb) this).field_C ^ -1) == -1) {
                break L6;
              } else {
                L7: {
                  if ((((kb) this).field_C ^ -1) != -2) {
                    break L7;
                  } else {
                    L8: {
                      var5 = var5 + ol.field_e / 2;
                      var4_int = var4_int + ol.field_e / 2;
                      hf.field_g[((kb) this).field_C * 7 + 0].a(var4_int, -5 + var5, 0, 1950);
                      var6 = 32;
                      if (-1 != (((kb) this).field_F ^ -1)) {
                        break L8;
                      } else {
                        var6 = 24;
                        break L8;
                      }
                    }
                    L9: {
                      if (((kb) this).field_F != 1) {
                        break L9;
                      } else {
                        var6 = 24;
                        break L9;
                      }
                    }
                    L10: {
                      if (-3 == (((kb) this).field_F ^ -1)) {
                        var6 = 24;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (3 == ((kb) this).field_F) {
                        var6 = 24;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (((kb) this).field_F == 4) {
                        var6 = 24;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    hf.field_g[((kb) this).field_C * 7 + ((kb) this).field_F + 2].a(528, var6 << 1938238244, var4_int << 653233604, var5 + -8 << 38535684, 32768 + ((kb) this).field_o, 1950);
                    hf.field_g[1 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 5, 0, 1950);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                L13: {
                  if (2 != ((kb) this).field_C) {
                    break L13;
                  } else {
                    L14: {
                      var4_int = var4_int + ol.field_e / 2;
                      var5 = var5 + ol.field_e / 2;
                      hf.field_g[0 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 5, 0, 1950);
                      var6 = 32;
                      if (-1 != (((kb) this).field_F ^ -1)) {
                        break L14;
                      } else {
                        var6 = 24;
                        break L14;
                      }
                    }
                    L15: {
                      if ((((kb) this).field_F ^ -1) != -2) {
                        break L15;
                      } else {
                        var6 = 24;
                        break L15;
                      }
                    }
                    L16: {
                      if (-3 == (((kb) this).field_F ^ -1)) {
                        var6 = 24;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((((kb) this).field_F ^ -1) == -4) {
                        var6 = 24;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (((kb) this).field_F != 4) {
                        break L18;
                      } else {
                        var6 = 24;
                        break L18;
                      }
                    }
                    hf.field_g[((kb) this).field_F + (2 - -(7 * ((kb) this).field_C))].a(528, var6 << 303462692, var4_int << -1161801244, var5 - 12 << -2131739932, ((kb) this).field_o - -32768, 1950);
                    hf.field_g[7 * ((kb) this).field_C + 1].a(var4_int, -8 + var5, 0, 1950);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L13;
                    }
                  }
                }
                L19: {
                  if (((kb) this).field_C == 5) {
                    break L19;
                  } else {
                    L20: {
                      if (((kb) this).field_C != 6) {
                        break L20;
                      } else {
                        hf.field_g[7 * ((kb) this).field_C + 0].a(var4_int, var5 - 5, 0, 1300);
                        if (((kb) this).field_s == null) {
                          break L5;
                        } else {
                          if ((((kb) this).field_s.field_C ^ -1) != 0) {
                            L21: {
                              var6 = var4_int;
                              var7 = -10 + var5;
                              var8 = 320 + ((kb) this).field_s.field_g * ol.field_e - param0;
                              var9 = -10 + (-param1 + (((kb) this).field_s.field_h * ol.field_e - -240));
                              var10 = 200 * ((kb) this).field_j / 100;
                              if ((((kb) this).field_s.field_t ^ -1) >= 9) {
                                break L21;
                              } else {
                                L22: {
                                  var10 = 20 * -((kb) this).field_s.field_t;
                                  var11 = var6 + -var8;
                                  var12 = var7 - var9;
                                  if (var11 != 0) {
                                    break L22;
                                  } else {
                                    if ((var12 ^ -1) == -1) {
                                      break L21;
                                    } else {
                                      var7 = var9 + var12 * -((kb) this).field_s.field_t / 10;
                                      if (var15 == 0) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                var6 = var8 - -(-((kb) this).field_s.field_t * var11 / 10);
                                break L21;
                              }
                            }
                            var11 = 11176191;
                            ul.f(var6 - 1, var7, -1 + var8, var9, var11, var10);
                            var12 = 16777215;
                            ul.f(var6 + 1, var7, var8 - -1, var9, var11, var10);
                            ul.f(var6, -1 + var7, var8, -1 + var9, var11, var10);
                            ul.f(var6, var7 - -1, var8, var9 + 1, var11, var10);
                            ul.f(var6, var7, var8, var9, var12, var10);
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L20;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L23: {
                      if (-4 != (((kb) this).field_C ^ -1)) {
                        break L23;
                      } else {
                        L24: {
                          hf.field_g[7 * ((kb) this).field_C + 0].a(var4_int, -5 + var5, 0, 1300);
                          var6 = 32;
                          if (0 == ((kb) this).field_F) {
                            var6 = 24;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (((kb) this).field_F == 1) {
                            var6 = 24;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (((kb) this).field_F == 2) {
                            var6 = 24;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (-4 == (((kb) this).field_F ^ -1)) {
                            var6 = 24;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (((kb) this).field_F == 4) {
                            var6 = 24;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        hf.field_g[7 * ((kb) this).field_C + (((kb) this).field_F + 2)].a(528, var6 << 933634884, var4_int << 1560917188, -12 + var5 << 202859460, ((kb) this).field_o - -32768, 1800);
                        hf.field_g[1 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 10, 0, 1300);
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (4 != ((kb) this).field_C) {
                      break L5;
                    } else {
                      L29: {
                        var4_int = var4_int + ol.field_e;
                        var5 = var5 + ol.field_e;
                        hf.field_g[0 - -(((kb) this).field_C * 7)].a(var4_int, var5 + -5, 0, 2600);
                        var6 = 32;
                        if (-1 != (((kb) this).field_F ^ -1)) {
                          break L29;
                        } else {
                          var6 = 16;
                          break L29;
                        }
                      }
                      L30: {
                        if (1 == ((kb) this).field_F) {
                          var6 = 16;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (-3 == (((kb) this).field_F ^ -1)) {
                          var6 = 16;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if ((((kb) this).field_F ^ -1) != -4) {
                          break L32;
                        } else {
                          var6 = 16;
                          break L32;
                        }
                      }
                      L33: {
                        if (4 != ((kb) this).field_F) {
                          break L33;
                        } else {
                          var6 = 16;
                          break L33;
                        }
                      }
                      hf.field_g[7 * ((kb) this).field_C + (((kb) this).field_F + 2)].a(528, var6 << -197719484, var4_int << 725426724, var5 - 12 << -1597101948, 32768 + ((kb) this).field_o, 2600);
                      hf.field_g[((kb) this).field_C * 7 + 1].a(var4_int, var5 + -8, 0, 2600);
                      if (var15 == 0) {
                        break L5;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                L34: {
                  var4_int = var4_int + ol.field_e / 2;
                  var5 = var5 + ol.field_e / 2;
                  var6 = 1950;
                  hf.field_g[7 * ((kb) this).field_C + 0].a(var4_int, -5 + var5, 0, var6);
                  var7_ref_hj = hf.field_g[2 - -((kb) this).field_F + ((kb) this).field_C * 7];
                  var7_ref_hj.a(var7_ref_hj.field_s << 95796387, var7_ref_hj.field_t << 1016741347, var4_int << -1917870652, -12 + var5 << -1819484508, 32768 + ((kb) this).field_o, var6);
                  hf.field_g[((kb) this).field_C * 7 + 1].a(var4_int, var5 - 8, 0, var6);
                  if (((kb) this).field_t <= 5) {
                    var8 = ((kb) this).field_f.field_i % 9000;
                    var9 = var6 * hf.field_g[7 * ((kb) this).field_C].field_o >> -738604692;
                    var10 = hf.field_g[((kb) this).field_C * 7].field_k * var6 >> 1487675052;
                    var11 = (((kb) this).field_g * ((kb) this).field_g + var8) % var9 + var4_int + -(var9 >> -1718563167);
                    var12 = (((kb) this).field_h * ((kb) this).field_g + var8) % var10 - -var5 - (var10 >> 601988865);
                    var13 = -(var9 >> 1463485537) - (-var4_int - (var8 * var8 + ((kb) this).field_g) % var9);
                    var14 = var8 * var8 % var10 - -var5 + -(var10 >> 217328737);
                    ul.f(var11, var12, var13, var14, 16777215, 200);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                if (var15 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L35: {
              hf.field_g[0 - -(((kb) this).field_C * 7)].a(var4_int, var5 - 5, 0, 1300);
              var6 = 32;
              if (((kb) this).field_F == 0) {
                var6 = 32;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (-2 == (((kb) this).field_F ^ -1)) {
                var6 = 32;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (-3 != (((kb) this).field_F ^ -1)) {
                break L37;
              } else {
                var6 = 24;
                break L37;
              }
            }
            L38: {
              if ((((kb) this).field_F ^ -1) != -4) {
                break L38;
              } else {
                var6 = 24;
                break L38;
              }
            }
            L39: {
              if ((((kb) this).field_F ^ -1) == -5) {
                var6 = 24;
                break L39;
              } else {
                break L39;
              }
            }
            hf.field_g[7 * ((kb) this).field_C + (2 - -((kb) this).field_F)].a(528, var6 << 1383137316, var4_int << -1592905724, var5 + -8 << 230949348, 32768 + ((kb) this).field_o, 1300);
            hf.field_g[1 + 7 * ((kb) this).field_C].a(var4_int, -6 + var5, 0, 1300);
            break L5;
          }
          L40: {
            if (null == ((kb) this).field_p) {
              break L40;
            } else {
              L41: {
                var6 = 0;
                if (((kb) this).field_p.field_i != 0) {
                  break L41;
                } else {
                  var6 = 16711680;
                  break L41;
                }
              }
              L42: {
                if ((((kb) this).field_p.field_i ^ -1) != -2) {
                  break L42;
                } else {
                  var6 = 65280;
                  break L42;
                }
              }
              L43: {
                if (((kb) this).field_p.field_i != 2) {
                  break L43;
                } else {
                  var6 = 255;
                  break L43;
                }
              }
              L44: {
                if (3 != ((kb) this).field_p.field_i) {
                  break L44;
                } else {
                  var6 = 16776960;
                  break L44;
                }
              }
              L45: {
                var5 -= 15;
                if (-1 <= (((kb) this).field_F ^ -1)) {
                  break L45;
                } else {
                  L46: {
                    var6 = 16777215;
                    if (1 == ((kb) this).field_F) {
                      var6 = 255;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  L47: {
                    if ((((kb) this).field_F ^ -1) != -3) {
                      break L47;
                    } else {
                      var6 = 8913151;
                      break L47;
                    }
                  }
                  L48: {
                    if (-4 == (((kb) this).field_F ^ -1)) {
                      var6 = 16746751;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if ((((kb) this).field_F ^ -1) == -5) {
                      var6 = 16777215;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L50: {
                    var7 = 4;
                    ul.i(var4_int, var5, var7, var6, 128);
                    if (-3 <= (ol.field_e >> -1681279358 ^ -1)) {
                      break L50;
                    } else {
                      ul.i(var4_int, var5, -1 + var7, var6, 128);
                      break L50;
                    }
                  }
                  L51: {
                    if (-4 <= (ol.field_e >> 1281681026 ^ -1)) {
                      break L51;
                    } else {
                      ul.i(var4_int, var5, -2 + var7, var6, 128);
                      break L51;
                    }
                  }
                  ul.g(var4_int, var5, var7, 0);
                  break L45;
                }
              }
              L52: {
                if (-5 >= (((kb) this).field_F ^ -1)) {
                  break L52;
                } else {
                  if (ui.field_a[((kb) this).field_C][((kb) this).field_F - -1] > ((kb) this).field_f.field_e[0].b(true)) {
                    break L52;
                  } else {
                    if (((kb) this).field_F >= jk.field_j[((kb) this).field_C]) {
                      break L52;
                    } else {
                      var7 = 64 + (int)(Math.sin((double)ji.b(param2 ^ 91) * 0.01 + (double)((kb) this).field_g + (double)((kb) this).field_h) * 48.0);
                      var6 = 16777215;
                      ul.a(var4_int << 1217976036, var5 << 1762441316, var7, 255, ki.field_f);
                      break L52;
                    }
                  }
                }
              }
              var5 += 15;
              break L40;
            }
          }
          L53: {
            if (((kb) this).field_v >= 50) {
              break L53;
            } else {
              if (-3 <= (((kb) this).field_t ^ -1)) {
                L54: {
                  L55: {
                    var6 = 16776960;
                    if ((((kb) this).field_h & 1) > 0) {
                      break L55;
                    } else {
                      var4_int++;
                      if (var15 == 0) {
                        break L54;
                      } else {
                        break L55;
                      }
                    }
                  }
                  var4_int--;
                  break L54;
                }
                L56: {
                  if ((((kb) this).field_v ^ -1) >= -1) {
                    var6 = 16711680;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                ul.h(-1 + var4_int, -5 + var5, 4, 11, 0);
                ul.h(var4_int, var5 + -4, 2, 4, var6);
                ul.h(var4_int, var5 - -3, 2, 2, var6);
                break L53;
              } else {
                break L53;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        pd var2 = null;
        int var3 = 0;
        pd var3_ref = null;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var5_ref_pd = null;
        int var6 = 0;
        km var6_ref = null;
        int var7 = 0;
        kb var8_ref_kb = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_31_0 = 0;
        kb stackIn_47_0 = null;
        Object stackIn_47_1 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        kb stackIn_181_0 = null;
        Object stackIn_181_1 = null;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_256_1 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_283_0 = 0;
        int stackIn_283_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_30_0 = 0;
        kb stackOut_46_0 = null;
        Object stackOut_46_1 = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_171_1 = 0;
        int stackOut_177_0 = 0;
        int stackOut_177_1 = 0;
        Object stackOut_180_0 = null;
        Object stackOut_180_1 = null;
        int stackOut_246_0 = 0;
        int stackOut_246_1 = 0;
        int stackOut_255_0 = 0;
        int stackOut_255_1 = 0;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_281_0 = 0;
        int stackOut_281_1 = 0;
        int stackOut_282_0 = 0;
        int stackOut_282_1 = 0;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          if (param0 == 89) {
            break L0;
          } else {
            ((kb) this).a(59, (byte) -37, 78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != ((kb) this).field_p) {
              break L2;
            } else {
              ((kb) this).field_v = 200;
              if (var10 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var2_int = ((kb) this).field_p.field_j - ((kb) this).field_g;
          var3 = -((kb) this).field_h + ((kb) this).field_p.field_c;
          if (-101 > (var2_int * var2_int - -(var3 * var3) ^ -1)) {
            break L1;
          } else {
            ((kb) this).field_v = 200;
            break L1;
          }
        }
        L3: {
          L4: {
            ((kb) this).field_v = 200;
            if (6 != ((kb) this).field_C) {
              break L4;
            } else {
              if (null == ((kb) this).field_s) {
                break L4;
              } else {
                L5: {
                  if (((kb) this).field_j <= 0) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var2_int = stackIn_14_0;
                    var3 = 0;
                    var4 = ((kb) this).field_s.field_w;
                    var5 = 1;
                    if ((((kb) this).field_g ^ -1) < (((kb) this).field_s.field_g ^ -1)) {
                      break L7;
                    } else {
                      L8: {
                        if ((((kb) this).field_h ^ -1) <= (((kb) this).field_s.field_h ^ -1)) {
                          break L8;
                        } else {
                          var5 = ((kb) this).field_f.field_f.field_c;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if ((((kb) this).field_s.field_h ^ -1) > (((kb) this).field_h ^ -1)) {
                        var5 = -((kb) this).field_f.field_f.field_c;
                        if (var10 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = -1;
                  break L6;
                }
                var6 = ((kb) this).field_w;
                L9: while (true) {
                  L10: {
                    L11: {
                      if ((var6 ^ -1) == (var4 ^ -1)) {
                        break L11;
                      } else {
                        ((kb) this).field_f.field_f.field_e[var6] = var2_int != 0;
                        stackOut_25_0 = ((kb) this).field_f.field_f.field_m[var6];
                        stackIn_31_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var10 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (!stackIn_26_0) {
                              break L12;
                            } else {
                              var3++;
                              break L12;
                            }
                          }
                          var6 = var6 + var5;
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = var3 ^ -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L10;
                  }
                  L13: {
                    if (stackIn_31_0 < -1) {
                      break L13;
                    } else {
                      if (((kb) this).field_j < 100) {
                        ((kb) this).field_j = ((kb) this).field_j + 1;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L13;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((kb) this).field_j = ((kb) this).field_j - var3;
                  if ((((kb) this).field_j ^ -1) < -1) {
                    break L4;
                  } else {
                    var6 = ((kb) this).field_w;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var4 == var6) {
                            break L16;
                          } else {
                            ((kb) this).field_f.field_f.field_e[var6] = false;
                            var6 = var6 + var5;
                            if (var10 != 0) {
                              break L15;
                            } else {
                              if (var10 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        ((kb) this).field_f.a(3, ((kb) this).field_g, (byte) -38, ((kb) this).field_h);
                        hf discarded$3 = ea.a(113, mh.field_a[59], (int)(96.0 * ((kb) this).field_u));
                        ((kb) this).d(9);
                        ((kb) this).field_C = -1;
                        break L15;
                      }
                      var6_ref = new km(((kb) this).field_f.field_o);
                      var7 = 0;
                      var8_ref_kb = (kb) (Object) var6_ref.d(27935);
                      L17: while (true) {
                        L18: {
                          if (var8_ref_kb == null) {
                            break L18;
                          } else {
                            stackOut_46_0 = (kb) var8_ref_kb;
                            stackOut_46_1 = this;
                            stackIn_181_0 = stackOut_46_0;
                            stackIn_181_1 = stackOut_46_1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              L19: {
                                if ((Object) (Object) stackIn_47_0 == this) {
                                  break L19;
                                } else {
                                  if (var8_ref_kb.field_s != ((kb) this).field_s) {
                                    break L19;
                                  } else {
                                    var7 = 1;
                                    if (var10 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var8_ref_kb = (kb) (Object) var6_ref.b(true);
                              if (var10 == 0) {
                                continue L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          ((kb) this).field_f.a(3, ((kb) this).field_s.field_g, (byte) -38, ((kb) this).field_s.field_h);
                          ((kb) this).field_s.d(9);
                          ((kb) this).field_s.field_C = -1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L20: {
            L21: {
              if (((kb) this).field_z) {
                L22: {
                  if ((((kb) this).field_C ^ -1) == -1) {
                    if (((kb) this).field_t != 5) {
                      break L22;
                    } else {
                      L23: {
                        var2_int = 5;
                        if (((kb) this).field_F < 1) {
                          break L23;
                        } else {
                          var2_int = 10;
                          break L23;
                        }
                      }
                      L24: {
                        if (3 <= ((kb) this).field_F) {
                          var2_int = 20;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (((kb) this).field_E == null) {
                          break L25;
                        } else {
                          if (((kb) this).field_E.field_y == 4) {
                            break L25;
                          } else {
                            var2_int = var2_int - ((kb) this).field_F;
                            break L25;
                          }
                        }
                      }
                      this.a(var2_int, ((kb) this).field_E, 79);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L26: {
                  L27: {
                    if (3 == ((kb) this).field_C) {
                      if (((kb) this).field_t == ((kb) this).field_n - 45) {
                        ((kb) this).field_f.field_h.a(-109, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 9));
                        var2_int = 2 + ((kb) this).field_F;
                        var3 = ((kb) this).field_F * 2 + 2;
                        var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -15);
                        L28: while (true) {
                          if (var4_ref_pd == null) {
                            break L27;
                          } else {
                            var5 = -var4_ref_pd.field_u + ((kb) this).field_x;
                            var6 = ((kb) this).field_A + -var4_ref_pd.field_z;
                            stackOut_77_0 = -1;
                            stackOut_77_1 = var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1;
                            stackIn_90_0 = stackOut_77_0;
                            stackIn_90_1 = stackOut_77_1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            if (var10 != 0) {
                              break L26;
                            } else {
                              L29: {
                                if (stackIn_78_0 <= stackIn_78_1) {
                                  break L29;
                                } else {
                                  if ((var2_int ^ -1) > (Math.abs(var5) ^ -1)) {
                                    break L29;
                                  } else {
                                    if (Math.abs(var6) > var2_int) {
                                      break L29;
                                    } else {
                                      this.a(var3, var4_ref_pd, 45);
                                      if (50 * (((kb) this).field_F + 1) > var4_ref_pd.field_i) {
                                        var4_ref_pd.field_i = 50 * (((kb) this).field_F + 1);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                              var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                              if (var10 == 0) {
                                continue L28;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                      } else {
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  stackOut_89_0 = 1;
                  stackOut_89_1 = ((kb) this).field_C;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  break L26;
                }
                L30: {
                  L31: {
                    if (stackIn_90_0 != stackIn_90_1) {
                      break L31;
                    } else {
                      L32: {
                        L33: {
                          if (((kb) this).field_n - 7 != ((kb) this).field_t) {
                            break L33;
                          } else {
                            var2_int = 2;
                            var3 = 1;
                            var4 = 0;
                            var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -82);
                            L34: while (true) {
                              if (var5_ref_pd == null) {
                                break L33;
                              } else {
                                var6 = ((kb) this).field_A + -var5_ref_pd.field_z;
                                var7 = -var5_ref_pd.field_u + ((kb) this).field_x;
                                stackOut_95_0 = 7;
                                stackOut_95_1 = var5_ref_pd.field_y;
                                stackIn_117_0 = stackOut_95_0;
                                stackIn_117_1 = stackOut_95_1;
                                stackIn_96_0 = stackOut_95_0;
                                stackIn_96_1 = stackOut_95_1;
                                if (var10 != 0) {
                                  break L32;
                                } else {
                                  L35: {
                                    if (stackIn_96_0 == stackIn_96_1) {
                                      break L35;
                                    } else {
                                      if ((var4 ^ -1) <= -11) {
                                        break L35;
                                      } else {
                                        if (var5_ref_pd.field_o + -var5_ref_pd.field_h <= 0) {
                                          break L35;
                                        } else {
                                          if ((var2_int ^ -1) > (Math.abs(var6) ^ -1)) {
                                            break L35;
                                          } else {
                                            if (var2_int >= Math.abs(var7)) {
                                              var8 = var5_ref_pd.field_t;
                                              var9 = 0;
                                              L36: while (true) {
                                                if ((var9 ^ -1) <= (((kb) this).field_D ^ -1)) {
                                                  break L35;
                                                } else {
                                                  stackOut_109_0 = ((kb) this).field_i[var9] ^ -1;
                                                  stackOut_109_1 = var8 ^ -1;
                                                  stackIn_117_0 = stackOut_109_0;
                                                  stackIn_117_1 = stackOut_109_1;
                                                  stackIn_110_0 = stackOut_109_0;
                                                  stackIn_110_1 = stackOut_109_1;
                                                  if (var10 != 0) {
                                                    break L32;
                                                  } else {
                                                    L37: {
                                                      if (stackIn_110_0 == stackIn_110_1) {
                                                        this.a(var3, var5_ref_pd, param0 ^ 127);
                                                        ((kb) this).field_f.field_h.a(-69, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 0.1 * ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)((kb) this).field_x), ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)((kb) this).field_A) * 0.1, 7));
                                                        var4++;
                                                        break L37;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                    var9++;
                                                    if (var10 == 0) {
                                                      continue L36;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                                  if (var10 == 0) {
                                    continue L34;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_116_0 = ((kb) this).field_t ^ -1;
                        stackOut_116_1 = ((kb) this).field_n + -15 ^ -1;
                        stackIn_117_0 = stackOut_116_0;
                        stackIn_117_1 = stackOut_116_1;
                        break L32;
                      }
                      if (stackIn_117_0 == stackIn_117_1) {
                        var2_int = 4;
                        var3 = 1;
                        var4 = 0;
                        var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -12);
                        L38: while (true) {
                          if (null == var5_ref_pd) {
                            break L31;
                          } else {
                            var6 = -var5_ref_pd.field_z + ((kb) this).field_A;
                            var7 = -var5_ref_pd.field_u + ((kb) this).field_x;
                            stackOut_121_0 = -8;
                            stackOut_121_1 = var5_ref_pd.field_y ^ -1;
                            stackIn_142_0 = stackOut_121_0;
                            stackIn_142_1 = stackOut_121_1;
                            stackIn_122_0 = stackOut_121_0;
                            stackIn_122_1 = stackOut_121_1;
                            if (var10 != 0) {
                              break L30;
                            } else {
                              L39: {
                                if (stackIn_122_0 == stackIn_122_1) {
                                  break L39;
                                } else {
                                  if (-7 >= (var4 ^ -1)) {
                                    break L39;
                                  } else {
                                    if ((-var5_ref_pd.field_h + var5_ref_pd.field_o ^ -1) >= -1) {
                                      break L39;
                                    } else {
                                      if (var2_int < Math.abs(var6)) {
                                        break L39;
                                      } else {
                                        if (var2_int < Math.abs(var7)) {
                                          break L39;
                                        } else {
                                          var8 = var5_ref_pd.field_t;
                                          var9 = 0;
                                          L40: while (true) {
                                            if ((var9 ^ -1) <= (((kb) this).field_D ^ -1)) {
                                              break L39;
                                            } else {
                                              stackOut_134_0 = var8;
                                              stackOut_134_1 = ((kb) this).field_i[var9];
                                              stackIn_142_0 = stackOut_134_0;
                                              stackIn_142_1 = stackOut_134_1;
                                              stackIn_135_0 = stackOut_134_0;
                                              stackIn_135_1 = stackOut_134_1;
                                              if (var10 != 0) {
                                                break L30;
                                              } else {
                                                L41: {
                                                  if (stackIn_135_0 == stackIn_135_1) {
                                                    this.a(var3, var5_ref_pd, 73);
                                                    ((kb) this).field_f.field_h.a(param0 + -163, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)((kb) this).field_x) * 0.1, 0.1 * ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)((kb) this).field_A), 7));
                                                    var4++;
                                                    break L41;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                                var9++;
                                                if (var10 == 0) {
                                                  continue L40;
                                                } else {
                                                  break L39;
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
                              var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                              if (var10 == 0) {
                                continue L38;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  stackOut_141_0 = ((kb) this).field_C ^ -1;
                  stackOut_141_1 = -3;
                  stackIn_142_0 = stackOut_141_0;
                  stackIn_142_1 = stackOut_141_1;
                  break L30;
                }
                if (stackIn_142_0 != stackIn_142_1) {
                  break L21;
                } else {
                  if ((((kb) this).field_t ^ -1) == -51) {
                    L42: {
                      ((kb) this).field_v = ((kb) this).field_v - 4;
                      var2_int = 2;
                      var3 = 30;
                      if ((((kb) this).field_F ^ -1) > -2) {
                        break L42;
                      } else {
                        var3 = 44;
                        var2_int = 2;
                        break L42;
                      }
                    }
                    L43: {
                      if (-3 < (((kb) this).field_F ^ -1)) {
                        break L43;
                      } else {
                        var2_int = 3;
                        var3 = 60;
                        break L43;
                      }
                    }
                    L44: {
                      if (-4 >= (((kb) this).field_F ^ -1)) {
                        var3 = 74;
                        var2_int = 3;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      if ((((kb) this).field_F ^ -1) <= -5) {
                        var3 = 90;
                        var2_int = 4;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 119);
                    L46: while (true) {
                      if (var4_ref_pd == null) {
                        break L21;
                      } else {
                        var5 = -var4_ref_pd.field_z + ((kb) this).field_A;
                        var6 = -var4_ref_pd.field_u + ((kb) this).field_x;
                        stackOut_158_0 = -8;
                        stackOut_158_1 = var4_ref_pd.field_y ^ -1;
                        stackIn_178_0 = stackOut_158_0;
                        stackIn_178_1 = stackOut_158_1;
                        stackIn_159_0 = stackOut_158_0;
                        stackIn_159_1 = stackOut_158_1;
                        if (var10 != 0) {
                          break L20;
                        } else {
                          L47: {
                            if (stackIn_159_0 == stackIn_159_1) {
                              break L47;
                            } else {
                              if (4 == var4_ref_pd.field_y) {
                                break L47;
                              } else {
                                if ((var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1) >= -1) {
                                  break L47;
                                } else {
                                  if (var2_int < Math.abs(var5)) {
                                    break L47;
                                  } else {
                                    if (var2_int < Math.abs(var6)) {
                                      break L47;
                                    } else {
                                      var7 = var4_ref_pd.field_t;
                                      var8 = 0;
                                      L48: while (true) {
                                        if (var8 >= ((kb) this).field_D) {
                                          break L47;
                                        } else {
                                          stackOut_171_0 = var7 ^ -1;
                                          stackOut_171_1 = ((kb) this).field_i[var8] ^ -1;
                                          stackIn_178_0 = stackOut_171_0;
                                          stackIn_178_1 = stackOut_171_1;
                                          stackIn_172_0 = stackOut_171_0;
                                          stackIn_172_1 = stackOut_171_1;
                                          if (var10 != 0) {
                                            break L20;
                                          } else {
                                            L49: {
                                              if (stackIn_172_0 != stackIn_172_1) {
                                                break L49;
                                              } else {
                                                this.a(var3, var4_ref_pd, param0 + -29);
                                                break L49;
                                              }
                                            }
                                            var8++;
                                            if (var10 == 0) {
                                              continue L48;
                                            } else {
                                              break L47;
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
                          var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                          if (var10 == 0) {
                            continue L46;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                  } else {
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            stackOut_177_0 = ((kb) this).field_C ^ -1;
            stackOut_177_1 = -6;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            break L20;
          }
          L50: {
            if (stackIn_178_0 != stackIn_178_1) {
              break L50;
            } else {
              this.b((byte) 12);
              break L50;
            }
          }
          stackOut_180_0 = this;
          stackOut_180_1 = this;
          stackIn_181_0 = (kb) (Object) stackOut_180_0;
          stackIn_181_1 = stackOut_180_1;
          break L3;
        }
        L51: {
          this.field_t = ((kb) this).field_t - 1;
          if (0 < ((kb) this).field_t) {
            break L51;
          } else {
            if (6 == ((kb) this).field_C) {
              break L51;
            } else {
              L52: {
                ((kb) this).field_z = false;
                if (((kb) this).field_v > 0) {
                  break L52;
                } else {
                  ((kb) this).field_t = 5;
                  if (var10 == 0) {
                    break L51;
                  } else {
                    break L52;
                  }
                }
              }
              L53: {
                L54: {
                  L55: {
                    L56: {
                      ((kb) this).field_t = 5;
                      var2 = null;
                      if (4 == ((kb) this).field_C) {
                        L57: {
                          var3_ref = ((kb) this).field_E;
                          var4 = -10000;
                          if (var3_ref == null) {
                            break L57;
                          } else {
                            if (0 >= -var3_ref.field_h + var3_ref.field_o) {
                              break L57;
                            } else {
                              L58: {
                                var5 = ((kb) this).field_h - var3_ref.field_z;
                                var6 = ((kb) this).field_g - var3_ref.field_u;
                                if (var3_ref.field_y != 9) {
                                  break L58;
                                } else {
                                  if (0 == var3_ref.field_E) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              if (-1 <= (-var3_ref.field_h + var3_ref.field_o ^ -1)) {
                                break L57;
                              } else {
                                if ((Math.abs(var5) ^ -1) < (((kb) this).field_l ^ -1)) {
                                  break L57;
                                } else {
                                  if ((Math.abs(var6) ^ -1) < (((kb) this).field_l ^ -1)) {
                                    break L57;
                                  } else {
                                    var7 = var3_ref.field_t;
                                    var8 = 0;
                                    L59: while (true) {
                                      if ((var8 ^ -1) <= (((kb) this).field_D ^ -1)) {
                                        break L57;
                                      } else {
                                        stackOut_246_0 = ((kb) this).field_i[var8];
                                        stackOut_246_1 = var7;
                                        stackIn_283_0 = stackOut_246_0;
                                        stackIn_283_1 = stackOut_246_1;
                                        stackIn_247_0 = stackOut_246_0;
                                        stackIn_247_1 = stackOut_246_1;
                                        if (var10 != 0) {
                                          break L54;
                                        } else {
                                          L60: {
                                            if (stackIn_247_0 != stackIn_247_1) {
                                              break L60;
                                            } else {
                                              var2 = var3_ref;
                                              break L60;
                                            }
                                          }
                                          var8++;
                                          if (var10 == 0) {
                                            continue L59;
                                          } else {
                                            break L57;
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
                        if (null == var2) {
                          var3_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 127);
                          L61: while (true) {
                            if (var3_ref_pd == null) {
                              break L56;
                            } else {
                              var5 = ((kb) this).field_h - var3_ref_pd.field_z;
                              var6 = -var3_ref_pd.field_u + ((kb) this).field_g;
                              stackOut_255_0 = var3_ref_pd.field_y;
                              stackOut_255_1 = 4;
                              stackIn_283_0 = stackOut_255_0;
                              stackIn_283_1 = stackOut_255_1;
                              stackIn_256_0 = stackOut_255_0;
                              stackIn_256_1 = stackOut_255_1;
                              if (var10 != 0) {
                                break L54;
                              } else {
                                L62: {
                                  if (stackIn_256_0 == stackIn_256_1) {
                                    break L62;
                                  } else {
                                    L63: {
                                      if (-10 != (var3_ref_pd.field_y ^ -1)) {
                                        break L63;
                                      } else {
                                        if (var3_ref_pd.field_E == 0) {
                                          break L62;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    if ((-var3_ref_pd.field_h + var3_ref_pd.field_o ^ -1) >= -1) {
                                      break L62;
                                    } else {
                                      if (Math.abs(var5) > ((kb) this).field_l) {
                                        break L62;
                                      } else {
                                        if ((Math.abs(var6) ^ -1) >= (((kb) this).field_l ^ -1)) {
                                          var7 = var3_ref_pd.field_t;
                                          var8 = 0;
                                          L64: while (true) {
                                            if (((kb) this).field_D <= var8) {
                                              break L62;
                                            } else {
                                              stackOut_271_0 = var7 ^ -1;
                                              stackOut_271_1 = ((kb) this).field_i[var8] ^ -1;
                                              stackIn_283_0 = stackOut_271_0;
                                              stackIn_283_1 = stackOut_271_1;
                                              stackIn_272_0 = stackOut_271_0;
                                              stackIn_272_1 = stackOut_271_1;
                                              if (var10 != 0) {
                                                break L54;
                                              } else {
                                                L65: {
                                                  if (stackIn_272_0 == stackIn_272_1) {
                                                    var9 = Math.abs(var5) + (Math.abs(var6) + -(Math.abs(var5) * Math.abs(var6)));
                                                    if (var9 > var4) {
                                                      var2 = var3_ref_pd;
                                                      var4 = var9;
                                                      break L65;
                                                    } else {
                                                      break L65;
                                                    }
                                                  } else {
                                                    break L65;
                                                  }
                                                }
                                                var8++;
                                                if (var10 == 0) {
                                                  continue L64;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                                if (var10 == 0) {
                                  continue L61;
                                } else {
                                  break L56;
                                }
                              }
                            }
                          }
                        } else {
                          break L56;
                        }
                      } else {
                        var3 = 10000;
                        var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 124);
                        L66: while (true) {
                          L67: {
                            if (var4_ref_pd == null) {
                              break L67;
                            } else {
                              var5 = ((kb) this).field_h + -var4_ref_pd.field_z;
                              var6 = ((kb) this).field_g - var4_ref_pd.field_u;
                              stackOut_191_0 = 7;
                              stackOut_191_1 = var4_ref_pd.field_y;
                              stackIn_282_0 = stackOut_191_0;
                              stackIn_282_1 = stackOut_191_1;
                              stackIn_192_0 = stackOut_191_0;
                              stackIn_192_1 = stackOut_191_1;
                              if (var10 != 0) {
                                break L55;
                              } else {
                                L68: {
                                  L69: {
                                    if (stackIn_192_0 != stackIn_192_1) {
                                      break L69;
                                    } else {
                                      if (2 == ((kb) this).field_C) {
                                        break L68;
                                      } else {
                                        break L69;
                                      }
                                    }
                                  }
                                  L70: {
                                    if (4 != var4_ref_pd.field_y) {
                                      break L70;
                                    } else {
                                      if (0 == ((kb) this).field_C) {
                                        break L70;
                                      } else {
                                        if (((kb) this).field_C == 3) {
                                          break L70;
                                        } else {
                                          if ((((kb) this).field_C ^ -1) == -2) {
                                            break L70;
                                          } else {
                                            if (5 != ((kb) this).field_C) {
                                              break L68;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L71: {
                                    if (3 == ((kb) this).field_C) {
                                      break L71;
                                    } else {
                                      if (-6 == (((kb) this).field_C ^ -1)) {
                                        break L71;
                                      } else {
                                        if (9 != var4_ref_pd.field_y) {
                                          break L71;
                                        } else {
                                          if ((var4_ref_pd.field_E ^ -1) == -1) {
                                            break L68;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (-1 <= (-var4_ref_pd.field_h + var4_ref_pd.field_o ^ -1)) {
                                    break L68;
                                  } else {
                                    if (Math.abs(var5) > ((kb) this).field_l) {
                                      break L68;
                                    } else {
                                      if ((Math.abs(var6) ^ -1) < (((kb) this).field_l ^ -1)) {
                                        break L68;
                                      } else {
                                        var7 = var4_ref_pd.field_t;
                                        var8 = 0;
                                        L72: while (true) {
                                          if (((kb) this).field_D <= var8) {
                                            break L68;
                                          } else {
                                            stackOut_222_0 = var7 ^ -1;
                                            stackOut_222_1 = ((kb) this).field_i[var8] ^ -1;
                                            stackIn_282_0 = stackOut_222_0;
                                            stackIn_282_1 = stackOut_222_1;
                                            stackIn_223_0 = stackOut_222_0;
                                            stackIn_223_1 = stackOut_222_1;
                                            if (var10 != 0) {
                                              break L55;
                                            } else {
                                              L73: {
                                                if (stackIn_223_0 == stackIn_223_1) {
                                                  var9 = var5 * var5 - -(var6 * var6);
                                                  if ((var3 ^ -1) < (var9 ^ -1)) {
                                                    var2 = var4_ref_pd;
                                                    var3 = var9;
                                                    break L73;
                                                  } else {
                                                    break L73;
                                                  }
                                                } else {
                                                  break L73;
                                                }
                                              }
                                              var8++;
                                              if (var10 == 0) {
                                                continue L72;
                                              } else {
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(param0 ^ 780);
                                if (var10 == 0) {
                                  continue L66;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          break L56;
                        }
                      }
                    }
                    if (var2 == null) {
                      break L53;
                    } else {
                      stackOut_281_0 = 5 + ((kb) this).field_C * 5;
                      stackOut_281_1 = ((kb) this).field_F;
                      stackIn_282_0 = stackOut_281_0;
                      stackIn_282_1 = stackOut_281_1;
                      break L55;
                    }
                  }
                  var4 = stackIn_282_0 + stackIn_282_1;
                  stackOut_282_0 = ((kb) this).field_C ^ -1;
                  stackOut_282_1 = -6;
                  stackIn_283_0 = stackOut_282_0;
                  stackIn_283_1 = stackOut_282_1;
                  break L54;
                }
                L74: {
                  if (stackIn_283_0 == stackIn_283_1) {
                    var4 = 58;
                    break L74;
                  } else {
                    break L74;
                  }
                }
                L75: {
                  L76: {
                    L77: {
                      L78: {
                        L79: {
                          L80: {
                            L81: {
                              hf discarded$4 = ea.a(46, mh.field_a[var4], (int)(((kb) this).field_u * 96.0));
                              ((kb) this).field_v = ((kb) this).field_v - 1;
                              ((kb) this).field_z = true;
                              ((kb) this).field_q = (int)(Math.atan2((double)(((kb) this).field_g + -var2.field_u), (double)(-var2.field_z + ((kb) this).field_h)) * 65536.0 / 6.283185307179586);
                              var5 = ((kb) this).field_C;
                              if (-1 == (var5 ^ -1)) {
                                break L81;
                              } else {
                                if (-2 == (var5 ^ -1)) {
                                  break L80;
                                } else {
                                  if (2 == var5) {
                                    break L79;
                                  } else {
                                    L82: {
                                      if (-5 != (var5 ^ -1)) {
                                        break L82;
                                      } else {
                                        if (var10 == 0) {
                                          break L78;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                    L83: {
                                      if (3 != var5) {
                                        break L83;
                                      } else {
                                        if (var10 == 0) {
                                          break L77;
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                    if (5 != var5) {
                                      break L75;
                                    } else {
                                      if (var10 == 0) {
                                        break L76;
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L84: {
                              ((kb) this).field_t = 50;
                              if (-2 != (((kb) this).field_F ^ -1)) {
                                break L84;
                              } else {
                                ((kb) this).field_t = 50;
                                break L84;
                              }
                            }
                            L85: {
                              if (((kb) this).field_F != 2) {
                                break L85;
                              } else {
                                ((kb) this).field_t = 25;
                                break L85;
                              }
                            }
                            L86: {
                              if (3 == ((kb) this).field_F) {
                                ((kb) this).field_t = 40;
                                break L86;
                              } else {
                                break L86;
                              }
                            }
                            L87: {
                              ((kb) this).field_A = var2.field_z;
                              if (4 != ((kb) this).field_F) {
                                break L87;
                              } else {
                                ((kb) this).field_t = 25;
                                break L87;
                              }
                            }
                            ((kb) this).field_E = var2;
                            ((kb) this).field_x = var2.field_u;
                            if (var10 == 0) {
                              break L75;
                            } else {
                              break L80;
                            }
                          }
                          L88: {
                            var3 = 10;
                            ((kb) this).field_t = 100;
                            if (((kb) this).field_F != 1) {
                              break L88;
                            } else {
                              ((kb) this).field_t = 80;
                              break L88;
                            }
                          }
                          L89: {
                            if (-3 == (((kb) this).field_F ^ -1)) {
                              ((kb) this).field_t = 60;
                              break L89;
                            } else {
                              break L89;
                            }
                          }
                          L90: {
                            if (3 == ((kb) this).field_F) {
                              ((kb) this).field_t = 40;
                              break L90;
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            ((kb) this).field_x = var2.field_u;
                            if (-5 == (((kb) this).field_F ^ -1)) {
                              ((kb) this).field_t = 20;
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          ((kb) this).field_E = var2;
                          ((kb) this).field_A = var2.field_z;
                          this.a(var3, var2, param0 ^ 71);
                          ((kb) this).field_f.field_h.a(-122, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 7));
                          if (var10 == 0) {
                            break L75;
                          } else {
                            break L79;
                          }
                        }
                        ((kb) this).field_t = 100;
                        ((kb) this).field_A = var2.field_z;
                        ((kb) this).field_x = var2.field_u;
                        if (var10 == 0) {
                          break L75;
                        } else {
                          break L78;
                        }
                      }
                      L92: {
                        var3 = 20;
                        ((kb) this).field_t = 5 + -((kb) this).field_F;
                        ((kb) this).field_x = var2.field_u;
                        ((kb) this).field_A = var2.field_z;
                        if (((kb) this).field_E != var2) {
                          break L92;
                        } else {
                          this.a(var3, var2, -117);
                          if (var10 == 0) {
                            break L75;
                          } else {
                            break L92;
                          }
                        }
                      }
                      ((kb) this).field_t = 100;
                      ((kb) this).field_E = var2;
                      if (var10 == 0) {
                        break L75;
                      } else {
                        break L77;
                      }
                    }
                    L93: {
                      ((kb) this).field_t = 100;
                      if ((((kb) this).field_F ^ -1) != -2) {
                        break L93;
                      } else {
                        ((kb) this).field_t = 90;
                        break L93;
                      }
                    }
                    L94: {
                      if (2 != ((kb) this).field_F) {
                        break L94;
                      } else {
                        ((kb) this).field_t = 80;
                        break L94;
                      }
                    }
                    L95: {
                      if ((((kb) this).field_F ^ -1) != -4) {
                        break L95;
                      } else {
                        ((kb) this).field_t = 70;
                        break L95;
                      }
                    }
                    L96: {
                      if (((kb) this).field_F != 4) {
                        break L96;
                      } else {
                        ((kb) this).field_t = 60;
                        break L96;
                      }
                    }
                    ((kb) this).field_x = var2.field_u;
                    ((kb) this).field_A = var2.field_z;
                    if (var10 == 0) {
                      break L75;
                    } else {
                      break L76;
                    }
                  }
                  L97: {
                    L98: {
                      ((kb) this).field_t = 500;
                      ((kb) this).field_A = var2.field_z;
                      ((kb) this).field_x = var2.field_u;
                      var3 = 5;
                      if (-2 == (((kb) this).field_F ^ -1)) {
                        break L98;
                      } else {
                        L99: {
                          if ((((kb) this).field_F ^ -1) != -3) {
                            break L99;
                          } else {
                            var3 = 20;
                            if (var10 == 0) {
                              break L97;
                            } else {
                              break L99;
                            }
                          }
                        }
                        L100: {
                          if (3 == ((kb) this).field_F) {
                            break L100;
                          } else {
                            if (-5 == (((kb) this).field_F ^ -1)) {
                              var3 = 80;
                              if (var10 == 0) {
                                break L97;
                              } else {
                                break L100;
                              }
                            } else {
                              break L97;
                            }
                          }
                        }
                        var3 = 40;
                        if (var10 == 0) {
                          break L97;
                        } else {
                          break L98;
                        }
                      }
                    }
                    var3 = 10;
                    break L97;
                  }
                  L101: {
                    ((kb) this).field_y = 0;
                    boolean discarded$5 = this.a(((kb) this).field_x, (float)((kb) this).field_g + 0.5f, 38, ((kb) this).field_A, (float)(-2 + ((kb) this).field_h));
                    if (-8 != (var2.field_y ^ -1)) {
                      break L101;
                    } else {
                      var2.field_f = 120;
                      if (var10 == 0) {
                        break L75;
                      } else {
                        break L101;
                      }
                    }
                  }
                  var2.field_f = 60;
                  this.a(var3, var2, param0 + 27);
                  break L75;
                }
                ((kb) this).field_n = ((kb) this).field_t;
                if (var10 == 0) {
                  break L51;
                } else {
                  break L53;
                }
              }
              ((kb) this).field_t = 5;
              break L51;
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -7) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = -87;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var7_int = -((kb) this).field_g + param4;
                        var8 = param5 + -((kb) this).field_h;
                        var11 = 5;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (1 == ((kb) this).field_f.field_m) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = -3;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == (((kb) this).field_f.field_m ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param2 < var12) {
                            statePc = 59;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = ((kb) this).field_h + var12 * var8 / param2;
                        var9 = var7_int * var12 / param2 + ((kb) this).field_g;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = ((kb) this).field_f.field_f.a(var9, true, var10);
                        stackIn_60_0 = stackOut_16_0 ? 1 : 0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var16 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0) {
                            statePc = 56;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = var9 + ((kb) this).field_f.field_f.field_c * var10;
                        var14 = 1;
                        var15 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var15 ^ -1) <= (param3 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = ((kb) this).field_i[var15] ^ -1;
                        stackOut_22_1 = var13 ^ -1;
                        stackIn_32_0 = stackOut_22_0;
                        stackIn_32_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (var16 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != stackIn_23_1) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var16 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var15++;
                        if (var16 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (var10 + -((kb) this).field_h) * (var10 + -((kb) this).field_h) + (-((kb) this).field_g + var9) * (-((kb) this).field_g + var9);
                        stackOut_31_1 = param2 * param2;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 > stackIn_32_1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var14 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var14 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = param1;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((stackIn_37_0 ^ -1) < (var12 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = var9;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((stackIn_41_0 ^ -1) >= (var11 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = -7;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == (((kb) this).field_f.field_f.field_o[var9 - -(((kb) this).field_f.field_f.field_c * var10)] ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = -11;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != (((kb) this).field_f.field_f.field_o[((kb) this).field_f.field_f.field_c * var10 + var9] ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((kb) this).field_i[param3] = var13;
                        param3++;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var16 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = param3;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    try {
                        var12++;
                        if (var16 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = param3;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0;
                }
                case 61: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var7, "kb.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((kb) this).field_r = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null != ((kb) this).field_s) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = ((kb) this).field_s.field_w;
                        var3 = 1;
                        if ((((kb) this).field_g ^ -1) >= (((kb) this).field_s.field_g ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3 = -1;
                        stackOut_9_0 = var5;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((kb) this).field_h >= ((kb) this).field_s.field_h) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = ((kb) this).field_f.field_f.field_c;
                        stackOut_14_0 = var5;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((kb) this).field_s.field_h ^ -1) > (((kb) this).field_h ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = -((kb) this).field_f.field_f.field_c;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4 = ((kb) this).field_w;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var2_int == var4) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((kb) this).field_f.field_f.field_e[var4] = false;
                        var4 = var4 + var3;
                        stackOut_24_0 = var5;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "kb.L(" + param0 + 41);
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 9) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((kb) this).field_j = -82;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((kb) this).field_C ^ -1) != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = oj.a((byte) 47, ((kb) this).field_C);
                        var3 = ((kb) this).field_g;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var2_int + ((kb) this).field_g ^ -1) >= (var3 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = ((kb) this).field_h;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((kb) this).field_h + var2_int <= var4) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((kb) this).field_f.field_f.field_o[var3 + var4 * ((kb) this).field_f.field_f.field_c] = 9;
                        var4++;
                        if (var5 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var5 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "kb.M(" + param0 + 41);
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kb(int param0, int param1, int param2, int param3, lb param4, f param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((kb) this).field_n = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((kb) this).field_z = false;
                        ((kb) this).field_C = param2;
                        ((kb) this).field_p = param4;
                        ((kb) this).field_v = 200;
                        ((kb) this).field_t = 0;
                        ((kb) this).field_f = param5;
                        ((kb) this).field_F = param3;
                        ((kb) this).b(0, param1, param0);
                        if ((((kb) this).field_D ^ -1) < -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((kb) this).field_q = (int)(Math.atan2((double)(((kb) this).field_g - ((kb) this).field_i[0] % ((kb) this).field_f.field_f.field_c), (double)(-(((kb) this).field_i[0] / ((kb) this).field_f.field_f.field_c) + ((kb) this).field_h)) * 65536.0 / 6.283185307179586);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((kb) this).field_o = ((kb) this).field_q;
                        if (6 != ((kb) this).field_C) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((kb) this).field_j = 100;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((kb) this).field_E = null;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) var7;
                        stackOut_11_1 = new StringBuilder().append("kb.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param4 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param5 == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
                }
                case 20: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
