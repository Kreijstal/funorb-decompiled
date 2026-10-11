/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends al {
    static pk field_s;
    static Calendar field_t;
    static int field_u;
    static oh[] field_q;
    static ah field_v;
    static String field_r;
    static ob field_w;

    final static boolean a(byte param0, String param1, String param2) {
        int var3_int = 0;
        String var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -36 % ((param0 - 89) / 33);
          param1 = um.a(param1, '_', false, "");
          var4 = dj.a(116, param2);
          stackIn_5_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var4) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    mf(jb param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_N, -1, 2147483647, false);
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TetraLink.field_J;
        try {
          if (hl.a(true)) {
            pj.field_i.a(aa.field_Vb, true, p.field_m, false);
            pj.field_i.j(param0 ^ param0);
            while (nj.b((byte) 28)) {
              pj.field_i.a(dg.field_e, tb.field_m, param0 ^ -81);
            }
            return;
          }
          if (null != hd.field_u &&
            hd.field_u.field_c) {
            qa.b((byte) 59);
            pj.field_i.a(new qc(pj.field_i, wg.field_d), false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "mf.I(" + param0 + ')');
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        try {
          if (param4) {
            in.a(param1 + param0.field_t, param0.field_w + param2, (byte) -110, param0.field_F, param0.field_u);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "mf.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        field_q = null;
        if (!param0) {
          field_t = null;
          field_r = null;
          field_v = null;
          field_w = null;
          return;
        }
        mf.a(-30);
        field_t = null;
        field_r = null;
        field_v = null;
        field_w = null;
    }

    final static int b(int param0) {
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          var1_int = 0;
          var2 = 0;
          while (nj.b((byte) 28)) {
            gm.field_h.a(93);
            if (gm.field_h.b(83)) {
              var1_int = 1;
            }
            if (dg.field_e != 13) {
              continue;
            }
            var2 = 1;
          }
          gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), gd.a(ci.field_B, li.field_o, 8395), (byte) 92);
          if (gm.field_h.b(83)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            gm.field_h.field_b >= 0) {
            var3 = io.field_g[gm.field_h.field_b];
            if (var3 == 2) {
              ka.c(88);
            } else if (var3 == 5) {
              ka.c(88);
            }
          } else {
            if (var2 != 0 &&
              f.field_z != 2) {
              ka.c(param0 - 916);
            }
          }
          if (var3 == 0 &&
            2 == f.field_z) {
            var4 = -tg.field_a + k.a(0);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              om.a(true, 10, 5);
            }
          }
          if (param0 == 1000) {
            stackIn_30_0 = var3;
            return stackIn_30_0;
          }
          stackIn_28_0 = -33;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "mf.M(" + param0 + ')');
        }
    }

    mf(int param0) {
        this(od.field_S, param0);
    }

    static {
        field_t = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = "Unpacking music";
    }
}
