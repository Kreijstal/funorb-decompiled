/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends r {
    static dd[] field_n;
    static String field_o;

    final wd a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        wd stackIn_7_0 = null;
        wd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 160) {
            field_o = (String) null;
          }
          stackIn_5_0 = (pd.a(-94, param1) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            stackIn_9_0 = hm.field_b;
            return stackIn_9_0;
          }
          stackIn_7_0 = ml.field_K;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ai.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != -10) {
          field_n = (dd[]) null;
          field_n = null;
          field_o = null;
          return;
        }
        field_n = null;
        field_o = null;
    }

    final static void a(int param0, int param1, qc param2, boolean param3) {
        try {
          mk.field_d = param2;
          bb.field_C = param0;
          q.field_d = param1;
          if (param3) {
            ai.c((byte) 109);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ai.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ai(c param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(160, param1) == ml.field_K) {
            stackIn_2_0 = bg.field_a;
            return stackIn_2_0;
          }
          var3_int = -7 % ((param0 - 24) / 46);
          stackIn_4_0 = ha.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ai.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        pd var1 = null;
        int var2 = 0;
        boolean stackIn_21_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        pd var1Lifetime1;
        var2 = fleas.field_A ? 1 : 0;
        try {
          db.field_J.a();
          tg.field_i.a();
          gg.field_g = gg.field_g - 1;
          if (param0 != -20846) {
            ai.c((byte) -57);
          }
          if (gg.field_g == 0) {
            gg.field_g = 200;
            var1 = (pd) (bk.field_d.c((byte) 47));
            while (var1 != null) {
              if (!var1.field_n.b((byte) -54)) {
                var1.c(param0 + 20845);
              }
              var1 = (pd) (bk.field_d.b((byte) -105));
            }
            if (jc.field_c != null) {
              var1Lifetime1 = (pd) (jc.field_c.c((byte) 47));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_n.b((byte) -54)) {
                  var1Lifetime1.c(-1);
                }
                var1Lifetime1 = (pd) (jc.field_c.b((byte) -105));
              }
            }
          }
          if (gg.field_h != null) {
            stackIn_21_0 = gg.field_h.d(31499);
            if (stackIn_21_0) {
              return;
            }
            ae.field_b = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "ai.B(" + param0 + ')');
        }
    }

    static {
        field_o = "Have fun!";
    }
}
