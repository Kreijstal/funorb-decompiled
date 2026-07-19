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
        lba[] stackIn_4_0 = null;
        lba[] stackIn_10_0 = null;
        lba[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lba[] stackOut_3_0 = null;
        lba[] stackOut_15_0 = null;
        lba[] stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (!param1.b(34)) {
              stackOut_3_0 = new lba[]{};
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param1.c(-1);
              L1: while (true) {
                if (0 != var8.field_f) {
                  if (2 != var8.field_f) {
                    L2: {
                      var10 = (int[]) (var8.field_e);
                      var9 = var10;
                      var3 = var9;
                      var4 = new lba[var10.length >> -267186558];
                      var5 = 0;
                      if (param0 < -31) {
                        break L2;
                      } else {
                        field_a = (String) null;
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_15_0 = (lba[]) (var4);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new lba();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << -2052271870];
                        var6.field_e = var3[1 + (var5 << -168984574)];
                        var6.field_a = var3[(var5 << 1996623970) + 2];
                        var6.field_b = var3[3 + (var5 << 1348161058)];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_9_0 = new lba[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("we.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < -122) {
            return;
        }
        field_a = (String) null;
    }

    static {
        field_a = "Falling into a pit means instant death for the creature! Take great care not to slip and fall, or be pushed!";
    }
}
