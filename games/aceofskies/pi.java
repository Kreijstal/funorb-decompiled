/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends mi {
    static qr field_x;
    private sp field_w;
    private int field_y;

    final boolean a(ea param0, byte param1) {
        if (param1 != -42) {
            String discarded$0 = ((pi) this).c((byte) 100);
            return false;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 != 4096) {
            field_x = (qr) null;
        }
        field_x = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        pt var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ea var12 = null;
        ll var13 = null;
        ll var14 = null;
        ll var15 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        this.a((byte) 125, param1, param2, param3);
        if (-1 != (param1 ^ -1)) {
          return;
        } else {
          L0: {
            var5 = (((pi) this).field_q >> -420562783) + (param3 - -((pi) this).field_p);
            var6 = (((pi) this).field_n >> -317302079) + param2 - -((pi) this).field_h;
            var8 = ((pi) this).field_w.b(true);
            if (param0 >= 64) {
              break L0;
            } else {
              var12 = (ea) null;
              boolean discarded$1 = ((pi) this).a((ea) null, (byte) -125);
              break L0;
            }
          }
          L1: {
            L2: {
              if (jc.field_Pc == var8) {
                break L2;
              } else {
                if (ce.field_t == var8) {
                  break L2;
                } else {
                  if (var8 != bt.field_a) {
                    if (fd.field_a != var8) {
                      break L1;
                    } else {
                      var14 = gu.field_c[1];
                      var14.d(-(((ll) var14).field_r >> 647311809) + var5, var6 - (((ll) var14).field_n >> 1640203009), 256);
                      break L1;
                    }
                  } else {
                    var13 = gu.field_c[2];
                    var13.d(var5 - (((ll) var13).field_r >> 1983209121), -(((ll) var13).field_n >> 252662177) + var6, 256);
                    break L1;
                  }
                }
              }
            }
            L3: {
              L4: {
                var15 = gu.field_c[0];
                var9 = ((ll) var15).field_v << -173158783;
                var10 = ((ll) var15).field_q << 1227037761;
                if (ms.field_c == null) {
                  break L4;
                } else {
                  if (ms.field_c.field_r < var9) {
                    break L4;
                  } else {
                    if (var10 > ms.field_c.field_n) {
                      break L4;
                    } else {
                      cm.a(ms.field_c, -14492);
                      vp.a();
                      break L3;
                    }
                  }
                }
              }
              ms.field_c = new ll(var9, var10);
              cm.a(ms.field_c, -14492);
              break L3;
            }
            var15.a(112, 144, ((ll) var15).field_v << -1059927036, ((ll) var15).field_q << -1803258908, -((pi) this).field_y << 1114728618, 4096);
            sl.c(2765);
            ms.field_c.d(var5 + -((ll) var15).field_v, -((ll) var15).field_q + var6, 256);
            break L1;
          }
          return;
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        ((pi) this).field_y = ((pi) this).field_y + 1;
        this.a((byte) 67, param1, param2, param3);
        if (param0 <= 13) {
            pi.a(-28);
        }
    }

    final String c(byte param0) {
        if (((pi) this).field_g) {
            return ((pi) this).field_w.a(true);
        }
        if (param0 <= -41) {
            return null;
        }
        ((pi) this).field_y = 87;
        return null;
    }

    final static int a(int param0, String param1, int param2, boolean param3, String param4, boolean param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
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
                        var9 = AceOfSkies.field_G ? 1 : 0;
                        if (ft.field_l != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!fp.a((byte) 82, param5)) {
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
                        if (qa.field_b != ca.field_f) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (!param5) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var10 = (String) null;
                        dq.field_a = wb.a(false, (String) null, param4, as.field_b, true);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        dq.field_a = op.a(param4, false, param1, false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        q.field_p.field_g = 0;
                        q.field_p.b(param2 + -1336879960, 14);
                        q.field_p.b(-1336879960, dq.field_a.a(param2 ^ -69).field_c);
                        fr.a(param2 + -21, -1);
                        ca.field_f = pg.field_a;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (ca.field_f != pg.field_a) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (wo.a(1, true)) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6 = nm.field_c.g(117);
                        if (0 == var6) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ca.field_f = aj.field_u;
                        qs.field_b = var6;
                        ag.field_s = -1;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        ca.field_f = qo.field_a;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        nm.field_c.field_g = 0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (qo.field_a == ca.field_f) {
                            statePc = 18;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!wo.a(8, true)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        of.field_a = nm.field_c.h((byte) 90);
                        nm.field_c.field_g = 0;
                        AceOfSkies.a(param0, param5, dq.field_a, param3, -12209);
                        ca.field_f = he.field_o;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (ca.field_f == he.field_o) {
                            statePc = 22;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!wo.a(1, true)) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var6 = nm.field_c.g(param2 ^ 63);
                        fb.field_b = null;
                        qs.field_b = var6;
                        nm.field_c.field_g = 0;
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if ((var6 ^ -1) == -2) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (8 != var6) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        te.b(true);
                        ld.field_d = false;
                        return var6;
                    }
                    case 27: {
                        ca.field_f = aj.field_u;
                        ag.field_s = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        ca.field_f = vc.field_a;
                        ag.field_s = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (vc.field_a != ca.field_f) {
                            statePc = 67;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (!rm.a(0)) {
                            statePc = 67;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        as.field_b = nm.field_c.h((byte) -87);
                        ln.field_d = nm.field_c.g(37);
                        int discarded$12 = nm.field_c.g(param2 ^ 103);
                        qr.field_a = nm.field_c.i((byte) 0);
                        var11 = nm.field_c.e((byte) -122);
                        var7 = nm.field_c.g(118);
                        if (0 != (1 & var7)) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        eu.b(param2 + 0);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (param5) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if ((var7 & 8) == 0) {
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
                        um.field_j = stackIn_38_0 != 0;
                        if ((var7 & 4) == 0) {
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
                        g.field_k = stackIn_41_0 != 0;
                        if (!um.field_j) {
                            statePc = 42;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        if (!gl.field_a) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        int discarded$13 = nm.field_c.g(-83);
                        int discarded$14 = nm.field_c.g(105);
                        int discarded$15 = nm.field_c.a((byte) 123);
                        ag.field_r = nm.field_c.i((byte) 0);
                        nc.field_c = new byte[ag.field_r];
                        var8 = 0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (ag.field_r <= var8) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        nc.field_c[var8] = nm.field_c.d(0);
                        var8++;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 46: {
                        fj.field_a = nm.field_c.h(-17883);
                        var12 = (CharSequence) fj.field_a;
                        cf.field_h = vu.a(param2 ^ 127, var12);
                        un.field_c = nm.field_c.g(param2 ^ -95);
                        ca.field_f = wq.field_e;
                        if (dq.field_a.a(-78) == jd.field_a) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        if (dq.field_a.a(-87) != ds.field_e) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        lp.field_f.a(bm.m(111), (byte) 8);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        ef.field_k.a(bm.m(param2 + 113), (byte) 125);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        ld.field_d = false;
                        if (var11 == null) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        sf.a((byte) -122, bm.m(123), var11);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (qr.field_a > 0) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        if (g.field_k) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        try {
                            Object discarded$16 = fe.a("unzap", (byte) -108, bm.m(115));
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        var8_ref_Throwable = caughtException;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$17 = fe.a("zap", -15201, new Object[1], bm.m(119));
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var8_ref_Throwable = caughtException;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (qr.field_a >= -1) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        te.field_h = true;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        q.field_p.a(true, bm.field_w);
                        var8 = 0;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (-5 <= var8) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        bm.field_w[var8] = bm.field_w[var8] + 50;
                        var8++;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 66: {
                        nm.field_c.a(true, bm.field_w);
                        return qs.field_b;
                    }
                    case 67: {
                        if (param2 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        field_x = (qr) null;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if (ca.field_f != aj.field_u) {
                            statePc = 83;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        if (!rm.a(0)) {
                            statePc = 83;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        te.b(true);
                        if (-8 == (qs.field_b ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        if (7 == qs.field_b) {
                            statePc = 74;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        qs.field_b = 3;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        rp.field_m = nm.field_c.h(-17883);
                        ld.field_d = false;
                        return qs.field_b;
                    }
                    case 76: {
                        if (ld.field_d) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        ld.field_d = true;
                        return -1;
                    }
                    case 78: {
                        if (7 == qs.field_b) {
                            statePc = 80;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        qs.field_b = 3;
                        statePc = 81;
                        continue stateLoop;
                    }
                    case 81: {
                        rp.field_m = nm.field_c.h(-17883);
                        ld.field_d = false;
                        return qs.field_b;
                    }
                    case 83: {
                        if (null == ft.field_l) {
                            statePc = 85;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (ld.field_d) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        var6 = sg.field_b;
                        sg.field_b = ca.field_h;
                        ca.field_h = var6;
                        ld.field_d = true;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 87: {
                        if (30000L < gm.g(-1)) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        rp.field_m = jf.field_b;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 89: {
                        rp.field_m = rm.field_c;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        ld.field_d = false;
                        return 3;
                    }
                    case 91: {
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

    pi(sp param0) {
        ((pi) this).field_w = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new qr();
    }
}
