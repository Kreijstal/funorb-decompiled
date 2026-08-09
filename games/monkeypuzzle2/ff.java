/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff implements Runnable {
    static int field_g;
    static String field_a;
    static char[] field_e;
    md field_b;
    volatile va[] field_c;
    volatile boolean field_d;
    volatile boolean field_f;

    final static void a(ta param0, le[] param1, int param2, int param3, int param4, le[] param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13, int param14, ta param15) {
        try {
            gj.a(param12, wg.field_h, lc.field_e, param2, qj.field_D, rb.field_cb, param10, ki.field_s, param7, param15, param4, param13, param0, param14, hh.field_u, param2 ^ -386, param3, param11, param6, new gg(param1), new gg(param5));
            jk.a(-97, param9, param8);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ff.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + (param15 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -7) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        int dupTemp$2 = 0;
        float[] dupTemp$3 = null;
        float[] dupTemp$4 = null;
        float[] dupTemp$5 = null;
        float[] dupTemp$6 = null;
        float[] dupTemp$7 = null;
        float[] dupTemp$8 = null;
        float[] dupTemp$9 = null;
        float[] dupTemp$10 = null;
        float[] dupTemp$11 = null;
        float[] dupTemp$12 = null;
        float[] dupTemp$13 = null;
        float[] dupTemp$14 = null;
        float[] dupTemp$15 = null;
        float[] dupTemp$16 = null;
        float[] dupTemp$17 = null;
        int stackIn_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        ta var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        kb.field_c = kb.field_c + 1;
                        if (fg.field_a >= (480 - param0) / 10) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (20 <= fg.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ul.field_O[fg.field_a] = pf.a((byte) -110, 3);
                        hh.field_r[fg.field_a] = 0;
                        n.field_d[fg.field_a][0] = (float)(pf.a((byte) 60, 3) + -1);
                        n.field_d[fg.field_a][1] = -0.5f;
                        pl.field_f[fg.field_a][0] = (float)(pf.a((byte) -88, 480) + 80);
                        pl.field_f[fg.field_a][1] = 490.0f;
                        fg.field_a = fg.field_a + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((kb.field_c & 7) != 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = stackIn_7_0;
                        if (param1 == -6961) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = (ta) null;
                        ff.a((ta) null, (le[]) null, 32, 126, -22, (le[]) null, 21, -43, -22, true, -125, -11, 113, 78, 111, (ta) null);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 >= fg.field_a) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2_int != 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        hh.field_r[var3] = hh.field_r[var3] + 1;
                        if ((hh.field_r[var3] ^ -1) != -5) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        hh.field_r[var3] = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        dupTemp$0 = pl.field_f[var3];
                        dupTemp$0[0] = dupTemp$0[0] + n.field_d[var3][0];
                        dupTemp$1 = pl.field_f[var3];
                        dupTemp$1[1] = dupTemp$1[1] + n.field_d[var3][1];
                        if (pl.field_f[var3][1] >= (float)(5 + param0)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pl.field_f[var3][1] = (float)(5 + param0);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        dupTemp$2 = uj.field_k[var3];
                        uj.field_k[var3] = dupTemp$2 + 1;
                        if (dupTemp$2 < 40) {
                            statePc = 42;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (Math.random() <= 0.8) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dupTemp$3 = n.field_d[var3];
                        dupTemp$3[0] = (float)((double)dupTemp$3[0] + (Math.random() - 0.5) * 0.5);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = var3 - -1;
                        if (var4 >= fg.field_a) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = pl.field_f[var3][0] - pl.field_f[var4][0];
                        var6 = -pl.field_f[var4][1] + pl.field_f[var3][1];
                        var7 = var5 * var5 + var6 * var6;
                        if (var7 >= 400.0f) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = 1.0f / (-(float)Math.sqrt((double)(var5 * var5 + var6 * var6)) + 20.0f);
                        dupTemp$4 = n.field_d[var3];
                        dupTemp$4[0] = dupTemp$4[0] + var8 * var5;
                        dupTemp$5 = n.field_d[var3];
                        dupTemp$5[1] = dupTemp$5[1] + var6 * var8;
                        var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                        dupTemp$6 = n.field_d[var3];
                        dupTemp$6[0] = dupTemp$6[0] * var8;
                        dupTemp$7 = n.field_d[var3];
                        dupTemp$7[1] = dupTemp$7[1] * var8;
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var7 <= 3600.0f) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = 1.0f / (float)Math.sqrt((double)(var6 * var6 + var5 * var5));
                        dupTemp$8 = n.field_d[var3];
                        dupTemp$8[0] = dupTemp$8[0] + var5 * var8;
                        dupTemp$9 = n.field_d[var3];
                        dupTemp$9[1] = dupTemp$9[1] + var8 * var6;
                        var8 = 1.0f / (float)Math.sqrt((double)(n.field_d[var3][0] * n.field_d[var3][0] + n.field_d[var3][1] * n.field_d[var3][1]));
                        dupTemp$10 = n.field_d[var3];
                        dupTemp$10[0] = dupTemp$10[0] * var8;
                        dupTemp$11 = n.field_d[var3];
                        dupTemp$11[1] = dupTemp$11[1] * var8;
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        n.field_d[var3][0] = (n.field_d[var3][0] + 0.5f * n.field_d[var4][0]) * 0.75f;
                        n.field_d[var3][1] = (n.field_d[var4][1] * 0.5f + n.field_d[var3][1]) * 0.75f;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (90.0f <= pl.field_f[var3][0]) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0.0f > n.field_d[var3][0]) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (pl.field_f[var3][0] <= 550.0f) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (n.field_d[var3][0] <= 0.0f) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dupTemp$12 = n.field_d[var3];
                        dupTemp$12[0] = (float)((double)dupTemp$12[0] * (Math.random() + -1.0));
                        dupTemp$13 = n.field_d[var3];
                        dupTemp$13[1] = (float)((double)dupTemp$13[1] + (-0.5 + Math.random()));
                        uj.field_k[var3] = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((float)(param0 + 20) <= pl.field_f[var3][1]) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0.0f <= n.field_d[var3][1]) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        dupTemp$14 = n.field_d[var3];
                        dupTemp$14[1] = (float)((double)dupTemp$14[1] * (-1.0 + Math.random()));
                        dupTemp$15 = n.field_d[var3];
                        dupTemp$15[0] = (float)((double)dupTemp$15[0] + (Math.random() - 0.5));
                        uj.field_k[var3] = 0;
                        if (var9 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (490.0f >= pl.field_f[var3][1]) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (n.field_d[var3][1] > 0.0f) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        dupTemp$16 = n.field_d[var3];
                        dupTemp$16[1] = (float)((double)dupTemp$16[1] * (Math.random() + -1.0));
                        dupTemp$17 = n.field_d[var3];
                        dupTemp$17[0] = (float)((double)dupTemp$17[0] + (Math.random() - 0.5));
                        uj.field_k[var3] = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3++;
                        if (var9 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "ff.E(" + param0 + ',' + param1 + ')');
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, bi param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -32323) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = param2.a(param0, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ff.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, ta param1, ta param2, int param3) {
        if (param0) {
            return;
        }
        try {
            sl.field_o = param2;
            fe.field_a = param1;
            rk.field_h = param3;
            tf.a((byte) 56, ge.field_g / 2, ge.field_h / 2);
            wf.a(param2.field_D + param2.field_j, param1.field_j, param2.field_j, 8192, param1.field_j + param1.field_D);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ff.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              bh.field_b = param3;
              wk.field_d = param2;
              vi.a(k.field_k, 12345, param0);
              if (param1 <= -69) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ff.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        va var2 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    this.field_d = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_f) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_c[var1_int];
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2.c();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        em.a(10L, false);
                        em.a((Object) null, (byte) -101, this.field_b);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    this.field_d = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var5 = (String) null;
                        kk.a((String) null, (byte) 66, (Throwable) ((Object) exception));
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    this.field_d = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    this.field_d = false;
                    throw ff.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        lg.field_n.field_b = 0;
        if (param0 < 33) {
            ff.a(-116, 109);
        }
        lg.field_n.field_a = 0;
    }

    ff() {
        this.field_c = new va[2];
        this.field_f = false;
        this.field_d = false;
    }

    static {
        field_a = "Speed Bonus: <%0> pts";
        field_g = 0;
        field_e = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
