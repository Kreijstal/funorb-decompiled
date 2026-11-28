/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static am field_t;
    volatile boolean field_m;
    static IntrusiveDeque field_r;
    boolean field_o;
    private static tf field_u;
    boolean field_p;
    static AccountRequestState field_v;
    static Sprite[] field_l;
    static Sprite field_s;
    static int unlockedAchievementMask;
    static BitmapFont field_q;

    final static String a(byte param0, int param1) {
        int var2 = -95 % ((param0 - 72) / 37);
        return param1 + "/" + db.field_b.length;
    }

    final static tf[] d(int param0) {
        if (param0 == -26481) {
          return new tf[]{WordLanguage.field_m, og.field_d, PacketBuffer.field_l, field_u, PcmOutputWorker.field_e, gk.field_b, rf.field_db, gk.field_d, gh.field_g, CrossfadingMidiPcmStream.field_m, u.field_c, kb.field_q, ik.field_cb, TextHotspotBounds.field_g};
        }
        return (tf[]) null;
    }

    public static void clearStaticReferences(boolean param0) {
        field_s = null;
        field_t = null;
        field_l = null;
        field_u = null;
        field_v = null;
        field_q = null;
        if (param0) {
          field_r = null;
          return;
        }
        field_t = (am) null;
        field_r = null;
    }

    abstract int getProgressPercent(int param0);

    abstract byte[] getData(int param0);

    ArchiveRequest() {
        this.field_m = true;
    }

    static {
        field_t = null;
        field_r = new IntrusiveDeque();
        field_u = new tf(4, 1, 1, 1);
    }
}
