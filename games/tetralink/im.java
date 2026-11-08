/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static float field_e;
    static String field_b;
    static f field_c;
    static int[] field_d;
    static String field_a;

    final static fg getSoundMixer(int param0) {
        if (param0 != 28357) {
          im.releaseStatics((byte) 91);
          return u.field_g;
        }
        return u.field_g;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -105) {
          field_c = (f) null;
        }
    }

    static {
        field_b = "Private";
        field_a = "<%0> has been removed.";
    }
}
