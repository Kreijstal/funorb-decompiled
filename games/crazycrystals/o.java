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
    }

    final l a(int param0) {
        l stackIn_4_0 = null;
        l stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        l stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        l stackOut_2_0 = null;
        ((o) this).field_e = ((o) this).field_e - 1;
        if (param0 != -2) {
          L0: {
            ((o) this).field_e = 15;
            if (0 != ((o) this).field_e) {
              stackOut_7_0 = this;
              stackIn_8_0 = (l) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((o) this).field_g;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return this;
        } else {
          L1: {
            if (0 != ((o) this).field_e) {
              stackOut_3_0 = this;
              stackIn_4_0 = (l) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((o) this).field_g;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return this;
        }
    }

    final l b(byte param0) {
        if (param0 != -90) {
            o.c(-31);
            return ((o) this).field_g;
        }
        return ((o) this).field_g;
    }

    public static void c(int param0) {
        if (param0 != 58) {
            return;
        }
        field_h = null;
    }

    o(int param0, l param1) {
        try {
            ((o) this).field_g = param1;
            ((o) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "o.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
    }
}
