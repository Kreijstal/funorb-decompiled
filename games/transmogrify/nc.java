/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends ni {
    static qj field_q;
    static sj field_s;
    static int field_t;
    static int[] field_p;
    static String[] field_r;

    final String c(qg param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 53) {
              stackIn_4_0 = hk.a(0, param0.field_k.length(), '*');
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("nc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nc(int param0) {
        this(vd.field_h, param0);
    }

    public static void c(int param0) {
        field_s = null;
        field_p = null;
        field_q = null;
        if (param0 <= 93) {
            field_s = (sj) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    private nc(kg param0, int param1) {
        super(param0, param1);
    }

    static {
        field_q = null;
        field_t = -754974565;
        field_p = new int[4];
        field_r = new String[16];
    }
}
