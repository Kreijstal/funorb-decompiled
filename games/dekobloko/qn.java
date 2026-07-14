/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends t {
    private boolean field_qb;
    private r field_ob;
    private String field_kb;
    private String field_mb;
    static int field_lb;
    static String field_pb;
    private boolean field_nb;
    static String field_rb;

    final static vj a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vj var8 = new vj();
        uk var9 = new uk();
        var9.field_n = 10000;
        var9.field_A = param5;
        var9.field_q = new pi[param0 * param5];
        var9.field_r = param2;
        var9.field_w = param4;
        var9.field_u = param1;
        var9.field_t = param0;
        var9.field_v = param6;
        var8.a((bh) (Object) var9, 2777);
        int var10 = -11 / ((param7 - 10) / 35);
        var9.b(11976, param3);
        return var8;
    }

    qn(ka param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((qn) this).field_kb = param1;
        if (((qn) this).field_kb != null) {
            var3 = ec.field_p.b(((qn) this).field_kb, 260, ec.field_p.field_R);
            ((qn) this).a(112, 300, var3 + 150);
        }
        ((qn) this).field_ob = new r(13, 50, 274, 30, 15, 2113632, 4210752);
        ((qn) this).field_nb = false;
        ((qn) this).field_ob.field_L = true;
        ((qn) this).field_qb = false;
        ((qn) this).b((ce) (Object) ((qn) this).field_ob, (byte) -55);
    }

    public static void n(byte param0) {
        field_pb = null;
        if (param0 <= 60) {
            Object var2 = null;
            qn.a((ck) null, (ck) null, (byte) -20);
        }
        field_rb = null;
    }

    final static void c(int param0, int param1) {
        int var3 = client.field_A ? 1 : 0;
        if (param0 != -20494) {
            field_pb = null;
        }
        ug var4 = (ug) (Object) qi.field_Q.c((byte) 125);
        ug var2 = (ug) (Object) qi.field_Q.c((byte) 125);
        while (var4 != null) {
            in.a(var4, (byte) -70, param1);
            ug var2_ref = (ug) (Object) qi.field_Q.d(true);
        }
    }

    final void m(byte param0) {
        ((qn) this).field_ob.field_L = false;
        ((qn) this).field_nb = true;
        if (param0 < 75) {
            ((qn) this).m((byte) -99);
        }
    }

    final static void a(ck param0, ck param1, byte param2) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var5 = 0.0f;
        float var3 = 0.0f;
        int var15 = 0;
        int var16 = client.field_A ? 1 : 0;
        float var4 = 1.0f;
        int var6 = param1.field_I;
        int var7 = param1.field_H;
        int[] var20 = param1.field_D;
        int[] var21 = param0.field_D;
        int var10 = 0;
        if (param2 > -73) {
            Object var17 = null;
            qn.a((ck) null, (ck) null, (byte) 15);
        }
        for (var11 = 0; var7 > var11; var11++) {
            for (var12 = 0; var6 > var12; var12++) {
                var13 = 255 & var20[var10];
                var14 = var12 + var11 - -(var13 / 5) - -uf.field_A & 127;
                var5 = (float)var13 / 255.0f;
                var3 = (float)var14 / 128.0f;
                var15 = nm.a(var3, var5, false, var4);
                var21[var10] = var15;
                var10++;
            }
        }
    }

    final static void a(int param0, fd param1, int param2, wl param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            kl var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = client.field_A ? 1 : 0;
                        var18 = new kl();
                        var18.field_o = param3.d((byte) -116);
                        var18.field_C = param3.i(7553);
                        var18.field_q = new int[var18.field_o];
                        var18.field_A = new int[var18.field_o];
                        var18.field_s = new byte[var18.field_o][][];
                        var18.field_y = new mh[var18.field_o];
                        var18.field_u = new int[var18.field_o];
                        var18.field_t = new mh[var18.field_o];
                        var5 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (var5 >= var18.field_o) {
                            statePc = 29;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var6_int = param3.d((byte) -21);
                            if (0 == var6_int) {
                                statePc = 19;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof ClassNotFoundException ? 24 : (stateCaught_2 instanceof SecurityException ? 25 : (stateCaught_2 instanceof NullPointerException ? 26 : (stateCaught_2 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var6_int == -2) {
                                statePc = 19;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof ClassNotFoundException ? 24 : (stateCaught_3 instanceof SecurityException ? 25 : (stateCaught_3 instanceof NullPointerException ? 26 : (stateCaught_3 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (-3 == var6_int) {
                                statePc = 19;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof ClassNotFoundException ? 24 : (stateCaught_4 instanceof SecurityException ? 25 : (stateCaught_4 instanceof NullPointerException ? 26 : (stateCaught_4 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ClassNotFoundException ? 24 : (stateCaught_5 instanceof SecurityException ? 25 : (stateCaught_5 instanceof NullPointerException ? 26 : (stateCaught_5 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (4 == var6_int) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ClassNotFoundException ? 24 : (stateCaught_6 instanceof SecurityException ? 25 : (stateCaught_6 instanceof NullPointerException ? 26 : (stateCaught_6 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof ClassNotFoundException ? 24 : (stateCaught_7 instanceof SecurityException ? 25 : (stateCaught_7 instanceof NullPointerException ? 26 : (stateCaught_7 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var20 = param3.c((byte) -38);
                            var8 = param3.c((byte) -38);
                            var9 = param3.d((byte) -72);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof ClassNotFoundException ? 24 : (stateCaught_8 instanceof SecurityException ? 25 : (stateCaught_8 instanceof NullPointerException ? 26 : (stateCaught_8 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var11_int >= var9) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof ClassNotFoundException ? 24 : (stateCaught_9 instanceof SecurityException ? 25 : (stateCaught_9 instanceof NullPointerException ? 26 : (stateCaught_9 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var10[var11_int] = param3.c((byte) -38);
                            var11_int++;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof ClassNotFoundException ? 24 : (stateCaught_10 instanceof SecurityException ? 25 : (stateCaught_10 instanceof NullPointerException ? 26 : (stateCaught_10 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var23 = new byte[var9][];
                            var22 = var23;
                            var21 = var22;
                            var19 = var21;
                            var11 = var19;
                            if (-4 != (var6_int ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof ClassNotFoundException ? 24 : (stateCaught_11 instanceof SecurityException ? 25 : (stateCaught_11 instanceof NullPointerException ? 26 : (stateCaught_11 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var12_int = 0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof ClassNotFoundException ? 24 : (stateCaught_12 instanceof SecurityException ? 25 : (stateCaught_12 instanceof NullPointerException ? 26 : (stateCaught_12 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof ClassNotFoundException ? 24 : (stateCaught_13 instanceof SecurityException ? 25 : (stateCaught_13 instanceof NullPointerException ? 26 : (stateCaught_13 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var13 = param3.i(7553);
                            var11[var12_int] = new byte[var13];
                            param3.a(var23[var12_int], 0, (byte) 127, var13);
                            var12_int++;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ClassNotFoundException ? 24 : (stateCaught_14 instanceof SecurityException ? 25 : (stateCaught_14 instanceof NullPointerException ? 26 : (stateCaught_14 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var18.field_u[var5] = var6_int;
                            var12 = new Class[var9];
                            var17 = 0;
                            var13 = var17;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ClassNotFoundException ? 24 : (stateCaught_15 instanceof SecurityException ? 25 : (stateCaught_15 instanceof NullPointerException ? 26 : (stateCaught_15 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var9 <= var17) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ClassNotFoundException ? 24 : (stateCaught_16 instanceof SecurityException ? 25 : (stateCaught_16 instanceof NullPointerException ? 26 : (stateCaught_16 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var12[var17] = cg.a(var10[var17], (byte) -122);
                            var17++;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ClassNotFoundException ? 24 : (stateCaught_17 instanceof SecurityException ? 25 : (stateCaught_17 instanceof NullPointerException ? 26 : (stateCaught_17 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var18.field_t[var5] = param1.a(-10962, var8, cg.a(var20, (byte) -108), var12);
                            var18.field_s[var5] = var23;
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ClassNotFoundException ? 24 : (stateCaught_18 instanceof SecurityException ? 25 : (stateCaught_18 instanceof NullPointerException ? 26 : (stateCaught_18 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var16 = param3.c((byte) -38);
                            var15 = param3.c((byte) -38);
                            var8 = param3.c((byte) -38);
                            var9 = 0;
                            if (1 == var6_int) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ClassNotFoundException ? 24 : (stateCaught_19 instanceof SecurityException ? 25 : (stateCaught_19 instanceof NullPointerException ? 26 : (stateCaught_19 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ClassNotFoundException ? 24 : (stateCaught_20 instanceof SecurityException ? 25 : (stateCaught_20 instanceof NullPointerException ? 26 : (stateCaught_20 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var9 = param3.i(7553);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ClassNotFoundException ? 24 : (stateCaught_21 instanceof SecurityException ? 25 : (stateCaught_21 instanceof NullPointerException ? 26 : (stateCaught_21 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var18.field_u[var5] = var6_int;
                            var18.field_q[var5] = var9;
                            var18.field_y[var5] = param1.a(false, var15, cg.a(var16, (byte) 9));
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ClassNotFoundException ? 24 : (stateCaught_22 instanceof SecurityException ? 25 : (stateCaught_22 instanceof NullPointerException ? 26 : (stateCaught_22 instanceof Exception ? 27 : 28))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        var18.field_A[var5] = -1;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 25: {
                        var6_ref = (SecurityException) (Object) caughtException;
                        var18.field_A[var5] = -2;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 26: {
                        var6_ref2 = (NullPointerException) (Object) caughtException;
                        var18.field_A[var5] = -3;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 27: {
                        var6_ref3 = (Exception) (Object) caughtException;
                        var18.field_A[var5] = -4;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 28: {
                        var6_ref4 = caughtException;
                        var18.field_A[var5] = -5;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 29: {
                        if (param2 == 4210752) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        field_pb = null;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        aa.field_f.a((bh) (Object) var18, 2777);
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

    final void a(boolean param0, float param1, int param2, String param3) {
        if ((!param0 ? 1 : 0) == (((qn) this).field_qb ? 1 : 0)) {
            ((qn) this).field_qb = param0 ? true : false;
            if (!((qn) this).field_qb) {
                ((qn) this).field_ob.a(4210752, 4088, 2113632);
                // ifeq L94
                ((qn) this).field_ob.field_L = false;
            } else {
                ((qn) this).field_ob.a(4210752, 4088, 8405024);
                ((qn) this).field_ob.field_L = true;
            }
        }
        if (param2 != 4210752) {
            qn.l(68);
        }
        ((qn) this).field_ob.field_Q = (int)(param1 / 100.0f * 65536.0f);
        ((qn) this).field_mb = param3;
    }

    final void b(int param0, int param1, int param2) {
        super.b(-128, param1, param2);
        ec.field_p.b(((qn) this).field_mb, (((qn) this).field_t >> -544182591) + param2, 103 + param1, 16777215, -1);
        if (param0 >= -127) {
            return;
        }
        if (null != ((qn) this).field_kb) {
            hk.a(param2 - -20, param1 - -113, 260, 8421504);
            int discarded$0 = ec.field_p.a(((qn) this).field_kb, param2 - -20, 128 + param1, 260, 100, 16777215, -1, 1, 0, ec.field_p.field_R);
        }
    }

    final static void l(int param0) {
        if (jh.field_h) {
            pf.a(false);
        }
        if (param0 != 13) {
            field_rb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = "This game has started.";
        field_rb = "Log in / Create account";
    }
}
