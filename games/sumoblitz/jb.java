/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jb extends se {
    private String field_f;
    private long field_g;
    static int field_e;
    static int field_h;

    final void a(fs param0, byte param1) {
        param0.a(false, ((jb) this).field_g);
        param0.a(((jb) this).field_f, 27);
        if (param1 > -107) {
            Object var4 = null;
            ((jb) this).a((fs) null, (byte) -83);
        }
    }

    final static String a(fs param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            var3_int = param0.e(false);
            if (var3_int > param1) {
              var3_int = param1;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_p = param0.field_p + ga.field_g.a(0, param0.field_p, var4, 116, var3_int, param0.field_n);
          var5 = sd.a(var4, 0, var3_int, 26564);
          if (param2 == -14832) {
            return (String) (Object) stackIn_5_0;
          } else {
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_6_0 = (String) var5;
          stackIn_7_0 = stackOut_6_0;
        }
        return null;
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var6 = null;
            String var5 = null;
            String var8 = null;
            bf.field_d = param1;
            try {
                int var4 = 82 / ((param0 - -62) / 49);
                var7 = param2.getParameter("cookieprefix");
                var6 = var7;
                var6 = var7;
                var5 = param2.getParameter("cookiehost");
                var6 = var5;
                var6 = var5;
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var5;
                var6 = var8;
                var6 = var8;
                if (param1.length() == 0) {
                    var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var6 = var8 + "; Expires=" + fi.a(94608000000L + wq.a(-6), true) + "; Max-Age=" + 94608000L;
                }
                tw.a("document.cookie=\"" + var6 + "\"", -15428, param2);
            } catch (Throwable throwable) {
            }
            va.a(false, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_38_0 = 0;
            int stackIn_41_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_37_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Sumoblitz.field_L ? 1 : 0;
                        if (param2 >= 15) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return -61;
                    }
                    case 2: {
                        if (qk.field_O != null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if (!nd.a((byte) -34, param3)) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return -1;
                    }
                    case 6: {
                        if (kw.field_c != gg.field_t) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        kb.field_d = os.a(false, param0, param5, (byte) -94);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        kb.field_d = ds.a(lb.field_a, false, (String) null, param5, false);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        as.field_v.field_p = 0;
                        as.field_v.b((byte) 42, 14);
                        as.field_v.b((byte) 96, kb.field_d.a((byte) 126).field_c);
                        gt.a(0, -1);
                        kw.field_c = gi.field_g;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (kw.field_c == gi.field_g) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (kw.field_c != sc.field_q) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (!ju.b(-1, 8)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        oc.field_g = ig.field_a.a((byte) 127);
                        ig.field_a.field_p = 0;
                        fb.a(param3, param1, -12793, param4, kb.field_d);
                        kw.field_c = jj.field_f;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 15: {
                        if (kw.field_c != sc.field_q) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (!ju.b(-1, 8)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        oc.field_g = ig.field_a.a((byte) 127);
                        ig.field_a.field_p = 0;
                        fb.a(param3, param1, -12793, param4, kb.field_d);
                        kw.field_c = jj.field_f;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (kw.field_c == jj.field_f) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (!ju.b(-1, 1)) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var6 = ig.field_a.e(-31302);
                        iw.field_a = var6;
                        ig.field_a.field_p = 0;
                        rp.field_b = null;
                        if (var6 == -1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (-2 != var6) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        kw.field_c = uu.field_l;
                        gu.field_d = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 26: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        kw.field_c = sp.field_z;
                        gu.field_d = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        kk.a((byte) -128);
                        sr.field_g = false;
                        return var6;
                    }
                    case 29: {
                        if (kw.field_c != uu.field_l) {
                            statePc = 68;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (!lt.a((byte) 119)) {
                            statePc = 68;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        lb.field_a = ig.field_a.a((byte) 114);
                        ku.field_j = ig.field_a.e(-31302);
                        int discarded$12 = ig.field_a.e(-31302);
                        ct.field_x = ig.field_a.a(255);
                        var6_ref = ig.field_a.g((byte) 92);
                        var7 = ig.field_a.e(-31302);
                        if ((var7 & 1) != 0) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        fu.f(24);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (param3) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if (-1 == (4 & var7)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        wo.field_c = stackIn_38_0 != 0;
                        if (-1 == (var7 & 8)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        cb.field_b = stackIn_41_0 != 0;
                        if (cb.field_b) {
                            statePc = 42;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        if (!gn.field_d) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        int discarded$13 = ig.field_a.e(-31302);
                        int discarded$14 = ig.field_a.e(-31302);
                        int discarded$15 = ig.field_a.c(true);
                        pl.field_y = ig.field_a.a(255);
                        sm.field_b = new byte[pl.field_y];
                        var8 = 0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var8 >= pl.field_y) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        sm.field_b[var8] = ig.field_a.d(true);
                        var8++;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 46: {
                        qv.field_o = ig.field_a.d(-1);
                        var11 = (CharSequence) (Object) qv.field_o;
                        tc.field_f = uk.a(-1, var11);
                        jk.field_c = ig.field_a.e(-31302);
                        kw.field_c = ga.field_j;
                        if (kb.field_d.a((byte) 113) != pb.field_b) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        go.field_m.a(true, ra.c(2));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 48: {
                        if (kb.field_d.a((byte) 89) != hh.field_c) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        tr.field_j.a(true, ra.c(2));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        sr.field_g = false;
                        if (var6_ref != null) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        jb.a((byte) -118, var6_ref, ra.c(2));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (ct.field_x > 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        if (!wo.field_c) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        try {
                            Object discarded$16 = tw.a(-111, ra.c(2), "zap", new Object[1]);
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
                            Object discarded$17 = tw.a(ra.c(2), 93, "unzap");
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
                        if (ct.field_x >= -1) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        qn.field_a = true;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        as.field_v.a((byte) 64, bk.field_e);
                        var8 = 0;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (-5 <= var8) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        bk.field_e[var8] = bk.field_e[var8] + 50;
                        var8++;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 67: {
                        ig.field_a.a((byte) 123, bk.field_e);
                        return iw.field_a;
                    }
                    case 68: {
                        if (kw.field_c == sp.field_z) {
                            statePc = 70;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        if (!lt.a((byte) 119)) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        kk.a((byte) -115);
                        if (-8 != (iw.field_a ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        if (!sr.field_g) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (7 != iw.field_a) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        iw.field_a = 3;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 76: {
                        ns.field_c = ig.field_a.d(-1);
                        sr.field_g = false;
                        return iw.field_a;
                    }
                    case 77: {
                        sr.field_g = true;
                        return -1;
                    }
                    case 78: {
                        if (qk.field_O == null) {
                            statePc = 80;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (sr.field_g) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        var6 = vp.field_a;
                        vp.field_a = nb.field_b;
                        sr.field_g = true;
                        nb.field_b = var6;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 82: {
                        if (uc.b(26560) <= 30000L) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        ns.field_c = ar.field_F;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 84: {
                        ns.field_c = nd.field_G;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        sr.field_g = false;
                        return 3;
                    }
                    case 86: {
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

    nb a(byte param0) {
        if (param0 < 80) {
            Object var3 = null;
            jb.a((byte) -100, (String) null, (java.applet.Applet) null);
        }
        return hh.field_c;
    }

    final static wb a(String param0, String param1, int param2, ki param3) {
        int var4 = param3.a(0, param0);
        int var5 = param3.a(var4, param1, (byte) 127);
        int var6 = -88 % ((-10 - param2) / 46);
        return na.a(var5, -11481, param3, var4);
    }

    jb(long param0, String param1) {
        ((jb) this).field_g = param0;
        ((jb) this).field_f = param1;
    }

    static {
    }
}
