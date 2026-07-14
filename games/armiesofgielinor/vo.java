/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo implements Runnable {
    static String field_h;
    static String field_e;
    static String[] field_f;
    static wk field_d;
    private ui field_g;
    private boolean field_a;
    int field_b;
    private Thread field_c;

    final static int a(byte param0, String param1, String param2, boolean param3, int param4, int param5, String param6) {
        if (param0 != -46) {
            return -51;
        }
        gl var7 = new gl(param1);
        gl var8 = new gl(param2);
        return uq.a(param6, var7, -20032, param5, param4, var8, param3);
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            nh var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((vo) this).field_a) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((vo) this).field_g;
                        // monitorenter ((vo) this).field_g
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (nh) (Object) ((vo) this).field_g.b(11);
                            if (var7 == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((vo) this).field_b = ((vo) this).field_b - 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((vo) this).field_g).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if ((var7.field_L ^ -1) != -3) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            boolean discarded$1 = var7.field_C.a(83, var7.field_F.length, var7.field_F, (int)var7.field_q);
                            var7.field_x = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var7.field_L == 3) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_x = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var7.field_F = var7.field_C.a(0, (int)var7.field_q);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        af.a((Throwable) (Object) var2_ref, -98, (String) null);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_x = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 22: {
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

    final nh a(byte param0, int param1, bc param2) {
        nh var4 = new nh();
        if (param0 != 56) {
            vo.a(50, 66, -33, 75, 23, -84, true);
        }
        var4.field_z = false;
        var4.field_C = param2;
        var4.field_L = 3;
        var4.field_q = (long)param1;
        this.a((byte) -105, var4);
        return var4;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 33 / ((19 - param0) / 63);
        var4 = 0;
        var5 = rk.field_r;
        L0: while (true) {
          if (var4 >= nb.field_h.length) {
            return -1;
          } else {
            var6 = cj.field_k[var4];
            if (var6 < 0) {
              var5 = var5 + cn.field_o;
              var4++;
              continue L0;
            } else {
              var7 = lp.a(nb.field_h[var4], true, false);
              var5 = var5 + ar.field_w;
              var8 = bt.field_g - (var7 >> 16959969);
              if (!mu.a(param2, jg.field_k + (rd.field_b << -324593727), param1, -df.field_E + var8, 5138823, (df.field_E << -1400102559) + var7, var5)) {
                var5 = var5 + (ar.field_w + ((rd.field_b << -1360482783) + jg.field_k));
                var4++;
                continue L0;
              } else {
                return var6;
              }
            }
          }
        }
    }

    private final void a(byte param0, nh param1) {
        Object var3_ref_Object = null;
        int var3 = 0;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3_ref_Object = (Object) (Object) ((vo) this).field_g;
                    // monitorenter ((vo) this).field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((vo) this).field_g.a((ms) (Object) param1, false);
                        ((vo) this).field_b = ((vo) this).field_b + 1;
                        ((Object) (Object) ((vo) this).field_g).notifyAll();
                        // monitorexit var3_ref_Object
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3_ref_Object
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var4;
                }
                case 5: {
                    var3 = -58 % ((param0 - 50) / 61);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (rs.field_t == param1) {
            var7 = eb.field_d;
        } else {
            var7 = cv.field_q;
        }
        ef.a(param2, (byte) 46, param3, param6, param4, param0, param5, var7);
    }

    final static void a(boolean param0, int param1, int param2, om param3) {
        int var4 = param3.field_G.field_r;
        int var5 = param3.field_v;
        if (param1 != 1) {
            field_e = null;
        }
        if (nw.g(76)) {
            return;
        }
        int var6 = param0 ? 1 : 0;
        qq.a((byte) 6, var5 + var4 * 1000, var6, param2);
    }

    final nh a(int param0, bc param1, boolean param2, byte[] param3) {
        nh var5 = new nh();
        var5.field_q = (long)param0;
        var5.field_L = 2;
        var5.field_z = param2 ? true : false;
        var5.field_F = param3;
        var5.field_C = param1;
        this.a((byte) 117, var5);
        return var5;
    }

    final void a(byte param0) {
        ((vo) this).field_a = true;
        Object var2_ref_Object = (Object) (Object) ((vo) this).field_g;
        // monitorenter ((vo) this).field_g
        ((Object) (Object) ((vo) this).field_g).notifyAll();
        // monitorexit var2_ref_Object
        try {
            if (false) throw (InterruptedException) null;
            ((vo) this).field_c.join();
        } catch (InterruptedException interruptedException) {
        }
        ((vo) this).field_c = null;
        int var2 = 41 % ((-67 - param0) / 33);
    }

    final static void a(int param0) {
        if (!(sj.field_d <= 0)) {
            sj.field_d = sj.field_d - 1;
        }
        if (param0 != -10232) {
            vo.a(-87, -49, 69, -51, 90, -121, false);
        }
        if (!(so.field_b.field_g == gb.field_y)) {
            sh.field_l = sh.field_l + (so.field_b.field_g - gb.field_y);
            gb.field_y = so.field_b.field_g;
        }
        if (!(-1 <= (sj.field_d ^ -1))) {
            vi.a(-67);
        }
    }

    final nh a(int param0, bc param1, int param2) {
        nh var4 = null;
        Object var5 = null;
        nh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        nh stackIn_7_0 = null;
        nh stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var4 = new nh();
                    var4.field_L = 1;
                    var5 = (Object) (Object) ((vo) this).field_g;
                    // monitorenter ((vo) this).field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (nh) (Object) ((vo) this).field_g.a((byte) 82);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6.field_q != (long)param0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != var6.field_C) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 != (var6.field_L ^ -1)) {
                            statePc = 8;
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
                        var4.field_F = var6.field_F;
                        var4.field_x = false;
                        // monitorexit var5
                        stackOut_6_0 = (nh) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (nh) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (nh) (Object) ((vo) this).field_g.c(24);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    var4.field_F = param1.a(0, param0);
                    var4.field_z = true;
                    var4.field_x = false;
                    if (param2 > 69) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    vo.a(76);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
    }

    vo(hd param0) {
        ((vo) this).field_g = new ui();
        ((vo) this).field_b = 0;
        ((vo) this).field_a = false;
        wo var2 = param0.a(5, 0, (Runnable) this);
        while (0 == var2.field_g) {
            nu.a(10L, 0);
        }
        if ((var2.field_g ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((vo) this).field_c = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_e = "Orb coins: ";
        field_f = new String[]{"turn <%0> of <%1>", "<%0> of <%1> portals captured", "<%0> of <%1> towers captured", "<%0> of <%1> villages captured", null, "<%0> of <%1> portals captured by <%2>", "<%0> of <%1> towers captured by <%2>", "<%0> of <%1> villages captured by <%2>", "<%0> / <%1>"};
    }
}
