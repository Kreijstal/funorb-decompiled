/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    String field_a;
    static int field_i;
    static Sprite field_g;
    static boolean field_f;
    int field_c;
    static int field_e;
    String field_h;
    Archive field_d;
    String field_b;

    public static void resetStaticState(int param0) {
        field_g = null;
        if (param0 != 0) {
          field_e = -90;
        }
    }

    final static PcmStreamMixer a(int param0) {
        if (param0 != 0) {
          return (PcmStreamMixer) null;
        }
        return ti.field_f;
    }

    private rh() throws Throwable {
        throw new Error();
    }

    static {
        field_i = 0;
        field_e = 0;
    }
}
