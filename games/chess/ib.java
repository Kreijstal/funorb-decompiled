/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static nb field_c;
    static int field_a;
    static ln field_d;
    static String field_b;

    final static int a(boolean param0) {
        if (!param0) {
          ib.a(78);
        }
        return qf.field_a;
    }

    public static void a(int param0) {
        if (param0 != -12374) {
          return;
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static sa a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        sa stackIn_3_0 = null;
        sa stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          var2_int = param0.length();
          if (param1) {
            stackIn_3_0 = (sa) null;
            return stackIn_3_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_13_0 = wh.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ib.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 80;
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
