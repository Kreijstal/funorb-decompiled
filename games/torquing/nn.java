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
        }
        jp.field_n = new String[]{vk.field_x, to.field_r, mi.field_u, bq.field_b, w.field_gb, nc.field_b, un.field_f, bl.field_e};
        if (param0 < -21) {
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
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          if (param0 != 7655) {
            nn.a((int[][]) null, (byte) 17);
          }
          var4_int = -1;
          for (var5 = param2; param3 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ ne.field_d[(var4_int ^ param1[var5]) & 255];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          vh stackIn_13_0;
          int stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          java.net.URL stackIn_13_4;
          StringBuilder stackIn_13_5;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          String stackIn_14_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          rc var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = Torquing.field_u;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ii.a(param1, param2 ^ -9958);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            jm.a(3, var3);
            var3 = sp.a(var3, ":", "%3a", (byte) -77);
            var3 = sp.a(var3, "@", "%40", (byte) -71);
            var3 = sp.a(var3, "&", "%26", (byte) -85);
            var7 = sp.a(var3, "#", "%23", (byte) -92);
            if (null == lg.field_B) {
              return;
            }
            stackIn_13_0 = pp.field_f;
            stackIn_13_1 = 0;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = lg.field_B.getCodeBase();
            stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(dq.field_m).append("&u=");
            if (null == vd.field_b) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = "" + gf.field_f;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = vd.field_b;
            }
            var4 = ((vh) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(vh.field_u).append("&v2=").append(vh.field_v).append("&e=").append(var7).toString()));
            while (var4.field_a == 0) {
              ub.a(1976, 1L);
            }
            if (param2 != -9958) {
              field_b = (byte) -127;
            }
            if (var4.field_a != 1) {
              return;
            }
            var5 = (DataInputStream) (var4.field_d);
            var5.read();
            var5.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int[][] param0, byte param1) {
        try {
          qd.field_a = param0;
          if (param1 >= -94) {
            byte[] var3 = (byte[]) null;
            nn.a(-46, (byte[]) null, -63, -109);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "nn.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 < -88) {
          field_d = null;
          field_a = (af[][]) null;
          return;
        }
        Throwable var2 = (Throwable) null;
        nn.a((String) null, (Throwable) null, 60);
        field_d = null;
        field_a = (af[][]) null;
    }

    static {
        field_b = (byte) 0;
        field_d = new java.util.zip.CRC32();
    }
}
