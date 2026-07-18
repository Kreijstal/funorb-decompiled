/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ea field_a;
    static String[][] field_b;
    static ea field_c;
    static String field_d;

    final static void a(byte param0) {
        int var1 = 0;
        if (ee.field_J >= 224) {
            fc.a(256, (byte) 72);
        } else {
            var1 = ee.field_J % 32;
            fc.a(-var1 + (ee.field_J - -32), (byte) 52);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 != 1) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = var3_int * param0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                L2: {
                  if (0 != (param1 & 1)) {
                    var3_int = var3_int * param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ol.D(" + param0 + ',' + param1 + ',' + 55 + ')');
        }
        return stackIn_11_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param0) {
            return 0;
        }
        if (0 < param0) {
            var2 = 1;
            if (param0 > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(param0 <= 1)) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (!(param0 >= -65536)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (-16 > param0) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Grandma's Finest Dwarven Woolly Jumper. You'll make her very proud wearing this; what's more, it will keep you safe from the cold.";
        field_b = new String[][]{new String[5], new String[4], new String[7], new String[1], new String[3], new String[5], new String[1]};
    }
}
