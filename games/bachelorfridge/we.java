/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static long field_b;
    static String field_a;

    final static lba[] a(byte param0, ht param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        lba[] var4 = null;
        int var5 = 0;
        lba var6 = null;
        int var7 = 0;
        eh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        lba[] stackIn_4_0 = null;
        lba[] stackIn_10_0 = null;
        lba[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        lba[] stackOut_3_0 = null;
        lba[] stackOut_14_0 = null;
        lba[] stackOut_9_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (!param1.b(34)) {
              stackOut_3_0 = new lba[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param1.c(-1);
              L1: while (true) {
                if (0 != var8.field_f) {
                  if (2 != var8.field_f) {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new lba[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_14_0 = (lba[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new lba();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << 2];
                        var6.field_e = var3[1 + (var5 << 2)];
                        var6.field_a = var3[(var5 << 2) + 2];
                        var6.field_b = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_9_0 = new lba[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  gda.a(false, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("we.A(").append(-57).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Falling into a pit means instant death for the creature! Take great care not to slip and fall, or be pushed!";
    }
}
