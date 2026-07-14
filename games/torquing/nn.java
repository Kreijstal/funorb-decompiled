/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.lang.String;

final class nn {
    static af[][] field_a;
    static int field_e;
    static byte field_b;
    static jp field_c;
    static java.util.zip.CRC32 field_d;

    final static void a(int param0) {
        if (null != dh.field_a) {
          return;
        } else {
          jp.field_n = new String[]{vk.field_x, to.field_r, mi.field_u, bq.field_b, w.field_gb, nc.field_b, un.field_f, bl.field_e};
          if (param0 >= -21) {
            field_c = null;
            dh.field_a = new String[]{ld.field_b, hm.field_t, da.field_e, qj.field_a, qa.field_j};
            hq.field_d[2] = ai.field_m;
            hq.field_d[0] = ae.field_lb;
            hq.field_d[1] = qe.field_a;
            hb.field_u[0] = bm.field_l.toUpperCase();
            hb.field_u[4] = cm.field_j.toUpperCase();
            hb.field_u[10] = l.field_a;
            hb.field_u[13] = am.field_o;
            hb.field_u[2] = vb.field_e;
            hb.field_u[6] = cd.field_b.toUpperCase();
            hb.field_u[3] = kl.field_u.toUpperCase();
            hb.field_u[20] = ae.field_lb + " / " + qe.field_a + " / " + ai.field_m;
            hb.field_u[5] = mi.field_v.toUpperCase();
            hb.field_u[11] = tp.field_n.toUpperCase();
            hb.field_u[12] = kn.field_b.toUpperCase();
            hb.field_u[1] = kn.field_b.toUpperCase();
            hb.field_u[9] = null;
            hb.field_u[8] = null;
            hb.field_u[14] = r.field_a.toUpperCase();
            hb.field_u[15] = pe.field_M.toUpperCase();
            hb.field_u[16] = eg.field_y.toUpperCase();
            hb.field_u[17] = bm.field_l.toUpperCase();
            hb.field_u[21] = rk.field_e.toUpperCase();
            hb.field_u[22] = te.field_t.toUpperCase();
            hb.field_u[23] = gp.field_M.toUpperCase();
            po.field_t[2] = wf.field_q;
            po.field_t[1] = hh.field_c;
            po.field_t[0] = ro.field_t;
            oh.field_a = oh.field_a.toUpperCase();
            ip.field_d = ip.field_d.toUpperCase();
            jn.field_b = jn.field_b.toUpperCase();
            gp.field_P = gp.field_P.toUpperCase();
            al.field_c = al.field_c.toUpperCase();
            kj.field_f = kj.field_f.toUpperCase();
            tn.field_m = tn.field_m.toUpperCase();
            fo.field_E = fo.field_E.toUpperCase();
            qd.field_i = qd.field_i.toUpperCase();
            ud.field_l = ud.field_l.toUpperCase();
            ol.field_b = ol.field_b.toUpperCase();
            return;
          } else {
            dh.field_a = new String[]{ld.field_b, hm.field_t, da.field_e, qj.field_a, qa.field_j};
            hq.field_d[2] = ai.field_m;
            hq.field_d[0] = ae.field_lb;
            hq.field_d[1] = qe.field_a;
            hb.field_u[0] = bm.field_l.toUpperCase();
            hb.field_u[4] = cm.field_j.toUpperCase();
            hb.field_u[10] = l.field_a;
            hb.field_u[13] = am.field_o;
            hb.field_u[2] = vb.field_e;
            hb.field_u[6] = cd.field_b.toUpperCase();
            hb.field_u[3] = kl.field_u.toUpperCase();
            hb.field_u[20] = ae.field_lb + " / " + qe.field_a + " / " + ai.field_m;
            hb.field_u[5] = mi.field_v.toUpperCase();
            hb.field_u[11] = tp.field_n.toUpperCase();
            hb.field_u[12] = kn.field_b.toUpperCase();
            hb.field_u[1] = kn.field_b.toUpperCase();
            hb.field_u[9] = null;
            hb.field_u[8] = null;
            hb.field_u[14] = r.field_a.toUpperCase();
            hb.field_u[15] = pe.field_M.toUpperCase();
            hb.field_u[16] = eg.field_y.toUpperCase();
            hb.field_u[17] = bm.field_l.toUpperCase();
            hb.field_u[21] = rk.field_e.toUpperCase();
            hb.field_u[22] = te.field_t.toUpperCase();
            hb.field_u[23] = gp.field_M.toUpperCase();
            po.field_t[2] = wf.field_q;
            po.field_t[1] = hh.field_c;
            po.field_t[0] = ro.field_t;
            oh.field_a = oh.field_a.toUpperCase();
            ip.field_d = ip.field_d.toUpperCase();
            jn.field_b = jn.field_b.toUpperCase();
            gp.field_P = gp.field_P.toUpperCase();
            al.field_c = al.field_c.toUpperCase();
            kj.field_f = kj.field_f.toUpperCase();
            tn.field_m = tn.field_m.toUpperCase();
            fo.field_E = fo.field_E.toUpperCase();
            qd.field_i = qd.field_i.toUpperCase();
            ud.field_l = ud.field_l.toUpperCase();
            ol.field_b = ol.field_b.toUpperCase();
            return;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Torquing.field_u;
        if (param0 != 7655) {
          nn.a((int[][]) null, (byte) 17);
          var4 = -1;
          var5 = param2;
          L0: while (true) {
            if (param3 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> 454122248 ^ ne.field_d[(var4 ^ param1[var5]) & 255];
              var5++;
              continue L0;
            }
          }
        } else {
          var4 = -1;
          var5 = param2;
          L1: while (true) {
            if (param3 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> 454122248 ^ ne.field_d[(var4 ^ param1[var5]) & 255];
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            rc var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            vh stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            vh stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            vh stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            vh stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            vh stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            vh stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param1 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = ii.a(param1, param2 ^ -9958);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1 == null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            jm.a(3, var3_ref);
                            var3_ref = sp.a(var3_ref, ":", "%3a", (byte) -77);
                            var3_ref = sp.a(var3_ref, "@", "%40", (byte) -71);
                            var3_ref = sp.a(var3_ref, "&", "%26", (byte) -85);
                            var7 = sp.a(var3_ref, "#", "%23", (byte) -92);
                            if (null == lg.field_B) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = pp.field_f;
                            stackOut_11_1 = 0;
                            stackOut_11_2 = null;
                            stackOut_11_3 = null;
                            stackOut_11_4 = lg.field_B.getCodeBase();
                            stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(dq.field_m).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_13_5 = stackOut_11_5;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            stackIn_12_5 = stackOut_11_5;
                            if (null == vd.field_b) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (vh) (Object) stackIn_12_0;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                            stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                            stackOut_12_6 = vd.field_b;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_14_6 = stackOut_12_6;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (vh) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = "" + gf.field_f;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            stackIn_14_6 = stackOut_13_6;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + vh.field_u + "&v2=" + vh.field_v + "&e=" + var7);
                            var4 = ((vh) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 != (var4.field_a ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ub.a(1976, 1L);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param2 == -9958) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            field_b = (byte) -127;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var4.field_a ^ -1) == -2) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            return;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var5 = (DataInputStream) var4.field_d;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        var3 = (Exception) (Object) caughtException;
                        return;
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

    final static void a(int[][] param0, byte param1) {
        qd.field_a = param0;
        if (param1 >= -94) {
            Object var3 = null;
            int discarded$0 = nn.a(-46, (byte[]) null, -63, -109);
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_c = null;
        if (param0 >= -88) {
          var2 = null;
          nn.a((String) null, (Throwable) null, 60);
          field_d = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = (byte) 0;
        field_d = new java.util.zip.CRC32();
    }
}
