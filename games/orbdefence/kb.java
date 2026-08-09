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
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_71_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_g = param2;
                        this.field_h = param1;
                        var4_int = 10;
                        var5 = 2;
                        if (-2 != (this.field_C ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = 8 + 2 * this.field_F;
                        var5 = 2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_C != 4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 88;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_C != 2) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = 20;
                        if ((this.field_F ^ -1) == -4) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_int = 25;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (4 != this.field_F) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = 30;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = 5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-4 == (this.field_C ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int = 6;
                        var5 = 2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((this.field_C ^ -1) == -6) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5 = 2;
                        var4_int = 6;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_i = new int[(1 + 2 * var4_int) * (2 * var4_int - -1) - (var5 * 2 + -1) * ((var5 + -1) * 2 - -1)];
                        this.field_l = var4_int;
                        this.field_D = param0;
                        if (this.field_C == 0) {
                            statePc = 64;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (3 == this.field_C) {
                            statePc = 64;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-2 == (this.field_C ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (2 == this.field_C) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-6 != (this.field_C ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6_int = this.field_g;
                        var7 = this.field_h;
                        this.field_g = var6_int;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = this.field_g;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 >= var6_int + 1) {
                            statePc = 51;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_52_0 = this;
                        stackIn_38_0 = stackIn_52_0;
                        stackIn_52_1 = var7;
                        stackIn_38_1 = stackIn_52_1;
                        if (var9 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((kb) (this)).field_h = stackIn_38_1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_h >= var7 - -1) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_36_0 = -var4_int;
                        stackIn_42_0 = stackIn_36_0;
                        if (var9 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8 = stackIn_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var8 >= var4_int) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, -var4_int + this.field_g, var8 + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, var8 + this.field_g, var4_int + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, this.field_h - var8);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g + -var8, this.field_h + -var4_int);
                        var8++;
                        if (var9 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var9 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_h = this.field_h + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_g = this.field_g + 1;
                        if (var9 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_g = var6_int;
                        stackIn_52_0 = this;
                        stackIn_52_1 = var7;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((kb) (this)).field_h = stackIn_52_1;
                        if (var9 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-5 != (this.field_C ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_g = this.field_g + 1;
                        var4_int++;
                        this.field_h = this.field_h + 1;
                        var6_int = -var4_int;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var4_int <= var6_int) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, var6_int + this.field_h);
                        this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, var6_int + this.field_g, this.field_h + var4_int);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, -var6_int + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, -var6_int + this.field_g, -var4_int + this.field_h);
                        var6_int++;
                        if (var9 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var9 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_h = this.field_h - 1;
                        var4_int--;
                        this.field_g = this.field_g - 1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var9 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var6_int = -var4_int;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var6_int >= var4_int) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, this.field_h + var6_int);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - -var6_int, var4_int + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - -var4_int, this.field_h - var6_int);
                        stackIn_71_0 = this;
                        stackIn_67_0 = stackIn_71_0;
                        if (var9 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ((kb) (this)).field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - var6_int, -var4_int + this.field_h);
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = this;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var6 = ((kb) (this)).field_i;
                        this.field_i = new int[this.field_D];
                        var7 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var7 >= this.field_D) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.field_i[var7] = var6[var7];
                        var7++;
                        if (var9 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var9 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        this.field_w = this.field_g - -(this.field_f.field_f.field_c * this.field_h);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (5 == this.field_C) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.field_y = 0;
                        this.field_k = 0;
                        this.field_B = 0;
                        this.field_r = new ok[(1 + this.field_F) * 25 + 1];
                        var7 = 0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((var7 ^ -1) <= (this.field_r.length ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.field_r[var7] = new ok();
                        var7++;
                        if (var9 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var9 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var4), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 89: {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 27) {
              if (this.field_k != this.field_B) {
                if ((this.field_k ^ -1) > (this.field_B ^ -1)) {
                  stackIn_10_0 = this.field_B + -this.field_k;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.field_B + -this.field_k + this.field_r.length;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final boolean a(int param0, float param1, int param2, int param3, float param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = -102 % ((-37 - param2) / 56);
            var6_int = (this.field_B - -1) % this.field_r.length;
            if ((this.field_k ^ -1) != (var6_int ^ -1)) {
              this.field_r[this.field_B].field_e = param1;
              this.field_r[this.field_B].field_d = param4;
              this.field_r[this.field_B].field_b = param0;
              this.field_r[this.field_B].field_g = param3;
              this.field_r[this.field_B].field_c = this.field_y - -60;
              this.field_B = var6_int;
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var6), "kb.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(mg param0, boolean param1) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_8_0 = 0;
            int stackIn_8_1 = 0;
            int stackIn_18_0 = 0;
            int stackIn_18_1 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            String stackIn_34_2 = null;
            int decompiledRegionSelector0 = 0;
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
                            if (!param1) {
                                statePc = 4;
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
                            field_m = -86;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (null == s.field_y) {
                                statePc = 28;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            s.field_y.a(0L, -1);
                            s.field_y.a(var2, 4);
                            var3_int = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 17;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackIn_18_0 = -1;
                            stackIn_8_0 = stackIn_18_0;
                            stackIn_18_1 = var2[var3_int] ^ -1;
                            stackIn_8_1 = stackIn_18_1;
                            if (var5 != 0) {
                                statePc = 18;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (stackIn_8_0 == stackIn_8_1) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 6;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackIn_18_0 = -25;
                            stackIn_18_1 = var3_int ^ -1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (stackIn_18_0 < stackIn_18_1) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof Exception ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            exception = (Exception) ((Object) caughtException);
                            var4 = 0;
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
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 28;
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
                            var2[var4] = (byte) -1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 35;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var5 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            param0.a(0, 24, (byte) -11, var2);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        runtimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_33_0 = (RuntimeException) (runtimeException);
                        stackIn_31_0 = stackIn_33_0;
                        stackIn_33_1 = new StringBuilder().append("kb.D(");
                        stackIn_31_1 = stackIn_33_1;
                        if (param0 == null) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);
                        stackIn_34_1 = (StringBuilder) ((Object) stackIn_31_1);
                        stackIn_34_2 = "{...}";
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 33: {
                        stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                        stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                        stackIn_34_2 = "null";
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        throw dd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
                    }
                    case 35: {
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
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                ld.field_e = param2;
                try {
                  L1: {
                    var3 = param0.getParameter("cookieprefix");
                    var4 = param0.getParameter("cookiehost");
                    if (!param1) {
                      L2: {
                        L3: {
                          var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                          if ((param2.length() ^ -1) == -1) {
                            break L3;
                          } else {
                            var5 = var5 + "; Expires=" + dh.a(-15591, ji.b(-78) + 94608000000L) + "; Max-Age=" + 94608000L;
                            if (!OrbDefence.field_D) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                      gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  g.a(1, param0);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref2);

                stackIn_14_1 = new StringBuilder().append("kb.B(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, pd param1, int param2) {
        int dupTemp$0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_f.field_h.a(-74, new me((double)param1.field_u, (double)param1.field_z, 1));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null == this.field_p) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        nh.field_b = nh.field_b + param0;
                        this.field_p.field_d = this.field_p.field_d + param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param1.field_h = param1.field_h + param0;
                        var4_int = 79 % ((param2 - -47) / 56);
                        if (null == param1.field_p) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = this.field_g - param1.field_u;
                        var6 = -param1.field_z + this.field_h;
                        if ((var6 * var6 + var5 * var5 ^ -1) > -101) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param1.field_B = 0;
                        param1.field_p = (kb) (this);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-param1.field_h + param1.field_o > 0) {
                            statePc = 116;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!param1.field_n) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ea.a(53, mh.field_a[54], (int)(96.0 * param1.field_v));
                        if (var10 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ea.a(11, mh.field_a[(int)(Math.random() * 5.0) + 49], (int)(96.0 * param1.field_v));
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param1.field_h = param1.field_h - param1.field_o;
                        param1.field_o = 0;
                        if ((this.field_F ^ -1) == -5) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 == (this.field_C ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_f.field_t = this.field_f.field_t + 1;
                        if (this.field_f.field_t != 99) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        f.a(9, 246, (byte) -25);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (this.field_C == 1) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_f.field_l = this.field_f.field_l + 1;
                        if (this.field_f.field_l != 99) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        f.a(10, 245, (byte) -25);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((this.field_C ^ -1) == -3) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_f.field_u = this.field_f.field_u + 1;
                        if ((this.field_f.field_u ^ -1) == -100) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        f.a(11, 244, (byte) -25);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((this.field_C ^ -1) == -5) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_f.field_p = this.field_f.field_p + 1;
                        if ((this.field_f.field_p ^ -1) != -100) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        f.a(12, 243, (byte) -25);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null == this.field_p) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_p.field_d = this.field_p.field_d + he.field_p[param1.field_y];
                        nh.field_b = nh.field_b + he.field_p[param1.field_y];
                        var5 = he.field_p[param1.field_y];
                        if (!param1.field_n) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5 = var5 + he.field_p[param1.field_y] * 99;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var6 ^ -1) <= (var5 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_f.field_b.a(-91, new oj(param1.field_u, param1.field_z, this.field_p, var6));
                        var6++;
                        if (var10 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var10 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_f.field_h.a(-99, new me((double)param1.field_u, (double)param1.field_z, 1));
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (-12 > (this.field_f.field_x ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((this.field_f.field_m ^ -1) > -5) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] = this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] + 5;
                        var5 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((this.field_D ^ -1) >= (var5 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        dupTemp$0 = this.field_i[var5];
                        this.field_f.field_f.field_v[dupTemp$0] = this.field_f.field_f.field_v[dupTemp$0] + 1;
                        var5++;
                        if (var10 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var10 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (-6 == (param1.field_y ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (param1.field_n) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var5 = 3;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (param1.field_n) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var5 = 5;
                        if (5 == param1.field_y) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var5 = 10;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var6 = param1.field_u - var5;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = param1.field_u + var5;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (stackIn_89_0 < var6) {
                            statePc = 116;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var10 != 0) {
                            statePc = 116;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var7 = param1.field_z + -var5;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var7 ^ -1) < (var5 + param1.field_z ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_89_0 = var6;
                        stackIn_94_0 = stackIn_89_0;
                        if (var10 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 < 0) {
                            statePc = 108;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((this.field_f.field_f.field_c ^ -1) >= (var6 ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (0 > var7) {
                            statePc = 108;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((this.field_f.field_f.field_t ^ -1) < (var7 ^ -1)) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        this.field_f.field_h.a(-107, new me((double)param1.field_u, (double)param1.field_z, 0.05 * (double)(var6 + -param1.field_u), 0.05 * (double)(-param1.field_z + var7), 1));
                        var8 = this.field_f.field_f.field_c * var7 + var6;
                        if (-8 != (this.field_f.field_f.field_o[var8] ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var9 = this.field_f.a(var8, -66);
                        var9.d(9);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var6++;
                        if (var10 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_114_0 = (RuntimeException) (var4);
                    stackIn_112_0 = stackIn_114_0;
                    stackIn_114_1 = new StringBuilder().append("kb.E(").append(param0).append(',');
                    stackIn_112_1 = stackIn_114_1;
                    if (param1 == null) {
                        statePc = 114;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackIn_115_0 = (RuntimeException) ((Object) stackIn_112_0);
                    stackIn_115_1 = (StringBuilder) ((Object) stackIn_112_1);
                    stackIn_115_2 = "{...}";
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = (RuntimeException) ((Object) stackIn_114_0);
                    stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
                    stackIn_115_2 = "null";
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    throw dd.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ',' + param2 + ')');
                }
                case 116: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
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
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.d(-12);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = -param0 - -320;
                        var5 = -param2 - -240;
                        var6 = this.field_k;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_B == var6) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = var4_int + (int)((float)ol.field_e * this.field_r[var6].field_e);
                        var8 = (int)(this.field_r[var6].field_d * (float)ol.field_e) + var5;
                        var9 = var4_int + this.field_r[var6].field_b * ol.field_e;
                        var10 = var5 + ol.field_e * this.field_r[var6].field_g;
                        var11 = (-this.field_y + this.field_r[var6].field_c) * 4;
                        ul.f(var7 - 1, var8, -1 + var9, var10, 11176191, var11);
                        ul.f(var7 + 1, var8, 1 + var9, var10, 11176191, var11);
                        ul.f(var7, -1 + var8, var9, -1 + var10, 11176191, var11);
                        ul.f(var7, 1 + var8, var9, 1 + var10, 11176191, var11);
                        ul.f(var7, var8, var9, var10, 16777215, var11);
                        var6 = (1 + var6) % this.field_r.length;
                        if (var12 != 0) {
                            statePc = 12;
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
                        if (var12 == 0) {
                            statePc = 5;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var4), "kb.K(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        pd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        this.field_y = this.field_y + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_B == this.field_k) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_13_0 = this.field_y ^ -1;
                        stackIn_6_0 = stackIn_13_0;
                        stackIn_13_1 = this.field_r[this.field_k].field_c ^ -1;
                        stackIn_6_1 = stackIn_13_1;
                        if (var8 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= stackIn_6_1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_k = (this.field_k - -1) % this.field_r.length;
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = this.field_k ^ -1;
                        stackIn_13_1 = this.field_B ^ -1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 61;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int = this.field_y + 59;
                        var3 = this.field_B;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3--;
                        if (0 <= var3) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = -1 + this.field_r.length;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((this.field_r[var3].field_c ^ -1) != (var2_int ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = (pd) ((Object) this.field_f.field_r.b((byte) 117));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var4) {
                            statePc = 57;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_58_0 = -1;
                        stackIn_21_0 = stackIn_58_0;
                        stackIn_58_1 = var4.field_f ^ -1;
                        stackIn_21_1 = stackIn_58_1;
                        if (var8 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 != stackIn_21_1) {
                            statePc = 56;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var4.field_m > 0) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5 = this.field_r[var3].field_b + -var4.field_u;
                        var6 = this.field_r[var3].field_g + -var4.field_z;
                        if (Math.abs(var5) >= 4) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-5 < (Math.abs(var6) ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!this.a(var4.field_u, (float)this.field_r[var3].field_b, 71, var4.field_z, (float)this.field_r[var3].field_g)) {
                            statePc = 56;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4.field_f = 60;
                        if ((var4.field_y ^ -1) == -8) {
                            statePc = 54;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = 5;
                        if (this.field_F != 1) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7 = 10;
                        if (var8 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((this.field_F ^ -1) != -3) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7 = 20;
                        if (var8 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (3 != this.field_F) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = 40;
                        if (var8 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (this.field_F == 4) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var7 = 80;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.a(var7, var4, 44);
                        if (var8 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var4.field_f = 120;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var4 = (pd) ((Object) this.field_f.field_r.d(param0 ^ 857));
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = this.field_k ^ -1;
                        stackIn_58_1 = var3 ^ -1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 != stackIn_58_1) {
                            statePc = 15;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "kb.G(" + param0 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -this.field_o + this.field_q;
                        if (32768 < var2_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = var2_int - 65536;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-32768 <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = var2_int + 65536;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_C != 5) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_o = this.field_o + (-(5 * this.field_t) + 2500);
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_o = this.field_o + var2_int / 10;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((this.field_o ^ -1) >= -32769) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_o = this.field_o - 65536;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-32768 <= this.field_o) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_o = this.field_o + 65536;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (this.field_C == 1) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (2 == this.field_C) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (this.field_C != 4) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_o = this.field_q;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param0 > 120) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        if (!this.field_z) {
                            statePc = 96;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-1 == (this.field_C ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_A = this.field_E.field_z;
                        this.field_x = this.field_E.field_u;
                        if ((this.field_t ^ -1) >= -6) {
                            statePc = 49;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((this.field_t ^ -1) <= -26) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3 = Math.abs(-this.field_x + this.field_g) - -Math.abs(-this.field_A + this.field_h);
                        if ((var3 ^ -1) >= -21) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = 20;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var3 ^ -1) > -2) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (this.field_t >= 5 + var3) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_f.field_h.a(-114, new me((double)this.field_x + (-5.0 + (double)this.field_t) * (double)(this.field_g - this.field_x) / (double)var3, (double)(-this.field_A + this.field_h) * ((double)this.field_t - 5.0) / (double)var3 + (double)this.field_A, 6));
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-4 == (this.field_C ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (this.field_t <= -45 + this.field_n) {
                            statePc = 68;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((this.field_n ^ -1) < (this.field_t ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var3 = Math.abs(this.field_g - this.field_x) - -Math.abs(-this.field_A + this.field_h);
                        if (var3 > 40) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3 = 40;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-2 >= (var3 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var3 = 1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (-45 + (this.field_n - -var3) > this.field_t) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_f.field_h.a(-90, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - ((double)this.field_n - 45.0)) / (double)var3, (double)this.field_A + (double)(-this.field_A + this.field_h) * (45.0 - (double)this.field_n + (double)this.field_t) / (double)var3, 8));
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (2 != this.field_C) {
                            statePc = 96;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (this.field_t != 50) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3_double = 0.0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (6.283185307179586 <= var3_double) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_f.field_h.a(-82, new me((double)this.field_x + Math.random() - 0.5, (double)this.field_A + Math.random() - 0.5, 0.05 * Math.sin(var3_double), Math.cos(var3_double) * 0.05, 1));
                        var3_double = var3_double + 0.8;
                        if (var7 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var7 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (this.field_t <= 50) {
                            statePc = 96;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (this.field_t < 100) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var3 = (Math.abs(-this.field_x + this.field_g) - -Math.abs(-this.field_A + this.field_h)) * 5;
                        if (-51 > (var3 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var3 = 50;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-2 < (var3 ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var3 = 1;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((this.field_t ^ -1) <= (var3 + 50 ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var4 = var3 / 2;
                        var5 = this.field_t - (var4 + 50);
                        var6 = (int)(0.5 * Math.sqrt((double)(-(var5 * var5) + var4 * var4)));
                        this.field_f.field_h.a(-119, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - 50.0) / (double)var3, (double)(-var6) + ((double)(-this.field_A + this.field_h) * ((double)this.field_t - 50.0) / (double)var3 + (double)this.field_A), 4));
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "kb.H(" + param0 + ')');
                }
                case 96: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        try {
          L0: {
            if (-1 == this.field_C) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -8) {
                  break L1;
                } else {
                  this.b((byte) -4);
                  break L1;
                }
              }
              L2: {
                var4_int = 320 + -param0 + this.field_g * ol.field_e;
                var5 = 240 + (-param1 + this.field_h * ol.field_e);
                this.field_u = 320.0 / (double)(320 + Math.abs(-320 + var4_int));
                if (!this.field_z) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var6 = 320 + (ol.field_e * this.field_x + -param0);
                      var7 = 240 + -param1 + ol.field_e * this.field_A;
                      var10 = this.field_C;
                      if (-2 != (var10 ^ -1)) {
                        break L4;
                      } else {
                        if (var15 == 0) {
                          if ((this.field_t ^ -1) < (this.field_n - 20 ^ -1)) {
                            var10 = ol.field_e / 2 + var4_int;
                            var11 = -8 + (var5 + ol.field_e / 2);
                            ul.f(var6 + -1, var7, -1 + var10, var11, 11176191, -(10 * (this.field_n - this.field_t)) + 200);
                            ul.f(var6 - -1, var7, 1 + var10, var11, 11176191, -(10 * (-this.field_t + this.field_n)) + 200);
                            ul.f(var6, -1 + var7, var10, var11 + -1, 11176191, 200 + -((-this.field_t + this.field_n) * 10));
                            ul.f(var6, 1 + var7, var10, 1 + var11, 11176191, 200 + -(10 * (-this.field_t + this.field_n)));
                            ul.f(var6, var7, var10, var11, 16777215, 200 - 10 * (this.field_n + -this.field_t));
                            if (var15 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var10 == 4) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var9 = -12 + (ol.field_e + var5);
                    var8 = var4_int - -ol.field_e;
                    if (5 < this.field_t) {
                      break L5;
                    } else {
                      if (this.field_E == null) {
                        break L5;
                      } else {
                        if (-1 <= (-this.field_E.field_h + this.field_E.field_o ^ -1)) {
                          break L5;
                        } else {
                          ul.f(var6 + -1, var7, var8 - 1, var9, 16776960, 200 - (-this.field_t + this.field_n) * 10);
                          ul.f(1 + var6, var7, var8 + 1, var9, 16776960, -((-this.field_t + this.field_n) * 10) + 200);
                          ul.f(var6, -1 + var7, var8, -1 + var9, 16776960, 200 - (this.field_n - this.field_t) * 10);
                          ul.f(var6, var7 - -1, var8, 1 + var9, 16776960, 200 + -((this.field_n - this.field_t) * 10));
                          ul.f(var6, var7, var8, var9, 16777215, 200 - (-this.field_t + this.field_n) * 10);
                          if (var15 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (50 < this.field_t) {
                    break L2;
                  } else {
                    if (this.field_E == null) {
                      break L2;
                    } else {
                      if (this.field_E.field_o - this.field_E.field_h > 0) {
                        this.field_x = this.field_E.field_u;
                        this.field_A = this.field_E.field_z;
                        ul.f(-1 + var6, var7, -1 + var8, var9, 16776960, 250 + -(5 * this.field_t));
                        ul.f(var6 + 1, var7, 1 + var8, var9, 16776960, 250 + -(this.field_t * 5));
                        ul.f(var6, var7 - 1, var8, var9 - 1, 16776960, 5 * (-this.field_t + 50));
                        ul.f(var6, 1 + var7, var8, var9 - -1, 16776960, (-this.field_t + 50) * 5);
                        ul.f(var6, var7, var8, var9, 16777215, 5 * (50 - this.field_t));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L6: {
                L7: {
                  if ((this.field_C ^ -1) == -1) {
                    break L7;
                  } else {
                    L8: {
                      if ((this.field_C ^ -1) != -2) {
                        break L8;
                      } else {
                        L9: {
                          var5 = var5 + ol.field_e / 2;
                          var4_int = var4_int + ol.field_e / 2;
                          hf.field_g[this.field_C * 7 + 0].a(var4_int, -5 + var5, 0, 1950);
                          var6 = 32;
                          if (-1 != (this.field_F ^ -1)) {
                            break L9;
                          } else {
                            var6 = 24;
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_F != 1) {
                            break L10;
                          } else {
                            var6 = 24;
                            break L10;
                          }
                        }
                        L11: {
                          if (-3 == (this.field_F ^ -1)) {
                            var6 = 24;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (3 == this.field_F) {
                            var6 = 24;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (this.field_F == 4) {
                            var6 = 24;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        hf.field_g[this.field_C * 7 + this.field_F + 2].a(528, var6 << 1938238244, var4_int << 653233604, var5 + -8 << 38535684, 32768 + this.field_o, 1950);
                        hf.field_g[1 - -(7 * this.field_C)].a(var4_int, var5 - 5, 0, 1950);
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L14: {
                      if (2 != this.field_C) {
                        break L14;
                      } else {
                        L15: {
                          var4_int = var4_int + ol.field_e / 2;
                          var5 = var5 + ol.field_e / 2;
                          hf.field_g[0 - -(7 * this.field_C)].a(var4_int, var5 - 5, 0, 1950);
                          var6 = 32;
                          if (-1 != (this.field_F ^ -1)) {
                            break L15;
                          } else {
                            var6 = 24;
                            break L15;
                          }
                        }
                        L16: {
                          if ((this.field_F ^ -1) != -2) {
                            break L16;
                          } else {
                            var6 = 24;
                            break L16;
                          }
                        }
                        L17: {
                          if (-3 == (this.field_F ^ -1)) {
                            var6 = 24;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if ((this.field_F ^ -1) == -4) {
                            var6 = 24;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (this.field_F != 4) {
                            break L19;
                          } else {
                            var6 = 24;
                            break L19;
                          }
                        }
                        hf.field_g[this.field_F + (2 - -(7 * this.field_C))].a(528, var6 << 303462692, var4_int << -1161801244, var5 - 12 << -2131739932, this.field_o - -32768, 1950);
                        hf.field_g[7 * this.field_C + 1].a(var4_int, -8 + var5, 0, 1950);
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L20: {
                      if (this.field_C == 5) {
                        break L20;
                      } else {
                        L21: {
                          if (this.field_C != 6) {
                            break L21;
                          } else {
                            hf.field_g[7 * this.field_C + 0].a(var4_int, var5 - 5, 0, 1300);
                            if (this.field_s == null) {
                              break L6;
                            } else {
                              if ((this.field_s.field_C ^ -1) != 0) {
                                L22: {
                                  var6 = var4_int;
                                  var7 = -10 + var5;
                                  var8 = 320 + this.field_s.field_g * ol.field_e - param0;
                                  var9 = -10 + (-param1 + (this.field_s.field_h * ol.field_e - -240));
                                  var10 = 200 * this.field_j / 100;
                                  if ((this.field_s.field_t ^ -1) >= 9) {
                                    break L22;
                                  } else {
                                    L23: {
                                      var10 = 20 * -this.field_s.field_t;
                                      var11 = var6 + -var8;
                                      var12 = var7 - var9;
                                      if (var11 != 0) {
                                        break L23;
                                      } else {
                                        if ((var12 ^ -1) == -1) {
                                          break L22;
                                        } else {
                                          var7 = var9 + var12 * -this.field_s.field_t / 10;
                                          if (var15 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    var6 = var8 - -(-this.field_s.field_t * var11 / 10);
                                    break L22;
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
                                  break L6;
                                } else {
                                  break L21;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L24: {
                          if (-4 != (this.field_C ^ -1)) {
                            break L24;
                          } else {
                            L25: {
                              hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, 1300);
                              var6 = 32;
                              if (0 == this.field_F) {
                                var6 = 24;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (this.field_F == 1) {
                                var6 = 24;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              if (this.field_F == 2) {
                                var6 = 24;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (-4 == (this.field_F ^ -1)) {
                                var6 = 24;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            L29: {
                              if (this.field_F == 4) {
                                var6 = 24;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6 << 933634884, var4_int << 1560917188, -12 + var5 << 202859460, this.field_o - -32768, 1800);
                            hf.field_g[1 - -(7 * this.field_C)].a(var4_int, var5 - 10, 0, 1300);
                            if (var15 == 0) {
                              break L6;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (4 != this.field_C) {
                          break L6;
                        } else {
                          L30: {
                            var4_int = var4_int + ol.field_e;
                            var5 = var5 + ol.field_e;
                            hf.field_g[0 - -(this.field_C * 7)].a(var4_int, var5 + -5, 0, 2600);
                            var6 = 32;
                            if (-1 != (this.field_F ^ -1)) {
                              break L30;
                            } else {
                              var6 = 16;
                              break L30;
                            }
                          }
                          L31: {
                            if (1 == this.field_F) {
                              var6 = 16;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (-3 == (this.field_F ^ -1)) {
                              var6 = 16;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if ((this.field_F ^ -1) != -4) {
                              break L33;
                            } else {
                              var6 = 16;
                              break L33;
                            }
                          }
                          L34: {
                            if (4 != this.field_F) {
                              break L34;
                            } else {
                              var6 = 16;
                              break L34;
                            }
                          }
                          hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6 << -197719484, var4_int << 725426724, var5 - 12 << -1597101948, 32768 + this.field_o, 2600);
                          hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 + -8, 0, 2600);
                          if (var15 == 0) {
                            break L6;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L35: {
                      var4_int = var4_int + ol.field_e / 2;
                      var5 = var5 + ol.field_e / 2;
                      var6 = 1950;
                      hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, var6);
                      var7_ref_hj = hf.field_g[2 - -this.field_F + this.field_C * 7];
                      var7_ref_hj.a(var7_ref_hj.field_s << 95796387, var7_ref_hj.field_t << 1016741347, var4_int << -1917870652, -12 + var5 << -1819484508, 32768 + this.field_o, var6);
                      hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 - 8, 0, var6);
                      if (this.field_t <= 5) {
                        var8 = this.field_f.field_i % 9000;
                        var9 = var6 * hf.field_g[7 * this.field_C].field_o >> -738604692;
                        var10 = hf.field_g[this.field_C * 7].field_k * var6 >> 1487675052;
                        var11 = (this.field_g * this.field_g + var8) % var9 + var4_int + -(var9 >> -1718563167);
                        var12 = (this.field_h * this.field_g + var8) % var10 - -var5 - (var10 >> 601988865);
                        var13 = -(var9 >> 1463485537) - (-var4_int - (var8 * var8 + this.field_g) % var9);
                        var14 = var8 * var8 % var10 - -var5 + -(var10 >> 217328737);
                        ul.f(var11, var12, var13, var14, 16777215, 200);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L36: {
                  hf.field_g[0 - -(this.field_C * 7)].a(var4_int, var5 - 5, 0, 1300);
                  var6 = 32;
                  if (this.field_F == 0) {
                    var6 = 32;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (-2 == (this.field_F ^ -1)) {
                    var6 = 32;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-3 != (this.field_F ^ -1)) {
                    break L38;
                  } else {
                    var6 = 24;
                    break L38;
                  }
                }
                L39: {
                  if ((this.field_F ^ -1) != -4) {
                    break L39;
                  } else {
                    var6 = 24;
                    break L39;
                  }
                }
                L40: {
                  if ((this.field_F ^ -1) == -5) {
                    var6 = 24;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                hf.field_g[7 * this.field_C + (2 - -this.field_F)].a(528, var6 << 1383137316, var4_int << -1592905724, var5 + -8 << 230949348, 32768 + this.field_o, 1300);
                hf.field_g[1 + 7 * this.field_C].a(var4_int, -6 + var5, 0, 1300);
                break L6;
              }
              L41: {
                if (null == this.field_p) {
                  break L41;
                } else {
                  L42: {
                    var6 = 0;
                    if (this.field_p.field_i != 0) {
                      break L42;
                    } else {
                      var6 = 16711680;
                      break L42;
                    }
                  }
                  L43: {
                    if ((this.field_p.field_i ^ -1) != -2) {
                      break L43;
                    } else {
                      var6 = 65280;
                      break L43;
                    }
                  }
                  L44: {
                    if (this.field_p.field_i != 2) {
                      break L44;
                    } else {
                      var6 = 255;
                      break L44;
                    }
                  }
                  L45: {
                    if (3 != this.field_p.field_i) {
                      break L45;
                    } else {
                      var6 = 16776960;
                      break L45;
                    }
                  }
                  L46: {
                    var5 -= 15;
                    if (-1 <= (this.field_F ^ -1)) {
                      break L46;
                    } else {
                      L47: {
                        var6 = 16777215;
                        if (1 == this.field_F) {
                          var6 = 255;
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      L48: {
                        if ((this.field_F ^ -1) != -3) {
                          break L48;
                        } else {
                          var6 = 8913151;
                          break L48;
                        }
                      }
                      L49: {
                        if (-4 == (this.field_F ^ -1)) {
                          var6 = 16746751;
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if ((this.field_F ^ -1) == -5) {
                          var6 = 16777215;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                      L51: {
                        var7 = 4;
                        ul.i(var4_int, var5, var7, var6, 128);
                        if (-3 <= (ol.field_e >> -1681279358 ^ -1)) {
                          break L51;
                        } else {
                          ul.i(var4_int, var5, -1 + var7, var6, 128);
                          break L51;
                        }
                      }
                      L52: {
                        if (-4 <= (ol.field_e >> 1281681026 ^ -1)) {
                          break L52;
                        } else {
                          ul.i(var4_int, var5, -2 + var7, var6, 128);
                          break L52;
                        }
                      }
                      ul.g(var4_int, var5, var7, 0);
                      break L46;
                    }
                  }
                  L53: {
                    if (-5 >= (this.field_F ^ -1)) {
                      break L53;
                    } else {
                      if (ui.field_a[this.field_C][this.field_F - -1] > this.field_f.field_e[0].b(true)) {
                        break L53;
                      } else {
                        if (this.field_F >= jk.field_j[this.field_C]) {
                          break L53;
                        } else {
                          var7 = 64 + (int)(Math.sin((double)ji.b(param2 ^ 91) * 0.01 + (double)this.field_g + (double)this.field_h) * 48.0);
                          var6 = 16777215;
                          ul.a(var4_int << 1217976036, var5 << 1762441316, var7, 255, ki.field_f);
                          break L53;
                        }
                      }
                    }
                  }
                  var5 += 15;
                  break L41;
                }
              }
              L54: {
                if (this.field_v >= 50) {
                  break L54;
                } else {
                  if (-3 <= (this.field_t ^ -1)) {
                    L55: {
                      L56: {
                        var6 = 16776960;
                        if ((this.field_h & 1) > 0) {
                          break L56;
                        } else {
                          var4_int++;
                          if (var15 == 0) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      var4_int--;
                      break L55;
                    }
                    L57: {
                      if ((this.field_v ^ -1) >= -1) {
                        var6 = 16711680;
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                    ul.h(-1 + var4_int, -5 + var5, 4, 11, 0);
                    ul.h(var4_int, var5 + -4, 2, 4, var6);
                    ul.h(var4_int, var5 - -3, 2, 2, var6);
                    break L54;
                  } else {
                    break L54;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        int stackIn_21_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_42_0 = 0;
        kb stackIn_62_0 = null;
        Object stackIn_62_1 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        Object stackIn_236_0 = null;
        Object stackIn_236_1 = null;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_326_0 = 0;
        int stackIn_326_1 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_360_0 = 0;
        int stackIn_360_1 = 0;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_35_0;
        kb stackOut_61_0;
        int statePc = 0;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var5_ref_pd = null;
        int var6 = 0;
        km var6_ref_km = null;
        int var7 = 0;
        kb var8_ref_kb = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 89) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(59, (byte) -37, 78);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (null != this.field_p) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_v = 200;
                    if (var10 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2_int = this.field_p.field_j - this.field_g;
                    var3 = -this.field_h + this.field_p.field_c;
                    if (-101 > (var2_int * var2_int - -(var3 * var3) ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_v = 200;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    this.field_v = 200;
                    if (6 != this.field_C) {
                        statePc = 74;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == this.field_s) {
                        statePc = 74;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_j <= 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var2_int = stackIn_21_0;
                    var3 = 0;
                    var4 = this.field_s.field_w;
                    var5 = 1;
                    if ((this.field_g ^ -1) < (this.field_s.field_g ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if ((this.field_h ^ -1) <= (this.field_s.field_h ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var5 = this.field_f.field_f.field_c;
                    if (var10 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((this.field_s.field_h ^ -1) > (this.field_h ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var5 = -this.field_f.field_f.field_c;
                    if (var10 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5 = -1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var6 = this.field_w;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if ((var6 ^ -1) == (var4 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_f.field_f.field_e[var6] = var2_int != 0;
                    stackOut_35_0 = this.field_f.field_f.field_m[var6];
                    stackIn_42_0 = stackOut_35_0 ? 1 : 0;
                    stackIn_36_0 = stackOut_35_0;
                    if (var10 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!stackIn_36_0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var6 = var6 + var5;
                    if (var10 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = var3 ^ -1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 < -1) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (this.field_j < 100) {
                        statePc = 48;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_j = this.field_j + 1;
                    if (var10 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_j = this.field_j - var3;
                    if ((this.field_j ^ -1) < -1) {
                        statePc = 74;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var6 = this.field_w;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var4 == var6) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_f.field_f.field_e[var6] = false;
                    var6 = var6 + var5;
                    if (var10 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var10 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    this.field_f.a(3, this.field_g, (byte) -38, this.field_h);
                    ea.a(113, mh.field_a[59], (int)(96.0 * this.field_u));
                    this.d(9);
                    this.field_C = -1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var6_ref_km = new km(this.field_f.field_o);
                    var7 = 0;
                    var8_ref_kb = (kb) ((Object) var6_ref_km.d(27935));
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var8_ref_kb == null) {
                        statePc = 70;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = (kb) (var8_ref_kb);
                    stackIn_236_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_236_1 = this;
                    stackIn_62_1 = stackIn_236_1;
                    if (var10 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 == this) {
                        statePc = 69;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var8_ref_kb.field_s != this.field_s) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var7 = 1;
                    if (var10 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var8_ref_kb = (kb) ((Object) var6_ref_km.b(true));
                    if (var10 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var7 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_f.a(3, this.field_s.field_g, (byte) -38, this.field_s.field_h);
                    this.field_s.d(9);
                    this.field_s.field_C = -1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (this.field_z) {
                        statePc = 77;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_C ^ -1) == -1) {
                        statePc = 80;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (this.field_t != 5) {
                        statePc = 93;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var2_int = 5;
                    if (this.field_F < 1) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var2_int = 10;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (3 <= this.field_F) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var2_int = 20;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (this.field_E == null) {
                        statePc = 92;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (this.field_E.field_y == 4) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var2_int = var2_int - this.field_F;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    this.a(var2_int, this.field_E, 79);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (3 == this.field_C) {
                        statePc = 96;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (this.field_t == this.field_n - 45) {
                        statePc = 99;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_f.field_h.a(-109, new me((double)this.field_x, (double)this.field_A, 9));
                    var2_int = 2 + this.field_F;
                    var3 = this.field_F * 2 + 2;
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -15));
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var4_ref_pd == null) {
                        statePc = 118;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var5 = -var4_ref_pd.field_u + this.field_x;
                    var6 = this.field_A + -var4_ref_pd.field_z;
                    stackIn_119_0 = -1;
                    stackIn_102_0 = stackIn_119_0;
                    stackIn_119_1 = var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1;
                    stackIn_102_1 = stackIn_119_1;
                    if (var10 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 <= stackIn_102_1) {
                        statePc = 117;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if ((var2_int ^ -1) > (Math.abs(var5) ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (Math.abs(var6) > var2_int) {
                        statePc = 117;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    this.a(var3, var4_ref_pd, 45);
                    if (50 * (this.field_F + 1) > var4_ref_pd.field_i) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var4_ref_pd.field_i = 50 * (this.field_F + 1);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                    if (var10 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = 1;
                    stackIn_119_1 = this.field_C;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 != stackIn_119_1) {
                        statePc = 184;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (this.field_n - 7 != this.field_t) {
                        statePc = 153;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var2_int = 2;
                    var3 = 1;
                    var4 = 0;
                    var5_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -82));
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var5_ref_pd == null) {
                        statePc = 153;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var6 = this.field_A + -var5_ref_pd.field_z;
                    var7 = -var5_ref_pd.field_u + this.field_x;
                    stackIn_154_0 = 7;
                    stackIn_126_0 = stackIn_154_0;
                    stackIn_154_1 = var5_ref_pd.field_y;
                    stackIn_126_1 = stackIn_154_1;
                    if (var10 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0 == stackIn_126_1) {
                        statePc = 152;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if ((var4 ^ -1) <= -11) {
                        statePc = 152;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var5_ref_pd.field_o + -var5_ref_pd.field_h <= 0) {
                        statePc = 152;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((var2_int ^ -1) > (Math.abs(var6) ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var2_int >= Math.abs(var7)) {
                        statePc = 143;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var8 = var5_ref_pd.field_t;
                    var9 = 0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if ((var9 ^ -1) <= (this.field_D ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackIn_154_0 = this.field_i[var9] ^ -1;
                    stackIn_146_0 = stackIn_154_0;
                    stackIn_154_1 = var8 ^ -1;
                    stackIn_146_1 = stackIn_154_1;
                    if (var10 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 == stackIn_146_1) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.a(var3, var5_ref_pd, param0 ^ 127);
                    this.field_f.field_h.a(-69, new me((double)this.field_x, (double)this.field_A, 0.1 * ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)this.field_x), ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)this.field_A) * 0.1, 7));
                    var4++;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var9++;
                    if (var10 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var5_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                    if (var10 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackIn_154_0 = this.field_t ^ -1;
                    stackIn_154_1 = this.field_n + -15 ^ -1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (stackIn_154_0 == stackIn_154_1) {
                        statePc = 156;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var2_int = 4;
                    var3 = 1;
                    var4 = 0;
                    var5_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -12));
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (null == var5_ref_pd) {
                        statePc = 184;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var6 = -var5_ref_pd.field_z + this.field_A;
                    var7 = -var5_ref_pd.field_u + this.field_x;
                    stackIn_185_0 = -8;
                    stackIn_159_0 = stackIn_185_0;
                    stackIn_185_1 = var5_ref_pd.field_y ^ -1;
                    stackIn_159_1 = stackIn_185_1;
                    if (var10 != 0) {
                        statePc = 185;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (stackIn_159_0 == stackIn_159_1) {
                        statePc = 183;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (-7 >= (var4 ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if ((-var5_ref_pd.field_h + var5_ref_pd.field_o ^ -1) >= -1) {
                        statePc = 183;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (var2_int < Math.abs(var6)) {
                        statePc = 183;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var2_int < Math.abs(var7)) {
                        statePc = 183;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var8 = var5_ref_pd.field_t;
                    var9 = 0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if ((var9 ^ -1) <= (this.field_D ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_185_0 = var8;
                    stackIn_177_0 = stackIn_185_0;
                    stackIn_185_1 = this.field_i[var9];
                    stackIn_177_1 = stackIn_185_1;
                    if (var10 != 0) {
                        statePc = 185;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (stackIn_177_0 == stackIn_177_1) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.a(var3, var5_ref_pd, 73);
                    this.field_f.field_h.a(param0 + -163, new me((double)this.field_x, (double)this.field_A, ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)this.field_x) * 0.1, 0.1 * ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)this.field_A), 7));
                    var4++;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var9++;
                    if (var10 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var5_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                    if (var10 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_185_0 = this.field_C ^ -1;
                    stackIn_185_1 = -3;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (stackIn_185_0 != stackIn_185_1) {
                        statePc = 231;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if ((this.field_t ^ -1) == -51) {
                        statePc = 191;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 191: {
                    this.field_v = this.field_v - 4;
                    var2_int = 2;
                    var3 = 30;
                    if ((this.field_F ^ -1) > -2) {
                        statePc = 193;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var3 = 44;
                    var2_int = 2;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (-3 < (this.field_F ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var2_int = 3;
                    var3 = 60;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (-4 >= (this.field_F ^ -1)) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var3 = 74;
                    var2_int = 3;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if ((this.field_F ^ -1) <= -5) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var3 = 90;
                    var2_int = 4;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 119));
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var4_ref_pd == null) {
                        statePc = 231;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var5 = -var4_ref_pd.field_z + this.field_A;
                    var6 = -var4_ref_pd.field_u + this.field_x;
                    stackIn_232_0 = -8;
                    stackIn_206_0 = stackIn_232_0;
                    stackIn_232_1 = var4_ref_pd.field_y ^ -1;
                    stackIn_206_1 = stackIn_232_1;
                    if (var10 != 0) {
                        statePc = 232;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (stackIn_206_0 == stackIn_206_1) {
                        statePc = 230;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (4 == var4_ref_pd.field_y) {
                        statePc = 230;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if ((var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1) >= -1) {
                        statePc = 230;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (var2_int < Math.abs(var5)) {
                        statePc = 230;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var2_int < Math.abs(var6)) {
                        statePc = 230;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var7 = var4_ref_pd.field_t;
                    var8 = 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (var8 >= this.field_D) {
                        statePc = 230;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackIn_232_0 = var7 ^ -1;
                    stackIn_224_0 = stackIn_232_0;
                    stackIn_232_1 = this.field_i[var8] ^ -1;
                    stackIn_224_1 = stackIn_232_1;
                    if (var10 != 0) {
                        statePc = 232;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (stackIn_224_0 != stackIn_224_1) {
                        statePc = 229;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    this.a(var3, var4_ref_pd, param0 + -29);
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var8++;
                    if (var10 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                    if (var10 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    stackIn_232_0 = this.field_C ^ -1;
                    stackIn_232_1 = -6;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (stackIn_232_0 != stackIn_232_1) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    this.b((byte) 12);
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    stackIn_236_0 = this;
                    stackIn_236_1 = this;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    ((kb) (this)).field_t = ((kb) (this)).field_t - 1;
                    if (0 < this.field_t) {
                        statePc = 486;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (6 == this.field_C) {
                        statePc = 486;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    this.field_z = false;
                    if (this.field_v > 0) {
                        statePc = 246;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    this.field_t = 5;
                    if (var10 == 0) {
                        statePc = 486;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_t = 5;
                    var2 = null;
                    if (4 == this.field_C) {
                        statePc = 306;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var3 = 10000;
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 124));
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var4_ref_pd == null) {
                        statePc = 370;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var5 = this.field_h + -var4_ref_pd.field_z;
                    var6 = this.field_g - var4_ref_pd.field_u;
                    stackIn_373_0 = 7;
                    stackIn_250_0 = stackIn_373_0;
                    stackIn_373_1 = var4_ref_pd.field_y;
                    stackIn_250_1 = stackIn_373_1;
                    if (var10 != 0) {
                        statePc = 373;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 != stackIn_250_1) {
                        statePc = 256;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (2 == this.field_C) {
                        statePc = 304;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (4 != var4_ref_pd.field_y) {
                        statePc = 271;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (0 == this.field_C) {
                        statePc = 271;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (this.field_C == 3) {
                        statePc = 271;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if ((this.field_C ^ -1) == -2) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (5 != this.field_C) {
                        statePc = 304;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (3 == this.field_C) {
                        statePc = 283;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (-6 == (this.field_C ^ -1)) {
                        statePc = 283;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (9 != var4_ref_pd.field_y) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if ((var4_ref_pd.field_E ^ -1) == -1) {
                        statePc = 304;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (-1 <= (-var4_ref_pd.field_h + var4_ref_pd.field_o ^ -1)) {
                        statePc = 304;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (Math.abs(var5) > this.field_l) {
                        statePc = 304;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if ((Math.abs(var6) ^ -1) < (this.field_l ^ -1)) {
                        statePc = 304;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var7 = var4_ref_pd.field_t;
                    var8 = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (this.field_D <= var8) {
                        statePc = 304;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackIn_373_0 = var7 ^ -1;
                    stackIn_295_0 = stackIn_373_0;
                    stackIn_373_1 = this.field_i[var8] ^ -1;
                    stackIn_295_1 = stackIn_373_1;
                    if (var10 != 0) {
                        statePc = 373;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (stackIn_295_0 == stackIn_295_1) {
                        statePc = 299;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var9 = var5 * var5 - -(var6 * var6);
                    if ((var3 ^ -1) < (var9 ^ -1)) {
                        statePc = 302;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var2 = var4_ref_pd;
                    var3 = var9;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    var8++;
                    if (var10 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(param0 ^ 780));
                    if (var10 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var3_ref_pd = this.field_E;
                    var4 = -10000;
                    if (var3_ref_pd == null) {
                        statePc = 331;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (0 >= -var3_ref_pd.field_h + var3_ref_pd.field_o) {
                        statePc = 331;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var5 = this.field_h - var3_ref_pd.field_z;
                    var6 = this.field_g - var3_ref_pd.field_u;
                    if (var3_ref_pd.field_y != 9) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (0 == var3_ref_pd.field_E) {
                        statePc = 331;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (-1 <= (-var3_ref_pd.field_h + var3_ref_pd.field_o ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if ((Math.abs(var5) ^ -1) < (this.field_l ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if ((Math.abs(var6) ^ -1) < (this.field_l ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var7 = var3_ref_pd.field_t;
                    var8 = 0;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if ((var8 ^ -1) <= (this.field_D ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    stackIn_374_0 = this.field_i[var8];
                    stackIn_326_0 = stackIn_374_0;
                    stackIn_374_1 = var7;
                    stackIn_326_1 = stackIn_374_1;
                    if (var10 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (stackIn_326_0 != stackIn_326_1) {
                        statePc = 330;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var2 = var3_ref_pd;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    var8++;
                    if (var10 == 0) {
                        statePc = 324;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (null == var2) {
                        statePc = 334;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 334: {
                    var3_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 127));
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (var3_ref_pd == null) {
                        statePc = 370;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var5 = this.field_h - var3_ref_pd.field_z;
                    var6 = -var3_ref_pd.field_u + this.field_g;
                    stackIn_374_0 = var3_ref_pd.field_y;
                    stackIn_337_0 = stackIn_374_0;
                    stackIn_374_1 = 4;
                    stackIn_337_1 = stackIn_374_1;
                    if (var10 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (stackIn_337_0 == stackIn_337_1) {
                        statePc = 369;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (-10 != (var3_ref_pd.field_y ^ -1)) {
                        statePc = 346;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (var3_ref_pd.field_E == 0) {
                        statePc = 369;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    if ((-var3_ref_pd.field_h + var3_ref_pd.field_o ^ -1) >= -1) {
                        statePc = 369;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (Math.abs(var5) > this.field_l) {
                        statePc = 369;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if ((Math.abs(var6) ^ -1) >= (this.field_l ^ -1)) {
                        statePc = 357;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var7 = var3_ref_pd.field_t;
                    var8 = 0;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (this.field_D <= var8) {
                        statePc = 369;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    stackIn_374_0 = var7 ^ -1;
                    stackIn_360_0 = stackIn_374_0;
                    stackIn_374_1 = this.field_i[var8] ^ -1;
                    stackIn_360_1 = stackIn_374_1;
                    if (var10 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (stackIn_360_0 == stackIn_360_1) {
                        statePc = 364;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var9 = Math.abs(var5) + (Math.abs(var6) + -(Math.abs(var5) * Math.abs(var6)));
                    if (var9 > var4) {
                        statePc = 367;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var2 = var3_ref_pd;
                    var4 = var9;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    var8++;
                    if (var10 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    var3_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                    if (var10 == 0) {
                        statePc = 335;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (var2 == null) {
                        statePc = 482;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    stackIn_373_0 = 5 + this.field_C * 5;
                    stackIn_373_1 = this.field_F;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    var4 = stackIn_373_0 + stackIn_373_1;
                    stackIn_374_0 = this.field_C ^ -1;
                    stackIn_374_1 = -6;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (stackIn_374_0 == stackIn_374_1) {
                        statePc = 376;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 376: {
                    var4 = 58;
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    ea.a(46, mh.field_a[var4], (int)(this.field_u * 96.0));
                    this.field_v = this.field_v - 1;
                    this.field_z = true;
                    this.field_q = (int)(Math.atan2((double)(this.field_g + -((pd) (var2)).field_u), (double)(-((pd) (var2)).field_z + this.field_h)) * 65536.0 / 6.283185307179586);
                    var5 = this.field_C;
                    if (-1 == (var5 ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    if (-2 == (var5 ^ -1)) {
                        statePc = 418;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (2 == var5) {
                        statePc = 434;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (-5 != (var5 ^ -1)) {
                        statePc = 390;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (var10 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (3 != var5) {
                        statePc = 396;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (var10 == 0) {
                        statePc = 444;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (5 != var5) {
                        statePc = 481;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (var10 == 0) {
                        statePc = 459;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    this.field_t = 50;
                    if (-2 != (this.field_F ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    this.field_t = 50;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if (this.field_F != 2) {
                        statePc = 410;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    this.field_t = 25;
                    statePc = 410;
                    continue stateLoop;
                }
                case 410: {
                    if (3 == this.field_F) {
                        statePc = 413;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 413: {
                    this.field_t = 40;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    this.field_A = ((pd) (var2)).field_z;
                    if (4 != this.field_F) {
                        statePc = 417;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    this.field_t = 25;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    this.field_E = (pd) (var2);
                    this.field_x = ((pd) (var2)).field_u;
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    var3 = 10;
                    this.field_t = 100;
                    if (this.field_F != 1) {
                        statePc = 421;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    this.field_t = 80;
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    if (-3 == (this.field_F ^ -1)) {
                        statePc = 424;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 424: {
                    this.field_t = 60;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    if (3 == this.field_F) {
                        statePc = 428;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 428: {
                    this.field_t = 40;
                    statePc = 429;
                    continue stateLoop;
                }
                case 429: {
                    this.field_x = ((pd) (var2)).field_u;
                    if (-5 == (this.field_F ^ -1)) {
                        statePc = 432;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 432: {
                    this.field_t = 20;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    this.field_E = (pd) (var2);
                    this.field_A = ((pd) (var2)).field_z;
                    this.a(var3, (pd) (var2), param0 ^ 71);
                    this.field_f.field_h.a(-122, new me((double)this.field_x, (double)this.field_A, 7));
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    this.field_t = 100;
                    this.field_A = ((pd) (var2)).field_z;
                    this.field_x = ((pd) (var2)).field_u;
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    var3 = 20;
                    this.field_t = 5 + -this.field_F;
                    this.field_x = ((pd) (var2)).field_u;
                    this.field_A = ((pd) (var2)).field_z;
                    if (this.field_E != var2) {
                        statePc = 441;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    this.a(var3, (pd) (var2), -117);
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    this.field_t = 100;
                    this.field_E = (pd) (var2);
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    this.field_t = 100;
                    if ((this.field_F ^ -1) != -2) {
                        statePc = 449;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    this.field_t = 90;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    if (2 != this.field_F) {
                        statePc = 452;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    this.field_t = 80;
                    statePc = 452;
                    continue stateLoop;
                }
                case 452: {
                    if ((this.field_F ^ -1) != -4) {
                        statePc = 455;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    this.field_t = 70;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    if (this.field_F != 4) {
                        statePc = 458;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    this.field_t = 60;
                    statePc = 458;
                    continue stateLoop;
                }
                case 458: {
                    this.field_x = ((pd) (var2)).field_u;
                    this.field_A = ((pd) (var2)).field_z;
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 459;
                    }
                    continue stateLoop;
                }
                case 459: {
                    this.field_t = 500;
                    this.field_A = ((pd) (var2)).field_z;
                    this.field_x = ((pd) (var2)).field_u;
                    var3 = 5;
                    if (-2 == (this.field_F ^ -1)) {
                        statePc = 474;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 460: {
                    if ((this.field_F ^ -1) != -3) {
                        statePc = 464;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    var3 = 20;
                    if (var10 == 0) {
                        statePc = 475;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if (3 == this.field_F) {
                        statePc = 473;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    if (-5 == (this.field_F ^ -1)) {
                        statePc = 472;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 472: {
                    var3 = 80;
                    if (var10 == 0) {
                        statePc = 475;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    var3 = 40;
                    if (var10 == 0) {
                        statePc = 475;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    var3 = 10;
                    statePc = 475;
                    continue stateLoop;
                }
                case 475: {
                    this.field_y = 0;
                    discarded$0 = this.a(this.field_x, (float)this.field_g + 0.5f, 38, this.field_A, (float)(-2 + this.field_h));
                    if (-8 != (((pd) (var2)).field_y ^ -1)) {
                        statePc = 479;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    ((pd) (var2)).field_f = 120;
                    if (var10 == 0) {
                        statePc = 481;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    ((pd) (var2)).field_f = 60;
                    this.a(var3, (pd) (var2), param0 + 27);
                    statePc = 481;
                    continue stateLoop;
                }
                case 481: {
                    this.field_n = this.field_t;
                    if (var10 == 0) {
                        statePc = 486;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    this.field_t = 5;
                    statePc = 486;
                    continue stateLoop;
                }
                case 486: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -87;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var7_int = -this.field_g + param4;
                        var8 = param5 + -this.field_h;
                        var11 = 5;
                        if (1 == this.field_f.field_m) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 == (this.field_f.field_m ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param2 < var12) {
                            statePc = 51;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = this.field_h + var12 * var8 / param2;
                        var9 = var7_int * var12 / param2 + this.field_g;
                        stackOut_13_0 = this.field_f.field_f.a(var9, true, var10);
                        stackIn_52_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var16 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0) {
                            statePc = 48;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13 = var9 + this.field_f.field_f.field_c * var10;
                        var14 = 1;
                        var15 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var15 ^ -1) <= (param3 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_28_0 = this.field_i[var15] ^ -1;
                        stackIn_20_0 = stackIn_28_0;
                        stackIn_28_1 = var13 ^ -1;
                        stackIn_20_1 = stackIn_28_1;
                        if (var16 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != stackIn_20_1) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = 0;
                        if (var16 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15++;
                        if (var16 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = (var10 + -this.field_h) * (var10 + -this.field_h) + (-this.field_g + var9) * (-this.field_g + var9);
                        stackIn_28_1 = param2 * param2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 > stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var14 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var14 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((param1 ^ -1) < (var12 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var9 ^ -1) >= (var11 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-7 == (this.field_f.field_f.field_o[var9 - -(this.field_f.field_f.field_c * var10)] ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-11 != (this.field_f.field_f.field_o[this.field_f.field_f.field_c * var10 + var9] ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_i[param3] = var13;
                        param3++;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var16 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = param3;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0;
                }
                case 50: {
                    try {
                        var12++;
                        if (var16 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = param3;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return stackIn_52_0;
                }
                case 53: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var7), "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_r = (ok[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != this.field_s) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = this.field_s.field_w;
                        var3 = 1;
                        if ((this.field_g ^ -1) >= (this.field_s.field_g ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = -1;
                        if (var5 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_h >= this.field_s.field_h) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = this.field_f.field_f.field_c;
                        if (var5 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((this.field_s.field_h ^ -1) > (this.field_h ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3 = -this.field_f.field_f.field_c;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = this.field_w;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var2_int == var4) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_f.field_f.field_e[var4] = false;
                        var4 = var4 + var3;
                        if (var5 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5 == 0) {
                            statePc = 20;
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
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "kb.L(" + param0 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_j = -82;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((this.field_C ^ -1) != 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = oj.a((byte) 47, this.field_C);
                        var3 = this.field_g;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var2_int + this.field_g ^ -1) >= (var3 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = this.field_h;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_h + var2_int <= var4) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_f.field_f.field_o[var3 + var4 * this.field_f.field_f.field_c] = 9;
                        var4++;
                        if (var5 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "kb.M(" + param0 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kb(int param0, int param1, int param2, int param3, lb param4, f param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_n = 0;
        try {
          L0: {
            L1: {
              this.field_z = false;
              this.field_C = param2;
              this.field_p = param4;
              this.field_v = 200;
              this.field_t = 0;
              this.field_f = param5;
              this.field_F = param3;
              this.b(0, param1, param0);
              if ((this.field_D ^ -1) < -1) {
                this.field_q = (int)(Math.atan2((double)(this.field_g - this.field_i[0] % this.field_f.field_f.field_c), (double)(-(this.field_i[0] / this.field_f.field_f.field_c) + this.field_h)) * 65536.0 / 6.283185307179586);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_o = this.field_q;
              if (6 != this.field_C) {
                break L2;
              } else {
                this.field_j = 100;
                break L2;
              }
            }
            this.field_E = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7);

            stackIn_12_1 = new StringBuilder().append("kb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ')');
        }
    }

    static {
    }
}
