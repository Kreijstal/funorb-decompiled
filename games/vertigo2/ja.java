/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static volatile int field_h;
    static qb field_d;
    static cr field_b;
    static int field_a;
    static String field_g;
    static String field_c;
    static cr field_e;
    static od field_f;

    final static boolean a(int param0) {
        if (!il.field_a) {
          return false;
        }
        if (param0 != ~ui.field_g) {
          return false;
        }
        return true;
    }

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 != -44) {
            ja.a(75);
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (var4 == 0) {
              var5 = jp.a(true, (char) var5);
            } else {
              var5 = Character.toLowerCase((char) var5);
            }
            var3[var4] = (char)var5;
          }
          stackIn_10_0 = new String(var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 <= 114) {
          return;
        }
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        field_a = 0;
        field_h = -1;
        field_g = "Quick Chat game";
        field_c = "Play rated game";
    }
}
