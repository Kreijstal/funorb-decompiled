/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qaa {
    static String[][] field_a;

    public static void a(int param0) {
        field_a = (String[][]) null;
        if (param0 != 14979) {
            field_a = (String[][]) null;
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2180) {
                break L1;
              } else {
                field_a = (String[][]) null;
                break L1;
              }
            }
            L2: {
              if (null == uh.a(param1, -116)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("qaa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_a = new String[][]{new String[]{"3 rooms per round", "4 rooms per round", "5 rooms per round", "6 rooms per round"}, new String[]{"First player to win 2 rounds wins the match", "First player to win 3 rounds wins the match"}};
    }
}
