/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg {
    static dl[] field_b;
    static String field_h;
    static ko field_d;
    static int field_e;
    static db field_c;
    static int field_a;
    static db field_g;
    static String field_f;

    abstract void a(ng param0, byte param1);

    abstract wh a(int param0);

    public static void b(int param0) {
        field_d = null;
        field_g = null;
        field_b = null;
        field_h = null;
        field_c = null;
        field_f = null;
    }

    final static void a(int param0, db param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (le.field_g != null) {
                break L1;
              } else {
                le.field_g = new dl[4][];
                cd.field_v = new int[10];
                cd.field_v[2] = 8;
                cd.field_v[7] = 12;
                cd.field_v[6] = 8;
                cd.field_v[1] = 4;
                cd.field_v[5] = 4;
                cd.field_v[9] = 12;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= 4) {
                break L0;
              } else {
                L3: {
                  if (null != le.field_g[var2_int]) {
                    var2_int++;
                    var2_int++;
                    break L3;
                  } else {
                    le.field_g[var2_int] = bf.a(-1, oe.field_d[var2_int], "", param1);
                    var2_int++;
                    break L3;
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("mg.B(").append(-104).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Hole";
        field_e = 100;
        field_f = "Please check if address is correct";
    }
}
