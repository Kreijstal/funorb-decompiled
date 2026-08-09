/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_b;
    static int field_c;
    static bl field_a;

    final static int[] a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = pe.a(4096, param0);
        var4 = ri.a(98, param0);
        var5 = pe.a(4096, param2);
        if (param1 > -44) {
          field_a = (bl) null;
          var6 = ri.a(-120, param2);
          var7 = (int)((long)var5 * (long)var3 >> 1073638288);
          var8 = (int)((long)var6 * (long)var3 >> 438431440);
          var9 = (int)((long)var4 * (long)var5 >> 232112848);
          var10 = (int)((long)var4 * (long)var6 >> -513720304);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var6 = ri.a(-120, param2);
          var7 = (int)((long)var5 * (long)var3 >> 1073638288);
          var8 = (int)((long)var6 * (long)var3 >> 438431440);
          var9 = (int)((long)var4 * (long)var5 >> 232112848);
          var10 = (int)((long)var4 * (long)var6 >> -513720304);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        sj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        o.field_i = 0;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        mg.field_d = stackIn_4_0 != 0;
                        if (param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        jl.field_j = stackIn_7_0;
                        if (hf.field_f == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        il.field_c = new int[][]{new int[]{34, 190, wk.field_a.field_e.length * wl.field_K.field_n + 34, wl.field_K.field_m + 190}};
                        wc.field_a = new int[][]{new int[]{161, 247, 161 + si.field_i.field_e.length * wl.field_K.field_n, wl.field_K.field_m + 247}};
                        hf.field_f = new int[][]{new int[]{34, 114, wl.field_K.field_n * od.field_g.field_e.length + 34, wl.field_K.field_m + 114}, il.field_c[0], wc.field_a[0]};
                        hd.field_c = new int[][]{hf.field_f[0], il.field_c[0]};
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        wk.field_a.a(true);
                        si.field_i.a(true);
                        od.field_g.field_d = 34;
                        wk.field_a.field_d = 34;
                        si.field_i.field_d = 161;
                        if (param1 == -13) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_b = (String) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        od.field_g.field_c = 114;
                        wk.field_a.field_c = 190;
                        si.field_i.field_c = 247;
                        ac.field_n = new ld(1024, 8, 8);
                        if (!param0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = 6;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        re.field_A = stackIn_15_0;
                        if (dk.field_b) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hf.field_j = hf.field_j - 1;
                        nc.field_t = nc.field_t - 1;
                        dk.field_b = false;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        sg.field_d = null;
                        oh.field_j = 0;
                        oj.field_u.g(-1);
                        hc.field_u = 0;
                        da.field_C = 0;
                        vh.field_n = vh.field_n + (eh.field_a << 931741222);
                        eh.field_a = 0;
                        if (null != qi.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        hf.field_j = hf.field_j - qi.field_c.field_o;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qi.field_c = we.field_l[am.field_n];
                        hf.field_j = hf.field_j + qi.field_c.field_o;
                        if (!mg.field_d) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == qi.field_c.field_b) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var2_int >= qi.field_c.field_b.length()) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        si.field_i.field_e[var2_int] = w.a(si.field_i, var2_int, qi.field_c, (byte) 42, qi.field_c.field_b.charAt(var2_int));
                        si.field_i.field_e[var2_int].field_x = false;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var3 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!mg.field_d) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == qi.field_c.field_n) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (sg.field_p != null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        sg.field_p.d(1);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        sg.field_p = w.a(de.field_d, 1, qi.field_c, (byte) 36, qi.field_c.field_n.charAt(1));
                        var2 = sg.field_p;
                        sg.field_p.field_g = 1000;
                        sg.field_p.field_x = true;
                        var2.field_j = 1000;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var2_int = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (vi.field_g.length <= var2_int) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        vi.field_g[var2_int].setLength(0);
                        vi.field_a[var2_int] = 0;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var3 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        od.field_g.a(true);
                        wk.field_d = 0;
                        dc.field_a = 0;
                        eg.field_b = 0;
                        n.field_a = 0;
                        bi.field_J = 0;
                        hi.field_a = 1;
                        gk.field_e = 0;
                        rb.field_a = 0;
                        ce.field_c = 0;
                        ad.field_e = false;
                        wk.field_c = 0;
                        bg.field_m = 1500;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var2_ref), "rc.C(" + param0 + ',' + param1 + ')');
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "Retry";
    }
}
