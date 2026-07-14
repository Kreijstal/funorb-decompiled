/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends java.awt.Canvas implements java.awt.event.FocusListener {
    static hl[] field_e;
    static d[] field_c;
    static String field_a;
    java.awt.Frame field_f;
    volatile boolean field_b;
    static int field_g;
    static int field_d;

    final static void a(hl[] param0, int param1, int param2, hl[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9, int param10, qe param11, int param12, int param13, qe param14) {
        int var15 = -85 / ((param5 - -30) / 62);
        Object var16 = null;
        rc.a(0, param2, 0, 31944, sd.field_a, param12, 480, param7, sb.field_m, param1, ig.field_b, param14, param6, param0, param9, param13, (hl[]) null, param3, param11, param10, param4);
        se.a(param8, 480);
    }

    final static void a(fb param0, byte param1) {
        int var2 = 0;
        fb var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = StarCannon.field_A;
        if (param0.field_h != null) {
          L0: {
            L1: {
              if (param0.field_i != 0) {
                break L1;
              } else {
                if (-1 != (param0.field_b ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (wi.field_b <= var2) {
                break L0;
              } else {
                var3 = lf.field_bb[var2];
                if (var3.field_q == 2) {
                  if (var3.field_i == param0.field_i) {
                    if (param0.field_b == var3.field_b) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1 < -36) {
              break L3;
            } else {
              var5 = null;
              qc.a((fb) null, (byte) -81);
              break L3;
            }
          }
          L4: {
            if (null == param0.field_a) {
              break L4;
            } else {
              break L4;
            }
          }
          mg.a((byte) 92, param0);
          return;
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((qc) this).field_b = true;
    }

    final void a(ka param0, byte param1) {
        int var3 = -27 / ((param1 - 68) / 49);
        eg.a(((qc) this).field_f, (byte) -47, param0);
    }

    final static void a(java.awt.Component param0, byte param1) {
        int var2 = -16 / ((-9 - param1) / 60);
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) hj.field_c);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) hj.field_c);
    }

    qc() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(boolean param0) {
        if (!(null == fa.field_G)) {
            fa.field_G.n(-110);
        }
        if (param0) {
            return;
        }
        n.field_l = new hg();
        t.field_h.c(20317, (uj) (Object) n.field_l);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static int a(String param0, boolean param1, int param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (m.field_b != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!jh.a((byte) -68, param3)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (r.field_c != ua.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (!param3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var10 = null;
                        jh.field_h = ik.a(param0, -66, cb.field_a, (String) null, false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        jh.field_h = ll.a(false, (byte) -49, param5, param0);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        d.field_b.field_g = 0;
                        d.field_b.a(14, -51);
                        d.field_b.a(jh.field_h.b((byte) 1).field_j, -92);
                        nf.a(-1, (byte) 95);
                        r.field_c = wc.field_d;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param4 == -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var9 = null;
                        qc.a((hl[]) null, -12, 123, (hl[]) null, 4, 6, -76, 11, true, -78, -110, (qe) null, 9, 62, (qe) null);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (wc.field_d == r.field_c) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (!ag.a(127, 1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = se.field_p.j(7909);
                        se.field_p.field_g = 0;
                        if (var6 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        vh.field_t = var6;
                        r.field_c = mg.field_i;
                        il.field_g = -1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        r.field_c = od.field_f;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (r.field_c != od.field_f) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (ag.a(127, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        mi.field_o = se.field_p.c((byte) 5);
                        se.field_p.field_g = 0;
                        se.a(param3, jh.field_h, 0, param2, param1);
                        r.field_c = uc.field_a;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (uc.field_a == r.field_c) {
                            statePc = 23;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (!ag.a(123, 1)) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = se.field_p.j(7909);
                        lj.field_c = null;
                        vh.field_t = var6;
                        se.field_p.field_g = 0;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (1 == var6) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (8 == var6) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        r.field_c = mg.field_i;
                        il.field_g = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 28: {
                        ec.a((byte) 27);
                        eb.field_f = false;
                        return var6;
                    }
                    case 29: {
                        r.field_c = dd.field_b;
                        il.field_g = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (r.field_c == dd.field_b) {
                            statePc = 32;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (!fk.a(false)) {
                            statePc = 71;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        cb.field_a = se.field_p.c((byte) 5);
                        ad.field_y = se.field_p.j(7909);
                        int discarded$12 = se.field_p.j(7909);
                        u.field_d = se.field_p.i(param4 ^ 1174051991);
                        var6_ref = se.field_p.b((byte) 108);
                        var7 = se.field_p.j(7909);
                        if (-1 != (1 & var7)) {
                            statePc = 35;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        gd.a(24);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (!param3) {
                            statePc = 38;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 38: {
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
                        gd.field_g = stackIn_41_0 != 0;
                        if ((4 & var7) == 0) {
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
                        jh.field_d = stackIn_44_0 != 0;
                        if (!gd.field_g) {
                            statePc = 45;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        if (!qa.field_e) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        int discarded$13 = se.field_p.j(param4 ^ -7910);
                        int discarded$14 = se.field_p.j(param4 ^ -7910);
                        int discarded$15 = se.field_p.f((byte) -105);
                        na.field_f = se.field_p.i(-1174051992);
                        qb.field_m = new byte[na.field_f];
                        var8 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var8 >= na.field_f) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        qb.field_m[var8] = se.field_p.a(false);
                        var8++;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 49: {
                        we.field_i = se.field_p.a(-110);
                        var11 = (CharSequence) (Object) we.field_i;
                        ba.field_e = ni.a(param4 ^ -117, var11);
                        jj.field_F = se.field_p.j(7909);
                        r.field_c = pb.field_a;
                        if (jh.field_h.b((byte) 1) != j.field_d) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        p.field_a.a(ll.b(100), true);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 51: {
                        if (jh.field_h.b((byte) 1) != na.field_b) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        bh.field_b.a(ll.b(119), true);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        eb.field_f = false;
                        if (var6_ref == null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        lj.a(var6_ref, 118, ll.b(param4 + 81));
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (-1 > (u.field_d ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        if (!jh.field_d) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$16 = mb.a(new Object[1], ll.b(114), "zap", -27504);
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
                            Object discarded$17 = mb.a(ll.b(param4 + 89), "unzap", true);
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
                        if (u.field_d > 0) {
                            statePc = 66;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        ah.field_i = true;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        d.field_b.a(jl.field_b, (byte) 122);
                        var8 = 0;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if (var8 >= 4) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        jl.field_b[var8] = jl.field_b[var8] + 50;
                        var8++;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 70: {
                        se.field_p.a(jl.field_b, (byte) -82);
                        return vh.field_t;
                    }
                    case 71: {
                        if (mg.field_i != r.field_c) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        if (!fk.a(false)) {
                            statePc = 80;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        ec.a((byte) 27);
                        if (vh.field_t != -8) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (!eb.field_f) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (-8 != vh.field_t) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        vh.field_t = 3;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        uj.field_r = se.field_p.a(-94);
                        eb.field_f = false;
                        return vh.field_t;
                    }
                    case 79: {
                        eb.field_f = true;
                        return -1;
                    }
                    case 80: {
                        if (m.field_b == null) {
                            statePc = 82;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (!eb.field_f) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        if ((kg.b((byte) -71) ^ -1L) < -30001L) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        uj.field_r = va.field_o;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 85: {
                        uj.field_r = ti.field_g;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        eb.field_f = false;
                        return 3;
                    }
                    case 87: {
                        var6 = sj.field_I;
                        sj.field_I = pe.field_c;
                        pe.field_c = var6;
                        eb.field_f = true;
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
        field_c = null;
        if (param0 != -1) {
            Object var2 = null;
            qc.a((fb) null, (byte) -51);
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Proxima liberated<br><br>Level 3<br>Destroy the Paragulan homeworld fleet";
        field_c = new d[4000];
    }
}
