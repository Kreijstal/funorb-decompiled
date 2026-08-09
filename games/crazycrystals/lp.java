/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static byte[][][] field_a;
    static ko field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = (byte[][][]) null;
        if (param0 != 0) {
            CharSequence var2 = (CharSequence) null;
            lp.a((CharSequence) null, (byte) 7, 'D');
        }
        field_c = null;
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = param0.length();
              if (param1 < -13) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4) {
                stackIn_9_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param0.charAt(var5) != param2) {
                    break L3;
                  } else {
                    var3_int++;
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("lp.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_c = "Aha, some rocks to kill the spider with!";
    }
}
