/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg {
    static ge field_a;
    static long field_d;
    static String[] field_b;
    static int field_c;

    final static int b(byte param0) {
        if (param0 != 65) {
          return -106;
        }
        return uf.field_a;
    }

    final static void b(int param0) {
        String[] array$4 = null;
        String[] array$5 = null;
        int var6 = 0;
        int var1_int = 0;
        String var2 = null;
        int var3 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (qe.field_g != null) {
            return;
          }
          dl.field_h = nl.field_e.toLowerCase();
          hf.field_l = od.field_q.toLowerCase();
          qe.field_g = new String[14];
          qe.field_g[7] = bi.field_h;
          qe.field_g[10] = va.field_h;
          if (param0 != -9342) {
            field_a = (ge) null;
          }
          qe.field_g[4] = td.field_d;
          qe.field_g[8] = ug.field_i;
          qe.field_g[6] = nh.field_K;
          qe.field_g[13] = rb.field_B;
          qe.field_g[5] = td.field_d;
          qe.field_g[11] = va.field_h;
          qe.field_g[0] = ca.field_o;
          uk.field_c = new String[27];
          qe.field_g[3] = dd.field_H;
          qe.field_g[1] = gb.field_J;
          qe.field_g[9] = lj.field_d;
          qe.field_g[2] = dd.field_H;
          uk.field_c[15] = td.field_d;
          uk.field_c[14] = nh.field_K;
          uk.field_c[16] = td.field_d;
          uk.field_c[18] = hn.field_J;
          uk.field_c[17] = uk.field_d;
          uk.field_c[1] = mg.field_i;
          uk.field_c[2] = da.field_s;
          uk.field_c[26] = eb.field_p;
          uk.field_c[4] = hk.field_b;
          uk.field_c[19] = nm.field_a;
          uk.field_c[9] = ld.field_f;
          uk.field_c[13] = dd.field_H;
          uk.field_c[11] = sa.field_f;
          uk.field_c[3] = hl.field_c;
          uk.field_c[7] = ka.field_e;
          uk.field_c[0] = ca.field_o;
          uk.field_c[20] = sa.field_a;
          uk.field_c[6] = hk.field_b;
          uk.field_c[12] = rb.field_B;
          uk.field_c[21] = gk.field_c;
          th.field_n = new String[]{uk.field_c[4], uk.field_c[0]};
          ki.field_i = new String[]{uk.field_c[9], uk.field_c[0]};
          pg.field_L = new String[]{uk.field_c[0], jc.field_d, b.field_e, o.field_b};
          var1_int = od.field_i.length;
          var2 = Integer.toString(var1_int);
          for (var3 = 0; var1_int > var3; var3++) {
            od.field_i[var3] = od.field_i[var3] + ' ' + (var3 + 1) + "/" + var2;
          }
          la.field_f = new String[8];
          ij.field_c[3] = new int[]{lf.field_g};
          ij.field_c[2] = new int[]{ik.field_a};
          nn.field_g = new String[8];
          ij.field_c[1] = new int[]{km.field_G};
          ij.field_c[0] = new int[]{rl.field_I};
          nn.field_g[0] = mi.field_h;
          la.field_f[0] = jh.a(bl.field_n, param0 + 9217, mi.field_h);
          nn.field_g[1] = qh.field_a;
          la.field_f[1] = jh.a(ra.field_cb, -125, qh.field_a);
          nn.field_g[2] = u.field_Q;
          la.field_f[2] = jh.a(q.field_b, -119, u.field_Q);
          nn.field_g[3] = lf.field_d;
          la.field_f[3] = jh.a(vk.field_d, wb.a(param0, 9219), lf.field_d);
          nn.field_g[5] = fj.field_p;
          la.field_f[5] = jh.a(tg.field_a, -128, fj.field_p);
          nn.field_g[4] = ga.field_a;
          la.field_f[4] = jh.a(jk.field_l, -120, ga.field_a);
          nn.field_g[7] = fe.field_a;
          la.field_f[7] = jh.a(i.field_l, param0 + 9221, fe.field_a);
          nn.field_g[6] = rg.field_d;
          la.field_f[6] = jh.a(gn.field_j, param0 + 9214, rg.field_d);
          v.field_A = new String[4][];
          sg.field_gb = new String[4][];
          for (var3Lifetime1 = 0; 4 > var3Lifetime1; var3Lifetime1++) {
            var12 = go.field_g[var3Lifetime1];
            var5 = var12.length;
            array$4 = new String[var5];
            sg.field_gb[var3Lifetime1] = array$4;
            array$5 = new String[var5];
            v.field_A[var3Lifetime1] = array$5;
            for (var6 = 0; var5 > var6; var6++) {
              var7 = var12[var6];
              sg.field_gb[var3Lifetime1][var6] = nn.field_g[var7];
              v.field_A[var3Lifetime1][var6] = la.field_f[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "dg.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_25_0 = false;
        int var2;
        var2 = -62 / ((param0 + 7) / 54);
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 >= 97 &&
              122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_25_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_25_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 >= 65 &&
          param1 <= 90) {
          return true;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 < param1) {
          return false;
        }
        return true;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == -1) {
          return param0 + rf.a(param2 - param0 + 1, in.field_c, param1 + 0);
        }
        return -64;
    }

    public static void a(int param0) {
        if (param0 != 32137) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, java.math.BigInteger param1, th param2, th param3, java.math.BigInteger param4) {
        try {
          te.a(param1, param4, param3, 0, 126, param2.field_l, param2.field_i);
          if (param0) {
            dg.a(-78);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        ih var4 = null;
        int var3 = HoldTheLine.field_D;
        try {
          if (eb.field_o != null &&
            !l.field_b) {
            am.a(3, (byte) -67, eb.field_o);
          }
          int var2 = 96 / ((-25 - param0) / 60);
          var4 = (ih) (fb.field_n.b((byte) 121));
          while (var4 != null) {
            na.a(4, var4, (byte) -79);
            var4 = (ih) (fb.field_n.c((byte) -75));
          }
          if (of.a(-969)) {
            ec.field_y = ie.a(10, 31043, 2, 0);
          }
          h.b((byte) -92);
          wd.a(of.a(-969), (byte) 97);
          gi.a((byte) 80);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ')');
        }
    }

    static {
        field_a = new ge();
    }
}
