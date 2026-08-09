/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

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
            field_c = (jp) null;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 == 7655) {
                break L1;
              } else {
                nn.a((int[][]) null, (byte) 17);
                break L1;
              }
            }
            var4_int = -1;
            var5 = param2;
            L2: while (true) {
              if (param3 <= var5) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 454122248 ^ ne.field_d[(var4_int ^ param1[var5]) & 255];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("nn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            vh stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            vh stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            String stackIn_14_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            rc var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            var6 = Torquing.field_u;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3 = ii.a(param1, param2 ^ -9958);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                jm.a(3, var3);
                var3 = sp.a(var3, ":", "%3a", (byte) -77);
                var3 = sp.a(var3, "@", "%40", (byte) -71);
                var3 = sp.a(var3, "&", "%26", (byte) -85);
                var7 = sp.a(var3, "#", "%23", (byte) -92);
                if (null == lg.field_B) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = pp.field_f;

                    stackIn_13_1 = 0;

                    stackIn_13_2 = null;

                    stackIn_13_3 = null;

                    stackIn_13_4 = lg.field_B.getCodeBase();

                    stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(dq.field_m).append("&u=");

                    if (null == vd.field_b) {
                      stackIn_14_0 = (vh) ((Object) stackIn_13_0);
                      stackIn_14_1 = stackIn_13_1;
                      stackIn_14_2 = null;
                      stackIn_14_3 = null;
                      stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackIn_14_6 = "" + gf.field_f;
                      break L4;
                    } else {
                      stackIn_14_0 = (vh) ((Object) stackIn_13_0);
                      stackIn_14_1 = stackIn_13_1;
                      stackIn_14_2 = null;
                      stackIn_14_3 = null;
                      stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackIn_14_6 = vd.field_b;
                      break L4;
                    }
                  }
                  var4 = ((vh) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + vh.field_u + "&v2=" + vh.field_v + "&e=" + var7));
                  L5: while (true) {
                    if (-1 != (var4.field_a ^ -1)) {
                      L6: {
                        if (param2 == -9958) {
                          break L6;
                        } else {
                          field_b = (byte) -127;
                          break L6;
                        }
                      }
                      if ((var4.field_a ^ -1) == -2) {
                        var5 = (DataInputStream) (var4.field_d);
                        var5.read();
                        var5.close();
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      ub.a(1976, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int[][] param0, byte param1) {
        RuntimeException runtimeException = null;
        byte[] var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qd.field_a = param0;
              if (param1 < -94) {
                break L1;
              } else {
                var3 = (byte[]) null;
                nn.a(-46, (byte[]) null, -63, -109);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("nn.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        Throwable var2;
        field_c = null;
        if (param0 >= -88) {
          var2 = (Throwable) null;
          nn.a((String) null, (Throwable) null, 60);
          field_d = null;
          field_a = (af[][]) null;
          return;
        } else {
          field_d = null;
          field_a = (af[][]) null;
          return;
        }
    }

    static {
        field_b = (byte) 0;
        field_d = new java.util.zip.CRC32();
    }
}
