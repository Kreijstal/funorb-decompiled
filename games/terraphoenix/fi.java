/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends di {
    static int field_q;
    static String field_n;
    static rh field_p;
    static ue field_m;
    static String field_o;

    fi(ej param0) {
        super(param0);
    }

    final im b(String param0, int param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != bi.a(-29456, param0)) {
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
        if (param1 == 0) {
          if (var3 == 0) {
            return qf.field_d;
          } else {
            return dg.field_c;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        if (!param0) {
            return;
        }
        field_m = null;
        field_n = null;
        field_o = null;
    }

    final String a(String param0, int param1) {
        if (!(((fi) this).b(param0, 0) != qf.field_d)) {
            return pb.field_c;
        }
        int var3 = -41 % ((26 - param1) / 56);
        return vd.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Equip ";
        field_p = new rh(11, 0, 1, 2);
    }
}
