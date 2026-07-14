/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements uj {
    static int[] field_c;
    static ji[] field_a;
    static int field_b;
    static int field_d;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        for (var5 = param0; mg.field_e.length > var5; var5++) {
            param4 = mg.field_e[var5];
            var6 = var5 << 694475396;
            while (true) {
                param4--;
                if (param4 == 0) {
                    break;
                }
                var6++;
                param3 = ta.field_d[var6];
                param2[param1[param3]] = param2[param1[param3]] + 1;
                ta.field_d[param2[param1[param3]]] = param3;
            }
        }
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 0;
        if (param0) {
            Object var3 = null;
            int discarded$0 = re.a(-10, false, true, (String) null, false, (String) null);
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var4 < var2; var4++) {
            var3[-1 + var2 - var4] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = MinerDisturbance.field_ab;
                        if (null == ci.field_i) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!ed.a(param4, (byte) -126)) {
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
                        if (qd.field_Q == cm.field_p) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param4) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        tb.field_d = sl.a((byte) 86, param3, param5, false);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        tb.field_d = qg.a(ne.field_Q, param5, 0, (String) null, false);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        sn.field_c.field_o = 0;
                        sn.field_c.c(14, 25564);
                        sn.field_c.c(tb.field_d.b(0).field_a, 25564);
                        bk.a((byte) -104, -1);
                        qd.field_Q = ra.field_c;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (qd.field_Q != ra.field_c) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (ta.a(0, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = kj.field_a.d((byte) -54);
                        kj.field_a.field_o = 0;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        oj.field_K = var6;
                        qd.field_Q = bh.field_bb;
                        rj.field_d = -1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        qd.field_Q = ka.field_d;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (qd.field_Q != ka.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!ta.a(0, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        gd.field_s = kj.field_a.h(81);
                        kj.field_a.field_o = 0;
                        cm.a((byte) 6, param4, param0, tb.field_d, param2);
                        qd.field_Q = nn.field_m;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (qd.field_Q != nn.field_m) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (!ta.a(0, 1)) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var6 = kj.field_a.d((byte) -54);
                        ag.field_d = null;
                        oj.field_K = var6;
                        kj.field_a.field_o = 0;
                        if (0 == var6) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (-2 == (var6 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        qd.field_Q = bh.field_bb;
                        rj.field_d = -1;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 26: {
                        si.a(-67);
                        ek.field_c = false;
                        return var6;
                    }
                    case 27: {
                        rj.field_d = -1;
                        qd.field_Q = wi.field_s;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (qd.field_Q != wi.field_s) {
                            statePc = 69;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (kj.b(-9319)) {
                            statePc = 31;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        ne.field_Q = kj.field_a.h(71);
                        wj.field_j = kj.field_a.d((byte) -54);
                        int discarded$12 = kj.field_a.d((byte) -54);
                        pj.field_a = kj.field_a.e(-96);
                        var11 = kj.field_a.j(103);
                        var7 = kj.field_a.d((byte) -54);
                        if ((1 & var7) != 0) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        nj.a((byte) 89);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (!param4) {
                            statePc = 36;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if ((8 & var7) == 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        bd.field_b = stackIn_39_0 != 0;
                        if ((4 & var7) == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        fa.field_b = stackIn_42_0 != 0;
                        if (bd.field_b) {
                            statePc = 43;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (!ei.field_L) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        int discarded$13 = kj.field_a.d((byte) -54);
                        int discarded$14 = kj.field_a.d((byte) -54);
                        int discarded$15 = kj.field_a.b((byte) 33);
                        g.field_k = kj.field_a.e(-47);
                        ja.field_v = new byte[g.field_k];
                        var8 = 0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (g.field_k <= var8) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        ja.field_v[var8] = kj.field_a.m(4);
                        var8++;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 47: {
                        ti.field_J = kj.field_a.a(false);
                        var12 = (CharSequence) (Object) ti.field_J;
                        in.field_b = cl.a(-95, var12);
                        a.field_d = kj.field_a.d((byte) -54);
                        qd.field_Q = pb.field_c;
                        if (tb.field_d.b(0) == hk.field_i) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (tb.field_d.b(0) != kl.field_a) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        hj.field_e.a(bm.c(-116), 447616545);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        ak.field_b.a(bm.c(-122), 447616545);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        ek.field_c = false;
                        if (var11 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        nc.a(bm.c(-93), var11, (byte) 78);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (0 < pj.field_a) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        if (!fa.field_b) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        try {
                            Object discarded$16 = lk.a("zap", bm.c(-111), 16715, new Object[1]);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        var8_ref_Throwable = caughtException;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 59: {
                        try {
                            Object discarded$17 = lk.a((byte) 18, "unzap", bm.c(-96));
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var8_ref_Throwable = caughtException;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (-1 > (pj.field_a ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        v.field_e = true;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        sn.field_c.b(v.field_b, -97);
                        var8 = 0;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (4 <= var8) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        v.field_b[var8] = v.field_b[var8] + 50;
                        var8++;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 68: {
                        kj.field_a.b(v.field_b, 107);
                        return oj.field_K;
                    }
                    case 69: {
                        if (!param1) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return -33;
                    }
                    case 71: {
                        if (bh.field_bb != qd.field_Q) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        if (!kj.b(-9319)) {
                            statePc = 80;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        si.a(-110);
                        if (7 != oj.field_K) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (ek.field_c) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        ek.field_c = true;
                        return -1;
                    }
                    case 76: {
                        if (7 == oj.field_K) {
                            statePc = 78;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        oj.field_K = 3;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        nf.field_g = kj.field_a.a(false);
                        ek.field_c = false;
                        return oj.field_K;
                    }
                    case 80: {
                        if (null == ci.field_i) {
                            statePc = 82;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (!ek.field_c) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        if ((qa.a(-125) ^ -1L) < -30001L) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        nf.field_g = l.field_a;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 85: {
                        nf.field_g = oi.field_K;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        ek.field_c = false;
                        return 3;
                    }
                    case 87: {
                        var6 = jc.field_E;
                        jc.field_E = ic.field_h;
                        ek.field_c = true;
                        ic.field_h = var6;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
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
        field_a = null;
        if (param0 != -10887) {
            field_a = null;
        }
        field_c = null;
    }

    public final String a(byte param0) {
        int var2 = -121 % ((-33 - param0) / 62);
        return "Make Ore Iron";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[10];
        var0 = 0;
        L0: while (true) {
          if (field_c.length <= var0) {
            field_d = 0;
          } else {
            L1: {
              if (var0 != 0) {
                field_c[var0] = 51 * (var0 + 1) << -1044268176;
                break L1;
              } else {
                field_c[var0] = 20 * var0 - -20 << 700938480;
                break L1;
              }
            }
            if (2 < var0) {
              field_c[var0] = hi.a(field_c[var0], (-2 + var0) * 22 << -482023032);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
