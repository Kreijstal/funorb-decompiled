/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
            field_d = -91;
        }
    }

    final int a(int param0, boolean param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = param1 ? 1 : 0;
                        var7 = param3.length();
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var7 ^ -1) >= (var8 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = param3.charAt(var8);
                        stackIn_14_0 = var9;
                        stackIn_4_0 = stackIn_14_0;
                        stackIn_14_1 = 60;
                        stackIn_4_1 = stackIn_14_1;
                        if (var10 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 6;
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
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (62 != var9) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 != 0) {
                            statePc = 12;
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
                        if (var9 == 32) {
                            statePc = 11;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 2;
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
                        stackIn_14_0 = -1;
                        stackIn_14_1 = var5_int ^ -1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 <= stackIn_14_1) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (-param2 + param0 << -796485304) / var5_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var5);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("ve.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param3 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_103_0 = 0;
            int stackIn_106_0 = 0;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            String stackIn_110_2 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            String stackIn_113_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            CharSequence var11 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != jc.field_b) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!dg.a(param3, true)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackIn_5_0 = -1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0;
                    }
                    case 6: {
                        try {
                            if (uf.field_m == ae.field_E) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param3) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            fa.field_b = fj.a(param0, param4, false, param1 ^ 118);
                            if (var9 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            fa.field_b = ef.a(rc.field_f, param1 ^ 27988, (String) null, false, param0);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ed.field_q.field_h = 0;
                            ed.field_q.c(14, param1 + 24);
                            ed.field_q.c(fa.field_b.a((byte) 45).field_b, -1);
                            kc.a(-1, -1);
                            uf.field_m = rb.field_d;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (uf.field_m == rb.field_d) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (!a.b(1, 10343)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6_int = ig.field_a.d(true);
                            ig.field_a.field_h = 0;
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            pg.field_d = var6_int;
                            a.field_c = -1;
                            uf.field_m = uh.field_l;
                            if (var9 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            uf.field_m = kf.field_z;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param1 == -25) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            stackIn_22_0 = 43;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return stackIn_22_0;
                    }
                    case 23: {
                        try {
                            if (kf.field_z != uf.field_m) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (!a.b(8, 10343)) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ti.field_M = ig.field_a.f((byte) 49);
                            ig.field_a.field_h = 0;
                            ri.a(param2, param3, fa.field_b, (byte) -82, param5);
                            uf.field_m = he.field_h;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (uf.field_m != he.field_h) {
                                statePc = 35;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (!a.b(1, 10343)) {
                                statePc = 35;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var6_int = ig.field_a.d(true);
                            ig.field_a.field_h = 0;
                            pg.field_d = var6_int;
                            og.field_b = null;
                            if (0 == var6_int) {
                                statePc = 34;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 34;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (8 != var6_int) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ck.b((byte) -30);
                            fb.field_p = false;
                            stackIn_32_0 = var6_int;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            a.field_c = -1;
                            uf.field_m = uh.field_l;
                            if (var9 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            a.field_c = -1;
                            uf.field_m = ug.field_q;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (uf.field_m == ug.field_q) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (!dc.d(param1 ^ -27)) {
                                statePc = 83;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            rc.field_f = ig.field_a.f((byte) -110);
                            vb.field_i = ig.field_a.d(true);
                            ig.field_a.d(true);
                            jd.field_c = ig.field_a.b(param1 + -1698573631);
                            var6 = ig.field_a.e((byte) -90);
                            var7 = ig.field_a.d(true);
                            if ((1 & var7 ^ -1) != -1) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            fg.a((byte) 120);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (param3) {
                                statePc = 49;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (-1 == (var7 & 4 ^ -1)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackIn_45_0 = 1;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackIn_45_0 = 0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            jl.field_c = stackIn_45_0 != 0;
                            if ((8 & var7) == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackIn_48_0 = 1;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_48_0 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ul.field_k = stackIn_48_0 != 0;
                            if (ul.field_k) {
                                statePc = 49;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (!qb.field_c) {
                                statePc = 55;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ig.field_a.d(true);
                            ig.field_a.d(true);
                            ig.field_a.d((byte) 19);
                            ef.field_f = ig.field_a.b(-1698573656);
                            kc.field_d = new byte[ef.field_f];
                            var8 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (ef.field_f <= var8) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            kc.field_d[var8] = ig.field_a.e(true);
                            var8++;
                            if (var9 != 0) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var9 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            og.field_c = ig.field_a.c(false);
                            var11 = (CharSequence) ((Object) og.field_c);
                            cb.field_t = ck.a(var11, (byte) -48);
                            be.field_l = ig.field_a.d(true);
                            uf.field_m = gg.field_b;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (fa.field_b.a((byte) 45) == jf.field_M) {
                                statePc = 60;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (fa.field_b.a((byte) 45) != ej.field_a) {
                                statePc = 61;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            mh.field_B.a(kk.c(-14047), 4096);
                            if (var9 == 0) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            bb.field_J.a(kk.c(-14047), 4096);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            fb.field_p = false;
                            if (var6 != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ee.a(var6, -11971, kk.c(-14047));
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (0 < jd.field_c) {
                                statePc = 70;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (jl.field_c) {
                                statePc = 70;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            oa.a(true, kk.c(-14047), "unzap");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 73;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            oa.a(kk.c(-14047), 22347, "zap", new Object[]{jd.a(rc.field_f, param1 + 62)});
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (jd.field_c <= 0) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            hl.field_F = true;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ed.field_q.a(l.field_F, param1 ^ -48);
                            var8 = 0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (-5 >= (var8 ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            l.field_F[var8] = l.field_F[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ig.field_a.a(l.field_F, 16);
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackIn_82_0 = pg.field_d;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        return stackIn_82_0;
                    }
                    case 83: {
                        try {
                            if (uf.field_m != uh.field_l) {
                                statePc = 96;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (dc.d(param1 + 27)) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ck.b((byte) -96);
                            if (7 != pg.field_d) {
                                statePc = 89;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (!fb.field_p) {
                                statePc = 94;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (pg.field_d == 7) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            pg.field_d = 3;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            wj.field_p = ig.field_a.c(false);
                            fb.field_p = false;
                            stackIn_93_0 = pg.field_d;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        return stackIn_93_0;
                    }
                    case 94: {
                        try {
                            fb.field_p = true;
                            stackIn_95_0 = -1;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        return stackIn_95_0;
                    }
                    case 96: {
                        try {
                            if (jc.field_b != null) {
                                statePc = 105;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (!fb.field_p) {
                                statePc = 104;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (-30001L <= (vl.b(-92) ^ -1L)) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            wj.field_p = nk.field_t;
                            if (var9 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            wj.field_p = sa.field_h;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            fb.field_p = false;
                            stackIn_103_0 = 3;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        return stackIn_103_0;
                    }
                    case 104: {
                        try {
                            var6_int = nj.field_a;
                            nj.field_a = mg.field_y;
                            fb.field_p = true;
                            mg.field_y = var6_int;
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
                            stackIn_106_0 = -1;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        return stackIn_106_0;
                    }
                    case 107: {
                        var6_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_109_0 = (RuntimeException) (var6_ref);
                        stackIn_108_0 = stackIn_109_0;
                        stackIn_109_1 = new StringBuilder().append("ve.G(");
                        stackIn_108_1 = stackIn_109_1;
                        if (param0 == null) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    }
                    case 108: {
                        stackIn_110_0 = (RuntimeException) ((Object) stackIn_108_0);
                        stackIn_110_1 = (StringBuilder) ((Object) stackIn_108_1);
                        stackIn_110_2 = "{...}";
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 109: {
                        stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                        stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                        stackIn_110_2 = "null";
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 110: {
                        stackIn_112_0 = (RuntimeException) ((Object) stackIn_110_0);
                        stackIn_111_0 = stackIn_112_0;
                        stackIn_112_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                        stackIn_111_1 = stackIn_112_1;
                        if (param4 == null) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    }
                    case 111: {
                        stackIn_113_0 = (RuntimeException) ((Object) stackIn_111_0);
                        stackIn_113_1 = (StringBuilder) ((Object) stackIn_111_1);
                        stackIn_113_2 = "{...}";
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 112: {
                        stackIn_113_0 = (RuntimeException) ((Object) stackIn_112_0);
                        stackIn_113_1 = (StringBuilder) ((Object) stackIn_112_1);
                        stackIn_113_2 = "null";
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        throw ld.a((Throwable) ((Object) stackIn_113_0), stackIn_113_2 + ',' + param5 + ')');
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

    final int a(byte param0) {
        int var2;
        rj[] var3;
        int var4;
        rj var5;
        int var6;
        int var7;
        L0: {
          L1: {
            var7 = Lexicominos.field_L ? 1 : 0;
            var2 = -1;
            if (this.field_c != null) {
              var3 = this.field_c;
              var4 = 0;
              L2: while (true) {
                if ((var3.length ^ -1) >= (var4 ^ -1)) {
                  break L1;
                } else {
                  var5 = var3[var4];
                  if (var7 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        var6 = var5.a((byte) 103);
                        if ((var2 ^ -1) <= (var6 ^ -1)) {
                          break L3;
                        } else {
                          var2 = var6;
                          break L3;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 == 94) {
            break L0;
          } else {
            ve.a(true);
            break L0;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int stackIn_22_0 = 0;
        int var4;
        int var5;
        rj var6;
        int var7;
        int var8;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (null == this.field_c) {
            break L0;
          } else {
            if ((this.field_c.length ^ -1) == -1) {
              break L0;
            } else {
              if ((param2 ^ -1) <= (this.field_c[0].field_d ^ -1)) {
                L1: {
                  if (param1 <= -97) {
                    break L1;
                  } else {
                    this.a((byte) -5, -94);
                    break L1;
                  }
                }
                if ((this.field_c[this.field_c.length - 1].field_c ^ -1) <= (param2 ^ -1)) {
                  if (-2 != (this.field_c.length ^ -1)) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (this.field_c.length <= var5) {
                            break L4;
                          } else {
                            var6 = this.field_c[var5];
                            stackIn_22_0 = var6.field_d ^ -1;

                            if (var8 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_22_0 < (param2 ^ -1)) {
                                  break L5;
                                } else {
                                  if (param2 <= var6.field_c) {
                                    var7 = var6.a(param0, (byte) -100);
                                    if (0 != (var7 ^ -1)) {
                                      return var7 + var4;
                                    } else {
                                      return -1;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var4 = var4 + (-1 + var6.field_a.length);
                              var5++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackIn_22_0 = -1;
                        break L3;
                      }
                      return stackIn_22_0;
                    }
                  } else {
                    return this.field_c[0].a(param0, (byte) -100);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_c == null) {
                break L1;
              } else {
                if (this.field_c.length <= 0) {
                  break L1;
                } else {
                  stackIn_6_0 = -this.field_c[0].field_d + this.field_c[-1 + this.field_c.length].field_c;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 36;
        }
    }

    final int a(int param0, int param1) {
        int var3;
        rj var4;
        int var5;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var3 ^ -1) <= (this.field_c.length ^ -1)) {
                break L2;
              } else {
                var4 = this.field_c[var3];
                stackIn_7_0 = var4.field_a.length;

                stackIn_7_1 = param1;

                if (var5 != 0) {
                  break L1;
                } else {
                  if (stackIn_7_0 <= stackIn_7_1) {
                    param1 = param1 - (var4.field_a.length + -1);
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            }
            stackIn_7_0 = param0;
            stackIn_7_1 = 28276;
            break L1;
          }
          L3: {
            if (stackIn_7_0 == stackIn_7_1) {
              break L3;
            } else {
              this.a(73, (byte) 15, -124);
              break L3;
            }
          }
          return this.field_c.length;
        }
    }

    final int a(byte param0, int param1) {
        rj[] var3;
        int var4;
        rj var5;
        int var6;
        rj[] var7;
        int stackIn_9_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        if (param0 <= -108) {
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if ((var4 ^ -1) <= (var7.length ^ -1)) {
                  break L2;
                } else {
                  var5 = var7[var4];
                  stackIn_9_0 = var5.field_a.length ^ -1;

                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (stackIn_9_0 >= (param1 ^ -1)) {
                      param1 = param1 - (var5.field_a.length + -1);
                      var4++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return var5.field_a[param1];
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              break L1;
            }
            return stackIn_9_0;
          }
        } else {
          return 107;
        }
    }

    final static String b(int param0) {
        if (!(bk.field_c != ca.field_i)) {
            return Lexicominos.field_H;
        }
        if (!qa.field_c.b(param0 ^ 25590)) {
            return qa.field_c.a(false);
        }
        if (param0 != 25594) {
            return (String) null;
        }
        if (!(ca.field_i != ee.field_c)) {
            return qa.field_c.a(false);
        }
        return dd.field_d;
    }

    static {
        field_e = new dg();
        field_b = new String[]{"The dictionaries used by Lexicominos have been compiled with reference to multiple independent sources.", "Certain words, which may offend some players, have been omitted, as have all words shorter than 3 letters or longer than 8."};
        field_a = true;
    }
}
