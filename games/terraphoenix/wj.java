/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_e;
    static t field_c;
    static int field_a;
    static String field_d;
    static String field_b;
    static String field_f;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 <= 2) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Terraphoenix.field_V;
          if (me.field_o <= 0) {
            if (bk.c(-25704)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null == ab.field_b) {
                a.field_b = jb.a(480, 640, 0, 0, (byte) 112, nj.field_l);
                break L1;
              } else {
                a.field_b = ab.field_b.b(0);
                ig.a(2, 12);
                break L1;
              }
            }
            if (null != a.field_b) {
              am.a((byte) -114, (java.awt.Canvas) (Object) a.field_b);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        L2: {
          if (ab.field_b != null) {
            break L2;
          } else {
            if (!hf.field_t) {
              break L2;
            } else {
              ja.a(param0 ^ 124, param1, var2);
              break L2;
            }
          }
        }
        L3: {
          if (param0 == 2) {
            break L3;
          } else {
            wj.a(8, true);
            break L3;
          }
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, boolean param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Terraphoenix.field_V;
                        if (ig.field_e == null) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!le.a(param0, (byte) 117)) {
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
                        if (va.field_e != mh.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        am.field_K = ji.a(-1, param3, false, param2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        var10 = null;
                        am.field_K = nh.a(oj.field_y, false, -95, param2, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        di.field_l.field_k = 0;
                        di.field_l.i(14, 28);
                        di.field_l.i(am.field_K.c(0).field_c, -115);
                        bc.a(-1, 0);
                        mh.field_a = s.field_c;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param1 == 29398) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        int discarded$14 = wj.a(-111);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (mh.field_a != s.field_c) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (!vc.a(-113, 1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = mk.field_j.a(-16384);
                        mk.field_j.field_k = 0;
                        if (0 != var6) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        mh.field_a = cb.field_J;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        qk.field_b = var6;
                        mh.field_a = vf.field_c;
                        qh.field_d = -1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (mh.field_a == cb.field_J) {
                            statePc = 19;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (!vc.a(-110, 8)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        kd.field_c = mk.field_j.h((byte) 78);
                        mk.field_j.field_k = 0;
                        gj.a(param0, param4, 1, am.field_K, param5);
                        mh.field_a = af.field_b;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (mh.field_a == af.field_b) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (vc.a(-115, 1)) {
                            statePc = 25;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = mk.field_j.a(param1 + -45782);
                        og.field_e = null;
                        qk.field_b = var6;
                        mk.field_j.field_k = 0;
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (1 == var6) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        mh.field_a = vf.field_c;
                        qh.field_d = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 29: {
                        gb.g(-17464);
                        vj.field_Q = false;
                        return var6;
                    }
                    case 30: {
                        mh.field_a = gb.field_B;
                        qh.field_d = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (gb.field_B == mh.field_a) {
                            statePc = 33;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (cm.b((byte) -61)) {
                            statePc = 35;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        oj.field_y = mk.field_j.h((byte) 78);
                        mm.field_e = mk.field_j.a(-16384);
                        int discarded$15 = mk.field_j.a(param1 ^ -19754);
                        me.field_o = mk.field_j.i(param1 + -54976);
                        var6_ref = mk.field_j.j(param1 ^ -1915102434);
                        var7 = mk.field_j.a(param1 ^ -19754);
                        if (0 != (var7 & 1)) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        wh.b(96);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (param0) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        if (-1 == (4 & var7 ^ -1)) {
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
                        si.field_gb = stackIn_42_0 != 0;
                        if (0 == (8 & var7)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        fh.field_g = stackIn_45_0 != 0;
                        if (!fh.field_g) {
                            statePc = 46;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        if (!hf.field_x) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        int discarded$16 = mk.field_j.a(-16384);
                        int discarded$17 = mk.field_j.a(-16384);
                        int discarded$18 = mk.field_j.f((byte) -107);
                        kf.field_g = mk.field_j.i(param1 ^ -4416);
                        r.field_O = new byte[kf.field_g];
                        var8 = 0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (kf.field_g <= var8) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        r.field_O[var8] = mk.field_j.f(2);
                        var8++;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 50: {
                        kj.field_f = mk.field_j.e(-1);
                        var11 = (CharSequence) (Object) kj.field_f;
                        jj.field_e = hm.a((byte) 2, var11);
                        db.field_b = mk.field_j.a(-16384);
                        mh.field_a = od.field_g;
                        if (am.field_K.c(0) != rj.field_a) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        te.field_g.a(dg.a(false), (byte) 117);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 52: {
                        if (am.field_K.c(param1 ^ 29398) == hf.field_s) {
                            statePc = 54;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        gf.field_u.a(dg.a(false), (byte) 117);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        vj.field_Q = false;
                        if (var6_ref != null) {
                            statePc = 57;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        hk.a(var6_ref, (byte) 3, dg.a(false));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        if (0 < me.field_o) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        if (!si.field_gb) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        try {
                            Object discarded$19 = cd.a(dg.a(false), "zap", new Object[1], 10056);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var8_ref_Throwable = caughtException;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$20 = cd.a((byte) -128, "unzap", dg.a(false));
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var8_ref_Throwable = caughtException;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (me.field_o <= 0) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        jm.field_c = true;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        di.field_l.a(ab.field_g, 16888);
                        var8 = 0;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (4 <= var8) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        ab.field_g[var8] = ab.field_g[var8] + 50;
                        var8++;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 72: {
                        mk.field_j.a(ab.field_g, 16888);
                        return qk.field_b;
                    }
                    case 73: {
                        if (vf.field_c != mh.field_a) {
                            statePc = 85;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (!cm.b((byte) -39)) {
                            statePc = 85;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        gb.g(-17464);
                        if (-8 == (qk.field_b ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (7 != qk.field_b) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        qk.field_b = 3;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        bh.field_d = mk.field_j.e(-1);
                        vj.field_Q = false;
                        return qk.field_b;
                    }
                    case 79: {
                        if (vj.field_Q) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        vj.field_Q = true;
                        return -1;
                    }
                    case 81: {
                        if (7 != qk.field_b) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        qk.field_b = 3;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        bh.field_d = mk.field_j.e(-1);
                        vj.field_Q = false;
                        return qk.field_b;
                    }
                    case 85: {
                        if (null == ig.field_e) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        return -1;
                    }
                    case 87: {
                        if (vj.field_Q) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        var6 = sb.field_i;
                        sb.field_i = pg.field_f;
                        pg.field_f = var6;
                        vj.field_Q = true;
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 89: {
                        if (30000L >= ce.b(1)) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        bh.field_d = qk.field_f;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 91: {
                        bh.field_d = cl.field_I;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        vj.field_Q = false;
                        return 3;
                    }
                    case 93: {
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

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0) {
        if (param0 >= -17) {
            field_c = null;
        }
        return ng.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Mission ";
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_d = "Sergeant ";
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_c = new t();
    }
}
