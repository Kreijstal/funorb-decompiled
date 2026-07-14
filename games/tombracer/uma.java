/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma {
    static String field_a;
    static boolean field_c;
    static vna field_b;

    final static int a(int param0, kh param1, int param2) {
        if (param2 != -26803) {
          field_b = null;
          return (param1.b((byte) 44, param0) ^ 1 << -1 + param0) + -(1 << -1 + param0);
        } else {
          return (param1.b((byte) 44, param0) ^ 1 << -1 + param0) + -(1 << -1 + param0);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -1) {
          if (10 <= gda.field_c) {
            if (qga.field_m) {
              return false;
            } else {
              L0: {
                if (o.e(param0 + 540801)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Remove name";
    }
}
