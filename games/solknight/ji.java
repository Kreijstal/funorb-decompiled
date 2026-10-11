/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static aj field_b;
    static int field_a;
    static String field_c;

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
          }
          if (param0 != 21762) {
            field_b = (aj) null;
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ji.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -19688) {
          field_c = (String) null;
        }
        return k.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -102) {
          String var2 = (String) null;
          ji.a(-97, (String) null);
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_c = "This password contains your email address, and would be easy to guess";
    }
}
