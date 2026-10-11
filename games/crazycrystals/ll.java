/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ll {
    static String field_a;

    final static boolean a(ce param0, int param1, ce param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ce var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (param1 != 0) {
            var5 = (ce) null;
            ll.a((ce) null, -78, (ce) null);
          }
          var3_int = -param2.field_db + param0.field_db;
          if (nh.field_z != param0.field_cb) {
            if (null == param0.field_cb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (nh.field_z == param2.field_cb) {
            var3_int += 200;
          } else {
            if (null == param2.field_cb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ll.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        try {
          RuntimeException decompiledCaughtException = null;
          RuntimeException var3 = null;
          f[][] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          kb var10 = null;
          int var5Lifetime1;
          var9 = CrazyCrystals.field_B;
          try {
            df.field_c = wd.field_j;
            no.field_k = ob.field_l;
            if (param0 >= -80) {
              return;
            }
            bh.field_c = fn.field_j;
            vk.field_I = mb.field_g;
            if (param2) {
              li.field_a = null;
            } else {
              if (null != li.field_a &&
                li.field_a.field_l == null) {
                li.field_a = null;
              }
            }
            var10 = (kb) (rc.field_a.elementAt(uo.field_o));
            qg.field_q = 0;
            va.field_d = 0;
            jm.field_b = 0;
            var4 = var10.field_b;
            oe.field_a = new fq[3];
            ol.field_B = 0;
            rl.field_h = 0;
            qh.field_o = new Vector();
            tm.field_e = 0;
            km.field_d = 0;
            for (var5 = 0; var5 < 3; var5++) {
              q.field_a[var5].a((byte) 118);
            }
            var5Lifetime1 = -3 + var4[0].length;
            var6 = -3 + var4.length;
            var7 = (var6 - 2) / 2 + 4;
            w.field_f = var7;
            var8 = 4 + (var5Lifetime1 - 2) / 2;
            ia.field_i = var8;
            pm.field_d = 0;
            to.field_c = 0;
            gl.field_e = 0;
            gm.field_c = new int[2];
            tm.field_d = md.a(var8, false, var7, -93, var4);
            no.a(var8, -8383, var7, tm.field_d);
            if (null == rn.field_q ||
              !rn.field_q.equals(hf.field_b[var10.field_d])) {
              um.a(kk.field_j[var10.field_d], hf.field_b[var10.field_d], (byte) 80);
            }
            en.field_O = 0;
            kd.field_l = nj.a(45, var8, var7);
            if (!param1) {
              cn.field_d = null;
              td.field_c = null;
              bq.field_i = ce.b((byte) -126);
              if (bq.field_i == null) {
                bq.field_i = kd.field_l;
              }
            } else {
              cn.field_d = kd.field_l;
              bq.field_i = kd.field_l;
              td.field_c = ce.b((byte) -125);
              if (null != td.field_c) {
                ca.field_j = -60;
                mi.i(22075);
              } else {
                td.field_c = bq.field_i;
                ca.field_j = -60;
                mi.i(22075);
              }
            }
            md.field_k[2] = 0;
            md.field_k[1] = 0;
            qp.field_f = false;
            mo.field_f = 0;
            va.field_c = 0;
            md.field_k[0] = 32;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            throw dn.a((Throwable) ((Object) var3), "ll.A(" + param0 + ',' + param1 + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 > -84) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Press F12 for access to all levels";
    }
}
