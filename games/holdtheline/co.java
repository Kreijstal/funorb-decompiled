/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static String[] field_a;
    static int[] field_d;
    static uf field_b;
    static String field_c;
    static String field_e;

    final static int a(int param0) {
        if (param0 != 0) {
          field_b = (uf) null;
          return cb.field_j;
        }
        return cb.field_j;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        gn var3 = null;
        Throwable decompiledCaughtException = null;
        gn var3Lifetime1;
        if (null == tf.field_n) {
          if (!param0) {
            return;
          }
          var3 = (gn) null;
          co.a((gn) null, (gn) null, 26);
          return;
        }
        var1 = tf.field_n;
        synchronized (var1) {
          tf.field_n = null;
        }
        if (param0) {
          var3Lifetime1 = (gn) null;
          co.a((gn) null, (gn) null, 26);
        }
    }

    final static boolean a(gn param0, gn param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10302) {
            return true;
          }
          stackIn_10_0 = (param1.a((byte) 65)) && (param0.d(0, -78)) && (param0.b("car_pass_left", -93)) && (param0.b("car_pass_right", 116)) && (param0.b("wacky_boom_kick", -111));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("co.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          mn.a("", param0, -1);
          ae.a(-16666, param0);
          if (param1 != 237) {
            field_a = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "co.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        if (cf.field_q == -lf.field_l + param0) {
          cf.field_q = cf.field_q + 1;
          return;
        }
        if (cf.field_q == -lf.field_l + 250) {
          cf.field_q = cf.field_q + 1;
          return;
        }
        cf.field_q = cf.field_q + 1;
    }

    public static void b(int param0) {
        int var1 = -96 % ((param0 + 48) / 56);
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new String[]{"Kick up some dust on desert tracks", "Cause mayhem in nighttime races", "Dance on ice on alpine tracks", "Put six new vehicles to the test", "The Rink, and other Demolition tracks", "Play in fullscreen mode"};
        field_c = "Username: ";
    }
}
