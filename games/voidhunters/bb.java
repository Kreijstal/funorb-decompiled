/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends rqa {
    static String field_o;

    final static void a(ds param0, boolean param1) {
        int var2 = 0;
        if (!param1) {
          return;
        } else {
          wl.field_q = param0.e(1869) << 1447412645;
          var2 = param0.e((byte) -107);
          wl.field_q = wl.field_q + (var2 >> -12858717);
          vga.field_d = (7 & var2) << 1975267250;
          vga.field_d = vga.field_d + (param0.e(1869) << -858260190);
          var2 = param0.e((byte) -118);
          jv.field_b = var2 << -1626902833 & 2064384;
          vga.field_d = vga.field_d + (var2 >> -1968483482);
          jv.field_b = jv.field_b + (param0.e((byte) -98) << 539326055);
          var2 = param0.e((byte) -126);
          jv.field_b = jv.field_b + (var2 >> 776536865);
          qfb.field_o = 65536 & var2 << 1783948272;
          qfb.field_o = qfb.field_o + param0.e(1869);
          return;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 105) {
            field_o = null;
        }
    }

    bb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          bb.e((byte) -83);
          return new nc((Object) (Object) frb.a(209, 82));
        } else {
          return new nc((Object) (Object) frb.a(209, 82));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Make copy of clicked object";
    }
}
