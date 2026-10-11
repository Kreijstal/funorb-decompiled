/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int[][] field_a;
    static int field_b;

    final static id a(int param0, String param1, byte param2) {
        id var3 = null;
        RuntimeException var3_ref = null;
        id stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            field_b = 1;
          }
          var3 = new id(false);
          var3.field_c = param1;
          var3.field_a = param0;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 < 8) {
          String var2 = (String) null;
          pa.a(-122, (String) null, (byte) -98);
        }
    }

    static {
    }
}
