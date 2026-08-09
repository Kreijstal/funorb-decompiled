/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static hl[] field_d;
    static String field_a;
    static String field_c;
    static volatile boolean field_b;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        int var1 = -15 % ((7 - param0) / 62);
    }

    final static boolean a(d param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            L1: while (true) {
              if (-4001 >= (fi.field_d ^ -1)) {
                L2: {
                  if (param1 == -4001) {
                    break L2;
                  } else {
                    field_c = (String) null;
                    break L2;
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (null != qc.field_c[fi.field_d]) {
                  fi.field_d = fi.field_d + 1;
                  continue L1;
                } else {
                  qc.field_c[fi.field_d] = param0;
                  fi.field_d = fi.field_d + 1;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("v.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_a = "Email: ";
        field_c = "Names cannot start or end with space or underscore";
        field_b = true;
    }
}
