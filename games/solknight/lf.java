/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lf {
    static String field_e;
    static volatile int field_c;
    static aa field_a;
    static ad field_d;
    static char[] field_f;
    static String field_b;

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(int[] param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        sa var4_ref_sa = null;
        int var4 = 0;
        int var5_int = 0;
        sa var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (jj.field_Y != ef.field_e) {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_4_0 = 0;
                                statePc = 4;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                /* Sequential CFG blocks: 2, 5. */
                                {
                                }
                                {
                                    if (param1 == 122) {
                                        /* Inlined CFG state: 8. */
                                        {
                                            var2_long = je.a(1);
                                            if (0 == rh.field_i) {
                                                statePc = 18;
                                            } else {
                                                statePc = 9;
                                            }
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 6. */
                                        {
                                            stackIn_7_0 = 0;
                                            statePc = 7;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 9: {
                    try {
                        if (qg.field_a < 0) {
                            /* Inlined CFG state: 11. */
                            {
                                var4_ref_sa = (sa) (jl.field_h.a((byte) 51));
                                if (var4_ref_sa == null) {
                                    statePc = 19;
                                } else {
                                    statePc = 12;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                statePc = 18;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (~var2_long >= ~var4_ref_sa.field_h) {
                            statePc = 19;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 13. */
                            {
                                var4_ref_sa.c(10);
                                te.field_O = var4_ref_sa.field_k.length;
                                te.field_N.field_m = 0;
                                var5_int = 0;
                                statePc = 14;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5_int >= te.field_O) {
                            /* Inlined CFG state: 16. */
                            {
                                nf.field_U = kl.field_b;
                                kl.field_b = jg.field_e;
                                jg.field_e = ob.field_h;
                                ob.field_h = var4_ref_sa.field_j;
                                stackIn_17_0 = 1;
                                statePc = 17;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 15. */
                            {
                                te.field_N.field_l[var5_int] = var4_ref_sa.field_k[var5_int];
                                var5_int++;
                                statePc = 14;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    stackIn_21_0 = qg.field_a;
                    statePc = 21;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = qg.field_a;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackIn_21_0 = qg.field_a;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 >= 0) {
                            statePc = 26;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                te.field_N.field_m = 0;
                                if (bf.c(114, 1)) {
                                    /* Inlined CFG state: 25. */
                                    {
                                        qg.field_a = te.field_N.l(27310);
                                        te.field_N.field_m = 0;
                                        te.field_O = param0[qg.field_a];
                                        statePc = 26;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 23. */
                                    {
                                        stackIn_24_0 = 0;
                                        statePc = 24;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 26: {
                    try {
                        if (!qd.b((byte) 127)) {
                            /* Inlined CFG state: 28. */
                            {
                                stackIn_29_0 = 0;
                                statePc = 29;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                /* Sequential CFG blocks: 27, 30. */
                                {
                                }
                                {
                                    if (rh.field_i == 0) {
                                        /* Inlined CFG state: 38. */
                                        {
                                            nf.field_U = kl.field_b;
                                            kl.field_b = jg.field_e;
                                            jg.field_e = ob.field_h;
                                            ob.field_h = qg.field_a;
                                            qg.field_a = -1;
                                            stackIn_39_0 = 1;
                                            statePc = 39;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 31. */
                                        {
                                            var4 = rh.field_i;
                                            if (hb.field_n == 0.0) {
                                                statePc = 34;
                                            } else {
                                                statePc = 32;
                                            }
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 32: {
                    try {
                        var4 = (int)((double)var4 + ib.field_i.nextGaussian() * hb.field_n);
                        if (0 <= var4) {
                            statePc = 34;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 33. */
                            {
                                var4 = 0;
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = new sa(var2_long + (long)var4, qg.field_a, new byte[te.field_O]);
                        var6 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var6 >= te.field_O) {
                            /* Inlined CFG state: 37. */
                            {
                                jl.field_h.a(var5, -7044);
                                qg.field_a = -1;
                                statePc = 20;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 36. */
                            {
                                var5.field_k[var6] = te.field_N.field_l[var6];
                                var6++;
                                statePc = 35;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_35) {
                        statePc = ((Object) stateCaught_35 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw lf.<RuntimeException>$cfr$sneakyThrow(stateCaught_35);
                        }
                        caughtException = stateCaught_35;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var2);
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("lf.E(");
                    stackIn_41_1 = stackIn_42_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = stackIn_41_0;
                    stackIn_43_1 = stackIn_41_1;
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = stackIn_42_0;
                    stackIn_43_1 = stackIn_42_1;
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw fc.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        if (param0 != 18609) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          lf.a((byte) -36, (java.applet.Applet) null);
        }
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static fg a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        fg[] var4 = null;
        int var5 = 0;
        fg var6 = null;
        int var7 = 0;
        fg stackIn_4_0 = null;
        fg stackIn_9_0 = null;
        fg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = -56 % ((param0 - 51) / 35);
          var3 = na.a("jagex-last-login-method", param1, -32574);
          if (var3 == null) {
            stackIn_4_0 = SolKnight.field_D;
            return stackIn_4_0;
          }
          var4 = cl.d((byte) -30);
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_12_0 = SolKnight.field_D;
              return stackIn_12_0;
            }
            var6 = var4[var5];
            if (!var6.a(-126, var3)) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("lf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_a = null;
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "Not yet achieved";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
