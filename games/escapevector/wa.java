/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static om field_d;
    static IntrusiveDeque field_c;
    static Sprite field_b;
    static Sprite field_e;
    static String field_a;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (Sprite) null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        if (null == ni.field_N) {
          return;
        }
        if (!(kn.field_b <= param0)) {
          kn.field_b = param0;
          ni.field_N.d(kc.field_b * kn.field_b / 64);
        }
        if (param1 == 32471) {
          return;
        }
        wa.a(false);
    }

    static {
        field_d = new om(15, 0, 1, 0);
        field_a = "Email address is unavailable";
    }
}
