/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    boolean field_q;
    static UiLayoutNode field_o;
    boolean field_n;
    static int field_r;
    volatile boolean pending;
    static String field_s;
    private static String field_z;

    abstract byte[] getBytes(int param0);

    public static void releaseStatics(byte param0) {
        field_s = null;
        field_o = null;
        if (param0 != 18) {
          ArchiveRequest.releaseStatics((byte) 127);
        }
    }

    abstract int progress(int param0);

    ArchiveRequest() {
        this.pending = true;
    }

    static {
        field_z = "vv.H(";
        field_s = "Suggest muting this player";
    }
}
