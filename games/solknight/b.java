/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static boolean field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != -11709) {
          field_b = false;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 49) {
            return true;
          }
          if (param0 != null &&
            param0.length() >= sa.field_i &&
            param0.length() <= sg.field_d) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("b.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String[] a(String param0, char param1, boolean param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = m.a(0, param1, var10);
          var4 = new String[1 + var3_int];
          if (!param2) {
            field_a = (String) null;
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param0.charAt(var8) != param1; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("b.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "to over <%0> great games";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String[] $cfr$intArgs$a$25ae83805f84(String param0, int param1, boolean param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = m.a(0, (char) param1, var10);
          var4 = new String[1 + var3_int];
          if (!param2) {
            field_a = (String) null;
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param0.charAt(var8) != param1; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("b.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append((char) param1).append(',').append(param2).append(')').toString());
        }
    }
}
