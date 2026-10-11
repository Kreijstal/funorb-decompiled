/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String[] field_c;
    static int field_b;
    static long field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          field_c = (String[]) null;
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param3);
          for (var5 = var4_int; var5 < param3; var5++) {
            param0.setCharAt(var5, param2);
          }
          if (param1 != 60) {
            field_b = 53;
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lb.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_c = new String[]{"Yes", "No"};
    }
}
