/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private sg field_d;
    private int field_b;
    static nh field_c;
    pj field_a;

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ai var4_ref_ai = null;
        int var4 = 0;
        int var5_int = 0;
        ai var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ef.field_a == w.field_cb) {
                            /* Inlined CFG state: 4. */
                            {
                                var2_long = km.b(-1);
                                if (param1 == 21) {
                                    statePc = 7;
                                } else {
                                    statePc = 5;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                stackIn_3_0 = 0;
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (wh.field_x == 0) {
                            statePc = 17;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                if (im.field_E < 0) {
                                    /* Inlined CFG state: 10. */
                                    {
                                        var4_ref_ai = (ai) (qe.field_c.b(param1 - 21));
                                        if (var4_ref_ai == null) {
                                            statePc = 18;
                                        } else {
                                            statePc = 11;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 9. */
                                    {
                                        statePc = 17;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_ref_ai.field_n >= var2_long) {
                            statePc = 18;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                var4_ref_ai.f(0);
                                oo.field_a = var4_ref_ai.field_k.length;
                                kj.field_d.field_n = 0;
                                var5_int = 0;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5_int >= oo.field_a) {
                            /* Inlined CFG state: 15. */
                            {
                                mm.field_d = eb.field_f;
                                eb.field_f = wk.field_h;
                                wk.field_h = fa.field_e;
                                fa.field_e = var4_ref_ai.field_j;
                                stackIn_16_0 = 1;
                                statePc = 16;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                kj.field_d.field_j[var5_int] = var4_ref_ai.field_k[var5_int];
                                var5_int++;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackIn_20_0 = im.field_E;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = im.field_E;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackIn_20_0 = im.field_E;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= 0) {
                            statePc = 25;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                kj.field_d.field_n = 0;
                                if (no.a(1, param1 - 21)) {
                                    /* Inlined CFG state: 24. */
                                    {
                                        im.field_E = kj.field_d.a(true);
                                        kj.field_d.field_n = 0;
                                        oo.field_a = param0[im.field_E];
                                        statePc = 25;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        stackIn_23_0 = 0;
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 25: {
                    try {
                        if (ah.a(param1 ^ 23)) {
                            /* Inlined CFG state: 28. */
                            {
                                if (wh.field_x != 0) {
                                    /* Inlined CFG state: 31. */
                                    {
                                        var4 = wh.field_x;
                                        if (0.0 == u.field_s) {
                                            statePc = 35;
                                        } else {
                                            statePc = 32;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 29. */
                                    {
                                        mm.field_d = eb.field_f;
                                        eb.field_f = wk.field_h;
                                        wk.field_h = fa.field_e;
                                        fa.field_e = im.field_E;
                                        im.field_E = -1;
                                        stackIn_30_0 = 1;
                                        statePc = 30;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 26. */
                            {
                                stackIn_27_0 = 0;
                                statePc = 27;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 32: {
                    try {
                        var4 = (int)((double)var4 + sa.field_d.nextGaussian() * u.field_s);
                        if (var4 < 0) {
                            /* Inlined CFG state: 34. */
                            {
                                var4 = 0;
                                statePc = 35;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 33. */
                            {
                                statePc = 35;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = new ai((long)var4 + var2_long, im.field_E, new byte[oo.field_a]);
                        var6 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        statePc = ((Object) stateCaught_35 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_35);
                        }
                        caughtException = stateCaught_35;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (oo.field_a <= var6) {
                            /* Inlined CFG state: 38. */
                            {
                                qe.field_c.a((byte) 54, var5);
                                im.field_E = -1;
                                statePc = 19;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                var5.field_k[var6] = kj.field_d.field_j[var6];
                                var6++;
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kg.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var2);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("kg.C(");
                    stackIn_40_1 = stackIn_41_1;
                    if (param0 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = stackIn_40_0;
                    stackIn_42_1 = stackIn_40_1;
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = stackIn_41_0;
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw rb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ul.field_e = new ei();
        if (param0 < 81) {
          field_c = (nh) null;
        }
    }

    final void a(boolean param0) {
        short dupTemp$0 = 0;
        if (this.field_a != null) {
          dupTemp$0 = (short)(this.field_a.field_z[0] + 1);
          this.field_a.field_z[0] = dupTemp$0;
          if (dupTemp$0 % 16 == 0) {
            this.field_a = null;
            this.field_d.d(this.field_b);
          }
        }
        if (!param0) {
          field_c = (nh) null;
        }
    }

    kg(sg param0, int param1, int param2) {
        rm var4 = null;
        kh var5 = null;
        try {
          this.field_b = param1;
          this.field_d = param0;
          var4 = new rm(1, 1, 0);
          var4.a(0, 0, 0);
          var4.a(0, 0, 0, (byte) 0, (byte) 0, (short)param2, (short) -1);
          this.field_a = (pj) (var4.a(80, 1365, -1, -12, 12));
          this.field_a.field_z[0] = (short)param2;
          var5 = new kh();
          var5.field_k = this.field_a;
          param0.a(param1, var5);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        if (b.field_x < 2) {
          return 0;
        }
        if (0 == sn.field_i) {
          if (!lp.field_a.a(-12749)) {
            return 20;
          }
          if (!lp.field_a.a(true, "commonui")) {
            return 40;
          }
          if (!eg.field_v.a(-12749)) {
            return 50;
          }
          if (!eg.field_v.a(true, "commonui")) {
            return 60;
          }
          if (!kb.field_a.a(-12749)) {
            return 70;
          }
          if (!kb.field_a.c(-19375)) {
            return 80;
          }
        } else {
          if (je.field_f != null) {
            if (!je.field_f.a(-12749)) {
              return 14;
            }
            if (!je.field_f.b((byte) -37, "")) {
              return 29;
            }
            if (!je.field_f.a(true, "")) {
              return 29;
            }
          }
          if (!lp.field_a.a(-12749)) {
            return 43;
          }
          if (!lp.field_a.a(true, "commonui")) {
            return 57;
          }
          if (!eg.field_v.a(-12749)) {
            return 71;
          }
          if (!eg.field_v.a(true, "commonui")) {
            return 80;
          }
          if (!kb.field_a.a(-12749)) {
            return 82;
          }
          if (!kb.field_a.c(param0 - 19424)) {
            return 86;
          }
        }
        if (param0 != 49) {
          kg.a(49);
        }
        return 100;
    }

    public static void b(byte param0) {
        if (param0 != -64) {
          int[] var2 = (int[]) null;
          kg.a((int[]) null, (byte) 104);
        }
        field_c = null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
