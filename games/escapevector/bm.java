/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_g;
    static hh field_a;
    static String field_d;
    static String field_f;
    static int field_c;
    static String field_e;
    static nn field_b;

    final static void a(int param0) {
        cg.d(param0 ^ 36);
        lj.a(param0, 30);
    }

    final static lm a(String param0, int param1, int param2) {
        lm var3 = null;
        var3 = new lm(false);
        var3.field_g = param1;
        if (param2 != 4) {
          field_g = null;
          var3.field_f = param0;
          return var3;
        } else {
          var3.field_f = param0;
          return var3;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 110) {
          bm.a(95);
          field_b = null;
          field_f = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void b(byte param0) {
        if (param0 != 62) {
            bm.a((byte) -121);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = "Waiting for music";
        field_d = "Continue";
        field_e = "virtual_layer3_tile.jpg";
    }
}
