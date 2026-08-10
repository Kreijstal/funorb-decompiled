/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends bl {
    static db field_e;
    static String[] field_f;
    static boolean field_c;
    static db field_d;

    final static StringBuilder a(int param0, StringBuilder param1, byte param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              param1.setLength(param0);
              if (param2 == 22) {
                break L1;
              } else {
                field_d = (db) null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param0 <= var5) {
                stackIn_7_0 = (StringBuilder) (param1);
                break L0;
              } else {
                param1.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ob.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(int param0) {
        if (param0 < 112) {
          ob.b(119);
          field_e = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    static {
        field_c = false;
    }
}
