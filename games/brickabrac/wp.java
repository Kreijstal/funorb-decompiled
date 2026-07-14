/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_i;
    private mf field_j;
    static dh field_c;
    static mh field_k;
    private mf field_g;
    static vl field_f;
    private si field_a;
    static char field_h;
    private si field_e;
    static String field_b;
    static String field_d;

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        L0: {
          var3 = -76 / ((81 - param0) / 37);
          if (tn.field_m == null) {
            break L0;
          } else {
            var4 = tn.field_m.a(param2, (byte) 95);
            if (-1 != (var4 ^ -1)) {
              L1: {
                if (2 != var4) {
                  break L1;
                } else {
                  if (tn.field_m.field_Mb == null) {
                    break L1;
                  } else {
                    if (!tn.field_m.field_Mb.equals((Object) (Object) "")) {
                      L2: {
                        if (tn.field_m.field_Mb.charAt(0) == 91) {
                          var5 = tn.field_m.field_Mb;
                          var6 = var5;
                          var6 = var5;
                          break L2;
                        } else {
                          var8 = (CharSequence) (Object) tn.field_m.field_Mb;
                          var5 = gb.a(var8, 57);
                          break L2;
                        }
                      }
                      L3: {
                        var6 = null;
                        if (-1 == (ij.field_d ^ -1)) {
                          var6 = jl.a(24943, var5, param1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if ((ij.field_d ^ -1) != -2) {
                          break L4;
                        } else {
                          var6 = op.a(param1, false, var5);
                          break L4;
                        }
                      }
                      L5: {
                        if ((ij.field_d ^ -1) == -3) {
                          var6 = me.a(var5, param1, 2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if ((ij.field_d ^ -1) != -4) {
                          break L6;
                        } else {
                          var6 = uf.a(var5, param1, var5, -45);
                          break L6;
                        }
                      }
                      L7: {
                        if (var6 == null) {
                          break L7;
                        } else {
                          var7 = null;
                          wp.a((byte) 92, 0, (String) null, var6, var5, 2);
                          break L7;
                        }
                      }
                      ij.field_d = -1;
                      tn.field_m = null;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ij.field_d = -1;
              tn.field_m = null;
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final oe a(int[] param0, String param1, int param2, String param3) {
        int var5 = ((wp) this).field_j.a(param3, false);
        if (-1 < (var5 ^ -1)) {
            return null;
        }
        if (param2 != 2) {
            Object var7 = null;
            oe discarded$0 = ((wp) this).a((byte) -29, (String) null, (String) null);
        }
        int var6 = ((wp) this).field_j.a(var5, -100, param1);
        if (-1 < (var6 ^ -1)) {
            return null;
        }
        return this.a(var6, 0, var5, param0);
    }

    private final oe a(int param0, int param1, int[] param2, int param3) {
        bk var9_ref = null;
        int var5 = ((param1 & -536866817) << -2102694780 | param1 >>> -543722036) ^ param0;
        var5 = var5 | param1 << 148882160;
        long var6 = (long)var5 ^ 4294967296L;
        oe var8 = (oe) (Object) ((wp) this).field_e.a(-87, var6);
        if (var8 != null) {
            return var8;
        }
        if (param3 != 0) {
            field_d = null;
        }
        if (param2 != null) {
            if ((param2[0] ^ -1) >= -1) {
                return null;
            }
        }
        bk var9 = (bk) (Object) ((wp) this).field_a.a(-87, var6);
        if (!(var9 != null)) {
            var9_ref = bk.a(((wp) this).field_g, param1, param0);
            if (var9_ref == null) {
                return null;
            }
            ((wp) this).field_a.a(34, (nm) (Object) var9_ref, var6);
        }
        oe var8_ref = var9_ref.a(param2);
        if (var8_ref == null) {
            return null;
        }
        var9_ref.b((byte) 111);
        ((wp) this).field_e.a(34, (nm) (Object) var8_ref, var6);
        return var8_ref;
    }

    final static void a(int param0, int param1) {
        ul.field_p = param1;
        if (!(null == m.field_f)) {
            m.field_f.a(param1, false);
        }
        if (!(null == dc.field_e)) {
            dc.field_e.a(true, param1);
        }
        if (param0 != 1) {
            field_i = null;
        }
    }

    final static int a(String param0, boolean param1, boolean param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_38_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_37_0;
            int stackOut_36_0;
            int stackOut_40_0;
            int stackOut_39_0;
            int stackOut_43_0;
            int stackOut_42_0;
            int stackOut_49_0;
            int stackOut_48_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = BrickABrac.field_J ? 1 : 0;
                        if (eq.field_g == null) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (ad.a(param1, 10000)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (pi.field_u != rf.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        cg.field_s = ih.a(param0, false, param5, (byte) -109);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        cg.field_s = he.a(sl.field_v, 20, false, param5, (String) null);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        k.field_h.field_l = 0;
                        k.field_h.a(28, 14);
                        k.field_h.a(107, cg.field_s.a(13).field_a);
                        cr.a(-1, 10000);
                        rf.field_b = gf.field_c;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (rf.field_b != gf.field_c) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (vd.a(20, 1)) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6 = jl.field_e.l(255);
                        jl.field_e.field_l = 0;
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        si.field_a = var6;
                        ga.field_j = -1;
                        rf.field_b = km.field_k;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        rf.field_b = dc.field_f;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (rf.field_b == dc.field_f) {
                            statePc = 17;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (!vd.a(20, 8)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        bj.field_ab = jl.field_e.g(-32768);
                        jl.field_e.field_l = 0;
                        mp.a(param4, cg.field_s, param1, param3, false);
                        rf.field_b = rq.field_c;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (rf.field_b == rq.field_c) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (!vd.a(20, 1)) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var6 = jl.field_e.l(255);
                        ai.field_t = null;
                        si.field_a = var6;
                        jl.field_e.field_l = 0;
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var6 == 1) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-9 == (var6 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        ga.field_j = -1;
                        rf.field_b = km.field_k;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 26: {
                        hn.a((byte) 52);
                        pf.field_d = false;
                        return var6;
                    }
                    case 27: {
                        ga.field_j = -1;
                        rf.field_b = fo.field_g;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (rf.field_b != fo.field_g) {
                            statePc = 78;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (!um.b((byte) -80)) {
                            statePc = 78;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        sl.field_v = jl.field_e.g(-32768);
                        gd.field_b = param5;
                        kb.field_Yb = jl.field_e.l(255);
                        gh.field_f = jl.field_e.l(255);
                        go.field_c = jl.field_e.i(65280);
                        var11 = jl.field_e.m(0);
                        var7 = jl.field_e.l(255);
                        if ((var7 & 1) != 0) {
                            statePc = 32;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        n.a(-1);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (!param1) {
                            statePc = 35;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if ((var7 & 2) == 0) {
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
                        qo.field_I = stackIn_38_0 != 0;
                        if (-1 == (8 & var7)) {
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
                        um.field_e = stackIn_41_0 != 0;
                        if (-1 == (4 & var7)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        oo.field_r = stackIn_44_0 != 0;
                        if (um.field_e) {
                            statePc = 46;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        qo.field_I = true;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (-1 == (16 & var7 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        ii.field_j = stackIn_50_0 != 0;
                        if (ec.field_O) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        int discarded$10 = jl.field_e.l(255);
                        int discarded$11 = jl.field_e.l(255);
                        int discarded$12 = jl.field_e.e(255);
                        ta.field_f = jl.field_e.i(65280);
                        gg.field_q = new byte[ta.field_f];
                        var8 = 0;
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (ta.field_f <= var8) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        gg.field_q[var8] = jl.field_e.b(true);
                        var8++;
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 55: {
                        tb.field_cb = jl.field_e.d(-1);
                        var12 = (CharSequence) (Object) tb.field_cb;
                        ih.field_d = gb.a(var12, 65);
                        fp.field_x = jl.field_e.l(255);
                        rf.field_b = q.field_i;
                        if (cg.field_s.a(13) == vh.field_X) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        if (cg.field_s.a(13) == de.field_v) {
                            statePc = 58;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        ll.field_d.a(112, uc.e((byte) -81));
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        uc.field_k.a(100, uc.e((byte) -66));
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        pf.field_d = false;
                        if (var11 == null) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        ui.a(-70, uc.e((byte) -112), var11);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (0 < go.field_c) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        if (oo.field_r) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            Object discarded$13 = ne.a("unzap", -121, uc.e((byte) -100));
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 68: {
                        try {
                            Object discarded$14 = ne.a(new Object[1], 116, uc.e((byte) -75), "zap");
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        if (-1 > (go.field_c ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        qb.field_u = true;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        k.field_h.a(lc.field_a, -98);
                        var8 = 0;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if ((var8 ^ -1) <= -5) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        lc.field_a[var8] = lc.field_a[var8] + 50;
                        var8++;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 77: {
                        jl.field_e.a(lc.field_a, -62);
                        return si.field_a;
                    }
                    case 78: {
                        if (param2) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        field_h = 'ﾢ';
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        if (rf.field_b == km.field_k) {
                            statePc = 82;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (um.b((byte) -41)) {
                            statePc = 84;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        hn.a((byte) 58);
                        if ((si.field_a ^ -1) != -8) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (pf.field_d) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        pf.field_d = true;
                        return -1;
                    }
                    case 87: {
                        if (si.field_a != 7) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        si.field_a = 3;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        eo.field_e = jl.field_e.d(-1);
                        pf.field_d = false;
                        return si.field_a;
                    }
                    case 90: {
                        if (eq.field_g == null) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (pf.field_d) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        var6 = dl.field_b;
                        dl.field_b = pj.field_a;
                        pf.field_d = true;
                        pj.field_a = var6;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 94: {
                        if (30000L >= de.f(-6792)) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        eo.field_e = hg.field_b;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 96: {
                        eo.field_e = gd.field_e;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 97: {
                        pf.field_d = false;
                        return 3;
                    }
                    case 98: {
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

    final static void a(byte param0, int param1, String param2, String param3, String param4, int param5) {
        if (param0 != 92) {
            wp.a(100, 53);
        }
        gb var6 = new gb(param5, param4, param1, param2, param3);
        n.a(0, var6);
    }

    private final oe a(String param0, byte param1, String param2, int[] param3) {
        int var5 = ((wp) this).field_g.a(param0, false);
        if (-1 < (var5 ^ -1)) {
            return null;
        }
        if (param1 >= -45) {
            field_i = null;
        }
        int var6 = ((wp) this).field_g.a(var5, -67, param2);
        if (var6 < 0) {
            return null;
        }
        return this.a(var6, var5, param3, 0);
    }

    final static void a(int param0, oe param1) {
        if (param0 != 8) {
            return;
        }
        l discarded$0 = vp.a(param0 ^ 100, param1);
    }

    final oe a(String param0, String param1, byte param2) {
        if (param2 < 107) {
            Object var5 = null;
            oe discarded$0 = this.a((int[]) null, (String) null, 67, (String) null);
        }
        return this.a((int[]) null, param0, 2, param1);
    }

    final oe a(int[] param0, int param1, int param2) {
        if ((((wp) this).field_j.c(-97) ^ -1) == -2) {
            return this.a(param1, 0, 0, param0);
        }
        if ((((wp) this).field_j.c(-80, param1) ^ -1) == -2) {
            return this.a(0, 0, param1, param0);
        }
        if (param2 > -124) {
            return null;
        }
        throw new RuntimeException();
    }

    final static void a(boolean param0, byte param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = dl.field_f;
        if (0 == var2) {
            uf.a(3, 0);
        }
        nj var3 = (nj) (Object) ob.field_E.d(-31);
        while (var3 != null) {
            var3.c(0);
            var3 = (nj) (Object) ob.field_E.a((byte) 116);
        }
        if (param0) {
            uf.a(var2 + -dl.field_f, 0);
        }
        if (param1 >= -30) {
            field_f = null;
        }
    }

    final oe a(int param0, int[] param1, int param2) {
        if (!(((wp) this).field_g.c(-124) != 1)) {
            return this.a(param0, 0, param1, 0);
        }
        if (1 == ((wp) this).field_g.c(-90, param0)) {
            return this.a(0, param0, param1, 0);
        }
        if (param2 <= 48) {
            wp.a(-14, -17);
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_i = null;
        field_k = null;
        if (param0 >= -99) {
            Object var2 = null;
            int discarded$0 = wp.a((String) null, true, true, true, -106, (String) null);
        }
        field_b = null;
        field_c = null;
    }

    final oe a(byte param0, String param1, String param2) {
        int var4 = 11 / ((param0 - -37) / 59);
        return this.a(param2, (byte) -109, param1, (int[]) null);
    }

    private final oe a(int param0, int param1, int param2, int[] param3) {
        if (param1 != 0) {
            ((wp) this).field_j = null;
        }
        int var5 = param0 ^ (param2 >>> 674790860 | (-1342173185 & param2) << 627103524);
        var5 = var5 | param2 << 253046448;
        long var6 = (long)var5;
        oe var8 = (oe) (Object) ((wp) this).field_e.a(param1 ^ -88, var6);
        if (var8 != null) {
            return var8;
        }
        if (param3 != null) {
            if (0 >= param3[0]) {
                return null;
            }
        }
        dr var9 = dr.a(((wp) this).field_j, param2, param0);
        if (var9 == null) {
            return null;
        }
        oe var10 = var9.a();
        oe var8_ref = var10;
        ((wp) this).field_e.a(param1 ^ 34, (nm) (Object) var8_ref, var6);
        if (param3 != null) {
            param3[0] = param3[0] - var10.field_m.length;
        }
        return var8_ref;
    }

    wp(mf param0, mf param1) {
        ((wp) this).field_a = new si(256);
        ((wp) this).field_e = new si(256);
        ((wp) this).field_j = param0;
        ((wp) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Play the game without logging in just yet";
        field_h = '/';
        field_b = "RuneScape clan";
        field_f = new vl();
    }
}
