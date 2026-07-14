/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int field_c;
    int field_d;
    static ed field_b;
    static String field_g;
    static String field_a;
    static String field_f;
    static char[] field_e;

    final static void a(int param0) {
        ah.field_c = false;
        jg.field_d = false;
        cg.a((byte) -105, -1);
        if (param0 != -55) {
          field_b = null;
          cb.field_v = ql.field_l;
          ui.field_kb = ql.field_l;
          return;
        } else {
          cb.field_v = ql.field_l;
          ui.field_kb = ql.field_l;
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        int var1 = 90 % ((param0 - -20) / 57);
        field_f = null;
        field_g = null;
        field_b = null;
    }

    fh(int param0, int param1, int param2, int param3) {
        ((fh) this).field_c = param3;
        ((fh) this).field_d = param0;
    }

    final static pd a(byte param0, sf param1, int param2, int param3) {
        int var4 = -79 % ((25 - param0) / 61);
        return sg.a((byte) 20, ie.a(param1, param2, param3));
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ed();
        field_f = "<%0>Exit:<%1> This is your goal. Get your fleas here to complete the level.";
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
