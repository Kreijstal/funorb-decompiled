/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wn extends qm implements a {
    static kc field_D;
    static String field_x;
    static String field_A;
    static km field_z;
    static int field_y;
    static int field_C;
    qm field_B;

    final boolean a(int param0, qm param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((wn) this).field_B = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((wn) this).field_B) {
              break L2;
            } else {
              if (!((wn) this).field_B.a(0, param1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void e(int param0) {
        field_z = null;
        field_x = null;
        if (param0 != 23123) {
            Object var2 = null;
            int discarded$0 = wn.a(-25, -49, false, (String) null, false, (String) null);
        }
        field_A = null;
        field_D = null;
    }

    final void d(byte param0) {
        if (param0 != 29) {
            field_y = -126;
        }
        if (null != ((wn) this).field_B) {
            ((wn) this).field_B.d((byte) 29);
        }
    }

    final static int a(int param0, int param1, boolean param2, String param3, boolean param4, String param5) {
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
            int stackIn_48_0 = 0;
            int stackIn_54_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ArcanistsMulti.field_G ? 1 : 0;
                        if (null != ch.field_c) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ie.a(-62, param4)) {
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
                        if (param1 >= 22) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 41;
                    }
                    case 5: {
                        if (pc.field_g == ob.field_eb) {
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
                        fd.field_e = cf.a(param3, param5, (byte) -128, false);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        fd.field_e = ci.a(false, (String) null, -95, fk.field_k, param5);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        he.field_e.field_g = 0;
                        he.field_e.f(14, (byte) -105);
                        he.field_e.f(fd.field_e.a(0).field_g, (byte) -106);
                        we.a(-1, (byte) 86);
                        ob.field_eb = pe.field_Db;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (ob.field_eb != pe.field_Db) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (pe.a((byte) -86, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = df.field_z.e((byte) -123);
                        df.field_z.field_g = 0;
                        if (0 == var6) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        on.field_g = var6;
                        fj.field_h = -1;
                        ob.field_eb = lf.field_f;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        ob.field_eb = go.field_c;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (ob.field_eb != go.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!pe.a((byte) -86, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        of.field_j = df.field_z.c(-943038560);
                        df.field_z.field_g = 0;
                        dn.a(param4, fd.field_e, (byte) 116, param2, param0);
                        ob.field_eb = co.field_h;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (ob.field_eb == co.field_h) {
                            statePc = 22;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (pe.a((byte) -86, 1)) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = df.field_z.e((byte) -122);
                        df.field_z.field_g = 0;
                        rj.field_i = null;
                        on.field_g = var6;
                        if (var6 == -1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (-2 != var6) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        ob.field_eb = bb.field_c;
                        fj.field_h = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 28: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        fj.field_h = -1;
                        ob.field_eb = lf.field_f;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        ka.b(false);
                        bb.field_h = false;
                        return var6;
                    }
                    case 31: {
                        if (ob.field_eb != bb.field_c) {
                            statePc = 81;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (pn.b(-12564)) {
                            statePc = 34;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        fk.field_k = df.field_z.c(-943038560);
                        fn.field_f = param5;
                        qf.field_d = df.field_z.e((byte) 115);
                        ib.field_r = df.field_z.e((byte) 93);
                        ah.field_c = df.field_z.n(-98);
                        var6_ref = df.field_z.g(103);
                        var7 = df.field_z.e((byte) -94);
                        if ((1 & var7) != 0) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        j.b(-69);
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (!param4) {
                            statePc = 39;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 39: {
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
                        fd.field_a = stackIn_42_0 != 0;
                        if (0 == (var7 & 2)) {
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
                        ld.field_p = stackIn_45_0 != 0;
                        if ((var7 & 8) == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        wh.field_g = stackIn_48_0 != 0;
                        if (wh.field_g) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        ld.field_p = true;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (0 == (16 & var7)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        ag.field_E = stackIn_54_0 != 0;
                        if (fl.field_a) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        int discarded$8 = df.field_z.e((byte) 110);
                        ne.field_g = df.field_z.e((byte) -115);
                        int discarded$9 = df.field_z.d(-10674);
                        wd.field_d = df.field_z.n(-98);
                        ra.field_f = new byte[wd.field_d];
                        var8 = 0;
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if (var8 >= wd.field_d) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        ra.field_f[var8] = df.field_z.o(6);
                        var8++;
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 59: {
                        ah.field_b = df.field_z.l(-1);
                        var11 = (CharSequence) (Object) ah.field_b;
                        nm.field_b = gk.a(var11, -13);
                        dd.field_j = df.field_z.e((byte) 65);
                        ob.field_eb = qc.field_c;
                        if (fd.field_e.a(0) == k.field_q) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        if (fd.field_e.a(0) == hk.field_m) {
                            statePc = 62;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        of.field_n.a(cd.e(120), (byte) -118);
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 63: {
                        ea.field_y.a(cd.e(118), (byte) -93);
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        bb.field_h = false;
                        if (var6_ref == null) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        jf.a(var6_ref, cd.e(108), 0);
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (0 < ah.field_c) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        if (fd.field_a) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        try {
                            Object discarded$10 = ei.a(cd.e(125), 108, "unzap");
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        var8_ref_Throwable = caughtException;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 72: {
                        try {
                            Object discarded$11 = ei.a("zap", cd.e(113), (byte) 114, new Object[1]);
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        var8_ref_Throwable = caughtException;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if (-1 <= (ah.field_c ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        lk.field_d = true;
                        statePc = 77;
                        continue stateLoop;
                    }
                    case 77: {
                        he.field_e.b(-107, hj.field_a);
                        var8 = 0;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        if ((var8 ^ -1) <= -5) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        hj.field_a[var8] = hj.field_a[var8] + 50;
                        var8++;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 80: {
                        df.field_z.b(90, hj.field_a);
                        return on.field_g;
                    }
                    case 81: {
                        if (ob.field_eb != lf.field_f) {
                            statePc = 90;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (pn.b(-12564)) {
                            statePc = 84;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        ka.b(false);
                        if (7 != on.field_g) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (bb.field_h) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        bb.field_h = true;
                        return -1;
                    }
                    case 87: {
                        if ((on.field_g ^ -1) != -8) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        on.field_g = 3;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        me.field_E = df.field_z.l(-1);
                        bb.field_h = false;
                        return on.field_g;
                    }
                    case 90: {
                        if (null == ch.field_c) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (bb.field_h) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        var6 = ng.field_G;
                        ng.field_G = dh.field_Lb;
                        bb.field_h = true;
                        dh.field_Lb = var6;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 94: {
                        if ((rk.a(-68) ^ -1L) >= -30001L) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        me.field_E = tg.field_a;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 96: {
                        me.field_E = wl.field_R;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 97: {
                        bb.field_h = false;
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

    String b(boolean param0) {
        String var3 = null;
        String var2 = this.b(param0);
        if (!(((wn) this).field_B == null)) {
            var3 = ((wn) this).field_B.b(param0);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    qm a(int param0) {
        if (param0 < 31) {
            return null;
        }
        qm var2 = ((wn) this).field_B;
        if (var2 == null) {
            return null;
        }
        if (!var2.d(-2116)) {
            return null;
        }
        return var2;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5 = 43 % ((param3 - 50) / 60);
        if (((wn) this).a(param0, (byte) -90, param2, param1)) {
            ((wn) this).a(param0, param1, param2, 1);
            ((wn) this).a(0, param2, param0, param1);
        }
        return param0;
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            boolean discarded$0 = ((wn) this).d(-106);
        }
        return null != ((wn) this).a(103) ? true : false;
    }

    wn(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param2 == 0) {
            if (!(null == ((wn) this).field_r)) {
                ((wn) this).field_r.a((qm) this, 5592405, param1, param3, true);
            }
        }
        if (param0 > -52) {
            int discarded$0 = ((wn) this).c(14);
        }
        if (!(((wn) this).field_B == null)) {
            ((wn) this).field_B.a((byte) -100, param1 + ((wn) this).field_n, param2, param3 - -((wn) this).field_j);
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        StringBuilder discarded$0 = param2.append(10);
        for (var5 = param0; var5 <= param3; var5++) {
            StringBuilder discarded$1 = param2.append(32);
        }
        if (((wn) this).field_B == null) {
            StringBuilder discarded$3 = param2.append("null");
        } else {
            StringBuilder discarded$4 = ((wn) this).field_B.a(param2, 1 + param3, param1, (byte) -93);
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            wn.a((byte) 24, (dj) null);
        }
        return ((wn) this).field_B == null ? 0 : ((wn) this).field_B.c(0);
    }

    private final boolean a(qm param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 0) {
          L0: {
            L1: {
              if (null == ((wn) this).field_B) {
                break L1;
              } else {
                if (((wn) this).field_B.d(param1 ^ -2116)) {
                  break L1;
                } else {
                  if (!((wn) this).field_B.a(param1 ^ 0, param0)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        if (!(null == ((wn) this).field_B)) {
            ((wn) this).field_B.a(param0, -20592, param2, ((wn) this).field_j + param3, ((wn) this).field_n + param4, param5);
        }
        if (param1 != -20592) {
            field_C = 79;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param5 == 0) {
            break L0;
          } else {
            ((wn) this).field_B = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((wn) this).field_B == null) {
              break L2;
            } else {
              if (!((wn) this).field_B.d(-2116)) {
                break L2;
              } else {
                if (!((wn) this).field_B.a(param0, param1, param2, param3, param4, 0, param6)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (((wn) this).field_B != null) {
            if (((wn) this).field_B.d(-2116)) {
                if (!(!((wn) this).field_B.a(param0, (byte) -127, param2, param3))) {
                    return true;
                }
            }
        }
        if (param1 > -120) {
            String discarded$0 = ((wn) this).b(false);
        }
        int var5 = param3;
        if (-81 != (var5 ^ -1)) {
            return false;
        }
        return !ri.field_b[81] ? this.a(false, param0) : this.a(param0, 0);
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var8 = -70 % ((-42 - param4) / 35);
            if (null == ((wn) this).field_B) {
              break L1;
            } else {
              if (!((wn) this).field_B.a(param0, param1, param2, param3 + ((wn) this).field_j, 53, param5, ((wn) this).field_n + param6)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final static void a(byte param0, dj param1) {
        if (param0 != 111) {
            Object var3 = null;
            wn.a((byte) 9, (dj) null);
        }
        mc.field_b = param1;
    }

    void a(qm param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
        if (!(null == ((wn) this).field_B)) {
            ((wn) this).field_B.a(param0, ((wn) this).field_n + param1, param2 ^ 0, ((wn) this).field_j + param3);
        }
    }

    void a(byte param0) {
        if (param0 != -75) {
            Object var3 = null;
            boolean discarded$0 = this.a(true, (qm) null);
        }
        if (null != ((wn) this).field_B) {
            ((wn) this).field_B.e((byte) 100);
        }
    }

    private final boolean a(boolean param0, qm param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (null == ((wn) this).field_B) {
                break L1;
              } else {
                if (((wn) this).field_B.d(-2116)) {
                  break L1;
                } else {
                  if (!((wn) this).field_B.a(0, param1)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
            Object var7 = null;
            ((wn) this).a(-47, (Hashtable) null, (StringBuilder) null, -126);
        }
        this.a(param0, param1, param2, param3, -75);
        ((wn) this).a((byte) -75);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = " wand";
        field_A = "Graveyard:";
        field_C = 0;
    }
}
