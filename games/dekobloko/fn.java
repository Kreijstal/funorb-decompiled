/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends mk {
    static String field_f;
    static w field_g;
    private java.nio.ByteBuffer field_h;

    final byte[] a(int param0) {
        byte[] var2;
        byte[] var3;
        if (param0 != 256) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_h.capacity()];
          var2 = var3;
          this.field_h.position(0);
          this.field_h.get(var3);
          return var3;
        }
    }

    final static void a(ji param0, ji param1, ji param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        pi[] var5 = null;
        pi[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pi[] var10 = null;
        int var11_int = 0;
        ck var11 = null;
        ck var12 = null;
        int var13 = 0;
        pi[] var14 = null;
        ck var15 = null;
        int[][] var16 = null;
        ck var17 = null;
        ck var18 = null;
        int[][] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        c.field_m = bj.a(112, param0, "commonui", "frame_top");
                        g.field_O = bj.a(112, param0, "commonui", "frame_bottom");
                        jm.field_q = id.a(param0, "jagex_logo_grey", "commonui", 8192);
                        rm.field_a = bj.a(112, param0, "commonui", "button");
                        tl.field_u = ac.a(0, "commonui", "validation", param0);
                        bj.field_f = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 110, "arezzo12"));
                        hh.field_e = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 93, "arezzo14"));
                        ec.field_p = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) -121, "arezzo14bold"));
                        var17 = new ck(param1.a(0, "", "button.gif"), (java.awt.Component) ((Object) jh.field_b));
                        hn.a("dropdown", param0, "commonui", (byte) 73);
                        var5 = t.a("screen_options", param0, false, "commonui");
                        df.field_Y = new pi[4];
                        jj.field_e = new pi[4];
                        aa.field_c = new pi[4];
                        var6 = new pi[][]{df.field_Y, jj.field_e, aa.field_c};
                        var19 = new int[4][];
                        var16 = var19;
                        var7 = var16;
                        var7[0] = var5[0].field_l;
                        var8 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8 >= var19.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8] = (int[]) ((Object) var19[0].clone());
                        var8++;
                        if (var13 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var5[0].field_k[0];
                        var19[2][var8] = 16777215;
                        var19[1][var8] = 2394342;
                        var19[3][var8] = 4767999;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var9 ^ -1) <= -4) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = var6[var9];
                        var10 = var14;
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var14.length <= var11_int) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14[var11_int] = hc.a(0, var19[var11_int], var5[var9]);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 == 0) {
                            statePc = 8;
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
                        var9 = var17.field_H;
                        uh.a(-9074);
                        var17.a();
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        hk.c(stackIn_18_0, 0, hk.field_j, hk.field_i);
                        var15 = new ck(var9, var9);
                        var18 = var15;
                        var18.a();
                        var17.e(0, param3);
                        var11 = new ck(var9, var9);
                        var11.a();
                        var17.e(var9 - var17.field_I, 0);
                        var12 = new ck(var17.field_I - 2 * var9, var9);
                        var12.a();
                        var17.e(-var9, 0);
                        mk.a((byte) -5);
                        rm.field_a = new ck[]{var15, var12, var11};
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("fn.F(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fn() {
    }

    public static void b(int param0) {
        ji var2;
        if (param0 != 0) {
          var2 = (ji) null;
          fn.a((ji) null, (ji) null, (ji) null, 51);
          field_g = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_f = null;
          return;
        }
    }

    final void a(byte[] param0, boolean param1) {
        this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        this.field_h.position(0);
        if (!param1) {
            return;
        }
        try {
            this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
