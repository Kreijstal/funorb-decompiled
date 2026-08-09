/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends be {
    int[] field_F;
    static long field_E;
    static String field_C;
    static String field_B;
    static pi field_J;
    private String[] field_H;
    private int[][] field_D;
    static String field_G;
    private int[] field_A;
    static int field_y;
    static jk field_z;
    static int[] field_I;

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1.d((byte) -88);
                        if ((var3_int ^ -1) != -1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(var3_int, param0 ^ 2598, param1);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 80) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a((byte) 71, (wl) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("me.F(").append(param0).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param1 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String f(byte param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    var5 = new StringBuilder(80);
                    var2 = var5;
                    if (param0 <= -57) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a((byte) 104, (wl) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null != this.field_H) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return "";
                }
                case 4: {
                    discarded$3 = var5.append(this.field_H[0]);
                    var3 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_H.length <= var3) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    discarded$4 = var2.append("...");
                    stackIn_10_0 = var5.append(this.field_H[var3]);
                    stackIn_7_0 = stackIn_10_0;
                    if (var4 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3++;
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (StringBuilder) (var2);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return ((StringBuilder) (Object) stackIn_10_0).toString();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    if (param0 == 19423) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    me.c(-120);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_F != null) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var2 ^ -1) <= (this.field_F.length ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_F[var2] = de.b(this.field_F[var2], 32768);
                    var2++;
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_G = null;
        field_B = null;
        field_C = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            field_y = 75;
        }
    }

    private final void a(int param0, int param1, wl param2) {
        int[] array$0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 2678) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param0 ^ -1) == -2) {
                            statePc = 26;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 2) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == 3) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 != 4) {
                            statePc = 32;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = param2.d((byte) -89);
                        this.field_D = new int[var4_int][];
                        this.field_A = new int[var4_int];
                        var5 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var4_int ^ -1) >= (var5 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = param2.e(3);
                        var7 = je.a(-121, var6);
                        if (var9 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_A[var5] = var6;
                        array$0 = new int[var7.field_f];
                        this.field_D[var5] = array$0;
                        var8 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 >= var7.field_f) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_D[var5][var8] = param2.e(qm.b(param1, 2677));
                        var8++;
                        if (var9 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4_int = param2.d((byte) -86);
                        this.field_F = new int[var4_int];
                        var5 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5 >= var4_int) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_F[var5] = param2.e(3);
                        var5++;
                        if (var9 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var9 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_H = ji.a('<', (byte) 66, param2.c((byte) -38));
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_30_0 = (RuntimeException) (var4);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = new StringBuilder().append("me.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            int var4 = 0;
            java.net.URL var5 = null;
            try {
              L0: {
                try {
                  L1: {
                    var5 = param1.getCodeBase();
                    var3 = gn.a(var5, -1, param1).getFile();
                    nc.a("updatelinks", -14541, param1, new Object[]{"home", var3 + "home.ws"});
                    var4 = -128 / ((param0 - 10) / 61);
                    nc.a("updatelinks", -14541, param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"options", var3 + "options.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"terms", var3 + "terms.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"privacy", var3 + "privacy.ws"});
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("me.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    me() {
    }

    final static ck a(ck param0, boolean param1, byte param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        ck stackIn_77_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0.b();
                        var11 = new ck(36, 36);
                        var12 = var11;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-19 >= (var5 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_35_0 = 0;
                        stackIn_4_0 = stackIn_35_0;
                        if (var10 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6 ^ -1) <= -19) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = param0.field_D[var5 * 18 - -var6];
                        stackIn_12_0 = -1;
                        stackIn_7_0 = stackIn_12_0;
                        stackIn_12_1 = var7 ^ -1;
                        stackIn_7_1 = stackIn_12_1;
                        if (var10 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == stackIn_7_1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = var7 + 16777216;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12.field_D[var5 * 72 + 2 * var6] = var7;
                        var6++;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = -18;
                        stackIn_12_1 = var6 ^ -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 >= stackIn_12_1) {
                            statePc = 23;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = var12.field_D[var6 * 2 + 72 * var5];
                        var8 = var12.field_D[2 + var6 * 2 + var5 * 72];
                        var9 = ((var8 & 16711423) >> -860505119) + ((16711423 & var7) >> 1709048353);
                        stackIn_26_0 = -1;
                        stackIn_14_0 = stackIn_26_0;
                        stackIn_26_1 = var9 ^ -1;
                        stackIn_14_1 = stackIn_26_1;
                        if (var10 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((var8 | var7) ^ -1) != -1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 == (var7 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var8 ^ -1) != -1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = var9 + 16777216;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12.field_D[1 + var5 * 72 - -(var6 * 2)] = var9;
                        var6++;
                        if (var10 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param3) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = var12.field_D[34 + 72 * var5];
                        var7 = var11.field_D[72 * var5];
                        stackIn_26_0 = (16711422 & var6) >> -1241284703;
                        stackIn_26_1 = (var7 & 16711423) >> 395104033;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = stackIn_26_0 + stackIn_26_1;
                        if (var8 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var7 | var6) == 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var6 ^ -1) == -1) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 == var7) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var8 = var8 + 16777216;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12.field_D[34 + (var5 * 72 + 1)] = var8;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = stackIn_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var5;
                        stackIn_37_1 = 17;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 >= stackIn_37_1) {
                            statePc = 51;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_52_0 = 0;
                        stackIn_39_0 = stackIn_52_0;
                        if (var10 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var6 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-37 >= (var6 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = var12.field_D[var6 + var5 * 72];
                        var8 = var12.field_D[var6 + (var5 * 72 + 72)];
                        var9 = ((var8 & 16711423) >> 2082759745) + ((16711423 & var7) >> -1478008351);
                        stackIn_37_0 = (var7 | var8) ^ -1;
                        stackIn_42_0 = stackIn_37_0;
                        stackIn_37_1 = -16777217;
                        stackIn_42_1 = stackIn_37_1;
                        if (var10 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= stackIn_42_1) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((16777215 & var7 ^ -1) == -1) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((16777215 & var8) != 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = 0;
                        if (var10 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var9 ^ -1) != -1) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12.field_D[36 + (var6 + 72 * var5)] = var9;
                        var6++;
                        if (var10 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5++;
                        if (var10 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = param1 ? 1 : 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-37 >= (var5 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var6 = var11.field_D[1224 - -var5];
                        var7 = var11.field_D[var5];
                        var8 = (8355711 & var6 >> -1625883615) + ((16711423 & var7) >> 622570241);
                        stackIn_66_0 = (var7 | var6) ^ -1;
                        stackIn_56_0 = stackIn_66_0;
                        stackIn_66_1 = -16777217;
                        stackIn_56_1 = stackIn_66_1;
                        if (var10 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 <= stackIn_56_1) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var6 & 16777215 ^ -1) == -1) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-1 != (16777215 & var7 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8 = 0;
                        if (var10 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var8 ^ -1) != -1) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var8 = 1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12.field_D[36 + var5 + 1224] = var8;
                        var5++;
                        if (var10 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var5 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = -19;
                        stackIn_66_1 = var5 ^ -1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 >= stackIn_66_1) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_76_0 = 0;
                        stackIn_68_0 = stackIn_76_0;
                        if (var10 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6 = stackIn_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((var6 ^ -1) <= -37) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var7 = var12.field_D[72 * var5 - -var6];
                        var7 = var7 & 16777215;
                        var12.field_D[var6 + 72 * var5] = var7;
                        var6++;
                        if (var10 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var10 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var5++;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var10 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = 23 % ((59 - param2) / 42);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var5 = stackIn_76_0;
                        stackIn_77_0 = (ck) (var12);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return stackIn_77_0;
                }
                case 78: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_80_0 = (RuntimeException) (var4);
                    stackIn_79_0 = stackIn_80_0;
                    stackIn_80_1 = new StringBuilder().append("me.D(");
                    stackIn_79_1 = stackIn_80_1;
                    if (param0 == null) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw dh.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_B = "Orb coins: ";
        field_G = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_C = "Members";
        field_J = new pi(0, 0, 0);
        field_y = 9;
        field_I = new int[8];
    }
}
