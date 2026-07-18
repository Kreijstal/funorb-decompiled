/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class eq extends ch implements sc {
    static String field_O;
    static int field_W;
    static int field_R;
    static String field_T;
    static eh field_V;
    static dd[] field_Q;
    static String field_N;
    static int field_Y;
    static int field_U;
    static int field_S;
    private sn field_X;
    static String field_P;

    abstract int h(int param0);

    abstract int h(byte param0);

    abstract int j(int param0);

    void a(int param0, sn param1) {
        ((eq) this).field_X = param1;
        if (param0 != -15309) {
            return;
        }
        try {
            ((eq) this).field_X.field_i = (eq) this;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "eq.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j() {
        if (!(ib.field_s == null)) {
            ib.field_s.f();
        }
        if (!(kk.field_D == null)) {
            kk.field_D.f();
        }
    }

    public final ip a(int param0) {
        int var2 = 93 % ((33 - param0) / 34);
        return (ip) (Object) ((eq) this).field_X;
    }

    abstract boolean g(byte param0);

    public static void i(int param0) {
        field_V = null;
        field_O = null;
        field_N = null;
        field_T = null;
        field_Q = null;
        field_P = null;
    }

    eq(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void i() {
        int var1 = 0;
        L0: {
          s.field_c = new ob[25];
          ob discarded$24 = new ob(cl.field_m, 0, 180, 460, 160, 24, new int[10]);
          be discarded$25 = new be(14, 180, 460, 160, 24, rq.field_B);
          pa discarded$26 = new pa(lq.field_Q, 2, 180, 460, 160, 24, new int[3]);
          jo discarded$27 = new jo((dd) null, 3, 180, 460, 160, 24, ad.field_o);
          jo discarded$28 = new jo((dd) null, 8, 180, 460, 160, 24, e.field_d);
          jo discarded$29 = new jo((dd) null, 9, 180, 460, 160, 24, v.field_f);
          jo discarded$30 = new jo((dd) null, 24, 180, 460, 160, 24, og.field_J);
          jo discarded$31 = new jo((dd) null, 10, 180, 460, 160, 24, bl.field_r);
          jo discarded$32 = new jo((dd) null, 11, 180, 460, 160, 24, tl.field_L);
          jo discarded$33 = new jo((dd) null, 12, 180, 460, 160, 24, ob.field_m);
          lb discarded$34 = new lb((dd) null, 23, 180, 460, 160, 24, new int[2]);
          jo discarded$35 = new jo((dd) null, 22, 180, 460, 160, 24, new int[9]);
          em discarded$36 = new em(16, 180, 460, 410, 24, new int[2]);
          tl discarded$37 = new tl(15, 180, 460, 410, 24, new int[2]);
          b discarded$38 = new b(13, 70, 460, 400, 24, new int[3]);
          el discarded$39 = new el(17, 180, 460, 400, 24, new int[2]);
          el discarded$40 = new el(18, 180, 460, 400, 24, new int[2]);
          br discarded$41 = new br(19, 180, 460, 400, 24, new int[2]);
          pj discarded$42 = new pj(20, 290, 460, 400, 24, new int[1]);
          var1 = 1;
          hd discarded$43 = new hd(21, 180, 460, 160, 24, new int[0]);
          cm discarded$44 = new cm(6, 180, 460, 160, 24, new int[9]);
          sg discarded$45 = new sg(7, 180, 460, 160, 24, new int[6]);
          og discarded$46 = new og(df.field_i, 1, 180, 460, 160, 24, new int[4]);
          pq.field_H = mc.field_e.b(nk.field_f[20]) - -10;
          var1 = 10 + mc.field_e.b(nk.field_f[21]);
          if (pq.field_H < var1) {
            pq.field_H = var1;
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$47 = -104;
        jo.f();
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_7_0 = null;
            String stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            String stackOut_6_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var8 = param0.getParameter("cookieprefix");
                            if (param1 > 110) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_U = 74;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3 = var8 + "settings";
                            var4 = (String) mo.a((byte) 124, "getcookies", param0);
                            var5 = jc.a(30634, var4, ';');
                            var6 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (0 > var7) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (ar.field_g != null) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            return param0.getParameter("settings");
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ar.field_g;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_15_0 = (RuntimeException) var2_ref;
                        stackOut_15_1 = new StringBuilder().append("eq.H(");
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param0 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
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
        field_O = "Offer draw";
        field_V = null;
        field_W = -1;
        field_N = "The key rule of nine-ball pool is that you must always hit the lowest numbered ball on the table first. Try this now, the ball you should be aiming for is indicated in the top-left corner.";
        field_T = "Rating";
        field_P = "Buying or selling an account";
    }
}
