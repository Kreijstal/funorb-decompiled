/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static String field_c;
    static String field_d;
    static String field_b;
    static int[][] field_a;

    public static void b(int param0) {
        field_b = null;
        field_a = (int[][]) null;
        field_d = null;
        int var1 = 40 % ((param0 - 22) / 63);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 == -12863) {
          if (null != oi.field_k) {
            if (oi.field_k.e((byte) -118) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ae.b(8);
          if (null != oi.field_k) {
            if (oi.field_k.e((byte) -118) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static ii a(int param0, ci param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3) {
              break L0;
            } else {
              field_c = (String) null;
              break L0;
            }
          }
          if (rl.a(param2, 0, param0, param1)) {
            return f.a(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ae.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = "Suggested names: ";
        field_c = "Use this alternative as your account name";
        field_b = "This password contains your Player Name, and would be easy to guess";
    }
}
