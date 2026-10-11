/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int field_c;
    static volatile boolean field_a;
    static int field_d;
    static String field_b;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        oc stackIn_13_0 = null;
        oc stackIn_24_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        boolean stackIn_226_0 = false;
        int stackIn_238_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_247_0 = 0;
        boolean stackIn_250_0 = false;
        int stackIn_296_0 = 0;
        int stackIn_298_0 = 0;
        boolean stackIn_304_0 = false;
        int stackIn_339_0 = 0;
        boolean stackOut_225_0;
        boolean stackOut_249_0;
        boolean stackOut_303_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        boolean[] var5 = null;
        boolean[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        oc var8 = null;
        oj var9_ref_oj = null;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ArrayIndexOutOfBoundsException var21_ref_ArrayIndexOutOfBoundsException = null;
        int var22 = 0;
        oj var22_ref_oj = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (50 > df.field_c) {
                            /* Inlined CFG state: 4. */
                            {
                                if (ik.field_b) {
                                    statePc = 9;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        ik.field_b = true;
                                        fieldTemp$0 = aa.field_f + 1;
                                        aa.field_f = aa.field_f + 1;
                                        if (fieldTemp$0 >= 10) {
                                            statePc = 10;
                                        } else {
                                            statePc = 6;
                                        }
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                statePc = 10;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        aa.field_f = 0;
                        var1_int = ln.field_a.field_d;
                        var2 = ln.field_a.field_a;
                        var3 = ln.field_a.field_n;
                        kf.a(cm.field_c, 0, var3);
                        var4 = ln.field_a.field_c;
                        var5 = ln.field_a.field_e;
                        var6 = ln.field_a.field_q;
                        var7 = ln.field_a.field_f;
                        var8_int = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (rc.field_e <= var8_int) {
                            statePc = 23;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                var9_ref_oj = re.field_n[var8_int];
                                stackIn_24_0 = var9_ref_oj.field_j;
                                stackIn_13_0 = stackIn_24_0;
                                if (var26 != 0) {
                                    statePc = 24;
                                } else {
                                    statePc = 13;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = ((oc) (Object) stackIn_13_0).b(param0 - 6);
                        if (var10 < 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (~var3 >= ~var10) {
                            statePc = 22;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 15. */
                            {
                                /* Sequential CFG blocks: 15, 17. */
                                {
                                }
                                {
                                    if (var4[var10] != 3) {
                                        statePc = 22;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 18. */
                                        {
                                            /* Sequential CFG blocks: 18, 20. */
                                            {
                                            }
                                            {
                                                var4[var10] = 0;
                                                statePc = 22;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        statePc = ((Object) stateCaught_22 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_22);
                        }
                        caughtException = stateCaught_22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = mm.field_m[0].field_j;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        statePc = ((Object) stateCaught_23 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_23);
                        }
                        caughtException = stateCaught_23;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = stackIn_24_0;
                        var9 = var8.b(-4);
                        var10 = ln.field_a.field_g[var9];
                        if (var10 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        statePc = ((Object) stateCaught_24 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_24);
                        }
                        caughtException = stateCaught_24;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10 = -1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var11 = var8.field_g - 50;
                        var12 = 50 + var8.field_g;
                        var13 = -50 + var8.field_e;
                        if (0 < var11) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        statePc = ((Object) stateCaught_27 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_27);
                        }
                        caughtException = stateCaught_27;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 >= var13) {
                            /* Inlined CFG state: 31. */
                            {
                                var13 = 1;
                                statePc = 32;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 29. */
                            {
                                statePc = 32;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_28) {
                        statePc = ((Object) stateCaught_28 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_28);
                        }
                        caughtException = stateCaught_28;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var14 = var8.field_e + 50;
                        if (var14 >= var1_int - 1) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var14 = var1_int - 2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        statePc = ((Object) stateCaught_35 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_35);
                        }
                        caughtException = stateCaught_35;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var2 - 1 <= var12) {
                            /* Inlined CFG state: 39. */
                            {
                                var12 = -2 + var2;
                                statePc = 40;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                statePc = 40;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var15 = 0;
                        var16 = var11;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        statePc = ((Object) stateCaught_40 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_40);
                        }
                        caughtException = stateCaught_40;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (~var12 >= ~var16) {
                            statePc = 51;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 42. */
                            {
                                var15 = var16 * var1_int + var13;
                                stackIn_52_0 = var13;
                                stackIn_43_0 = stackIn_52_0;
                                if (var26 != 0) {
                                    statePc = 52;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 43. */
                                    {
                                        var17 = stackIn_43_0;
                                        statePc = 44;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_41) {
                        statePc = ((Object) stateCaught_41 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_41);
                        }
                        caughtException = stateCaught_41;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var14 <= var17) {
                            statePc = 49;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 45. */
                            {
                                var5[var15] = false;
                                var6[var15] = false;
                                var15++;
                                var17++;
                                if (var26 != 0) {
                                    statePc = 50;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 46. */
                                    {
                                        if (var26 == 0) {
                                            statePc = 44;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 47. */
                                            {
                                                statePc = 49;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_44) {
                        statePc = ((Object) stateCaught_44 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_44);
                        }
                        caughtException = stateCaught_44;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var16++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        statePc = ((Object) stateCaught_49 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_49);
                        }
                        caughtException = stateCaught_49;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var26 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        statePc = ((Object) stateCaught_50 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_50);
                        }
                        caughtException = stateCaught_50;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var16 = var11 * var1_int;
                        stackIn_52_0 = var8.field_e;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        statePc = ((Object) stateCaught_51 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_51);
                        }
                        caughtException = stateCaught_51;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var17 = stackIn_52_0;
                        var18 = var8.field_g;
                        var19 = Math.max(-19 + var8.field_e, 1);
                        var20 = Math.min(20 + var8.field_e, ln.field_a.field_d - param0);
                        var21 = Math.max(var8.field_g - 17, 1);
                        var22 = Math.min(16 + var8.field_g, ln.field_a.field_a - 2);
                        var23 = var19;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        statePc = ((Object) stateCaught_52 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_52);
                        }
                        caughtException = stateCaught_52;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (~var20 > ~var23) {
                            statePc = 58;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 54. */
                            {
                                ui.a(var21, var17, var18, var23, (byte) -69);
                                ui.a(var22, var17, var18, var23, (byte) -69);
                                var23++;
                                if (var26 != 0) {
                                    statePc = 59;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 55. */
                                    {
                                        if (var26 == 0) {
                                            statePc = 53;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 56. */
                                            {
                                                statePc = 58;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_53) {
                        statePc = ((Object) stateCaught_53 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_53);
                        }
                        caughtException = stateCaught_53;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var23 = 1 + var21;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        statePc = ((Object) stateCaught_58 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_58);
                        }
                        caughtException = stateCaught_58;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var22 - 1 < var23) {
                            statePc = 66;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 60. */
                            {
                                ui.a(var23, var17, var18, var19, (byte) -69);
                                ui.a(var23, var17, var18, var20, (byte) -69);
                                var23++;
                                if (var26 != 0) {
                                    statePc = 82;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 61. */
                                    {
                                        /* Sequential CFG blocks: 61, 63. */
                                        {
                                        }
                                        {
                                            if (var26 == 0) {
                                                statePc = 59;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 64. */
                                                {
                                                    statePc = 66;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_59) {
                        statePc = ((Object) stateCaught_59 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_59);
                        }
                        caughtException = stateCaught_59;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var10 <= 0) {
                            statePc = 81;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 67. */
                            {
                                var16 = var21 * ln.field_a.field_d;
                                var23 = var21;
                                statePc = 68;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_66) {
                        statePc = ((Object) stateCaught_66 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_66);
                        }
                        caughtException = stateCaught_66;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var22 < var23) {
                            statePc = 81;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 69. */
                            {
                                stackIn_83_0 = var19;
                                stackIn_70_0 = stackIn_83_0;
                                if (var26 != 0) {
                                    statePc = 83;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 70. */
                                    {
                                        var24 = stackIn_70_0;
                                        statePc = 71;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        statePc = ((Object) stateCaught_68 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_68);
                        }
                        caughtException = stateCaught_68;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (~var20 > ~var24) {
                            statePc = 79;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 72. */
                            {
                                stackIn_80_0 = ~var10;
                                stackIn_73_0 = stackIn_80_0;
                                stackIn_80_1 = ~ln.field_a.field_g[var24 + var16];
                                stackIn_73_1 = stackIn_80_1;
                                if (var26 != 0) {
                                    statePc = 80;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 73. */
                                    {
                                        if (stackIn_73_0 == stackIn_73_1) {
                                            /* Inlined CFG state: 77. */
                                            {
                                                ln.field_a.field_e[var16 + var24] = true;
                                                ln.field_a.field_f[var16 + var24] = 2;
                                                statePc = 78;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 74. */
                                            {
                                                /* Sequential CFG blocks: 74, 76. */
                                                {
                                                }
                                                {
                                                    statePc = 78;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_71) {
                        statePc = ((Object) stateCaught_71 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_71);
                        }
                        caughtException = stateCaught_71;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var24++;
                        if (var26 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        statePc = ((Object) stateCaught_78 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_78);
                        }
                        caughtException = stateCaught_78;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = var16;
                        stackIn_80_1 = ln.field_a.field_d;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        statePc = ((Object) stateCaught_79 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_79);
                        }
                        caughtException = stateCaught_79;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var16 = stackIn_80_0 + stackIn_80_1;
                        var23++;
                        if (var26 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        statePc = ((Object) stateCaught_80 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_80);
                        }
                        caughtException = stateCaught_80;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        cm.field_c[var9] = 50;
                        var6[var9] = true;
                        var19 = 49;
                        var20 = var9;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        statePc = ((Object) stateCaught_81 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_81);
                        }
                        caughtException = stateCaught_81;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = n.field_o ? 1 : 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        statePc = ((Object) stateCaught_82 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_82);
                        }
                        caughtException = stateCaught_82;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 == 0) {
                            statePc = 157;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 84. */
                            {
                                var21 = 0;
                                statePc = 85;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_83) {
                        statePc = ((Object) stateCaught_83 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_83);
                        }
                        caughtException = stateCaught_83;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (~var21 <= ~rc.field_e) {
                            statePc = 157;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 86. */
                            {
                                var22_ref_oj = re.field_n[var21];
                                var23 = var22_ref_oj.field_j.b(param0 ^ -2);
                                if (var26 != 0) {
                                    statePc = 158;
                                } else {
                                    statePc = 87;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_85) {
                        statePc = ((Object) stateCaught_85 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_85);
                        }
                        caughtException = stateCaught_85;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (null == var22_ref_oj) {
                            statePc = 156;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 88. */
                            {
                                /* Sequential CFG blocks: 88, 90. */
                                {
                                }
                                {
                                    if (!od.a(var22_ref_oj.field_i, 1)) {
                                        statePc = 156;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 91. */
                                        {
                                            /* Sequential CFG blocks: 91, 93. */
                                            {
                                            }
                                            {
                                                if (var22_ref_oj.field_h == 0) {
                                                    statePc = 156;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 94. */
                                                    {
                                                        /* Sequential CFG blocks: 94, 96. */
                                                        {
                                                        }
                                                        {
                                                            if (null == q.field_g) {
                                                                statePc = 102;
                                                                continue stateLoop;
                                                            } else {
                                                                /* Inlined CFG state: 97. */
                                                                {
                                                                    /* Sequential CFG blocks: 97, 99. */
                                                                    {
                                                                    }
                                                                    {
                                                                        if (q.field_g.a(var22_ref_oj, (byte) -5)) {
                                                                            statePc = 156;
                                                                        } else {
                                                                            statePc = 100;
                                                                        }
                                                                        continue stateLoop;
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
                    } catch (Throwable stateCaught_87) {
                        statePc = ((Object) stateCaught_87 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_87);
                        }
                        caughtException = stateCaught_87;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        statePc = ((Object) stateCaught_100 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_100);
                        }
                        caughtException = stateCaught_100;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var4[var23] = 0;
                        if (rh.a(var22_ref_oj.field_i, true)) {
                            statePc = 132;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 103. */
                            {
                                /* Sequential CFG blocks: 103, 105. */
                                {
                                }
                                {
                                    var4[1 + var23] = 0;
                                    var24 = var4[var23 + ln.field_a.field_d - 1];
                                    if (1 != var4[var23 + ln.field_a.field_d]) {
                                        statePc = 118;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 106. */
                                        {
                                            if (var24 == 2) {
                                                statePc = 118;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 107. */
                                                {
                                                    /* Sequential CFG blocks: 107, 109. */
                                                    {
                                                    }
                                                    {
                                                        if (var24 == 3) {
                                                            statePc = 118;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 110. */
                                                            {
                                                                /* Sequential CFG blocks: 110, 112. */
                                                                {
                                                                }
                                                                {
                                                                    if (4 != var24) {
                                                                        statePc = 117;
                                                                    } else {
                                                                        statePc = 113;
                                                                    }
                                                                    continue stateLoop;
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
                    } catch (Throwable stateCaught_102) {
                        statePc = ((Object) stateCaught_102 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_102);
                        }
                        caughtException = stateCaught_102;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        /* Sequential CFG blocks: 113, 115. */
                        {
                        }
                        {
                            statePc = 118;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_113) {
                        statePc = ((Object) stateCaught_113 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_113);
                        }
                        caughtException = stateCaught_113;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var4[var23 + ln.field_a.field_d] = 0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        statePc = ((Object) stateCaught_117 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_117);
                        }
                        caughtException = stateCaught_117;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var24 = var4[ln.field_a.field_d + var23];
                        if (var4[ln.field_a.field_d + (var23 + 1)] != 1) {
                            statePc = 131;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 119. */
                            {
                                if (2 == var24) {
                                    statePc = 131;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 120. */
                                    {
                                        /* Sequential CFG blocks: 120, 122. */
                                        {
                                        }
                                        {
                                            if (var24 == 3) {
                                                statePc = 131;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 123. */
                                                {
                                                    /* Sequential CFG blocks: 123, 125. */
                                                    {
                                                    }
                                                    {
                                                        if (var24 != 4) {
                                                            /* Inlined CFG state: 130. */
                                                            {
                                                                var4[1 + ln.field_a.field_d + var23] = 0;
                                                                statePc = 131;
                                                                continue stateLoop;
                                                            }
                                                        } else {
                                                            /* Inlined CFG state: 126. */
                                                            {
                                                                /* Sequential CFG blocks: 126, 128. */
                                                                {
                                                                }
                                                                {
                                                                    statePc = 131;
                                                                    continue stateLoop;
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
                    } catch (Throwable stateCaught_118) {
                        statePc = ((Object) stateCaught_118 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_118);
                        }
                        caughtException = stateCaught_118;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var26 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        statePc = ((Object) stateCaught_131 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_131);
                        }
                        caughtException = stateCaught_131;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var4[var23 - ln.field_a.field_d] = 0;
                        var24 = var4[1 - ln.field_a.field_d + var23];
                        if (1 != var4[1 + var23]) {
                            statePc = 145;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 133. */
                            {
                                if (var24 == 2) {
                                    statePc = 145;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 134. */
                                    {
                                        /* Sequential CFG blocks: 134, 136. */
                                        {
                                        }
                                        {
                                            if (var24 == 3) {
                                                statePc = 145;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 137. */
                                                {
                                                    /* Sequential CFG blocks: 137, 139. */
                                                    {
                                                    }
                                                    {
                                                        if (4 != var24) {
                                                            /* Inlined CFG state: 144. */
                                                            {
                                                                var4[var23 + 1] = 0;
                                                                statePc = 145;
                                                                continue stateLoop;
                                                            }
                                                        } else {
                                                            /* Inlined CFG state: 140. */
                                                            {
                                                                /* Sequential CFG blocks: 140, 142. */
                                                                {
                                                                }
                                                                {
                                                                    statePc = 145;
                                                                    continue stateLoop;
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
                    } catch (Throwable stateCaught_132) {
                        statePc = ((Object) stateCaught_132 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_132);
                        }
                        caughtException = stateCaught_132;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var24 != 1) {
                            statePc = 156;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 146. */
                            {
                                var24 = var4[var23 - (ln.field_a.field_d * 2 + 1)];
                                if (2 == var24) {
                                    statePc = 156;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 147. */
                                    {
                                        if (var24 == 3) {
                                            statePc = 156;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 148. */
                                            {
                                                /* Sequential CFG blocks: 148, 150. */
                                                {
                                                }
                                                {
                                                    if (var24 != 4) {
                                                        /* Inlined CFG state: 155. */
                                                        {
                                                            var4[-ln.field_a.field_d + (var23 + 1)] = 0;
                                                            statePc = 156;
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 151. */
                                                        {
                                                            /* Sequential CFG blocks: 151, 153. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 156;
                                                                continue stateLoop;
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
                    } catch (Throwable stateCaught_145) {
                        statePc = ((Object) stateCaught_145 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_145);
                        }
                        caughtException = stateCaught_145;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var21++;
                        if (var26 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        statePc = ((Object) stateCaught_156 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_156);
                        }
                        caughtException = stateCaught_156;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        kl.field_c[var19] = var20;
                        cm.field_c[var20] = var19 + 1;
                        var21 = var20 + 1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        statePc = ((Object) stateCaught_157 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_157 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_157);
                        }
                        caughtException = stateCaught_157;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var22 = -1 + var20;
                        var23 = -var1_int + var20;
                        var24 = var20 + var1_int;
                        var25 = cm.field_c[var20] - 1;
                        if (var19 <= 0) {
                            statePc = 171;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        statePc = ((Object) stateCaught_158 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_158 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_158);
                        }
                        caughtException = stateCaught_158;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        stackIn_186_0 = ~var4[var21];
                        stackIn_160_0 = stackIn_186_0;
                        stackIn_186_1 = -1;
                        stackIn_160_1 = stackIn_186_1;
                        if (var26 != 0) {
                            statePc = 186;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 160. */
                            {
                                /* Sequential CFG blocks: 160, 162. */
                                {
                                    stackIn_162_0 = stackIn_160_0;
                                    stackIn_162_1 = stackIn_160_1;
                                }
                                {
                                    if (stackIn_162_0 == stackIn_162_1) {
                                        statePc = 168;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 163. */
                                        {
                                            /* Sequential CFG blocks: 163, 165. */
                                            {
                                            }
                                            {
                                                if (var4[var21] != 5) {
                                                    statePc = 171;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 166. */
                                                    {
                                                        statePc = 168;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_159) {
                        statePc = ((Object) stateCaught_159 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_159 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_159);
                        }
                        caughtException = stateCaught_159;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (cm.field_c[var21] < var25) {
                            statePc = 214;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 169. */
                            {
                                statePc = 171;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_168) {
                        statePc = ((Object) stateCaught_168 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_168 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_168);
                        }
                        caughtException = stateCaught_168;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (var19 <= 0) {
                            statePc = 184;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 172. */
                            {
                                /* Sequential CFG blocks: 172, 174. */
                                {
                                }
                                {
                                    if (var4[var23] == 0) {
                                        statePc = 180;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 175. */
                                        {
                                            /* Sequential CFG blocks: 175, 177. */
                                            {
                                            }
                                            {
                                                if (var4[var23] != 5) {
                                                    statePc = 184;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 178. */
                                                    {
                                                        statePc = 180;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_171) {
                        statePc = ((Object) stateCaught_171 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_171 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_171);
                        }
                        caughtException = stateCaught_171;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (var25 <= cm.field_c[var23]) {
                            statePc = 184;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 181. */
                            {
                                /* Sequential CFG blocks: 181, 183. */
                                {
                                }
                                {
                                    var20 = var23;
                                    var19--;
                                    if (var26 == 0) {
                                        statePc = 215;
                                    } else {
                                        statePc = 184;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_180) {
                        statePc = ((Object) stateCaught_180 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_180 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_180);
                        }
                        caughtException = stateCaught_180;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackIn_186_0 = ~var19;
                        stackIn_186_1 = -1;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        statePc = ((Object) stateCaught_184 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_184 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_184);
                        }
                        caughtException = stateCaught_184;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (stackIn_186_0 >= stackIn_186_1) {
                            statePc = 196;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 187. */
                            {
                                if (var4[var24] == 0) {
                                    statePc = 193;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 188. */
                                    {
                                        /* Sequential CFG blocks: 188, 190. */
                                        {
                                        }
                                        {
                                            if (var4[var24] != 5) {
                                                statePc = 196;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 191. */
                                                {
                                                    statePc = 193;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_186) {
                        statePc = ((Object) stateCaught_186 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_186 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_186);
                        }
                        caughtException = stateCaught_186;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (~cm.field_c[var24] > ~var25) {
                            statePc = 213;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 194. */
                            {
                                statePc = 196;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_193) {
                        statePc = ((Object) stateCaught_193 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_193 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_193);
                        }
                        caughtException = stateCaught_193;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (var19 <= 0) {
                            statePc = 208;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 197. */
                            {
                                /* Sequential CFG blocks: 197, 199. */
                                {
                                }
                                {
                                    if (var4[var22] == 0) {
                                        statePc = 205;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 200. */
                                        {
                                            /* Sequential CFG blocks: 200, 202. */
                                            {
                                            }
                                            {
                                                if (var4[var22] != 5) {
                                                    statePc = 208;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 203. */
                                                    {
                                                        statePc = 205;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_196) {
                        statePc = ((Object) stateCaught_196 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_196 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_196);
                        }
                        caughtException = stateCaught_196;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (var25 > cm.field_c[var22]) {
                            statePc = 212;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 206. */
                            {
                                statePc = 208;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_205) {
                        statePc = ((Object) stateCaught_205 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_205 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_205);
                        }
                        caughtException = stateCaught_205;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        var19++;
                        if (var19 >= 50) {
                            statePc = 216;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 209. */
                            {
                                /* Sequential CFG blocks: 209, 211. */
                                {
                                }
                                {
                                    var20 = kl.field_c[var19];
                                    if (var26 == 0) {
                                        statePc = 215;
                                    } else {
                                        statePc = 212;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_208) {
                        statePc = ((Object) stateCaught_208 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_208 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_208);
                        }
                        caughtException = stateCaught_208;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        var20 = var22;
                        var19--;
                        if (var26 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        statePc = ((Object) stateCaught_212 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_212 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_212);
                        }
                        caughtException = stateCaught_212;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        var19--;
                        var20 = var24;
                        if (var26 == 0) {
                            statePc = 215;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        statePc = ((Object) stateCaught_213 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_213 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_213);
                        }
                        caughtException = stateCaught_213;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        var19--;
                        var20 = var21;
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        statePc = ((Object) stateCaught_214 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_214 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_214);
                        }
                        caughtException = stateCaught_214;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        if (var26 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        statePc = ((Object) stateCaught_215 instanceof ArrayIndexOutOfBoundsException ? 217 : ((Object) stateCaught_215 instanceof RuntimeException ? 341 : -1));
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_215);
                        }
                        caughtException = stateCaught_215;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        statePc = ((Object) stateCaught_216 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_216);
                        }
                        caughtException = stateCaught_216;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        var21_ref_ArrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) ((Object) caughtException);
                        if (li.field_q < 2) {
                            statePc = 220;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        statePc = ((Object) stateCaught_217 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_217);
                        }
                        caughtException = stateCaught_217;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        System.out.println("DEBUG AND ADMIN MESSAGE:");
                        System.out.println("ArrayIndexOutOfBoundsException while routefinding");
                        var21_ref_ArrayIndexOutOfBoundsException.printStackTrace();
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        statePc = ((Object) stateCaught_218 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_218);
                        }
                        caughtException = stateCaught_218;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        var15 = 0;
                        if (n.field_o) {
                            /* Inlined CFG state: 223. */
                            {
                                var21 = 0;
                                statePc = 224;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 221. */
                            {
                                statePc = 240;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_220) {
                        statePc = ((Object) stateCaught_220 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_220);
                        }
                        caughtException = stateCaught_220;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (~var21 <= ~rc.field_e) {
                            statePc = 240;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 225. */
                            {
                                var22_ref_oj = re.field_n[var21];
                                stackOut_225_0 = od.a(var22_ref_oj.field_i, 1);
                                stackIn_241_0 = stackOut_225_0 ? 1 : 0;
                                stackIn_226_0 = stackOut_225_0;
                                if (var26 != 0) {
                                    statePc = 241;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 226. */
                                    {
                                        if (stackIn_226_0) {
                                            /* Inlined CFG state: 230. */
                                            {
                                                if (var22_ref_oj.field_e != 0) {
                                                    statePc = 239;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 231. */
                                                    {
                                                        if (0 >= var22_ref_oj.field_I) {
                                                            statePc = 239;
                                                        } else {
                                                            statePc = 232;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        } else {
                                            /* Inlined CFG state: 227. */
                                            {
                                                /* Sequential CFG blocks: 227, 229. */
                                                {
                                                }
                                                {
                                                    statePc = 239;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_224) {
                        statePc = ((Object) stateCaught_224 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_224);
                        }
                        caughtException = stateCaught_224;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        /* Sequential CFG blocks: 232, 234. */
                        {
                        }
                        {
                            var23 = var22_ref_oj.field_j.b(-4);
                            if (rh.a(var22_ref_oj.field_i, true)) {
                                /* Inlined CFG state: 237. */
                                {
                                    stackIn_238_0 = -ln.field_a.field_d;
                                    statePc = 238;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 235. */
                                {
                                    stackIn_238_0 = 1;
                                    statePc = 238;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_232) {
                        statePc = ((Object) stateCaught_232 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_232);
                        }
                        caughtException = stateCaught_232;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        var24 = stackIn_238_0;
                        ln.field_a.field_c[var23] = 2;
                        ln.field_a.field_c[var24 + var23] = 2;
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        statePc = ((Object) stateCaught_238 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_238);
                        }
                        caughtException = stateCaught_238;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        var21++;
                        if (var26 == 0) {
                            statePc = 224;
                        } else {
                            statePc = 240;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        statePc = ((Object) stateCaught_239 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_239);
                        }
                        caughtException = stateCaught_239;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        stackIn_241_0 = 0;
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        statePc = ((Object) stateCaught_240 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_240);
                        }
                        caughtException = stateCaught_240;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        if (stackIn_241_0 != (cj.field_I & 4)) {
                            /* Inlined CFG state: 244. */
                            {
                                var16 = var1_int;
                                var21 = 1;
                                statePc = 245;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 242. */
                            {
                                statePc = 342;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_241) {
                        statePc = ((Object) stateCaught_241 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_241);
                        }
                        caughtException = stateCaught_241;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (~var21 <= ~(-1 + var2)) {
                            statePc = 297;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 246. */
                            {
                                stackIn_298_0 = 1;
                                stackIn_247_0 = stackIn_298_0;
                                if (var26 != 0) {
                                    statePc = 298;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 247. */
                                    {
                                        var22 = stackIn_247_0;
                                        statePc = 248;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_245) {
                        statePc = ((Object) stateCaught_245 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_245);
                        }
                        caughtException = stateCaught_245;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (-1 + var1_int <= var22) {
                            statePc = 295;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 249. */
                            {
                                var15 = var22 + var16;
                                stackOut_249_0 = var5[var15];
                                stackIn_296_0 = stackOut_249_0 ? 1 : 0;
                                stackIn_250_0 = stackOut_249_0;
                                if (var26 != 0) {
                                    statePc = 296;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 250. */
                                    {
                                        if (stackIn_250_0) {
                                            statePc = 294;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 251. */
                                            {
                                                /* Sequential CFG blocks: 251, 253. */
                                                {
                                                }
                                                {
                                                    if (var4[var15] == 1) {
                                                        /* Inlined CFG state: 258. */
                                                        {
                                                            if (!var5[1 + var15]) {
                                                                statePc = 265;
                                                            } else {
                                                                statePc = 259;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 254. */
                                                        {
                                                            /* Sequential CFG blocks: 254, 256. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 294;
                                                                continue stateLoop;
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
                    } catch (Throwable stateCaught_248) {
                        statePc = ((Object) stateCaught_248 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_248);
                        }
                        caughtException = stateCaught_248;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        if (var4[1 + var15] == 2) {
                            statePc = 265;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 260. */
                            {
                                /* Sequential CFG blocks: 260, 262. */
                                {
                                }
                                {
                                    if (var4[var15 + 1] != 1) {
                                        statePc = 292;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 263. */
                                        {
                                            statePc = 265;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_259) {
                        statePc = ((Object) stateCaught_259 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_259);
                        }
                        caughtException = stateCaught_259;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        if (!var5[var15 - 1]) {
                            statePc = 274;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 266. */
                            {
                                /* Sequential CFG blocks: 266, 268. */
                                {
                                }
                                {
                                    if (var4[var15 - 1] == 2) {
                                        statePc = 274;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 269. */
                                        {
                                            /* Sequential CFG blocks: 269, 271. */
                                            {
                                            }
                                            {
                                                if (var4[var15 - 1] != 1) {
                                                    statePc = 292;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 272. */
                                                    {
                                                        statePc = 274;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_265) {
                        statePc = ((Object) stateCaught_265 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_265);
                        }
                        caughtException = stateCaught_265;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        if (!var5[var15 + var1_int]) {
                            statePc = 283;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 275. */
                            {
                                /* Sequential CFG blocks: 275, 277. */
                                {
                                }
                                {
                                    if (var4[var1_int + var15] == 2) {
                                        statePc = 283;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 278. */
                                        {
                                            /* Sequential CFG blocks: 278, 280. */
                                            {
                                            }
                                            {
                                                if (var4[var1_int + var15] != 1) {
                                                    statePc = 292;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 281. */
                                                    {
                                                        statePc = 283;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_274) {
                        statePc = ((Object) stateCaught_274 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_274);
                        }
                        caughtException = stateCaught_274;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        if (!var5[var15 - var1_int]) {
                            statePc = 294;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 284. */
                            {
                                /* Sequential CFG blocks: 284, 286. */
                                {
                                }
                                {
                                    if (var4[var15 - var1_int] == 2) {
                                        statePc = 294;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 287. */
                                        {
                                            /* Sequential CFG blocks: 287, 289. */
                                            {
                                            }
                                            {
                                                if (var4[-var1_int + var15] == 1) {
                                                    statePc = 294;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 290. */
                                                    {
                                                        statePc = 292;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_283) {
                        statePc = ((Object) stateCaught_283 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_283);
                        }
                        caughtException = stateCaught_283;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        var5[var15] = true;
                        var7[var15] = 2;
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        statePc = ((Object) stateCaught_292 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_292);
                        }
                        caughtException = stateCaught_292;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        var22++;
                        if (var26 == 0) {
                            statePc = 248;
                        } else {
                            statePc = 295;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        statePc = ((Object) stateCaught_294 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_294);
                        }
                        caughtException = stateCaught_294;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        stackIn_296_0 = var16 + var1_int;
                        statePc = 296;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        statePc = ((Object) stateCaught_295 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_295);
                        }
                        caughtException = stateCaught_295;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        var16 = stackIn_296_0;
                        var21++;
                        if (var26 == 0) {
                            statePc = 245;
                        } else {
                            statePc = 297;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        statePc = ((Object) stateCaught_296 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_296);
                        }
                        caughtException = stateCaught_296;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        var16 = var1_int;
                        stackIn_298_0 = 1;
                        statePc = 298;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        statePc = ((Object) stateCaught_297 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_297);
                        }
                        caughtException = stateCaught_297;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        var21 = stackIn_298_0;
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        statePc = ((Object) stateCaught_298 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_298);
                        }
                        caughtException = stateCaught_298;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        if (~var21 <= ~(var2 - 1)) {
                            statePc = 342;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 300. */
                            {
                                if (var26 != 0) {
                                    statePc = 342;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 301. */
                                    {
                                        var22 = 1;
                                        statePc = 302;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_299) {
                        statePc = ((Object) stateCaught_299 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_299);
                        }
                        caughtException = stateCaught_299;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        if (~(var1_int - 1) >= ~var22) {
                            statePc = 338;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 303. */
                            {
                                var15 = var16 + var22;
                                stackOut_303_0 = var5[var15];
                                stackIn_339_0 = stackOut_303_0 ? 1 : 0;
                                stackIn_304_0 = stackOut_303_0;
                                if (var26 != 0) {
                                    statePc = 339;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 304. */
                                    {
                                        if (stackIn_304_0) {
                                            statePc = 337;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 305. */
                                            {
                                                /* Sequential CFG blocks: 305, 307. */
                                                {
                                                }
                                                {
                                                    if (2 == var4[var15]) {
                                                        /* Inlined CFG state: 312. */
                                                        {
                                                            if (!var5[var15 + 1]) {
                                                                statePc = 316;
                                                            } else {
                                                                statePc = 313;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 308. */
                                                        {
                                                            /* Sequential CFG blocks: 308, 310. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 337;
                                                                continue stateLoop;
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
                    } catch (Throwable stateCaught_302) {
                        statePc = ((Object) stateCaught_302 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_302);
                        }
                        caughtException = stateCaught_302;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        if (var4[var15 + 1] != 2) {
                            statePc = 336;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 314. */
                            {
                                statePc = 316;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_313) {
                        statePc = ((Object) stateCaught_313 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_313);
                        }
                        caughtException = stateCaught_313;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        if (!var5[-1 + var15]) {
                            statePc = 322;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 317. */
                            {
                                /* Sequential CFG blocks: 317, 319. */
                                {
                                }
                                {
                                    if (var4[var15 - 1] != 2) {
                                        statePc = 336;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 320. */
                                        {
                                            statePc = 322;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_316) {
                        statePc = ((Object) stateCaught_316 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_316);
                        }
                        caughtException = stateCaught_316;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        if (!var5[var1_int + var15]) {
                            statePc = 328;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 323. */
                            {
                                /* Sequential CFG blocks: 323, 325. */
                                {
                                }
                                {
                                    if (var4[var15 + var1_int] != 2) {
                                        statePc = 336;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 326. */
                                        {
                                            statePc = 328;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_322) {
                        statePc = ((Object) stateCaught_322 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_322);
                        }
                        caughtException = stateCaught_322;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        if (!var5[-var1_int + var15]) {
                            statePc = 337;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 329. */
                            {
                                /* Sequential CFG blocks: 329, 331. */
                                {
                                }
                                {
                                    if (var4[var15 - var1_int] != 2) {
                                        statePc = 336;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 332. */
                                        {
                                            /* Sequential CFG blocks: 332, 334. */
                                            {
                                            }
                                            {
                                                statePc = 337;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_328) {
                        statePc = ((Object) stateCaught_328 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_328);
                        }
                        caughtException = stateCaught_328;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        var5[var15] = true;
                        var7[var15] = 2;
                        statePc = 337;
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        statePc = ((Object) stateCaught_336 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_336);
                        }
                        caughtException = stateCaught_336;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        var22++;
                        if (var26 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 338;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        statePc = ((Object) stateCaught_337 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_337);
                        }
                        caughtException = stateCaught_337;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        stackIn_339_0 = var16 + var1_int;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_338) {
                        statePc = ((Object) stateCaught_338 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_338);
                        }
                        caughtException = stateCaught_338;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        var16 = stackIn_339_0;
                        var21++;
                        if (var26 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 342;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        statePc = ((Object) stateCaught_339 instanceof RuntimeException ? 341 : -1);
                        if (statePc == -1) {
                            throw pc.<RuntimeException>$cfr$sneakyThrow(stateCaught_339);
                        }
                        caughtException = stateCaught_339;
                        continue stateLoop;
                    }
                }
                case 341: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw wg.a((Throwable) ((Object) var1), "pc.F(" + param0 + ')');
                }
                case 342: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, pf param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var19 = 0;
        int stackIn_38_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param4 <= 79) {
            return;
          }
          var5_int = vf.b(123, (param0 - param1) * 3);
          var6 = 3 * param1;
          lk.l(74);
          var7 = var5_int - 10;
          if (param3.field_f > 0 &&
            null != param3.field_x) {
            fk.a((byte) -74);
          }
          th.field_Lb = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param3.field_k)))) {
            var9 = param3.field_i[var8];
            var10 = param3.field_P[var8];
            var11 = param3.field_z[var8];
            stackOut_12_0 = param2;
            stackIn_48_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = tb.field_K[var9];
                var13 = lc.field_c[var9];
                var14 = tb.field_K[var10] - var12;
                var15 = -var12 + tb.field_K[var11];
                var16 = lc.field_c[var10] - var13;
                var17 = -var13 + lc.field_c[var11];
              }
              if (!stackIn_13_0 ||
                !(var17 * var14 - var16 * var15 >= 0)) {
                var12Lifetime1 = rb.field_p[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = rb.field_p[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = rb.field_p[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var12Lifetime1 - (-var13Lifetime1 + var6));
                      stackIn_26_0 = -1 + mn.field_a.length;
                      if (var7 >= 0) {
                        stackIn_27_1 = var15 >> var7;
                      } else {
                        stackIn_27_1 = var15 << -var7;
                      }
                      var16 = stackIn_26_0 - stackIn_27_1;
                      var17 = mn.field_a[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_38_0 = var16;
                          if (stackIn_38_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = mn.field_a[var16];
                          continue;
                        }
                        stackIn_38_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_38_0Lifetime1;
                        lh.field_d[var18] = var8;
                        mn.field_a[var16] = 1 + var17;
                        if (param3.field_f > 0 &&
                          null != param3.field_x) {
                          dupTemp$0 = param3.field_x[var8];
                          ke.field_z[dupTemp$0] = ke.field_z[dupTemp$0] + 1;
                        }
                        th.field_Lb = th.field_Lb + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_48_0 = 0;
          }
          if (stackIn_48_0 < param3.field_f &&
            null != param3.field_x) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ke.field_z.length)) {
              var10Lifetime1 = ke.field_z[var9Lifetime1];
              ke.field_z[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("pc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        try {
          ac.a(param1, param0, -1, (String) null);
          if (param2) {
            pc.a(118, 37, true, (pf) null, (byte) -126);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "pc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14088) {
            pc.a(true, true, true);
          }
          stackIn_4_0 = se.field_c.equals(mf.a(false, (CharSequence) ((Object) param1)));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, boolean param2, long param3, java.applet.Applet param4) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          String var6 = null;
          Throwable var6_ref = null;
          RuntimeException var6_ref2 = null;
          String var7 = null;
          try {
            try {
              if (!param2) {
                field_a = false;
              }
              var6 = param4.getParameter("cookiehost");
              var7 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var6;
              if (param3 < 0L) {
                var7 = var7 + "; Discard;";
              }
              if (param3 >= 0L ||
                HostileSpawn.field_I) {
                var7 = var7 + "; Expires=" + dk.a((byte) -41, 1000L * param3 + hn.a((byte) 80)) + "; Max-Age=" + param3;
              }
              a.a(param4, 17467, "document.cookie=\"" + var7 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var6_ref2;
            stackIn_13_1 = new StringBuilder().append("pc.E(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        try {
          field_b = null;
          if (param0 != 1) {
            field_c = -57;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "pc.D(" + param0 + ')');
        }
    }

    static {
        field_a = true;
        field_b = "@";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
