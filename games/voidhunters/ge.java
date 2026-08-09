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
            return this.field_d;
        }
        return this.field_d;
    }

    public static void a(byte param0) {
        int var1 = -87 / ((param0 - 62) / 54);
        field_b = null;
    }

    final String b(int param0) {
        if (param0 != 4) {
            this.b(-61);
            return this.field_a;
        }
        return this.field_a;
    }

    final boolean a(int param0) {
        if (param0 != 4) {
            return false;
        }
        return this.field_e;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 7861) {
          L0: {
            ge.a((byte) -96);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ge) (this)).field_d = stackIn_8_1 != 0;
          this.field_e = true;
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((ge) (this)).field_d = stackIn_4_1 != 0;
          this.field_e = true;
          return;
        }
    }

    ge(String param0) {
        this.field_e = false;
        this.field_d = false;
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 4;
        field_b = "Press the <%0>,<%1>,<%2> and <%3> keys to move";
    }
}
