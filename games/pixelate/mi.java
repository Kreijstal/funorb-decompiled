/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends de {
    static boolean field_o;

    final void c(byte param0) {
        if (param0 >= -13) {
            mi.e(-14);
        }
    }

    final void a(int param0) {
        ((mi) this).b((byte) -71);
        int var2 = -1 != (go.field_k ^ -1) ? 1 : 0;
        int var3 = null != wh.field_p ? 1 : 0;
        String var7 = bc.field_p;
        if (param0 != 11) {
            mi.b(false);
        }
        String var8 = var7 + " " + ub.a(sd.a(bf.a(param0 + -99, false, var3 != 0, var2 != 0), param0 ^ 50, new String[1]), param0 + -11, "<br><br>", '#');
        tc var5 = qj.field_e;
        int var6 = 1 + var5.field_z + var5.field_w;
        int discarded$0 = var5.a(var8, 50, 150, 540, 10 * var6, 16777215, 0, 1, 0, var6);
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        ph var3 = null;
        L0: {
          var2 = Pixelate.field_H ? 1 : 0;
          if (0 == ki.field_f) {
            L1: {
              if (0 != (ii.field_q ^ -1)) {
                ii.field_q = -1;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ph) (Object) pl.field_Y.d(-28918);
            if (var3 == null) {
              break L0;
            } else {
              ii.field_q = var3.field_k;
              ki.field_f = 300;
              nn.field_a = qj.field_e.c(tn.field_n[ii.field_q]) + 56;
              gk.field_bb = 50 - -nn.field_a;
              break L0;
            }
          } else {
            ki.field_f = ki.field_f - 1;
            if (ki.field_f < 16) {
              var1 = 16 - ki.field_f;
              gk.field_bb = var1 * (var1 * (50 - -nn.field_a)) >> 1693966632;
              break L0;
            } else {
              if (284 < ki.field_f) {
                var1 = ki.field_f - 284;
                gk.field_bb = var1 * (nn.field_a + 50) * var1 >> 1770064488;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -121) {
            break L2;
          } else {
            hh[] discarded$1 = mi.a(71, 124, 48, -115);
            break L2;
          }
        }
    }

    final static hh[] a(int param0, int param1, int param2, int param3) {
        hh[] var4 = null;
        int var5 = 0;
        boolean[] var6 = null;
        hh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hh[] var11 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        var11 = al.field_c[param2][param0];
        var4 = var11;
        if (var4 != null) {
          var5 = var11.length;
          var6 = new boolean[var5];
          var7 = new hh[param1];
          var8 = 0;
          L0: while (true) {
            if (var7.length <= var8) {
              L1: {
                if (param3 == 20) {
                  break L1;
                } else {
                  mi.b(true);
                  break L1;
                }
              }
              return var7;
            } else {
              var9 = ok.a(tg.field_f, param3 ^ -118, var5);
              L2: while (true) {
                if (!var6[var9]) {
                  var6[var9] = true;
                  var7[var8] = var11[var9];
                  var8++;
                  continue L0;
                } else {
                  var9++;
                  if (var5 <= var9) {
                    var9 = 0;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int d(int param0, int param1) {
        if (param0 != -4096) {
            int discarded$0 = mi.a(126, 19, (byte) -117);
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
            return param1 >= 6144 ? -k.field_i[-param1 + 8192] : -k.field_i[param1 + -4096];
        }
        return -2049 < (param1 ^ -1) ? k.field_i[param1] : k.field_i[-param1 + 4096];
    }

    mi(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static int a(boolean param0, byte param1, String param2, int param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_37_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Pixelate.field_H ? 1 : 0;
                        if (null != sh.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (wb.a(0, param4)) {
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
                        if (ij.field_o == uk.field_s) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (param4) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        li.field_g = k.a(param2, false, -61, param5);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        li.field_g = ck.a(param2, (String) null, false, vn.field_b, 83);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        aa.field_f.field_m = 0;
                        aa.field_f.e(160, 14);
                        aa.field_f.e(160, li.field_g.b(-27096).field_a);
                        vg.b(-1, 10000);
                        uk.field_s = cn.field_a;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (uk.field_s == cn.field_a) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (!rd.a(1, false)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6 = vi.field_o.f(255);
                        vi.field_o.field_m = 0;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        uk.field_s = ke.field_b;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        mn.field_e = var6;
                        uk.field_s = sl.field_b;
                        jj.field_b = -1;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (uk.field_s == ke.field_b) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (rd.a(8, false)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        gj.field_P = vi.field_o.a(false);
                        vi.field_o.field_m = 0;
                        io.a(param4, -67, li.field_g, param3, param0);
                        uk.field_s = kk.field_b;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (kk.field_b != uk.field_s) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (rd.a(1, false)) {
                            statePc = 23;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var6 = vi.field_o.f(255);
                        sc.field_a = null;
                        vi.field_o.field_m = 0;
                        mn.field_e = var6;
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
                        if ((var6 ^ -1) == -9) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        uk.field_s = sl.field_b;
                        jj.field_b = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 27: {
                        na.a(true);
                        qj.field_b = false;
                        return var6;
                    }
                    case 28: {
                        jj.field_b = -1;
                        uk.field_s = e.field_d;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (e.field_d == uk.field_s) {
                            statePc = 31;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!in.e(-18481)) {
                            statePc = 76;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        vn.field_b = vi.field_o.a(false);
                        hq.field_t = param2;
                        wo.field_h = vi.field_o.f(255);
                        rj.field_I = vi.field_o.f(255);
                        uo.field_j = vi.field_o.a((byte) -116);
                        var6_ref = vi.field_o.e((byte) 79);
                        var7 = vi.field_o.f(255);
                        if (-1 == (var7 & 1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        tm.d((byte) -51);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (-1 == (16 & var7)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        mg.field_l = stackIn_37_0 != 0;
                        if (param4) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        if (0 == (var7 & 2)) {
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
                        lh.field_g = stackIn_41_0 != 0;
                        if (-1 == (8 & var7)) {
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
                        ln.field_q = stackIn_44_0 != 0;
                        if (-1 == (4 & var7)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        wg.field_a = stackIn_47_0 != 0;
                        if (!ln.field_q) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        lh.field_g = true;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (vm.field_d) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        int discarded$10 = vi.field_o.f(255);
                        int discarded$11 = vi.field_o.f(255);
                        int discarded$12 = vi.field_o.k(0);
                        mo.field_k = vi.field_o.a((byte) -115);
                        dc.field_b = new byte[mo.field_k];
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (mo.field_k <= var8) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        dc.field_b[var8] = vi.field_o.a(0);
                        var8++;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 54: {
                        kn.field_J = vi.field_o.h(5);
                        var11 = (CharSequence) (Object) kn.field_J;
                        eq.field_Hb = dh.a(var11, (byte) 54);
                        ra.field_g = vi.field_o.f(255);
                        uk.field_s = Pixelate.field_G;
                        if (li.field_g.b(-27096) == l.field_r) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (li.field_g.b(-27096) != te.field_Nb) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        vm.field_a.a(ao.a(13867), -80419032);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        ig.field_e.a(ao.a(13867), -80419032);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        qj.field_b = false;
                        if (var6_ref != null) {
                            statePc = 60;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        rd.a(var6_ref, 126, ao.a(13867));
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if ((uo.field_j ^ -1) < -1) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        if (!wg.field_a) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$13 = cq.a(ao.a(13867), (byte) -37, new Object[1], "zap");
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var8_ref_Throwable = caughtException;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 67: {
                        try {
                            Object discarded$14 = cq.a("unzap", (byte) -56, ao.a(13867));
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        var8_ref_Throwable = caughtException;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (-1 <= (uo.field_j ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        uj.field_Lb = true;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        aa.field_f.a(0, ud.field_L);
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        if (var8 >= 4) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        ud.field_L[var8] = ud.field_L[var8] + 50;
                        var8++;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 75: {
                        vi.field_o.a(0, ud.field_L);
                        return mn.field_e;
                    }
                    case 76: {
                        if (sl.field_b != uk.field_s) {
                            statePc = 87;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (in.e(-18481)) {
                            statePc = 79;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        na.a(true);
                        if (mn.field_e != -8) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (!qj.field_b) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (-8 == mn.field_e) {
                            statePc = 84;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        mn.field_e = 3;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        gi.field_b = vi.field_o.h(5);
                        qj.field_b = false;
                        return mn.field_e;
                    }
                    case 86: {
                        qj.field_b = true;
                        return -1;
                    }
                    case 87: {
                        var6 = 51 % ((-18 - param1) / 46);
                        if (null == sh.field_e) {
                            statePc = 89;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (!qj.field_b) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (-30001L <= (no.d(8) ^ -1L)) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        gi.field_b = vc.field_N;
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 92: {
                        gi.field_b = ho.field_b;
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 93: {
                        qj.field_b = false;
                        return 3;
                    }
                    case 94: {
                        var7 = gd.field_g;
                        gd.field_g = cd.field_b;
                        cd.field_b = var7;
                        qj.field_b = true;
                        statePc = 95;
                        continue stateLoop;
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

    final static void a(boolean param0, float param1, int param2, String param3) {
        if (cn.field_b == null) {
            cn.field_b = new ko(wa.field_c, wp.field_a);
            wa.field_c.b(-6183, (ng) (Object) cn.field_b);
        }
        if (param2 != -1) {
            field_o = false;
        }
        cn.field_b.a(param3, param1, 7595, param0);
        t.d();
        rj.a(94, true);
    }

    final static int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        int var3 = 0;
        int var4 = de.field_h;
        if (param2 > -72) {
            field_o = true;
        }
        while (var3 < vm.field_e.length) {
            var5 = fo.field_a[var3];
            if (var5 < 0) {
                var4 = var4 + hq.field_r;
            } else {
                var6 = sb.a(3, vm.field_e[var3], true);
                var4 = var4 + ko.field_fb;
                var7 = -(var6 >> -1407803871) + qe.field_u;
                if (mn.a(param0, var4, 9, gk.field_fb + (bd.field_c << 1296509121), var7 + -hc.field_J, param1, (hc.field_J << 840803105) + var6)) {
                    return var5;
                }
                var4 = var4 + (gk.field_fb + ko.field_fb + (bd.field_c << -1496593663));
            }
            var3++;
        }
        return -1;
    }

    final static void b(boolean param0) {
        ho.field_g.a(0, 18, 0, 256, -(!f.field_n ? 0 : 40 + hk.field_b - -4) + oc.field_O.field_K);
        if (param0) {
            field_o = false;
        }
        l.field_s.a(0, 18, -40 + (-hk.field_b + (oc.field_O.field_K + -2)), 256, 42 - -hk.field_b);
        jm.field_b.a(0, 2, (byte) 102, oc.field_O.field_K, 20, oc.field_O.field_nb - 20, hk.field_b);
    }

    static {
    }
}
