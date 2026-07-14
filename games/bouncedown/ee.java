/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static boolean field_c;
    static int field_b;
    static int field_a;

    final static boolean a(gk param0, byte param1) {
        int var2 = -79 / ((param1 - 43) / 53);
        return param0.a((byte) -93);
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param1 = il.a(param1, '_', param0 ^ 123, "");
        if (param0 == -1) {
          var3 = bc.a(param2, 41);
          if ((param1.indexOf(param2) ^ -1) == 0) {
            if (param1.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 65;
    }
}
