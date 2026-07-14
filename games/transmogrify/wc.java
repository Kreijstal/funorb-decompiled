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
            int var6 = 0;
            int var7 = 0;
            String var7_ref = null;
            int var8 = 0;
            Throwable var9_ref_Throwable = null;
            int var9 = 0;
            int var10 = 0;
            Object var11 = null;
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
                        var10 = Transmogrify.field_A ? 1 : 0;
                        if (null != nk.field_b) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (gk.a(param4, -23)) {
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
                        if (jk.field_y != lj.field_z) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (param4) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ll.field_V = bf.a(param5, (byte) 41, false, param2);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 6: {
                        var11 = null;
                        ll.field_V = dk.a((String) null, ac.field_j, false, param2, 126);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ff.field_D.field_h = 0;
                        ff.field_D.f(6389, 14);
                        ff.field_D.f(6389, ll.field_V.a(-184).field_a);
                        rb.a(-1, -377);
                        lj.field_z = g.field_y;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (g.field_y == lj.field_z) {
                            statePc = 10;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (!ue.a(1, 0)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var6 = nf.field_l.d((byte) 125);
                        if (-1 == (var6 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ca.field_e = var6;
                        tg.field_a = -1;
                        lj.field_z = aa.field_e;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        lj.field_z = lb.field_e;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        nf.field_l.field_h = 0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (lj.field_z == lb.field_e) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (ue.a(8, 0)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        fd.field_g = nf.field_l.e((byte) -115);
                        nf.field_l.field_h = 0;
                        tb.a(ll.field_V, param0, param3, param4, 122);
                        lj.field_z = ck.field_I;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var6 = -17 / ((-59 - param1) / 55);
                        if (lj.field_z == ck.field_I) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!ue.a(1, 0)) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var7 = nf.field_l.d((byte) 110);
                        ca.field_e = var7;
                        e.field_I = null;
                        nf.field_l.field_h = 0;
                        if (-1 == var7) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-2 != var7) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        lj.field_z = pj.field_w;
                        tg.field_a = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 27: {
                        if (-9 != (var7 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        pc.a(1);
                        ej.field_k = false;
                        return var7;
                    }
                    case 29: {
                        lj.field_z = aa.field_e;
                        tg.field_a = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (lj.field_z == pj.field_w) {
                            statePc = 32;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (ce.a(0)) {
                            statePc = 34;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        ac.field_j = nf.field_l.e((byte) 117);
                        va.field_j = nf.field_l.d((byte) 58);
                        int discarded$12 = nf.field_l.d((byte) 93);
                        wj.field_o = nf.field_l.a((byte) -118);
                        var7_ref = nf.field_l.j(-1640531527);
                        var8 = nf.field_l.d((byte) 82);
                        if (-1 == (1 & var8)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        rb.a((byte) -114);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (param4) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (-1 == (var8 & 4)) {
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
                        el.field_g = stackIn_40_0 != 0;
                        if ((8 & var8) == 0) {
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
                        ub.field_d = stackIn_43_0 != 0;
                        if (!ub.field_d) {
                            statePc = 44;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        if (kc.field_D) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        int discarded$13 = nf.field_l.d((byte) 63);
                        int discarded$14 = nf.field_l.d((byte) 33);
                        int discarded$15 = nf.field_l.c((byte) -119);
                        ai.field_c = nf.field_l.a((byte) -119);
                        td.field_c = new byte[ai.field_c];
                        var9 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var9 >= ai.field_c) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        td.field_c[var9] = nf.field_l.b(true);
                        var9++;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 49: {
                        w.field_a = nf.field_l.g(12248);
                        var12 = (CharSequence) (Object) w.field_a;
                        kf.field_e = hj.a((byte) -128, var12);
                        db.field_d = nf.field_l.d((byte) 123);
                        lj.field_z = ll.field_Q;
                        if (ll.field_V.a(-184) != wh.field_I) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        aa.field_d.a(ha.b(95), 0);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 51: {
                        if (ll.field_V.a(-184) != vc.field_G) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        of.field_f.a(ha.b(101), 0);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        ej.field_k = false;
                        if (var7_ref == null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        v.a(0, var7_ref, ha.b(121));
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (0 < wj.field_o) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        if (!el.field_g) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$16 = kj.a(22102, "zap", new Object[1], ha.b(106));
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var9_ref_Throwable = caughtException;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 61: {
                        try {
                            Object discarded$17 = kj.a(ha.b(87), false, "unzap");
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var9_ref_Throwable = caughtException;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (wj.field_o >= -1) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        wd.field_g = true;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        ff.field_D.a((byte) -68, mf.field_c);
                        var9 = 0;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (-5 <= var9) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        mf.field_c[var9] = mf.field_c[var9] + 50;
                        var9++;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 69: {
                        nf.field_l.a((byte) -74, mf.field_c);
                        return ca.field_e;
                    }
                    case 70: {
                        if (aa.field_e != lj.field_z) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        if (!ce.a(0)) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        pc.a(1);
                        if ((ca.field_e ^ -1) != -8) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (ej.field_k) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        ej.field_k = true;
                        return -1;
                    }
                    case 75: {
                        if (7 == ca.field_e) {
                            statePc = 77;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        ca.field_e = 3;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        Transmogrify.field_B = nf.field_l.g(12248);
                        ej.field_k = false;
                        return ca.field_e;
                    }
                    case 79: {
                        if (null != nk.field_b) {
                            statePc = 86;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (ej.field_k) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        var7 = lf.field_c;
                        lf.field_c = kf.field_p;
                        kf.field_p = var7;
                        ej.field_k = true;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 82: {
                        if (-30001L <= (mc.b(true) ^ -1L)) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        Transmogrify.field_B = ng.field_h;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 84: {
                        Transmogrify.field_B = bd.field_s;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        ej.field_k = false;
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

    private wc() throws Throwable {
        throw new Error();
    }

    final static cj a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            cj var5 = null;
            fg var5_ref = null;
            Object stackIn_2_0 = null;
            cj stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            cj stackOut_3_0 = null;
            try {
              var4 = Class.forName("dd");
              if (param0 == 4) {
                return (cj) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5 = (cj) var4.newInstance();
              var5.a(param3, param2, param1, (byte) -126);
              stackOut_3_0 = (cj) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final rk b(int param0, int param1) {
        byte[] var4 = null;
        rk var3 = (rk) ((wc) this).field_c.a(17699, (long)param1);
        if (var3 != null) {
            return var3;
        }
        if ((param1 ^ -1) <= -32769) {
            var4 = ((wc) this).field_e.a((byte) -93, 32767 & param1, 1);
        } else {
            var4 = ((wc) this).field_f.a((byte) -93, param1, 1);
        }
        rk var3_ref = new rk();
        if (var4 != null) {
            var3_ref.a(new oa(var4), param0 ^ -2);
        }
        if (!(32768 > param1)) {
            var3_ref.c((byte) 52);
        }
        if (param0 != 1) {
            field_d = 125;
        }
        ((wc) this).field_c.a((Object) (Object) var3_ref, -22137, (long)param1);
        return var3_ref;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7) {
            Object var2 = null;
            cj discarded$0 = wc.a(60, (java.awt.Component) null, -102, -105);
        }
    }

    final static void a(byte param0) {
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
        int var15 = 0;
        int var16 = 0;
        hj var17 = null;
        int[][] var21 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        var14 = nf.field_l;
        var17 = var14;
        var2 = var17.d((byte) 108);
        var3 = (ng) (Object) kf.field_o.a((byte) -95);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 == var3.field_m) {
                break L1;
              } else {
                var3 = (ng) (Object) kf.field_o.a(true);
                continue L0;
              }
            }
          }
          if (var3 == null) {
            pc.a(1);
            return;
          } else {
            L2: {
              var5 = -102 % ((77 - param0) / 39);
              var4 = var17.d((byte) 78);
              if (0 == var4) {
                break L2;
              } else {
                var6 = var3.field_k;
                kf.field_k[0] = w.field_a;
                var7_int = 1;
                L3: while (true) {
                  if (var4 <= var7_int) {
                    he.a(var6, var4, 24070);
                    var7_int = 0;
                    L4: while (true) {
                      if (var7_int >= var4) {
                        jj.a((byte) -93, var6);
                        var7 = new String[2][var6];
                        var21 = new int[2][var6 * 4];
                        var9 = cg.field_l;
                        var10 = 0;
                        var11 = 0;
                        L5: while (true) {
                          if (var9 <= var10) {
                            var15 = 0;
                            var10 = var15;
                            var16 = 0;
                            var11 = var16;
                            L6: while (true) {
                              if (var15 >= var9) {
                                break L2;
                              } else {
                                var12 = lk.field_d[var15 + var6];
                                var7[1][var16] = kf.field_k[var12];
                                var21[1][var16 * 4] = dk.field_k[var12];
                                var21[1][var16 * 4 - -1] = bh.field_a[var12];
                                var21[1][2 + var16 * 4] = pd.field_a[var12];
                                var21[1][3 + var16 * 4] = bg.field_j[var12];
                                if (qg.a(kf.field_k[var12], (byte) -111)) {
                                  if (bg.field_j[var12] + (bh.field_a[var12] + pd.field_a[var12]) == 0) {
                                    var7[1][var16] = null;
                                    var16--;
                                    var15++;
                                    var16++;
                                    continue L6;
                                  } else {
                                    var15++;
                                    var16++;
                                    continue L6;
                                  }
                                } else {
                                  var15++;
                                  var16++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var12 = lk.field_d[var10];
                            var7[0][var11] = kf.field_k[var12];
                            var21[0][var11 * 4] = dk.field_k[var12];
                            var21[0][1 + var11 * 4] = bh.field_a[var12];
                            var21[0][2 + 4 * var11] = pd.field_a[var12];
                            var21[0][var11 * 4 - -3] = bg.field_j[var12];
                            if (qg.a(kf.field_k[var12], (byte) -128)) {
                              if (pd.field_a[var12] + bh.field_a[var12] - -bg.field_j[var12] == 0) {
                                var7[0][var11] = null;
                                var11--;
                                var11++;
                                var10++;
                                continue L5;
                              } else {
                                var11++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var11++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        th.a(101, (oa) (Object) var17);
                        if (0 != var7_int) {
                          vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_int, false);
                          var7_int++;
                          continue L4;
                        } else {
                          vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_int, false);
                          var7_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    kf.field_k[var7_int] = var14.g(12248);
                    var7_int++;
                    continue L3;
                  }
                }
              }
            }
            var3.c(5);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = true;
    }
}
