/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends fn {
    static String field_c;
    private String field_d;
    static int field_g;
    static int field_e;
    private String field_f;

    final void a(rb param0, boolean param1) {
        rb stackIn_2_0 = null;
        rb stackIn_3_0 = null;
        rb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        rb stackIn_6_0 = null;
        rb stackIn_7_0 = null;
        rb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rb stackOut_5_0 = null;
        rb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        rb stackOut_1_0 = null;
        rb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        rb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param1) {
          L0: {
            eo discarded$10 = ((ki) this).a(87);
            stackOut_5_0 = (rb) param0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param1) {
              stackOut_7_0 = (rb) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (rb) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((rb) (Object) stackIn_8_0).a(stackIn_8_1 != 0, ((ki) this).field_d);
          param0.b(0, ((ki) this).field_f);
          return;
        } else {
          L1: {
            stackOut_1_0 = (rb) param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param1) {
              stackOut_3_0 = (rb) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (rb) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((rb) (Object) stackIn_4_0).a(stackIn_4_1 != 0, ((ki) this).field_d);
          param0.b(0, ((ki) this).field_f);
          return;
        }
    }

    final eo a(int param0) {
        if (param0 > -51) {
            return (eo) null;
        }
        return jd.field_a;
    }

    public static void b(int param0) {
        if (param0 != 64) {
            ki.b(-115);
            field_c = null;
            return;
        }
        field_c = null;
    }

    ki(String param0, String param1) {
        ((ki) this).field_d = param0;
        ((ki) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "classic";
        field_g = 64;
        field_e = 0;
    }
}
