/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static String[] field_a;
    static int[] field_b;

    final static byte[] a() {
        ld var1 = new ld(10);
        var1.c(2, 25564);
        aa.field_j.b(27437, var1);
        return var1.field_u;
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (kb.field_b != null) {
                kb.field_b.field_U.a((byte) -123, args);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 18423) {
                break L2;
              } else {
                var3 = null;
                en.a((String[]) null, 63);
                break L2;
              }
            }
            if (bh.field_Z != null) {
              bh.field_Z.field_K.a((byte) 118, args);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("en.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (args == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Iron mined: <%0>/25", "Silver mined: <%0>/25", "Gold mined: <%0>/25", "Effluvium mined: <%0>/25", "Diamonds mined: <%0>/10", "Equipment collected: <%0>", null, "Underwater gems collected: <%0>/25", "Gems mined from rocks: <%0>/25", "Diamonds mined: <%0>/10", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Freezium mined: <%0>/25", "Points in oil: <%0>", null, "Walrus-free points: <%0>", null, null, "Snow blocks mined: <%0>", "Current score: <%0>", "Oil burnt: <%0>%", "Tutorial tips seen: <%0>/<%1>", "Ice blocks created: <%0>", null, null, "Seconds into game: <%0>", null, "Longest Explosion: <%0> sec."};
        field_b = new int[4];
    }
}
