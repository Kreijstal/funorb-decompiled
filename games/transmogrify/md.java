/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends me {
    static String field_j;
    static int field_k;

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_k = 66;
          }
          if (this.a(95, param1) != ec.field_d) {
            return null;
          }
          stackIn_5_0 = tj.field_A;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("md.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final rc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        rc stackIn_4_0 = null;
        rc stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 95) {
            var4 = (String) null;
            this.a(81, (String) null);
          }
          var5 = (CharSequence) ((Object) param1);
          if (!qj.a(var5, 100)) {
            stackIn_4_0 = ec.field_d;
            return stackIn_4_0;
          }
          var6 = (CharSequence) ((Object) param1);
          var3_int = aa.a(97, var6);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return hi.field_b;
          }
          stackIn_9_0 = ec.field_d;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("md.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    md(rg param0) {
        super(param0);
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_j = (String) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    static {
        field_k = -1;
    }
}
