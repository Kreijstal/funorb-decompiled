/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    private boolean field_e;
    static String field_b;
    private boolean field_d;
    static int field_c;
    private String field_a;

    final boolean b(byte param0) {
        if (param0 != -20) {
            ge.a((byte) 88);
            return ((ge) this).field_d;
        }
        return ((ge) this).field_d;
    }

    public static void a(byte param0) {
        int var1 = -87 / ((param0 - 62) / 54);
        field_b = null;
    }

    final String b(int param0) {
        if (param0 != 4) {
            String discarded$0 = ((ge) this).b(-61);
            return ((ge) this).field_a;
        }
        return ((ge) this).field_a;
    }

    final boolean a(int param0) {
        if (param0 != 4) {
            return false;
        }
        return ((ge) this).field_e;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 7861) {
          L0: {
            ge.a((byte) -96);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ge) this).field_d = stackIn_8_1 != 0;
          ((ge) this).field_e = true;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ge) this).field_d = stackIn_4_1 != 0;
          ((ge) this).field_e = true;
          return;
        }
    }

    ge(String param0) {
        ((ge) this).field_e = false;
        ((ge) this).field_d = false;
        try {
            ((ge) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ge.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 4;
        field_b = "Press the <%0>,<%1>,<%2> and <%3> keys to move";
    }
}
