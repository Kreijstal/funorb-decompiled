/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    String field_d;
    String field_c;
    static qh field_b;
    int field_a;
    String field_f;
    ki field_g;
    static hj field_e;

    final static void a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_32_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        d var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        se var13 = null;
        se var14 = null;
        int[][] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 73) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var13 = cd.field_t;
                        var14 = var13;
                        var2 = var14.b((byte) 90);
                        var3 = (d) ((Object) md.field_h.b((byte) -66));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_12_0 = var3.field_f;
                        stackIn_6_0 = stackIn_12_0;
                        if (var12 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == var2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = (d) ((Object) md.field_h.d(853));
                        if (var12 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 != null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        th.a(122);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        stackIn_12_0 = var14.b((byte) 90);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = stackIn_12_0;
                        if (-1 != (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var3.field_i;
                        qd.field_c[0] = gb.field_h;
                        var6_int = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 <= var6_int) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        qd.field_c[var6_int] = var13.g(2);
                        var6_int++;
                        if (var12 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        tl.a(var4, 12105912, var5);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6_int >= var4) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        uj.a((byte) -85, var14);
                        stackIn_30_0 = -1;
                        stackIn_23_0 = stackIn_30_0;
                        stackIn_30_1 = var6_int ^ -1;
                        stackIn_23_1 = stackIn_30_1;
                        if (var12 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != stackIn_23_1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        a.a(var6_int, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        fe.a(var5, true);
                        stackIn_30_0 = 2;
                        stackIn_30_1 = var5;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6 = new String[stackIn_30_0][stackIn_30_1];
                        var18 = new int[2][var5 * 4];
                        var8 = rc.field_d;
                        var9 = 0;
                        var10 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var9 >= var8) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11 = bc.field_o[var9];
                        var6[0][var10] = qd.field_c[var11];
                        var18[0][4 * var10] = tl.field_d[var11];
                        var18[0][1 + 4 * var10] = vl.field_g[var11];
                        var18[0][var10 * 4 + 2] = th.field_f[var11];
                        var18[0][var10 * 4 + 3] = ld.field_b[var11];
                        stackOut_32_0 = fc.a((byte) -125, qd.field_c[var11]);
                        stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                        stackIn_33_0 = stackOut_32_0;
                        if (var12 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 == (ld.field_b[var11] + (th.field_f[var11] + vl.field_g[var11]) ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6[0][var10] = null;
                        var10--;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10++;
                        var9++;
                        if (var12 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = 0;
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var9 < var8) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3.b(57);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = bc.field_o[var9 + var5];
                        var6[1][var10] = qd.field_c[var11];
                        var18[1][var10 * 4] = tl.field_d[var11];
                        var18[1][1 + 4 * var10] = vl.field_g[var11];
                        var18[1][var10 * 4 + 2] = th.field_f[var11];
                        var18[1][var10 * 4 - -3] = ld.field_b[var11];
                        if (var12 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!fc.a((byte) 124, qd.field_c[var11])) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-1 != (ld.field_b[var11] + (vl.field_g[var11] - -th.field_f[var11]) ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6[1][var10] = null;
                        var10--;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9++;
                        var10++;
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3.b(57);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 == -72) {
          L0: {
            if (pc.field_cb) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (!n.b((byte) -96)) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 0) {
            return;
        }
        try {
            lh.a(param1, "", false);
            bm.a(12979, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            field_e = (hj) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    private ad() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new qh();
    }
}
