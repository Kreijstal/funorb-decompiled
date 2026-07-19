/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iia extends ci {
    static String field_q;
    private int field_u;
    private int field_p;
    private int field_w;
    static int[] field_v;
    private int field_y;
    private int field_s;
    private int field_x;
    private int field_m;
    private int field_n;
    private int field_o;
    static jea field_r;
    private int field_t;

    private final void a(int param0, int param1, int[][] param2, byte param3, int param4, int param5, Random param6) {
        int dupTemp$5 = 0;
        int dupTemp$6 = 0;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int[] stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int[] stackIn_63_2 = null;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int[] stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int[] stackIn_65_2 = null;
        int stackIn_65_3 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int[] stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int[] stackIn_81_2 = null;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int[] stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int[] stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int[] stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int[] stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int[] stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        int[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int[] stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int[] stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int[] stackOut_80_2 = null;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int stackOut_80_5 = 0;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_m <= 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 4096 + -jqa.a(this.field_m, param6, 66);
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 4096;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8_int = stackIn_4_0;
                        var9 = this.field_u * this.field_o >> -860281044;
                        stackOut_4_0 = this.field_o;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var9 > 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = stackIn_5_0;
                        stackOut_5_1 = 0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = stackIn_6_0;
                        stackOut_6_1 = jqa.a(var9, param6, 83);
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = stackIn_7_0 - stackIn_7_1;
                        if (param3 <= -30) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_y = -123;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((ns.field_g ^ -1) >= (param1 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param1 = param1 - ns.field_g;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 < var10) {
                            statePc = 26;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (ns.field_g >= param1 - -param4) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = -param1 + ns.field_g;
                        var12 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 <= var12) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13_ref_int__ = param2[var12 + param5];
                        lua.a(var13_ref_int__, param1, var11, var8_int);
                        lua.a(var13_ref_int__, 0, param4 - var11, var8_int);
                        var12++;
                        if (var23 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var23 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var23 == 0) {
                            statePc = 98;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var11 ^ -1) <= (param0 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        lua.a(param2[param5 + var11], param1, param4, var8_int);
                        var11++;
                        if (var23 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var23 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var23 == 0) {
                            statePc = 98;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 > (param4 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var11 = param4 / 2;
                        var12 = param0 / 2;
                        if ((var11 ^ -1) > (var10 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = var10;
                        stackIn_33_0 = stackOut_31_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var11;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = stackIn_33_0;
                        if (var12 < var10) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var10;
                        stackIn_36_0 = stackOut_34_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = var12;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var14 = stackIn_36_0;
                        var15 = param1 - -var13;
                        var16 = -(2 * var13) + param4;
                        var17 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var17 ^ -1) <= (param0 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var18 = param2[var17 + param5];
                        if (var23 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var14 <= var17) {
                            statePc = 58;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var19 = var17 * var8_int / var14;
                        if (-1 != (this.field_t ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var20 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var13 ^ -1) >= (var20 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var21 = var8_int * var20 / var13;
                        dupTemp$5 = sea.c(-var20 + (param4 + (param1 - 1)), una.field_b);
                        var18[dupTemp$5] = var21 * var19 >> 148820524;
                        var18[sea.c(var20 + param1, una.field_b)] = var21 * var19 >> 148820524;
                        var20++;
                        if (var23 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var23 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var23 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var20 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var20 ^ -1) <= (var13 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var21 = var8_int * var20 / var13;
                        stackOut_49_0 = (int[]) (var18);
                        stackOut_49_1 = sea.c(var20 + param1, una.field_b);
                        stackOut_49_2 = (int[]) (var18);
                        stackOut_49_3 = sea.c(-var20 + (param1 - -param4 + -1), una.field_b);
                        stackOut_49_4 = var21;
                        stackOut_49_5 = var19;
                        stackIn_81_0 = stackOut_49_0;
                        stackIn_81_1 = stackOut_49_1;
                        stackIn_81_2 = stackOut_49_2;
                        stackIn_81_3 = stackOut_49_3;
                        stackIn_81_4 = stackOut_49_4;
                        stackIn_81_5 = stackOut_49_5;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        stackIn_50_3 = stackOut_49_3;
                        stackIn_50_4 = stackOut_49_4;
                        stackIn_50_5 = stackOut_49_5;
                        if (var23 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (int[]) ((Object) stackIn_50_0);
                        stackOut_50_1 = stackIn_50_1;
                        stackOut_50_2 = (int[]) ((Object) stackIn_50_2);
                        stackOut_50_3 = stackIn_50_3;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_52_2 = stackOut_50_2;
                        stackIn_52_3 = stackOut_50_3;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        stackIn_51_3 = stackOut_50_3;
                        if (stackIn_50_4 < stackIn_50_5) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (int[]) ((Object) stackIn_51_0);
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = (int[]) ((Object) stackIn_51_2);
                        stackOut_51_3 = stackIn_51_3;
                        stackOut_51_4 = var19;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        stackIn_53_3 = stackOut_51_3;
                        stackIn_53_4 = stackOut_51_4;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (int[]) ((Object) stackIn_52_0);
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = (int[]) ((Object) stackIn_52_2);
                        stackOut_52_3 = stackIn_52_3;
                        stackOut_52_4 = var21;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        stackIn_53_4 = stackOut_52_4;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_53_2[stackIn_53_3] = stackIn_53_4;
                        stackIn_53_0[stackIn_53_1] = stackIn_53_4;
                        var20++;
                        if (var23 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (ns.field_g >= var15 + var16) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var20 = -var15 + ns.field_g;
                        lua.a(var18, var15, var20, var19);
                        lua.a(var18, 0, var16 + -var20, var19);
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        lua.a(var18, var15, var16, var19);
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var19 = -var17 + param0 + -1;
                        if ((var14 ^ -1) >= (var19 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var20 = var8_int * var19 / var14;
                        if ((this.field_t ^ -1) == -1) {
                            statePc = 68;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var21 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var13 <= var21) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var22 = var8_int * var21 / var13;
                        stackOut_62_0 = (int[]) (var18);
                        stackOut_62_1 = sea.c(param1 - -var21, una.field_b);
                        stackOut_62_2 = (int[]) (var18);
                        stackOut_62_3 = sea.c(-1 + -var21 + param1 - -param4, una.field_b);
                        stackOut_62_4 = var22;
                        stackOut_62_5 = var20;
                        stackIn_81_0 = stackOut_62_0;
                        stackIn_81_1 = stackOut_62_1;
                        stackIn_81_2 = stackOut_62_2;
                        stackIn_81_3 = stackOut_62_3;
                        stackIn_81_4 = stackOut_62_4;
                        stackIn_81_5 = stackOut_62_5;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        stackIn_63_4 = stackOut_62_4;
                        stackIn_63_5 = stackOut_62_5;
                        if (var23 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = (int[]) ((Object) stackIn_63_0);
                        stackOut_63_1 = stackIn_63_1;
                        stackOut_63_2 = (int[]) ((Object) stackIn_63_2);
                        stackOut_63_3 = stackIn_63_3;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        stackIn_65_2 = stackOut_63_2;
                        stackIn_65_3 = stackOut_63_3;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        stackIn_64_2 = stackOut_63_2;
                        stackIn_64_3 = stackOut_63_3;
                        if (stackIn_63_4 < stackIn_63_5) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (int[]) ((Object) stackIn_64_0);
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = (int[]) ((Object) stackIn_64_2);
                        stackOut_64_3 = stackIn_64_3;
                        stackOut_64_4 = var20;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_66_2 = stackOut_64_2;
                        stackIn_66_3 = stackOut_64_3;
                        stackIn_66_4 = stackOut_64_4;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = (int[]) ((Object) stackIn_65_0);
                        stackOut_65_1 = stackIn_65_1;
                        stackOut_65_2 = (int[]) ((Object) stackIn_65_2);
                        stackOut_65_3 = stackIn_65_3;
                        stackOut_65_4 = var22;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        stackIn_66_3 = stackOut_65_3;
                        stackIn_66_4 = stackOut_65_4;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_66_2[stackIn_66_3] = stackIn_66_4;
                        stackIn_66_0[stackIn_66_1] = stackIn_66_4;
                        var21++;
                        if (var23 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var23 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var21 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var21 >= var13) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var22 = var21 * var8_int / var13;
                        dupTemp$6 = sea.c(una.field_b, -1 + param4 + param1 - var21);
                        var18[dupTemp$6] = var20 * var22 >> -901914740;
                        var18[sea.c(var21 + param1, una.field_b)] = var20 * var22 >> -901914740;
                        var21++;
                        if (var23 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var23 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var16 + var15 > ns.field_g) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        lua.a(var18, var15, var16, var20);
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var21 = -var15 + ns.field_g;
                        lua.a(var18, var15, var21, var20);
                        lua.a(var18, 0, -var21 + var16, var20);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var20 = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var13 <= var20) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = (int[]) (var18);
                        stackOut_80_1 = sea.c(una.field_b, param1 - -var20);
                        stackOut_80_2 = (int[]) (var18);
                        stackOut_80_3 = sea.c(una.field_b, -var20 + param4 + param1 - 1);
                        stackOut_80_4 = var8_int * var20;
                        stackOut_80_5 = var13;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        stackIn_81_2 = stackOut_80_2;
                        stackIn_81_3 = stackOut_80_3;
                        stackIn_81_4 = stackOut_80_4;
                        stackIn_81_5 = stackOut_80_5;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_81_2[stackIn_81_3] = stackIn_81_4 / stackIn_81_5;
                        stackIn_81_0[stackIn_81_1] = stackIn_81_4 / stackIn_81_5;
                        var20++;
                        if (var23 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var23 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var16 + var15 ^ -1) < (ns.field_g ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        lua.a(var18, var15, var16, var8_int);
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var20 = ns.field_g - var15;
                        lua.a(var18, var15, var20, var8_int);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        lua.a(var18, 0, -var20 + var16, var8_int);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var17++;
                        if (var23 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackOut_91_0 = (RuntimeException) (var8);
                    stackOut_91_1 = new StringBuilder().append("iia.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    if (param2 == null) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
                    stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
                    stackOut_92_2 = "{...}";
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    stackIn_94_2 = stackOut_92_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
                    stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
                    stackOut_93_2 = "null";
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
                    stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_96_1 = stackOut_94_1;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    if (param6 == null) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
                    stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
                    stackOut_95_2 = "{...}";
                    stackIn_97_0 = stackOut_95_0;
                    stackIn_97_1 = stackOut_95_1;
                    stackIn_97_2 = stackOut_95_2;
                    statePc = 97;
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
                    stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
                    stackOut_96_2 = "null";
                    stackIn_97_0 = stackOut_96_0;
                    stackIn_97_1 = stackOut_96_1;
                    stackIn_97_2 = stackOut_96_2;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    throw tba.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
                }
                case 98: {
                    return;
                }
                case 99: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int d(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 22972) {
              var2_int = 1;
              L1: while (true) {
                if ((1 << var2_int ^ -1) < (param0 ^ -1)) {
                  stackOut_6_0 = var2_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = -94;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "iia.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param2 != 2) {
            return 39;
        }
        if (param0 >= param1) {
            return param0;
        }
        return param1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_y = 101;
                break L1;
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
                                  var4_int = param2;
                                  if (-1 != (var4_int ^ -1)) {
                                    break L12;
                                  } else {
                                    if (var5 == 0) {
                                      this.field_x = param1.h(255);
                                      if (var5 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (1 == var4_int) {
                                  break L11;
                                } else {
                                  L13: {
                                    if (2 != var4_int) {
                                      break L13;
                                    } else {
                                      if (var5 == 0) {
                                        break L10;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (-4 != (var4_int ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var5 == 0) {
                                        break L9;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (4 == var4_int) {
                                    break L8;
                                  } else {
                                    if (5 == var4_int) {
                                      break L7;
                                    } else {
                                      if (-7 == (var4_int ^ -1)) {
                                        break L6;
                                      } else {
                                        if (-8 == (var4_int ^ -1)) {
                                          break L5;
                                        } else {
                                          if (8 == var4_int) {
                                            break L4;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_p = param1.d(param0 ^ 21);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                            this.field_s = param1.d(124);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                          this.field_y = param1.d(param0 ^ 22);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                        this.field_w = param1.d(126);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                      this.field_n = param1.d(122);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                    this.field_t = param1.h(255);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  this.field_u = param1.d(125);
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                this.field_m = param1.d(126);
                break L2;
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("iia.A(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L15;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
    }

    public iia() {
        super(0, true);
        this.field_s = 2048;
        this.field_p = 1024;
        this.field_x = 0;
        this.field_w = 819;
        this.field_y = 409;
        this.field_n = 1024;
        this.field_m = 1024;
        this.field_t = 0;
        this.field_u = 1024;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            this.field_t = 123;
        }
    }

    final int[] c(int param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int[] var3 = null;
        int[][] var4 = null;
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
        int var17 = 0;
        int var18 = 0;
        int[][] var19 = null;
        int[][] var20 = null;
        Random var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26_int = 0;
        int[] var26 = null;
        int[][] var27 = null;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[] var39 = null;
        int[][] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[][] var45 = null;
        int[] var46 = null;
        int[][] var47 = null;
        int[][] var48 = null;
        int[] var53 = null;
        int[] var54 = null;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        var38 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var39 = this.field_i.a((byte) 120, param1);
            var3 = var39;
            if (this.field_i.field_d) {
              var47 = this.field_i.a(param0 ^ 1);
              var40 = var47;
              var4 = var40;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = 1;
              var11 = 1;
              var12 = 0;
              var13 = 0;
              var14 = this.field_p * ns.field_g >> 1850047884;
              var15 = ns.field_g * this.field_s >> 43974156;
              var16 = qda.field_i * this.field_y >> -1955949556;
              var17 = this.field_w * qda.field_i >> 2127772780;
              if (-2 <= (var17 ^ -1)) {
                return var47[param1];
              } else {
                this.field_o = ns.field_g / 8 * this.field_n >> 1588390636;
                var18 = ns.field_g / var14 + 1;
                var19 = new int[var18][3];
                var48 = new int[var18][3];
                var20 = var48;
                var21 = new Random((long)this.field_x);
                L1: while (true) {
                  L2: {
                    var23 = var14 - -jqa.a(-var14 + var15, var21, 126);
                    var24 = var16 + jqa.a(-var16 + var17, var21, 96);
                    var25 = var8 + var23;
                    if ((ns.field_g ^ -1) > (var25 ^ -1)) {
                      var25 = ns.field_g;
                      var23 = ns.field_g - var8;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        if (var11 != 0) {
                          break L5;
                        } else {
                          L6: {
                            var26_int = var9;
                            var54 = var48[var9];
                            var28 = 0;
                            var29_int = var5 + var25;
                            if (0 <= var29_int) {
                              break L6;
                            } else {
                              var29_int = var29_int + ns.field_g;
                              break L6;
                            }
                          }
                          L7: {
                            if (ns.field_g < var29_int) {
                              var29_int = var29_int - ns.field_g;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: while (true) {
                            L9: {
                              L10: {
                                L11: {
                                  var53 = var48[var26_int];
                                  if ((var29_int ^ -1) > (var53[0] ^ -1)) {
                                    break L11;
                                  } else {
                                    stackOut_18_0 = var53[1] ^ -1;
                                    stackOut_18_1 = var29_int ^ -1;
                                    stackIn_22_0 = stackOut_18_0;
                                    stackIn_22_1 = stackOut_18_1;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    if (var38 != 0) {
                                      break L10;
                                    } else {
                                      if (stackIn_19_0 <= stackIn_19_1) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var28++;
                                var26_int++;
                                stackOut_21_0 = var26_int;
                                stackOut_21_1 = var12;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                break L10;
                              }
                              L12: {
                                if (stackIn_22_0 >= stackIn_22_1) {
                                  var26_int = 0;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              if (var38 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                            L13: {
                              var22 = var54[2];
                              if ((var9 ^ -1) == (var26_int ^ -1)) {
                                break L13;
                              } else {
                                L14: {
                                  var30 = var5 + var8;
                                  if (-1 >= (var30 ^ -1)) {
                                    break L14;
                                  } else {
                                    var30 = var30 + ns.field_g;
                                    break L14;
                                  }
                                }
                                L15: {
                                  if ((ns.field_g ^ -1) <= (var30 ^ -1)) {
                                    break L15;
                                  } else {
                                    var30 = var30 - ns.field_g;
                                    break L15;
                                  }
                                }
                                var31 = 1;
                                L16: while (true) {
                                  L17: {
                                    L18: {
                                      if ((var31 ^ -1) < (var28 ^ -1)) {
                                        break L18;
                                      } else {
                                        var42 = var20[(var9 + var31) % var12];
                                        var22 = Math.max(var22, var42[2]);
                                        var31++;
                                        if (var38 != 0) {
                                          break L17;
                                        } else {
                                          if (var38 == 0) {
                                            continue L16;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    var31 = 0;
                                    break L17;
                                  }
                                  L19: while (true) {
                                    if (var31 > var28) {
                                      break L13;
                                    } else {
                                      var43 = var20[(var9 - -var31) % var12];
                                      var33 = var43[2];
                                      stackOut_39_0 = var33 ^ -1;
                                      stackOut_39_1 = var22 ^ -1;
                                      stackIn_51_0 = stackOut_39_0;
                                      stackIn_51_1 = stackOut_39_1;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      if (var38 != 0) {
                                        break L3;
                                      } else {
                                        L20: {
                                          if (stackIn_40_0 == stackIn_40_1) {
                                            break L20;
                                          } else {
                                            L21: {
                                              L22: {
                                                var36 = var43[0];
                                                var37 = var43[1];
                                                if ((var30 ^ -1) <= (var29_int ^ -1)) {
                                                  break L22;
                                                } else {
                                                  var34 = Math.max(var30, var36);
                                                  var35 = Math.min(var29_int, var37);
                                                  if (var38 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              L23: {
                                                if ((var36 ^ -1) == -1) {
                                                  break L23;
                                                } else {
                                                  var34 = Math.max(var30, var36);
                                                  var35 = ns.field_g;
                                                  if (var38 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              var34 = 0;
                                              var35 = Math.min(var29_int, var37);
                                              break L21;
                                            }
                                            this.a(-var33 + var22, var7 + var34, var4, (byte) -86, -var34 + var35, var33, var21);
                                            break L20;
                                          }
                                        }
                                        var31++;
                                        if (var38 == 0) {
                                          continue L19;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var9 = var26_int;
                            if (var38 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var22 = 0;
                      break L4;
                    }
                    stackOut_50_0 = var24 + var22 ^ -1;
                    stackOut_50_1 = qda.field_i ^ -1;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    break L3;
                  }
                  L24: {
                    L25: {
                      if (stackIn_51_0 < stackIn_51_1) {
                        break L25;
                      } else {
                        var10 = 0;
                        if (var38 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var24 = qda.field_i - var22;
                    break L24;
                  }
                  L26: {
                    L27: {
                      if ((ns.field_g ^ -1) != (var25 ^ -1)) {
                        break L27;
                      } else {
                        L28: {
                          this.a(var24, var8 - -var6, var47, (byte) -81, var23, var22, var21);
                          if (var10 == 0) {
                            break L28;
                          } else {
                            if (var38 == 0) {
                              break L0;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          var10 = 1;
                          incrementValue$2 = var13;
                          var13++;
                          var44 = var19[incrementValue$2];
                          var26 = var44;
                          var26[2] = var22 - -var24;
                          var44[0] = var8;
                          var44[1] = var25;
                          var27 = var20;
                          var45 = var19;
                          var19 = var27;
                          var12 = var13;
                          var7 = var6;
                          var13 = 0;
                          var6 = jqa.a(ns.field_g, var21, 71);
                          var5 = var6 - var7;
                          var8 = 0;
                          var28 = var5;
                          if (-1 < (var28 ^ -1)) {
                            var28 = var28 + ns.field_g;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (ns.field_g < var28) {
                            var28 = var28 - ns.field_g;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        var9 = 0;
                        var11 = 0;
                        L31: while (true) {
                          L32: {
                            L33: {
                              L34: {
                                var29 = var45[var9];
                                if ((var28 ^ -1) > (var29[0] ^ -1)) {
                                  break L34;
                                } else {
                                  stackOut_66_0 = var28 ^ -1;
                                  stackOut_66_1 = var29[1] ^ -1;
                                  stackIn_71_0 = stackOut_66_0;
                                  stackIn_71_1 = stackOut_66_1;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  if (var38 != 0) {
                                    break L33;
                                  } else {
                                    if (stackIn_67_0 < stackIn_67_1) {
                                      break L34;
                                    } else {
                                      if (var38 == 0) {
                                        break L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                              var9++;
                              stackOut_70_0 = var9 ^ -1;
                              stackOut_70_1 = var12 ^ -1;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              break L33;
                            }
                            L35: {
                              if (stackIn_71_0 > stackIn_71_1) {
                                break L35;
                              } else {
                                var9 = 0;
                                break L35;
                              }
                            }
                            if (var38 == 0) {
                              continue L31;
                            } else {
                              break L32;
                            }
                          }
                          if (var38 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    incrementValue$3 = var13;
                    var13++;
                    var46 = var19[incrementValue$3];
                    var26 = var46;
                    var46[0] = var8;
                    var46[1] = var25;
                    var26[2] = var22 + var24;
                    this.a(var24, var8 + var6, var47, (byte) -99, var23, var22, var21);
                    var8 = var25;
                    break L26;
                  }
                  if (var38 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var39;
        } else {
          return (int[]) null;
        }
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_q = null;
        field_v = null;
    }

    static {
        field_q = "You cannot add yourself!";
        field_v = new int[8192];
    }
}
