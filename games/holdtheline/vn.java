/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vn {
    static int field_c;
    static int field_d;
    static String field_b;
    static String field_a;
    static String field_e;
    private hj[] field_g;
    static int field_f;
    static oa field_h;

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == -51) {
          hi.a(this.field_g, param1, true, param3, param4, param0);
          return;
        }
        field_c = -23;
        hi.a(this.field_g, param1, true, param3, param4, param0);
    }

    final static void a(int param0, Object param1, ib param2) {
        java.awt.EventQueue stackIn_7_0 = null;
        java.awt.EventQueue stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == param2.field_t) {
                            statePc = 3;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                /* Sequential CFG blocks: 2, 4. */
                                {
                                }
                                {
                                    var3_int = param0;
                                    statePc = 5;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 17 : -1);
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 5: {
                    try {
                        if (var3_int >= 50) {
                            statePc = 10;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                stackIn_13_0 = param2.field_t;
                                stackIn_7_0 = stackIn_13_0;
                                if (var4 != 0) {
                                    statePc = 13;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 7. */
                                    {
                                        if (((java.awt.EventQueue) (Object) stackIn_7_0).peekEvent() == null) {
                                            statePc = 10;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 8. */
                                            {
                                                qe.a(1L, (byte) 45);
                                                var3_int++;
                                                if (var4 == 0) {
                                                    statePc = 5;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 9. */
                                                    {
                                                        statePc = 10;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 17 : -1);
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 != null) {
                            /* Inlined CFG state: 12. */
                            {
                                stackIn_13_0 = param2.field_t;
                                statePc = 13;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                return;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 15 : ((Object) stateCaught_10 instanceof RuntimeException ? 17 : -1));
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((java.awt.EventQueue) (Object) stackIn_13_0).postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof Exception ? 15 : ((Object) stateCaught_13 instanceof RuntimeException ? 17 : -1));
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return;
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 17 : -1);
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        statePc = ((Object) stateCaught_15 instanceof RuntimeException ? 17 : -1);
                        if (statePc == -1) {
                            throw vn.<RuntimeException>$cfr$sneakyThrow(stateCaught_15);
                        }
                        caughtException = stateCaught_15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var3_ref);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("vn.I(").append(param0).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = stackIn_18_0;
                    stackIn_20_1 = stackIn_18_1;
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = stackIn_19_0;
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = stackIn_20_0;
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param2 == null) {
                        /* Inlined CFG state: 22. */
                        {
                            stackIn_23_0 = stackIn_22_0;
                            stackIn_23_1 = stackIn_22_1;
                            stackIn_23_2 = "null";
                            statePc = 23;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 21. */
                        {
                            stackIn_23_0 = stackIn_21_0;
                            stackIn_23_1 = stackIn_21_1;
                            stackIn_23_2 = "{...}";
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                }
                case 23: {
                    throw kk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
        if (param0 != -1) {
          vn.a(30, (Object) null, (ib) null);
          return;
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = HoldTheLine.field_D;
        var4 = param3.indexOf(param1);
        if (param2 > -53) {
          vn.a((String) null, (String) null, 105, (String) null);
        }
        while (true) {
          if (var4 == -1) {
            return param3;
          }
          param3 = param3.substring(0, var4) + param0 + param3.substring(var4 + param1.length());
          stackIn_6_0 = (String) (param3);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param1, var4 + param0.length());
        }
    }

    static {
        field_c = -1;
        field_b = "Reload game";
        field_e = "Unfortunately you are not eligible to create an account.";
        field_a = "Play free version";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
