/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        sa var4 = null;
        he var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Bounce.field_N;
        try {
          var5 = (he) (of.field_b.a((byte) -105));
          if (param1 != -29) {
            return;
          }
          while (var5 != null) {
            mi.a(param0, -115, var5);
            var5 = (he) (of.field_b.d((byte) -18));
          }
          var4 = (sa) (jl.field_f.a((byte) -58));
          while (var4 != null) {
            ha.a(-17765, var4, param0);
            var4 = (sa) (jl.field_f.d((byte) -29));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "rk.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
          ig.a(-92);
          q.field_N.k(-20281);
          if (param0 != 4) {
            field_a = 22;
          }
          vk.field_c = new ci(gi.field_b, (String) null, fe.field_g, param3, param2);
          ed.field_c = new ec(q.field_N, vk.field_c);
          q.field_N.b(ed.field_c, false);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "rk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = lh.a(-121, param1.length, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static o a(gk param0, gk param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -80 % ((51 - param2) / 48);
          if (!c.a(param0, false, param4, param3)) {
            return null;
          }
          stackIn_4_0 = gi.a(param1.b(-127, param3, param4), 41);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rk.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param2 != 4) {
          field_a = 22;
        }
        if (param0) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        return vg.field_a[var4];
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, si param6, int param7, int param8) {
        bd.field_l = param2;
        a.field_a = param4;
        if (param3 != 0) {
          return;
        }
        try {
          vc.field_G = param6;
          mf.field_e = param0;
          fi.field_c = param5;
          pe.field_c = param1;
          uj.field_s = param7;
          fk.field_d = param8;
          tb.field_p = (v) ((Object) new tb());
          hb.field_F = new vi(param6);
          ih.field_Q = new oj(tb.field_p, hb.field_F);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "rk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
