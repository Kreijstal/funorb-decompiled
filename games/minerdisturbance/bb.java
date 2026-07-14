/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_b;
    static ta field_a;

    final static void a(String param0, int param1, we param2, int param3, int param4) {
        int var5 = param2.a(param0);
        int var6 = param2.field_N + param2.field_E;
        int var7 = im.field_c;
        if (!(var5 + (var7 - param4) <= eh.field_g)) {
            var7 = -6 + (eh.field_g - var5);
        }
        int var8 = -param2.field_N + qd.field_P + 32;
        if (6 + (var8 - -var6) > eh.field_c) {
            var8 = -var6 + (eh.field_c - 6);
        }
        eh.a(var7, var8, 6 + var5, var6 + 6, param1);
        eh.e(var7 - -1, 1 + var8, var5 + 4, var6 - -4, param3);
        param2.a(param0, 3 + var7, var8 + 3 + param2.field_N, param1, -1);
    }

    public static void a(int param0) {
        if (param0 != -4) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static ea a(String param0, bj param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(-43, param3);
        var5 = param1.a(param0, var4, -81);
        if (param2 > -92) {
          field_a = null;
          return bl.a(var5, param1, (byte) -79, var4);
        } else {
          return bl.a(var5, param1, (byte) -79, var4);
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        vl.h(param0 ^ -19932);
        mb.field_b.n(21974);
        if (param0 != 19931) {
          field_a = null;
          di.field_D = new cl(pl.field_a, (String) null, gd.field_B, param1, param3);
          de.field_a = new rh(mb.field_b, (fe) (Object) di.field_D);
          mb.field_b.b(1, (fe) (Object) de.field_a);
          return;
        } else {
          di.field_D = new cl(pl.field_a, (String) null, gd.field_B, param1, param3);
          de.field_a = new rh(mb.field_b, (fe) (Object) di.field_D);
          mb.field_b.b(1, (fe) (Object) de.field_a);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "to return to the normal view.";
        field_a = new ta();
    }
}
