/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements dr {
    static String field_a;
    static ri field_g;
    static String field_b;
    static String field_e;
    static String field_c;
    static Boolean field_d;
    static ja[][] field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = (ja[][]) null;
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
        if (!param0) {
          field_b = null;
          return;
        }
        int[] var2 = (int[]) null;
        dd.a((int[]) null, (byte) 46);
        field_b = null;
    }

    final static void a(boolean param0, int param1) {
        nc.a(param1 ^ -122, param0);
        if (param1 != 0) {
          return;
        }
        pm.a(false, param0);
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = hl.field_e;
          var1 = var5;
          if (param0 != 8) {
            field_e = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "dd.C(" + param0 + ')');
        }
    }

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bb var4_ref_bb = null;
        int var4 = 0;
        int var5_int = 0;
        bb var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (pi.field_a == vo.field_l) {
                            /* Inlined CFG state: 4. */
                            {
                                var2_long = bl.a((byte) 94);
                                if (param1 <= -77) {
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
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
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
                        stackIn_6_0 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
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
                        if (od.field_Db == 0) {
                            statePc = 17;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                if (fd.field_F < 0) {
                                    /* Inlined CFG state: 10. */
                                    {
                                        var4_ref_bb = (bb) (he.field_k.c(60));
                                        if (var4_ref_bb == null) {
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
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_ref_bb.field_j >= var2_long) {
                            statePc = 18;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                var4_ref_bb.a(true);
                                hd.field_q = var4_ref_bb.field_f.length;
                                s.field_e.field_j = 0;
                                var5_int = 0;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (hd.field_q <= var5_int) {
                            /* Inlined CFG state: 15. */
                            {
                                k.field_k = jp.field_e;
                                jp.field_e = ij.field_d;
                                ij.field_d = op.field_i;
                                op.field_i = var4_ref_bb.field_l;
                                stackIn_16_0 = 1;
                                statePc = 16;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                s.field_e.field_m[var5_int] = var4_ref_bb.field_f[var5_int];
                                var5_int++;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackIn_20_0 = fd.field_F;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = fd.field_F;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackIn_20_0 = fd.field_F;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= 0) {
                            statePc = 26;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                s.field_e.field_j = 0;
                                if (!fa.b(10, 1)) {
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
                                            fd.field_F = s.field_e.m(101);
                                            s.field_e.field_j = 0;
                                            hd.field_q = param0[fd.field_F];
                                            statePc = 26;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 26: {
                    try {
                        if (!dd.a(0)) {
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
                                    if (od.field_Db == 0) {
                                        /* Inlined CFG state: 40. */
                                        {
                                            k.field_k = jp.field_e;
                                            jp.field_e = ij.field_d;
                                            ij.field_d = op.field_i;
                                            op.field_i = fd.field_F;
                                            fd.field_F = -1;
                                            stackIn_41_0 = 1;
                                            statePc = 41;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 31. */
                                        {
                                            var4 = od.field_Db;
                                            if (0.0 != la.field_n) {
                                                statePc = 33;
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
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                        if (var4 < 0) {
                            /* Inlined CFG state: 35. */
                            {
                                var4 = 0;
                                statePc = 36;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5 = new bb(var2_long + (long)var4, fd.field_F, new byte[hd.field_q]);
                        var6 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (hd.field_q <= var6) {
                            /* Inlined CFG state: 39. */
                            {
                                he.field_k.a(var5, false);
                                fd.field_F = -1;
                                statePc = 19;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 38. */
                            {
                                var5.field_f[var6] = s.field_e.field_m[var6];
                                var6++;
                                statePc = 37;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 42 : -1);
                        if (statePc == -1) {
                            throw dd.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_44_0 = (RuntimeException) (var2);
                    stackIn_43_0 = stackIn_44_0;
                    stackIn_44_1 = new StringBuilder().append("dd.F(");
                    stackIn_43_1 = stackIn_44_1;
                    if (param0 == null) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = stackIn_43_0;
                    stackIn_45_1 = stackIn_43_1;
                    stackIn_45_2 = "{...}";
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = stackIn_44_0;
                    stackIn_45_1 = stackIn_44_1;
                    stackIn_45_2 = "null";
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw fa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0) {
        if (param0 == ~hd.field_q) {
          if (!fa.b(10, 1)) {
            return false;
          }
          hd.field_q = s.field_e.g(param0 + 31365);
          s.field_e.field_j = 0;
        }
        if (hd.field_q == -2) {
          if (!fa.b(param0 + 10, 2)) {
            return false;
          }
          hd.field_q = s.field_e.d((byte) 69);
          s.field_e.field_j = 0;
        }
        return fa.b(10, hd.field_q);
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ta.field_hb = oi.field_j;
          if (param3 != 255) {
            if (param3 < 100) {
              ai.field_g = p.a(-28, param2, param3);
            } else {
              if (param3 <= 105) {
                var7 = param1;
                jk.a(param0 ^ 0, var7);
                ai.field_g = kn.a(param1, param0 ^ -107);
              } else {
                ai.field_g = p.a(-28, param2, param3);
              }
            }
          } else {
            stackIn_4_0 = false;
            stackIn_5_1 = !(rj.field_J >= 13);
            ai.field_g = ij.a(stackIn_4_0, stackIn_5_1);
            var6 = (String[]) null;
            jk.a(0, (String[]) null);
          }
          if (param0 == 0) {
            return;
          }
          dd.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("dd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Please check if address is correct";
        field_b = "Draws even more zombies to you at the start of each match than Prepared. Equip both for the maximum number of minions.";
        field_f = new ja[5][];
        field_e = "Cancel";
        field_c = "For the zombie on the go.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
