/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends di {
    static ba field_m;
    static String field_n;

    l(lb param0) {
        super(param0);
    }

    final static String h(int param0) {
        if (fd.field_h == oe.field_b) {
          return th.field_n;
        }
        if (param0 != 0) {
          field_m = (ba) null;
          if (oe.field_b == rk.field_X) {
            return vh.field_p;
          }
          if (sa.field_Q.b((byte) 121)) {
            return qg.field_c;
          }
          return vh.field_p;
        }
        if (oe.field_b == rk.field_X) {
          return vh.field_p;
        }
        if (sa.field_Q.b((byte) 121)) {
          return qg.field_c;
        }
        return vh.field_p;
    }

    final ud a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ud stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        ud stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -106) {
            stackIn_2_0 = (ud) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (ha.a(param1, -125) != null) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            return TrackController.field_G;
          }
          stackIn_9_0 = ef.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("l.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_m = null;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 426) {
            field_m = (ba) null;
          }
          if (this.a(-124, param0) != ef.field_b) {
            stackIn_6_0 = hf.field_a;
            return stackIn_6_0;
          }
          stackIn_4_0 = ob.field_v;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("l.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(kk param0, kk param1, byte param2, kk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.c(90) &&
            param0.b("commonui", (byte) -3)) {
            if (!param1.c(-83)) {
              return false;
            }
            if (!param1.b("commonui", (byte) -3)) {
              return false;
            }
            if (param3.c(88) &&
              param3.b("button.gif", (byte) -3)) {
              var4_int = 71 / ((param2 + 69) / 32);
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("l.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        try {
          if (rl.field_N == 11) {
            rg.a(false);
          }
          ob.a(qh.field_i, 209, pb.field_a, qi.field_k);
          if (param0 <= 52) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            l.a((byte) 125, (java.awt.Canvas) null);
          }
          qd.a(param1, 0, 0, 2901);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "l.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        fc var2 = null;
        int var3 = 0;
        cf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var4 = (cf) (kd.field_b.b(param0 + 30424));
          if (param0 != -30422) {
            return;
          }
          while (var4 != null) {
            md.a(param1, var4, 99);
            var4 = (cf) (kd.field_b.a(10));
          }
          var2 = fh.field_b.b(2);
          while (var2 != null) {
            nk.a(param1, -120);
            var2 = fh.field_b.a(param0 ^ -30432);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "l.G(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_n = "Prev page";
        field_m = new ba();
    }
}
