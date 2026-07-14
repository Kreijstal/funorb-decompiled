/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends dg {
    static String field_m;

    ao(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    ao(int param0) {
        super(param0);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((ao) this).field_h == null) {
          return;
        } else {
          var6 = ((ao) this).field_h.c(-53) / 2;
          var8 = -77 / ((param4 - -38) / 47);
          var7 = ((ao) this).field_h.a((byte) 55) / 2;
          oq.a(-var6 + param2, -var7 + param1, param3, 160, var6 + param2, 16777215, var7 + param1, true);
          return;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    public static void i(int param0) {
        if (param0 > -113) {
            ao.i(100);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Add <%0> to friend list";
    }
}
