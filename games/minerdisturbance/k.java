/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends cb {
    static boolean field_i;

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, 5) == fg.field_d) {
            stackIn_3_0 = hn.field_d;
            return stackIn_3_0;
          }
          var3_int = 9 % ((49 - param0) / 56);
          stackIn_5_0 = c.field_b;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("k.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    k(ui param0) {
        super(param0);
    }

    final static void f(int param0) {
        Object var1 = null;
        Throwable decompiledCaughtException = null;
        Object var1_ref = null;
        var1_ref = lb.field_y;
        synchronized (var1_ref) {
          ld.field_B = qd.field_J;
          t.field_c = t.field_c + 1;
          nk.field_w = sa.field_o;
          gb.field_e = nm.field_a;
          field_i = kk.field_d;
          kk.field_d = false;
          jk.field_ab = ic.field_n;
          wi.field_w = al.field_n;
          m.field_e = vl.field_G;
          if (param0 != 10525) {
            return;
          }
          ic.field_n = 0;
        }
    }

    final static String g(int param0) {
        if (af.field_u < 2) {
          return aa.field_f;
        }
        if (null != sb.field_r) {
          if (!sb.field_r.a((byte) 107)) {
            return ge.field_d;
          }
          return ic.field_g;
        }
        if (!hj.field_i.a((byte) 111)) {
          return ul.field_d;
        }
        if (!hj.field_i.a(false, "commonui")) {
          return ub.field_c + " - " + hj.field_i.a("commonui", param0 + 22834) + "%";
        }
        if (!pb.field_r.a((byte) 99)) {
          return dc.field_a;
        }
        if (!pb.field_r.a(false, "commonui")) {
          return mb.field_a + " - " + pb.field_r.a("commonui", -121) + "%";
        }
        if (!oh.field_C.a((byte) 85)) {
          return l.field_e;
        }
        if (!oh.field_C.b(-1)) {
          return ec.field_f + " - " + oh.field_C.c(-14858) + "%";
        }
        if (param0 == -22962) {
          return nj.field_d;
        }
        k.g(-76);
        return nj.field_d;
    }

    final ag a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        ag stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (dg.a(param0, -115) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 != 5) {
            var4 = (String) null;
            this.a((String) null, -75);
          }
          if (var3_int != 0) {
            return sc.field_a;
          }
          stackIn_8_0 = fg.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("k.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = false;
    }
}
