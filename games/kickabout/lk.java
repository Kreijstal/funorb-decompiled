/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gn {
    static String field_m;
    int field_f;
    static String field_e;
    static String field_n;
    int field_k;
    static int field_g;
    static int field_l;
    static String field_i;
    String field_h;
    tf field_j;

    final static void a(int param0, nu param1, int param2, nl param3) {
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        nl stackIn_1_0 = null;
        nl stackIn_2_0 = null;
        nl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nl stackOut_0_0 = null;
        nl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        nl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = (nl) param3;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param0 ^ -1) == -2) {
            stackOut_2_0 = (nl) (Object) stackIn_2_0;
            stackOut_2_1 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (nl) (Object) stackIn_1_0;
            stackOut_1_1 = -1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_n = stackIn_3_1;
        param3.field_j = 0;
        param3.field_z = -hf.a(param0, param1, 27);
        var7 = param1.field_P[param0][-param3.field_z];
        var5 = var7.field_w;
        var6 = var7.field_M;
        if (param2 > -12) {
          return;
        } else {
          L1: {
            if (0 > var6) {
              var5 = 44040192;
              var6 = 29360128;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            param3.field_h = uv.a(true, var5 + -param3.field_w, var6 - param3.field_M);
            param3.a((byte) -31, 2);
            param3.field_L = param3.field_L + 25;
            if (15 > param3.field_o) {
              param3.field_o = param3.field_o + 1;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_i = null;
    }

    final li a(boolean param0, tm[] param1) throws dw, fi {
        NumberFormatException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        li[] var7 = null;
        li[] var8 = null;
        String var9 = null;
        tf stackIn_4_0 = null;
        tf stackIn_5_0 = null;
        tf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        li stackIn_10_0 = null;
        li stackIn_15_0 = null;
        li stackIn_18_0 = null;
        li stackIn_21_0 = null;
        li stackIn_23_0 = null;
        li stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        li stackIn_36_0 = null;
        li stackIn_40_0 = null;
        tf stackOut_3_0 = null;
        tf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        tf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        li stackOut_9_0 = null;
        li stackOut_14_0 = null;
        li stackOut_17_0 = null;
        li stackOut_20_0 = null;
        li stackOut_22_0 = null;
        li stackOut_26_0 = null;
        Object stackOut_29_0 = null;
        li stackOut_35_0 = null;
        li stackOut_39_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((lk) this).field_k == vu.field_Ab) {
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ((lk) this).field_j;
                        stackIn_5_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (tf) (Object) stackIn_4_0;
                        stackOut_4_1 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (tf) (Object) stackIn_5_0;
                        stackOut_5_1 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new li[((tf) (Object) stackIn_6_0).a(stackIn_6_1 != 0)];
                        var8 = var7;
                        var4 = 0;
                        var5 = (lk) (Object) ((lk) this).field_j.g(24009);
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
                        if (var5 == null) {
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
                        var4++;
                        var7[var4] = var5.a(true, param1);
                        var5 = (lk) (Object) ((lk) this).field_j.c(33);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = lo.a(var8, false, param1, ((lk) this).field_h);
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        if (((lk) this).field_k != pv.field_H) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3_int = Character.toLowerCase(((lk) this).field_h.charAt(((lk) this).field_h.length() - 1));
                        if (var3_int == 102) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = new li(Float.valueOf(((lk) this).field_h).floatValue());
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    try {
                        if (108 != var3_int) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = new li(Long.parseLong(((lk) this).field_h.substring(0, -1 + ((lk) this).field_h.length())));
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    try {
                        if (-1 == ((lk) this).field_h.indexOf('.')) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = new li(Double.valueOf(((lk) this).field_h).doubleValue());
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        stackOut_22_0 = new li(Integer.parseInt(((lk) this).field_h));
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        if (((lk) this).field_k == ra.field_N) {
                            statePc = 26;
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = new li(((lk) this).field_h.equals((Object) (Object) "true"));
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        if (param0) {
                            statePc = 31;
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
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return (li) (Object) stackIn_30_0;
                }
                case 31: {
                    try {
                        if (((lk) this).field_k != v.field_d) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = ((lk) this).field_h.substring(1, ((lk) this).field_h.length() - 1);
                        if (-2 != (var9.length() ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw new dw("Invalid char value: " + var9);
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = new li(var9.charAt(0));
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    try {
                        if (rb.field_Mb == ((lk) this).field_k) {
                            statePc = 39;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = new li((Object) (Object) ((lk) this).field_h.substring(1, -1 + ((lk) this).field_h.length()));
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    throw new dw("NumberFormatException on: " + ((lk) this).field_h);
                }
                case 42: {
                    throw new IllegalArgumentException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lk(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public final String toString() {
        if (vu.field_Ab == ((lk) this).field_k) {
            return "Method{" + ((lk) this).field_h + "}";
        }
        if (!(pv.field_H != ((lk) this).field_k)) {
            return "Number{" + ((lk) this).field_h + "}";
        }
        if (!(ra.field_N != ((lk) this).field_k)) {
            return "Boolean{" + ((lk) this).field_h + "}";
        }
        if (((lk) this).field_k == v.field_d) {
            return "Char{" + ((lk) this).field_h + "}";
        }
        if (((lk) this).field_k == rb.field_Mb) {
            return "String{" + ((lk) this).field_h + "}";
        }
        if (si.field_g == ((lk) this).field_k) {
            return "ArgStart";
        }
        if (((lk) this).field_k == og.field_c) {
            return "ArgEnd";
        }
        if (!(((lk) this).field_k != bp.field_Gb)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    lk(int param0, int param1, String param2) {
        ((lk) this).field_k = param0;
        ((lk) this).field_f = param1;
        ((lk) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Invite only";
        field_e = "You have won this auction! The player now appears in your squad under the Management menu.";
        field_i = "ok";
        field_n = "Friends";
    }
}
