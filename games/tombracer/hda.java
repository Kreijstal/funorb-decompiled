/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hda extends tc {
    static String field_h;

    final pl a(byte param0) {
        if (param0 != 113) {
            hda.b((byte) -6);
            return fq.field_c;
        }
        return fq.field_c;
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 > -127) {
            field_h = null;
        }
    }

    hda(long param0, String param1) {
        super(param0, param1);
    }

    final static sc a(int param0, int param1, cg param2) {
        if (param1 != 1303) {
          hda.b((byte) 32);
          return new sc(param2, param0 * kta.field_d / 1000);
        } else {
          return new sc(param2, param0 * kta.field_d / 1000);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "PRESS <img=8><img=9> TO DROP WHAT YOU'RE CARRYING";
    }
}
