/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends kc {
    static String field_Db;
    String field_Cb;
    String field_Lb;
    kc field_Fb;
    kc field_Jb;
    int field_Bb;
    static boolean field_Nb;
    static String field_Hb;
    static boolean field_Kb;
    static kc field_Pb;
    String field_Gb;
    kc field_Mb;
    static String field_Eb;
    String field_Ib;
    static boolean field_Ob;

    public static void f(byte param0) {
        field_Db = null;
        field_Eb = null;
        field_Pb = null;
        field_Hb = null;
    }

    wa() {
        super(0L, (kc) null);
    }

    final static int a(char param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  if (param0 != param1.charAt(var5)) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wa.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -16 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "You need to play <%0> more rated games to unlock this option.";
        field_Eb = "Connection lost. <%0>";
        field_Hb = "Show game chat from my friends";
    }
}
