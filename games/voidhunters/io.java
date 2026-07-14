/*
 * Decompiled by CFR-JS 0.4.0.
 */
class io extends bob {
    static int field_p;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        if (param4) {
          npa.a(param1.field_r + param3, (byte) 115, param1.field_f, param1.field_h, param1.field_g + param2);
          super.a(59, param1, param2, param3, param4);
          var6 = -48 / ((param0 - -27) / 35);
          return;
        } else {
          super.a(59, param1, param2, param3, param4);
          var6 = -48 / ((param0 - -27) / 35);
          return;
        }
    }

    io(no param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_k, -1, 2147483647, false);
    }

    io(int param0) {
        this(loa.field_o, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 7;
    }
}
