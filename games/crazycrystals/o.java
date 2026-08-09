/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends l {
    private int field_e;
    static String field_h;
    static int field_f;
    private l field_g;

    final static void b(int param0) {
        rg.field_a[93] = 43;
        rg.field_a[192] = 28;
        if (param0 != -25281) {
          return;
        } else {
          rg.field_a[520] = 59;
          rg.field_a[222] = 58;
          rg.field_a[44] = 71;
          rg.field_a[46] = 72;
          rg.field_a[92] = 74;
          rg.field_a[47] = 73;
          rg.field_a[59] = 57;
          rg.field_a[45] = 26;
          rg.field_a[91] = 42;
          rg.field_a[61] = 27;
          return;
        }
    }

    final l a(int param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        this.field_e = this.field_e - 1;
        if (param0 != -2) {
          L0: {
            this.field_e = 15;
            if (0 != this.field_e) {
              stackIn_8_0 = this;
              break L0;
            } else {
              stackIn_8_0 = this.field_g;
              break L0;
            }
          }
          return (l) (this);
        } else {
          L1: {
            if (0 != this.field_e) {
              stackIn_4_0 = this;
              break L1;
            } else {
              stackIn_4_0 = this.field_g;
              break L1;
            }
          }
          return (l) (this);
        }
    }

    final l b(byte param0) {
        if (param0 != -90) {
            o.c(-31);
            return this.field_g;
        }
        return this.field_g;
    }

    public static void c(int param0) {
        if (param0 != 58) {
            return;
        }
        field_h = null;
    }

    o(int param0, l param1) {
        try {
            this.field_g = param1;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "o.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = null;
    }
}
