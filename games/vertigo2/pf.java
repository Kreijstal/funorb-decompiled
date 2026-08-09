/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static int field_a;

    final static gg a(byte param0, ae param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gg stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 65 / ((-27 - param0) / 52);
            stackIn_1_0 = sp.a(ra.a(param1, 100, param2), -124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("pf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static tp a(boolean param0, boolean param1, int param2) {
        od stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        boolean stackIn_2_3 = false;
        od stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_4_3 = false;
        od stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_5_3 = false;
        int stackIn_5_4 = 0;
        tp stackIn_12_0 = null;
        cr stackIn_35_0 = null;
        cr stackIn_37_0 = null;
        cr stackIn_38_0 = null;
        String stackIn_38_1 = null;
        cr stackIn_39_0 = null;
        cr stackIn_41_0 = null;
        cr stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_101_0 = null;
        tp stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        Object var5 = null;
        Object var6 = null;
        tp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        b var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = h.field_D.field_Lb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = param2 * ((2 + r.field_f) * 3);
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = 2;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = param1;
                        stackIn_2_3 = stackIn_4_3;
                        if (wq.field_M != h.field_D.field_Lb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (od) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (od) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((od) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, -5, 2 + r.field_f) ? 1 : 0;
                        var4 = h.field_D.field_Mb.field_M;
                        if (!param0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        pf.a(true, true, 108);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = null;
                        if (-3 != (ba.field_d ^ -1)) {
                            statePc = 93;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wi.field_g.field_lb = true;
                        el.field_a.field_S = Vertigo2.a(new String[]{dg.field_d}, pq.field_a, 0);
                        h.field_D.field_Lb.field_Lb.field_S = null;
                        var6 = null;
                        var7 = (tp) ((Object) var4.a((byte) 100));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == null) {
                            statePc = 85;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        stackOut_11_0 = (tp) (var7);
                        stackIn_101_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0.field_M != null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7.field_Jb = new cr(0L, el.field_b);
                        var7.b(var7.field_Jb, 119);
                        var7.field_Kb = new cr(0L, tm.field_b);
                        var7.b(var7.field_Kb, 126);
                        var7.field_Ob = new cr(0L, el.field_b);
                        var7.b(var7.field_Ob, 125);
                        var7.field_Kb.field_O = 2;
                        var8 = 1;
                        var7.i(-2147483648);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7.field_Fb = h.field_D.field_Mb.field_Fb;
                        var9 = 0;
                        if (null != var7.field_Lb) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7.field_Lb != dg.field_d) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = 0;
                        if (var7.field_Ib == null) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!var7.field_Ib.equals("")) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.field_Ob.field_Db = qr.field_q;
                        var7.field_Ob.field_B = var11;
                        var12 = 1;
                        var7.field_Ob.a(100, qr.field_q.field_x + 3, r.field_f, var9, 0);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7.field_Kb.field_B = var11;
                        var7.field_Jb.field_B = var11;
                        var7.field_Kb.field_A = var10;
                        var7.field_Jb.field_A = var10;
                        var7.field_Kb.field_K = var11;
                        var7.field_Jb.field_K = var11;
                        var7.field_Kb.field_H = var11;
                        var7.field_Jb.field_H = var11;
                        var13 = 0;
                        var14 = -2 + var7.field_Fb + -80;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = 3 + qr.field_q.field_x;
                        var14 = var14 - var13;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = var7.field_Jb;
                        stackIn_35_0 = stackIn_37_0;
                        if (var14 <= 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = (cr) ((Object) stackIn_35_0);
                        stackIn_38_1 = cc.a(var7.field_Jb.field_z, var7.field_Mb, var14);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (cr) ((Object) stackIn_37_0);
                        stackIn_38_1 = var7.field_Mb;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0.field_S = stackIn_38_1;
                        var7.field_Jb.a(81, var14, r.field_f, var9, var13);
                        stackIn_41_0 = var7.field_Kb;
                        stackIn_39_0 = stackIn_41_0;
                        if (null == var7.field_Lb) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = (cr) ((Object) stackIn_39_0);
                        stackIn_42_1 = var7.field_Lb;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = (cr) ((Object) stackIn_41_0);
                        stackIn_42_1 = aq.field_f;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_42_0.field_S = stackIn_42_1;
                        var7.field_Kb.a(97, 80, r.field_f, var9, -80 + var7.field_Fb);
                        if (var7.field_Jb.field_S.equals(var7.field_Mb)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var15 = stackIn_46_0;
                        var9 = var9 + r.field_f;
                        if (var3_int != 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7.field_kb = var9 + -var7.field_db;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        h.field_D.field_Mb.a((byte) 121, (cr) (var6), var7, 2);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = var7;
                        if (var7.field_Ob == null) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var7.field_Ob.field_pb) {
                            statePc = 82;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-1 == (var7.field_tb ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var16 = var7.field_Mb;
                        oq.a(h.field_D.field_Lb, -1, 4462, -1, (String) null, (int[]) null, var7, 0L, var16);
                        if (var7.field_Lb == null) {
                            statePc = 72;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (ak.a(76, un.field_Lb.field_k)) {
                            statePc = 72;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (pe.field_r) {
                            statePc = 72;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (hj.field_b) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var17 = un.field_Lb;
                        var18 = Vertigo2.a(new String[]{var16}, sc.field_b, -23);
                        var17.field_n.a(var18, 8, 0);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var17 = un.field_Lb;
                        var18 = Vertigo2.a(new String[]{var16}, hh.field_d, 19);
                        var17.field_n.a(var18, 18, 0);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!var7.field_Jb.field_pb) {
                            statePc = 84;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var15 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ko.field_S = var7.field_Mb;
                        if (var19 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ko.field_S = var7.field_Ib;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var7 = (tp) ((Object) var4.b(122));
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-1 == (h.field_D.field_Hb.field_tb ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        rc.field_d = new un(h.field_D.field_Hb.field_ob, h.field_D.field_Hb.field_C, h.field_D.field_Hb.field_Fb, h.field_D.field_Hb.field_db, kj.field_A, vf.field_B, ee.field_b, ee.field_b);
                        hk.field_n = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-1 != (h.field_D.field_Kb.field_tb ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        rc.field_d = new un(h.field_D.field_Kb.field_ob, h.field_D.field_Kb.field_C, h.field_D.field_Kb.field_Fb, h.field_D.field_Kb.field_db, ce.field_a, vf.field_B, ee.field_b, ee.field_b);
                        hk.field_n = 1;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        wi.field_g.field_lb = false;
                        el.field_a.field_S = b.field_f;
                        if (-2 == (ba.field_d ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        h.field_D.field_Lb.field_Lb.field_S = mq.field_t;
                        if (var19 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        h.field_D.field_Lb.field_Lb.field_S = tn.field_r;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        tg.a(0, h.field_D.field_Mb);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_101_0 = var5;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    return (tp) ((Object) stackIn_101_0);
                }
                case 102: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw wn.a((Throwable) ((Object) var3), "pf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = 2;
    }
}
