/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String[] field_c;
    static String field_e;
    static ea field_a;
    static long field_d;

    public static void a(byte param0) {
        ea[] discarded$0 = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -100) {
            bj var2 = (bj) null;
            discarded$0 = ck.a(-35, -80, 96, (bj) null);
        }
    }

    final static ea[] a(int param0, int param1, int param2, bj param3) {
        RuntimeException var4 = null;
        ea[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (cn.a(param0, 258, param2, param3)) {
              L1: {
                if (param1 == 64) {
                  break L1;
                } else {
                  field_b = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = kk.a(94);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ck.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static ea[] a(byte param0, int param1) {
        ea[] var2 = null;
        ea[] var3 = null;
        var3 = new ea[9];
        var2 = var3;
        var3[4] = hb.a(64, 32768, param1);
        if (param0 != 126) {
          field_d = -100L;
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0) {
        hf discarded$4 = null;
        hf discarded$5 = null;
        byte[] var1 = null;
        byte[] var2 = null;
        if (!kj.a(false)) {
          if (aa.field_j != null) {
            if (param0 != -30833) {
              field_e = (String) null;
              var2 = en.a((byte) -92);
              var1 = var2;
              discarded$4 = le.a(0, var2, 6);
              return;
            } else {
              var2 = en.a((byte) -92);
              var1 = var2;
              discarded$5 = le.a(0, var2, 6);
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
        field_b = "Ranking: Maestro Miner";
        field_c = new String[]{"All scores", "My scores", "Best each"};
        field_e = "There's so much water in the Super Volcano you'll need much more air to swim through it. Grab this souped-up aqualung for an extra large supply of precious oxygen.";
    }
}
