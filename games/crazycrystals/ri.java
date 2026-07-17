/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int field_a;

    final static al[] a(un param0, byte param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        al[] var4 = null;
        int var5 = 0;
        al var6 = null;
        int var7 = 0;
        Object var8 = null;
        gb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        al[] stackIn_3_0 = null;
        al[] stackIn_10_0 = null;
        al[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        al[] stackOut_9_0 = null;
        al[] stackOut_16_0 = null;
        al[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param0.b(5)) {
              var9 = param0.a((byte) -116);
              L1: while (true) {
                if (var9.field_a != 0) {
                  if (var9.field_a == 2) {
                    stackOut_9_0 = new al[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    L2: {
                      var13 = (int[]) var9.field_b;
                      var12 = var13;
                      var11 = var12;
                      var10 = var11;
                      var3 = var10;
                      var4 = new al[var13.length >> 2];
                      if (param1 > 13) {
                        break L2;
                      } else {
                        var8 = null;
                        al[] discarded$1 = ri.a((un) null, (byte) -59);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (al[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new al();
                        var4[var5] = var6;
                        var6.field_i = var3[var5 << 2];
                        var6.field_g = var3[(var5 << 2) - -1];
                        var6.field_b = var3[2 + (var5 << 2)];
                        var6.field_e = var3[3 + (var5 << 2)];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  fh.a(true, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new al[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ri.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    static {
    }
}
