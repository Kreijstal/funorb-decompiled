/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends aa {
    static ce field_x;
    static int field_w;
    static int field_u;
    static String field_v;
    static int[] field_y;

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          mh.b(124);
          fb.field_c = param0;
          cm.field_j = param3;
          rg.field_n = param2;
          return;
        } else {
          fb.field_c = param0;
          cm.field_j = param3;
          rg.field_n = param2;
          return;
        }
    }

    mh(int param0) {
        this(ug.field_e, param0);
    }

    private mh(fa param0, int param1) {
        super(param0, param1);
    }

    final String c(int param0, qa param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 21) {
              stackOut_3_0 = ni.a(param1.field_i.length(), '*', (byte) 78);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mh.DA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        field_v = null;
        field_x = null;
        if (param0 != 705) {
            field_w = 44;
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 1;
        field_v = "Tiles in the level (2/3)";
    }
}
