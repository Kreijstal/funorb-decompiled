/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements pf {
    static mc[] field_b;
    static qb field_d;
    static String field_c;
    static int field_a;

    final static nk a(boolean param0, int param1, int param2, int param3) {
        nk var6 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        nk var4 = (nk) (pe.field_Lb.b(12623));
        if (param0) {
          while (var4 != null) {
            if (param2 == var4.field_p) {
              return var4;
            }
            var4 = (nk) (pe.field_Lb.a(0));
          }
          var6 = new nk();
          var4 = var6;
          var6.field_p = param2;
          var6.field_t = param1;
          pe.field_Lb.b(var6, -1);
          fj.a(-26971, var6, param3);
          return var6;
        }
        eb.a((byte) -57);
        while (var4 != null) {
          if (param2 == var4.field_p) {
            return var4;
          }
          var4 = (nk) (pe.field_Lb.a(0));
        }
        nk var7 = new nk();
        var4 = var7;
        var7.field_p = param2;
        var7.field_t = param1;
        pe.field_Lb.b(var7, -1);
        fj.a(-26971, var7, param3);
        return var7;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != 49) {
          return;
        }
        field_d = null;
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        try {
          if (param1 != 5592405) {
            jg var7 = (jg) null;
            eb.a(-82, (jg) null);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "eb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        ul.field_A = param0;
        if (null != jl.field_h) {
          jl.field_h.a(param0, (byte) -66);
        }
        if (!param1) {
          if (gg.field_h != null) {
            gg.field_h.a(2, param0);
          }
          return;
        }
        jg var3 = (jg) null;
        eb.a(84, (jg) null);
        if (gg.field_h != null) {
          gg.field_h.a(2, param0);
        }
    }

    final static void a(int param0, jg param1) {
        int stackIn_2_0;
        Object stackIn_2_1;
        Object stackIn_2_2;
        String stackIn_2_3;
        long stackIn_2_4;
        int stackIn_2_5;
        int stackIn_3_6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ne var5 = null;
        String var6 = null;
        ne var7 = null;
        String var8 = null;
        ne var9 = null;
        String var10 = null;
        ne var11 = null;
        String var12 = null;
        ne var13 = null;
        try {
          stackIn_2_0 = -26335;
          stackIn_2_1 = null;
          stackIn_2_2 = null;
          stackIn_2_3 = param1.field_n;
          stackIn_2_4 = param1.field_h;
          stackIn_2_5 = param1.field_m;
          if (1 == param1.field_m) {
            stackIn_3_6 = param1.field_q;
          } else {
            stackIn_3_6 = 0;
          }
          ArcanistsMulti.a(stackIn_2_0, (int[]) (stackIn_2_1), (dn) (stackIn_2_2), stackIn_2_3, stackIn_2_4, stackIn_2_5, stackIn_3_6, param1.field_g, param1.field_a);
          if (param1.field_m == param0 &&
            !lk.f(-1) &&
            wi.field_f == null &&
            null == om.field_x) {
            if (!ld.field_p) {
              var5 = eo.field_c;
              var6 = jd.field_i;
              var5.field_l.a(14, var6, (byte) -26);
            }
            var7 = eo.field_c;
            var8 = lk.field_h;
            var7.field_l.a(20, var8, (byte) -26);
          }
          if (param1.field_m == 1 &&
            !lk.f(-1) &&
            null != wi.field_f &&
            param1.field_q == wi.field_f.h((byte) 78)) {
            if (!ld.field_p) {
              var9 = eo.field_c;
              var10 = vk.field_v;
              var9.field_l.a(14, var10, (byte) -26);
            }
            var11 = eo.field_c;
            var12 = ef.field_s;
            var11.field_l.a(20, var12, (byte) -26);
          }
          eo.field_c.a(3);
          eo.field_c.a((byte) 72, false);
          eo.field_c.a(param1.field_m, param1.field_f, 13);
          eo.field_c.d(5552);
          eo.field_c.a(19, param1);
          var13 = eo.field_c;
          var3 = pb.field_h;
          var4 = ja.field_s;
          var13.field_l.a(0, 0, -29466, var4, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("eb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -81) {
          return;
        }
        mj.a(-6578, param0);
        if (null != kh.field_c) {
          fk.a(0, kh.field_c);
        }
    }

    final static void a(qb[] param0, int param1, int param2, int param3) {
        try {
          ol.field_f = new ec(param0);
          mj.field_r = param3;
          int var4_int = -103 / ((param2 - 31) / 55);
          tg.field_d = param1;
          eg.b(403300833);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "eb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = null;
        field_c = "Just one target left!";
    }
}
