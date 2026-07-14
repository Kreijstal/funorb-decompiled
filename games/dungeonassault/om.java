/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    static qk field_d;
    static int field_a;
    static cf field_b;
    static java.math.BigInteger field_c;
    static String field_e;

    final static cd a(boolean param0) {
        if (!param0) {
          boolean discarded$2 = om.b(-113);
          return new cd(co.e((byte) 92), f.a((byte) -75));
        } else {
          return new cd(co.e((byte) 92), f.a((byte) -75));
        }
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
                        var7 = DungeonAssault.field_K;
                        if (mm.field_k) {
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
                            if (param1 == 2) {
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
                            field_e = null;
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
                            var2 = "tuhstatbut";
                            var3 = (String) ee.a((byte) -21, param0, "getcookies");
                            var4 = ih.a(param1 + 121, ';', var3);
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
                            if (var4.length <= var5) {
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
                            if (-1 < (var6 ^ -1)) {
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

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = 99 % ((param0 - -84) / 34);
        field_d = null;
    }

    final static boolean b(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (!(bl.field_j == null)) {
            return true;
        }
        if (!(hj.field_Z.a(false, "benefits"))) {
            return false;
        }
        bl.field_j = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_borders");
        rj.field_s = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_price");
        int var1 = -103 / ((param0 - 15) / 37);
        sh.field_a = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_logo");
        g.field_Gb = new cn[4];
        g.field_Gb[0] = rc.a("", sb.field_a, "mb_da_thumbs_01.jpg", (byte) 71);
        g.field_Gb[1] = rc.a("", sb.field_a, "mb_da_thumbs_02.jpg", (byte) 71);
        g.field_Gb[2] = rc.a("", sb.field_a, "mb_da_thumbs_06.jpg", (byte) 71);
        g.field_Gb[3] = rc.a("", sb.field_a, "mb_da_thumbs_05.jpg", (byte) 71);
        for (var2 = g.field_Gb.length + -1; (var2 ^ -1) <= -1; var2--) {
            g.field_Gb[var2].h();
        }
        bp.a(bl.field_j, (byte) 51, ba.field_h);
        eg.a(80, 15, 16744576, 40, 5, rj.field_s, 2, 40, -2400, (se) (Object) ne.field_c, 80);
        ib.a(-4, g.field_Gb);
        wa.a(123, sh.field_a);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new java.math.BigInteger("65537");
        field_e = "This incorporeal entity is imbued with dark magic; its glowing red eyes wait to drink in the souls of raiders.<br><br>Defeated raiders permanently lose 2 <%attack>.";
    }
}
