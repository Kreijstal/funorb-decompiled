/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String[] field_c;
    static String field_e;
    static ea field_a;
    static long field_d;

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static ea[] a(int param0, int param1, int param2, bj param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (cn.a(param0, 258, param2, param3)) {
            return kk.a(94);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ck.D(").append(param0).append(',').append(64).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static ea[] a(byte param0, int param1) {
        ea[] var3 = new ea[9];
        ea[] var2 = var3;
        var3[4] = hb.a(64, 32768, param1);
        return var2;
    }

    final static void a(int param0) {
        byte[] var1 = null;
        byte[] var2 = null;
        if (!kj.a(false)) {
          if (aa.field_j != null) {
            if (param0 != -30833) {
              field_e = null;
              int discarded$12 = -92;
              var2 = en.a();
              var1 = var2;
              int discarded$13 = 6;
              hf discarded$14 = le.a(0, var2);
              return;
            } else {
              int discarded$15 = -92;
              var2 = en.a();
              var1 = var2;
              int discarded$16 = 6;
              hf discarded$17 = le.a(0, var2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ranking: Maestro Miner";
        field_c = new String[]{"All scores", "My scores", "Best each"};
        field_e = "There's so much water in the Super Volcano you'll need much more air to swim through it. Grab this souped-up aqualung for an extra large supply of precious oxygen.";
    }
}
