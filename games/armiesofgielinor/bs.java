/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs {
    static je field_a;
    static int[] field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = 0 % ((-32 - param0) / 48);
        return fc.field_b;
    }

    final static int a(vh param0, int param1) {
        int var2 = 0;
        var2 = param0.field_o[param1 + param0.field_q];
        if (param0.field_o[param0.field_q] == we.field_a[0]) {
          if (param0.field_o[param0.field_q + 1] == we.field_a[1]) {
            if (we.field_a[2] != param0.field_o[param0.field_q + 2]) {
              var2 = -1;
              return var2;
            } else {
              int discarded$2 = param0.i(1);
              return var2;
            }
          } else {
            var2 = -1;
            return var2;
          }
        } else {
          var2 = -1;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Buying or selling an account";
        field_b = new int[]{2, 4, 6, 8};
    }
}
