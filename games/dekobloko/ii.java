/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends wm {
    static String field_p;
    static ji field_t;
    static String field_s;
    static String field_r;
    static boolean field_q;

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        if (param0 != 9369) {
          ii.e(6);
          field_t = null;
          field_s = null;
          return;
        } else {
          field_t = null;
          field_s = null;
          return;
        }
    }

    final String a(String param0, byte param1) {
        if (param1 != -11) {
            Object var4 = null;
            tb discarded$6 = ((ii) this).b((String) null, (byte) -35);
            if (!(((ii) this).b(param0, (byte) -40) != vm.field_u)) {
                return ng.field_e;
            }
            return li.field_a;
        }
        if (!(((ii) this).b(param0, (byte) -40) != vm.field_u)) {
            return ng.field_e;
        }
        return li.field_a;
    }

    final tb b(String param0, byte param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != client.a(param0, -12828)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 == 0) {
          return vm.field_u;
        } else {
          if (param1 != -40) {
            return null;
          } else {
            return dc.field_b;
          }
        }
    }

    ii(rk param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Eliminate Score: ";
        field_s = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_r = "<%0> is not on your ignore list.";
    }
}
