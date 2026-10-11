/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static nb field_a;
    static int field_b;

    final static int a(byte param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 > -111) {
            field_b = 12;
          }
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param2 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -68) {
          return;
        }
        field_a = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 9) {
          vs.a((byte) 108);
        }
        return ms.field_a;
    }

    final static boolean a(int[] param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        int var6_int = 0;
        ub var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (kw.field_c == ga.field_j) {
                            /* Inlined CFG state: 4. */
                            {
                                var4 = 96 / ((param1 + 72) / 53);
                                var2_long = wq.a(-45);
                                if (0 == jo.field_c) {
                                    statePc = 14;
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
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
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
                        if (lq.field_b < 0) {
                            /* Inlined CFG state: 7. */
                            {
                                var5_ref_ub = (ub) (un.field_b.b(-99));
                                if (var5_ref_ub == null) {
                                    statePc = 15;
                                } else {
                                    statePc = 8;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                statePc = 14;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (~var2_long >= ~var5_ref_ub.field_m) {
                            statePc = 15;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 9. */
                            {
                                var5_ref_ub.b(false);
                                gu.field_d = var5_ref_ub.field_k.length;
                                ig.field_a.field_p = 0;
                                var6_int = 0;
                                statePc = 10;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6_int >= gu.field_d) {
                            /* Inlined CFG state: 12. */
                            {
                                li.field_r = vb.field_I;
                                vb.field_I = ur.field_Q;
                                ur.field_Q = iw.field_a;
                                iw.field_a = var5_ref_ub.field_l;
                                stackIn_13_0 = 1;
                                statePc = 13;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                ig.field_a.field_n[var6_int] = var5_ref_ub.field_k[var6_int];
                                var6_int++;
                                statePc = 10;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    stackIn_17_0 = lq.field_b;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = lq.field_b;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackIn_17_0 = lq.field_b;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        statePc = ((Object) stateCaught_16 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_16);
                        }
                        caughtException = stateCaught_16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 < 0) {
                            /* Inlined CFG state: 19. */
                            {
                                ig.field_a.field_p = 0;
                                if (ju.b(-1, 1)) {
                                    /* Inlined CFG state: 22. */
                                    {
                                        lq.field_b = ig.field_a.i(255);
                                        ig.field_a.field_p = 0;
                                        gu.field_d = param0[lq.field_b];
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 20. */
                                    {
                                        stackIn_21_0 = 0;
                                        statePc = 21;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 18. */
                            {
                                statePc = 23;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_17) {
                        statePc = ((Object) stateCaught_17 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_17);
                        }
                        caughtException = stateCaught_17;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 23: {
                    try {
                        if (lt.a((byte) 119)) {
                            /* Inlined CFG state: 26. */
                            {
                                if (jo.field_c != 0) {
                                    /* Inlined CFG state: 29. */
                                    {
                                        var5 = jo.field_c;
                                        if (0.0 == au.field_k) {
                                            statePc = 33;
                                        } else {
                                            statePc = 30;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 27. */
                                    {
                                        li.field_r = vb.field_I;
                                        vb.field_I = ur.field_Q;
                                        ur.field_Q = iw.field_a;
                                        iw.field_a = lq.field_b;
                                        lq.field_b = -1;
                                        stackIn_28_0 = 1;
                                        statePc = 28;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 24. */
                            {
                                stackIn_25_0 = 0;
                                statePc = 25;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_23) {
                        statePc = ((Object) stateCaught_23 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_23);
                        }
                        caughtException = stateCaught_23;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 30: {
                    try {
                        var5 = (int)((double)var5 + fd.field_d.nextGaussian() * au.field_k);
                        if (var5 < 0) {
                            /* Inlined CFG state: 32. */
                            {
                                var5 = 0;
                                statePc = 33;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                statePc = 33;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = new ub((long)var5 + var2_long, lq.field_b, new byte[gu.field_d]);
                        var7 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (gu.field_d <= var7) {
                            /* Inlined CFG state: 36. */
                            {
                                un.field_b.a((ms) (var6), (byte) 39);
                                lq.field_b = -1;
                                statePc = 16;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                var6.field_k[var7] = ig.field_a.field_n[var7];
                                var7++;
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 37 : -1);
                        if (statePc == -1) {
                            throw vs.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_39_0 = (RuntimeException) (var2);
                    stackIn_38_0 = stackIn_39_0;
                    stackIn_39_1 = new StringBuilder().append("vs.D(");
                    stackIn_38_1 = stackIn_39_1;
                    if (param0 == null) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = stackIn_38_0;
                    stackIn_40_1 = stackIn_38_1;
                    stackIn_40_2 = "{...}";
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = stackIn_39_1;
                    stackIn_40_2 = "null";
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw qo.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = new nb(0);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
