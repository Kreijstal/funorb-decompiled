/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OneShotSound extends IntrusiveNode {
    int sampleId;
    int y;
    int startedAt;
    boolean positional;
    SoundPlayback playback;
    int x;
    static gl field_e;
    static lkb field_j;
    static QuickChatDynamicCommand field_g;
    static Widget field_l;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_j = null;
        field_e = null;
        field_g = null;
        field_l = null;
        if (!param0) {
          field_e = (gl) null;
        }
    }

    OneShotSound() {
    }

    static {
        field_z = "qw.A(";
        field_e = new gl(8);
        field_j = new lkb();
        field_g = new QuickChatDynamicCommand(13, 0, 1, 0);
    }
}
