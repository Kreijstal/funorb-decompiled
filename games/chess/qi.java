/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends vm {
    static boolean field_l;
    static ci field_o;
    static String field_m;
    static int[] field_p;
    static String field_n;

    qi(qn param0) {
        super(param0);
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        mk stackIn_3_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!lg.a((byte) 108, var5)) {
            stackIn_3_0 = qk.field_b;
            return stackIn_3_0;
          }
          var3_int = 28 % ((param0 + 49) / 62);
          var6 = (CharSequence) ((Object) param1);
          var4 = fn.a(var6, 0);
          if (var4 > 0 &&
            var4 <= 130) {
            stackIn_10_0 = oa.field_a;
            return stackIn_10_0;
          }
          stackIn_8_0 = qk.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 > 34) {
          field_p = null;
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        }
        qi.b((byte) -62);
        field_p = null;
        field_n = null;
        field_m = null;
        field_o = null;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9316) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a((byte) -126, param0) != qk.field_b) {
            return null;
          }
          stackIn_6_0 = rm.field_D;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qi.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_n = "Connection lost - attempting to reconnect";
        field_p = new int[8192];
    }
}
