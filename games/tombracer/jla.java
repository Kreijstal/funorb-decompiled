/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jla extends rj {
    static vna field_z;
    static String field_B;

    jla(String param0, qc param1, boolean param2) {
        this(param0, param1);
        try {
            ((jla) this).field_w = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private jla(String param0, isa param1, qc param2) {
        super(param0, param1, param2);
        try {
            ((jla) this).field_r = afa.field_c.field_d;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_B = null;
        field_z = null;
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
        try {
            ((jla) this).field_r = afa.field_c.field_d;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Name is available";
    }
}
