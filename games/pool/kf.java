/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ma {
    nb field_o;
    static String field_l;
    int field_n;
    ma field_m;

    public static void a(int param0) {
        if (param0 != -1) {
          field_l = (String) null;
          field_l = null;
          return;
        }
        field_l = null;
    }

    final void a(int param0, int param1, int param2) {
        this.field_n = param0;
        this.field_o.c(param1, param2 + ec.field_b * param0 >> 8);
    }

    final static void a(int param0, byte param1, int[] param2, int[] param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -104) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    param4++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        param4++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param0--;
                        var7 = 1;
                        var5_int = param4;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 < var5_int) {
                            /* Inlined CFG state: 13. */
                            {
                                if (var7 == 0) {
                                    /* Inlined CFG state: 15. */
                                    {
                                        var5_int = param0;
                                        statePc = 16;
                                        continue stateLoop;
                                    }
                                } else {
                                    statePc = 14;
                                    continue stateLoop;
                                }
                            }
                        } else {
                            /* Inlined CFG state: 7. */
                            {
                                if (param2[var5_int - 1] > param2[var5_int]) {
                                    /* Inlined CFG state: 10. */
                                    {
                                        var6 = param2[-1 + var5_int];
                                        param2[var5_int - 1] = param2[var5_int];
                                        param2[var5_int] = var6;
                                        var6 = param3[-1 + var5_int];
                                        param3[var5_int - 1] = param3[var5_int];
                                        var7 = 0;
                                        param3[var5_int] = var6;
                                        statePc = 11;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 8. */
                                    {
                                        statePc = 11;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 16: {
                    try {
                        if (param4 > var5_int) {
                            /* Inlined CFG state: 22. */
                            {
                                if (var7 == 0) {
                                    statePc = 4;
                                } else {
                                    statePc = 31;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 17. */
                            {
                                if (~param2[var5_int - 1] < ~param2[var5_int]) {
                                    /* Inlined CFG state: 19. */
                                    {
                                        var6 = param2[var5_int - 1];
                                        param2[var5_int - 1] = param2[var5_int];
                                        param2[var5_int] = var6;
                                        var6 = param3[-1 + var5_int];
                                        param3[var5_int - 1] = param3[var5_int];
                                        param3[var5_int] = var6;
                                        var7 = 0;
                                        statePc = 20;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 18. */
                                    {
                                        statePc = 20;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_16) {
                        statePc = ((Object) stateCaught_16 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_16);
                        }
                        caughtException = stateCaught_16;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_int--;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 24 : -1);
                        if (statePc == -1) {
                            throw kf.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var5);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = stackIn_25_0;
                    stackIn_27_1 = stackIn_25_1;
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = stackIn_26_0;
                    stackIn_27_1 = stackIn_26_1;
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = stackIn_27_0;
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param3 == null) {
                        /* Inlined CFG state: 29. */
                        {
                            stackIn_30_0 = stackIn_29_0;
                            stackIn_30_1 = stackIn_29_1;
                            stackIn_30_2 = "null";
                            statePc = 30;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 28. */
                        {
                            stackIn_30_0 = stackIn_28_0;
                            stackIn_30_1 = stackIn_28_1;
                            stackIn_30_2 = "{...}";
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                }
                case 30: {
                    throw wm.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(')').toString());
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kf(nb param0, ma param1) {
        try {
          this.field_o = param0;
          this.field_n = param0.j();
          this.field_m = param1;
          this.field_o.d(ec.field_b * this.field_n + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Exploiting a bug";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
