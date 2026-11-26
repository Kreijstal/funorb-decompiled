/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    volatile boolean field_n;
    boolean field_m;
    boolean field_o;

    abstract byte[] getData(byte param0);

    abstract int getProgressPercent(byte param0);

    ArchiveRequest() {
        this.field_n = true;
    }
}
