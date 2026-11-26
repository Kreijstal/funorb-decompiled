/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static int[] field_s;
    boolean field_w;
    boolean field_v;
    static String field_q;
    static PlatformTaskDispatcher field_u;
    static boolean field_t;
    volatile boolean field_r;
    private static String field_z;

    abstract byte[] getData(byte param0);

    abstract int getProgressPercent(int param0);

    public static void releaseDeclaredStaticReferences(int param0) {
        field_q = null;
        field_s = null;
        field_u = null;
        if (param0 != 256) {
          ArchiveRequest.releaseDeclaredStaticReferences(41);
        }
    }

    ArchiveRequest() {
        this.field_r = true;
    }

    static {
        field_z = "nk.B(";
        field_q = "You have 1 unread message!";
        field_t = false;
        field_s = new int[256];
    }
}
