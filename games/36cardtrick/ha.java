/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_b;
    static bk field_d;
    private static cc field_a;
    static String field_c;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        var5 = Main.field_T;
        var3 = jl.a(false, param0, param2);
        if (var3 == null) {
          L0: {
            if (param1 == -30773) {
              break L0;
            } else {
              var6 = (CharSequence) null;
              String discarded$2 = ha.a((CharSequence) null, 19, false);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 < ((CharSequence) param0).length()) {
              if (fd.a(true, ((CharSequence) param0).charAt(var4))) {
                var4++;
                continue L1;
              } else {
                return nf.field_a;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Main.field_T;
                        if (null == cb.field_j) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!md.a(113, param3)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return -1;
                    }
                    case 5: {
                        if (vf.field_a != ra.field_b) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        sh.field_k = tb.a(param1, param5, (byte) -18, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        var10 = (String) null;
                        sh.field_k = nk.a(-108, false, cd.field_a, (String) null, param1);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        na.field_r.field_i = 0;
                        na.field_r.b(-9469, 14);
                        na.field_r.b(-9469, sh.field_k.a((byte) -24).field_b);
                        fe.a((byte) -118, -1);
                        ra.field_b = vd.field_q;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (ra.field_b != vd.field_q) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (!r.a(1, (byte) 122)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6 = rd.field_j.f(94);
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ra.field_b = field_a;
                        al.field_a = -1;
                        pd.field_l = var6;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        ra.field_b = ab.field_w;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        rd.field_j.field_i = 0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (ab.field_w != ra.field_b) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (r.a(8, (byte) 127)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        hb.field_b = rd.field_j.d(true);
                        rd.field_j.field_i = 0;
                        jc.a(param4, (byte) -111, param3, sh.field_k, param0);
                        ra.field_b = rk.field_eb;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (rk.field_eb != ra.field_b) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (r.a(1, (byte) 121)) {
                            statePc = 23;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var6 = rd.field_j.f(34);
                        pd.field_l = var6;
                        ia.field_b = null;
                        rd.field_j.field_i = 0;
                        if (0 == var6) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (1 == var6) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var6 != 8) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        mc.a((byte) -126);
                        lk.field_w = false;
                        return var6;
                    }
                    case 27: {
                        al.field_a = -1;
                        ra.field_b = field_a;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        al.field_a = -1;
                        ra.field_b = vg.field_a;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (ra.field_b == vg.field_a) {
                            statePc = 31;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (gl.a(false)) {
                            statePc = 33;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        cd.field_a = rd.field_j.d(true);
                        ec.field_f = rd.field_j.f(-109);
                        int discarded$12 = rd.field_j.f(-103);
                        d.field_c = rd.field_j.d((byte) 72);
                        var11 = rd.field_j.f((byte) 29);
                        var7 = rd.field_j.f(113);
                        if (0 == (var7 & 1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        bd.d((byte) -86);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (!param3) {
                            statePc = 37;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if ((var7 & 4) == 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        bi.field_c = stackIn_40_0 != 0;
                        if ((8 & var7) == 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        da.field_b = stackIn_43_0 != 0;
                        if (da.field_b) {
                            statePc = 44;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        if (!bj.field_m) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        int discarded$13 = rd.field_j.f(124);
                        int discarded$14 = rd.field_j.f(101);
                        int discarded$15 = rd.field_j.e((byte) 125);
                        pb.field_j = rd.field_j.d((byte) 72);
                        fb.field_d = new byte[pb.field_j];
                        var8 = 0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var8 >= pb.field_j) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        fb.field_d[var8] = rd.field_j.a(true);
                        var8++;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 48: {
                        ri.field_c = rd.field_j.c(false);
                        var12 = (CharSequence) ri.field_c;
                        aa.field_fb = ff.a((byte) 116, var12);
                        qb.field_b = rd.field_j.f(-117);
                        ra.field_b = ad.field_q;
                        if (sh.field_k.a((byte) -24) != tf.field_o) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        ke.field_c.a(mk.g(-125), 0);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 50: {
                        if (sh.field_k.a((byte) -24) == hc.field_h) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        oj.field_e.a(mk.g(-120), 0);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        lk.field_w = false;
                        if (var11 == null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        lk.a(mk.g(-128), 0, var11);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if ((d.field_c ^ -1) < -1) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        if (bi.field_c) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$16 = vh.a("unzap", -12151, mk.g(-125));
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var8_ref_Throwable = caughtException;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 61: {
                        try {
                            Object discarded$17 = vh.a(new Object[1], "zap", (byte) 111, mk.g(-125));
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var8_ref_Throwable = caughtException;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (-1 <= d.field_c) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        dg.field_F = true;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        na.field_r.b(kb.field_e, 8);
                        var8 = 0;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (-5 <= var8) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        kb.field_e[var8] = kb.field_e[var8] + 50;
                        var8++;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 69: {
                        rd.field_j.b(kb.field_e, 8);
                        return pd.field_l;
                    }
                    case 70: {
                        if (field_a != ra.field_b) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        if (!gl.a(false)) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        mc.a((byte) -125);
                        if (7 != pd.field_l) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (lk.field_w) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        lk.field_w = true;
                        return -1;
                    }
                    case 75: {
                        if ((pd.field_l ^ -1) == -8) {
                            statePc = 77;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        pd.field_l = 3;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        e.field_a = rd.field_j.c(false);
                        lk.field_w = false;
                        return pd.field_l;
                    }
                    case 79: {
                        if (param2 >= 7) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        ha.a(-3);
                        statePc = 81;
                        continue stateLoop;
                    }
                    case 81: {
                        if (cb.field_j == null) {
                            statePc = 83;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        if (lk.field_w) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        var6 = ag.field_e;
                        ag.field_e = hj.field_l;
                        lk.field_w = true;
                        hj.field_l = var6;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 85: {
                        if (we.a((byte) 79) > 30000L) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        e.field_a = e.field_f;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 87: {
                        e.field_a = jf.field_k;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        lk.field_w = false;
                        return 3;
                    }
                    case 89: {
                        return -1;
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

    public static void a(int param0) {
        if (param0 >= -98) {
            field_c = (String) null;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bk();
        field_a = new cc();
        field_c = "Please check if address is correct";
    }
}
