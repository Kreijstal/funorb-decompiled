/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static rd field_d;
    static String field_b;
    static String field_e;
    static String field_c;
    static String field_a;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 5 / ((param0 - 42) / 39);
          stackIn_3_0 = (ck.a(true, param1) != null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(pf param0, int param1) {
        ad.a(param0.a("headers.packvorbis", "", (byte) -12));
        ad var2 = ad.a(param0, "jagex logo2.packvorbis", "");
        if (param1 != 23987) {
          return;
        }
        try {
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(pb param0, int param1) {
        kg.d(false);
        if (param1 != 1) {
          return;
        }
        try {
          ti.a(param0.field_z, param0.field_w, param0.field_x);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        lh.field_d = lh.field_d + param1;
        lg.field_f = lg.field_f + ed.field_b * param1;
        int var3 = param2 << param1;
        if ((var3 & sd.field_d) != 0) {
          return;
        }
        sd.field_d = sd.field_d | var3;
        tl.field_a = tl.field_a | var3;
        hf.field_i.b(-46, new jf(param1));
        if (e.field_c) {
          return;
        }
        if (ah.a(-1)) {
          ue.field_c.b(-47, new kl(param1, param0, hk.field_p, lg.field_f, lh.field_d, ed.field_b));
          return;
        }
        vj.a(lh.field_d, ed.field_b, (byte) 15, hk.field_p, lg.field_f, param1, param0, 4);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = 61 % ((66 - param0) / 55);
        field_d = null;
        field_e = null;
    }

    static {
        field_d = new rd();
        field_c = "Collect the powerups shown below to improve your weapons and defences.";
        field_b = "From only <%0>/month";
        field_a = "Connection timed out. Please try using a different server.";
        field_e = "Create a free account to start using this feature";
    }
}
