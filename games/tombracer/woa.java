/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class woa extends od {
    byte[] field_k;
    static String field_l;

    final static void a(int param0, cga param1, boolean param2) {
        if (param2) {
          woa.a(-60);
          aba.field_a.b((byte) -86, (vg) (Object) param1);
          wj.a(param1, param0, -118);
          return;
        } else {
          aba.field_a.b((byte) -86, (vg) (Object) param1);
          wj.a(param1, param0, -118);
          return;
        }
    }

    final static void a(int param0, cn param1, cn param2, int param3) {
        jma.field_j = param1;
        if (param0 > -52) {
            return;
        }
        dk.field_c = param2;
    }

    woa(byte[] param0) {
        ((woa) this).field_k = param0;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != -20476) {
            field_l = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Email address is unavailable";
    }
}
