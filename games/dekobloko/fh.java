/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static String field_b;
    static int[] field_a;
    static int field_h;
    static i field_e;
    static int field_f;
    static w field_g;
    static ud field_c;
    static w field_d;

    final static void a(int param0, int param1, boolean param2, int param3) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        int[] var16 = null;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4_int = 320;
                        var5 = 490;
                        var6 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 >= rb.field_n.length) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = rb.field_n[var6] >> 1058191496 & 255;
                        var8 = 255 & rb.field_n[var6] >> -496612168;
                        var9 = (2048 * var7 >> -208576440) - -(bb.field_f * (1 + var8) >> -1499643386);
                        var10 = rb.field_n[var6] >> -226715728 & 255;
                        var11 = 255 & rb.field_n[var6];
                        var12 = ke.a(2047, var9) >> -200783770;
                        var13 = h.a(var9, (byte) -122) >> -1071707034;
                        var14 = ke.a(2047, var11 + var9) >> -1246657338;
                        var15 = h.a(var9 + var11, (byte) -122) >> -1683979834;
                        var16 = new int[]{var4_int + param3, param0 - -var5, var12 + param3, param0 + var13, param3 - -var14, var15 + param0};
                        if (var17 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (256 == param1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ok.a(var16, 16777215, var10 * 256 >> 431644137);
                        if (var17 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ok.a(var16, 16777215, var10);
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
                        ok.a(var16, 16777215, var10);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6++;
                        if (var17 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var4), "fh.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(byte param0) {
        s.g((byte) -115);
        if (param0 > -122) {
            fh.a(-67);
        }
    }

    final static void a(byte param0, cl param1, int param2) {
        uf var3 = null;
        try {
            var3 = we.field_b;
            int var4 = -58 / ((param0 - 59) / 33);
            var3.f(param2, -4);
            var3.a(true, param1.field_q);
            var3.a(true, param1.field_z);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 114 % ((param0 - 70) / 46);
        if (0 == (sm.field_e ^ -1)) {
            if (!pe.b(25973, 1)) {
                return false;
            }
            sm.field_e = de.field_V.d((byte) -64);
            de.field_V.field_n = 0;
        }
        if (!(sm.field_e != -2)) {
            if (!(pe.b(25973, 2))) {
                return false;
            }
            sm.field_e = de.field_V.e(3);
            de.field_V.field_n = 0;
        }
        return pe.b(25973, sm.field_e);
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_g = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!uk.a(-22802)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (cl.field_v == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!cl.field_v.field_e) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        sn.a(false);
                        u.field_i.a((byte) -105, new ib(u.field_i, kl.field_p));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var1_int = -26 % ((param0 - 37) / 58);
                        u.field_i.a(jd.field_Yb, true, ab.field_f, 29166);
                        u.field_i.g(0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!ab.c((byte) 50)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        u.field_i.a(wh.field_c, el.field_G, (byte) 121);
                        if (var2 == 0) {
                            statePc = 11;
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
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "fh.E(" + param0 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "<%0> WINS!";
        field_e = new i();
    }
}
