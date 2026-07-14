/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jla extends rj {
    static vna field_z;
    static String field_B;

    jla(String param0, qc param1, boolean param2) {
        this(param0, param1);
        ((jla) this).field_w = param2 ? true : false;
    }

    private jla(String param0, isa param1, qc param2) {
        super(param0, param1, param2);
        ((jla) this).field_r = afa.field_c.field_d;
    }

    public static void b(int param0) {
        field_B = null;
        field_z = null;
        if (param0 != -23884) {
            field_B = null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((jla) this).field_w) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((jla) this).field_w = stackIn_3_1 != 0;
        if (param3 > -40) {
          field_B = null;
          super.b(param0, param1, param2, -71);
          return;
        } else {
          super.b(param0, param1, param2, -71);
          return;
        }
    }

    private jla(String param0, qc param1) {
        this(param0, afa.field_c.field_u, param1);
        ((jla) this).field_r = afa.field_c.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Name is available";
    }
}
