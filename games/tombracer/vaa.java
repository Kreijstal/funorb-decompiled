/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vaa {
    static long field_b;
    static int[][] field_a;

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -16) {
            field_a = (int[][]) null;
          }
          stackIn_5_0 = ((param0[param1 >> 5] & 1 << (param1 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vaa.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 0) {
          field_b = -34L;
        }
    }

    static {
    }
}
