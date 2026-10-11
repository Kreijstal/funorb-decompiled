/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ka {
    static ll[] field_a;

    final static String a(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 <= -94) {
          var1 = "";
          if (vr.field_b != null) {
            var1 = vr.field_b.d(false);
          }
          if (var1.length() == 0) {
            var1 = ec.b((byte) -128);
          }
          if (var1.length() == 0) {
            var1 = vj.field_a;
          }
          return var1;
        }
        field_a = (ll[]) null;
        var1Lifetime1 = "";
        if (vr.field_b != null) {
          var1Lifetime1 = vr.field_b.d(false);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = ec.b((byte) -128);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = vj.field_a;
        }
        return var1Lifetime1;
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_38_0 = 0;
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
        m var4_ref_m = null;
        int var4 = 0;
        int var5_int = 0;
        m var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ca.field_f != wq.field_e) {
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
                                    if (param0 > 75) {
                                        statePc = 7;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 6. */
                                        {
                                            field_a = (ll[]) null;
                                            statePc = 7;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 7: {
                    try {
                        var2_long = kh.a(-125);
                        if (tj.field_m == 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 <= ec.field_g) {
                            statePc = 16;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 9. */
                            {
                                var4_ref_m = (m) (oo.field_T.d(268435455));
                                if (var4_ref_m == null) {
                                    statePc = 17;
                                } else {
                                    statePc = 10;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (~var2_long >= ~var4_ref_m.field_e) {
                            statePc = 17;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                var4_ref_m.c(-123);
                                ag.field_s = var4_ref_m.field_h.length;
                                nm.field_c.field_g = 0;
                                var5_int = 0;
                                statePc = 12;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ag.field_s <= var5_int) {
                            /* Inlined CFG state: 14. */
                            {
                                ga.field_l = kg.field_b;
                                kg.field_b = hi.field_w;
                                hi.field_w = qs.field_b;
                                qs.field_b = var4_ref_m.field_i;
                                stackIn_15_0 = 1;
                                statePc = 15;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 13. */
                            {
                                nm.field_c.field_f[var5_int] = var4_ref_m.field_h[var5_int];
                                var5_int++;
                                statePc = 12;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    stackIn_19_0 = ec.field_g;
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = ec.field_g;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackIn_19_0 = ec.field_g;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        statePc = ((Object) stateCaught_18 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_18);
                        }
                        caughtException = stateCaught_18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 < 0) {
                            /* Inlined CFG state: 21. */
                            {
                                nm.field_c.field_g = 0;
                                if (!wo.a(1, true)) {
                                    /* Inlined CFG state: 23. */
                                    {
                                        stackIn_24_0 = 0;
                                        statePc = 24;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        /* Sequential CFG blocks: 22, 25. */
                                        {
                                        }
                                        {
                                            ec.field_g = nm.field_c.j((byte) -53);
                                            nm.field_c.field_g = 0;
                                            ag.field_s = param1[ec.field_g];
                                            statePc = 26;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 20. */
                            {
                                statePc = 26;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 26: {
                    try {
                        if (rm.a(0)) {
                            /* Inlined CFG state: 29. */
                            {
                                if (tj.field_m == 0) {
                                    /* Inlined CFG state: 37. */
                                    {
                                        ga.field_l = kg.field_b;
                                        kg.field_b = hi.field_w;
                                        hi.field_w = qs.field_b;
                                        qs.field_b = ec.field_g;
                                        ec.field_g = -1;
                                        stackIn_38_0 = 1;
                                        statePc = 38;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 30. */
                                    {
                                        var4 = tj.field_m;
                                        if (0.0 == wk.field_g) {
                                            statePc = 33;
                                        } else {
                                            statePc = 31;
                                        }
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                stackIn_28_0 = 0;
                                statePc = 28;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 31: {
                    try {
                        var4 = (int)((double)var4 + vr.field_h.nextGaussian() * wk.field_g);
                        if (0 <= var4) {
                            statePc = 33;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 32. */
                            {
                                var4 = 0;
                                statePc = 33;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_31) {
                        statePc = ((Object) stateCaught_31 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_31);
                        }
                        caughtException = stateCaught_31;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = new m((long)var4 + var2_long, ec.field_g, new byte[ag.field_s]);
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (ag.field_s <= var6) {
                            /* Inlined CFG state: 36. */
                            {
                                oo.field_T.a(88, var5);
                                ec.field_g = -1;
                                statePc = 18;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                var5.field_h[var6] = nm.field_c.field_f[var6];
                                var6++;
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw ka.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0 != 0;
                }
                case 39: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var2);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("ka.H(").append(param0).append(',');
                    stackIn_40_1 = stackIn_41_1;
                    if (param1 == null) {
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
                    throw pn.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, long param1, String param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, int param11, rk param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            nm.field_c = new dl(param7);
            if (param0 != -31808) {
              return;
            }
            q.field_p = new dl(param3);
            ca.field_h = param4;
            ub.field_g = param11;
            gl.field_a = param5;
            ca.field_g = param2;
            ii.field_j = param12;
            sg.field_b = param10;
            ut.field_a = param8;
            fs.field_a = param1;
            ko.field_f = param13;
            te.field_h = param6;
            id.field_d = param9;
            if (null == ii.field_j.field_g) {
              return;
            }
            try {
              vs.field_g = new gh(ii.field_j.field_g, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            if (param12 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == -126) {
          return;
        }
        field_a = (ll[]) null;
    }

    final static sa b(byte param0) {
        if (ao.field_b == null) {
          ao.field_b = new sa();
          ao.field_b.a(qo.field_b, 3);
          ao.field_b.field_o = 0;
          ao.field_b.field_i = 14;
          ao.field_b.field_d = 7697781;
          ao.field_b.field_l = 4;
          ao.field_b.field_j = 2763306;
          ao.field_b.field_e = 5;
          ao.field_b.field_f = 6;
          ao.field_b.field_b = oi.field_c;
          if (param0 > 98) {
            return ao.field_b;
          }
          return (sa) null;
        }
        if (param0 > 98) {
          return ao.field_b;
        }
        return (sa) null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
