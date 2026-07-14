/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends l {
    static int field_h;
    private r field_f;
    static String field_e;
    static int field_g;

    final l b(byte param0) {
        if (param0 != -90) {
            return null;
        }
        return (l) (Object) new fe(((hl) this).field_f);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = CrazyCrystals.field_B;
                        if (wg.field_P) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) hi.a(param0, "getcookies", 16);
                            var4 = ik.a(var3, (byte) -76, ';');
                            if (param1 <= -39) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            uf discarded$2 = hl.a(-13, true);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = 0;
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
                            if (var5 >= var4.length) {
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
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param0.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    final l a(int param0) {
        jj.field_b = jj.field_b + 16;
        if (!(jj.field_b >= 0)) {
            return (l) this;
        }
        if (param0 != -2) {
            ((hl) this).field_f = null;
        }
        jj.field_b = 0;
        return (l) (Object) new o(30, (l) (Object) new fe(((hl) this).field_f));
    }

    final static uf a(int param0, boolean param1) {
        md var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Object var8 = null;
        md var9 = null;
        mp var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = CrazyCrystals.field_B;
                    var9 = kd.field_n;
                    var2 = var9;
                    var3 = var9.h(255);
                    lj.field_b = var3 & 127;
                    if ((128 & var3) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    om.field_u = stackIn_3_0 != 0;
                    dd.field_b = var9.h(255);
                    vf.field_d = var9.d(true);
                    if ((lj.field_b ^ -1) == -3) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    na.field_kb = 0;
                    ca.field_m = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    na.field_kb = var9.c((byte) -7);
                    ca.field_m = var9.b(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var9.h(255) ^ -1) != -2) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    pc.field_w = var9.i(110);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    md.field_s = var9.i(121);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    md.field_s = pc.field_w;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param0 == 16) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8 = null;
                    boolean discarded$5 = hl.a((java.applet.Applet) null, 102);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == lj.field_b) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-5 != lj.field_b) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$6 = var9.c((byte) -7);
                    String discarded$7 = var9.i(111);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$8 = var9.c((byte) -7);
                    String discarded$9 = var9.i(111);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param1) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var9.c((byte) -7);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var10 = bn.field_g.a(127, var5);
                        fb.field_b = var10.e(60);
                        if (md.field_s.equals((Object) (Object) je.field_g)) {
                            statePc = 23;
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
                        stackOut_22_0 = var10.field_o;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
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
                        so.field_f = stackIn_24_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    wp.a((Throwable) (Object) var6, "CC1", 21862);
                    fb.field_b = null;
                    so.field_f = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    fb.field_b = s.a((ng) (Object) var9, 116, 80);
                    so.field_f = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return new uf(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 25648) {
            Object var2 = null;
            boolean discarded$0 = hl.a((java.applet.Applet) null, -82);
        }
    }

    hl(r param0) {
        ((hl) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is a hole.<br><br>Watch out! You can fall<br>into holes - unless they<br>have been filled.";
        field_g = 0;
    }
}
