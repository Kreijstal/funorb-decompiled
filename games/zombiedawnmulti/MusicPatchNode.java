/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    int field_g;
    static si field_h;
    int field_l;
    static boolean field_k;
    int field_f;
    int field_n;
    int field_i;
    int field_m;
    static int field_j;
    static int field_o;

    private MusicPatchNode() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_h = null;
    }

    static {
        field_o = 0;
    }
}
