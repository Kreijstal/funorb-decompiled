/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends gj implements da {
    private bb field_I;
    private bb field_J;
    static int field_H;
    static dd field_G;
    private bb field_F;

    final static void a(int param0, int param1, byte param2) {
        af.field_b = param0;
        vc.field_f = param1;
        if (param2 < 61) {
            rb.a(-16, 15, (byte) 71);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = fleas.field_A ? 1 : 0;
        if (param3 != 248) {
            rb.a(-65, -100, (byte) -84);
        }
        if (param4 == ((rb) this).field_F) {
            na.a((byte) -81);
        } else {
            if (param4 != ((rb) this).field_J) {
                // if_acmpne L75
                ak.a(65);
            } else {
                oh.d(false);
            }
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
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
                        var9 = fleas.field_A ? 1 : 0;
                        if (null != sg.field_h) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (id.a(false, param2)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return -1;
                    }
                    case 3: {
                        if (rh.field_k == d.field_O) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (!param2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var10 = null;
                        cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        cf.field_c = lk.a(param1, false, (byte) -35, param3);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ud.field_b.field_i = 0;
                        ud.field_b.a(-11, 14);
                        ud.field_b.a(-11, cf.field_c.a(true).field_c);
                        dk.b((byte) 41, -1);
                        rh.field_k = je.field_P;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (rh.field_k != je.field_P) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (ef.field_h != rh.field_k) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (!gi.a(8, true)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ug.field_a = ae.field_a.f(-71);
                        ae.field_a.field_i = 0;
                        wd.a(param2, -120, cf.field_c, param4, param0);
                        rh.field_k = dl.field_w;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 13: {
                        if (ef.field_h != rh.field_k) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (!gi.a(8, true)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        ug.field_a = ae.field_a.f(-71);
                        ae.field_a.field_i = 0;
                        wd.a(param2, -120, cf.field_c, param4, param0);
                        rh.field_k = dl.field_w;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (dl.field_w == rh.field_k) {
                            statePc = 19;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (gi.a(1, true)) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var6 = ae.field_a.e(false);
                        be.field_a = var6;
                        ae.field_a.field_i = 0;
                        wc.field_p = null;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (var6 != 1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        pd.field_l = -1;
                        rh.field_k = ll.field_r;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var6 == 8) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        rh.field_k = pi.field_g;
                        pd.field_l = -1;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        k.c(-28354);
                        aa.field_q = false;
                        return var6;
                    }
                    case 28: {
                        if (ll.field_r == rh.field_k) {
                            statePc = 30;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (!gf.b(-128)) {
                            statePc = 70;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        aj.field_w = ae.field_a.f(-109);
                        qe.field_k = ae.field_a.e(false);
                        int discarded$12 = ae.field_a.e(false);
                        wc.field_q = ae.field_a.d((byte) -116);
                        var11 = ae.field_a.a((byte) -115);
                        var7 = ae.field_a.e(false);
                        if ((var7 & 1) != 0) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        f.d((byte) -37);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (!param2) {
                            statePc = 36;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if ((var7 & 4) == -1) {
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
                        ed.field_a = stackIn_39_0 != 0;
                        if (-1 == (var7 & 8)) {
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
                        ee.field_i = stackIn_42_0 != 0;
                        if (!ee.field_i) {
                            statePc = 43;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (!bk.field_e) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        int discarded$13 = ae.field_a.e(false);
                        int discarded$14 = ae.field_a.e(false);
                        int discarded$15 = ae.field_a.c((byte) 123);
                        ge.field_g = ae.field_a.d((byte) -117);
                        gi.field_c = new byte[ge.field_g];
                        var8 = 0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (ge.field_g <= var8) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        gi.field_c[var8] = ae.field_a.i(-127);
                        var8++;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 47: {
                        b.field_e = ae.field_a.h(0);
                        var12 = (CharSequence) (Object) b.field_e;
                        ma.field_a = uk.a(92, var12);
                        nb.field_h = ae.field_a.e(false);
                        rh.field_k = fh.field_b;
                        if (cf.field_c.a(true) == wa.field_g) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (cf.field_c.a(true) == mk.field_i) {
                            statePc = 50;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        wd.field_b.a(true, rl.a((byte) -116));
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 51: {
                        ml.field_F.a(true, rl.a((byte) -111));
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        aa.field_q = false;
                        if (var11 != null) {
                            statePc = 54;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        ea.a(376, rl.a((byte) -120), var11);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (0 < wc.field_q) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        if (ed.field_a) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$16 = eb.a("unzap", rl.a((byte) -65), -250);
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
                            Object discarded$17 = eb.a("zap", new Object[1], -11745, rl.a((byte) -126));
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
                        if (0 >= wc.field_q) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        va.field_m = true;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        ud.field_b.a(ue.field_a, (byte) 12);
                        var8 = 0;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (4 <= var8) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        ue.field_a[var8] = ue.field_a[var8] + 50;
                        var8++;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 69: {
                        ae.field_a.a(ue.field_a, (byte) 12);
                        return be.field_a;
                    }
                    case 70: {
                        if (param5 < -19) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        return 13;
                    }
                    case 72: {
                        if (pi.field_g == rh.field_k) {
                            statePc = 74;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (!gf.b(115)) {
                            statePc = 87;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        k.c(-28354);
                        if (7 == be.field_a) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (be.field_a == 7) {
                            statePc = 78;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        be.field_a = 3;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        fh.field_a = ae.field_a.h(0);
                        aa.field_q = false;
                        return be.field_a;
                    }
                    case 80: {
                        if (!aa.field_q) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (be.field_a == 7) {
                            statePc = 83;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        be.field_a = 3;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        fh.field_a = ae.field_a.h(0);
                        aa.field_q = false;
                        return be.field_a;
                    }
                    case 85: {
                        aa.field_q = true;
                        return -1;
                    }
                    case 87: {
                        if (sg.field_h == null) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        return -1;
                    }
                    case 89: {
                        if (aa.field_q) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        var6 = be.field_b;
                        be.field_b = ab.field_d;
                        ab.field_d = var6;
                        aa.field_q = true;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 91: {
                        if (-30001L <= (h.b(102) ^ -1L)) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        fh.field_a = ok.field_B;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 93: {
                        fh.field_a = jc.field_d;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        aa.field_q = false;
                        return 3;
                    }
                    case 95: {
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
        field_G = null;
        if (param0 > -95) {
            Object var2 = null;
            rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = ((rb) this).field_y + param1;
        int var6 = ((rb) this).field_z + param0;
        int discarded$0 = ug.field_e.a(rd.field_b, var5 + 20, var6 - -20, ((rb) this).field_u - 40, ((rb) this).field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
        super.b(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param1 ^ -1) != -99) {
            if (param1 == 99) {
              return ((rb) this).a(32, param2);
            } else {
              return false;
            }
          } else {
            return ((rb) this).b(param2, -28533);
          }
        }
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        ((rb) this).field_J = new bb(qk.field_h, (kd) null);
        ((rb) this).field_F = new bb(qj.field_J, (kd) null);
        ((rb) this).field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        ((rb) this).field_J.field_p = (ch) (Object) var1;
        ((rb) this).field_F.field_p = (ch) (Object) var1;
        ((rb) this).field_I.field_p = (ch) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1935077055;
        ((rb) this).field_F.a(-var3 + ((rb) this).field_u >> -2073875711, var4, -var2 + ((rb) this).field_j + -48, 30, 80);
        ((rb) this).field_I.a(var2 + (var4 + (-var3 + ((rb) this).field_u >> -348715167)), var4, -var2 + (-48 + ((rb) this).field_j), 30, 80);
        ((rb) this).field_J.a(((rb) this).field_u - var3 >> -1481717663, var3, ((rb) this).field_j - (78 + var2 * 2), 30, 80);
        ((rb) this).field_F.field_s = (kd) this;
        ((rb) this).field_J.field_s = (kd) this;
        ((rb) this).field_J.field_m = se.field_f;
        ((rb) this).field_I.field_s = (kd) this;
        ((rb) this).field_I.field_m = ga.field_n;
        ((rb) this).a((qa) (Object) ((rb) this).field_F, (byte) -39);
        ((rb) this).a((qa) (Object) ((rb) this).field_J, (byte) -59);
        ((rb) this).a((qa) (Object) ((rb) this).field_I, (byte) -53);
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, byte param6, int param7, int param8) {
        bh.field_l = param2;
        li.field_i = param8;
        ei.field_V = param1;
        if (param6 <= 119) {
          return;
        } else {
          aj.field_q = param7;
          t.field_d = param0;
          kh.field_d = param5;
          wa.field_m = param4;
          pb.field_g = param3;
          return;
        }
    }

    static {
    }
}
