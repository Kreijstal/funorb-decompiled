/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchEnvelope {
    int field_k;
    int field_l;
    static PcmStreamMixer field_j;
    int field_g;
    int field_d;
    byte[] field_i;
    int field_c;
    static int field_a;
    static java.awt.Canvas field_h;
    int field_b;
    byte[] field_e;
    int field_f;
    private static String field_z;

    public static void clearStaticReferences(boolean param0) {
        field_j = null;
        field_h = null;
        if (param0) {
          MusicPatchEnvelope.clearStaticReferences(true);
        }
    }

    static {
        field_z = "ch.A(";
        field_a = 0;
    }
}
