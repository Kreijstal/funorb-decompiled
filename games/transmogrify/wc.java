/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    private ci field_f;
    private ci field_e;
    private lf field_c;
    static int[][] field_a;
    static boolean field_b;
    static int field_d;

    final static void a(int param0, int param1) {
        gk.field_f = (param1 & 57) >> -1386919164;
        vc.field_O = param1 >> -408960062 & 3;
        if (!(-3 <= (gk.field_f ^ -1))) {
            gk.field_f = 2;
        }
        if (!(param0 >= vc.field_O)) {
            vc.field_O = 2;
        }
        ba.field_n = 3 & param1;
        if ((ba.field_n ^ -1) < -3) {
            ba.field_n = 2;
        }
    }

    final static int a(int param0, int param1, String param2, boolean param3, boolean param4, String param5) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_83_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_103_0 = 0;
            int stackIn_105_0 = 0;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            String stackIn_109_2 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            String stackIn_112_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            String var7_ref_String = null;
            int var8 = 0;
            int var9 = 0;
            Throwable var9_ref_Throwable = null;
            int var10 = 0;
            String var11 = null;
            CharSequence var12 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != nk.field_b) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (gk.a(param4, -23)) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackIn_4_0 = -1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0;
                    }
                    case 5: {
                        try {
                            if (jk.field_y != lj.field_z) {
                                statePc = 11;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (param4) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ll.field_V = bf.a(param5, (byte) 41, false, param2);
                            if (var10 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var11 = (String) null;
                            ll.field_V = dk.a((String) null, ac.field_j, false, param2, 126);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ff.field_D.field_h = 0;
                            ff.field_D.f(6389, 14);
                            ff.field_D.f(6389, ll.field_V.a(-184).field_a);
                            rb.a(-1, -377);
                            lj.field_z = g.field_y;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (g.field_y == lj.field_z) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (!ue.a(1, 0)) {
                                statePc = 19;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var6_int = nf.field_l.d((byte) 125);
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ca.field_e = var6_int;
                            tg.field_a = -1;
                            lj.field_z = aa.field_e;
                            if (var10 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            lj.field_z = lb.field_e;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            nf.field_l.field_h = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (lj.field_z == lb.field_e) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (ue.a(8, 0)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            fd.field_g = nf.field_l.e((byte) -115);
                            nf.field_l.field_h = 0;
                            tb.a(ll.field_V, param0, param3, param4, 122);
                            lj.field_z = ck.field_I;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var6_int = -17 / ((-59 - param1) / 55);
                            if (lj.field_z == ck.field_I) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (!ue.a(1, 0)) {
                                statePc = 36;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var7 = nf.field_l.d((byte) 110);
                            ca.field_e = var7;
                            e.field_I = null;
                            nf.field_l.field_h = 0;
                            if (-1 == (var7 ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (-2 != (var7 ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            lj.field_z = pj.field_w;
                            tg.field_a = -1;
                            if (var10 == 0) {
                                statePc = 36;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-9 != (var7 ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            pc.a(1);
                            ej.field_k = false;
                            stackIn_34_0 = var7;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            lj.field_z = aa.field_e;
                            tg.field_a = -1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (lj.field_z == pj.field_w) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (ce.a(0)) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ac.field_j = nf.field_l.e((byte) 117);
                            va.field_j = nf.field_l.d((byte) 58);
                            nf.field_l.d((byte) 93);
                            wj.field_o = nf.field_l.a((byte) -118);
                            var7_ref_String = nf.field_l.j(-1640531527);
                            var8 = nf.field_l.d((byte) 82);
                            if (-1 == (1 & var8 ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            rb.a((byte) -114);
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (param4) {
                                statePc = 50;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-1 == (var8 & 4 ^ -1)) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackIn_46_0 = 1;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 106;
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
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            el.field_g = stackIn_46_0 != 0;
                            if ((8 & var8) == 0) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_49_0 = 1;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackIn_49_0 = 0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ub.field_d = stackIn_49_0 != 0;
                            if (!ub.field_d) {
                                statePc = 50;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (kc.field_D) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            nf.field_l.d((byte) 63);
                            nf.field_l.d((byte) 33);
                            nf.field_l.c((byte) -119);
                            ai.field_c = nf.field_l.a((byte) -119);
                            td.field_c = new byte[ai.field_c];
                            var9 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var9 >= ai.field_c) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            td.field_c[var9] = nf.field_l.b(true);
                            var9++;
                            if (var10 != 0) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var10 == 0) {
                                statePc = 53;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            w.field_a = nf.field_l.g(12248);
                            var12 = (CharSequence) ((Object) w.field_a);
                            kf.field_e = hj.a((byte) -128, var12);
                            db.field_d = nf.field_l.d((byte) 123);
                            lj.field_z = ll.field_Q;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (ll.field_V.a(-184) != wh.field_I) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            aa.field_d.a(ha.b(95), 0);
                            if (var10 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (ll.field_V.a(-184) != vc.field_G) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            of.field_f.a(ha.b(101), 0);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ej.field_k = false;
                            if (var7_ref_String == null) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            v.a(0, var7_ref_String, ha.b(121));
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (0 < wj.field_o) {
                                statePc = 68;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!el.field_g) {
                                statePc = 71;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            kj.a(22102, "zap", new Object[]{tl.a(11468, ac.field_j)}, ha.b(106));
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var9_ref_Throwable = caughtException;
                            if (var10 == 0) {
                                statePc = 74;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            kj.a(ha.b(87), false, "unzap");
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var9_ref_Throwable = caughtException;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if ((wj.field_o ^ -1) >= -1) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            wd.field_g = true;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ff.field_D.a((byte) -68, mf.field_c);
                            var9 = 0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (-5 >= (var9 ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            mf.field_c[var9] = mf.field_c[var9] + 50;
                            var9++;
                            if (var10 != 0) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var10 == 0) {
                                statePc = 77;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            nf.field_l.a((byte) -74, mf.field_c);
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackIn_83_0 = ca.field_e;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        return stackIn_83_0;
                    }
                    case 84: {
                        try {
                            if (aa.field_e != lj.field_z) {
                                statePc = 95;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (!ce.a(0)) {
                                statePc = 95;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            pc.a(1);
                            if ((ca.field_e ^ -1) != -8) {
                                statePc = 90;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (ej.field_k) {
                                statePc = 90;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ej.field_k = true;
                            stackIn_89_0 = -1;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        return stackIn_89_0;
                    }
                    case 90: {
                        try {
                            if (7 == ca.field_e) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            ca.field_e = 3;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            Transmogrify.field_B = nf.field_l.g(12248);
                            ej.field_k = false;
                            stackIn_94_0 = ca.field_e;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        return stackIn_94_0;
                    }
                    case 95: {
                        try {
                            if (null != nk.field_b) {
                                statePc = 104;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (ej.field_k) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var7 = lf.field_c;
                            lf.field_c = kf.field_p;
                            kf.field_p = var7;
                            ej.field_k = true;
                            if (var10 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (-30001L <= (mc.b(true) ^ -1L)) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            Transmogrify.field_B = ng.field_h;
                            if (var10 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            Transmogrify.field_B = bd.field_s;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            ej.field_k = false;
                            stackIn_103_0 = 3;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        return stackIn_103_0;
                    }
                    case 104: {
                        try {
                            stackIn_105_0 = -1;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        return stackIn_105_0;
                    }
                    case 106: {
                        var6 = (RuntimeException) ((Object) caughtException);
                        stackIn_108_0 = (RuntimeException) (var6);
                        stackIn_107_0 = stackIn_108_0;
                        stackIn_108_1 = new StringBuilder().append("wc.A(").append(param0).append(',').append(param1).append(',');
                        stackIn_107_1 = stackIn_108_1;
                        if (param2 == null) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    }
                    case 107: {
                        stackIn_109_0 = (RuntimeException) ((Object) stackIn_107_0);
                        stackIn_109_1 = (StringBuilder) ((Object) stackIn_107_1);
                        stackIn_109_2 = "{...}";
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 108: {
                        stackIn_109_0 = (RuntimeException) ((Object) stackIn_108_0);
                        stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
                        stackIn_109_2 = "null";
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 109: {
                        stackIn_111_0 = (RuntimeException) ((Object) stackIn_109_0);
                        stackIn_110_0 = stackIn_111_0;
                        stackIn_111_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_110_1 = stackIn_111_1;
                        if (param5 == null) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    }
                    case 110: {
                        stackIn_112_0 = (RuntimeException) ((Object) stackIn_110_0);
                        stackIn_112_1 = (StringBuilder) ((Object) stackIn_110_1);
                        stackIn_112_2 = "{...}";
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 111: {
                        stackIn_112_0 = (RuntimeException) ((Object) stackIn_111_0);
                        stackIn_112_1 = (StringBuilder) ((Object) stackIn_111_1);
                        stackIn_112_2 = "null";
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        throw ch.a((Throwable) ((Object) stackIn_112_0), stackIn_112_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private wc() throws Throwable {
        throw new Error();
    }

    final static cj a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            cj var5 = null;
            fg var5_ref = null;
            cj stackIn_2_0 = null;
            cj stackIn_4_0 = null;
            fg stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("dd");
                    if (param0 == 4) {
                      var5 = (cj) (var4.newInstance());
                      var5.a(param3, param2, param1, (byte) -126);
                      stackIn_4_0 = (cj) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (cj) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new fg();
                  ((cj) ((Object) var5_ref)).a(param3, param2, param1, (byte) -6);
                  stackIn_6_0 = (fg) (var5_ref);
                  return (cj) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref2);

                stackIn_9_1 = new StringBuilder().append("wc.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rk b(int param0, int param1) {
        rk var3;
        byte[] var4;
        var3 = (rk) (this.field_c.a(17699, (long)param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if ((param1 ^ -1) > -32769) {
                break L1;
              } else {
                var4 = this.field_e.a((byte) -93, 32767 & param1, 1);
                if (!Transmogrify.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_f.a((byte) -93, param1, 1);
            break L0;
          }
          L2: {
            var3 = new rk();
            if (var4 == null) {
              break L2;
            } else {
              var3.a(new oa(var4), param0 ^ -2);
              break L2;
            }
          }
          L3: {
            if (32768 <= param1) {
              var3.c((byte) 52);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0 == 1) {
              break L4;
            } else {
              field_d = 125;
              break L4;
            }
          }
          this.field_c.a(var3, -22137, (long)param1);
          return var3;
        }
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 7) {
            java.awt.Component var2 = (java.awt.Component) null;
            wc.a(60, (java.awt.Component) null, -102, -105);
        }
    }

    final static void a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_30_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ng var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        hj var15 = null;
        int[][] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = nf.field_l;
                        var15 = var14;
                        var2 = var15.d((byte) 108);
                        var3 = (ng) ((Object) kf.field_o.a((byte) -95));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_11_0 = var2;
                        stackIn_4_0 = stackIn_11_0;
                        stackIn_11_1 = var3.field_m;
                        stackIn_4_1 = stackIn_11_1;
                        if (var13 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == stackIn_4_1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = (ng) ((Object) kf.field_o.a(true));
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        pc.a(1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        stackIn_11_0 = -102;
                        stackIn_11_1 = (77 - param0) / 39;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = stackIn_11_0 % stackIn_11_1;
                        var4 = var15.d((byte) 78);
                        if (0 != var4) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3.c(5);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = var3.field_k;
                        kf.field_k[0] = w.field_a;
                        var7_int = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 <= var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kf.field_k[var7_int] = var14.g(12248);
                        var7_int++;
                        if (var13 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        he.a(var6, var4, 24070);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var7_int >= var4) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        th.a(101, var15);
                        stackIn_28_0 = 0;
                        stackIn_22_0 = stackIn_28_0;
                        stackIn_28_1 = var7_int;
                        stackIn_22_1 = stackIn_28_1;
                        if (var13 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_int, false);
                        if (var13 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_int, false);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7_int++;
                        if (var13 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        jj.a((byte) -93, var6);
                        stackIn_28_0 = 2;
                        stackIn_28_1 = var6;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = new String[stackIn_28_0][stackIn_28_1];
                        var19 = new int[2][var6 * 4];
                        var9 = cg.field_l;
                        var10 = 0;
                        var11 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var9 <= var10) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var12 = lk.field_d[var10];
                        var7[0][var11] = kf.field_k[var12];
                        var19[0][var11 * 4] = dk.field_k[var12];
                        var19[0][1 + var11 * 4] = bh.field_a[var12];
                        var19[0][2 + 4 * var11] = pd.field_a[var12];
                        var19[0][var11 * 4 - -3] = bg.field_j[var12];
                        stackOut_30_0 = qg.a(kf.field_k[var12], (byte) -128);
                        stackIn_36_0 = stackOut_30_0 ? 1 : 0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var13 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!stackIn_31_0) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (pd.field_a[var12] + bh.field_a[var12] - -bg.field_j[var12] != 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7[0][var11] = null;
                        var11--;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11++;
                        var10++;
                        if (var13 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10 = 0;
                        stackIn_36_0 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = stackIn_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var10 >= var9) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12 = lk.field_d[var10 + var6];
                        var7[1][var11] = kf.field_k[var12];
                        var19[1][var11 * 4] = dk.field_k[var12];
                        var19[1][var11 * 4 - -1] = bh.field_a[var12];
                        var19[1][2 + var11 * 4] = pd.field_a[var12];
                        var19[1][3 + var11 * 4] = bg.field_j[var12];
                        if (var13 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!qg.a(kf.field_k[var12], (byte) -111)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (bg.field_j[var12] + (bh.field_a[var12] + pd.field_a[var12]) == 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7[1][var11] = null;
                        var11--;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var10++;
                        var11++;
                        if (var13 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3.c(5);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1), "wc.C(" + param0 + ')');
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = 0;
        field_b = true;
    }
}
