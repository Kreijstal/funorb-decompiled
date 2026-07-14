/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static cn field_a;
    static boolean field_b;
    static String field_c;

    final static int a(String param0, int param1, int[] param2, se param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != wk.field_a) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    wk.field_a = new String[32];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param1 == -1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    field_c = null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var4 = param3.a(param0, param2, wk.field_a);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) caughtException;
                    if ((wk.field_a.length ^ -1) > -1025) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return -1;
                }
                case 8: {
                    wk.field_a = new String[wk.field_a.length << -38778815];
                    statePc = 4;
                    continue stateLoop;
                }
                case 9: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, byte param1) {
        param0 = param0 & 8191;
        if (param1 != 51) {
            return -20;
        }
        if (-4097 >= (param0 ^ -1)) {
            return 6144 > param0 ? -jb.field_Tb[-4096 + param0] : -jb.field_Tb[8192 + -param0];
        }
        return (param0 ^ -1) > -2049 ? jb.field_Tb[param0] : jb.field_Tb[-param0 + 4096];
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -29) {
            oj.a((byte) 67);
        }
        field_c = null;
    }

    final static void a(int param0, mm param1, boolean param2) {
        wj var5 = ac.field_B;
        var5.d((byte) -112, param0);
        var5.field_o = var5.field_o + 1;
        int var4 = var5.field_o;
        var5.a(6, 1);
        if (!param2) {
            field_b = true;
        }
        var5.a(6, param1.field_p);
        var5.f(-65, param1.field_r);
        var5.a((byte) 63, param1.field_i);
        var5.a((byte) 63, param1.field_l);
        var5.a((byte) 63, param1.field_n);
        var5.a((byte) 63, param1.field_o);
        int discarded$0 = var5.c((byte) -106, var4);
        var5.c(-var4 + var5.field_o, -1);
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            int var4 = 0;
            String var5 = null;
            String[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var10 = param0.getParameter("cookieprefix");
                            var4 = -122 / ((param1 - 40) / 53);
                            var3 = var10 + "settings";
                            var5 = (String) ee.a((byte) -21, param0, "getcookies");
                            var6 = ih.a(115, ';', var5);
                            var7 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var7 >= var6.length) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var8 = var6[var7].indexOf('=');
                            if (var8 < 0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var6[var7].substring(0, var8).trim().equals((Object) (Object) var3)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var6[var7].substring(1 + var8).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var7++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2 = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (ql.field_a != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return ql.field_a;
                    }
                    case 13: {
                        return param0.getParameter("settings");
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "An Orb of Mastery takes one week to charge. When finished, its effects will apply to you permanently, but the backlash of power will destroy your dungeon and stable - you must rebuild them!<br><br> Some of your Treasure will survive the blast and can help you shape your new dungeon faster.<br><br>Are you sure you wish to construct an Orb of Mastery now?";
    }
}
