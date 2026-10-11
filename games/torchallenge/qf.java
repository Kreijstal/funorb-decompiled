/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static ka[] field_c;
    static String field_d;
    static wb field_a;
    static String field_b;
    static int field_f;
    static ge[] field_e;

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          if (param0 != -8503) {
            qf.a((byte) 86);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("qf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 != 75) {
          return;
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 126 % ((40 - param0) / 33);
        int var5 = 0;
        if (param1) {
          var5 += 4;
        }
        if (param2) {
          var5 += 2;
        }
        if (param3) {
          var5++;
        }
        return tf.field_z[var5];
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_d = "The account name you use to access RuneScape and other Jagex.com games";
        field_e = null;
        field_f = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 126 % ((40 - param0) / 33);
        int var5 = 0;
        if (param1) {
          var5 += 4;
        }
        if (param2) {
          var5 += 2;
        }
        if (param3) {
          var5++;
        }
        return tf.field_z[var5];
    }
}
