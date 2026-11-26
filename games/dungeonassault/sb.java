/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_b;
    static ResourceArchive field_a;

    public static void clearStaticReferences(byte param0) {
        if (param0 >= -73) {
          sb.clearStaticReferences((byte) -37);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 == 500) {
          MusicPatchPcmStream.field_t = null;
          uo.field_b = null;
          jn.field_k = null;
          jc.field_f = null;
          fe.field_g = null;
          ub.field_q = (byte[][]) null;
          return;
        }
        field_a = (ResourceArchive) null;
        MusicPatchPcmStream.field_t = null;
        uo.field_b = null;
        jn.field_k = null;
        jc.field_f = null;
        fe.field_g = null;
        ub.field_q = (byte[][]) null;
    }

    static {
        field_b = 500;
    }
}
